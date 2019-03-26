// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ServerCredentials.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestServerCredentials {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1553592023665L),
                                                                         "80c0de4f-7151-41b4-8d9c-572696e28ce7",
                                                                         "613e0128-7e49-4e41-8f31-608969a0abc8",
                                                                         "ba2de117-a5ea-4c8e-852b-16a785354dc4");
            ServerCredentials servercredentials2 = servercredentials1.clone();
            assertNotNull(servercredentials1);
            assertNotNull(servercredentials2);
            assertNotSame(servercredentials2, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
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
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1553592032618L),
                                                                         "307724f1-cff3-4a04-9a43-2647f713fc9f",
                                                                         "a8252fdd-9650-4fd6-bee9-7b670a27f87e",
                                                                         "8c3b56d3-f182-46ef-83f1-f4187ef81a8e");
            ServerCredentials servercredentials2 = new ServerCredentials(new Date(1553592032618L),
                                                                         "307724f1-cff3-4a04-9a43-2647f713fc9f",
                                                                         "a8252fdd-9650-4fd6-bee9-7b670a27f87e",
                                                                         "8c3b56d3-f182-46ef-83f1-f4187ef81a8e");
            assertNotNull(servercredentials1);
            assertNotNull(servercredentials2);
            assertNotSame(servercredentials2, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
            assertEquals(servercredentials2.hashCode(), servercredentials1.hashCode());
            int hashCode = servercredentials1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, servercredentials1.hashCode());
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
        ServerCredentials servercredentials = new ServerCredentials(new Date(1553592030552L),
                                                                    "943aa3dc-92cb-4690-916f-774e10eb555d",
                                                                    "9b8bd210-9158-4be4-b10e-05ca3a1c6046",
                                                                    "371c9fcf-18e6-48d3-a93e-13eed4f8dd7e");
        assertTrue(servercredentials.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1553592026663L),
                                                                         "34867d94-e13a-4ff8-98c2-d8c7992d2da9",
                                                                         "fbc168c3-3334-49aa-84fa-aaa90654dbe2",
                                                                         "c8c6cc7f-d981-4140-91df-8a85c260fe03");
            ServerCredentials servercredentials2 = new ServerCredentials(new Date(1553592026663L),
                                                                         "34867d94-e13a-4ff8-98c2-d8c7992d2da9",
                                                                         "fbc168c3-3334-49aa-84fa-aaa90654dbe2",
                                                                         "c8c6cc7f-d981-4140-91df-8a85c260fe03");
            ServerCredentials servercredentials3 = new ServerCredentials(new Date(1553592029680L),
                                                                         "c6c577ab-9f54-4207-87b2-95a1c1eff576",
                                                                         "e2e2a8f9-1123-4c61-a906-88671a348e03",
                                                                         "840cc8ef-2821-463c-9f9a-a40de5f22033");
            assertNotNull(servercredentials1);
            assertNotNull(servercredentials2);
            assertNotNull(servercredentials3);
            assertNotSame(servercredentials2, servercredentials1);
            assertNotSame(servercredentials3, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
            assertEquals(servercredentials1, servercredentials2);
            assertEquals(servercredentials1, servercredentials1);
            assertFalse(servercredentials1.equals(null));
            assertNotEquals(servercredentials3, servercredentials1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
