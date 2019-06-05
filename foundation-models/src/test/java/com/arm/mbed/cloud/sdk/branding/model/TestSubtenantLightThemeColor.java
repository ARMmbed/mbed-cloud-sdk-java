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
            SubtenantLightThemeColor subtenantlightthemecolor1 = new SubtenantLightThemeColor("95f260a5-4742-4f2b-84ce-662a9848cebf",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559746951778L));
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
            SubtenantLightThemeColor subtenantlightthemecolor1 = new SubtenantLightThemeColor("9702dee3-506f-4290-af75-2e4f1d901e3f",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559746952950L));
            SubtenantLightThemeColor subtenantlightthemecolor2 = new SubtenantLightThemeColor("9702dee3-506f-4290-af75-2e4f1d901e3f",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559746952950L));
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
        SubtenantLightThemeColor subtenantlightthemecolor = new SubtenantLightThemeColor("6592fd1d-f9ec-4847-bc9d-c1af585d7dfd",
                                                                                         SubtenantLightThemeColorReference.getDefault(),
                                                                                         new Date(1559746947286L));
        assertTrue(subtenantlightthemecolor.isValid());
        SubtenantLightThemeColor subtenantlightthemecolorInvalid = new SubtenantLightThemeColor("74a1680a-2ab7-4b32-866c-66968255c4e3",
                                                                                                SubtenantLightThemeColorReference.getDefault(),
                                                                                                new Date(1559746955726L));
        assertFalse(subtenantlightthemecolorInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantLightThemeColor subtenantlightthemecolor1 = new SubtenantLightThemeColor("d5a3b664-d495-428a-a13f-3f7bd1ec28b2",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559746953563L));
            SubtenantLightThemeColor subtenantlightthemecolor2 = new SubtenantLightThemeColor("d5a3b664-d495-428a-a13f-3f7bd1ec28b2",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559746953563L));
            SubtenantLightThemeColor subtenantlightthemecolor3 = new SubtenantLightThemeColor("f85d5876-4eb9-45d6-add9-166a46226d0f",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559746953627L));
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
