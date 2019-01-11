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
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("174934bc-c279-437f-b83f-c8582cca12a1",
                                                                                                    new Date(1547225117441L),
                                                                                                    new Date(1547225116926L),
                                                                                                    7,
                                                                                                    "9a836294-3138-4e17-a5d4-873f6a8bc345",
                                                                                                    "db567322-5e53-408f-bbdd-110fc04a5c8b",
                                                                                                    "Z5BXtQ3918Jv0z7iSy0LFu1OzgoCgJVw",
                                                                                                    91,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    -101);
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
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("e8b06ba7-9703-4c2a-bdc7-08091b7c5c63",
                                                                                                    new Date(1547225117953L),
                                                                                                    new Date(1547225122870L),
                                                                                                    31,
                                                                                                    "e35585df-3aad-4837-a833-44a1be4135a6",
                                                                                                    "379ea9b6-9862-47dd-a33e-223bc8927046",
                                                                                                    "55c3vxvJW7OD42jbMV1M35S7wnr1klik",
                                                                                                    -60,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    123);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = new DeviceEnrollmentBulkDelete("e8b06ba7-9703-4c2a-bdc7-08091b7c5c63",
                                                                                                    new Date(1547225117953L),
                                                                                                    new Date(1547225122870L),
                                                                                                    31,
                                                                                                    "e35585df-3aad-4837-a833-44a1be4135a6",
                                                                                                    "379ea9b6-9862-47dd-a33e-223bc8927046",
                                                                                                    "55c3vxvJW7OD42jbMV1M35S7wnr1klik",
                                                                                                    -60,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    123);
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
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete = new DeviceEnrollmentBulkDelete("d5bef576-e831-4228-a14a-5960c2725ba7",
                                                                                               new Date(1547225123565L),
                                                                                               new Date(1547225123250L),
                                                                                               -50,
                                                                                               "4d436782-322a-45a1-9ee9-914edc11d3cf",
                                                                                               "6b8ad452-97bc-4c82-a837-9fbc04775d14",
                                                                                               "aBpZgP1E3ASzigV59fB3raB05BTFCL18",
                                                                                               -11,
                                                                                               DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                               -63);
        assertTrue(deviceenrollmentbulkdelete.isValid());
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdeleteInvalid = new DeviceEnrollmentBulkDelete("ba54e415-108f-48ff-baa1-889730396308",
                                                                                                      new Date(1547225122395L),
                                                                                                      new Date(1547225119753L),
                                                                                                      -57,
                                                                                                      "86940f85-e3e2-47aa-b4e1-985c0bcc49ef",
                                                                                                      "319c21b2-bd4c-43d9-9218-a72a85952936",
                                                                                                      "KRVOKs穑VfVXXKXHiKjtUOK闃Mvd7s�?�GcOM^d\u0001f7n7pcjp\u0011rc/ntdvt⥆<I3=XSXCO^",
                                                                                                      -55,
                                                                                                      DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                      -39);
        assertFalse(deviceenrollmentbulkdeleteInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("190cb264-f1a6-48a8-ae44-b04896568414",
                                                                                                    new Date(1547225122877L),
                                                                                                    new Date(1547225119370L),
                                                                                                    -105,
                                                                                                    "1336b153-3fcd-4d5f-a375-258c03235b81",
                                                                                                    "ad771b3b-cd05-4b05-ba36-c3371b2b6aed",
                                                                                                    "B58JRIY9wz2lzG25vbe5E5hN4E888h56",
                                                                                                    28,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    50);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = new DeviceEnrollmentBulkDelete("190cb264-f1a6-48a8-ae44-b04896568414",
                                                                                                    new Date(1547225122877L),
                                                                                                    new Date(1547225119370L),
                                                                                                    -105,
                                                                                                    "1336b153-3fcd-4d5f-a375-258c03235b81",
                                                                                                    "ad771b3b-cd05-4b05-ba36-c3371b2b6aed",
                                                                                                    "B58JRIY9wz2lzG25vbe5E5hN4E888h56",
                                                                                                    28,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    50);
            DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete3 = new DeviceEnrollmentBulkDelete("874a275f-c08c-42e1-bb01-4484bbd38221",
                                                                                                    new Date(1547225115456L),
                                                                                                    new Date(1547225117051L),
                                                                                                    -4,
                                                                                                    "f537e544-a451-4584-b23b-13252a1a47f0",
                                                                                                    "ea1ee27a-d23b-439c-9e8a-ed6081a272ee",
                                                                                                    "vxkR8U5ZBA2Be68NEbLQk9y1Ikw74E3J",
                                                                                                    8,
                                                                                                    DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                    -100);
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
