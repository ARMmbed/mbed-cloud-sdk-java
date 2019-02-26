// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Fri Jan 11 00:36:39 GMT 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model UserInvitationListDao.
 */
public class TestUserInvitationListDao {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            UserInvitationListDao userinvitationlistdao1 = new UserInvitationListDao();
            UserInvitationListDao userinvitationlistdao2 = userinvitationlistdao1.clone();
            assertNotNull(userinvitationlistdao1);
            assertNotNull(userinvitationlistdao2);
            assertNotSame(userinvitationlistdao2, userinvitationlistdao1);
            assertEquals(userinvitationlistdao2, userinvitationlistdao1);
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
            UserInvitationListDao userinvitationlistdao1 = new UserInvitationListDao();
            UserInvitationListDao userinvitationlistdao2 = new UserInvitationListDao();
            assertNotNull(userinvitationlistdao1);
            assertNotNull(userinvitationlistdao2);
            assertNotSame(userinvitationlistdao2, userinvitationlistdao1);
            assertEquals(userinvitationlistdao2, userinvitationlistdao1);
            assertEquals(userinvitationlistdao2.hashCode(), userinvitationlistdao1.hashCode());
            int hashCode = userinvitationlistdao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, userinvitationlistdao1.hashCode());
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
            UserInvitationListDao userinvitationlistdao1 = new UserInvitationListDao();
            UserInvitationListDao userinvitationlistdao2 = new UserInvitationListDao();
            assertNotNull(userinvitationlistdao1);
            assertNotNull(userinvitationlistdao2);
            assertNotSame(userinvitationlistdao2, userinvitationlistdao1);
            assertEquals(userinvitationlistdao2, userinvitationlistdao1);
            assertEquals(userinvitationlistdao2, userinvitationlistdao1);
            assertEquals(userinvitationlistdao1, userinvitationlistdao2);
            assertEquals(userinvitationlistdao1, userinvitationlistdao1);
            assertFalse(userinvitationlistdao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}