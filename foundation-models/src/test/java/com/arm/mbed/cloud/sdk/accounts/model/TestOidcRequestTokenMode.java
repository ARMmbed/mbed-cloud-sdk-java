// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model OidcRequestTokenMode.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestOidcRequestTokenMode {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            OidcRequestTokenMode oidcrequesttokenmode = OidcRequestTokenMode.getValue(null);
            assertNotNull(oidcrequesttokenmode);
            assertTrue(oidcrequesttokenmode.isDefault());
            oidcrequesttokenmode = OidcRequestTokenMode.getValue(OidcRequestTokenMode.getDefault().getString());
            assertNotNull(oidcrequesttokenmode);
            assertTrue(oidcrequesttokenmode.isDefault());
            oidcrequesttokenmode = OidcRequestTokenMode.getValue("GET");
            assertNotNull(oidcrequesttokenmode);
            assertTrue(oidcrequesttokenmode.isDefault());
            oidcrequesttokenmode = OidcRequestTokenMode.getValue("POST");
            assertNotNull(oidcrequesttokenmode);
            assertFalse(oidcrequesttokenmode.isDefault());
            oidcrequesttokenmode = OidcRequestTokenMode.getValue("33f6d39f-a03c-41ed-815a-55d98c3d3f4b");
            assertNotNull(oidcrequesttokenmode);
            assertTrue(oidcrequesttokenmode.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}