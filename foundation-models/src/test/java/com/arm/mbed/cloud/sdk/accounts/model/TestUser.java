// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model User.
 */
public class TestUser {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            User user1 = new User("75b70622-9885-4dfd-aa04-c69885ca4194", "c900923d-0246-4d65-8ebe-ab478e05cd1e",
                                  new Date(1548165441212L), 76, "3754b482-16a6-48c2-9a27-0c3faa57d0dc", false,
                                  "93ab3e34-c784-4ea8-869a-497e96ca28a7", "bca7e426-b375-4320-ae29-3fd8db55a688", 51,
                                  null, null, false, "6bfc8bce-be41-4acd-b8fa-5fe8be382a50", 39,
                                  "0da84844-9207-4a30-922f-5e0ca2e95771", UserStatus.getDefault(), false, false,
                                  new Date(1548165447612L), "6831d5f9-a15e-4bc2-8c00-c46663dfa324");
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
    @Test
    public void testHashCode() {
        try {
            User user1 = new User("b58bed38-11c3-4fbc-bb8e-a34869df0356", "4958ff23-37aa-4874-be5f-759fcabe33f3",
                                  new Date(1548165444095L), 81, "8a142d61-27fe-4a12-87da-bf3fa9beafb5", false,
                                  "6d7e647d-c145-467a-a203-a430cc68c577", "031ec8ed-6165-45e1-9340-cd3fa6c137c8", -121,
                                  null, null, true, "88695392-8914-4450-9ade-a3d3a51f51c0", -36,
                                  "d75e44dc-0adf-4c67-a4b0-f8ac5669720c", UserStatus.getDefault(), true, true,
                                  new Date(1548165443385L), "e41ba7ea-fd7a-4c11-88eb-7bac82aee990");
            User user2 = new User("b58bed38-11c3-4fbc-bb8e-a34869df0356", "4958ff23-37aa-4874-be5f-759fcabe33f3",
                                  new Date(1548165444095L), 81, "8a142d61-27fe-4a12-87da-bf3fa9beafb5", false,
                                  "6d7e647d-c145-467a-a203-a430cc68c577", "031ec8ed-6165-45e1-9340-cd3fa6c137c8", -121,
                                  null, null, true, "88695392-8914-4450-9ade-a3d3a51f51c0", -36,
                                  "d75e44dc-0adf-4c67-a4b0-f8ac5669720c", UserStatus.getDefault(), true, true,
                                  new Date(1548165443385L), "e41ba7ea-fd7a-4c11-88eb-7bac82aee990");
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
    @Test
    public void testIsValid() {
        User user = new User("93463e73-0d0b-4778-80fa-1004f9507b4b", "08eb6739-65bb-4d3c-b4b5-f145312d36bc",
                             new Date(1548165443018L), -67, "08ca5da9-abf4-4c91-a5a6-57b5708a16a0", false,
                             "34f1a712-ffcb-493f-b3f0-f21ecadb4d8e", "29c9532f-dbfe-4659-9b7f-c693a9a10bb9", -58, null,
                             null, true, "3784fb71-5b0e-4f63-a767-95330535a0c5", -34,
                             "a923e50f-94b6-4855-b608-b751276ec2b2", UserStatus.getDefault(), true, false,
                             new Date(1548165442233L), "489917a1-58a6-41a8-97cd-17fb7bc2cf7e");
        assertTrue(user.isValid());
        User userInvalid = new User("03e09bb9-4ecb-42af-9bdc-61abd2714f0e", "f5eb0ca6-dafb-4795-9f1e-5e2ceb4bd88b",
                                    new Date(1548165438812L), -33, null, true, "21699ce7-b13c-4810-a738-1ee93172ef22",
                                    "b5fde0e8-90ad-4ae7-84e0-6fb392e63ee7", -50, null, null, false,
                                    "376af2e3-a837-4adc-91f0-81dec002bddc", 2, "8b92d5c4-ba19-497c-895e-dc3bb0efe71a",
                                    UserStatus.getDefault(), false, false, new Date(1548165445709L),
                                    "89e95514-383e-4cef-99ce-2ce296f6620f");
        assertFalse(userInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            User user1 = new User("be290189-85e7-47a4-af30-507fa78486f8", "d259bc33-c902-4996-8389-6fb157fdb0f9",
                                  new Date(1548165440830L), -66, "09851af0-eabc-4f58-b5df-bd14438fd928", false,
                                  "70b7f708-1590-48f0-a246-b746d4c362da", "3359b04e-809a-48a8-bd96-8eb56a634a2d", -93,
                                  null, null, false, "a1ef3115-0fb4-4341-ad98-cd73671dfaaa", -90,
                                  "769adc25-a1d9-4191-91ad-c2f0684edd95", UserStatus.getDefault(), true, true,
                                  new Date(1548165445819L), "54cb182c-8ccb-4a19-a454-c51b2cfbd705");
            User user2 = new User("be290189-85e7-47a4-af30-507fa78486f8", "d259bc33-c902-4996-8389-6fb157fdb0f9",
                                  new Date(1548165440830L), -66, "09851af0-eabc-4f58-b5df-bd14438fd928", false,
                                  "70b7f708-1590-48f0-a246-b746d4c362da", "3359b04e-809a-48a8-bd96-8eb56a634a2d", -93,
                                  null, null, false, "a1ef3115-0fb4-4341-ad98-cd73671dfaaa", -90,
                                  "769adc25-a1d9-4191-91ad-c2f0684edd95", UserStatus.getDefault(), true, true,
                                  new Date(1548165445819L), "54cb182c-8ccb-4a19-a454-c51b2cfbd705");
            User user3 = new User("b8e051d9-d04c-41e5-a62d-ad96350df721", "94c957ef-9b30-4db5-9b36-70e152b0bad5",
                                  new Date(1548165443607L), -34, "ba89a994-9cf2-43fd-a3aa-a5c3b6ce30e2", false,
                                  "dcd8142e-077c-439f-b43f-45fd3cf25865", "5dd26cad-6a2e-4dfc-85f3-ea53646f200a", 89,
                                  null, null, false, "8c93bdd2-bebe-46fd-b854-b44130853385", -22,
                                  "b6f510fe-6a91-412f-af14-456d97238dcf", UserStatus.getDefault(), true, true,
                                  new Date(1548165440651L), "8aaa4514-5a6d-4db0-a604-c86ce50d0bb5");
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