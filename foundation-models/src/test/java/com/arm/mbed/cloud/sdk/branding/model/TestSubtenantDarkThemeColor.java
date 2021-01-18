// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantDarkThemeColor.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantDarkThemeColor {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantDarkThemeColor subtenantdarkthemecolor1 = new SubtenantDarkThemeColor("4205bf91-0396-404a-8817-862a4e877bae",
                                                                                           SubtenantDarkThemeColorReference.getDefault(),
                                                                                           new Date(1559758610302L));
            SubtenantDarkThemeColor subtenantdarkthemecolor2 = subtenantdarkthemecolor1.clone();
            assertNotNull(subtenantdarkthemecolor1);
            assertNotNull(subtenantdarkthemecolor2);
            assertNotSame(subtenantdarkthemecolor2, subtenantdarkthemecolor1);
            assertEquals(subtenantdarkthemecolor2, subtenantdarkthemecolor1);
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
            SubtenantDarkThemeColor subtenantdarkthemecolor1 = new SubtenantDarkThemeColor("f2a76d7e-06e4-4f24-b0cf-9b0db06cd8d3",
                                                                                           SubtenantDarkThemeColorReference.getDefault(),
                                                                                           new Date(1559758605434L));
            SubtenantDarkThemeColor subtenantdarkthemecolor2 = new SubtenantDarkThemeColor("f2a76d7e-06e4-4f24-b0cf-9b0db06cd8d3",
                                                                                           SubtenantDarkThemeColorReference.getDefault(),
                                                                                           new Date(1559758605434L));
            assertNotNull(subtenantdarkthemecolor1);
            assertNotNull(subtenantdarkthemecolor2);
            assertNotSame(subtenantdarkthemecolor2, subtenantdarkthemecolor1);
            assertEquals(subtenantdarkthemecolor2, subtenantdarkthemecolor1);
            assertEquals(subtenantdarkthemecolor2.hashCode(), subtenantdarkthemecolor1.hashCode());
            int hashCode = subtenantdarkthemecolor1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantdarkthemecolor1.hashCode());
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
        SubtenantDarkThemeColor subtenantdarkthemecolor = new SubtenantDarkThemeColor("d50e3610-3522-4744-b2ee-2cd8c29c937d",
                                                                                      SubtenantDarkThemeColorReference.getDefault(),
                                                                                      new Date(1559758606830L));
        assertTrue(subtenantdarkthemecolor.isValid());
        SubtenantDarkThemeColor subtenantdarkthemecolorInvalid = new SubtenantDarkThemeColor("4d9c0a4e-7935-4270-98dc-0f6c4e0cef0d",
                                                                                             null,
                                                                                             new Date(1559758605310L));
        assertFalse(subtenantdarkthemecolorInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantDarkThemeColor subtenantdarkthemecolor1 = new SubtenantDarkThemeColor("70b3c8dc-abeb-4e19-8b77-ee4562b59e24",
                                                                                           SubtenantDarkThemeColorReference.getDefault(),
                                                                                           new Date(1559758606542L));
            SubtenantDarkThemeColor subtenantdarkthemecolor2 = new SubtenantDarkThemeColor("70b3c8dc-abeb-4e19-8b77-ee4562b59e24",
                                                                                           SubtenantDarkThemeColorReference.getDefault(),
                                                                                           new Date(1559758606542L));
            SubtenantDarkThemeColor subtenantdarkthemecolor3 = new SubtenantDarkThemeColor("8c67105f-83eb-427f-894b-57a0737096f3",
                                                                                           SubtenantDarkThemeColorReference.getDefault(),
                                                                                           new Date(1559758607136L));
            assertNotNull(subtenantdarkthemecolor1);
            assertNotNull(subtenantdarkthemecolor2);
            assertNotNull(subtenantdarkthemecolor3);
            assertNotSame(subtenantdarkthemecolor2, subtenantdarkthemecolor1);
            assertNotSame(subtenantdarkthemecolor3, subtenantdarkthemecolor1);
            assertEquals(subtenantdarkthemecolor2, subtenantdarkthemecolor1);
            assertEquals(subtenantdarkthemecolor2, subtenantdarkthemecolor1);
            assertEquals(subtenantdarkthemecolor1, subtenantdarkthemecolor2);
            assertEquals(subtenantdarkthemecolor1, subtenantdarkthemecolor1);
            assertFalse(subtenantdarkthemecolor1.equals(null));
            assertNotEquals(subtenantdarkthemecolor3, subtenantdarkthemecolor1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
