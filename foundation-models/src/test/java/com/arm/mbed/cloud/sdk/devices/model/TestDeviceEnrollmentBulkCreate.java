// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkCreate.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentBulkCreate {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("d10275a8-4024-43c7-a2f4-d3d009b56f00",
                                                                                                    new Date(1553592032147L),
                                                                                                    new Date(1553592028307L),
                                                                                                    29,
                                                                                                    "ade2e0b0-def3-498b-934a-6f2e94428d64",
                                                                                                    "1aa20149-d81f-4e9a-a480-cab706dca676",
                                                                                                    "Ly01Mk3Jg1xJN76O5lhhKRxgP21j9O09",
                                                                                                    -118,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -106);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = deviceenrollmentbulkcreate1.clone();
            assertNotNull(deviceenrollmentbulkcreate1);
            assertNotNull(deviceenrollmentbulkcreate2);
            assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
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
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("b6977c67-63ad-4691-a8fb-5b23d4ef769d",
                                                                                                    new Date(1553592028094L),
                                                                                                    new Date(1553592025678L),
                                                                                                    104,
                                                                                                    "50f9e79d-f333-4d8c-9c5c-a920b356ba3e",
                                                                                                    "ccdef7bb-6768-4641-9dcd-851c9342c8d9",
                                                                                                    "8VtnwgJucSdpvrXiIAU5599O6ZNNja2R",
                                                                                                    -122,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -4);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("b6977c67-63ad-4691-a8fb-5b23d4ef769d",
                                                                                                    new Date(1553592028094L),
                                                                                                    new Date(1553592025678L),
                                                                                                    104,
                                                                                                    "50f9e79d-f333-4d8c-9c5c-a920b356ba3e",
                                                                                                    "ccdef7bb-6768-4641-9dcd-851c9342c8d9",
                                                                                                    "8VtnwgJucSdpvrXiIAU5599O6ZNNja2R",
                                                                                                    -122,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -4);
            assertNotNull(deviceenrollmentbulkcreate1);
            assertNotNull(deviceenrollmentbulkcreate2);
            assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2.hashCode(), deviceenrollmentbulkcreate1.hashCode());
            int hashCode = deviceenrollmentbulkcreate1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentbulkcreate1.hashCode());
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
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate = new DeviceEnrollmentBulkCreate("ae9e7911-ba13-4142-a43f-dff5a01f8696",
                                                                                               new Date(1553592031021L),
                                                                                               new Date(1553592030034L),
                                                                                               -17,
                                                                                               "7e8d866e-71f5-4779-bd59-7b6dfe67d82d",
                                                                                               "d56796b4-1f42-4ef6-9741-03a50ec9bccd",
                                                                                               "GmyucCiGuFqxAE1QLSn37Kzi21Z97nDL",
                                                                                               84,
                                                                                               DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                               -53);
        assertTrue(deviceenrollmentbulkcreate.isValid());
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreateInvalid = new DeviceEnrollmentBulkCreate("607cda03-6354-46ed-9d97-96d4ef3a9875",
                                                                                                      new Date(1553592031737L),
                                                                                                      new Date(1553592029635L),
                                                                                                      105,
                                                                                                      "61ee249e-1624-4c3e-a767-d5aca00688b3",
                                                                                                      "b2183f73-68e7-479a-8cdd-5f159f14108b",
                                                                                                      "m2=4_nFIEjWmLh㑖Rh2\u0011Z4\u0005RW77W4\u0003TPevuWT-Lu i7vv7Amru=_ﰚW4LI=懠74vsrL",
                                                                                                      19,
                                                                                                      DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                      60);
        assertFalse(deviceenrollmentbulkcreateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("8390a453-ddeb-4024-ab98-7960e4554a6a",
                                                                                                    new Date(1553592025987L),
                                                                                                    new Date(1553592028182L),
                                                                                                    19,
                                                                                                    "3bb34ee8-c9ca-4a92-a860-0c9235c29264",
                                                                                                    "f91e05c6-f9f3-46c8-bb11-8f7d07d09c7d",
                                                                                                    "rL0uVMDV947ArNjWOi4G0t9D01YVwlQP",
                                                                                                    -52,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    73);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("8390a453-ddeb-4024-ab98-7960e4554a6a",
                                                                                                    new Date(1553592025987L),
                                                                                                    new Date(1553592028182L),
                                                                                                    19,
                                                                                                    "3bb34ee8-c9ca-4a92-a860-0c9235c29264",
                                                                                                    "f91e05c6-f9f3-46c8-bb11-8f7d07d09c7d",
                                                                                                    "rL0uVMDV947ArNjWOi4G0t9D01YVwlQP",
                                                                                                    -52,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    73);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate3 = new DeviceEnrollmentBulkCreate("3fb20886-2200-4802-9f20-5587d71e8470",
                                                                                                    new Date(1553592029144L),
                                                                                                    new Date(1553592022613L),
                                                                                                    41,
                                                                                                    "c1329f2e-6c7d-4985-bc4a-0ab3f9fedcd2",
                                                                                                    "ecde55f4-a272-4121-ad28-e97455f8eea8",
                                                                                                    "6LIBN5pyfah307gOrt9A4cr1Gt2PWc6r",
                                                                                                    81,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    77);
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
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
