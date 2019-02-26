// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkDelete.
 */
public class TestDeviceEnrollmentBulkDelete {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("e2adbfa0-9ea7-46cc-b40d-d600ed00784b",
                                                                                                    new Date(1548165440218L),
                                                                                                    new Date(1548165440448L),
                                                                                                    122,
                                                                                                    "312e2961-9d33-45ca-b21d-161aba60f9b9",
                                                                                                    "a52f8054-b722-4acc-8c11-d3eda4e5ebf5",
                                                                                                    "PGAb0DutINw777R0YXH1V2qcy0O42AeJ",
                                                                                                    -1,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    108);
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
    @Test
    public void testHashCode() {
        try {
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("f40a487d-2965-4f5f-a16a-74a7c8d949fe",
                                                                                                    new Date(1548165446137L),
                                                                                                    new Date(1548165441558L),
                                                                                                    -21,
                                                                                                    "abbd4f8c-473d-4b39-a9ea-745b71751c8f",
                                                                                                    "3db03774-c764-4153-b735-1f92419204b2",
                                                                                                    "6I0oGoB4w48ENauXKNOivUjTVKfGQz93",
                                                                                                    100,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    -109);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = new DeviceEnrollmentBulkDelete("f40a487d-2965-4f5f-a16a-74a7c8d949fe",
                                                                                                    new Date(1548165446137L),
                                                                                                    new Date(1548165441558L),
                                                                                                    -21,
                                                                                                    "abbd4f8c-473d-4b39-a9ea-745b71751c8f",
                                                                                                    "3db03774-c764-4153-b735-1f92419204b2",
                                                                                                    "6I0oGoB4w48ENauXKNOivUjTVKfGQz93",
                                                                                                    100,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    -109);
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
    @Test
    public void testIsValid() {
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete = new DeviceEnrollmentBulkDelete("b3c20c80-15c3-41bf-a2e1-df1ddf3171dd",
                                                                                               new Date(1548165442438L),
                                                                                               new Date(1548165447022L),
                                                                                               114,
                                                                                               "5ecfb459-5874-4222-854c-114aceec86e3",
                                                                                               "cf3aaed0-846c-4066-8598-09a848320fcc",
                                                                                               "1ZHw5b22hGf4GD6l3C7j4rh1S4mUE3EL",
                                                                                               -29,
                                                                                               DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                               109);
        assertTrue(deviceenrollmentbulkdelete.isValid());
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdeleteInvalid = new DeviceEnrollmentBulkDelete("0e948ebe-6615-4c14-98b8-b1ef75dfe07f",
                                                                                                      new Date(1548165445210L),
                                                                                                      new Date(1548165448176L),
                                                                                                      70,
                                                                                                      "dfc17e26-e351-410b-a3ea-6e5973869c01",
                                                                                                      "b182b807-769a-4276-8f71-3b4849a54ad9",
                                                                                                      "3NsY3:SG^⻛w\u0015)\u0002་6^RC擣C)MKdlww-Ds\\\\sHC]�?�6wn-kCqAd`n\u0012UsYT@\\\\4>6viM6G",
                                                                                                      -89,
                                                                                                      DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                      -97);
        assertFalse(deviceenrollmentbulkdeleteInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("1aa31dc7-2727-4746-9492-4d590ad8c71d",
                                                                                                    new Date(1548165439372L),
                                                                                                    new Date(1548165443114L),
                                                                                                    -75,
                                                                                                    "b82f1955-fe83-49dc-9cf9-31a217b57301",
                                                                                                    "649d1736-1ef7-444d-9f86-034b583c0308",
                                                                                                    "P2F91AO4GWTjJ72vC0RNTz540UrvS984",
                                                                                                    -111,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    88);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = new DeviceEnrollmentBulkDelete("1aa31dc7-2727-4746-9492-4d590ad8c71d",
                                                                                                    new Date(1548165439372L),
                                                                                                    new Date(1548165443114L),
                                                                                                    -75,
                                                                                                    "b82f1955-fe83-49dc-9cf9-31a217b57301",
                                                                                                    "649d1736-1ef7-444d-9f86-034b583c0308",
                                                                                                    "P2F91AO4GWTjJ72vC0RNTz540UrvS984",
                                                                                                    -111,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    88);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete3 = new DeviceEnrollmentBulkDelete("fccb56db-3df9-47d1-8033-3ad530073a6a",
                                                                                                    new Date(1548165443768L),
                                                                                                    new Date(1548165447876L),
                                                                                                    -71,
                                                                                                    "c0a32b7d-ed6e-4b41-ab80-d40b5c9cb341",
                                                                                                    "a222c370-0b11-4231-8848-b854aa1bd3b0",
                                                                                                    "u28iiVf40RL80SxS8Na8v4GQPyF9p5D3",
                                                                                                    -46,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    77);
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