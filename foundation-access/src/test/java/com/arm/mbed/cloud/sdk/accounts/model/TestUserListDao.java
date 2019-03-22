// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model UserListDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUserListDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            UserListDao userlistdao1 = new UserListDao();
            UserListDao userlistdao2 = userlistdao1.clone();
            assertNotNull(userlistdao1);
            assertNotNull(userlistdao2);
            assertNotSame(userlistdao2, userlistdao1);
            assertEquals(userlistdao2, userlistdao1);
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
            UserListDao userlistdao1 = new UserListDao();
            UserListDao userlistdao2 = new UserListDao();
            assertNotNull(userlistdao1);
            assertNotNull(userlistdao2);
            assertNotSame(userlistdao2, userlistdao1);
            assertEquals(userlistdao2, userlistdao1);
            assertEquals(userlistdao2.hashCode(), userlistdao1.hashCode());
            int hashCode = userlistdao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, userlistdao1.hashCode());
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
            UserListDao userlistdao1 = new UserListDao();
            UserListDao userlistdao2 = new UserListDao();
            assertNotNull(userlistdao1);
            assertNotNull(userlistdao2);
            assertNotSame(userlistdao2, userlistdao1);
            assertEquals(userlistdao2, userlistdao1);
            assertEquals(userlistdao2, userlistdao1);
            assertEquals(userlistdao1, userlistdao2);
            assertEquals(userlistdao1, userlistdao1);
            assertFalse(userlistdao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}