// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model User.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUser {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            User user1 = new User("bc05f908d0c49f1d35eb7cbe17ca2cb5", null, "208139eb-a21e-4aa5-a2e6-d5b040cfdfb7",
                                  new Date(1557969578434L), -109, null, "a428e.d8146@088c1.me", false,
                                  "c04beb15-10a2-4daf-a750-a21c13e6cc23", "bc05f908d0c49f1d35eb7cbe17ca2cb5", false,
                                  false, false, -106, null, null, "0128e367-3b8d-4f3a-ab99-825d97e61347", -31,
                                  "44caa4e7-e4a8-4ffe-975b-1f4311ab53f0", UserStatus.getDefault(), null,
                                  new Date(1557969578192L), "Uw+==");
            User user2 = user1.clone();
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotSame(user2, user1);
            assertEquals(user2, user1);
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
            User user1 = new User("bc05f908d0c49f1d35eb7cbe17ca2cb5", null, "de57968f-8a35-436d-b2f3-b5b5aadaf8b0",
                                  new Date(1557969572186L), 91, null, "88b58.553f7@e1a6c.fr", false,
                                  "100568d9-089e-4268-b8ff-d515d7f107eb", "bc05f908d0c49f1d35eb7cbe17ca2cb5", false,
                                  true, true, 22, null, null, "1a9d308f-841b-4d7f-8afc-737339789106", -71,
                                  "b425ae19-c2a2-4ff2-930d-84b467775e26", UserStatus.getDefault(), null,
                                  new Date(1557969578384L), "Uw+==");
            User user2 = new User("bc05f908d0c49f1d35eb7cbe17ca2cb5", null, "de57968f-8a35-436d-b2f3-b5b5aadaf8b0",
                                  new Date(1557969572186L), 91, null, "88b58.553f7@e1a6c.fr", false,
                                  "100568d9-089e-4268-b8ff-d515d7f107eb", "bc05f908d0c49f1d35eb7cbe17ca2cb5", false,
                                  true, true, 22, null, null, "1a9d308f-841b-4d7f-8afc-737339789106", -71,
                                  "b425ae19-c2a2-4ff2-930d-84b467775e26", UserStatus.getDefault(), null,
                                  new Date(1557969578384L), "Uw+==");
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotSame(user2, user1);
            assertEquals(user2, user1);
            assertEquals(user2.hashCode(), user1.hashCode());
            int hashCode = user1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, user1.hashCode());
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
        User user = new User("bc05f908d0c49f1d35eb7cbe17ca2cb5", null, "69018da0-6fe5-4650-b6a9-e3db85bca7ea",
                             new Date(1557969575821L), -100, null, "db9bb.4ec11@bd6a0.fr", false,
                             "b8291c8f-eb1e-48a3-9999-ada6f614b15c", "bc05f908d0c49f1d35eb7cbe17ca2cb5", true, true,
                             true, -34, null, null, "368e8768-8d0a-4524-87ad-e1e7541c4633", 77,
                             "6575abae-a513-4b96-9b14-f512ed694cbd", UserStatus.getDefault(), null,
                             new Date(1557969571810L), "Uw+==");
        assertTrue(user.isValid());
        User userInvalid = new User("/(6\u001b\u00166Y%N--\t66(-6�?�XI R\u000e6賺諸<6-6]66薿\u001e6\u0003\u0006@?66;ꄡP\u0013\u0002ꢷB6#A6\u0016XMM]\u0018^೹",
                                    null, "559bbf8f-3e26-48b6-ad6f-11ac79816d18", new Date(1557969572046L), 61, null,
                                    null, false,
                                    "bd73305b-de6d-4ce2-aa56-57d26e02728153ddad29-e076-434e-a907-52779bbd076fc89d5b66-1f3a-4452-8f31-f98b5080449c",
                                    "/(6\u001b\u00166Y%N--\t66(-6�?�XI R\u000e6賺諸<6-6]66薿\u001e6\u0003\u0006@?66;ꄡP\u0013\u0002ꢷB6#A6\u0016XMM]\u0018^೹",
                                    true, false, true, -127, null, null, "5646fb2f-e3e2-4a96-90fe-7532c93bfdc5", 64,
                                    "cbbca9d3-775d-495c-a973-98134cc46d95d3fcf5e9-41b6-4d2b-95e1-a6702ac0af9ba90fd0eb-932b-4185-98d5-2903e45af15f",
                                    UserStatus.getDefault(), null, new Date(1557969570296L),
                                    "E:셔j꾺!aEu?-,K<S[]瘅?S�?^dL0뒊᫟gA\\\\ἠ耒誂�??\\\\M'D儋i\u000e.$$\u000f껤dWT#-\u0010E-�?�vp\u00125XS");
        assertFalse(userInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            User user1 = new User("bc05f908d0c49f1d35eb7cbe17ca2cb5", null, "bda2c107-98da-4093-bb76-4bde0d0da6ce",
                                  new Date(1557969577685L), -41, null, "caf2c.069e8@1e1a1.fr", false,
                                  "e5034c74-0bce-4c42-a222-af445d2a4917", "bc05f908d0c49f1d35eb7cbe17ca2cb5", true,
                                  true, false, -6, null, null, "9bdd0c69-2328-401a-a079-d2cb85e92e8a", -127,
                                  "6bd2ff56-2e36-4128-86c1-170f342e2dd9", UserStatus.getDefault(), null,
                                  new Date(1557969574711L), "Uw+==");
            User user2 = new User("bc05f908d0c49f1d35eb7cbe17ca2cb5", null, "bda2c107-98da-4093-bb76-4bde0d0da6ce",
                                  new Date(1557969577685L), -41, null, "caf2c.069e8@1e1a1.fr", false,
                                  "e5034c74-0bce-4c42-a222-af445d2a4917", "bc05f908d0c49f1d35eb7cbe17ca2cb5", true,
                                  true, false, -6, null, null, "9bdd0c69-2328-401a-a079-d2cb85e92e8a", -127,
                                  "6bd2ff56-2e36-4128-86c1-170f342e2dd9", UserStatus.getDefault(), null,
                                  new Date(1557969574711L), "Uw+==");
            User user3 = new User("bc05f908d0c49f1d35eb7cbe17ca2cb5", null, "1c3b0f26-c50a-48c7-8a85-43b9ae6e1a39",
                                  new Date(1557969577516L), -70, null, "03c80.9daab@9ac36.me", false,
                                  "5630cf21-6933-4152-ac1b-9396c5cbf1ef", "bc05f908d0c49f1d35eb7cbe17ca2cb5", true,
                                  true, false, 28, null, null, "f2b62f8f-7cfb-4e01-a90a-c2e1822d7c9b", -94,
                                  "572970c1-1fc7-42ff-a3c9-84fd8ec0cf51", UserStatus.getDefault(), null,
                                  new Date(1557969575966L), "Uw+==");
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotNull(user3);
            assertNotSame(user2, user1);
            assertNotSame(user3, user1);
            assertEquals(user2, user1);
            assertEquals(user2, user1);
            assertEquals(user1, user2);
            assertEquals(user1, user1);
            assertFalse(user1.equals(null));
            assertNotEquals(user3, user1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
