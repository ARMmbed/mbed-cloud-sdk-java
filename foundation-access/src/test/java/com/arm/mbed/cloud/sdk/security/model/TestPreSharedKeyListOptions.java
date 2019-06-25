// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model PreSharedKeyListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestPreSharedKeyListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            PreSharedKeyListOptions presharedkeylistoptions1 = new PreSharedKeyListOptions(Integer.valueOf(122),
                                                                                           Long.valueOf(-76),
                                                                                           Order.getDefault(),
                                                                                           "78132abd-9ebf-404d-9434-e5658c379b20",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions2 = presharedkeylistoptions1.clone();
            assertNotNull(presharedkeylistoptions1);
            assertNotNull(presharedkeylistoptions2);
            assertNotSame(presharedkeylistoptions2, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions2, presharedkeylistoptions1);
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
            PreSharedKeyListOptions presharedkeylistoptions1 = new PreSharedKeyListOptions(Integer.valueOf(30),
                                                                                           Long.valueOf(-69),
                                                                                           Order.getDefault(),
                                                                                           "65dadfc1-cac6-4ba7-9b42-aad4f95e80c8",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions2 = new PreSharedKeyListOptions(Integer.valueOf(30),
                                                                                           Long.valueOf(-69),
                                                                                           Order.getDefault(),
                                                                                           "65dadfc1-cac6-4ba7-9b42-aad4f95e80c8",
                                                                                           null, null);
            assertNotNull(presharedkeylistoptions1);
            assertNotNull(presharedkeylistoptions2);
            assertNotSame(presharedkeylistoptions2, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions2, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions2.hashCode(), presharedkeylistoptions1.hashCode());
            int hashCode = presharedkeylistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, presharedkeylistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            PreSharedKeyListOptions presharedkeylistoptions1 = new PreSharedKeyListOptions(Integer.valueOf(-95),
                                                                                           Long.valueOf(79),
                                                                                           Order.getDefault(),
                                                                                           "26b87f19-b0f6-4475-9adc-7be195ea5c61",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions2 = new PreSharedKeyListOptions(Integer.valueOf(-95),
                                                                                           Long.valueOf(79),
                                                                                           Order.getDefault(),
                                                                                           "26b87f19-b0f6-4475-9adc-7be195ea5c61",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions3 = new PreSharedKeyListOptions(Integer.valueOf(-124),
                                                                                           Long.valueOf(-54),
                                                                                           Order.getDefault(),
                                                                                           "53ca1c01-651c-4a2a-877a-bea84266364c",
                                                                                           null, null);
            assertNotNull(presharedkeylistoptions1);
            assertNotNull(presharedkeylistoptions2);
            assertNotNull(presharedkeylistoptions3);
            assertNotSame(presharedkeylistoptions2, presharedkeylistoptions1);
            assertNotSame(presharedkeylistoptions3, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions2, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions2, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions1, presharedkeylistoptions2);
            assertEquals(presharedkeylistoptions1, presharedkeylistoptions1);
            assertFalse(presharedkeylistoptions1.equals(null));
            assertNotEquals(presharedkeylistoptions3, presharedkeylistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
