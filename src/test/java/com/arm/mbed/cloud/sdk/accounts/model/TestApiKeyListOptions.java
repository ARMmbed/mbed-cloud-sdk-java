// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model ApiKeyListOptions.
 */
public class TestApiKeyListOptions {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(-61), Long.valueOf(97),
                                                                         Order.getDefault(),
                                                                         "e8d1a66a-d738-46f1-884c-80dfcdfb5501", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = apikeylistoptions1.clone();
            assertNotNull(apikeylistoptions1);
            assertNotNull(apikeylistoptions2);
            assertNotSame(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(-106), Long.valueOf(-87),
                                                                         Order.getDefault(),
                                                                         "4444b43b-b57a-411a-9f81-28e90a8ac7a0", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(Integer.valueOf(-106), Long.valueOf(-87),
                                                                         Order.getDefault(),
                                                                         "4444b43b-b57a-411a-9f81-28e90a8ac7a0", null,
                                                                         null);
            assertNotNull(apikeylistoptions1);
            assertNotNull(apikeylistoptions2);
            assertNotSame(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2.hashCode(), apikeylistoptions1.hashCode());
            int hashCode = apikeylistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, apikeylistoptions1.hashCode());
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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(8), Long.valueOf(-85),
                                                                         Order.getDefault(),
                                                                         "e7baa939-786b-44e7-a422-82d792009471", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(Integer.valueOf(8), Long.valueOf(-85),
                                                                         Order.getDefault(),
                                                                         "e7baa939-786b-44e7-a422-82d792009471", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions3 = new ApiKeyListOptions(Integer.valueOf(-67), Long.valueOf(-78),
                                                                         Order.getDefault(),
                                                                         "17f9ac23-9217-40ed-8207-8af32858cbf7", null,
                                                                         null);
            assertNotNull(apikeylistoptions1);
            assertNotNull(apikeylistoptions2);
            assertNotNull(apikeylistoptions3);
            assertNotSame(apikeylistoptions2, apikeylistoptions1);
            assertNotSame(apikeylistoptions3, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions1, apikeylistoptions2);
            assertEquals(apikeylistoptions1, apikeylistoptions1);
            assertFalse(apikeylistoptions1.equals(null));
            assertNotEquals(apikeylistoptions3, apikeylistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}