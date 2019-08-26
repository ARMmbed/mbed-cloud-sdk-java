// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentDenial.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentDenial {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        new Date(1566811760487L),
                                                                                        "44994863-cd1b-4013-9cc2-4f1a989df773",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = deviceenrollmentdenial1.clone();
            assertNotNull(deviceenrollmentdenial1);
            assertNotNull(deviceenrollmentdenial2);
            assertNotSame(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
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
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        new Date(1566811757890L),
                                                                                        "e545ea79-a544-4c06-8840-c637157f06f8",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = new DeviceEnrollmentDenial("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        new Date(1566811757890L),
                                                                                        "e545ea79-a544-4c06-8840-c637157f06f8",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42");
            assertNotNull(deviceenrollmentdenial1);
            assertNotNull(deviceenrollmentdenial2);
            assertNotSame(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2.hashCode(), deviceenrollmentdenial1.hashCode());
            int hashCode = deviceenrollmentdenial1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentdenial1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        DeviceEnrollmentDenial deviceenrollmentdenial = new DeviceEnrollmentDenial("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                   new Date(1566811767556L),
                                                                                   "08f4a0f7-44ca-46b0-b3ab-8c97ec4706bd",
                                                                                   "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                   "0f0fddcbb77d22b2ab801eb65dfbca42");
        assertTrue(deviceenrollmentdenial.isValid());
        DeviceEnrollmentDenial deviceenrollmentdenialInvalid = new DeviceEnrollmentDenial("*馠\u0013+\u00123P�?�3䃹\u0017M3Q3□(\t3\u0012:夬\u001e^3D駛�?<姾\u000fͼ僻3333?3;I淑3[懯F哔Sꉈ\u0012\u00153ߌ!㲹\u00133\u00163婱3唵鑢",
                                                                                          new Date(1566811761580L),
                                                                                          "1dd6c031-55a7-41fc-b977-add6b2ff0701",
                                                                                          "*馠\u0013+\u00123P�?�3䃹\u0017M3Q3□(\t3\u0012:夬\u001e^3D駛�?<姾\u000fͼ僻3333?3;I淑3[懯F哔Sꉈ\u0012\u00153ߌ!㲹\u00133\u00163婱3唵鑢",
                                                                                          "*馠\u0013+\u00123P�?�3䃹\u0017M3Q3□(\t3\u0012:夬\u001e^3D駛�?<姾\u000fͼ僻3333?3;I淑3[懯F哔Sꉈ\u0012\u00153ߌ!㲹\u00133\u00163婱3唵鑢");
        assertFalse(deviceenrollmentdenialInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        new Date(1566811759976L),
                                                                                        "740e2a99-2d71-4827-b5d7-c60192e84274",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = new DeviceEnrollmentDenial("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        new Date(1566811759976L),
                                                                                        "740e2a99-2d71-4827-b5d7-c60192e84274",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42");
            DeviceEnrollmentDenial deviceenrollmentdenial3 = new DeviceEnrollmentDenial("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        new Date(1566811764227L),
                                                                                        "5fe9127a-36f0-4c14-8ede-ee04aa17c610",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                        "0f0fddcbb77d22b2ab801eb65dfbca42");
            assertNotNull(deviceenrollmentdenial1);
            assertNotNull(deviceenrollmentdenial2);
            assertNotNull(deviceenrollmentdenial3);
            assertNotSame(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertNotSame(deviceenrollmentdenial3, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial1, deviceenrollmentdenial2);
            assertEquals(deviceenrollmentdenial1, deviceenrollmentdenial1);
            assertFalse(deviceenrollmentdenial1.equals(null));
            assertNotEquals(deviceenrollmentdenial3, deviceenrollmentdenial1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
