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
            ActiveSession activesession1 = new ActiveSession("bd1f89fbddbde18d4244b748ca1d250b",
                                                             "3a16dcd7-1da1-49c4-b21b-07071448a2f1",
                                                             new Date(1570127621703L),
                                                             "c0d15238-7bc5-40a2-8caf-037c9e527811",
                                                             "3e7d37ab-7019-43fe-8693-fa0dc3893a41");
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
            ActiveSession activesession1 = new ActiveSession("bd1f89fbddbde18d4244b748ca1d250b",
                                                             "58146c50-3378-4f4e-9425-d593d980002e",
                                                             new Date(1570127625247L),
                                                             "bb489f6c-e19b-4cb0-81cf-c6e64feb998b",
                                                             "819fc91e-b400-467a-a657-b967909fb9f0");
            ActiveSession activesession2 = new ActiveSession("bd1f89fbddbde18d4244b748ca1d250b",
                                                             "58146c50-3378-4f4e-9425-d593d980002e",
                                                             new Date(1570127625247L),
                                                             "bb489f6c-e19b-4cb0-81cf-c6e64feb998b",
                                                             "819fc91e-b400-467a-a657-b967909fb9f0");
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
        ActiveSession activesession = new ActiveSession("bd1f89fbddbde18d4244b748ca1d250b",
                                                        "a5eef089-a53d-4989-92ee-2ddaf952a398",
                                                        new Date(1570127621354L),
                                                        "ed32601d-9f81-4ea8-973f-f59d5c1d585a",
                                                        "977e1032-9fa8-41f1-a40b-9dfb644cbb28");
        assertTrue(activesession.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ActiveSession activesession1 = new ActiveSession("bd1f89fbddbde18d4244b748ca1d250b",
                                                             "cbca8d09-fa70-4c59-8bf2-768fe65da7e4",
                                                             new Date(1570127622080L),
                                                             "d4529069-0f7e-4733-968a-a0e586992054",
                                                             "30cd82c4-ced6-4161-bc2b-f43dc981b057");
            ActiveSession activesession2 = new ActiveSession("bd1f89fbddbde18d4244b748ca1d250b",
                                                             "cbca8d09-fa70-4c59-8bf2-768fe65da7e4",
                                                             new Date(1570127622080L),
                                                             "d4529069-0f7e-4733-968a-a0e586992054",
                                                             "30cd82c4-ced6-4161-bc2b-f43dc981b057");
            ActiveSession activesession3 = new ActiveSession("bd1f89fbddbde18d4244b748ca1d250b",
                                                             "034baf17-e0f7-4a16-ab9d-037a83ec344f",
                                                             new Date(1570127621781L),
                                                             "d5d1e2a6-49fa-4eb3-a10d-4de25bac6601",
                                                             "87e2fc32-d559-42d8-9e16-afca0360c29f");
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
