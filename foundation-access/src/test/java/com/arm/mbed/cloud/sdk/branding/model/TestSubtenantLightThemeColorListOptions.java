// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantLightThemeColorListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantLightThemeColorListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-12),
                                                                                                                               Long.valueOf(104),
                                                                                                                               Order.getDefault(),
                                                                                                                               "15a73354-d065-4b0f-b818-b6a4b9895824",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = subtenantlightthemecolorlistoptions1.clone();
            assertNotNull(subtenantlightthemecolorlistoptions1);
            assertNotNull(subtenantlightthemecolorlistoptions2);
            assertNotSame(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(35),
                                                                                                                               Long.valueOf(64),
                                                                                                                               Order.getDefault(),
                                                                                                                               "8d2f2b95-835a-4bb3-9e9d-24a835af7137",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = new SubtenantLightThemeColorListOptions(Integer.valueOf(35),
                                                                                                                               Long.valueOf(64),
                                                                                                                               Order.getDefault(),
                                                                                                                               "8d2f2b95-835a-4bb3-9e9d-24a835af7137",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(subtenantlightthemecolorlistoptions1);
            assertNotNull(subtenantlightthemecolorlistoptions2);
            assertNotSame(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions2.hashCode(),
                         subtenantlightthemecolorlistoptions1.hashCode());
            int hashCode = subtenantlightthemecolorlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantlightthemecolorlistoptions1.hashCode());
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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-125),
                                                                                                                               Long.valueOf(71),
                                                                                                                               Order.getDefault(),
                                                                                                                               "fff0305b-b05f-439a-9f63-8dc764b93b45",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-125),
                                                                                                                               Long.valueOf(71),
                                                                                                                               Order.getDefault(),
                                                                                                                               "fff0305b-b05f-439a-9f63-8dc764b93b45",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions3 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-17),
                                                                                                                               Long.valueOf(-87),
                                                                                                                               Order.getDefault(),
                                                                                                                               "e8b3fab0-b1ee-4b1e-8e68-1fd26d87f65c",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(subtenantlightthemecolorlistoptions1);
            assertNotNull(subtenantlightthemecolorlistoptions2);
            assertNotNull(subtenantlightthemecolorlistoptions3);
            assertNotSame(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertNotSame(subtenantlightthemecolorlistoptions3, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions1, subtenantlightthemecolorlistoptions2);
            assertEquals(subtenantlightthemecolorlistoptions1, subtenantlightthemecolorlistoptions1);
            assertFalse(subtenantlightthemecolorlistoptions1.equals(null));
            assertNotEquals(subtenantlightthemecolorlistoptions3, subtenantlightthemecolorlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
