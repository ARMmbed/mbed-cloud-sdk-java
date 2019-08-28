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
            User user1 = new User("02c5996de8d57cd67670ecd25b819d1a", null, "6f303345-e792-4a25-9ca9-851d0c07faef",
                                  new Date(1566995742267L), -99, null, "01296.820b9@5c9fb.me", true,
                                  "3184fc11-bdae-4bb1-9c5f-de7ce39c15d6", null, "02c5996de8d57cd67670ecd25b819d1a",
                                  true, false, true, -112, null, null, "e629773b-91a8-401c-80b1-1473b6bd8413", 109,
                                  "5e4426d4-8b70-494e-985f-78155494c760", UserStatus.getDefault(), null,
                                  new Date(1566995747635L), "_=2A=J");
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
            User user1 = new User("02c5996de8d57cd67670ecd25b819d1a", null, "9ec08dc7-acae-4c7d-9e17-7fdbc10207dd",
                                  new Date(1566995742726L), 121, null, "ba59f.243fe@bcb97.me", true,
                                  "3aafeb39-bdd6-4c6f-866c-c1e956a8ea07", null, "02c5996de8d57cd67670ecd25b819d1a",
                                  false, true, true, -37, null, null, "b0845f42-6278-4832-8ff1-f98ab241a2d1", -37,
                                  "00c9f622-dda5-45e1-9406-269beceb9f38", UserStatus.getDefault(), null,
                                  new Date(1566995746615L), "_=2A=J");
            User user2 = new User("02c5996de8d57cd67670ecd25b819d1a", null, "9ec08dc7-acae-4c7d-9e17-7fdbc10207dd",
                                  new Date(1566995742726L), 121, null, "ba59f.243fe@bcb97.me", true,
                                  "3aafeb39-bdd6-4c6f-866c-c1e956a8ea07", null, "02c5996de8d57cd67670ecd25b819d1a",
                                  false, true, true, -37, null, null, "b0845f42-6278-4832-8ff1-f98ab241a2d1", -37,
                                  "00c9f622-dda5-45e1-9406-269beceb9f38", UserStatus.getDefault(), null,
                                  new Date(1566995746615L), "_=2A=J");
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
        User user = new User("02c5996de8d57cd67670ecd25b819d1a", null, "d02c580c-8e6b-4049-bca1-3349815d051b",
                             new Date(1566995747031L), -94, null, "7166c.5bc9c@7cd31.me", false,
                             "95096313-add8-49bb-b92b-17408bd34fce", null, "02c5996de8d57cd67670ecd25b819d1a", false,
                             false, true, 76, null, null, "f9d4a4fe-4692-46f5-ac48-1df27e232e2a", 16,
                             "47178d9a-c6e4-44a2-acf5-a597e35d2ad2", UserStatus.getDefault(), null,
                             new Date(1566995740705L), "_=2A=J");
        assertTrue(user.isValid());
        User userInvalid = new User("^>43Y<汓;H�?�443螋訌\b?4 .3ᔜ4\u001434\u0015�?�.㱫3\u001d43\u001aWT4Z뾕皦�?E\u000444,A뙾\u001f4�?�Wྶ\u0000]4`D3",
                                    null, "842dd646-5847-4c7d-8cdf-7b9d3cb46ed9", new Date(1566995749051L), 47, null,
                                    null, true,
                                    "3183e56c-0c1d-404a-ac25-55e5c2028cd3d8108ae0-e660-4be0-87a1-598897129ff376d845f2-e8b5-4251-9533-e7324987058e",
                                    null,
                                    "^>43Y<汓;H�?�443螋訌\b?4 .3ᔜ4\u001434\u0015�?�.㱫3\u001d43\u001aWT4Z뾕皦�?E\u000444,A뙾\u001f4�?�Wྶ\u0000]4`D3",
                                    true, false, true, -122, null, null, "42448112-f2d5-4d98-b242-e738f79e9188", -114,
                                    "fef210ce-cbfa-4c43-a083-5e0367ccf0161d553621-fdd6-44a2-b29e-8247e7c91242bbe6b78e-bc75-4cd2-9171-5da1d46d65c4",
                                    UserStatus.getDefault(), null, new Date(1566995748921L),
                                    "幚W7邙B펠Z먯�?6\u0019I\u001a@)>䳙H@?CG@4<ķZ�??F�?�F?\u000e@@BH.\u001e]\u001a\u001c>PRBD熊G@�?�>DB>3B<\u0000E3");
        assertFalse(userInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            User user1 = new User("02c5996de8d57cd67670ecd25b819d1a", null, "da5de692-28ab-4e24-a670-34145fd2cb30",
                                  new Date(1566995746459L), -31, null, "89ad2.dc671@085d8.me", true,
                                  "7048aed8-d54e-46a2-97bb-c52ddea01398", null, "02c5996de8d57cd67670ecd25b819d1a",
                                  false, false, true, 59, null, null, "d3aa1687-813e-495d-b3cb-9505bc3d9ea8", 3,
                                  "b0f43e7b-180f-4ee2-a08f-c12344006fa4", UserStatus.getDefault(), null,
                                  new Date(1566995745443L), "_=2A=J");
            User user2 = new User("02c5996de8d57cd67670ecd25b819d1a", null, "da5de692-28ab-4e24-a670-34145fd2cb30",
                                  new Date(1566995746459L), -31, null, "89ad2.dc671@085d8.me", true,
                                  "7048aed8-d54e-46a2-97bb-c52ddea01398", null, "02c5996de8d57cd67670ecd25b819d1a",
                                  false, false, true, 59, null, null, "d3aa1687-813e-495d-b3cb-9505bc3d9ea8", 3,
                                  "b0f43e7b-180f-4ee2-a08f-c12344006fa4", UserStatus.getDefault(), null,
                                  new Date(1566995745443L), "_=2A=J");
            User user3 = new User("02c5996de8d57cd67670ecd25b819d1a", null, "962b9d3b-57c4-43d2-b9a9-19712b6a283e",
                                  new Date(1566995749179L), 85, null, "8f4a9.b0b7b@73183.fr", true,
                                  "6d1fc8ef-4466-432b-a7ff-80b5e1823df6", null, "02c5996de8d57cd67670ecd25b819d1a",
                                  false, false, true, 54, null, null, "5711de58-2a82-48ce-bb9a-fd6726a5ef07", -125,
                                  "33a19ec1-ec24-4e6c-873f-02bd7819eb13", UserStatus.getDefault(), null,
                                  new Date(1566995747534L), "_=2A=J");
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
