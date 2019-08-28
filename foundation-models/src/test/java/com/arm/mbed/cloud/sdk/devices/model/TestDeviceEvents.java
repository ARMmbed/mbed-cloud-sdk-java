// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEvents.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEvents {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEvents deviceevents1 = new DeviceEvents(null, new Date(1566995742144L), null,
                                                          new Date(1566995745398L),
                                                          "b6804b4d-c3e7-4747-80a8-b753a8906e69",
                                                          "80505333-c108-44bb-a4e2-60684ec1c4d5",
                                                          "10ef2d5a-e51b-4b94-ae56-f62e28f3878b",
                                                          "827d8e55-2121-4265-871b-12b54423f2d8",
                                                          "4693b88f-7c49-4db0-84a9-33427c670cd0",
                                                          "72c87440-52c2-4b4c-be75-207d8c84d574", true);
            DeviceEvents deviceevents2 = deviceevents1.clone();
            assertNotNull(deviceevents1);
            assertNotNull(deviceevents2);
            assertNotSame(deviceevents2, deviceevents1);
            assertEquals(deviceevents2, deviceevents1);
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
            DeviceEvents deviceevents1 = new DeviceEvents(null, new Date(1566995746212L), null,
                                                          new Date(1566995746848L),
                                                          "9e2323a6-11df-4218-8e44-fc821b64aeaf",
                                                          "e834dd07-57c5-4ef3-977e-ebe9f0bfeab9",
                                                          "54d26bd7-fa7d-44ad-8ef6-528d58e98b0d",
                                                          "740f3ca1-cf59-4e78-a8f6-c78e4f976174",
                                                          "21298e14-a649-4472-9826-f99445606482",
                                                          "d0dad0c6-1096-4258-a3e2-935f2e49831f", false);
            DeviceEvents deviceevents2 = new DeviceEvents(null, new Date(1566995746212L), null,
                                                          new Date(1566995746848L),
                                                          "9e2323a6-11df-4218-8e44-fc821b64aeaf",
                                                          "e834dd07-57c5-4ef3-977e-ebe9f0bfeab9",
                                                          "54d26bd7-fa7d-44ad-8ef6-528d58e98b0d",
                                                          "740f3ca1-cf59-4e78-a8f6-c78e4f976174",
                                                          "21298e14-a649-4472-9826-f99445606482",
                                                          "d0dad0c6-1096-4258-a3e2-935f2e49831f", false);
            assertNotNull(deviceevents1);
            assertNotNull(deviceevents2);
            assertNotSame(deviceevents2, deviceevents1);
            assertEquals(deviceevents2, deviceevents1);
            assertEquals(deviceevents2.hashCode(), deviceevents1.hashCode());
            int hashCode = deviceevents1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceevents1.hashCode());
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
        DeviceEvents deviceevents = new DeviceEvents(null, new Date(1566995743855L), null, new Date(1566995748717L),
                                                     "c2961b9c-7eea-4ddf-b625-717cce95adb3",
                                                     "1e60a881-399a-47f2-b3fa-22bef85a9beb",
                                                     "3b168337-19bc-469e-9740-a169bfddf033",
                                                     "9f6eff2f-7e6f-4a5c-9ea0-c31d3e791aee",
                                                     "664d61c0-acab-417b-8894-421ce8a35268",
                                                     "f1ae2871-f8ee-4e65-bff5-02b2d69766e5", true);
        assertTrue(deviceevents.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEvents deviceevents1 = new DeviceEvents(null, new Date(1566995741189L), null,
                                                          new Date(1566995743590L),
                                                          "66f35526-5942-4cfa-be53-3288bede6c17",
                                                          "7daffcab-f3e0-4987-958f-18c1824e2527",
                                                          "62aff703-12dd-4892-a447-883fdccdcb34",
                                                          "93922bce-632e-44a3-8578-0f37049cc827",
                                                          "1d548253-8330-44e4-b3bf-f9d66cf0c1e8",
                                                          "b66da580-3b72-4d82-a17a-78c529bd4571", false);
            DeviceEvents deviceevents2 = new DeviceEvents(null, new Date(1566995741189L), null,
                                                          new Date(1566995743590L),
                                                          "66f35526-5942-4cfa-be53-3288bede6c17",
                                                          "7daffcab-f3e0-4987-958f-18c1824e2527",
                                                          "62aff703-12dd-4892-a447-883fdccdcb34",
                                                          "93922bce-632e-44a3-8578-0f37049cc827",
                                                          "1d548253-8330-44e4-b3bf-f9d66cf0c1e8",
                                                          "b66da580-3b72-4d82-a17a-78c529bd4571", false);
            DeviceEvents deviceevents3 = new DeviceEvents(null, new Date(1566995749254L), null,
                                                          new Date(1566995749144L),
                                                          "49f82987-1471-4e12-a147-9e3a256b5518",
                                                          "c68b573f-f301-4bce-a606-c773b3cc24b5",
                                                          "718a81e9-5290-4b4a-959d-8575cdff7345",
                                                          "813b351e-1d21-4bd7-9903-d20fef846f2e",
                                                          "36baf844-57a3-4f7e-a6b5-c66d84d4299c",
                                                          "d1589ed6-5be9-46c2-a70b-ea7609e1c91f", false);
            assertNotNull(deviceevents1);
            assertNotNull(deviceevents2);
            assertNotNull(deviceevents3);
            assertNotSame(deviceevents2, deviceevents1);
            assertNotSame(deviceevents3, deviceevents1);
            assertEquals(deviceevents2, deviceevents1);
            assertEquals(deviceevents2, deviceevents1);
            assertEquals(deviceevents1, deviceevents2);
            assertEquals(deviceevents1, deviceevents1);
            assertFalse(deviceevents1.equals(null));
            assertNotEquals(deviceevents3, deviceevents1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
