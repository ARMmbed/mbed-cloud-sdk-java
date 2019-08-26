// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ApiKey.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestApiKey {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ApiKey apikey1 = new ApiKey("0f0fddcbb77d22b2ab801eb65dfbca42", new Date(1566811765260L), -41, null,
                                        "0f0fddcbb77d22b2ab801eb65dfbca42", "a594f7db-b7cc-40fc-8688-7fa269a3cb4e", -57,
                                        "c433f8c6-cb62-45d9-a163-91e79e5ac7cd", "0f0fddcbb77d22b2ab801eb65dfbca42",
                                        ApiKeyStatus.getDefault(), new Date(1566811763074L));
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
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            ApiKey apikey1 = new ApiKey("0f0fddcbb77d22b2ab801eb65dfbca42", new Date(1566811765125L), 12, null,
                                        "0f0fddcbb77d22b2ab801eb65dfbca42", "b42251d7-45f7-492a-a961-541aab374e71",
                                        -103, "87e287f7-0882-44c1-8709-ee9e7afad33c",
                                        "0f0fddcbb77d22b2ab801eb65dfbca42", ApiKeyStatus.getDefault(),
                                        new Date(1566811760772L));
            ApiKey apikey2 = new ApiKey("0f0fddcbb77d22b2ab801eb65dfbca42", new Date(1566811765125L), 12, null,
                                        "0f0fddcbb77d22b2ab801eb65dfbca42", "b42251d7-45f7-492a-a961-541aab374e71",
                                        -103, "87e287f7-0882-44c1-8709-ee9e7afad33c",
                                        "0f0fddcbb77d22b2ab801eb65dfbca42", ApiKeyStatus.getDefault(),
                                        new Date(1566811760772L));
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
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        ApiKey apikey = new ApiKey("0f0fddcbb77d22b2ab801eb65dfbca42", new Date(1566811765608L), -124, null,
                                   "0f0fddcbb77d22b2ab801eb65dfbca42", "bb5a052c-2e2f-49e6-9b1f-be89797b99e5", -92,
                                   "8139fa18-d9d8-4961-b9fb-174e8195ed76", "0f0fddcbb77d22b2ab801eb65dfbca42",
                                   ApiKeyStatus.getDefault(), new Date(1566811758054L));
        assertTrue(apikey.isValid());
        ApiKey apikeyInvalid = new ApiKey("*馠\u0013+\u00123P�?�3䃹\u0017M3Q3□(\t3\u0012:夬\u001e^3D駛�?<姾\u000fͼ僻3333?3;I淑3[懯F哔Sꉈ\u0012\u00153ߌ!㲹\u00133\u00163婱3唵鑢",
                                          new Date(1566811765212L), 54, null,
                                          "*馠\u0013+\u00123P�?�3䃹\u0017M3Q3□(\t3\u0012:夬\u001e^3D駛�?<姾\u000fͼ僻3333?3;I淑3[懯F哔Sꉈ\u0012\u00153ߌ!㲹\u00133\u00163婱3唵鑢",
                                          "4fd737bc-8276-4ac9-92a8-a5cb5816b7fb", 33, null,
                                          "*馠\u0013+\u00123P�?�3䃹\u0017M3Q3□(\t3\u0012:夬\u001e^3D駛�?<姾\u000fͼ僻3333?3;I淑3[懯F哔Sꉈ\u0012\u00153ߌ!㲹\u00133\u00163婱3唵鑢",
                                          ApiKeyStatus.getDefault(), new Date(1566811763877L));
        assertFalse(apikeyInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ApiKey apikey1 = new ApiKey("0f0fddcbb77d22b2ab801eb65dfbca42", new Date(1566811763327L), -88, null,
                                        "0f0fddcbb77d22b2ab801eb65dfbca42", "c00fd072-c4f5-47cf-8a9e-5f9e7f4d8091",
                                        -118, "22a7789d-f2b5-495e-9d70-23bc62adf5ea",
                                        "0f0fddcbb77d22b2ab801eb65dfbca42", ApiKeyStatus.getDefault(),
                                        new Date(1566811758927L));
            ApiKey apikey2 = new ApiKey("0f0fddcbb77d22b2ab801eb65dfbca42", new Date(1566811763327L), -88, null,
                                        "0f0fddcbb77d22b2ab801eb65dfbca42", "c00fd072-c4f5-47cf-8a9e-5f9e7f4d8091",
                                        -118, "22a7789d-f2b5-495e-9d70-23bc62adf5ea",
                                        "0f0fddcbb77d22b2ab801eb65dfbca42", ApiKeyStatus.getDefault(),
                                        new Date(1566811758927L));
            ApiKey apikey3 = new ApiKey("0f0fddcbb77d22b2ab801eb65dfbca42", new Date(1566811760585L), -102, null,
                                        "0f0fddcbb77d22b2ab801eb65dfbca42", "f570d2a8-2764-46ad-9698-d1a759e90a6f", 4,
                                        "f584bdab-9166-4924-a6a0-7c552a6186af", "0f0fddcbb77d22b2ab801eb65dfbca42",
                                        ApiKeyStatus.getDefault(), new Date(1566811761424L));
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
