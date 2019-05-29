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
            DeviceEvents deviceevents1 = new DeviceEvents(null, new Date(1559143720898L), null,
                                                          new Date(1559143713104L),
                                                          "bce681d6-df18-4dff-b13c-f413d4c4d87e",
                                                          "b399a6cd-8407-4241-9d2e-7a08c67bdbd9",
                                                          "d31a0935-e158-4580-9afc-c619b1881656",
                                                          "20f7659a-3448-4840-8764-f08cedfe1da4",
                                                          "c6dacfac-5c25-4662-abb3-d7b65fc90b41",
                                                          "4003c09d-ce43-47c1-b2ca-b35a616a2322", false);
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
            DeviceEvents deviceevents1 = new DeviceEvents(null, new Date(1559143712452L), null,
                                                          new Date(1559143714269L),
                                                          "33a5d3b8-5a7b-4d6d-989e-1b4b96b09bbf",
                                                          "88debe44-dfc6-4f10-99b8-cf8c1dfd1c0c",
                                                          "ebc17cf3-6ccd-4347-804b-be93d7d1f53d",
                                                          "f5d0e4ab-fe97-4feb-8901-57462159dde3",
                                                          "c355d3d0-93a3-465e-ad97-e56e4c578961",
                                                          "c5a7b0b0-63f1-40f3-9cb5-83b4c281e8c9", false);
            DeviceEvents deviceevents2 = new DeviceEvents(null, new Date(1559143712452L), null,
                                                          new Date(1559143714269L),
                                                          "33a5d3b8-5a7b-4d6d-989e-1b4b96b09bbf",
                                                          "88debe44-dfc6-4f10-99b8-cf8c1dfd1c0c",
                                                          "ebc17cf3-6ccd-4347-804b-be93d7d1f53d",
                                                          "f5d0e4ab-fe97-4feb-8901-57462159dde3",
                                                          "c355d3d0-93a3-465e-ad97-e56e4c578961",
                                                          "c5a7b0b0-63f1-40f3-9cb5-83b4c281e8c9", false);
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
        DeviceEvents deviceevents = new DeviceEvents(null, new Date(1559143714387L), null, new Date(1559143713259L),
                                                     "1866b0e3-ecba-4c9f-9858-b555625d414c",
                                                     "51bb6d10-7b2d-4612-bee0-acc2e232d982",
                                                     "2ea81757-1abf-402c-ac2e-6b53474d2f41",
                                                     "54b83f92-f6b2-4fb4-9971-f712bdf4c793",
                                                     "48ec1aa5-8738-405e-ac2d-0231390a7fcd",
                                                     "982c01ba-90c4-4ab5-8117-86f95a66dddd", true);
        assertTrue(deviceevents.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEvents deviceevents1 = new DeviceEvents(null, new Date(1559143713362L), null,
                                                          new Date(1559143713629L),
                                                          "739ac28e-f179-4822-ba7c-aa8048da6c17",
                                                          "e0ef07cc-226e-46af-b1ea-d99522648852",
                                                          "b0eea1a4-fc7b-4178-9b80-fc661c2a9996",
                                                          "5abb0978-b266-4c8e-b6fd-7c561ff8fa88",
                                                          "b704ac50-04e9-4e29-b63e-bbcc8d12f892",
                                                          "9c2ceb61-eec5-4ff0-a71a-33f44d96dc9b", false);
            DeviceEvents deviceevents2 = new DeviceEvents(null, new Date(1559143713362L), null,
                                                          new Date(1559143713629L),
                                                          "739ac28e-f179-4822-ba7c-aa8048da6c17",
                                                          "e0ef07cc-226e-46af-b1ea-d99522648852",
                                                          "b0eea1a4-fc7b-4178-9b80-fc661c2a9996",
                                                          "5abb0978-b266-4c8e-b6fd-7c561ff8fa88",
                                                          "b704ac50-04e9-4e29-b63e-bbcc8d12f892",
                                                          "9c2ceb61-eec5-4ff0-a71a-33f44d96dc9b", false);
            DeviceEvents deviceevents3 = new DeviceEvents(null, new Date(1559143718355L), null,
                                                          new Date(1559143721777L),
                                                          "654a8f9e-6475-417f-b038-56c1448d9cd6",
                                                          "9d0a06d3-b2dc-4e2a-942d-e230cb2ed1d6",
                                                          "384fa830-33db-44c8-ad89-1cd5e51e9e3f",
                                                          "c3f7241f-c904-41be-a780-e8a01af7dc18",
                                                          "68e03a5e-1791-4c02-aabd-4dfa9c8e9eaa",
                                                          "5f6cc2cf-480e-47b0-9acd-4b7e9115b7ce", false);
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
