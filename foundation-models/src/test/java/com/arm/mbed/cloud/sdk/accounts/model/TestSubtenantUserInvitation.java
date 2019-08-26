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
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           new Date(1566811758693L),
                                                                                           "d2597.76c89@7403c.fr",
                                                                                           new Date(1566811761656L),
                                                                                           null,
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           null,
                                                                                           new Date(1566811761157L),
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42");
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
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           new Date(1566811759533L),
                                                                                           "b821a.b1df8@5a71e.fr",
                                                                                           new Date(1566811763322L),
                                                                                           null,
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           null,
                                                                                           new Date(1566811761903L),
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42");
            SubtenantUserInvitation subtenantuserinvitation2 = new SubtenantUserInvitation("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           new Date(1566811759533L),
                                                                                           "b821a.b1df8@5a71e.fr",
                                                                                           new Date(1566811763322L),
                                                                                           null,
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           null,
                                                                                           new Date(1566811761903L),
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42");
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
        SubtenantUserInvitation subtenantuserinvitation = new SubtenantUserInvitation("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                      new Date(1566811760500L),
                                                                                      "97b37.a1ad7@69aae.me",
                                                                                      new Date(1566811762164L), null,
                                                                                      "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                      null, new Date(1566811766549L),
                                                                                      "0f0fddcbb77d22b2ab801eb65dfbca42");
        assertTrue(subtenantuserinvitation.isValid());
        SubtenantUserInvitation subtenantuserinvitationInvalid = new SubtenantUserInvitation(null,
                                                                                             new Date(1566811762768L),
                                                                                             null,
                                                                                             new Date(1566811764995L),
                                                                                             null,
                                                                                             "*馠\u0013+\u00123P�?�3䃹\u0017M3Q3□(\t3\u0012:夬\u001e^3D駛�?<姾\u000fͼ僻3333?3;I淑3[懯F哔Sꉈ\u0012\u00153ߌ!㲹\u00133\u00163婱3唵鑢",
                                                                                             null,
                                                                                             new Date(1566811760575L),
                                                                                             "*馠\u0013+\u00123P�?�3䃹\u0017M3Q3□(\t3\u0012:夬\u001e^3D駛�?<姾\u000fͼ僻3333?3;I淑3[懯F哔Sꉈ\u0012\u00153ߌ!㲹\u00133\u00163婱3唵鑢");
        assertFalse(subtenantuserinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           new Date(1566811764367L),
                                                                                           "200df.ec22f@76b7b.fr",
                                                                                           new Date(1566811761519L),
                                                                                           null,
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           null,
                                                                                           new Date(1566811765046L),
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42");
            SubtenantUserInvitation subtenantuserinvitation2 = new SubtenantUserInvitation("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           new Date(1566811764367L),
                                                                                           "200df.ec22f@76b7b.fr",
                                                                                           new Date(1566811761519L),
                                                                                           null,
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           null,
                                                                                           new Date(1566811765046L),
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42");
            SubtenantUserInvitation subtenantuserinvitation3 = new SubtenantUserInvitation("0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           new Date(1566811761009L),
                                                                                           "61961.924d5@344f1.me",
                                                                                           new Date(1566811760186L),
                                                                                           null,
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42",
                                                                                           null,
                                                                                           new Date(1566811760496L),
                                                                                           "0f0fddcbb77d22b2ab801eb65dfbca42");
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
