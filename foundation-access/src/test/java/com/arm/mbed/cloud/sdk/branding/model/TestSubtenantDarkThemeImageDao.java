// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Tue Jun 04 15:39:38 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantDarkThemeImageDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantDarkThemeImageDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantDarkThemeImageDao subtenantdarkthemeimagedao1 = new SubtenantDarkThemeImageDao();
            SubtenantDarkThemeImageDao subtenantdarkthemeimagedao2 = subtenantdarkthemeimagedao1.clone();
            assertNotNull(subtenantdarkthemeimagedao1);
            assertNotNull(subtenantdarkthemeimagedao2);
            assertNotSame(subtenantdarkthemeimagedao2, subtenantdarkthemeimagedao1);
            assertEquals(subtenantdarkthemeimagedao2, subtenantdarkthemeimagedao1);
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
            SubtenantDarkThemeImageDao subtenantdarkthemeimagedao1 = new SubtenantDarkThemeImageDao();
            SubtenantDarkThemeImageDao subtenantdarkthemeimagedao2 = new SubtenantDarkThemeImageDao();
            assertNotNull(subtenantdarkthemeimagedao1);
            assertNotNull(subtenantdarkthemeimagedao2);
            assertNotSame(subtenantdarkthemeimagedao2, subtenantdarkthemeimagedao1);
            assertEquals(subtenantdarkthemeimagedao2, subtenantdarkthemeimagedao1);
            assertEquals(subtenantdarkthemeimagedao2.hashCode(), subtenantdarkthemeimagedao1.hashCode());
            int hashCode = subtenantdarkthemeimagedao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantdarkthemeimagedao1.hashCode());
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
            SubtenantDarkThemeImageDao subtenantdarkthemeimagedao1 = new SubtenantDarkThemeImageDao();
            SubtenantDarkThemeImageDao subtenantdarkthemeimagedao2 = new SubtenantDarkThemeImageDao();
            assertNotNull(subtenantdarkthemeimagedao1);
            assertNotNull(subtenantdarkthemeimagedao2);
            assertNotSame(subtenantdarkthemeimagedao2, subtenantdarkthemeimagedao1);
            assertEquals(subtenantdarkthemeimagedao2, subtenantdarkthemeimagedao1);
            assertEquals(subtenantdarkthemeimagedao2, subtenantdarkthemeimagedao1);
            assertEquals(subtenantdarkthemeimagedao1, subtenantdarkthemeimagedao2);
            assertEquals(subtenantdarkthemeimagedao1, subtenantdarkthemeimagedao1);
            assertFalse(subtenantdarkthemeimagedao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}