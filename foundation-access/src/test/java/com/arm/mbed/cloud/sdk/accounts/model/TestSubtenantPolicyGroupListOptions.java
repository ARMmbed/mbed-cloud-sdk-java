// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantPolicyGroupListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantPolicyGroupListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions1 = new SubtenantPolicyGroupListOptions(Integer.valueOf(-77),
                                                                                                                   Long.valueOf(-116),
                                                                                                                   Order.getDefault(),
                                                                                                                   "a336bfe5-8de1-4c02-9a89-1eeca21c3b2d",
                                                                                                                   null,
                                                                                                                   null);
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions2 = subtenantpolicygrouplistoptions1.clone();
            assertNotNull(subtenantpolicygrouplistoptions1);
            assertNotNull(subtenantpolicygrouplistoptions2);
            assertNotSame(subtenantpolicygrouplistoptions2, subtenantpolicygrouplistoptions1);
            assertEquals(subtenantpolicygrouplistoptions2, subtenantpolicygrouplistoptions1);
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
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions1 = new SubtenantPolicyGroupListOptions(Integer.valueOf(-42),
                                                                                                                   Long.valueOf(5),
                                                                                                                   Order.getDefault(),
                                                                                                                   "b713949c-03d5-4f2f-ac5a-b59997408487",
                                                                                                                   null,
                                                                                                                   null);
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions2 = new SubtenantPolicyGroupListOptions(Integer.valueOf(-42),
                                                                                                                   Long.valueOf(5),
                                                                                                                   Order.getDefault(),
                                                                                                                   "b713949c-03d5-4f2f-ac5a-b59997408487",
                                                                                                                   null,
                                                                                                                   null);
            assertNotNull(subtenantpolicygrouplistoptions1);
            assertNotNull(subtenantpolicygrouplistoptions2);
            assertNotSame(subtenantpolicygrouplistoptions2, subtenantpolicygrouplistoptions1);
            assertEquals(subtenantpolicygrouplistoptions2, subtenantpolicygrouplistoptions1);
            assertEquals(subtenantpolicygrouplistoptions2.hashCode(), subtenantpolicygrouplistoptions1.hashCode());
            int hashCode = subtenantpolicygrouplistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantpolicygrouplistoptions1.hashCode());
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
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions1 = new SubtenantPolicyGroupListOptions(Integer.valueOf(12),
                                                                                                                   Long.valueOf(-49),
                                                                                                                   Order.getDefault(),
                                                                                                                   "bacfbb56-831b-447c-b4e3-3ed6afaa6d2d",
                                                                                                                   null,
                                                                                                                   null);
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions2 = new SubtenantPolicyGroupListOptions(Integer.valueOf(12),
                                                                                                                   Long.valueOf(-49),
                                                                                                                   Order.getDefault(),
                                                                                                                   "bacfbb56-831b-447c-b4e3-3ed6afaa6d2d",
                                                                                                                   null,
                                                                                                                   null);
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions3 = new SubtenantPolicyGroupListOptions(Integer.valueOf(124),
                                                                                                                   Long.valueOf(-31),
                                                                                                                   Order.getDefault(),
                                                                                                                   "75a94d2b-29ce-4e0b-a568-8915944d5d1d",
                                                                                                                   null,
                                                                                                                   null);
            assertNotNull(subtenantpolicygrouplistoptions1);
            assertNotNull(subtenantpolicygrouplistoptions2);
            assertNotNull(subtenantpolicygrouplistoptions3);
            assertNotSame(subtenantpolicygrouplistoptions2, subtenantpolicygrouplistoptions1);
            assertNotSame(subtenantpolicygrouplistoptions3, subtenantpolicygrouplistoptions1);
            assertEquals(subtenantpolicygrouplistoptions2, subtenantpolicygrouplistoptions1);
            assertEquals(subtenantpolicygrouplistoptions2, subtenantpolicygrouplistoptions1);
            assertEquals(subtenantpolicygrouplistoptions1, subtenantpolicygrouplistoptions2);
            assertEquals(subtenantpolicygrouplistoptions1, subtenantpolicygrouplistoptions1);
            assertFalse(subtenantpolicygrouplistoptions1.equals(null));
            assertNotEquals(subtenantpolicygrouplistoptions3, subtenantpolicygrouplistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
