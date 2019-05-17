// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollment.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollment {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("fe56b714-f14f-4974-bee2-51bbf141245d",
                                                                      new Date(1558096041902L),
                                                                      new Date(1558096041373L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po",
                                                                      "A-HgjRPTF31CengUt4F2pRlf5xQmU5q8KxWIBn87e753U7BKg0Fr3c1613HshlF3alfp1vBL7KtqD:sKryJVwZ7pa2R1y9w5p",
                                                                      new Date(1558096042900L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po");
            DeviceEnrollment deviceenrollment2 = deviceenrollment1.clone();
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
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
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("2e1a9ef6-5574-4c98-888c-3bf742953793",
                                                                      new Date(1558096040379L),
                                                                      new Date(1558096039962L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po",
                                                                      "A-HgjRPTF31CengUt4F2pRlf5xQmU5q8KxWIBn87e753U7BKg0Fr3c1613HshlF3alfp1vBL7KtqD:sKryJVwZ7pa2R1y9w5p",
                                                                      new Date(1558096040944L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("2e1a9ef6-5574-4c98-888c-3bf742953793",
                                                                      new Date(1558096040379L),
                                                                      new Date(1558096039962L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po",
                                                                      "A-HgjRPTF31CengUt4F2pRlf5xQmU5q8KxWIBn87e753U7BKg0Fr3c1613HshlF3alfp1vBL7KtqD:sKryJVwZ7pa2R1y9w5p",
                                                                      new Date(1558096040944L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po");
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2.hashCode(), deviceenrollment1.hashCode());
            int hashCode = deviceenrollment1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollment1.hashCode());
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
        DeviceEnrollment deviceenrollment = new DeviceEnrollment("9b611e5e-0606-4895-b35f-01f86a07ab96",
                                                                 new Date(1558096039960L), new Date(1558096035594L),
                                                                 "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po",
                                                                 "A-HgjRPTF31CengUt4F2pRlf5xQmU5q8KxWIBn87e753U7BKg0Fr3c1613HshlF3alfp1vBL7KtqD:sKryJVwZ7pa2R1y9w5p",
                                                                 new Date(1558096043840L),
                                                                 "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po");
        assertTrue(deviceenrollment.isValid());
        DeviceEnrollment deviceenrollmentInvalid = new DeviceEnrollment("130a2b65-44bf-4859-bfd3-815b5cb58793",
                                                                        new Date(1558096037044L),
                                                                        new Date(1558096041178L),
                                                                        "6B1Mnqg\u00126G[�?�GJCQݙV+SZYqdqJOk^6Gftq@a_q6JJ?\u00076RR[R6WJ6Oq63OqRJ\u001akR?",
                                                                        null, new Date(1558096038836L),
                                                                        "6B1Mnqg\u00126G[�?�GJCQݙV+SZYqdqJOk^6Gftq@a_q6JJ?\u00076RR[R6WJ6Oq63OqRJ\u001akR?");
        assertFalse(deviceenrollmentInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("4534732b-cf38-4e9c-bf93-b6f5676884de",
                                                                      new Date(1558096039680L),
                                                                      new Date(1558096044486L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po",
                                                                      "A-HgjRPTF31CengUt4F2pRlf5xQmU5q8KxWIBn87e753U7BKg0Fr3c1613HshlF3alfp1vBL7KtqD:sKryJVwZ7pa2R1y9w5p",
                                                                      new Date(1558096043144L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("4534732b-cf38-4e9c-bf93-b6f5676884de",
                                                                      new Date(1558096039680L),
                                                                      new Date(1558096044486L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po",
                                                                      "A-HgjRPTF31CengUt4F2pRlf5xQmU5q8KxWIBn87e753U7BKg0Fr3c1613HshlF3alfp1vBL7KtqD:sKryJVwZ7pa2R1y9w5p",
                                                                      new Date(1558096043144L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po");
            DeviceEnrollment deviceenrollment3 = new DeviceEnrollment("1f8175dc-c7f8-459b-b78a-8e6cdaf13744",
                                                                      new Date(1558096043759L),
                                                                      new Date(1558096044399L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po",
                                                                      "A-HgjRPTF31CengUt4F2pRlf5xQmU5q8KxWIBn87e753U7BKg0Fr3c1613HshlF3alfp1vBL7KtqD:sKryJVwZ7pa2R1y9w5p",
                                                                      new Date(1558096038517L),
                                                                      "rXLrKP5pUmp0Xz87loHTrT4icc9TI8Po");
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotNull(deviceenrollment3);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertNotSame(deviceenrollment3, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment1, deviceenrollment2);
            assertEquals(deviceenrollment1, deviceenrollment1);
            assertFalse(deviceenrollment1.equals(null));
            assertNotEquals(deviceenrollment3, deviceenrollment1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
