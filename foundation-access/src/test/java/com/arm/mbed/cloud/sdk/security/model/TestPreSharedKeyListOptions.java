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
            PreSharedKeyListOptions presharedkeylistoptions1 = new PreSharedKeyListOptions(Integer.valueOf(-117),
                                                                                           Long.valueOf(-89),
                                                                                           Order.getDefault(),
                                                                                           "eeffb4fc-a688-462a-95b5-50ef0a9e90d5",
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
            PreSharedKeyListOptions presharedkeylistoptions1 = new PreSharedKeyListOptions(Integer.valueOf(-7),
                                                                                           Long.valueOf(-56),
                                                                                           Order.getDefault(),
                                                                                           "f647e46c-f767-4350-8f0d-d5f0601624d2",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions2 = new PreSharedKeyListOptions(Integer.valueOf(-7),
                                                                                           Long.valueOf(-56),
                                                                                           Order.getDefault(),
                                                                                           "f647e46c-f767-4350-8f0d-d5f0601624d2",
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
            PreSharedKeyListOptions presharedkeylistoptions1 = new PreSharedKeyListOptions(Integer.valueOf(-55),
                                                                                           Long.valueOf(52),
                                                                                           Order.getDefault(),
                                                                                           "7f125fee-2e57-4444-a514-d589d1914fcc",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions2 = new PreSharedKeyListOptions(Integer.valueOf(-55),
                                                                                           Long.valueOf(52),
                                                                                           Order.getDefault(),
                                                                                           "7f125fee-2e57-4444-a514-d589d1914fcc",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions3 = new PreSharedKeyListOptions(Integer.valueOf(72),
                                                                                           Long.valueOf(115),
                                                                                           Order.getDefault(),
                                                                                           "844c5498-86e8-446c-b40b-9d4e8e8b36e8",
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
