// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantLightThemeColor.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantLightThemeColor {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantLightThemeColor subtenantlightthemecolor1 = new SubtenantLightThemeColor("79550eee-da68-40f6-97ef-070e1adacd4d",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559662783452L));
            SubtenantLightThemeColor subtenantlightthemecolor2 = subtenantlightthemecolor1.clone();
            assertNotNull(subtenantlightthemecolor1);
            assertNotNull(subtenantlightthemecolor2);
            assertNotSame(subtenantlightthemecolor2, subtenantlightthemecolor1);
            assertEquals(subtenantlightthemecolor2, subtenantlightthemecolor1);
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
            SubtenantLightThemeColor subtenantlightthemecolor1 = new SubtenantLightThemeColor("232e376f-7300-4ee4-bdb9-aa8a21f8c53c",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559662782699L));
            SubtenantLightThemeColor subtenantlightthemecolor2 = new SubtenantLightThemeColor("232e376f-7300-4ee4-bdb9-aa8a21f8c53c",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559662782699L));
            assertNotNull(subtenantlightthemecolor1);
            assertNotNull(subtenantlightthemecolor2);
            assertNotSame(subtenantlightthemecolor2, subtenantlightthemecolor1);
            assertEquals(subtenantlightthemecolor2, subtenantlightthemecolor1);
            assertEquals(subtenantlightthemecolor2.hashCode(), subtenantlightthemecolor1.hashCode());
            int hashCode = subtenantlightthemecolor1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantlightthemecolor1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        SubtenantLightThemeColor subtenantlightthemecolor = new SubtenantLightThemeColor("d4ca3c17-d8e0-48d3-830a-7fefa9f6c100",
                                                                                         SubtenantLightThemeColorReference.getDefault(),
                                                                                         new Date(1559662785905L));
        assertTrue(subtenantlightthemecolor.isValid());
        SubtenantLightThemeColor subtenantlightthemecolorInvalid = new SubtenantLightThemeColor("d24741f2-e14e-4450-a4b2-2cbcaf225a54",
                                                                                                SubtenantLightThemeColorReference.getDefault(),
                                                                                                new Date(1559662784886L));
        assertFalse(subtenantlightthemecolorInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantLightThemeColor subtenantlightthemecolor1 = new SubtenantLightThemeColor("af872099-605d-469d-a334-38fd5268c481",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559662780148L));
            SubtenantLightThemeColor subtenantlightthemecolor2 = new SubtenantLightThemeColor("af872099-605d-469d-a334-38fd5268c481",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559662780148L));
            SubtenantLightThemeColor subtenantlightthemecolor3 = new SubtenantLightThemeColor("8d86f15e-ae93-4d82-bdab-cdeee0b771b4",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559662777981L));
            assertNotNull(subtenantlightthemecolor1);
            assertNotNull(subtenantlightthemecolor2);
            assertNotNull(subtenantlightthemecolor3);
            assertNotSame(subtenantlightthemecolor2, subtenantlightthemecolor1);
            assertNotSame(subtenantlightthemecolor3, subtenantlightthemecolor1);
            assertEquals(subtenantlightthemecolor2, subtenantlightthemecolor1);
            assertEquals(subtenantlightthemecolor2, subtenantlightthemecolor1);
            assertEquals(subtenantlightthemecolor1, subtenantlightthemecolor2);
            assertEquals(subtenantlightthemecolor1, subtenantlightthemecolor1);
            assertFalse(subtenantlightthemecolor1.equals(null));
            assertNotEquals(subtenantlightthemecolor3, subtenantlightthemecolor1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
