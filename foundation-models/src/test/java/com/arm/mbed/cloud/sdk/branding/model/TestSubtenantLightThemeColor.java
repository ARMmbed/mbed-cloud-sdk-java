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
            SubtenantLightThemeColor subtenantlightthemecolor1 = new SubtenantLightThemeColor("c70d1c85-2eb2-4d5f-b852-10daa189a2eb",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559758608923L));
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
            SubtenantLightThemeColor subtenantlightthemecolor1 = new SubtenantLightThemeColor("34116fe2-b396-4368-ba88-b1b4426a7962",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559758605216L));
            SubtenantLightThemeColor subtenantlightthemecolor2 = new SubtenantLightThemeColor("34116fe2-b396-4368-ba88-b1b4426a7962",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559758605216L));
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
    // @Test
    public void testIsValid() {
        SubtenantLightThemeColor subtenantlightthemecolor = new SubtenantLightThemeColor("a66ae0a6-687d-4067-8cbc-7d89b07742f0",
                                                                                         SubtenantLightThemeColorReference.getDefault(),
                                                                                         new Date(1559758610190L));
        assertTrue(subtenantlightthemecolor.isValid());
        SubtenantLightThemeColor subtenantlightthemecolorInvalid = new SubtenantLightThemeColor("d2ecf8f5-8bfc-4f96-8337-7e29b477ef30",
                                                                                                null,
                                                                                                new Date(1559758609702L));
        assertFalse(subtenantlightthemecolorInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantLightThemeColor subtenantlightthemecolor1 = new SubtenantLightThemeColor("649671a8-48c7-4699-801a-7c4d4809a371",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559758605567L));
            SubtenantLightThemeColor subtenantlightthemecolor2 = new SubtenantLightThemeColor("649671a8-48c7-4699-801a-7c4d4809a371",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559758605567L));
            SubtenantLightThemeColor subtenantlightthemecolor3 = new SubtenantLightThemeColor("e8577296-9d6c-4124-be6f-3a32c2902d9c",
                                                                                              SubtenantLightThemeColorReference.getDefault(),
                                                                                              new Date(1559758606123L));
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
