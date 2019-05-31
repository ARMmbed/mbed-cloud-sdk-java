// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(Integer.valueOf(-47),
                                                                                                       Long.valueOf(-92),
                                                                                                       Order.getDefault(),
                                                                                                       "d439a528-9e0b-41c5-bf7f-2cd7a614a8a9",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = deviceenrollmentlistoptions1.clone();
            assertNotNull(deviceenrollmentlistoptions1);
            assertNotNull(deviceenrollmentlistoptions2);
            assertNotSame(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(Integer.valueOf(98),
                                                                                                       Long.valueOf(74),
                                                                                                       Order.getDefault(),
                                                                                                       "cea57e85-7975-42af-9273-045e83febe23",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = new DeviceEnrollmentListOptions(Integer.valueOf(98),
                                                                                                       Long.valueOf(74),
                                                                                                       Order.getDefault(),
                                                                                                       "cea57e85-7975-42af-9273-045e83febe23",
                                                                                                       null, null);
            assertNotNull(deviceenrollmentlistoptions1);
            assertNotNull(deviceenrollmentlistoptions2);
            assertNotSame(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions2.hashCode(), deviceenrollmentlistoptions1.hashCode());
            int hashCode = deviceenrollmentlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentlistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(Integer.valueOf(-71),
                                                                                                       Long.valueOf(-101),
                                                                                                       Order.getDefault(),
                                                                                                       "2e30cac1-d281-49e0-8c8a-12461cc45895",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = new DeviceEnrollmentListOptions(Integer.valueOf(-71),
                                                                                                       Long.valueOf(-101),
                                                                                                       Order.getDefault(),
                                                                                                       "2e30cac1-d281-49e0-8c8a-12461cc45895",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions3 = new DeviceEnrollmentListOptions(Integer.valueOf(-85),
                                                                                                       Long.valueOf(62),
                                                                                                       Order.getDefault(),
                                                                                                       "b68ed2e4-7b80-4699-8e82-a21a43e5d8ad",
                                                                                                       null, null);
            assertNotNull(deviceenrollmentlistoptions1);
            assertNotNull(deviceenrollmentlistoptions2);
            assertNotNull(deviceenrollmentlistoptions3);
            assertNotSame(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertNotSame(deviceenrollmentlistoptions3, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions1, deviceenrollmentlistoptions2);
            assertEquals(deviceenrollmentlistoptions1, deviceenrollmentlistoptions1);
            assertFalse(deviceenrollmentlistoptions1.equals(null));
            assertNotEquals(deviceenrollmentlistoptions3, deviceenrollmentlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
