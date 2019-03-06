// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model AccountStatus.
 */
public class TestAccountStatus {
    /**
     * Tests the getValue method.
     */
    @Test
    public void testGetValue() {
        try {
            AccountStatus accountstatus = AccountStatus.getValue(null);
            assertNotNull(accountstatus);
            assertTrue(accountstatus.isDefault());
            accountstatus = AccountStatus.getValue(AccountStatus.getDefault().getString());
            assertNotNull(accountstatus);
            assertTrue(accountstatus.isDefault());
            accountstatus = AccountStatus.getValue("ACTIVE");
            assertNotNull(accountstatus);
            assertTrue(accountstatus.isDefault());
            accountstatus = AccountStatus.getValue("ENROLLING");
            assertNotNull(accountstatus);
            assertFalse(accountstatus.isDefault());
            accountstatus = AccountStatus.getValue("6a5c1611-4f20-4394-9073-0a0ef87c7ef4");
            assertNotNull(accountstatus);
            assertTrue(accountstatus.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
