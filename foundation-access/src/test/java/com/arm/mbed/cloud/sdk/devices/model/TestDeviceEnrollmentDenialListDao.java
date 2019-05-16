// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentDenialListDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentDenialListDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentDenialListDao deviceenrollmentdeniallistdao1 = new DeviceEnrollmentDenialListDao();
            DeviceEnrollmentDenialListDao deviceenrollmentdeniallistdao2 = deviceenrollmentdeniallistdao1.clone();
            assertNotNull(deviceenrollmentdeniallistdao1);
            assertNotNull(deviceenrollmentdeniallistdao2);
            assertNotSame(deviceenrollmentdeniallistdao2, deviceenrollmentdeniallistdao1);
            assertEquals(deviceenrollmentdeniallistdao2, deviceenrollmentdeniallistdao1);
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
            DeviceEnrollmentDenialListDao deviceenrollmentdeniallistdao1 = new DeviceEnrollmentDenialListDao();
            DeviceEnrollmentDenialListDao deviceenrollmentdeniallistdao2 = new DeviceEnrollmentDenialListDao();
            assertNotNull(deviceenrollmentdeniallistdao1);
            assertNotNull(deviceenrollmentdeniallistdao2);
            assertNotSame(deviceenrollmentdeniallistdao2, deviceenrollmentdeniallistdao1);
            assertEquals(deviceenrollmentdeniallistdao2, deviceenrollmentdeniallistdao1);
            assertEquals(deviceenrollmentdeniallistdao2.hashCode(), deviceenrollmentdeniallistdao1.hashCode());
            int hashCode = deviceenrollmentdeniallistdao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentdeniallistdao1.hashCode());
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
            DeviceEnrollmentDenialListDao deviceenrollmentdeniallistdao1 = new DeviceEnrollmentDenialListDao();
            DeviceEnrollmentDenialListDao deviceenrollmentdeniallistdao2 = new DeviceEnrollmentDenialListDao();
            assertNotNull(deviceenrollmentdeniallistdao1);
            assertNotNull(deviceenrollmentdeniallistdao2);
            assertNotSame(deviceenrollmentdeniallistdao2, deviceenrollmentdeniallistdao1);
            assertEquals(deviceenrollmentdeniallistdao2, deviceenrollmentdeniallistdao1);
            assertEquals(deviceenrollmentdeniallistdao2, deviceenrollmentdeniallistdao1);
            assertEquals(deviceenrollmentdeniallistdao1, deviceenrollmentdeniallistdao2);
            assertEquals(deviceenrollmentdeniallistdao1, deviceenrollmentdeniallistdao1);
            assertFalse(deviceenrollmentdeniallistdao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
