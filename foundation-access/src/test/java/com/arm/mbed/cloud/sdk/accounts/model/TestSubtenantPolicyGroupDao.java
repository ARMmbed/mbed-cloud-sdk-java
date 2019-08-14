// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Wed Aug 14 10:36:38 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantPolicyGroupDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantPolicyGroupDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantPolicyGroupDao subtenantpolicygroupdao1 = new SubtenantPolicyGroupDao();
            SubtenantPolicyGroupDao subtenantpolicygroupdao2 = subtenantpolicygroupdao1.clone();
            assertNotNull(subtenantpolicygroupdao1);
            assertNotNull(subtenantpolicygroupdao2);
            assertNotSame(subtenantpolicygroupdao2, subtenantpolicygroupdao1);
            assertEquals(subtenantpolicygroupdao2, subtenantpolicygroupdao1);
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
            SubtenantPolicyGroupDao subtenantpolicygroupdao1 = new SubtenantPolicyGroupDao();
            SubtenantPolicyGroupDao subtenantpolicygroupdao2 = new SubtenantPolicyGroupDao();
            assertNotNull(subtenantpolicygroupdao1);
            assertNotNull(subtenantpolicygroupdao2);
            assertNotSame(subtenantpolicygroupdao2, subtenantpolicygroupdao1);
            assertEquals(subtenantpolicygroupdao2, subtenantpolicygroupdao1);
            assertEquals(subtenantpolicygroupdao2.hashCode(), subtenantpolicygroupdao1.hashCode());
            int hashCode = subtenantpolicygroupdao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantpolicygroupdao1.hashCode());
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
            SubtenantPolicyGroupDao subtenantpolicygroupdao1 = new SubtenantPolicyGroupDao();
            SubtenantPolicyGroupDao subtenantpolicygroupdao2 = new SubtenantPolicyGroupDao();
            assertNotNull(subtenantpolicygroupdao1);
            assertNotNull(subtenantpolicygroupdao2);
            assertNotSame(subtenantpolicygroupdao2, subtenantpolicygroupdao1);
            assertEquals(subtenantpolicygroupdao2, subtenantpolicygroupdao1);
            assertEquals(subtenantpolicygroupdao2, subtenantpolicygroupdao1);
            assertEquals(subtenantpolicygroupdao1, subtenantpolicygroupdao2);
            assertEquals(subtenantpolicygroupdao1, subtenantpolicygroupdao1);
            assertFalse(subtenantpolicygroupdao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
