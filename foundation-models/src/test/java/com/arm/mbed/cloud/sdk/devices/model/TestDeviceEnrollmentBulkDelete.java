// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkDelete.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentBulkDelete {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("485f8980-7aa6-4f12-bc3d-405a230ff192",
                                                                                                    new Date(1571831494030L),
                                                                                                    new Date(1571831494934L),
                                                                                                    -23,
                                                                                                    "6033072f-1aa5-4de8-a581-a39bf33c2c82",
                                                                                                    "4795a0fb-c99f-4427-b84d-621132a28bfd",
                                                                                                    "la6PidTT34308MHYcSskON13zL4rxyaS",
                                                                                                    20,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    7);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = deviceenrollmentbulkdelete1.clone();
            assertNotNull(deviceenrollmentbulkdelete1);
            assertNotNull(deviceenrollmentbulkdelete2);
            assertNotSame(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
            assertEquals(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
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
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("f283d538-44c3-4faa-a517-623a9ab7ea0b",
                                                                                                    new Date(1571831495752L),
                                                                                                    new Date(1571831487485L),
                                                                                                    20,
                                                                                                    "0c3f4117-ec91-44b8-9a21-8dc6f919f42b",
                                                                                                    "523762d3-d13b-4c4a-bad0-b350f33347ec",
                                                                                                    "la6PidTT34308MHYcSskON13zL4rxyaS",
                                                                                                    -43,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    79);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = new DeviceEnrollmentBulkDelete("f283d538-44c3-4faa-a517-623a9ab7ea0b",
                                                                                                    new Date(1571831495752L),
                                                                                                    new Date(1571831487485L),
                                                                                                    20,
                                                                                                    "0c3f4117-ec91-44b8-9a21-8dc6f919f42b",
                                                                                                    "523762d3-d13b-4c4a-bad0-b350f33347ec",
                                                                                                    "la6PidTT34308MHYcSskON13zL4rxyaS",
                                                                                                    -43,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    79);
            assertNotNull(deviceenrollmentbulkdelete1);
            assertNotNull(deviceenrollmentbulkdelete2);
            assertNotSame(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
            assertEquals(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
            assertEquals(deviceenrollmentbulkdelete2.hashCode(), deviceenrollmentbulkdelete1.hashCode());
            int hashCode = deviceenrollmentbulkdelete1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentbulkdelete1.hashCode());
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
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete = new DeviceEnrollmentBulkDelete("f206b661-1d9e-4516-940c-09856f23dc88",
                                                                                               new Date(1571831493693L),
                                                                                               new Date(1571831487645L),
                                                                                               51,
                                                                                               "16f326ce-ed8f-426d-9712-82c3ba8a8a08",
                                                                                               "84ce3a21-6d8c-4b67-94c0-c3e1009e6f79",
                                                                                               "la6PidTT34308MHYcSskON13zL4rxyaS",
                                                                                               -2,
                                                                                               DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                               -14);
        assertTrue(deviceenrollmentbulkdelete.isValid());
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdeleteInvalid = new DeviceEnrollmentBulkDelete("04561426-9117-435f-9761-30cef36e010c",
                                                                                                      new Date(1571831487996L),
                                                                                                      new Date(1571831492607L),
                                                                                                      -80,
                                                                                                      "add3b8e1-e9e9-499b-bcdc-0769a6017741",
                                                                                                      "a5fa6800-66c0-4f13-bec4-81f80af274e6",
                                                                                                      "苗`v72/XR2IfUj7\u0010o5pvt>QbI2KmQvvb\u000e5>Jhh77vb7\u0003UGQZwQ;X7bjqXQmEwWhB\u0017",
                                                                                                      -105,
                                                                                                      DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                      118);
        assertFalse(deviceenrollmentbulkdeleteInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("549d55a8-518b-401c-af30-52e0015aeb0b",
                                                                                                    new Date(1571831495523L),
                                                                                                    new Date(1571831492622L),
                                                                                                    44,
                                                                                                    "97fcc7e7-711a-435c-b786-1bd6fa2bc8a4",
                                                                                                    "18239c16-9075-456c-b047-23bbe02ca0d1",
                                                                                                    "la6PidTT34308MHYcSskON13zL4rxyaS",
                                                                                                    50,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    -35);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = new DeviceEnrollmentBulkDelete("549d55a8-518b-401c-af30-52e0015aeb0b",
                                                                                                    new Date(1571831495523L),
                                                                                                    new Date(1571831492622L),
                                                                                                    44,
                                                                                                    "97fcc7e7-711a-435c-b786-1bd6fa2bc8a4",
                                                                                                    "18239c16-9075-456c-b047-23bbe02ca0d1",
                                                                                                    "la6PidTT34308MHYcSskON13zL4rxyaS",
                                                                                                    50,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    -35);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete3 = new DeviceEnrollmentBulkDelete("3eaa279e-fc3e-4b72-8cd0-6380c9c02627",
                                                                                                    new Date(1571831487693L),
                                                                                                    new Date(1571831490934L),
                                                                                                    93,
                                                                                                    "005301e8-3fbb-42ed-98cd-b05bd16e65f5",
                                                                                                    "59234e1d-482a-40d4-a89f-da0d64fb9abd",
                                                                                                    "la6PidTT34308MHYcSskON13zL4rxyaS",
                                                                                                    -25,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    44);
            assertNotNull(deviceenrollmentbulkdelete1);
            assertNotNull(deviceenrollmentbulkdelete2);
            assertNotNull(deviceenrollmentbulkdelete3);
            assertNotSame(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
            assertNotSame(deviceenrollmentbulkdelete3, deviceenrollmentbulkdelete1);
            assertEquals(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
            assertEquals(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
            assertEquals(deviceenrollmentbulkdelete1, deviceenrollmentbulkdelete2);
            assertEquals(deviceenrollmentbulkdelete1, deviceenrollmentbulkdelete1);
            assertFalse(deviceenrollmentbulkdelete1.equals(null));
            assertNotEquals(deviceenrollmentbulkdelete3, deviceenrollmentbulkdelete1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
