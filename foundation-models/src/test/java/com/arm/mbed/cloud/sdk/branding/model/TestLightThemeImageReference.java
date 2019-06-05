// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model LightThemeImageReference.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLightThemeImageReference {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            LightThemeImageReference lightthemeimagereference = LightThemeImageReference.getValue(null);
            assertNotNull(lightthemeimagereference);
            assertTrue(lightthemeimagereference.isDefault());
            lightthemeimagereference = LightThemeImageReference.getValue(LightThemeImageReference.getDefault()
                                                                                                 .getString());
            assertNotNull(lightthemeimagereference);
            assertTrue(lightthemeimagereference.isDefault());
            lightthemeimagereference = LightThemeImageReference.getValue("BRAND_LOGO_EMAIL");
            assertNotNull(lightthemeimagereference);
            assertTrue(lightthemeimagereference.isDefault());
            lightthemeimagereference = LightThemeImageReference.getValue("brand_logo_landscape");
            assertNotNull(lightthemeimagereference);
            assertFalse(lightthemeimagereference.isDefault());
            lightthemeimagereference = LightThemeImageReference.getValue("4c95278d-b48d-4f4a-b569-ff15282c453a");
            assertNotNull(lightthemeimagereference);
            assertTrue(lightthemeimagereference.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}