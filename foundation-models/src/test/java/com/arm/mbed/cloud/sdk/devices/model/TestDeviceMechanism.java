// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceMechanism.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceMechanism {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            DeviceMechanism devicemechanism = DeviceMechanism.getValue(null);
            assertNotNull(devicemechanism);
            assertTrue(devicemechanism.isDefault());
            devicemechanism = DeviceMechanism.getValue(DeviceMechanism.getDefault().getString());
            assertNotNull(devicemechanism);
            assertTrue(devicemechanism.isDefault());
            devicemechanism = DeviceMechanism.getValue("CONNECTOR");
            assertNotNull(devicemechanism);
            assertTrue(devicemechanism.isDefault());
            devicemechanism = DeviceMechanism.getValue("direct");
            assertNotNull(devicemechanism);
            assertFalse(devicemechanism.isDefault());
            devicemechanism = DeviceMechanism.getValue("9de58727-9d92-445e-8ba1-60a6971ac42e");
            assertNotNull(devicemechanism);
            assertTrue(devicemechanism.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
