// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model UserListOptions.
 */
public class TestUserListOptions {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(-55), Long.valueOf(86),
                                                                   Order.getDefault(),
                                                                   "bb75890e-ee12-4c1d-84e3-e582eda173f0", null, null);
            UserListOptions userlistoptions2 = userlistoptions1.clone();
            assertNotNull(userlistoptions1);
            assertNotNull(userlistoptions2);
            assertNotSame(userlistoptions2, userlistoptions1);
            assertEquals(userlistoptions2, userlistoptions1);
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
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(87), Long.valueOf(12),
                                                                   Order.getDefault(),
                                                                   "faa15a28-3c86-420e-a9ad-1d05a6e56b90", null, null);
            UserListOptions userlistoptions2 = new UserListOptions(Integer.valueOf(87), Long.valueOf(12),
                                                                   Order.getDefault(),
                                                                   "faa15a28-3c86-420e-a9ad-1d05a6e56b90", null, null);
            assertNotNull(userlistoptions1);
            assertNotNull(userlistoptions2);
            assertNotSame(userlistoptions2, userlistoptions1);
            assertEquals(userlistoptions2, userlistoptions1);
            assertEquals(userlistoptions2.hashCode(), userlistoptions1.hashCode());
            int hashCode = userlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, userlistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(108), Long.valueOf(20),
                                                                   Order.getDefault(),
                                                                   "3fd872a0-6c11-4d0b-8fab-ca8e57f161a6", null, null);
            UserListOptions userlistoptions2 = new UserListOptions(Integer.valueOf(108), Long.valueOf(20),
                                                                   Order.getDefault(),
                                                                   "3fd872a0-6c11-4d0b-8fab-ca8e57f161a6", null, null);
            UserListOptions userlistoptions3 = new UserListOptions(Integer.valueOf(-62), Long.valueOf(-63),
                                                                   Order.getDefault(),
                                                                   "ddb4c16c-ca23-4b48-ad71-f8da50fa9ea5", null, null);
            assertNotNull(userlistoptions1);
            assertNotNull(userlistoptions2);
            assertNotNull(userlistoptions3);
            assertNotSame(userlistoptions2, userlistoptions1);
            assertNotSame(userlistoptions3, userlistoptions1);
            assertEquals(userlistoptions2, userlistoptions1);
            assertEquals(userlistoptions2, userlistoptions1);
            assertEquals(userlistoptions1, userlistoptions2);
            assertEquals(userlistoptions1, userlistoptions1);
            assertFalse(userlistoptions1.equals(null));
            assertNotEquals(userlistoptions3, userlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
