// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeveloperCertificate.
 */
public class TestDeveloperCertificate {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("005edc79-2c6f-480e-9130-ea4a66e91c1d",
                                                                                  "977727ca-c3e0-4fbb-ab78-e3f4e214b88b",
                                                                                  new java.util.Date(1546452535848L),
                                                                                  "0d3e0e44-3794-4a28-81b7-aada0bdf1c31",
                                                                                  "3c61453e-6456-4a31-bf8f-99f292534b7a",
                                                                                  "6e8ab791-3329-4930-a3a2-7736f096c8f1",
                                                                                  "3c305ed0-6322-4c1c-80c1-cddd49fc5ad5");
            DeveloperCertificate developercertificate2 = developercertificate1.clone();
            assertNotNull(developercertificate1);
            assertNotNull(developercertificate2);
            assertNotSame(developercertificate2, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        DeveloperCertificate developercertificate = new DeveloperCertificate("9616174d-b134-47ec-b621-8dd752489669",
                                                                             "0f926cfb-d3a6-47b3-b2a9-952f6c5a327e",
                                                                             new java.util.Date(1546452531764L),
                                                                             "372fc251-ba56-46b7-8633-1e7fdad369e0",
                                                                             "adf9c0f5-76e0-4897-9527-e58f79e8f083",
                                                                             "2a5d0de8-b604-42a7-b3e4-f786a0669855",
                                                                             "10ee598b-6024-4231-aeb0-e5216a53ed6e");
        assertTrue(developercertificate.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("4e9052c2-eb51-42e3-9c82-27c3c37a38e3",
                                                                                  "8f4dfc98-93d9-4a71-b061-6cfc5df5b04c",
                                                                                  new java.util.Date(1546452540646L),
                                                                                  "81c6f6e5-1ea7-4011-9bf3-7ad015565c46",
                                                                                  "c14268c9-46a7-46d5-bd9b-6ead74500074",
                                                                                  "def70c54-f996-46bc-a143-6db7311b024c",
                                                                                  "2abc4aa6-3b99-4f42-84bd-7320d8594f94");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("4e9052c2-eb51-42e3-9c82-27c3c37a38e3",
                                                                                  "8f4dfc98-93d9-4a71-b061-6cfc5df5b04c",
                                                                                  new java.util.Date(1546452540646L),
                                                                                  "81c6f6e5-1ea7-4011-9bf3-7ad015565c46",
                                                                                  "c14268c9-46a7-46d5-bd9b-6ead74500074",
                                                                                  "def70c54-f996-46bc-a143-6db7311b024c",
                                                                                  "2abc4aa6-3b99-4f42-84bd-7320d8594f94");
            assertNotNull(developercertificate1);
            assertNotNull(developercertificate2);
            assertNotSame(developercertificate2, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
            assertEquals(developercertificate2.hashCode(), developercertificate1.hashCode());
            int hashCode = developercertificate1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, developercertificate1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("632d20be-c4bb-40ee-bd19-bd7e063639a2",
                                                                                  "d7af1d28-b81c-4ab9-a360-bf9cb8d2bcf8",
                                                                                  new java.util.Date(1546452532418L),
                                                                                  "1423fd5c-3ede-4473-ba9d-b726ec26d31e",
                                                                                  "493801a1-4480-42d8-b124-38302fd46294",
                                                                                  "f0a3b092-1e9c-4b0f-8d2d-71707c050f21",
                                                                                  "fdba223b-4ad9-4a5e-b6dd-ad5e9774695a");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("632d20be-c4bb-40ee-bd19-bd7e063639a2",
                                                                                  "d7af1d28-b81c-4ab9-a360-bf9cb8d2bcf8",
                                                                                  new java.util.Date(1546452532418L),
                                                                                  "1423fd5c-3ede-4473-ba9d-b726ec26d31e",
                                                                                  "493801a1-4480-42d8-b124-38302fd46294",
                                                                                  "f0a3b092-1e9c-4b0f-8d2d-71707c050f21",
                                                                                  "fdba223b-4ad9-4a5e-b6dd-ad5e9774695a");
            DeveloperCertificate developercertificate3 = new DeveloperCertificate("dff784aa-f13e-4fd5-9c85-3da47abe1540",
                                                                                  "cfe4ba1a-4734-4edb-951d-473059cfad59",
                                                                                  new java.util.Date(1546452538354L),
                                                                                  "b335108a-3732-44bd-8669-6b509419f1c0",
                                                                                  "a0d8dccd-a33a-42b4-9b16-82d1fdfa32ff",
                                                                                  "410f8869-6db0-4ce9-a329-fb55a51663a0",
                                                                                  "8fba60e4-8fa1-4177-a198-63a031ae7304");
            assertNotNull(developercertificate1);
            assertNotNull(developercertificate2);
            assertNotNull(developercertificate3);
            assertNotSame(developercertificate2, developercertificate1);
            assertNotSame(developercertificate3, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
            assertEquals(developercertificate1, developercertificate2);
            assertEquals(developercertificate1, developercertificate1);
            assertFalse(developercertificate1.equals(null));
            assertNotEquals(developercertificate3, developercertificate1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
