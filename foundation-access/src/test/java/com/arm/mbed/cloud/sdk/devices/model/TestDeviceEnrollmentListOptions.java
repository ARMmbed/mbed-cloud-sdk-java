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
            DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(Integer.valueOf(43),
                                                                                                       Long.valueOf(13),
                                                                                                       Order.getDefault(),
                                                                                                       "e32b355e-d86f-4cba-9fa3-3ff65f188a59",
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
            DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(Integer.valueOf(94),
                                                                                                       Long.valueOf(121),
                                                                                                       Order.getDefault(),
                                                                                                       "bc310b74-2d62-4367-99fc-b79909ea2933",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = new DeviceEnrollmentListOptions(Integer.valueOf(94),
                                                                                                       Long.valueOf(121),
                                                                                                       Order.getDefault(),
                                                                                                       "bc310b74-2d62-4367-99fc-b79909ea2933",
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
            DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(Integer.valueOf(-112),
                                                                                                       Long.valueOf(0),
                                                                                                       Order.getDefault(),
                                                                                                       "5b9477a1-e573-43a2-b6d4-1487cbcbe5c1",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = new DeviceEnrollmentListOptions(Integer.valueOf(-112),
                                                                                                       Long.valueOf(0),
                                                                                                       Order.getDefault(),
                                                                                                       "5b9477a1-e573-43a2-b6d4-1487cbcbe5c1",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions3 = new DeviceEnrollmentListOptions(Integer.valueOf(-122),
                                                                                                       Long.valueOf(59),
                                                                                                       Order.getDefault(),
                                                                                                       "1b8cc0ab-1e33-458e-98a4-5a92735ab720",
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
