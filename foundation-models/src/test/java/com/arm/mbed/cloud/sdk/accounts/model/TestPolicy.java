// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model Policy.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestPolicy {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            Policy policy1 = new Policy("b79f849d-a1e7-4547-acdb-319162ac19ab", false,
                                        "4d5e2a8f-4faf-45a2-a226-6bf52dd8384a", false,
                                        "ebc55594-2104-4bbf-8bcc-1895d9404882");
            Policy policy2 = policy1.clone();
            assertNotNull(policy1);
            assertNotNull(policy2);
            assertNotSame(policy2, policy1);
            assertEquals(policy2, policy1);
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
            Policy policy1 = new Policy("7aacdada-386e-4252-87e4-749ddb39b8eb", true,
                                        "29b75d9a-326f-477e-b711-d93e230db662", true,
                                        "f4248ff6-cf3d-4dd5-871b-0ebc748c5230");
            Policy policy2 = new Policy("7aacdada-386e-4252-87e4-749ddb39b8eb", true,
                                        "29b75d9a-326f-477e-b711-d93e230db662", true,
                                        "f4248ff6-cf3d-4dd5-871b-0ebc748c5230");
            assertNotNull(policy1);
            assertNotNull(policy2);
            assertNotSame(policy2, policy1);
            assertEquals(policy2, policy1);
            assertEquals(policy2.hashCode(), policy1.hashCode());
            int hashCode = policy1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, policy1.hashCode());
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
        Policy policy = new Policy("63829af7-24c8-4481-8efe-93b080f6f25f", false,
                                   "15069bec-752e-4b58-9c1e-94a242bfe2ec", true,
                                   "e9414cf9-66eb-4f1b-88d1-587f279dfde8");
        assertTrue(policy.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Policy policy1 = new Policy("28ec12b4-5a59-4f1d-a0ca-21873eb8bfd2", true,
                                        "c3096c1b-51d5-442e-ae7f-59d1ceda1707", true,
                                        "8dd0d095-294c-47ec-9cf9-10d34f5dd403");
            Policy policy2 = new Policy("28ec12b4-5a59-4f1d-a0ca-21873eb8bfd2", true,
                                        "c3096c1b-51d5-442e-ae7f-59d1ceda1707", true,
                                        "8dd0d095-294c-47ec-9cf9-10d34f5dd403");
            Policy policy3 = new Policy("535f4155-4338-439e-82aa-c78a3002ea3f", true,
                                        "555064e0-04e0-40f4-8545-bb17b291f0df", true,
                                        "f165e4ae-fa7f-4148-a7d1-7d62134ce23c");
            assertNotNull(policy1);
            assertNotNull(policy2);
            assertNotNull(policy3);
            assertNotSame(policy2, policy1);
            assertNotSame(policy3, policy1);
            assertEquals(policy2, policy1);
            assertEquals(policy2, policy1);
            assertEquals(policy1, policy2);
            assertEquals(policy1, policy1);
            assertFalse(policy1.equals(null));
            assertNotEquals(policy3, policy1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
