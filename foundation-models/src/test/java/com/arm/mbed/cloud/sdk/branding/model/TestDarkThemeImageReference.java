// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DarkThemeImageReference.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDarkThemeImageReference {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            DarkThemeImageReference darkthemeimagereference = DarkThemeImageReference.getValue(null);
            assertNotNull(darkthemeimagereference);
            assertTrue(darkthemeimagereference.isDefault());
            darkthemeimagereference = DarkThemeImageReference.getValue(DarkThemeImageReference.getDefault()
                                                                                              .getString());
            assertNotNull(darkthemeimagereference);
            assertTrue(darkthemeimagereference.isDefault());
            darkthemeimagereference = DarkThemeImageReference.getValue("BRAND_LOGO_EMAIL");
            assertNotNull(darkthemeimagereference);
            assertTrue(darkthemeimagereference.isDefault());
            darkthemeimagereference = DarkThemeImageReference.getValue("brand_logo_landscape");
            assertNotNull(darkthemeimagereference);
            assertFalse(darkthemeimagereference.isDefault());
            darkthemeimagereference = DarkThemeImageReference.getValue("7da6673d-edef-4a78-8bf4-51db86d36131");
            assertNotNull(darkthemeimagereference);
            assertTrue(darkthemeimagereference.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
