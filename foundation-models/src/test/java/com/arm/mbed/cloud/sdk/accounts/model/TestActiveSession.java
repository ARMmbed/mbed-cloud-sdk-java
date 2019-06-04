// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ActiveSession.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestActiveSession {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ActiveSession activesession1 = new ActiveSession("f33f4df6191a3d432ba4b4ea8fd5906b",
                                                             "d54217b7-4a68-47da-be75-47365e1817b8",
                                                             new Date(1559662781273L),
                                                             "262ad5a3-f7e4-4c0d-898c-7ac61c346d0e",
                                                             "f20d1c97-bdca-4497-9eba-024112bad36d");
            ActiveSession activesession2 = activesession1.clone();
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotSame(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
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
            ActiveSession activesession1 = new ActiveSession("f33f4df6191a3d432ba4b4ea8fd5906b",
                                                             "403848fd-ca9d-4e75-b096-b15930117df2",
                                                             new Date(1559662780009L),
                                                             "d29ca412-9872-48cb-857b-622013ef536f",
                                                             "1fd60f0d-fa41-4ada-81e6-69e71d38ad3b");
            ActiveSession activesession2 = new ActiveSession("f33f4df6191a3d432ba4b4ea8fd5906b",
                                                             "403848fd-ca9d-4e75-b096-b15930117df2",
                                                             new Date(1559662780009L),
                                                             "d29ca412-9872-48cb-857b-622013ef536f",
                                                             "1fd60f0d-fa41-4ada-81e6-69e71d38ad3b");
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotSame(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession2.hashCode(), activesession1.hashCode());
            int hashCode = activesession1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, activesession1.hashCode());
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
        ActiveSession activesession = new ActiveSession("f33f4df6191a3d432ba4b4ea8fd5906b",
                                                        "cce144a1-4f18-42f7-a0c8-cb6243033a3e",
                                                        new Date(1559662785357L),
                                                        "de0b32f6-7011-497d-ade2-f534c51758fb",
                                                        "07b59017-99e8-4661-b363-0651a3778ce8");
        assertTrue(activesession.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ActiveSession activesession1 = new ActiveSession("f33f4df6191a3d432ba4b4ea8fd5906b",
                                                             "325b4a7b-e72a-4a84-80d7-52531aab3070",
                                                             new Date(1559662779196L),
                                                             "71932265-aba1-4c2e-8d50-9894be64e508",
                                                             "5bc4608f-dc61-41b4-b674-6e4a6bf9a6d7");
            ActiveSession activesession2 = new ActiveSession("f33f4df6191a3d432ba4b4ea8fd5906b",
                                                             "325b4a7b-e72a-4a84-80d7-52531aab3070",
                                                             new Date(1559662779196L),
                                                             "71932265-aba1-4c2e-8d50-9894be64e508",
                                                             "5bc4608f-dc61-41b4-b674-6e4a6bf9a6d7");
            ActiveSession activesession3 = new ActiveSession("f33f4df6191a3d432ba4b4ea8fd5906b",
                                                             "ff2fba29-8be0-4118-ad9f-7714880ded09",
                                                             new Date(1559662776573L),
                                                             "a0744f92-0c41-4cfc-a2e2-3b824913c931",
                                                             "8cf9a78c-9d96-41e6-9183-7ea54f5bb8f2");
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotNull(activesession3);
            assertNotSame(activesession2, activesession1);
            assertNotSame(activesession3, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession1, activesession2);
            assertEquals(activesession1, activesession1);
            assertFalse(activesession1.equals(null));
            assertNotEquals(activesession3, activesession1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
