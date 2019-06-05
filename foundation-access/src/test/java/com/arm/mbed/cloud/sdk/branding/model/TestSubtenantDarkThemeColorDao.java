// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Tue Jun 04 15:39:38 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantDarkThemeColorDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantDarkThemeColorDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantDarkThemeColorDao subtenantdarkthemecolordao1 = new SubtenantDarkThemeColorDao();
            SubtenantDarkThemeColorDao subtenantdarkthemecolordao2 = subtenantdarkthemecolordao1.clone();
            assertNotNull(subtenantdarkthemecolordao1);
            assertNotNull(subtenantdarkthemecolordao2);
            assertNotSame(subtenantdarkthemecolordao2, subtenantdarkthemecolordao1);
            assertEquals(subtenantdarkthemecolordao2, subtenantdarkthemecolordao1);
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
            SubtenantDarkThemeColorDao subtenantdarkthemecolordao1 = new SubtenantDarkThemeColorDao();
            SubtenantDarkThemeColorDao subtenantdarkthemecolordao2 = new SubtenantDarkThemeColorDao();
            assertNotNull(subtenantdarkthemecolordao1);
            assertNotNull(subtenantdarkthemecolordao2);
            assertNotSame(subtenantdarkthemecolordao2, subtenantdarkthemecolordao1);
            assertEquals(subtenantdarkthemecolordao2, subtenantdarkthemecolordao1);
            assertEquals(subtenantdarkthemecolordao2.hashCode(), subtenantdarkthemecolordao1.hashCode());
            int hashCode = subtenantdarkthemecolordao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantdarkthemecolordao1.hashCode());
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
            SubtenantDarkThemeColorDao subtenantdarkthemecolordao1 = new SubtenantDarkThemeColorDao();
            SubtenantDarkThemeColorDao subtenantdarkthemecolordao2 = new SubtenantDarkThemeColorDao();
            assertNotNull(subtenantdarkthemecolordao1);
            assertNotNull(subtenantdarkthemecolordao2);
            assertNotSame(subtenantdarkthemecolordao2, subtenantdarkthemecolordao1);
            assertEquals(subtenantdarkthemecolordao2, subtenantdarkthemecolordao1);
            assertEquals(subtenantdarkthemecolordao2, subtenantdarkthemecolordao1);
            assertEquals(subtenantdarkthemecolordao1, subtenantdarkthemecolordao2);
            assertEquals(subtenantdarkthemecolordao1, subtenantdarkthemecolordao1);
            assertFalse(subtenantdarkthemecolordao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}