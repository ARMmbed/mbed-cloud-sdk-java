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
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(55),
                                                                                                 Long.valueOf(29),
                                                                                                 Order.getDefault(),
                                                                                                 "5902d3ca-0a8a-4a3f-80b5-95be982b0feb",
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
     * Tests the filters method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testFilters() {
        try {
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
            UserInvitationListOptions option = new UserInvitationListOptions();
            assertFalse(option.hasFilters());
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
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
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(39),
                                                                                                 Long.valueOf(14),
                                                                                                 Order.getDefault(),
                                                                                                 "da212375-61e9-422f-8e33-a9e37e65b241",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = new UserInvitationListOptions(Integer.valueOf(39),
                                                                                                 Long.valueOf(14),
                                                                                                 Order.getDefault(),
                                                                                                 "da212375-61e9-422f-8e33-a9e37e65b241",
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
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-45),
                                                                                                 Long.valueOf(-86),
                                                                                                 Order.getDefault(),
                                                                                                 "954301ce-bbe6-48c9-9a4d-2e27956db4d5",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = new UserInvitationListOptions(Integer.valueOf(-45),
                                                                                                 Long.valueOf(-86),
                                                                                                 Order.getDefault(),
                                                                                                 "954301ce-bbe6-48c9-9a4d-2e27956db4d5",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions3 = new UserInvitationListOptions(Integer.valueOf(-40),
                                                                                                 Long.valueOf(-122),
                                                                                                 Order.getDefault(),
                                                                                                 "76a2661c-f357-4434-901b-8f01ab916e18",
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
