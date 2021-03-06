// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantIdentityProvider.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantIdentityProvider {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantIdentityProvider subtenantidentityprovider1 = new SubtenantIdentityProvider("4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 new Date(1574704663830L),
                                                                                                 "12d46c68-a8f8-4399-aad6-bdafac357073",
                                                                                                 "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 true,
                                                                                                 "31909008-fad1-4943-990c-9dfca03b3011",
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1574704665287L));
            SubtenantIdentityProvider subtenantidentityprovider2 = subtenantidentityprovider1.clone();
            assertNotNull(subtenantidentityprovider1);
            assertNotNull(subtenantidentityprovider2);
            assertNotSame(subtenantidentityprovider2, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider2, subtenantidentityprovider1);
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
            SubtenantIdentityProvider subtenantidentityprovider1 = new SubtenantIdentityProvider("4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 new Date(1574704665062L),
                                                                                                 "9079f9d3-acea-4404-b164-31d2d842190d",
                                                                                                 "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 true,
                                                                                                 "30705132-2d6b-4708-ba10-12b1c4fe7e3c",
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1574704670033L));
            SubtenantIdentityProvider subtenantidentityprovider2 = new SubtenantIdentityProvider("4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 new Date(1574704665062L),
                                                                                                 "9079f9d3-acea-4404-b164-31d2d842190d",
                                                                                                 "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 true,
                                                                                                 "30705132-2d6b-4708-ba10-12b1c4fe7e3c",
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1574704670033L));
            assertNotNull(subtenantidentityprovider1);
            assertNotNull(subtenantidentityprovider2);
            assertNotSame(subtenantidentityprovider2, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider2, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider2.hashCode(), subtenantidentityprovider1.hashCode());
            int hashCode = subtenantidentityprovider1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantidentityprovider1.hashCode());
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
        SubtenantIdentityProvider subtenantidentityprovider = new SubtenantIdentityProvider("4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                            new Date(1574704667320L),
                                                                                            "c67a4554-4c62-4969-88f6-4e6ea864e6a0",
                                                                                            "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                            true,
                                                                                            "84c78995-c6f2-4ca1-a902-c7b2d50ee3a1",
                                                                                            null,
                                                                                            SubtenantIdentityProviderStatus.getDefault(),
                                                                                            new Date(1574704667603L));
        assertTrue(subtenantidentityprovider.isValid());
        SubtenantIdentityProvider subtenantidentityproviderInvalid = new SubtenantIdentityProvider(null,
                                                                                                   new Date(1574704662363L),
                                                                                                   "74dd9bc8-bce1-4142-92ba-c7a84ead16693f84c576-ab5f-45b9-bcf6-1de080a2b59166b85ef9-5b17-4b91-b1d6-752810e2967a406cfd71-6d8f-40f7-a926-8c2a6f1182e428375934-b02b-4832-84db-baaf9ed8950ca1e7b82f-df3d-4a22-9db7-2a7aa75cee0676556323-3399-428b-869f-58d35786faa4aa3bb984-ff7e-455a-bcf0-79cd9577de8e6f786d71-da04-4aa9-b1ed-c596c57d7f6e1a8f985d-49e5-4aae-beb2-623e5e70b1fc158c126a-cc53-40c5-8c11-cd466ff5902017886f65-1f71-4d2c-9975-bf6c15d2675f4ce35805-c333-4e5a-b17a-4216a3f5d7a20a94c5b3-3f1f-4d65-bfcb-48c83269722d",
                                                                                                   "8�?�行BC8GH秙%8�?\u0004R88�?�8尸8EUT\\\\+R\u00138襯\u0007B\u001e嗴൴;N88㹌\u000e=ᖱ88T8塛8?888尼8玵/W?K",
                                                                                                   false, null, null,
                                                                                                   SubtenantIdentityProviderStatus.getDefault(),
                                                                                                   new Date(1574704668264L));
        assertFalse(subtenantidentityproviderInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantIdentityProvider subtenantidentityprovider1 = new SubtenantIdentityProvider("4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 new Date(1574704662624L),
                                                                                                 "6fe9796f-f984-4532-99fa-d8010ca42ba8",
                                                                                                 "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 false,
                                                                                                 "020338f7-8bf4-4ddc-9b6d-bb20d6a0070c",
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1574704671086L));
            SubtenantIdentityProvider subtenantidentityprovider2 = new SubtenantIdentityProvider("4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 new Date(1574704662624L),
                                                                                                 "6fe9796f-f984-4532-99fa-d8010ca42ba8",
                                                                                                 "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 false,
                                                                                                 "020338f7-8bf4-4ddc-9b6d-bb20d6a0070c",
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1574704671086L));
            SubtenantIdentityProvider subtenantidentityprovider3 = new SubtenantIdentityProvider("4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 new Date(1574704666614L),
                                                                                                 "849f4ae0-d89d-4df4-a7cd-8a4ac903da9d",
                                                                                                 "4f267f967f7d1f5e3fa0d6abaccdb4bf",
                                                                                                 false,
                                                                                                 "377db076-51a4-4f30-a415-31a243567f8b",
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1574704669559L));
            assertNotNull(subtenantidentityprovider1);
            assertNotNull(subtenantidentityprovider2);
            assertNotNull(subtenantidentityprovider3);
            assertNotSame(subtenantidentityprovider2, subtenantidentityprovider1);
            assertNotSame(subtenantidentityprovider3, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider2, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider2, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider1, subtenantidentityprovider2);
            assertEquals(subtenantidentityprovider1, subtenantidentityprovider1);
            assertFalse(subtenantidentityprovider1.equals(null));
            assertNotEquals(subtenantidentityprovider3, subtenantidentityprovider1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
