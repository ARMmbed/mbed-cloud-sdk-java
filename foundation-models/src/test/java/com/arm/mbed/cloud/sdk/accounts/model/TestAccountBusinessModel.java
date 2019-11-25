// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model AccountBusinessModel.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestAccountBusinessModel {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            AccountBusinessModel accountbusinessmodel = AccountBusinessModel.getValue(null);
            assertNotNull(accountbusinessmodel);
            assertTrue(accountbusinessmodel.isDefault());
            accountbusinessmodel = AccountBusinessModel.getValue(AccountBusinessModel.getDefault().getString());
            assertNotNull(accountbusinessmodel);
            assertTrue(accountbusinessmodel.isDefault());
            accountbusinessmodel = AccountBusinessModel.getValue("ACTIVE_DEVICE_BUSINESS_MODEL");
            assertNotNull(accountbusinessmodel);
            assertTrue(accountbusinessmodel.isDefault());
            accountbusinessmodel = AccountBusinessModel.getValue("api_calls_1_business_model");
            assertNotNull(accountbusinessmodel);
            assertFalse(accountbusinessmodel.isDefault());
            accountbusinessmodel = AccountBusinessModel.getValue("7e56caf8-079d-41b1-bfe9-3971ec442ef2");
            assertNotNull(accountbusinessmodel);
            assertTrue(accountbusinessmodel.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
