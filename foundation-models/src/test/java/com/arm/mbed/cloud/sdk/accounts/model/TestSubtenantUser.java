// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantUser.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantUser {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantUser subtenantuser1 = new SubtenantUser("02c5996de8d57cd67670ecd25b819d1a", null,
                                                             "cd057c23-4b02-4d79-988e-84ed09ad176f",
                                                             new Date(1566995742636L), -83, null,
                                                             "0d2e5.8d02d@f92b5.me", false,
                                                             "74cbf59a-c83d-4a83-b44a-8832a0ea8b49", null,
                                                             "02c5996de8d57cd67670ecd25b819d1a", false, true, true, -48,
                                                             null, null, "334a839b-80e3-4aeb-981a-5d8f963e1f38", 37,
                                                             "f3295d81-9914-4e65-8f70-453bb7079863",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1566995746833L), "_=2A=J");
            SubtenantUser subtenantuser2 = subtenantuser1.clone();
            assertNotNull(subtenantuser1);
            assertNotNull(subtenantuser2);
            assertNotSame(subtenantuser2, subtenantuser1);
            assertEquals(subtenantuser2, subtenantuser1);
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
            SubtenantUser subtenantuser1 = new SubtenantUser("02c5996de8d57cd67670ecd25b819d1a", null,
                                                             "49aae1de-a1b2-417b-8ddc-ad15d868e7df",
                                                             new Date(1566995743966L), -26, null,
                                                             "6b786.517f4@aea75.me", false,
                                                             "fa23729f-8a26-40e6-a278-a9cf02481575", null,
                                                             "02c5996de8d57cd67670ecd25b819d1a", true, true, true, 68,
                                                             null, null, "ca1d45ab-b8a5-4f13-b22f-225603ec51a4", -84,
                                                             "5890723c-ad1c-4a80-ab34-836924b54580",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1566995745269L), "_=2A=J");
            SubtenantUser subtenantuser2 = new SubtenantUser("02c5996de8d57cd67670ecd25b819d1a", null,
                                                             "49aae1de-a1b2-417b-8ddc-ad15d868e7df",
                                                             new Date(1566995743966L), -26, null,
                                                             "6b786.517f4@aea75.me", false,
                                                             "fa23729f-8a26-40e6-a278-a9cf02481575", null,
                                                             "02c5996de8d57cd67670ecd25b819d1a", true, true, true, 68,
                                                             null, null, "ca1d45ab-b8a5-4f13-b22f-225603ec51a4", -84,
                                                             "5890723c-ad1c-4a80-ab34-836924b54580",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1566995745269L), "_=2A=J");
            assertNotNull(subtenantuser1);
            assertNotNull(subtenantuser2);
            assertNotSame(subtenantuser2, subtenantuser1);
            assertEquals(subtenantuser2, subtenantuser1);
            assertEquals(subtenantuser2.hashCode(), subtenantuser1.hashCode());
            int hashCode = subtenantuser1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantuser1.hashCode());
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
        SubtenantUser subtenantuser = new SubtenantUser("02c5996de8d57cd67670ecd25b819d1a", null,
                                                        "b1d009ed-e25e-4ef3-9874-1f614f55090e",
                                                        new Date(1566995743723L), 110, null, "d4288.d1c95@84313.fr",
                                                        true, "f976b28b-a04b-4c12-b959-bf2a25d6d30f", null,
                                                        "02c5996de8d57cd67670ecd25b819d1a", false, false, false, 10,
                                                        null, null, "f1ddb6d0-662e-4347-a6ea-1173d76381d9", 17,
                                                        "b0d23c46-5367-4d14-beea-55b49d9183d7",
                                                        SubtenantUserStatus.getDefault(), null,
                                                        new Date(1566995740153L), "_=2A=J");
        assertTrue(subtenantuser.isValid());
        SubtenantUser subtenantuserInvalid = new SubtenantUser(null, null, "d17047fc-ea25-4be9-875c-8405d53d072e",
                                                               new Date(1566995745394L), 95, null, null, false,
                                                               "08746ccf-9a73-45b1-ade0-147d13c3c5ad4b563e79-c4b1-4ed7-a99d-3b317f0214bc3abd3e3e-24e9-4150-89ef-8c277134f6e2",
                                                               null,
                                                               "^>43Y<汓;H�?�443螋訌\b?4 .3ᔜ4\u001434\u0015�?�.㱫3\u001d43\u001aWT4Z뾕皦�?E\u000444,A뙾\u001f4�?�Wྶ\u0000]4`D3",
                                                               true, true, true, 101, null, null,
                                                               "20ccd028-0580-4eed-bc03-481c2a7a346c", 77,
                                                               "4d992a05-d0ad-48a3-b95a-fd4a183254e1e5c3d750-81c2-4f37-8d6e-a77174a09479ae7485c6-93d7-4136-8d85-dcef90da8ba2",
                                                               SubtenantUserStatus.getDefault(), null,
                                                               new Date(1566995746737L),
                                                               "幚W7邙B펠Z먯�?6\u0019I\u001a@)>䳙H@?CG@4<ķZ�??F�?�F?\u000e@@BH.\u001e]\u001a\u001c>PRBD熊G@�?�>DB>3B<\u0000E3");
        assertFalse(subtenantuserInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantUser subtenantuser1 = new SubtenantUser("02c5996de8d57cd67670ecd25b819d1a", null,
                                                             "09623a3f-2bae-40bf-b3b3-e7b4f33ec2a5",
                                                             new Date(1566995743560L), 42, null, "760c7.5e198@ffb19.fr",
                                                             false, "bf518c71-53f5-4cc3-b757-222c95f8b007", null,
                                                             "02c5996de8d57cd67670ecd25b819d1a", false, true, false,
                                                             -26, null, null, "7356b481-fa05-45ea-9e4e-e7c617281405",
                                                             88, "64ddea37-2245-4f30-bcbc-39aa88ba32bc",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1566995746028L), "_=2A=J");
            SubtenantUser subtenantuser2 = new SubtenantUser("02c5996de8d57cd67670ecd25b819d1a", null,
                                                             "09623a3f-2bae-40bf-b3b3-e7b4f33ec2a5",
                                                             new Date(1566995743560L), 42, null, "760c7.5e198@ffb19.fr",
                                                             false, "bf518c71-53f5-4cc3-b757-222c95f8b007", null,
                                                             "02c5996de8d57cd67670ecd25b819d1a", false, true, false,
                                                             -26, null, null, "7356b481-fa05-45ea-9e4e-e7c617281405",
                                                             88, "64ddea37-2245-4f30-bcbc-39aa88ba32bc",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1566995746028L), "_=2A=J");
            SubtenantUser subtenantuser3 = new SubtenantUser("02c5996de8d57cd67670ecd25b819d1a", null,
                                                             "6000b406-5e46-44f9-af88-785f24f8a956",
                                                             new Date(1566995747554L), 55, null, "6c549.aea7f@22552.me",
                                                             false, "1e323337-3676-41d5-bcc8-25bcc9923a39", null,
                                                             "02c5996de8d57cd67670ecd25b819d1a", false, true, false,
                                                             -118, null, null, "ed244537-5c0c-4023-ad1e-c660bd181563",
                                                             94, "3c9dd2a8-30a3-4e93-a487-5ffc5a0c8f56",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1566995744537L), "_=2A=J");
            assertNotNull(subtenantuser1);
            assertNotNull(subtenantuser2);
            assertNotNull(subtenantuser3);
            assertNotSame(subtenantuser2, subtenantuser1);
            assertNotSame(subtenantuser3, subtenantuser1);
            assertEquals(subtenantuser2, subtenantuser1);
            assertEquals(subtenantuser2, subtenantuser1);
            assertEquals(subtenantuser1, subtenantuser2);
            assertEquals(subtenantuser1, subtenantuser1);
            assertFalse(subtenantuser1.equals(null));
            assertNotEquals(subtenantuser3, subtenantuser1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
