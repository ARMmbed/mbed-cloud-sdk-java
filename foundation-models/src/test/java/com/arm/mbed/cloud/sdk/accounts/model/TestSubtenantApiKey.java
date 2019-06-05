// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantApiKey.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantApiKey {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantApiKey subtenantapikey1 = new SubtenantApiKey("360efa29edf1702da7045dd46bf2c0ee",
                                                                   new Date(1559758604099L), 32,
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   "1136b067-59f4-4523-a084-80ac07b753c8", -5,
                                                                   "68a9fa66-e251-416f-93ee-1e5ca4e7c674",
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1559758606266L));
            SubtenantApiKey subtenantapikey2 = subtenantapikey1.clone();
            assertNotNull(subtenantapikey1);
            assertNotNull(subtenantapikey2);
            assertNotSame(subtenantapikey2, subtenantapikey1);
            assertEquals(subtenantapikey2, subtenantapikey1);
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
            SubtenantApiKey subtenantapikey1 = new SubtenantApiKey("360efa29edf1702da7045dd46bf2c0ee",
                                                                   new Date(1559758607802L), 115,
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   "74667323-1c21-48af-adcc-4e0df1e6df4d", 90,
                                                                   "c5d5814d-3ee4-4432-9891-a632242bf940",
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1559758609553L));
            SubtenantApiKey subtenantapikey2 = new SubtenantApiKey("360efa29edf1702da7045dd46bf2c0ee",
                                                                   new Date(1559758607802L), 115,
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   "74667323-1c21-48af-adcc-4e0df1e6df4d", 90,
                                                                   "c5d5814d-3ee4-4432-9891-a632242bf940",
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1559758609553L));
            assertNotNull(subtenantapikey1);
            assertNotNull(subtenantapikey2);
            assertNotSame(subtenantapikey2, subtenantapikey1);
            assertEquals(subtenantapikey2, subtenantapikey1);
            assertEquals(subtenantapikey2.hashCode(), subtenantapikey1.hashCode());
            int hashCode = subtenantapikey1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantapikey1.hashCode());
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
        SubtenantApiKey subtenantapikey = new SubtenantApiKey("360efa29edf1702da7045dd46bf2c0ee",
                                                              new Date(1559758603426L), -26,
                                                              "360efa29edf1702da7045dd46bf2c0ee",
                                                              "01bd4598-1da1-46f6-8b6a-fb864d978619", 91,
                                                              "c198d0f0-58b8-4910-a60a-dbc20b28c9e7",
                                                              "360efa29edf1702da7045dd46bf2c0ee",
                                                              SubtenantApiKeyStatus.getDefault(),
                                                              new Date(1559758607661L));
        assertTrue(subtenantapikey.isValid());
        SubtenantApiKey subtenantapikeyInvalid = new SubtenantApiKey(null, new Date(1559758604335L), 95,
                                                                     "TU8㽅\u0019ZDD�?겅8ꈛ�?*8羂_\u000e\t\u0013W8T푼嵅,\u0001. 8�?�8衾\u0001醀 8\u001b綒S炤귈\b러\u0011L8\u0010K?8艭맦\u000eG*국8Q8",
                                                                     "3e14f92e-3cce-4fbe-9455-0e32ee45ab72", 57, null,
                                                                     "TU8㽅\u0019ZDD�?겅8ꈛ�?*8羂_\u000e\t\u0013W8T푼嵅,\u0001. 8�?�8衾\u0001醀 8\u001b綒S炤귈\b러\u0011L8\u0010K?8艭맦\u000eG*국8Q8",
                                                                     SubtenantApiKeyStatus.getDefault(),
                                                                     new Date(1559758603242L));
        assertFalse(subtenantapikeyInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantApiKey subtenantapikey1 = new SubtenantApiKey("360efa29edf1702da7045dd46bf2c0ee",
                                                                   new Date(1559758611641L), -31,
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   "19539c4a-9868-4461-b2bc-77c30f6852ec", 31,
                                                                   "4648ce5f-adf6-4e0a-b255-114e70e2b620",
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1559758606036L));
            SubtenantApiKey subtenantapikey2 = new SubtenantApiKey("360efa29edf1702da7045dd46bf2c0ee",
                                                                   new Date(1559758611641L), -31,
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   "19539c4a-9868-4461-b2bc-77c30f6852ec", 31,
                                                                   "4648ce5f-adf6-4e0a-b255-114e70e2b620",
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1559758606036L));
            SubtenantApiKey subtenantapikey3 = new SubtenantApiKey("360efa29edf1702da7045dd46bf2c0ee",
                                                                   new Date(1559758612010L), 114,
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   "64690fe2-24b3-45c8-9ac1-437f54febf3e", -64,
                                                                   "55fe9d59-0289-4ed8-b209-03c687c8aed3",
                                                                   "360efa29edf1702da7045dd46bf2c0ee",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1559758607229L));
            assertNotNull(subtenantapikey1);
            assertNotNull(subtenantapikey2);
            assertNotNull(subtenantapikey3);
            assertNotSame(subtenantapikey2, subtenantapikey1);
            assertNotSame(subtenantapikey3, subtenantapikey1);
            assertEquals(subtenantapikey2, subtenantapikey1);
            assertEquals(subtenantapikey2, subtenantapikey1);
            assertEquals(subtenantapikey1, subtenantapikey2);
            assertEquals(subtenantapikey1, subtenantapikey1);
            assertFalse(subtenantapikey1.equals(null));
            assertNotEquals(subtenantapikey3, subtenantapikey1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
