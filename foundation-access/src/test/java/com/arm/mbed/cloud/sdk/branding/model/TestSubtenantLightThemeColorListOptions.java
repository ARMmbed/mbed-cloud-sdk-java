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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(100),
                                                                                                                               Long.valueOf(117),
                                                                                                                               Order.getDefault(),
                                                                                                                               "f20398e3-6d9d-415a-8ac5-0ca4a120edcc",
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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(28),
                                                                                                                               Long.valueOf(-26),
                                                                                                                               Order.getDefault(),
                                                                                                                               "833acf42-7039-42a5-8bc2-6473af806111",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = new SubtenantLightThemeColorListOptions(Integer.valueOf(28),
                                                                                                                               Long.valueOf(-26),
                                                                                                                               Order.getDefault(),
                                                                                                                               "833acf42-7039-42a5-8bc2-6473af806111",
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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-54),
                                                                                                                               Long.valueOf(-59),
                                                                                                                               Order.getDefault(),
                                                                                                                               "4e90a47a-3b3b-473b-8d6c-5b50b050fcdc",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-54),
                                                                                                                               Long.valueOf(-59),
                                                                                                                               Order.getDefault(),
                                                                                                                               "4e90a47a-3b3b-473b-8d6c-5b50b050fcdc",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions3 = new SubtenantLightThemeColorListOptions(Integer.valueOf(41),
                                                                                                                               Long.valueOf(87),
                                                                                                                               Order.getDefault(),
                                                                                                                               "ae80c1a3-72db-4d7c-9c42-e9a644eb0591",
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
