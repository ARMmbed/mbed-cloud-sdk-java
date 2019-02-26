// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantUserInvitation.
 */
public class TestSubtenantUserInvitation {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("9e6845d4-acde-40b5-ad86-d97d43f9c391",
                                                                                           new Date(1548165446435L),
                                                                                           "d249bfcb-016e-44ab-811a-46bd964ffef1",
                                                                                           new Date(1548165439759L),
                                                                                           "e825a0f2-e5bd-4560-9178-c6d03738cea6",
                                                                                           null,
                                                                                           new Date(1548165446589L),
                                                                                           "0861ac84-ebf9-467c-a393-be45e7f1047b");
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
    @Test
    public void testHashCode() {
        try {
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("493d5768-ec91-4dd9-a294-66cab96f39d7",
                                                                                           new Date(1548165446797L),
                                                                                           "72faae3c-985a-4794-8a21-e7ebdca75b19",
                                                                                           new Date(1548165445893L),
                                                                                           "14022a8d-15e3-4e8f-bc7f-f6b0ba20aa2c",
                                                                                           null,
                                                                                           new Date(1548165440557L),
                                                                                           "56b40d05-ce61-4815-94aa-4b45b8e2cb26");
            SubtenantUserInvitation subtenantuserinvitation2 = new SubtenantUserInvitation("493d5768-ec91-4dd9-a294-66cab96f39d7",
                                                                                           new Date(1548165446797L),
                                                                                           "72faae3c-985a-4794-8a21-e7ebdca75b19",
                                                                                           new Date(1548165445893L),
                                                                                           "14022a8d-15e3-4e8f-bc7f-f6b0ba20aa2c",
                                                                                           null,
                                                                                           new Date(1548165440557L),
                                                                                           "56b40d05-ce61-4815-94aa-4b45b8e2cb26");
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
    @Test
    public void testIsValid() {
        SubtenantUserInvitation subtenantuserinvitation = new SubtenantUserInvitation("126ffd89-33ef-4224-8ad0-ddb7ecec6dfc",
                                                                                      new Date(1548165448092L),
                                                                                      "adc5ce39-6105-4e06-9010-31b3866949da",
                                                                                      new Date(1548165439176L),
                                                                                      "100622f9-157e-4e1e-80d0-98dee2e0ebf3",
                                                                                      null, new Date(1548165444605L),
                                                                                      "3ba953c1-7174-4c7e-8323-3d995feee29b");
        assertTrue(subtenantuserinvitation.isValid());
        SubtenantUserInvitation subtenantuserinvitationInvalid = new SubtenantUserInvitation(null,
                                                                                             new Date(1548165443286L),
                                                                                             null,
                                                                                             new Date(1548165441334L),
                                                                                             "144155b7-255a-4f1d-88b0-02726b85804a",
                                                                                             null,
                                                                                             new Date(1548165442928L),
                                                                                             "44b66d5d-2b65-4f73-a4b2-e44a476a5a71");
        assertFalse(subtenantuserinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("35af508e-e98b-4761-aa6f-aac2ace40c0a",
                                                                                           new Date(1548165444547L),
                                                                                           "f385dcee-d92d-4720-94af-1e8044afcb5c",
                                                                                           new Date(1548165448253L),
                                                                                           "d576f028-e21b-4abf-bddb-b038c1f7689a",
                                                                                           null,
                                                                                           new Date(1548165448571L),
                                                                                           "9e320bb8-58ba-4496-994f-da4264241e1b");
            SubtenantUserInvitation subtenantuserinvitation2 = new SubtenantUserInvitation("35af508e-e98b-4761-aa6f-aac2ace40c0a",
                                                                                           new Date(1548165444547L),
                                                                                           "f385dcee-d92d-4720-94af-1e8044afcb5c",
                                                                                           new Date(1548165448253L),
                                                                                           "d576f028-e21b-4abf-bddb-b038c1f7689a",
                                                                                           null,
                                                                                           new Date(1548165448571L),
                                                                                           "9e320bb8-58ba-4496-994f-da4264241e1b");
            SubtenantUserInvitation subtenantuserinvitation3 = new SubtenantUserInvitation("0ed50b94-46e1-4794-9c69-544c3349eefb",
                                                                                           new Date(1548165443302L),
                                                                                           "dee7faa6-5369-4d11-bc13-51f3893081f0",
                                                                                           new Date(1548165442497L),
                                                                                           "8d0599cd-8360-4b56-8fe0-32fbf2daa5bf",
                                                                                           null,
                                                                                           new Date(1548165446292L),
                                                                                           "62340ade-6670-4ae6-b11d-29315418dd32");
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