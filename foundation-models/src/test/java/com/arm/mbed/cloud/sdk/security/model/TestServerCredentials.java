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
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1559758608838L),
                                                                         "b1ae87ee-3a62-43e2-be4a-fa86dac74926",
                                                                         "cf12f18e-4b2c-44f2-88ad-0bda9ffd5a08",
                                                                         "587aa333-5300-49e9-a3f2-792fc6eabdcb");
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
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1559758605455L),
                                                                         "15d68a4d-f800-4be4-bcdc-0224749ce6b6",
                                                                         "4377a2a5-ba5a-4d8e-9e56-c9d70d6bc21f",
                                                                         "0f263266-c397-40de-aa7c-e51c80050c36");
            ServerCredentials servercredentials2 = new ServerCredentials(new Date(1559758605455L),
                                                                         "15d68a4d-f800-4be4-bcdc-0224749ce6b6",
                                                                         "4377a2a5-ba5a-4d8e-9e56-c9d70d6bc21f",
                                                                         "0f263266-c397-40de-aa7c-e51c80050c36");
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
        ServerCredentials servercredentials = new ServerCredentials(new Date(1559758605338L),
                                                                    "d2c799fa-65dc-4a94-be2a-146fc189c337",
                                                                    "cf4a0b89-230a-433e-b264-eed72e8afe2e",
                                                                    "35e12654-886d-4b5e-9072-92551a41699d");
        assertTrue(servercredentials.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1559758611741L),
                                                                         "89d59c13-5fa4-43f7-9200-34d495c59cd0",
                                                                         "f687d666-9e58-49ee-8967-1d5300d91f7f",
                                                                         "ba871450-45b9-4fa6-b893-c9da369862f6");
            ServerCredentials servercredentials2 = new ServerCredentials(new Date(1559758611741L),
                                                                         "89d59c13-5fa4-43f7-9200-34d495c59cd0",
                                                                         "f687d666-9e58-49ee-8967-1d5300d91f7f",
                                                                         "ba871450-45b9-4fa6-b893-c9da369862f6");
            ServerCredentials servercredentials3 = new ServerCredentials(new Date(1559758609699L),
                                                                         "0d5a168e-cc5b-4c8f-957e-2e9d6862245f",
                                                                         "ef5edc73-1eee-4a67-adef-0f78272ae9b5",
                                                                         "e3d05af0-1e70-4684-8bed-235e9fd4ee5b");
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
