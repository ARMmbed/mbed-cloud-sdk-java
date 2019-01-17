// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ApiKey.
 */
public class TestApiKey {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            ApiKey apikey1 = new ApiKey("befaafc3c180adc80cb139937c9d5827", new Date(1547730049340L), 103,
                                        "ea1bfec2-27f8-42c6-9cf8-72ab036f6f13", "18d85a5c-9fc4-496c-ac46-6452a60302dc",
                                        -30, "2a3852fd-ceb8-4df8-a0c9-73d63e15f683",
                                        "02ceb5a6-7ab6-4f5d-9809-538c11456e87", ApiKeyStatus.getDefault(),
                                        new Date(1547730051262L));
            ApiKey apikey2 = apikey1.clone();
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotSame(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
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
            ApiKey apikey1 = new ApiKey("bba465f0bc94a4b2b98de68e9bc9ac6b", new Date(1547730053977L), 14,
                                        "03e1a6bf-9660-40c2-81f6-bb1ed0194a4b", "0a934ab6-3dee-4d89-8450-97de08e2d7fe",
                                        114, "2e29d920-532c-4a51-9321-e7205ca0b186",
                                        "1f9171a9-312e-4682-bf07-e6bcbf4f6364", ApiKeyStatus.getDefault(),
                                        new Date(1547730053044L));
            ApiKey apikey2 = new ApiKey("bba465f0bc94a4b2b98de68e9bc9ac6b", new Date(1547730053977L), 14,
                                        "03e1a6bf-9660-40c2-81f6-bb1ed0194a4b", "0a934ab6-3dee-4d89-8450-97de08e2d7fe",
                                        114, "2e29d920-532c-4a51-9321-e7205ca0b186",
                                        "1f9171a9-312e-4682-bf07-e6bcbf4f6364", ApiKeyStatus.getDefault(),
                                        new Date(1547730053044L));
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotSame(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey2.hashCode(), apikey1.hashCode());
            int hashCode = apikey1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, apikey1.hashCode());
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
        ApiKey apikey = new ApiKey("cb6aef6ddf518ce18ef0b205a0ed8438", new Date(1547730050058L), 51,
                                   "6a6c1df1-7a4c-4a9d-bb37-d8bf6ab42923", "aaab8c53-0c55-4ffa-9503-d100392efd49", 28,
                                   "1dfcee03-db34-4600-9fb9-1e3bbdabb9ee", "e0781cd4-2510-42c8-a317-94b8dbe0670a",
                                   ApiKeyStatus.getDefault(), new Date(1547730054054L));
        assertTrue(apikey.isValid());
        ApiKey apikeyInvalid = new ApiKey("*R喃'⠌@\u0012듯\u0007�?�@\u0001]䕙_SE\u0011G\u0012\u000b埰?VU诩CE\u000e\u0002\u0016鱕;?\fH\u000eJ(B嵕E\u0007#磺Ⱄ\u0003\u0005瞷ⷋ?\u0004R\u0014\u0004颼\u0017륄%\u001b\u0018꥿攼",
                                          new Date(1547730054185L), 65, "fee38b3a-14d0-4b51-a85f-8995f91e98c4",
                                          "7b03ea98-ae5f-4daf-a7c1-898dc86da48c", 108, null,
                                          "94ef5843-7e93-429d-bcf0-270149f7f88a", ApiKeyStatus.getDefault(),
                                          new Date(1547730050550L));
        assertFalse(apikeyInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            ApiKey apikey1 = new ApiKey("ddfd105edf7bc77cfcd64bc61b234dfe", new Date(1547730050309L), -34,
                                        "e8d56a4a-2502-441e-8111-f32cfbe6206f", "c1a46d52-8d3c-410e-a6ea-e81e3bc13713",
                                        -51, "83ebf9a2-8486-4239-8ce8-ea7634c81cf2",
                                        "dbd470b3-3bc6-49f6-a767-8c991447d6d6", ApiKeyStatus.getDefault(),
                                        new Date(1547730053539L));
            ApiKey apikey2 = new ApiKey("ddfd105edf7bc77cfcd64bc61b234dfe", new Date(1547730050309L), -34,
                                        "e8d56a4a-2502-441e-8111-f32cfbe6206f", "c1a46d52-8d3c-410e-a6ea-e81e3bc13713",
                                        -51, "83ebf9a2-8486-4239-8ce8-ea7634c81cf2",
                                        "dbd470b3-3bc6-49f6-a767-8c991447d6d6", ApiKeyStatus.getDefault(),
                                        new Date(1547730053539L));
            ApiKey apikey3 = new ApiKey("c8344c5c18824750fc3d5c09e134edb7", new Date(1547730051772L), -122,
                                        "e9389cad-1331-4745-a748-1d29e824b5ba", "403b6142-c88b-484a-a11c-159c116a1a88",
                                        -44, "675211e4-fb04-44e5-906a-ab0a731da5e8",
                                        "d402daaa-aad5-4a5a-99a0-d88cbd7e0335", ApiKeyStatus.getDefault(),
                                        new Date(1547730054920L));
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotNull(apikey3);
            assertNotSame(apikey2, apikey1);
            assertNotSame(apikey3, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey1, apikey2);
            assertEquals(apikey1, apikey1);
            assertFalse(apikey1.equals(null));
            assertNotEquals(apikey3, apikey1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
