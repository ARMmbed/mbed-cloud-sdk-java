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
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions1 = new SubtenantPolicyGroupListOptions(Integer.valueOf(69),
                                                                                                                   Long.valueOf(-65),
                                                                                                                   Order.getDefault(),
                                                                                                                   "0753dad2-4229-47c7-bc56-57ad9ca1fbf1",
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
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions1 = new SubtenantPolicyGroupListOptions(Integer.valueOf(95),
                                                                                                                   Long.valueOf(-4),
                                                                                                                   Order.getDefault(),
                                                                                                                   "c35b48bc-41cb-46e6-ab1f-835ab2dc1161",
                                                                                                                   null,
                                                                                                                   null);
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions2 = new SubtenantPolicyGroupListOptions(Integer.valueOf(95),
                                                                                                                   Long.valueOf(-4),
                                                                                                                   Order.getDefault(),
                                                                                                                   "c35b48bc-41cb-46e6-ab1f-835ab2dc1161",
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
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions1 = new SubtenantPolicyGroupListOptions(Integer.valueOf(106),
                                                                                                                   Long.valueOf(-89),
                                                                                                                   Order.getDefault(),
                                                                                                                   "3661da77-a857-4c99-bab5-3e6c4a42f010",
                                                                                                                   null,
                                                                                                                   null);
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions2 = new SubtenantPolicyGroupListOptions(Integer.valueOf(106),
                                                                                                                   Long.valueOf(-89),
                                                                                                                   Order.getDefault(),
                                                                                                                   "3661da77-a857-4c99-bab5-3e6c4a42f010",
                                                                                                                   null,
                                                                                                                   null);
            SubtenantPolicyGroupListOptions subtenantpolicygrouplistoptions3 = new SubtenantPolicyGroupListOptions(Integer.valueOf(73),
                                                                                                                   Long.valueOf(53),
                                                                                                                   Order.getDefault(),
                                                                                                                   "aafbe9f0-83ae-4cd0-adb9-f34307ff35ed",
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
