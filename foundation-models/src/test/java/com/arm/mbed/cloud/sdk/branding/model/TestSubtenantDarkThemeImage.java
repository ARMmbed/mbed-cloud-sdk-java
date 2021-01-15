// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantDarkThemeImage.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantDarkThemeImage {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantDarkThemeImage subtenantdarkthemeimage1 = new SubtenantDarkThemeImage(SubtenantDarkThemeImageReference.getDefault(),
                                                                                           "4be3bdf9-26b9-4a28-a9d5-dfa142255cf8",
                                                                                           new Date(1559758606635L));
            SubtenantDarkThemeImage subtenantdarkthemeimage2 = subtenantdarkthemeimage1.clone();
            assertNotNull(subtenantdarkthemeimage1);
            assertNotNull(subtenantdarkthemeimage2);
            assertNotSame(subtenantdarkthemeimage2, subtenantdarkthemeimage1);
            assertEquals(subtenantdarkthemeimage2, subtenantdarkthemeimage1);
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
            SubtenantDarkThemeImage subtenantdarkthemeimage1 = new SubtenantDarkThemeImage(SubtenantDarkThemeImageReference.getDefault(),
                                                                                           "dc65f9c2-c28b-445c-91b8-f48511c986cf",
                                                                                           new Date(1559758611092L));
            SubtenantDarkThemeImage subtenantdarkthemeimage2 = new SubtenantDarkThemeImage(SubtenantDarkThemeImageReference.getDefault(),
                                                                                           "dc65f9c2-c28b-445c-91b8-f48511c986cf",
                                                                                           new Date(1559758611092L));
            assertNotNull(subtenantdarkthemeimage1);
            assertNotNull(subtenantdarkthemeimage2);
            assertNotSame(subtenantdarkthemeimage2, subtenantdarkthemeimage1);
            assertEquals(subtenantdarkthemeimage2, subtenantdarkthemeimage1);
            assertEquals(subtenantdarkthemeimage2.hashCode(), subtenantdarkthemeimage1.hashCode());
            int hashCode = subtenantdarkthemeimage1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantdarkthemeimage1.hashCode());
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
        SubtenantDarkThemeImage subtenantdarkthemeimage = new SubtenantDarkThemeImage(SubtenantDarkThemeImageReference.getDefault(),
                                                                                      "94079e53-16ea-4fd8-99cd-20def25f6bd9",
                                                                                      new Date(1559758607480L));
        assertTrue(subtenantdarkthemeimage.isValid());
        SubtenantDarkThemeImage subtenantdarkthemeimageInvalid = new SubtenantDarkThemeImage(null,
                                                                                             "e4367d52-f1a9-43ad-9107-62a0db00b1b1",
                                                                                             new Date(1559758605104L));
        assertFalse(subtenantdarkthemeimageInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantDarkThemeImage subtenantdarkthemeimage1 = new SubtenantDarkThemeImage(SubtenantDarkThemeImageReference.getDefault(),
                                                                                           "4dde91ca-1507-4b72-88b3-3df29c865fa3",
                                                                                           new Date(1559758606322L));
            SubtenantDarkThemeImage subtenantdarkthemeimage2 = new SubtenantDarkThemeImage(SubtenantDarkThemeImageReference.getDefault(),
                                                                                           "4dde91ca-1507-4b72-88b3-3df29c865fa3",
                                                                                           new Date(1559758606322L));
            SubtenantDarkThemeImage subtenantdarkthemeimage3 = new SubtenantDarkThemeImage(SubtenantDarkThemeImageReference.getDefault(),
                                                                                           "15589769-b1d4-4a6e-9e36-d69b6f2f94af",
                                                                                           new Date(1559758607935L));
            assertNotNull(subtenantdarkthemeimage1);
            assertNotNull(subtenantdarkthemeimage2);
            assertNotNull(subtenantdarkthemeimage3);
            assertNotSame(subtenantdarkthemeimage2, subtenantdarkthemeimage1);
            assertNotSame(subtenantdarkthemeimage3, subtenantdarkthemeimage1);
            assertEquals(subtenantdarkthemeimage2, subtenantdarkthemeimage1);
            assertEquals(subtenantdarkthemeimage2, subtenantdarkthemeimage1);
            assertEquals(subtenantdarkthemeimage1, subtenantdarkthemeimage2);
            assertEquals(subtenantdarkthemeimage1, subtenantdarkthemeimage1);
            assertFalse(subtenantdarkthemeimage1.equals(null));
            assertNotEquals(subtenantdarkthemeimage3, subtenantdarkthemeimage1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
