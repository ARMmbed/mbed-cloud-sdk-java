// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEventsListOptions.
 */
public class TestDeviceEventsListOptions {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(90),
                                                                                           Long.valueOf(-58),
                                                                                           Order.getDefault(),
                                                                                           "5cb806ad-68ff-49e0-9f14-3ee94bdc8f4d",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = deviceeventslistoptions1.clone();
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashCode() {
        try {
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(-71),
                                                                                           Long.valueOf(22),
                                                                                           Order.getDefault(),
                                                                                           "8fd7a61f-23ac-477b-a3db-64634d1d462b",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(-71),
                                                                                           Long.valueOf(22),
                                                                                           Order.getDefault(),
                                                                                           "8fd7a61f-23ac-477b-a3db-64634d1d462b",
                                                                                           null, null);
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2.hashCode(), deviceeventslistoptions1.hashCode());
            int hashCode = deviceeventslistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceeventslistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(-84),
                                                                                           Long.valueOf(126),
                                                                                           Order.getDefault(),
                                                                                           "6e247dbb-69c5-477f-950e-ae0acc36e6ea",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(-84),
                                                                                           Long.valueOf(126),
                                                                                           Order.getDefault(),
                                                                                           "6e247dbb-69c5-477f-950e-ae0acc36e6ea",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions3 = new DeviceEventsListOptions(Integer.valueOf(-32),
                                                                                           Long.valueOf(53),
                                                                                           Order.getDefault(),
                                                                                           "ed53d6a3-cbc5-4e4b-9ca4-6a93de944360",
                                                                                           null, null);
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotNull(deviceeventslistoptions3);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertNotSame(deviceeventslistoptions3, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions1, deviceeventslistoptions2);
            assertEquals(deviceeventslistoptions1, deviceeventslistoptions1);
            assertFalse(deviceeventslistoptions1.equals(null));
            assertNotEquals(deviceeventslistoptions3, deviceeventslistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}