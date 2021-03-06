// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkDeleteStatus.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentBulkDeleteStatus {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            DeviceEnrollmentBulkDeleteStatus deviceenrollmentbulkdeletestatus = DeviceEnrollmentBulkDeleteStatus.getValue(null);
            assertNotNull(deviceenrollmentbulkdeletestatus);
            assertTrue(deviceenrollmentbulkdeletestatus.isDefault());
            deviceenrollmentbulkdeletestatus = DeviceEnrollmentBulkDeleteStatus.getValue(DeviceEnrollmentBulkDeleteStatus.getDefault()
                                                                                                                         .getString());
            assertNotNull(deviceenrollmentbulkdeletestatus);
            assertTrue(deviceenrollmentbulkdeletestatus.isDefault());
            deviceenrollmentbulkdeletestatus = DeviceEnrollmentBulkDeleteStatus.getValue("COMPLETED");
            assertNotNull(deviceenrollmentbulkdeletestatus);
            assertTrue(deviceenrollmentbulkdeletestatus.isDefault());
            deviceenrollmentbulkdeletestatus = DeviceEnrollmentBulkDeleteStatus.getValue("new");
            assertNotNull(deviceenrollmentbulkdeletestatus);
            assertFalse(deviceenrollmentbulkdeletestatus.isDefault());
            deviceenrollmentbulkdeletestatus = DeviceEnrollmentBulkDeleteStatus.getValue("fdec9bb9-e1fd-4a8a-b6b6-08522106d6bc");
            assertNotNull(deviceenrollmentbulkdeletestatus);
            assertTrue(deviceenrollmentbulkdeletestatus.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
