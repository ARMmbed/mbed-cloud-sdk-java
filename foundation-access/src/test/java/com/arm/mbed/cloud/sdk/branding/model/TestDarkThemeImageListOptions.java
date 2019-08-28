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
            DarkThemeImageListOptions darkthemeimagelistoptions1 = new DarkThemeImageListOptions(Integer.valueOf(-8),
                                                                                                 Long.valueOf(-69),
                                                                                                 Order.getDefault(),
                                                                                                 "9b526beb-c0fd-4300-8a39-2713d7fb121d",
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
            DarkThemeImageListOptions darkthemeimagelistoptions1 = new DarkThemeImageListOptions(Integer.valueOf(-59),
                                                                                                 Long.valueOf(48),
                                                                                                 Order.getDefault(),
                                                                                                 "fb662f60-13db-435e-a4de-4e3602aaf80b",
                                                                                                 null, null);
            DarkThemeImageListOptions darkthemeimagelistoptions2 = new DarkThemeImageListOptions(Integer.valueOf(-59),
                                                                                                 Long.valueOf(48),
                                                                                                 Order.getDefault(),
                                                                                                 "fb662f60-13db-435e-a4de-4e3602aaf80b",
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
            DarkThemeImageListOptions darkthemeimagelistoptions1 = new DarkThemeImageListOptions(Integer.valueOf(15),
                                                                                                 Long.valueOf(86),
                                                                                                 Order.getDefault(),
                                                                                                 "416df4e2-4fcf-4db6-a2b0-8112661eb977",
                                                                                                 null, null);
            DarkThemeImageListOptions darkthemeimagelistoptions2 = new DarkThemeImageListOptions(Integer.valueOf(15),
                                                                                                 Long.valueOf(86),
                                                                                                 Order.getDefault(),
                                                                                                 "416df4e2-4fcf-4db6-a2b0-8112661eb977",
                                                                                                 null, null);
            DarkThemeImageListOptions darkthemeimagelistoptions3 = new DarkThemeImageListOptions(Integer.valueOf(-96),
                                                                                                 Long.valueOf(117),
                                                                                                 Order.getDefault(),
                                                                                                 "a7eb2502-7926-4510-8735-40cf6cbadfe2",
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
