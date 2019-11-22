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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-40),
                                                                                                                               Long.valueOf(-77),
                                                                                                                               Order.getDefault(),
                                                                                                                               "6f3656ad-b117-41d7-896d-c66bd055560c",
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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-88),
                                                                                                                               Long.valueOf(33),
                                                                                                                               Order.getDefault(),
                                                                                                                               "4d509a23-3c0a-4f88-9eed-62cdf4b32e38",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-88),
                                                                                                                               Long.valueOf(33),
                                                                                                                               Order.getDefault(),
                                                                                                                               "4d509a23-3c0a-4f88-9eed-62cdf4b32e38",
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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-23),
                                                                                                                               Long.valueOf(-32),
                                                                                                                               Order.getDefault(),
                                                                                                                               "3739cac9-4272-41cf-b813-ebfa529b7c61",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-23),
                                                                                                                               Long.valueOf(-32),
                                                                                                                               Order.getDefault(),
                                                                                                                               "3739cac9-4272-41cf-b813-ebfa529b7c61",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions3 = new SubtenantLightThemeColorListOptions(Integer.valueOf(5),
                                                                                                                               Long.valueOf(-5),
                                                                                                                               Order.getDefault(),
                                                                                                                               "0ee9ad68-9216-4ac3-b27d-678a12962e54",
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
