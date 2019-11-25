// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model PolicyGroup.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestPolicyGroup {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            PolicyGroup policygroup1 = new PolicyGroup("4f267f967f7d1f5e3fa0d6abaccdb4bf", -107,
                                                       new Date(1574704664838L), "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                       "df9afaba-c141-45b1-a11d-dbcd1b899c6f", new Date(1574704669424L),
                                                       115);
            PolicyGroup policygroup2 = policygroup1.clone();
            assertNotNull(policygroup1);
            assertNotNull(policygroup2);
            assertNotSame(policygroup2, policygroup1);
            assertEquals(policygroup2, policygroup1);
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
            PolicyGroup policygroup1 = new PolicyGroup("4f267f967f7d1f5e3fa0d6abaccdb4bf", -81,
                                                       new Date(1574704662061L), "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                       "56eac453-6b6d-4061-a258-e275822f05cc", new Date(1574704663397L),
                                                       -16);
            PolicyGroup policygroup2 = new PolicyGroup("4f267f967f7d1f5e3fa0d6abaccdb4bf", -81,
                                                       new Date(1574704662061L), "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                       "56eac453-6b6d-4061-a258-e275822f05cc", new Date(1574704663397L),
                                                       -16);
            assertNotNull(policygroup1);
            assertNotNull(policygroup2);
            assertNotSame(policygroup2, policygroup1);
            assertEquals(policygroup2, policygroup1);
            assertEquals(policygroup2.hashCode(), policygroup1.hashCode());
            int hashCode = policygroup1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, policygroup1.hashCode());
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
        PolicyGroup policygroup = new PolicyGroup("4f267f967f7d1f5e3fa0d6abaccdb4bf", 98, new Date(1574704668473L),
                                                  "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                  "50a9dc9d-54a0-48c8-8f8f-d957cd3ec3f2", new Date(1574704660799L),
                                                  -83);
        assertTrue(policygroup.isValid());
        PolicyGroup policygroupInvalid = new PolicyGroup("8�?�行BC8GH秙%8�?\u0004R88�?�8尸8EUT\\\\+R\u00138襯\u0007B\u001e嗴൴;N88㹌\u000e=ᖱ88T8塛8?888尼8玵/W?K",
                                                         12, new Date(1574704666605L),
                                                         "8�?�行BC8GH秙%8�?\u0004R88�?�8尸8EUT\\\\+R\u00138襯\u0007B\u001e嗴൴;N88㹌\u000e=ᖱ88T8塛8?888尼8玵/W?K",
                                                         null, new Date(1574704665132L), -35);
        assertFalse(policygroupInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            PolicyGroup policygroup1 = new PolicyGroup("4f267f967f7d1f5e3fa0d6abaccdb4bf", -51,
                                                       new Date(1574704668508L), "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                       "eb473b4e-ac23-406a-aef7-df0a11c81bac", new Date(1574704663693L),
                                                       -102);
            PolicyGroup policygroup2 = new PolicyGroup("4f267f967f7d1f5e3fa0d6abaccdb4bf", -51,
                                                       new Date(1574704668508L), "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                       "eb473b4e-ac23-406a-aef7-df0a11c81bac", new Date(1574704663693L),
                                                       -102);
            PolicyGroup policygroup3 = new PolicyGroup("4f267f967f7d1f5e3fa0d6abaccdb4bf", -117,
                                                       new Date(1574704660921L), "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                       "80fe8f6e-ce02-4185-8f42-6778525739ae", new Date(1574704667956L),
                                                       -110);
            assertNotNull(policygroup1);
            assertNotNull(policygroup2);
            assertNotNull(policygroup3);
            assertNotSame(policygroup2, policygroup1);
            assertNotSame(policygroup3, policygroup1);
            assertEquals(policygroup2, policygroup1);
            assertEquals(policygroup2, policygroup1);
            assertEquals(policygroup1, policygroup2);
            assertEquals(policygroup1, policygroup1);
            assertFalse(policygroup1.equals(null));
            assertNotEquals(policygroup3, policygroup1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
