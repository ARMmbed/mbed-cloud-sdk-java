// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantUserInvitation.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantUserInvitation {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("9eae467e-e37c-47e4-ba5f-1481e8c3a90c",
                                                                                           new Date(1553795414755L),
                                                                                           "b9a4f57b-67a5-4b48-8882-969c23462d71",
                                                                                           new Date(1553795417654L),
                                                                                           "ed803f71-562b-438d-a3bf-c17bffe6d1d5",
                                                                                           null,
                                                                                           new Date(1553795418221L),
                                                                                           "b1ce530a-f527-4a4b-a2f4-8c646e502a72");
            SubtenantUserInvitation subtenantuserinvitation2 = subtenantuserinvitation1.clone();
            assertNotNull(subtenantuserinvitation1);
            assertNotNull(subtenantuserinvitation2);
            assertNotSame(subtenantuserinvitation2, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation2, subtenantuserinvitation1);
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
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("c582c7ef-0c34-4e52-b758-299e8bb2db82",
                                                                                           new Date(1553795414525L),
                                                                                           "fa45c68b-f01e-4ebf-9111-f19da1057091",
                                                                                           new Date(1553795413515L),
                                                                                           "dd2ef5c8-28cb-466e-b484-3255703f8a50",
                                                                                           null,
                                                                                           new Date(1553795416424L),
                                                                                           "de827f22-bbbc-44e2-add4-db271aa7abcc");
            SubtenantUserInvitation subtenantuserinvitation2 = new SubtenantUserInvitation("c582c7ef-0c34-4e52-b758-299e8bb2db82",
                                                                                           new Date(1553795414525L),
                                                                                           "fa45c68b-f01e-4ebf-9111-f19da1057091",
                                                                                           new Date(1553795413515L),
                                                                                           "dd2ef5c8-28cb-466e-b484-3255703f8a50",
                                                                                           null,
                                                                                           new Date(1553795416424L),
                                                                                           "de827f22-bbbc-44e2-add4-db271aa7abcc");
            assertNotNull(subtenantuserinvitation1);
            assertNotNull(subtenantuserinvitation2);
            assertNotSame(subtenantuserinvitation2, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation2, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation2.hashCode(), subtenantuserinvitation1.hashCode());
            int hashCode = subtenantuserinvitation1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantuserinvitation1.hashCode());
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
        SubtenantUserInvitation subtenantuserinvitation = new SubtenantUserInvitation("2762b1f6-f14f-4df1-868a-708acb47be8d",
                                                                                      new Date(1553795415332L),
                                                                                      "3645e8b8-bfd8-4da7-8293-94965656105e",
                                                                                      new Date(1553795413243L),
                                                                                      "54b55353-eecf-4784-948b-3230bb9f9e53",
                                                                                      null, new Date(1553795418671L),
                                                                                      "dcb823de-c86a-45fe-9bc7-e47ea9938728");
        assertTrue(subtenantuserinvitation.isValid());
        SubtenantUserInvitation subtenantuserinvitationInvalid = new SubtenantUserInvitation(null,
                                                                                             new Date(1553795410608L),
                                                                                             null,
                                                                                             new Date(1553795416360L),
                                                                                             "22daf1cc-3889-4b0f-874a-596187c97be4",
                                                                                             null,
                                                                                             new Date(1553795418233L),
                                                                                             "c961f1b5-f6bf-42cc-afa0-9f2d5ddc0004");
        assertFalse(subtenantuserinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("dca07765-7395-40f3-8d4d-7f80a76eb344",
                                                                                           new Date(1553795419253L),
                                                                                           "33639af3-1a4c-4fb2-9ba9-b64a70afe8f7",
                                                                                           new Date(1553795412123L),
                                                                                           "5b4f0cdc-6684-4324-ad97-98c3e769ad28",
                                                                                           null,
                                                                                           new Date(1553795410191L),
                                                                                           "790cd99f-3aaf-4d02-b093-e7d3b569d1b7");
            SubtenantUserInvitation subtenantuserinvitation2 = new SubtenantUserInvitation("dca07765-7395-40f3-8d4d-7f80a76eb344",
                                                                                           new Date(1553795419253L),
                                                                                           "33639af3-1a4c-4fb2-9ba9-b64a70afe8f7",
                                                                                           new Date(1553795412123L),
                                                                                           "5b4f0cdc-6684-4324-ad97-98c3e769ad28",
                                                                                           null,
                                                                                           new Date(1553795410191L),
                                                                                           "790cd99f-3aaf-4d02-b093-e7d3b569d1b7");
            SubtenantUserInvitation subtenantuserinvitation3 = new SubtenantUserInvitation("e3babf7f-9cd8-420c-87c4-10413ebf7dbf",
                                                                                           new Date(1553795415994L),
                                                                                           "c7743a15-f8f0-4ce4-9f9c-a2cf5781255e",
                                                                                           new Date(1553795416351L),
                                                                                           "16bfed6b-b766-4e0a-bec0-096a6466edc3",
                                                                                           null,
                                                                                           new Date(1553795414588L),
                                                                                           "4c5cf0d2-2333-470d-a7ed-8c52bbb0fac4");
            assertNotNull(subtenantuserinvitation1);
            assertNotNull(subtenantuserinvitation2);
            assertNotNull(subtenantuserinvitation3);
            assertNotSame(subtenantuserinvitation2, subtenantuserinvitation1);
            assertNotSame(subtenantuserinvitation3, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation2, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation2, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation1, subtenantuserinvitation2);
            assertEquals(subtenantuserinvitation1, subtenantuserinvitation1);
            assertFalse(subtenantuserinvitation1.equals(null));
            assertNotEquals(subtenantuserinvitation3, subtenantuserinvitation1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
