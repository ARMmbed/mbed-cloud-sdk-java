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
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           new Date(1558086965899L),
                                                                                           "90dbe.c1c5e@be387.me",
                                                                                           new Date(1558086964569L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           null,
                                                                                           new Date(1558086966561L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32");
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
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           new Date(1558086964768L),
                                                                                           "4bc4c.1edaa@36166.fr",
                                                                                           new Date(1558086964669L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           null,
                                                                                           new Date(1558086968160L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32");
            SubtenantUserInvitation subtenantuserinvitation2 = new SubtenantUserInvitation("2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           new Date(1558086964768L),
                                                                                           "4bc4c.1edaa@36166.fr",
                                                                                           new Date(1558086964669L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           null,
                                                                                           new Date(1558086968160L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32");
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
        SubtenantUserInvitation subtenantuserinvitation = new SubtenantUserInvitation("2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                      new Date(1558086963720L),
                                                                                      "a0126.52cca@e857f.fr",
                                                                                      new Date(1558086968172L),
                                                                                      "2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                      null, new Date(1558086960799L),
                                                                                      "2ab93f7f4ac933ce8ac763c9e4ddcf32");
        assertTrue(subtenantuserinvitation.isValid());
        SubtenantUserInvitation subtenantuserinvitationInvalid = new SubtenantUserInvitation(null,
                                                                                             new Date(1558086967972L),
                                                                                             null,
                                                                                             new Date(1558086966802L),
                                                                                             "5)@55\f5Z堒I5B糎%盘C뵕5N뭹T\u001c\u0018帆逧5�?�Aꆅ`殿K#[555粛55R55ṗ蛑崖,5?VY洄`?\\\\P孹\u0005﵊\u000e5",
                                                                                             null,
                                                                                             new Date(1558086969178L),
                                                                                             "5)@55\f5Z堒I5B糎%盘C뵕5N뭹T\u001c\u0018帆逧5�?�Aꆅ`殿K#[555粛55R55ṗ蛑崖,5?VY洄`?\\\\P孹\u0005﵊\u000e5");
        assertFalse(subtenantuserinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           new Date(1558086967012L),
                                                                                           "f6347.6acc3@e8090.fr",
                                                                                           new Date(1558086962529L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           null,
                                                                                           new Date(1558086960109L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32");
            SubtenantUserInvitation subtenantuserinvitation2 = new SubtenantUserInvitation("2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           new Date(1558086967012L),
                                                                                           "f6347.6acc3@e8090.fr",
                                                                                           new Date(1558086962529L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           null,
                                                                                           new Date(1558086960109L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32");
            SubtenantUserInvitation subtenantuserinvitation3 = new SubtenantUserInvitation("2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           new Date(1558086966679L),
                                                                                           "c8306.33d7d@d9a12.me",
                                                                                           new Date(1558086960317L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32",
                                                                                           null,
                                                                                           new Date(1558086961614L),
                                                                                           "2ab93f7f4ac933ce8ac763c9e4ddcf32");
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
