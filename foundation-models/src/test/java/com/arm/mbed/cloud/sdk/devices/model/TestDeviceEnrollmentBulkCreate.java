// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkCreate.
 */
public class TestDeviceEnrollmentBulkCreate {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("d035f149-3d65-41db-8d6c-28ad46e374a9",
                                                                                                new java.util.Date(1546013404790L),
                                                                                                new java.util.Date(1546013400381L),
                                                                                                -89,
                                                                                                "b111faba-f045-486f-93bd-a228cbdfe7da",
                                                                                                "89932fe4-f2ea-4f92-8c36-db50aafbc175",
                                                                                                "FV9Kz1mIC0vQ6tW4RG2ymPAu4JSQnq6P",
                                                                                                21,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                5);
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = deviceenrollmentbulkcreate1.clone();
        assertNotNull(deviceenrollmentbulkcreate1);
        assertNotNull(deviceenrollmentbulkcreate2);
        assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate = new DeviceEnrollmentBulkCreate("af19d995-f07b-4cd3-b233-aa92101b2ccc",
                                                                                               new java.util.Date(1546013409352L),
                                                                                               new java.util.Date(1546013400297L),
                                                                                               -105,
                                                                                               "b8d7c2b1-0fe0-46f3-9f69-b07995cb590b",
                                                                                               "d00befd9-dc31-4ad4-acce-1bb4b395d6c1",
                                                                                               "MtFmlPr3q9qRk647Zx7FQi2690zt0mcK",
                                                                                               58,
                                                                                               com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                               -32);
        assertTrue(deviceenrollmentbulkcreate.isValid());
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreateInvalid = new DeviceEnrollmentBulkCreate("c63ceba2-f926-470a-a6bb-4b7ec25945eb",
                                                                                                      new java.util.Date(1546013407810L),
                                                                                                      new java.util.Date(1546013399830L),
                                                                                                      -105,
                                                                                                      "3058f278-6bc8-4adb-91f8-365d6c8eabff",
                                                                                                      "d3733422-0201-4c3d-87d1-318a08df2f3c",
                                                                                                      "IMeW[fwof5mw55P.T5m5fLᕺDa_OmODe?TFQ^V+mOmv5WPH:55PV5THf詄:Lrm1乖",
                                                                                                      91,
                                                                                                      com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                      -5);
        assertFalse(deviceenrollmentbulkcreateInvalid.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("55d719d7-5321-4ea3-8c63-ee30438d50d3",
                                                                                                new java.util.Date(1546013406627L),
                                                                                                new java.util.Date(1546013405605L),
                                                                                                -46,
                                                                                                "09a1416f-91ec-4cb1-8213-f62f32556869",
                                                                                                "ea036d89-3dc3-415f-887a-838ebe8e604c",
                                                                                                "G1Qg7uFM071F2P4cy03MAmFbT2aH2p56",
                                                                                                48,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                -64);
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("55d719d7-5321-4ea3-8c63-ee30438d50d3",
                                                                                                new java.util.Date(1546013406627L),
                                                                                                new java.util.Date(1546013405605L),
                                                                                                -46,
                                                                                                "09a1416f-91ec-4cb1-8213-f62f32556869",
                                                                                                "ea036d89-3dc3-415f-887a-838ebe8e604c",
                                                                                                "G1Qg7uFM071F2P4cy03MAmFbT2aH2p56",
                                                                                                48,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                -64);
        assertNotNull(deviceenrollmentbulkcreate1);
        assertNotNull(deviceenrollmentbulkcreate2);
        assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate2.hashCode(), deviceenrollmentbulkcreate1.hashCode());
        int hashCode = deviceenrollmentbulkcreate1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, deviceenrollmentbulkcreate1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("bf43f73f-59c1-429f-b716-1694534da26b",
                                                                                                new java.util.Date(1546013406103L),
                                                                                                new java.util.Date(1546013408590L),
                                                                                                -123,
                                                                                                "cecd6192-ab16-411b-b690-a315dbd05cb1",
                                                                                                "c484cddb-46f9-4f88-8d6d-017dad2808df",
                                                                                                "b2Fkn3sfA08WLK0A7Qh8Ps5AOnmC8rv9",
                                                                                                52,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                56);
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("bf43f73f-59c1-429f-b716-1694534da26b",
                                                                                                new java.util.Date(1546013406103L),
                                                                                                new java.util.Date(1546013408590L),
                                                                                                -123,
                                                                                                "cecd6192-ab16-411b-b690-a315dbd05cb1",
                                                                                                "c484cddb-46f9-4f88-8d6d-017dad2808df",
                                                                                                "b2Fkn3sfA08WLK0A7Qh8Ps5AOnmC8rv9",
                                                                                                52,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                56);
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate3 = new DeviceEnrollmentBulkCreate("52408b02-2243-46fd-aa77-29081d2b011c",
                                                                                                new java.util.Date(1546013409209L),
                                                                                                new java.util.Date(1546013409234L),
                                                                                                69,
                                                                                                "dee3640f-2559-431e-ae7c-e559229fcbd5",
                                                                                                "2142970f-e024-49a4-8288-00c5609cdc0e",
                                                                                                "g3zd9Y2T9Y78kw102ClSpqv5Hvd44Ip5",
                                                                                                86,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                -114);
        assertNotNull(deviceenrollmentbulkcreate1);
        assertNotNull(deviceenrollmentbulkcreate2);
        assertNotNull(deviceenrollmentbulkcreate3);
        assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertNotSame(deviceenrollmentbulkcreate3, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate1, deviceenrollmentbulkcreate2);
        assertEquals(deviceenrollmentbulkcreate1, deviceenrollmentbulkcreate1);
        assertFalse(deviceenrollmentbulkcreate1.equals(null));
        assertNotEquals(deviceenrollmentbulkcreate3, deviceenrollmentbulkcreate1);
    }
}
