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
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(68), Long.valueOf(-33),
                                                                   Order.getDefault(),
                                                                   "6251cbf3-4c70-4e1e-9e81-e6ef18268d6d", null, null);
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
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(-124), Long.valueOf(-72),
                                                                   Order.getDefault(),
                                                                   "baa29dd0-7913-4e2c-83dc-2624ef52e319", null, null);
            UserListOptions userlistoptions2 = new UserListOptions(Integer.valueOf(-124), Long.valueOf(-72),
                                                                   Order.getDefault(),
                                                                   "baa29dd0-7913-4e2c-83dc-2624ef52e319", null, null);
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
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(-37), Long.valueOf(97),
                                                                   Order.getDefault(),
                                                                   "a48c060d-f465-41fe-abfb-b838aebfa084", null, null);
            UserListOptions userlistoptions2 = new UserListOptions(Integer.valueOf(-37), Long.valueOf(97),
                                                                   Order.getDefault(),
                                                                   "a48c060d-f465-41fe-abfb-b838aebfa084", null, null);
            UserListOptions userlistoptions3 = new UserListOptions(Integer.valueOf(52), Long.valueOf(37),
                                                                   Order.getDefault(),
                                                                   "4a7576f6-c5dd-400f-a997-1e04f7a6ca95", null, null);
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
