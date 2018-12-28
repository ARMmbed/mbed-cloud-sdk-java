// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model UserInvitation.
 */
public class TestUserInvitation {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        UserInvitation userinvitation1 = new UserInvitation("7ad6bad5-5b7c-4f4f-be5b-acef30adec77",
                                                            new java.util.Date(1546013406384L),
                                                            "1cdf3d17-eaa2-4b0a-89e8-168795f5ada0",
                                                            new java.util.Date(1546013401727L), null,
                                                            "93934730-994a-4f60-9d80-ec08f047a8bb",
                                                            new java.util.Date(1546013405400L),
                                                            "0c268336-446d-41b7-bf70-af5270dd7622");
        UserInvitation userinvitation2 = userinvitation1.clone();
        assertNotNull(userinvitation1);
        assertNotNull(userinvitation2);
        assertNotSame(userinvitation2, userinvitation1);
        assertEquals(userinvitation2, userinvitation1);
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        UserInvitation userinvitation = new UserInvitation("4d14762c-5d35-405b-a189-a0bbaf6ef2f5",
                                                           new java.util.Date(1546013403592L),
                                                           "b579618f-1a39-467a-a998-e85e99226e5f",
                                                           new java.util.Date(1546013407600L), null,
                                                           "efecd602-f3e3-4c03-89c3-512f52e70b2d",
                                                           new java.util.Date(1546013409496L),
                                                           "fb241c3a-2ad5-4058-b1fd-3d8637c21401");
        assertTrue(userinvitation.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        UserInvitation userinvitation1 = new UserInvitation("fa8e025e-ea1c-491f-9638-13818f6d4676",
                                                            new java.util.Date(1546013409705L),
                                                            "5aba7f16-fa47-4595-9954-617c1130a554",
                                                            new java.util.Date(1546013401957L), null,
                                                            "7609f5aa-b521-4179-aced-4aeb4ac8be65",
                                                            new java.util.Date(1546013408089L),
                                                            "e81f5cf8-4d14-4a0c-9ba8-fad406cc037a");
        UserInvitation userinvitation2 = new UserInvitation("fa8e025e-ea1c-491f-9638-13818f6d4676",
                                                            new java.util.Date(1546013409705L),
                                                            "5aba7f16-fa47-4595-9954-617c1130a554",
                                                            new java.util.Date(1546013401957L), null,
                                                            "7609f5aa-b521-4179-aced-4aeb4ac8be65",
                                                            new java.util.Date(1546013408089L),
                                                            "e81f5cf8-4d14-4a0c-9ba8-fad406cc037a");
        assertNotNull(userinvitation1);
        assertNotNull(userinvitation2);
        assertNotSame(userinvitation2, userinvitation1);
        assertEquals(userinvitation2, userinvitation1);
        assertEquals(userinvitation2.hashCode(), userinvitation1.hashCode());
        int hashCode = userinvitation1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, userinvitation1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        UserInvitation userinvitation1 = new UserInvitation("9f083792-1d0e-4a81-b9cd-6a520b26755d",
                                                            new java.util.Date(1546013403084L),
                                                            "c74ce211-e0d5-49b5-ba2d-3552eb053a9d",
                                                            new java.util.Date(1546013401961L), null,
                                                            "3174544f-1256-406a-9991-d0b88b6c5647",
                                                            new java.util.Date(1546013403016L),
                                                            "e15d3b9c-66bd-4f9b-8d1f-c7ba6707a37f");
        UserInvitation userinvitation2 = new UserInvitation("9f083792-1d0e-4a81-b9cd-6a520b26755d",
                                                            new java.util.Date(1546013403084L),
                                                            "c74ce211-e0d5-49b5-ba2d-3552eb053a9d",
                                                            new java.util.Date(1546013401961L), null,
                                                            "3174544f-1256-406a-9991-d0b88b6c5647",
                                                            new java.util.Date(1546013403016L),
                                                            "e15d3b9c-66bd-4f9b-8d1f-c7ba6707a37f");
        UserInvitation userinvitation3 = new UserInvitation("8a2b9219-3f37-43a6-96cf-9dd7da999fc6",
                                                            new java.util.Date(1546013408776L),
                                                            "1a4d18fa-b1d7-4d4c-a67b-717d285d5e24",
                                                            new java.util.Date(1546013400207L), null,
                                                            "630cfb9b-39a0-4f26-b852-9316961e3ad8",
                                                            new java.util.Date(1546013404039L),
                                                            "852cd8f9-dc27-4d86-9be6-b9b2e37402df");
        assertNotNull(userinvitation1);
        assertNotNull(userinvitation2);
        assertNotNull(userinvitation3);
        assertNotSame(userinvitation2, userinvitation1);
        assertNotSame(userinvitation3, userinvitation1);
        assertEquals(userinvitation2, userinvitation1);
        assertEquals(userinvitation2, userinvitation1);
        assertEquals(userinvitation1, userinvitation2);
        assertEquals(userinvitation1, userinvitation1);
        assertFalse(userinvitation1.equals(null));
        assertNotEquals(userinvitation3, userinvitation1);
    }
}
