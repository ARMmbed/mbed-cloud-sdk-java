// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantUserInvitationListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantUserInvitationListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions1 = new SubtenantUserInvitationListOptions(Integer.valueOf(-11),
                                                                                                                            Long.valueOf(114),
                                                                                                                            Order.getDefault(),
                                                                                                                            "b90016b6-ee29-4a2c-9861-32a1f7991836",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions2 = subtenantuserinvitationlistoptions1.clone();
            assertNotNull(subtenantuserinvitationlistoptions1);
            assertNotNull(subtenantuserinvitationlistoptions2);
            assertNotSame(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
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
            SubtenantUserInvitationListOptions option = new SubtenantUserInvitationListOptions();
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
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions1 = new SubtenantUserInvitationListOptions(Integer.valueOf(21),
                                                                                                                            Long.valueOf(12),
                                                                                                                            Order.getDefault(),
                                                                                                                            "457cbe80-b243-4edf-95b8-0c5902ec4523",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions2 = new SubtenantUserInvitationListOptions(Integer.valueOf(21),
                                                                                                                            Long.valueOf(12),
                                                                                                                            Order.getDefault(),
                                                                                                                            "457cbe80-b243-4edf-95b8-0c5902ec4523",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantuserinvitationlistoptions1);
            assertNotNull(subtenantuserinvitationlistoptions2);
            assertNotSame(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions2.hashCode(),
                         subtenantuserinvitationlistoptions1.hashCode());
            int hashCode = subtenantuserinvitationlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantuserinvitationlistoptions1.hashCode());
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
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions1 = new SubtenantUserInvitationListOptions(Integer.valueOf(-49),
                                                                                                                            Long.valueOf(-121),
                                                                                                                            Order.getDefault(),
                                                                                                                            "b907e62f-54a7-4032-9b6b-c94047a03e94",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions2 = new SubtenantUserInvitationListOptions(Integer.valueOf(-49),
                                                                                                                            Long.valueOf(-121),
                                                                                                                            Order.getDefault(),
                                                                                                                            "b907e62f-54a7-4032-9b6b-c94047a03e94",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions3 = new SubtenantUserInvitationListOptions(Integer.valueOf(112),
                                                                                                                            Long.valueOf(18),
                                                                                                                            Order.getDefault(),
                                                                                                                            "aacb2338-90c4-42d1-8f96-abad2207718e",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantuserinvitationlistoptions1);
            assertNotNull(subtenantuserinvitationlistoptions2);
            assertNotNull(subtenantuserinvitationlistoptions3);
            assertNotSame(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertNotSame(subtenantuserinvitationlistoptions3, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions1, subtenantuserinvitationlistoptions2);
            assertEquals(subtenantuserinvitationlistoptions1, subtenantuserinvitationlistoptions1);
            assertFalse(subtenantuserinvitationlistoptions1.equals(null));
            assertNotEquals(subtenantuserinvitationlistoptions3, subtenantuserinvitationlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
