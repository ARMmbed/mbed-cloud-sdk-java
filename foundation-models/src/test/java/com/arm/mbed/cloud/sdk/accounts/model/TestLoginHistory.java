// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model LoginHistory.
 */
public class TestLoginHistory {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            LoginHistory loginhistory1 = new LoginHistory(new Date(1547730056269L),
                                                          "35fad548-fcd1-4163-a086-ae887583ba29", true,
                                                          "1795a90c-5fc9-4d9b-bdff-0b7dd658df72");
            LoginHistory loginhistory2 = loginhistory1.clone();
            assertNotNull(loginhistory1);
            assertNotNull(loginhistory2);
            assertNotSame(loginhistory2, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashCode() {
        try {
            LoginHistory loginhistory1 = new LoginHistory(new Date(1547730054710L),
                                                          "9d059285-6129-4487-a77a-a47e1256aa0a", true,
                                                          "035073e4-9609-4f0f-8c80-74e3ed61f832");
            LoginHistory loginhistory2 = new LoginHistory(new Date(1547730054710L),
                                                          "9d059285-6129-4487-a77a-a47e1256aa0a", true,
                                                          "035073e4-9609-4f0f-8c80-74e3ed61f832");
            assertNotNull(loginhistory1);
            assertNotNull(loginhistory2);
            assertNotSame(loginhistory2, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
            assertEquals(loginhistory2.hashCode(), loginhistory1.hashCode());
            int hashCode = loginhistory1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, loginhistory1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsValid() {
        LoginHistory loginhistory = new LoginHistory(new Date(1547730056762L), "93da47b4-8016-4049-bb2e-4dad516dcc04",
                                                     true, "768b5a4a-a465-42a6-b6f2-75739ae9a327");
        assertTrue(loginhistory.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            LoginHistory loginhistory1 = new LoginHistory(new Date(1547730050809L),
                                                          "4166cfc8-df1a-4065-bffa-b6961cea1916", true,
                                                          "b158111c-f4a5-44c7-9fa6-4098843aca54");
            LoginHistory loginhistory2 = new LoginHistory(new Date(1547730050809L),
                                                          "4166cfc8-df1a-4065-bffa-b6961cea1916", true,
                                                          "b158111c-f4a5-44c7-9fa6-4098843aca54");
            LoginHistory loginhistory3 = new LoginHistory(new Date(1547730054850L),
                                                          "beca7cc0-d6e7-4f54-bb7c-4827b3beb4f1", true,
                                                          "9d1e8efe-3a58-4c24-ac6c-ea6252464e53");
            assertNotNull(loginhistory1);
            assertNotNull(loginhistory2);
            assertNotNull(loginhistory3);
            assertNotSame(loginhistory2, loginhistory1);
            assertNotSame(loginhistory3, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
            assertEquals(loginhistory1, loginhistory2);
            assertEquals(loginhistory1, loginhistory1);
            assertFalse(loginhistory1.equals(null));
            assertNotEquals(loginhistory3, loginhistory1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
