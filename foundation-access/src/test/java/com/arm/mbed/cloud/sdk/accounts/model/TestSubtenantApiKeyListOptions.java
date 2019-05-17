// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantApiKeyListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantApiKeyListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantApiKeyListOptions subtenantapikeylistoptions1 = new SubtenantApiKeyListOptions(Integer.valueOf(-47),
                                                                                                    Long.valueOf(-4),
                                                                                                    Order.getDefault(),
                                                                                                    "ea2679ef-9d06-41f7-bfe9-5764ff8f3eb1",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions2 = subtenantapikeylistoptions1.clone();
            assertNotNull(subtenantapikeylistoptions1);
            assertNotNull(subtenantapikeylistoptions2);
            assertNotSame(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
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
            SubtenantApiKeyListOptions option = new SubtenantApiKeyListOptions().equalToOwner("830a4960-2415-4137-a933-78418e05b939")
                                                                                .equalToKey("7f019948-d4c5-4357-a900-f8b5ac2f1ae3");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(SubtenantApiKeyListOptions.TAG_FILTER_BY_OWNER));
            assertTrue(option.hasFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_OWNER, FilterOperator.EQUAL));
            assertNotNull(option.getOwnerFilters());
            assertEquals("830a4960-2415-4137-a933-78418e05b939",
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_OWNER,
                                                                    String.class, option));
            assertTrue(option.hasFilters(SubtenantApiKeyListOptions.TAG_FILTER_BY_KEY));
            assertTrue(option.hasFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_KEY, FilterOperator.EQUAL));
            assertNotNull(option.getKeyFilters());
            assertEquals("7f019948-d4c5-4357-a900-f8b5ac2f1ae3",
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_KEY,
                                                                    String.class, option));
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
            SubtenantApiKeyListOptions subtenantapikeylistoptions1 = new SubtenantApiKeyListOptions(Integer.valueOf(-26),
                                                                                                    Long.valueOf(45),
                                                                                                    Order.getDefault(),
                                                                                                    "8f41051e-b514-41ae-9211-f87c6a9ca0b2",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions2 = new SubtenantApiKeyListOptions(Integer.valueOf(-26),
                                                                                                    Long.valueOf(45),
                                                                                                    Order.getDefault(),
                                                                                                    "8f41051e-b514-41ae-9211-f87c6a9ca0b2",
                                                                                                    null, null);
            assertNotNull(subtenantapikeylistoptions1);
            assertNotNull(subtenantapikeylistoptions2);
            assertNotSame(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions2.hashCode(), subtenantapikeylistoptions1.hashCode());
            int hashCode = subtenantapikeylistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantapikeylistoptions1.hashCode());
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
            SubtenantApiKeyListOptions subtenantapikeylistoptions1 = new SubtenantApiKeyListOptions(Integer.valueOf(-115),
                                                                                                    Long.valueOf(-1),
                                                                                                    Order.getDefault(),
                                                                                                    "689fc9a7-c9cf-4452-b168-e0587b8537bc",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions2 = new SubtenantApiKeyListOptions(Integer.valueOf(-115),
                                                                                                    Long.valueOf(-1),
                                                                                                    Order.getDefault(),
                                                                                                    "689fc9a7-c9cf-4452-b168-e0587b8537bc",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions3 = new SubtenantApiKeyListOptions(Integer.valueOf(-18),
                                                                                                    Long.valueOf(-80),
                                                                                                    Order.getDefault(),
                                                                                                    "ce8ef409-25a2-4d27-9063-d8a6762ed613",
                                                                                                    null, null);
            assertNotNull(subtenantapikeylistoptions1);
            assertNotNull(subtenantapikeylistoptions2);
            assertNotNull(subtenantapikeylistoptions3);
            assertNotSame(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertNotSame(subtenantapikeylistoptions3, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions1, subtenantapikeylistoptions2);
            assertEquals(subtenantapikeylistoptions1, subtenantapikeylistoptions1);
            assertFalse(subtenantapikeylistoptions1.equals(null));
            assertNotEquals(subtenantapikeylistoptions3, subtenantapikeylistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
