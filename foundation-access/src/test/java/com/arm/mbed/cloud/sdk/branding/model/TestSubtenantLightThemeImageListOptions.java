// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantLightThemeImageListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantLightThemeImageListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions1 = new SubtenantLightThemeImageListOptions(Integer.valueOf(0),
                                                                                                                               Long.valueOf(-92),
                                                                                                                               Order.getDefault(),
                                                                                                                               "9629d383-ca8c-4071-836a-73c08097c0c0",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions2 = subtenantlightthemeimagelistoptions1.clone();
            assertNotNull(subtenantlightthemeimagelistoptions1);
            assertNotNull(subtenantlightthemeimagelistoptions2);
            assertNotSame(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
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
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions1 = new SubtenantLightThemeImageListOptions(Integer.valueOf(105),
                                                                                                                               Long.valueOf(90),
                                                                                                                               Order.getDefault(),
                                                                                                                               "7184e957-dcac-46f4-b8ee-416bf8fe806c",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions2 = new SubtenantLightThemeImageListOptions(Integer.valueOf(105),
                                                                                                                               Long.valueOf(90),
                                                                                                                               Order.getDefault(),
                                                                                                                               "7184e957-dcac-46f4-b8ee-416bf8fe806c",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(subtenantlightthemeimagelistoptions1);
            assertNotNull(subtenantlightthemeimagelistoptions2);
            assertNotSame(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2.hashCode(),
                         subtenantlightthemeimagelistoptions1.hashCode());
            int hashCode = subtenantlightthemeimagelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantlightthemeimagelistoptions1.hashCode());
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
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions1 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-44),
                                                                                                                               Long.valueOf(-53),
                                                                                                                               Order.getDefault(),
                                                                                                                               "73fa7fc6-b8b3-4317-a78d-cd009734b34d",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions2 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-44),
                                                                                                                               Long.valueOf(-53),
                                                                                                                               Order.getDefault(),
                                                                                                                               "73fa7fc6-b8b3-4317-a78d-cd009734b34d",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions3 = new SubtenantLightThemeImageListOptions(Integer.valueOf(4),
                                                                                                                               Long.valueOf(-123),
                                                                                                                               Order.getDefault(),
                                                                                                                               "fc51538f-77d1-4466-9580-efb3247b4600",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(subtenantlightthemeimagelistoptions1);
            assertNotNull(subtenantlightthemeimagelistoptions2);
            assertNotNull(subtenantlightthemeimagelistoptions3);
            assertNotSame(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertNotSame(subtenantlightthemeimagelistoptions3, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions1, subtenantlightthemeimagelistoptions2);
            assertEquals(subtenantlightthemeimagelistoptions1, subtenantlightthemeimagelistoptions1);
            assertFalse(subtenantlightthemeimagelistoptions1.equals(null));
            assertNotEquals(subtenantlightthemeimagelistoptions3, subtenantlightthemeimagelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
