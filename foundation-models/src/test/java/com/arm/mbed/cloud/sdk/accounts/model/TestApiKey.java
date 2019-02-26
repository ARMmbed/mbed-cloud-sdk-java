// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ApiKey.
 */
public class TestApiKey {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            ApiKey apikey1 = new ApiKey("c689f8ddff8a89453efaeb38d5e75998", new Date(1548165438272L), -10,
                                        "2e800e45-e819-4494-a740-d629206906aa", "49f03c22-36cc-4cd9-ba72-189819521249",
                                        -65, "4e0cc660-946d-4871-aff2-5da3cce351e1",
                                        "a3d91e8a-3691-483e-9698-bb2bccf454e2", ApiKeyStatus.getDefault(),
                                        new Date(1548165447482L));
            ApiKey apikey2 = apikey1.clone();
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotSame(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashCode() {
        try {
            ApiKey apikey1 = new ApiKey("f3cfd1ee03fef2f12de77616c9a7b4cf", new Date(1548165442837L), -31,
                                        "ec9d7f4f-4124-4110-844d-43bf0c19f731", "91fa0b5a-ae4a-4e63-94ab-88621f799d43",
                                        -70, "11d90ad3-d396-43d7-a0ce-b766adc93c13",
                                        "e075b7db-c8ee-4f11-ba01-bf65c88f4b40", ApiKeyStatus.getDefault(),
                                        new Date(1548165438539L));
            ApiKey apikey2 = new ApiKey("f3cfd1ee03fef2f12de77616c9a7b4cf", new Date(1548165442837L), -31,
                                        "ec9d7f4f-4124-4110-844d-43bf0c19f731", "91fa0b5a-ae4a-4e63-94ab-88621f799d43",
                                        -70, "11d90ad3-d396-43d7-a0ce-b766adc93c13",
                                        "e075b7db-c8ee-4f11-ba01-bf65c88f4b40", ApiKeyStatus.getDefault(),
                                        new Date(1548165438539L));
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotSame(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey2.hashCode(), apikey1.hashCode());
            int hashCode = apikey1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, apikey1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsValid() {
        ApiKey apikey = new ApiKey("4ecfb8ab22a14b98c89fbdb3a4ca4036", new Date(1548165444440L), 87,
                                   "690395b8-b68a-4a12-a864-2903fadb19a0", "1a189cdb-1031-4c8f-b7aa-08437855ad14", -83,
                                   "081d335c-5fb2-4d33-b1ad-b9656f703623", "4ef16f4f-3d1d-47ca-8568-05571b16c094",
                                   ApiKeyStatus.getDefault(), new Date(1548165446919L));
        assertTrue(apikey.isValid());
        ApiKey apikeyInvalid = new ApiKey("첄14\u00114ﴥ;䌹\u001b1�?414\u0006\u000f4�?�4?F44$$ 痙1\u001e1�?1뤩4N\u0004$$%\u001e14141A1\u00161쨓뚊44⫒E\u00121\u0000Q4蹇H4<11",
                                          new Date(1548165439829L), -68, "258a028a-03e1-4a9c-8a38-39e4af678ca0",
                                          "567a1eac-1559-4f28-8904-7c6c2ddb9723", -115, null,
                                          "09d9a55f-860b-44c9-8878-f5a62ca3aca9", ApiKeyStatus.getDefault(),
                                          new Date(1548165440354L));
        assertFalse(apikeyInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            ApiKey apikey1 = new ApiKey("a474dfb49bdd05a2d118c6c4ab7ff835", new Date(1548165439506L), 118,
                                        "49094f73-82bd-44a1-bee0-bcf3845a77eb", "ecfdd788-7d9e-497e-8188-e55dc8496ea8",
                                        11, "520963d9-b3a9-49e7-a517-d4f62ad861b0",
                                        "bfc4afaa-4d5c-41ea-9314-8076c9ca61a3", ApiKeyStatus.getDefault(),
                                        new Date(1548165445008L));
            ApiKey apikey2 = new ApiKey("a474dfb49bdd05a2d118c6c4ab7ff835", new Date(1548165439506L), 118,
                                        "49094f73-82bd-44a1-bee0-bcf3845a77eb", "ecfdd788-7d9e-497e-8188-e55dc8496ea8",
                                        11, "520963d9-b3a9-49e7-a517-d4f62ad861b0",
                                        "bfc4afaa-4d5c-41ea-9314-8076c9ca61a3", ApiKeyStatus.getDefault(),
                                        new Date(1548165445008L));
            ApiKey apikey3 = new ApiKey("31be20c983f5f6124bbe84a9ab1e353c", new Date(1548165443422L), -58,
                                        "b65ff1c3-a1df-4c27-86f6-884aed9d8a8e", "156b70d5-6717-43d3-8c29-f1066ab208cb",
                                        -43, "a1a1eb0a-17e0-4b2f-8fdc-c3f65421f500",
                                        "030da10b-d241-400a-9a52-ec4b36344d81", ApiKeyStatus.getDefault(),
                                        new Date(1548165441350L));
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotNull(apikey3);
            assertNotSame(apikey2, apikey1);
            assertNotSame(apikey3, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey1, apikey2);
            assertEquals(apikey1, apikey1);
            assertFalse(apikey1.equals(null));
            assertNotEquals(apikey3, apikey1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}