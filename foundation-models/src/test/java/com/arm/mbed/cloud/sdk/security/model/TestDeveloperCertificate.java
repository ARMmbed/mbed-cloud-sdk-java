// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeveloperCertificate.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeveloperCertificate {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("f9e2e0f2-d5bf-4cb8-9de6-9d05e519ee15",
                                                                                  "2b02319f-1615-41f6-a227-aadb65cefafc",
                                                                                  new Date(1559288254715L),
                                                                                  "1b417857-d76c-4f57-93c6-be87c914034d",
                                                                                  "5ea450a2-51b4-4106-a4f2-82a88bad8c15",
                                                                                  "7cfb813a-b77f-4be6-a6b0-3ce944a084ce",
                                                                                  "a99594b2-e0a3-4de9-8b38-e4e59265e585",
                                                                                  "2b59a0d0-3f9b-48d2-b44b-6b245f828799");
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
     * Tests the hashCode method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("ef769352-3c7e-4950-8429-3ae0390e245b",
                                                                                  "ec4b3b0b-2830-4df1-a817-31c37f07d43f",
                                                                                  new Date(1559288257476L),
                                                                                  "e7aeb753-4ded-46a4-8ad8-5a2709ea50ab",
                                                                                  "c915b3ff-239a-4799-8ca2-f2bec91eb425",
                                                                                  "55d4d5a0-17bb-4942-af11-1edabba961fc",
                                                                                  "1d65515a-2456-45f7-ac6a-ce9ae7ffc1d0",
                                                                                  "d4507dd5-b36e-4778-bd23-380499ce6787");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("ef769352-3c7e-4950-8429-3ae0390e245b",
                                                                                  "ec4b3b0b-2830-4df1-a817-31c37f07d43f",
                                                                                  new Date(1559288257476L),
                                                                                  "e7aeb753-4ded-46a4-8ad8-5a2709ea50ab",
                                                                                  "c915b3ff-239a-4799-8ca2-f2bec91eb425",
                                                                                  "55d4d5a0-17bb-4942-af11-1edabba961fc",
                                                                                  "1d65515a-2456-45f7-ac6a-ce9ae7ffc1d0",
                                                                                  "d4507dd5-b36e-4778-bd23-380499ce6787");
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
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        DeveloperCertificate developercertificate = new DeveloperCertificate("dcf90e15-4049-4be5-ae74-e3d4ff7e4cb7",
                                                                             "d52854eb-f50a-4d3e-9dac-dc54e11a128b",
                                                                             new Date(1559288259704L),
                                                                             "08c23596-312e-44a1-a36a-87f3600ed0ff",
                                                                             "4939e5ab-7ae3-44f1-a695-8ad74697d70d",
                                                                             "9d0630a1-da59-435a-96bd-a9c0257462fa",
                                                                             "4c37d9c5-9edc-4769-b8ea-c3c65651e884",
                                                                             "a99122b4-0862-4822-8efc-aec00826e7c0");
        assertTrue(developercertificate.isValid());
        DeveloperCertificate developercertificateInvalid = new DeveloperCertificate("baf11cb9-aa89-44be-9801-2bc38803f1b3",
                                                                                    "688a26e0-e383-4406-9058-764c72a7e302",
                                                                                    new Date(1559288263412L),
                                                                                    "ea628634-4c31-400c-8cfc-3be8bda66ccd",
                                                                                    "a9bb0604-fcb2-495a-878b-b21035cb90f0",
                                                                                    "5ee8302b-eb76-449d-8eb7-0d4ec562a70c",
                                                                                    null,
                                                                                    "acb227ca-0075-4e4b-9c14-5ee4464b8e4e");
        assertFalse(developercertificateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("776c191a-4335-4a36-9ee4-71807501f02a",
                                                                                  "bf659893-fd03-4d41-8edd-18907be1bdec",
                                                                                  new Date(1559288263074L),
                                                                                  "1e16faf3-f7c8-4ba5-8e39-f59e400ad333",
                                                                                  "3dcc372c-1de0-4a67-9cc3-e6e4e64df26f",
                                                                                  "423a2f9b-34a0-4ff8-b93e-be0bf745d8eb",
                                                                                  "eda7606c-647c-4147-a430-44d81a7d3cd1",
                                                                                  "f515f59c-5042-4a8c-9307-6a0ebd9eb292");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("776c191a-4335-4a36-9ee4-71807501f02a",
                                                                                  "bf659893-fd03-4d41-8edd-18907be1bdec",
                                                                                  new Date(1559288263074L),
                                                                                  "1e16faf3-f7c8-4ba5-8e39-f59e400ad333",
                                                                                  "3dcc372c-1de0-4a67-9cc3-e6e4e64df26f",
                                                                                  "423a2f9b-34a0-4ff8-b93e-be0bf745d8eb",
                                                                                  "eda7606c-647c-4147-a430-44d81a7d3cd1",
                                                                                  "f515f59c-5042-4a8c-9307-6a0ebd9eb292");
            DeveloperCertificate developercertificate3 = new DeveloperCertificate("4ec1e9c3-a1e1-45f0-ba93-991bca3ef5c3",
                                                                                  "0ddb8973-e637-4d9a-b250-6a1ac90f7035",
                                                                                  new Date(1559288261562L),
                                                                                  "1c67ab1d-ae1c-47c4-997b-8d15572ac3bd",
                                                                                  "9e89d33d-78b5-4626-98a3-9570958e3364",
                                                                                  "0ebe6af0-0210-47f4-9b78-0720848f14be",
                                                                                  "bc78d4d6-b113-4855-9bc2-fde3bf6877b7",
                                                                                  "6658586a-5a09-43f8-bdac-c5925be49aea");
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
