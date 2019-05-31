// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceDeployedState.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceDeployedState {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            DeviceDeployedState devicedeployedstate = DeviceDeployedState.getValue(null);
            assertNotNull(devicedeployedstate);
            assertTrue(devicedeployedstate.isDefault());
            devicedeployedstate = DeviceDeployedState.getValue(DeviceDeployedState.getDefault().getString());
            assertNotNull(devicedeployedstate);
            assertTrue(devicedeployedstate.isDefault());
            devicedeployedstate = DeviceDeployedState.getValue("DEVELOPMENT");
            assertNotNull(devicedeployedstate);
            assertTrue(devicedeployedstate.isDefault());
            devicedeployedstate = DeviceDeployedState.getValue("production");
            assertNotNull(devicedeployedstate);
            assertFalse(devicedeployedstate.isDefault());
            devicedeployedstate = DeviceDeployedState.getValue("67ecb04c-64d1-4318-8e96-0a7c1a5286f4");
            assertNotNull(devicedeployedstate);
            assertTrue(devicedeployedstate.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
