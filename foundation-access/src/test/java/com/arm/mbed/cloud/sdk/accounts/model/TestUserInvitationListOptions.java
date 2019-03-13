// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model UserInvitationListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUserInvitationListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-10),
                                                                                                 Long.valueOf(32),
                                                                                                 Order.getDefault(),
                                                                                                 "8d9f4f73-a641-446f-9334-a9d4d1ef48f6",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = userinvitationlistoptions1.clone();
            assertNotNull(userinvitationlistoptions1);
            assertNotNull(userinvitationlistoptions2);
            assertNotSame(userinvitationlistoptions2, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions2, userinvitationlistoptions1);
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
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-28),
                                                                                                 Long.valueOf(-36),
                                                                                                 Order.getDefault(),
                                                                                                 "3a72eaa5-3263-4f8c-86e6-641c5ef407de",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = new UserInvitationListOptions(Integer.valueOf(-28),
                                                                                                 Long.valueOf(-36),
                                                                                                 Order.getDefault(),
                                                                                                 "3a72eaa5-3263-4f8c-86e6-641c5ef407de",
                                                                                                 null, null);
            assertNotNull(userinvitationlistoptions1);
            assertNotNull(userinvitationlistoptions2);
            assertNotSame(userinvitationlistoptions2, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions2, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions2.hashCode(), userinvitationlistoptions1.hashCode());
            int hashCode = userinvitationlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, userinvitationlistoptions1.hashCode());
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
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-91),
                                                                                                 Long.valueOf(-91),
                                                                                                 Order.getDefault(),
                                                                                                 "409c2213-dbb6-488b-94e0-195cfcd57449",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = new UserInvitationListOptions(Integer.valueOf(-91),
                                                                                                 Long.valueOf(-91),
                                                                                                 Order.getDefault(),
                                                                                                 "409c2213-dbb6-488b-94e0-195cfcd57449",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions3 = new UserInvitationListOptions(Integer.valueOf(-57),
                                                                                                 Long.valueOf(37),
                                                                                                 Order.getDefault(),
                                                                                                 "b732e4e8-947f-402e-b435-e9e238f891d1",
                                                                                                 null, null);
            assertNotNull(userinvitationlistoptions1);
            assertNotNull(userinvitationlistoptions2);
            assertNotNull(userinvitationlistoptions3);
            assertNotSame(userinvitationlistoptions2, userinvitationlistoptions1);
            assertNotSame(userinvitationlistoptions3, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions2, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions2, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions1, userinvitationlistoptions2);
            assertEquals(userinvitationlistoptions1, userinvitationlistoptions1);
            assertFalse(userinvitationlistoptions1.equals(null));
            assertNotEquals(userinvitationlistoptions3, userinvitationlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
