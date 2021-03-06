package com.arm.mbed.cloud.sdk.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import com.arm.mbed.cloud.sdk.internal.mbedcloudcommon.ApiClient;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.mockwebserver.MockResponse;
import com.squareup.okhttp.mockwebserver.MockWebServer;
import com.squareup.okhttp.mockwebserver.RecordedRequest;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import retrofit2.Call;
import retrofit2.http.GET;

public class TestApiClientWrapper {

    private static final String AN_ENDPOINT_PATH = "an/endpoint/";

    /**
     * Tests that the HTTP client wrapper works as expected by spawning a mock server and checking received requests.
     */
    @Test
    public void testClient() {
        try {
            MockWebServer server = new MockWebServer();
            server.enqueue(new MockResponse().setBody("hello, world!"));
            server.start();
            HttpUrl baseUrl = server.url("");
            ConnectionOptions opt = new ConnectionOptions("apikey");
            opt.setHost(baseUrl.toString());
            ApiClientWrapper clientWrapper = new ApiClientWrapper(opt);
            assertTrue(clientWrapper.ping(TimePeriod.newTimePeriod("10s")));
            TestApiService testService = clientWrapper.createService(TestApiService.class);
            assertTrue(testService.getEndpointValue().execute().isSuccessful());
            RecordedRequest request = server.takeRequest();
            assertEquals("/" + AN_ENDPOINT_PATH, request.getPath());
            assertNotNull(request.getHeader("Authorization"));
            assertTrue(request.getHeader("Authorization").contains("Bearer"));
            assertNotNull(request.getHeader("User-Agent"));
            assertTrue(request.getHeader("User-Agent").contains(ApiClientWrapper.UserAgent.MBED_CLOUD_SDK_IDENTIFIER));
            server.shutdown();
            clientWrapper.close();
        } catch (IOException | InterruptedException e) {
            fail(e.getMessage());
        }
    }

    public interface TestApiService {

        @GET(AN_ENDPOINT_PATH)
        Call<String> getEndpointValue();

    }

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(ApiClientWrapper.class)
                      .withPrefabValues(ApiClient.class, new ApiClient(),
                                        new ApiClient().setCredentials("user name", "password"))
                      .suppress(Warning.STRICT_INHERITANCE).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED).verify();
    }

    @Test
    public void testClone() {
        try {
            MockWebServer server = new MockWebServer();
            server.enqueue(new MockResponse().setBody("hello, world!"));
            server.start();
            HttpUrl baseUrl = server.url("");
            ConnectionOptions opt = new ConnectionOptions("apikey");
            opt.setHost(baseUrl.toString());
            ApiClientWrapper clientWrapper = new ApiClientWrapper(opt);
            ApiClientWrapper clientWrapperClone = clientWrapper.clone();
            assertNotSame(clientWrapper, clientWrapperClone);
            assertEquals(clientWrapper, clientWrapperClone);
            TestApiService testService = clientWrapperClone.createService(TestApiService.class);
            assertTrue(testService.getEndpointValue().execute().isSuccessful());
            RecordedRequest request = server.takeRequest();
            assertEquals("/" + AN_ENDPOINT_PATH, request.getPath());
            assertNotNull(request.getHeader("Authorization"));
            assertTrue(request.getHeader("Authorization").contains("Bearer"));
            assertNotNull(request.getHeader("User-Agent"));
            assertTrue(request.getHeader("User-Agent").contains(ApiClientWrapper.UserAgent.MBED_CLOUD_SDK_IDENTIFIER));
            server.shutdown();
            clientWrapper.close();
            clientWrapperClone.close();
        } catch (IOException | InterruptedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testFailingWebsocket() {
        String randomAddress = "http://random.host.test";
        SdkLogger logger = SdkLogger.getLogger();
        try (ApiClientWrapper clientWrapper = new ApiClientWrapper(ConnectionOptions.newConfiguration("test",
                                                                                                      randomAddress));
             WebsocketClient ws = clientWrapper.getNewWebsocketClient("some_test",
                                                                      new NotificationListener(logger, null, null, null,
                                                                                               new Callback<Throwable>() {

                                                                                                   @Override
                                                                                                   public void
                                                                                                          execute(Throwable exception) {
                                                                                                       exception.printStackTrace();
                                                                                                   }
                                                                                               }),
                                                                      logger)) {
            assertFalse(ws.isRunning());
            ws.requestClose(false);
            ws.requestClose(true);
            ws.start();
            assertFalse(ws.isRunning());
            try {
                ws.sendMessage("A random message");
                fail("An exception should have been raised");
            } catch (@SuppressWarnings("unused") Exception e) {
                // Nothing to do
            }
        } catch (MbedCloudException exception) {
            exception.printStackTrace();
            fail(exception.getMessage());
        }

    }

    @Test
    public void testWorkingWebsocket() {
        String echoWsUrl = "http://echo.websocket.org";
        SdkLogger logger = SdkLogger.getLogger();

        try (ApiClientWrapper clientWrapper = new ApiClientWrapper(ConnectionOptions.newConfiguration("test",
                                                                                                      echoWsUrl));
             WebsocketClient ws = clientWrapper.getNewWebsocketClient("",
                                                                      new NotificationListener(logger, null, null, null,
                                                                                               new Callback<Throwable>() {

                                                                                                   @Override
                                                                                                   public void
                                                                                                          execute(Throwable exception) {
                                                                                                       exception.printStackTrace();
                                                                                                   }
                                                                                               }),
                                                                      logger)) {
            assertFalse(ws.isRunning());
            ws.requestClose(false);
            ws.requestClose(true);
            ws.start();
            assertTrue(ws.isRunning());
            ws.sendMessage("Some message");
            ws.sendMessage("Some other message");
            Thread.sleep(2000);
            ws.requestClose(false);
            assertFalse(ws.isRunning());
            ws.start();
            ws.start();
            assertTrue(ws.isRunning());
            ws.requestClose(true);
            assertFalse(ws.isRunning());
            try {
                ws.sendMessage("A random message");
                fail("An exception should have been raised");
            } catch (@SuppressWarnings("unused") Exception e) {
                // Nothing to do
            }
            ws.start();
        } catch (MbedCloudException | InterruptedException exception) {
            exception.printStackTrace();
            fail(exception.getMessage());
        }

    }
}
