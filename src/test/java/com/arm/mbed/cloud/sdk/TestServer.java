package com.arm.mbed.cloud.sdk;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiUtils;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.testutils.APICallException;
import com.arm.mbed.cloud.sdk.testutils.APICaller;
import com.arm.mbed.cloud.sdk.testutils.APIMappingGenerator;
import com.arm.mbed.cloud.sdk.testutils.SDK;
import com.arm.mbed.cloud.sdk.testutils.Serializer;
import com.arm.mbed.cloud.sdk.testutils.UnknownAPIException;

import io.netty.handler.codec.http.QueryStringDecoder;
import io.vertx.core.MultiMap;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

@Preamble(description = "Test system server part in charge of carrying out a mapping of the APIs present in the SDK and invoking them when requested by the client")
public class TestServer {

	private static final String TEST_ARGS_KEY = "args";
	private static final String CONTENT_TYPE_HEADER = "content-type";
	private static final String APPLICATION_JSON = "application/json";
	private static final String ENVVAR_MBED_CLOUD_HOST = "MBED_CLOUD_HOST";
	private static final String ENVVAR_MBED_CLOUD_API_KEY = "MBED_CLOUD_API_KEY";
	private static final String PARAM_METHOD = "method";
	private static final String PARAM_MODULE = "module";
	private static final boolean CONSOLE_COLOURING = (System.getenv("CONSOLE_COLOURING") == null) ? false : true;
	private static final String LOGGER_DELEGATE_FACTORY_CLASS_NAME_PROPERTY = "vertx.logger-delegate-factory-class-name";
	private static final String LOGGER_DELEGATE_FACTORY_CLASS_NAME = "io.vertx.core.logging.SLF4JLogDelegateFactory";
	static {
		System.setProperty(LOGGER_DELEGATE_FACTORY_CLASS_NAME_PROPERTY, LOGGER_DELEGATE_FACTORY_CLASS_NAME);
	}
	private final int port = 5000;
	private HttpServer server;
	private Router router;
	private final Logger testLogger = LoggerFactory.getLogger("Java SDK Test server");
	private static final String TEST_SERVER_LOG_PREFIX = "  testserver ";
	private static final String INFO_LOG_PREFIX = "\u001B[34m" + TEST_SERVER_LOG_PREFIX + "\u001B[0m";
	private static final String WARNING_LOG_PREFIX = "\u001B[33m" + TEST_SERVER_LOG_PREFIX + "\u001B[0m";
	private volatile SDK sdk;
	private ConnectionOptions config;

	public void start() {
		sdk = null;
		config = null;
		if (server == null) {
			Vertx vertx = Vertx.vertx(new VertxOptions().setWorkerPoolSize(40));
			server = vertx.createHttpServer();
			router = Router.router(vertx);
		}
		retrieveConfig();
		if (config == null || config.isApiKeyEmpty()) {
			logInfo("Unable to find " + String.valueOf(ENVVAR_MBED_CLOUD_API_KEY) + " environment variable");
			return;
		}
		defineInitialisationRoute();
		defineModuleMethodTestRoute();
		logInfo("Starting Java SDK test server on port " + String.valueOf(port) + "...");
		server.requestHandler(router::accept).listen(port);
	}

	private void defineInitialisationRoute() {
		Route route = router.route(HttpMethod.GET, "/_init").produces(APPLICATION_JSON);
		route.blockingHandler(routingContext -> {

			logInfo("Initialising Java SDK modules... (" + new Date().toString() + ")");
			sdk = APIMappingGenerator.getSDK();
			// logInfo(JsonObject.mapFrom(sdk).encodePrettily());
			JsonObject emptyResponse = new JsonObject();
			setResponse(routingContext).end(emptyResponse.encode());
		});
	}

	private void defineModuleMethodTestRoute() {
		Route route = router.route(HttpMethod.GET, "/:" + PARAM_MODULE + "/:" + PARAM_METHOD + "*")
				.produces(APPLICATION_JSON);
		route.blockingHandler(routingContext -> {
			if (sdk == null) {
				sendError(setResponse(routingContext), null, "Modules have not been initialised");
				return;
			}

			HttpServerRequest request = routingContext.request();
			String module = request.getParam(PARAM_MODULE);
			String method = request.getParam(PARAM_METHOD);
			Map<String, Object> params = retrieveQueryParameters(request);
			logInfo("TEST http://localhost:" + String.valueOf(port) + request.uri() + " at " + new Date().toString());
			APICaller caller = new APICaller(sdk, config);
			try {
				logInfo("CALLING " + String.valueOf(method) + " on " + String.valueOf(module) + " USING "
						+ String.valueOf(params.toString()));
				Object result = caller.callAPI(ApiUtils.convertSnakeToCamel(module, true),
						ApiUtils.convertSnakeToCamel(method, false), params);
				setResponse(routingContext).end(Serializer.convertResultToJson(result));
			} catch (UnknownAPIException | APICallException e) {
				sendError(setResponse(routingContext), null, e.getMessage());
			}
		});
	}

	private HttpServerResponse setResponse(RoutingContext routingContext) {
		return routingContext.response().putHeader(CONTENT_TYPE_HEADER, APPLICATION_JSON);
	}

	private void retrieveConfig() {
		config = new ConnectionOptions(System.getenv(ENVVAR_MBED_CLOUD_API_KEY), System.getenv(ENVVAR_MBED_CLOUD_HOST));

	}

	private Map<String, Object> retrieveQueryParameters(HttpServerRequest request) {
		MultiMap map = request.params();
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		for (Entry<String, String> element : map.entries()) {
			if (!element.getKey().equalsIgnoreCase(PARAM_MODULE) && !element.getKey().equalsIgnoreCase(PARAM_METHOD)) {
				if (element.getKey().equalsIgnoreCase(TEST_ARGS_KEY)) {
					QueryStringDecoder queryStringDecoder = new QueryStringDecoder("/?" + element.getValue());
					Map<String, List<String>> prms = queryStringDecoder.parameters();
					if (!prms.isEmpty()) {
						for (Map.Entry<String, List<String>> entry : prms.entrySet()) {
							if (entry.getValue() == null || entry.getValue().isEmpty()) {
								logWarn("Argument [" + String.valueOf(entry.getKey())
										+ "] has no value. It will be ignored");
							} else if (entry.getValue().size() > 1) {
								logWarn("Argument [" + String.valueOf(entry.getKey()) + "] has more than one value "
										+ String.valueOf(entry.getValue())
										+ ". Only the first one will be considered i.e. "
										+ String.valueOf(entry.getValue().get(0)));
							} else {
								params.put(entry.getKey(), entry.getValue().get(0));
							}
						}
					}
				} else {
					params.put(element.getKey(), element.getValue());
				}
			}
		}
		return params;
	}

	private void logInfo(String message) {
		testLogger.info((CONSOLE_COLOURING) ? INFO_LOG_PREFIX + message : message);
	}

	private void logWarn(String message) {
		testLogger.warn((CONSOLE_COLOURING) ? WARNING_LOG_PREFIX + message : message);
	}

	private void sendError(HttpServerResponse res, Integer errorCode, String errorMessage) {
		int statusCode = (errorCode == null) ? 500 : errorCode;
		JsonObject responseMessage = new JsonObject();
		responseMessage.put("message", errorMessage);
		logInfo(String.valueOf(statusCode) + ": " + String.valueOf(errorMessage));
		res.setStatusCode(statusCode).putHeader(CONTENT_TYPE_HEADER, APPLICATION_JSON).end(responseMessage.encode());
	}

	public static void main(String[] args) {
		TestServer server = new TestServer();
		server.start();
	}

}
