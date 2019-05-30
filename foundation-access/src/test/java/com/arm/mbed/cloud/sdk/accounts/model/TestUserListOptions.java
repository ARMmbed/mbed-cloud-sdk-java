// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * Unit tests for Model UserListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUserListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(-119), Long.valueOf(72),
                                                                   Order.getDefault(),
                                                                   "1e34eb46-2ecd-4af7-9cd3-c7f0d6ff5454", null, null);
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
     * Tests the filters method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testFilters() {
        try {
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
            UserListOptions option = new UserListOptions().equalToStatus(UserStatus.getDefault())
                                                          .inStatuses(Arrays.asList(UserStatus.getDefault(),
                                                                                    UserStatus.getDefault(),
                                                                                    UserStatus.getDefault(),
                                                                                    UserStatus.getDefault(),
                                                                                    UserStatus.getDefault()))
                                                          .notInStatuses(Arrays.asList(UserStatus.getDefault(),
                                                                                       UserStatus.getDefault(),
                                                                                       UserStatus.getDefault(),
                                                                                       UserStatus.getDefault()))
                                                          .equalToEmail("a9fc1.e2202@f1085.me");
            assertTrue(option.hasFilters());
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
            assertTrue(option.hasFilters(UserListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(UserListOptions.TAG_FILTER_BY_STATUS, FilterOperator.EQUAL));
            assertNotNull(option.getStatusFilters());
            assertEquals(UserStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(UserListOptions.TAG_FILTER_BY_STATUS,
                                                                    UserStatus.class, option));
            assertTrue(option.hasFilters(UserListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(UserListOptions.TAG_FILTER_BY_STATUS, FilterOperator.IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(UserStatus.getDefault(), UserStatus.getDefault(), UserStatus.getDefault(),
                                       UserStatus.getDefault(), UserStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleInFilter(UserListOptions.TAG_FILTER_BY_STATUS, List.class,
                                                                 option));
            assertTrue(option.hasFilters(UserListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(UserListOptions.TAG_FILTER_BY_STATUS, FilterOperator.NOT_IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(UserStatus.getDefault(), UserStatus.getDefault(), UserStatus.getDefault(),
                                       UserStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleNotInFilter(UserListOptions.TAG_FILTER_BY_STATUS, List.class,
                                                                    option));
            assertTrue(option.hasFilters(UserListOptions.TAG_FILTER_BY_EMAIL));
            assertTrue(option.hasFilter(UserListOptions.TAG_FILTER_BY_EMAIL, FilterOperator.EQUAL));
            assertNotNull(option.getEmailFilters());
            assertEquals("a9fc1.e2202@f1085.me",
                         ListOptionsEncoder.encodeSingleEqualFilter(UserListOptions.TAG_FILTER_BY_EMAIL, String.class,
                                                                    option));
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
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(-43), Long.valueOf(-63),
                                                                   Order.getDefault(),
                                                                   "f5322b93-1dbd-49cd-b651-544146a56527", null, null);
            UserListOptions userlistoptions2 = new UserListOptions(Integer.valueOf(-43), Long.valueOf(-63),
                                                                   Order.getDefault(),
                                                                   "f5322b93-1dbd-49cd-b651-544146a56527", null, null);
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
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(-118), Long.valueOf(104),
                                                                   Order.getDefault(),
                                                                   "b2086c98-f33d-4e48-a926-c20e3e7be26c", null, null);
            UserListOptions userlistoptions2 = new UserListOptions(Integer.valueOf(-118), Long.valueOf(104),
                                                                   Order.getDefault(),
                                                                   "b2086c98-f33d-4e48-a926-c20e3e7be26c", null, null);
            UserListOptions userlistoptions3 = new UserListOptions(Integer.valueOf(52), Long.valueOf(49),
                                                                   Order.getDefault(),
                                                                   "07fa3077-cafe-41e4-9cd6-b3cc484b6c71", null, null);
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
