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
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("89c3d985-46b4-4ca1-aa93-e99dfce72854",
                                                                      new Date(1565778998335L),
                                                                      new Date(1565779004134L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4",
                                                                      "A-wOsO16RY4d5bem770c595z8rHHj4T2LcoY3i03SFkismOc9Q66dZ62UI6M521PRgz5Doa2gN8uO41rD3x:xU2g65x3lvTib",
                                                                      new Date(1565778999562L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4");
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
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("2e769228-188e-43d8-be68-ac16aa7b02db",
                                                                      new Date(1565779000599L),
                                                                      new Date(1565778999036L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4",
                                                                      "A-wOsO16RY4d5bem770c595z8rHHj4T2LcoY3i03SFkismOc9Q66dZ62UI6M521PRgz5Doa2gN8uO41rD3x:xU2g65x3lvTib",
                                                                      new Date(1565779006437L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("2e769228-188e-43d8-be68-ac16aa7b02db",
                                                                      new Date(1565779000599L),
                                                                      new Date(1565778999036L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4",
                                                                      "A-wOsO16RY4d5bem770c595z8rHHj4T2LcoY3i03SFkismOc9Q66dZ62UI6M521PRgz5Doa2gN8uO41rD3x:xU2g65x3lvTib",
                                                                      new Date(1565779006437L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4");
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
        DeviceEnrollment deviceenrollment = new DeviceEnrollment("f82f0dd9-d294-49df-a904-262eb096a3d0",
                                                                 new Date(1565779003135L), new Date(1565778997454L),
                                                                 "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4",
                                                                 "A-wOsO16RY4d5bem770c595z8rHHj4T2LcoY3i03SFkismOc9Q66dZ62UI6M521PRgz5Doa2gN8uO41rD3x:xU2g65x3lvTib",
                                                                 new Date(1565778999826L),
                                                                 "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4");
        assertTrue(deviceenrollment.isValid());
        DeviceEnrollment deviceenrollmentInvalid = new DeviceEnrollment("1d99780b-3e45-417d-82c6-e970a9b0be1f",
                                                                        new Date(1565779004666L),
                                                                        new Date(1565779004785L),
                                                                        "IkuadR*Epx6_H丟g_\u00126잔1a1E\u001eOU:6Ck\u0013艠I[C♘H璦W_UA1M\td61W6EWC`YeC髀6\t6fx",
                                                                        null, new Date(1565779005800L),
                                                                        "IkuadR*Epx6_H丟g_\u00126잔1a1E\u001eOU:6Ck\u0013艠I[C♘H璦W_UA1M\td61W6EWC`YeC髀6\t6fx");
        assertFalse(deviceenrollmentInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("c6211918-1bb0-4270-89e5-6a565bc4e227",
                                                                      new Date(1565779000746L),
                                                                      new Date(1565779002396L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4",
                                                                      "A-wOsO16RY4d5bem770c595z8rHHj4T2LcoY3i03SFkismOc9Q66dZ62UI6M521PRgz5Doa2gN8uO41rD3x:xU2g65x3lvTib",
                                                                      new Date(1565779006454L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("c6211918-1bb0-4270-89e5-6a565bc4e227",
                                                                      new Date(1565779000746L),
                                                                      new Date(1565779002396L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4",
                                                                      "A-wOsO16RY4d5bem770c595z8rHHj4T2LcoY3i03SFkismOc9Q66dZ62UI6M521PRgz5Doa2gN8uO41rD3x:xU2g65x3lvTib",
                                                                      new Date(1565779006454L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4");
            DeviceEnrollment deviceenrollment3 = new DeviceEnrollment("37c84868-0070-4925-bac7-5cb6ada39672",
                                                                      new Date(1565779005078L),
                                                                      new Date(1565779004786L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4",
                                                                      "A-wOsO16RY4d5bem770c595z8rHHj4T2LcoY3i03SFkismOc9Q66dZ62UI6M521PRgz5Doa2gN8uO41rD3x:xU2g65x3lvTib",
                                                                      new Date(1565779000823L),
                                                                      "N537B29GZwc8TiKJ3ND04Fqy7D98ivX4");
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
