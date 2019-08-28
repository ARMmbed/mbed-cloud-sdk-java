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
            deviceenrollmentbulkdeletestatus = DeviceEnrollmentBulkDeleteStatus.getValue("d53061cc-f3c0-4883-a0fd-e649c1794668");
            assertNotNull(deviceenrollmentbulkdeletestatus);
            assertTrue(deviceenrollmentbulkdeletestatus.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
