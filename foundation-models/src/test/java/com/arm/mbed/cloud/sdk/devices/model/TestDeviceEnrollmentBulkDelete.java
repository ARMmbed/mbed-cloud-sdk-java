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
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("72333d5d-5704-4ac5-a15b-8add7e6ef474",
                                                                                                    new Date(1559288259664L),
                                                                                                    new Date(1559288253767L),
                                                                                                    -119,
                                                                                                    "50b31689-ec14-4b0c-b970-79b0c6728d9a",
                                                                                                    "7f70974f-e484-4f84-ac59-6f960854ac66",
                                                                                                    "Won0ttaPbMMAzvYDW26jR6jh0HuhKw2E",
                                                                                                    -30,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    59);
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
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("2f86b158-ada4-4b50-acf2-5bf6f1adfe35",
                                                                                                    new Date(1559288260835L),
                                                                                                    new Date(1559288263011L),
                                                                                                    -5,
                                                                                                    "51df1efa-99bc-4a23-9f3b-345f8f1b51f4",
                                                                                                    "0cbd1d09-7f38-44f1-baf9-810fb414e4bb",
                                                                                                    "Won0ttaPbMMAzvYDW26jR6jh0HuhKw2E",
                                                                                                    -58,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    -50);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = new DeviceEnrollmentBulkDelete("2f86b158-ada4-4b50-acf2-5bf6f1adfe35",
                                                                                                    new Date(1559288260835L),
                                                                                                    new Date(1559288263011L),
                                                                                                    -5,
                                                                                                    "51df1efa-99bc-4a23-9f3b-345f8f1b51f4",
                                                                                                    "0cbd1d09-7f38-44f1-baf9-810fb414e4bb",
                                                                                                    "Won0ttaPbMMAzvYDW26jR6jh0HuhKw2E",
                                                                                                    -58,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    -50);
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
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete = new DeviceEnrollmentBulkDelete("c30864e6-2c92-433a-a7b1-10d31476ff50",
                                                                                               new Date(1559288261209L),
                                                                                               new Date(1559288262428L),
                                                                                               -40,
                                                                                               "d8b7442c-9eae-4023-a89c-7cf40c24c625",
                                                                                               "6189e23f-5c16-40d9-8c36-6c2674dd2ea4",
                                                                                               "Won0ttaPbMMAzvYDW26jR6jh0HuhKw2E",
                                                                                               -33,
                                                                                               DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                               -116);
        assertTrue(deviceenrollmentbulkdelete.isValid());
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdeleteInvalid = new DeviceEnrollmentBulkDelete("5defc03b-abc9-43bf-be3e-2321abef8fb1",
                                                                                                      new Date(1559288261663L),
                                                                                                      new Date(1559288257017L),
                                                                                                      -36,
                                                                                                      "4912f6a7-9747-4bb3-8654-63590d77091b",
                                                                                                      "57525447-bc1d-4eec-a861-8e9af1736ab8",
                                                                                                      "QXU4QSx1;m^rkQl?`i13\u0017FL@Q1xU=BG4?JXFI_F%LkL]m>Qxil\u0010yL>LBq\\\\yJ斥1iS",
                                                                                                      -72,
                                                                                                      DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                      23);
        assertFalse(deviceenrollmentbulkdeleteInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("37bbe7e8-40f0-40bc-912d-043f46b1aae3",
                                                                                                    new Date(1559288255641L),
                                                                                                    new Date(1559288261473L),
                                                                                                    85,
                                                                                                    "877de1b4-50a0-48a1-8db5-61cc1bd1d82e",
                                                                                                    "6376adc2-556b-4c60-bcce-0cea970d389b",
                                                                                                    "Won0ttaPbMMAzvYDW26jR6jh0HuhKw2E",
                                                                                                    -116,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    101);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = new DeviceEnrollmentBulkDelete("37bbe7e8-40f0-40bc-912d-043f46b1aae3",
                                                                                                    new Date(1559288255641L),
                                                                                                    new Date(1559288261473L),
                                                                                                    85,
                                                                                                    "877de1b4-50a0-48a1-8db5-61cc1bd1d82e",
                                                                                                    "6376adc2-556b-4c60-bcce-0cea970d389b",
                                                                                                    "Won0ttaPbMMAzvYDW26jR6jh0HuhKw2E",
                                                                                                    -116,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    101);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete3 = new DeviceEnrollmentBulkDelete("4564840c-7aa8-4010-9e49-6e974437edca",
                                                                                                    new Date(1559288256089L),
                                                                                                    new Date(1559288255814L),
                                                                                                    -66,
                                                                                                    "74193e1b-90e9-4acb-983c-a45a0ad864a0",
                                                                                                    "058f932f-86e4-4e2d-a2d9-996bf0f6ccd1",
                                                                                                    "Won0ttaPbMMAzvYDW26jR6jh0HuhKw2E",
                                                                                                    -67,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    -87);
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
