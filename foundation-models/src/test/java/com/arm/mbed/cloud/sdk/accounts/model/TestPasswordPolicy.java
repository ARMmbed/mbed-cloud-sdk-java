// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model PasswordPolicy.
 */
public class TestPasswordPolicy {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            PasswordPolicy passwordpolicy1 = new PasswordPolicy("02075d03-874b-478e-9cd3-938df13e141d");
            PasswordPolicy passwordpolicy2 = passwordpolicy1.clone();
            assertNotNull(passwordpolicy1);
            assertNotNull(passwordpolicy2);
            assertNotSame(passwordpolicy2, passwordpolicy1);
            assertEquals(passwordpolicy2, passwordpolicy1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        PasswordPolicy passwordpolicy = new PasswordPolicy("2b70908d-c94b-49c6-9447-978ce5cb1efe");
        assertTrue(passwordpolicy.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        try {
            PasswordPolicy passwordpolicy1 = new PasswordPolicy("761b594e-8074-4d0b-bde6-39ba3fa64295");
            PasswordPolicy passwordpolicy2 = new PasswordPolicy("761b594e-8074-4d0b-bde6-39ba3fa64295");
            assertNotNull(passwordpolicy1);
            assertNotNull(passwordpolicy2);
            assertNotSame(passwordpolicy2, passwordpolicy1);
            assertEquals(passwordpolicy2, passwordpolicy1);
            assertEquals(passwordpolicy2.hashCode(), passwordpolicy1.hashCode());
            int hashCode = passwordpolicy1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, passwordpolicy1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            PasswordPolicy passwordpolicy1 = new PasswordPolicy("51d18b6d-158a-4268-b36f-042bebb74674");
            PasswordPolicy passwordpolicy2 = new PasswordPolicy("51d18b6d-158a-4268-b36f-042bebb74674");
            PasswordPolicy passwordpolicy3 = new PasswordPolicy("bff59a01-55c1-4d11-8b71-63f372a3164f");
            assertNotNull(passwordpolicy1);
            assertNotNull(passwordpolicy2);
            assertNotNull(passwordpolicy3);
            assertNotSame(passwordpolicy2, passwordpolicy1);
            assertNotSame(passwordpolicy3, passwordpolicy1);
            assertEquals(passwordpolicy2, passwordpolicy1);
            assertEquals(passwordpolicy2, passwordpolicy1);
            assertEquals(passwordpolicy1, passwordpolicy2);
            assertEquals(passwordpolicy1, passwordpolicy1);
            assertFalse(passwordpolicy1.equals(null));
            assertNotEquals(passwordpolicy3, passwordpolicy1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
