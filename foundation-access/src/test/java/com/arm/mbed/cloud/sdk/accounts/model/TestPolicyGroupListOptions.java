// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model PolicyGroupListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestPolicyGroupListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            PolicyGroupListOptions policygrouplistoptions1 = new PolicyGroupListOptions(Integer.valueOf(107),
                                                                                        Long.valueOf(-100),
                                                                                        Order.getDefault(),
                                                                                        "a5712797-973f-4982-9a7b-2d5bfff03086",
                                                                                        null, null);
            PolicyGroupListOptions policygrouplistoptions2 = policygrouplistoptions1.clone();
            assertNotNull(policygrouplistoptions1);
            assertNotNull(policygrouplistoptions2);
            assertNotSame(policygrouplistoptions2, policygrouplistoptions1);
            assertEquals(policygrouplistoptions2, policygrouplistoptions1);
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
            PolicyGroupListOptions policygrouplistoptions1 = new PolicyGroupListOptions(Integer.valueOf(109),
                                                                                        Long.valueOf(-47),
                                                                                        Order.getDefault(),
                                                                                        "98b9a1f2-15f5-4708-9ea1-0098610ec866",
                                                                                        null, null);
            PolicyGroupListOptions policygrouplistoptions2 = new PolicyGroupListOptions(Integer.valueOf(109),
                                                                                        Long.valueOf(-47),
                                                                                        Order.getDefault(),
                                                                                        "98b9a1f2-15f5-4708-9ea1-0098610ec866",
                                                                                        null, null);
            assertNotNull(policygrouplistoptions1);
            assertNotNull(policygrouplistoptions2);
            assertNotSame(policygrouplistoptions2, policygrouplistoptions1);
            assertEquals(policygrouplistoptions2, policygrouplistoptions1);
            assertEquals(policygrouplistoptions2.hashCode(), policygrouplistoptions1.hashCode());
            int hashCode = policygrouplistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, policygrouplistoptions1.hashCode());
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
            PolicyGroupListOptions policygrouplistoptions1 = new PolicyGroupListOptions(Integer.valueOf(60),
                                                                                        Long.valueOf(-21),
                                                                                        Order.getDefault(),
                                                                                        "ab84c55c-1329-47f8-80ec-a3b0a805bcc7",
                                                                                        null, null);
            PolicyGroupListOptions policygrouplistoptions2 = new PolicyGroupListOptions(Integer.valueOf(60),
                                                                                        Long.valueOf(-21),
                                                                                        Order.getDefault(),
                                                                                        "ab84c55c-1329-47f8-80ec-a3b0a805bcc7",
                                                                                        null, null);
            PolicyGroupListOptions policygrouplistoptions3 = new PolicyGroupListOptions(Integer.valueOf(34),
                                                                                        Long.valueOf(-22),
                                                                                        Order.getDefault(),
                                                                                        "d369b883-8948-43f1-a930-13139e5972a7",
                                                                                        null, null);
            assertNotNull(policygrouplistoptions1);
            assertNotNull(policygrouplistoptions2);
            assertNotNull(policygrouplistoptions3);
            assertNotSame(policygrouplistoptions2, policygrouplistoptions1);
            assertNotSame(policygrouplistoptions3, policygrouplistoptions1);
            assertEquals(policygrouplistoptions2, policygrouplistoptions1);
            assertEquals(policygrouplistoptions2, policygrouplistoptions1);
            assertEquals(policygrouplistoptions1, policygrouplistoptions2);
            assertEquals(policygrouplistoptions1, policygrouplistoptions1);
            assertFalse(policygrouplistoptions1.equals(null));
            assertNotEquals(policygrouplistoptions3, policygrouplistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}