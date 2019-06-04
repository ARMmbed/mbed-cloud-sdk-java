// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model DarkThemeImageListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDarkThemeImageListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DarkThemeImageListOptions darkthemeimagelistoptions1 = new DarkThemeImageListOptions(Integer.valueOf(40),
                                                                                                 Long.valueOf(-68),
                                                                                                 Order.getDefault(),
                                                                                                 "ebd25bd8-8c58-49cd-963b-aa295072cb41",
                                                                                                 null, null);
            DarkThemeImageListOptions darkthemeimagelistoptions2 = darkthemeimagelistoptions1.clone();
            assertNotNull(darkthemeimagelistoptions1);
            assertNotNull(darkthemeimagelistoptions2);
            assertNotSame(darkthemeimagelistoptions2, darkthemeimagelistoptions1);
            assertEquals(darkthemeimagelistoptions2, darkthemeimagelistoptions1);
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
            DarkThemeImageListOptions darkthemeimagelistoptions1 = new DarkThemeImageListOptions(Integer.valueOf(-42),
                                                                                                 Long.valueOf(-110),
                                                                                                 Order.getDefault(),
                                                                                                 "86dc8686-bd11-49d9-ae5c-b80589753524",
                                                                                                 null, null);
            DarkThemeImageListOptions darkthemeimagelistoptions2 = new DarkThemeImageListOptions(Integer.valueOf(-42),
                                                                                                 Long.valueOf(-110),
                                                                                                 Order.getDefault(),
                                                                                                 "86dc8686-bd11-49d9-ae5c-b80589753524",
                                                                                                 null, null);
            assertNotNull(darkthemeimagelistoptions1);
            assertNotNull(darkthemeimagelistoptions2);
            assertNotSame(darkthemeimagelistoptions2, darkthemeimagelistoptions1);
            assertEquals(darkthemeimagelistoptions2, darkthemeimagelistoptions1);
            assertEquals(darkthemeimagelistoptions2.hashCode(), darkthemeimagelistoptions1.hashCode());
            int hashCode = darkthemeimagelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, darkthemeimagelistoptions1.hashCode());
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
            DarkThemeImageListOptions darkthemeimagelistoptions1 = new DarkThemeImageListOptions(Integer.valueOf(-42),
                                                                                                 Long.valueOf(115),
                                                                                                 Order.getDefault(),
                                                                                                 "9990712d-f88a-4131-8990-1f9df0c2b95e",
                                                                                                 null, null);
            DarkThemeImageListOptions darkthemeimagelistoptions2 = new DarkThemeImageListOptions(Integer.valueOf(-42),
                                                                                                 Long.valueOf(115),
                                                                                                 Order.getDefault(),
                                                                                                 "9990712d-f88a-4131-8990-1f9df0c2b95e",
                                                                                                 null, null);
            DarkThemeImageListOptions darkthemeimagelistoptions3 = new DarkThemeImageListOptions(Integer.valueOf(26),
                                                                                                 Long.valueOf(99),
                                                                                                 Order.getDefault(),
                                                                                                 "9919c1f5-1c97-40ec-8f46-d2df88b514e0",
                                                                                                 null, null);
            assertNotNull(darkthemeimagelistoptions1);
            assertNotNull(darkthemeimagelistoptions2);
            assertNotNull(darkthemeimagelistoptions3);
            assertNotSame(darkthemeimagelistoptions2, darkthemeimagelistoptions1);
            assertNotSame(darkthemeimagelistoptions3, darkthemeimagelistoptions1);
            assertEquals(darkthemeimagelistoptions2, darkthemeimagelistoptions1);
            assertEquals(darkthemeimagelistoptions2, darkthemeimagelistoptions1);
            assertEquals(darkthemeimagelistoptions1, darkthemeimagelistoptions2);
            assertEquals(darkthemeimagelistoptions1, darkthemeimagelistoptions1);
            assertFalse(darkthemeimagelistoptions1.equals(null));
            assertNotEquals(darkthemeimagelistoptions3, darkthemeimagelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
