// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantUserListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantUserListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantUserListOptions subtenantuserlistoptions1 = new SubtenantUserListOptions(Integer.valueOf(1),
                                                                                              Long.valueOf(91),
                                                                                              Order.getDefault(),
                                                                                              "125bd93b-e522-4337-ab7b-8d368d143a6e",
                                                                                              null, null);
            SubtenantUserListOptions subtenantuserlistoptions2 = subtenantuserlistoptions1.clone();
            assertNotNull(subtenantuserlistoptions1);
            assertNotNull(subtenantuserlistoptions2);
            assertNotSame(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions2, subtenantuserlistoptions1);
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
            SubtenantUserListOptions subtenantuserlistoptions1 = new SubtenantUserListOptions(Integer.valueOf(-125),
                                                                                              Long.valueOf(-36),
                                                                                              Order.getDefault(),
                                                                                              "71924046-a4f8-44b5-b875-81a81d2064f5",
                                                                                              null, null);
            SubtenantUserListOptions subtenantuserlistoptions2 = new SubtenantUserListOptions(Integer.valueOf(-125),
                                                                                              Long.valueOf(-36),
                                                                                              Order.getDefault(),
                                                                                              "71924046-a4f8-44b5-b875-81a81d2064f5",
                                                                                              null, null);
            assertNotNull(subtenantuserlistoptions1);
            assertNotNull(subtenantuserlistoptions2);
            assertNotSame(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions2.hashCode(), subtenantuserlistoptions1.hashCode());
            int hashCode = subtenantuserlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantuserlistoptions1.hashCode());
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
            SubtenantUserListOptions subtenantuserlistoptions1 = new SubtenantUserListOptions(Integer.valueOf(-20),
                                                                                              Long.valueOf(39),
                                                                                              Order.getDefault(),
                                                                                              "137f0b94-f182-45d2-9091-67d6c442e772",
                                                                                              null, null);
            SubtenantUserListOptions subtenantuserlistoptions2 = new SubtenantUserListOptions(Integer.valueOf(-20),
                                                                                              Long.valueOf(39),
                                                                                              Order.getDefault(),
                                                                                              "137f0b94-f182-45d2-9091-67d6c442e772",
                                                                                              null, null);
            SubtenantUserListOptions subtenantuserlistoptions3 = new SubtenantUserListOptions(Integer.valueOf(-73),
                                                                                              Long.valueOf(96),
                                                                                              Order.getDefault(),
                                                                                              "6f0f27b1-132a-41ec-8cae-7d4c0bbeec8d",
                                                                                              null, null);
            assertNotNull(subtenantuserlistoptions1);
            assertNotNull(subtenantuserlistoptions2);
            assertNotNull(subtenantuserlistoptions3);
            assertNotSame(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertNotSame(subtenantuserlistoptions3, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions1, subtenantuserlistoptions2);
            assertEquals(subtenantuserlistoptions1, subtenantuserlistoptions1);
            assertFalse(subtenantuserlistoptions1.equals(null));
            assertNotEquals(subtenantuserlistoptions3, subtenantuserlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
