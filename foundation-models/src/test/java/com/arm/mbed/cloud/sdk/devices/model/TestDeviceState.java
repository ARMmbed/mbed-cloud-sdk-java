// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceState.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceState {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            DeviceState devicestate = DeviceState.getValue(null);
            assertNotNull(devicestate);
            assertTrue(devicestate.isDefault());
            devicestate = DeviceState.getValue(DeviceState.getDefault().getString());
            assertNotNull(devicestate);
            assertTrue(devicestate.isDefault());
            devicestate = DeviceState.getValue("BOOTSTRAPPED");
            assertNotNull(devicestate);
            assertTrue(devicestate.isDefault());
            devicestate = DeviceState.getValue("cloud_enrolling");
            assertNotNull(devicestate);
            assertFalse(devicestate.isDefault());
            devicestate = DeviceState.getValue("2f3bab44-36df-4e90-bc37-f8d1fd360f1b");
            assertNotNull(devicestate);
            assertTrue(devicestate.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
