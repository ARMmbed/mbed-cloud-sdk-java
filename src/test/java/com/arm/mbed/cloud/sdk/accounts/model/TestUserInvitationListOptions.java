// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model UserInvitationListOptions.
 */
public class TestUserInvitationListOptions {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-118),
                                                                                                 Long.valueOf(46),
                                                                                                 Order.getDefault(),
                                                                                                 "1f047676-25ac-4cc3-b064-2208f63eb94b",
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
    @Test
    public void testHashCode() {
        try {
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-12),
                                                                                                 Long.valueOf(65),
                                                                                                 Order.getDefault(),
                                                                                                 "f9a62a52-6df9-4ebb-b07a-6a6b06204400",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = new UserInvitationListOptions(Integer.valueOf(-12),
                                                                                                 Long.valueOf(65),
                                                                                                 Order.getDefault(),
                                                                                                 "f9a62a52-6df9-4ebb-b07a-6a6b06204400",
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
    @Test
    public void testEquals() {
        try {
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-121),
                                                                                                 Long.valueOf(-105),
                                                                                                 Order.getDefault(),
                                                                                                 "81de971f-9f8e-410b-b53f-1e19074982bd",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = new UserInvitationListOptions(Integer.valueOf(-121),
                                                                                                 Long.valueOf(-105),
                                                                                                 Order.getDefault(),
                                                                                                 "81de971f-9f8e-410b-b53f-1e19074982bd",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions3 = new UserInvitationListOptions(Integer.valueOf(-128),
                                                                                                 Long.valueOf(88),
                                                                                                 Order.getDefault(),
                                                                                                 "5303b738-1295-41e9-8ab7-6cdc92424d2f",
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
