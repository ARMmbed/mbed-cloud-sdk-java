// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model LoginProfileType.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLoginProfileType {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            LoginProfileType loginprofiletype = LoginProfileType.getValue(null);
            assertNotNull(loginprofiletype);
            assertTrue(loginprofiletype.isDefault());
            loginprofiletype = LoginProfileType.getValue(LoginProfileType.getDefault().getString());
            assertNotNull(loginprofiletype);
            assertTrue(loginprofiletype.isDefault());
            loginprofiletype = LoginProfileType.getValue("MBED");
            assertNotNull(loginprofiletype);
            assertTrue(loginprofiletype.isDefault());
            loginprofiletype = LoginProfileType.getValue("NATIVE");
            assertNotNull(loginprofiletype);
            assertFalse(loginprofiletype.isDefault());
            loginprofiletype = LoginProfileType.getValue("ad2b0abe-d878-4ca2-8110-954245f3a5bb");
            assertNotNull(loginprofiletype);
            assertTrue(loginprofiletype.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
