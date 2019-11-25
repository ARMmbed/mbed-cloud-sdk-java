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
            Policy policy1 = new Policy("4f508d38-0f77-4936-806e-bdb2fbcefdaf", true,
                                        "46dbd363-f32f-4d98-a6cf-20d460d503ec", true,
                                        "4f267f967f7d1f5e3fa0d6abaccdb4bf", PolicyInheritedType.getDefault(),
                                        "aa579c93-347c-4d9a-9e8c-1635fb628a4e");
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
            Policy policy1 = new Policy("e077c872-b7fa-44fd-80d0-fb9c6951ba6b", false,
                                        "3240dee3-0bcd-495c-8c8d-14177613fb61", false,
                                        "4f267f967f7d1f5e3fa0d6abaccdb4bf", PolicyInheritedType.getDefault(),
                                        "9211d0eb-ecd5-4653-88a8-7ef56bb9031a");
            Policy policy2 = new Policy("e077c872-b7fa-44fd-80d0-fb9c6951ba6b", false,
                                        "3240dee3-0bcd-495c-8c8d-14177613fb61", false,
                                        "4f267f967f7d1f5e3fa0d6abaccdb4bf", PolicyInheritedType.getDefault(),
                                        "9211d0eb-ecd5-4653-88a8-7ef56bb9031a");
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
        Policy policy = new Policy("82c27d85-72cd-4930-b994-1732377031e9", false,
                                   "aa2444ac-395f-439d-b9b7-c13aab1a9601", false, "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                   PolicyInheritedType.getDefault(), "a5a74798-57d9-4758-87fe-a7efa584268f");
        assertTrue(policy.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Policy policy1 = new Policy("4e1e20e3-0e72-464c-bdf9-e1667e4ce9e9", true,
                                        "203f9c5c-5651-454e-9c40-cd1636b26a5a", false,
                                        "4f267f967f7d1f5e3fa0d6abaccdb4bf", PolicyInheritedType.getDefault(),
                                        "9be1fc31-47f3-4971-8948-ba955e9b19a9");
            Policy policy2 = new Policy("4e1e20e3-0e72-464c-bdf9-e1667e4ce9e9", true,
                                        "203f9c5c-5651-454e-9c40-cd1636b26a5a", false,
                                        "4f267f967f7d1f5e3fa0d6abaccdb4bf", PolicyInheritedType.getDefault(),
                                        "9be1fc31-47f3-4971-8948-ba955e9b19a9");
            Policy policy3 = new Policy("e3d593f5-7d20-481e-9d9b-25dc24c06ec8", true,
                                        "f8f339e0-1aef-4296-a3c2-45773a9e93c1", false,
                                        "4f267f967f7d1f5e3fa0d6abaccdb4bf", PolicyInheritedType.getDefault(),
                                        "324b642d-5964-4a7b-9468-2f85befc3028");
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
