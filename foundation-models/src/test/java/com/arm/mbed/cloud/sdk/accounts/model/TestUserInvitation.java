// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model UserInvitation.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUserInvitation {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            UserInvitation userinvitation1 = new UserInvitation("fe5cd978-c2e4-4ca8-9027-ff334ccd3e1e",
                                                                new Date(1553592026103L),
                                                                "81bd1e8b-9504-461d-a16d-b6defcf44fba",
                                                                new Date(1553592026531L),
                                                                "3c09c7ef-2c9e-4aa2-9874-7e2123c7f933", null,
                                                                new Date(1553592031143L),
                                                                "86efaf73-552c-464b-af8e-370ba1b7b16b");
            UserInvitation userinvitation2 = userinvitation1.clone();
            assertNotNull(userinvitation1);
            assertNotNull(userinvitation2);
            assertNotSame(userinvitation2, userinvitation1);
            assertEquals(userinvitation2, userinvitation1);
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
            UserInvitation userinvitation1 = new UserInvitation("82e84b9a-64ae-49a3-abde-30b31454326e",
                                                                new Date(1553592030893L),
                                                                "adfbd81e-a0fb-474c-8b34-04059ac5f92b",
                                                                new Date(1553592027444L),
                                                                "9b1e20a6-0c4e-469b-926d-ced843a64e7d", null,
                                                                new Date(1553592027295L),
                                                                "11c00834-8097-4b29-a1ef-ce192e06afcd");
            UserInvitation userinvitation2 = new UserInvitation("82e84b9a-64ae-49a3-abde-30b31454326e",
                                                                new Date(1553592030893L),
                                                                "adfbd81e-a0fb-474c-8b34-04059ac5f92b",
                                                                new Date(1553592027444L),
                                                                "9b1e20a6-0c4e-469b-926d-ced843a64e7d", null,
                                                                new Date(1553592027295L),
                                                                "11c00834-8097-4b29-a1ef-ce192e06afcd");
            assertNotNull(userinvitation1);
            assertNotNull(userinvitation2);
            assertNotSame(userinvitation2, userinvitation1);
            assertEquals(userinvitation2, userinvitation1);
            assertEquals(userinvitation2.hashCode(), userinvitation1.hashCode());
            int hashCode = userinvitation1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, userinvitation1.hashCode());
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
        UserInvitation userinvitation = new UserInvitation("42801474-4521-4b2d-8dc8-69d88782674d",
                                                           new Date(1553592032639L),
                                                           "731b6807-7e32-4a3a-bf3a-abeff0fe42f1",
                                                           new Date(1553592024051L),
                                                           "1194b910-726b-4187-986a-160b051cc76c", null,
                                                           new Date(1553592023678L),
                                                           "13a2f35f-e6b6-48b8-894a-34e6ec0efb72");
        assertTrue(userinvitation.isValid());
        UserInvitation userinvitationInvalid = new UserInvitation("e5fcacd5-a9ca-4449-997b-b29ce9fefc99",
                                                                  new Date(1553592031811L), null,
                                                                  new Date(1553592027736L),
                                                                  "bcca70dd-caa1-4968-b12b-cac20165dc90", null,
                                                                  new Date(1553592024906L),
                                                                  "c02c25c0-ecf4-4fb0-97d5-4a17f2332e80");
        assertFalse(userinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            UserInvitation userinvitation1 = new UserInvitation("798a3ab3-9ff9-4088-8b88-79fa77c9329f",
                                                                new Date(1553592023722L),
                                                                "3739bd07-51cd-46d2-bc8f-a0c191172ee7",
                                                                new Date(1553592022899L),
                                                                "c8b41d1f-c8b3-491d-99de-66afe7207b3b", null,
                                                                new Date(1553592029807L),
                                                                "01130fcc-1673-42d3-8d51-965c8763c421");
            UserInvitation userinvitation2 = new UserInvitation("798a3ab3-9ff9-4088-8b88-79fa77c9329f",
                                                                new Date(1553592023722L),
                                                                "3739bd07-51cd-46d2-bc8f-a0c191172ee7",
                                                                new Date(1553592022899L),
                                                                "c8b41d1f-c8b3-491d-99de-66afe7207b3b", null,
                                                                new Date(1553592029807L),
                                                                "01130fcc-1673-42d3-8d51-965c8763c421");
            UserInvitation userinvitation3 = new UserInvitation("ddce8afc-e4f2-40ac-b094-95184c1eaa91",
                                                                new Date(1553592024483L),
                                                                "9d9d6110-f295-4292-a614-4b354b5a3d58",
                                                                new Date(1553592031846L),
                                                                "84c63c21-366c-4721-85b1-50455544081f", null,
                                                                new Date(1553592023271L),
                                                                "77b5f15c-a8cb-472d-818a-3dd34b3c97c4");
            assertNotNull(userinvitation1);
            assertNotNull(userinvitation2);
            assertNotNull(userinvitation3);
            assertNotSame(userinvitation2, userinvitation1);
            assertNotSame(userinvitation3, userinvitation1);
            assertEquals(userinvitation2, userinvitation1);
            assertEquals(userinvitation2, userinvitation1);
            assertEquals(userinvitation1, userinvitation2);
            assertEquals(userinvitation1, userinvitation1);
            assertFalse(userinvitation1.equals(null));
            assertNotEquals(userinvitation3, userinvitation1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
