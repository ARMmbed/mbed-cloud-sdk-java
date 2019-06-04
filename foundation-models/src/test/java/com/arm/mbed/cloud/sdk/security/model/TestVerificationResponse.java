// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model VerificationResponse.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestVerificationResponse {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            VerificationResponse verificationresponse1 = new VerificationResponse("dd1056e3-dd0f-4083-a149-1e8bd9de28fc",
                                                                                  true);
            VerificationResponse verificationresponse2 = verificationresponse1.clone();
            assertNotNull(verificationresponse1);
            assertNotNull(verificationresponse2);
            assertNotSame(verificationresponse2, verificationresponse1);
            assertEquals(verificationresponse2, verificationresponse1);
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
            VerificationResponse verificationresponse1 = new VerificationResponse("3ab0e1be-2887-4ef4-8a4b-28e2b115b087",
                                                                                  true);
            VerificationResponse verificationresponse2 = new VerificationResponse("3ab0e1be-2887-4ef4-8a4b-28e2b115b087",
                                                                                  true);
            assertNotNull(verificationresponse1);
            assertNotNull(verificationresponse2);
            assertNotSame(verificationresponse2, verificationresponse1);
            assertEquals(verificationresponse2, verificationresponse1);
            assertEquals(verificationresponse2.hashCode(), verificationresponse1.hashCode());
            int hashCode = verificationresponse1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, verificationresponse1.hashCode());
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
        VerificationResponse verificationresponse = new VerificationResponse("61d61266-2d49-44b3-8846-96e3637f8f0c",
                                                                             true);
        assertTrue(verificationresponse.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            VerificationResponse verificationresponse1 = new VerificationResponse("e60099d9-8224-43f8-887d-d0a359674615",
                                                                                  true);
            VerificationResponse verificationresponse2 = new VerificationResponse("e60099d9-8224-43f8-887d-d0a359674615",
                                                                                  true);
            VerificationResponse verificationresponse3 = new VerificationResponse("2ad3d447-1851-41bf-a670-0c97a3237a0e",
                                                                                  true);
            assertNotNull(verificationresponse1);
            assertNotNull(verificationresponse2);
            assertNotNull(verificationresponse3);
            assertNotSame(verificationresponse2, verificationresponse1);
            assertNotSame(verificationresponse3, verificationresponse1);
            assertEquals(verificationresponse2, verificationresponse1);
            assertEquals(verificationresponse2, verificationresponse1);
            assertEquals(verificationresponse1, verificationresponse2);
            assertEquals(verificationresponse1, verificationresponse1);
            assertFalse(verificationresponse1.equals(null));
            assertNotEquals(verificationresponse3, verificationresponse1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
