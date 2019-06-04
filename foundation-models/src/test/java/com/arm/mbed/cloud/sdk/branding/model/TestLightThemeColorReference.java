// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model LightThemeColorReference.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLightThemeColorReference {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            LightThemeColorReference lightthemecolorreference = LightThemeColorReference.getValue(null);
            assertNotNull(lightthemecolorreference);
            assertTrue(lightthemecolorreference.isDefault());
            lightthemecolorreference = LightThemeColorReference.getValue(LightThemeColorReference.getDefault()
                                                                                                 .getString());
            assertNotNull(lightthemecolorreference);
            assertTrue(lightthemecolorreference.isDefault());
            lightthemecolorreference = LightThemeColorReference.getValue("CANVAS_BACKGROUND");
            assertNotNull(lightthemecolorreference);
            assertTrue(lightthemecolorreference.isDefault());
            lightthemecolorreference = LightThemeColorReference.getValue("canvas_background_font_color");
            assertNotNull(lightthemecolorreference);
            assertFalse(lightthemecolorreference.isDefault());
            lightthemecolorreference = LightThemeColorReference.getValue("ced7a749-0da0-4473-bf2f-b6d358087d44");
            assertNotNull(lightthemecolorreference);
            assertTrue(lightthemecolorreference.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
