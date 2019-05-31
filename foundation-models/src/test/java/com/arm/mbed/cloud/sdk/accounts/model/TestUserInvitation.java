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
            UserInvitation userinvitation1 = new UserInvitation("e5adc84a514e5b3d136332ece0ac7d95",
                                                                new Date(1559300099425L), "c40d4.6a847@15919.fr",
                                                                new Date(1559300100350L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95", null,
                                                                new Date(1559300101445L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95");
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
            UserInvitation userinvitation1 = new UserInvitation("e5adc84a514e5b3d136332ece0ac7d95",
                                                                new Date(1559300099334L), "e2892.9d076@1c4ba.fr",
                                                                new Date(1559300106756L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95", null,
                                                                new Date(1559300101030L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95");
            UserInvitation userinvitation2 = new UserInvitation("e5adc84a514e5b3d136332ece0ac7d95",
                                                                new Date(1559300099334L), "e2892.9d076@1c4ba.fr",
                                                                new Date(1559300106756L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95", null,
                                                                new Date(1559300101030L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95");
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
        UserInvitation userinvitation = new UserInvitation("e5adc84a514e5b3d136332ece0ac7d95", new Date(1559300100894L),
                                                           "ef67f.eeb79@23965.me", new Date(1559300099818L),
                                                           "e5adc84a514e5b3d136332ece0ac7d95", null,
                                                           new Date(1559300104510L),
                                                           "e5adc84a514e5b3d136332ece0ac7d95");
        assertTrue(userinvitation.isValid());
        UserInvitation userinvitationInvalid = new UserInvitation("犔\u001e\u0013J\u0001以㢈뚔.屳\u001e:\u0003:QP䶲#(\u000f[驧國Y�?�\u0018᪾鰵↻<蚯�?�疋\\\\\u0014OC<+㟹AT\u0001�?顤露೷??B,�?�:䡨K茭X碒=K�?�",
                                                                  new Date(1559300101361L), null,
                                                                  new Date(1559300100406L),
                                                                  "犔\u001e\u0013J\u0001以㢈뚔.屳\u001e:\u0003:QP䶲#(\u000f[驧國Y�?�\u0018᪾鰵↻<蚯�?�疋\\\\\u0014OC<+㟹AT\u0001�?顤露೷??B,�?�:䡨K茭X碒=K�?�",
                                                                  null, new Date(1559300097798L),
                                                                  "犔\u001e\u0013J\u0001以㢈뚔.屳\u001e:\u0003:QP䶲#(\u000f[驧國Y�?�\u0018᪾鰵↻<蚯�?�疋\\\\\u0014OC<+㟹AT\u0001�?顤露೷??B,�?�:䡨K茭X碒=K�?�");
        assertFalse(userinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            UserInvitation userinvitation1 = new UserInvitation("e5adc84a514e5b3d136332ece0ac7d95",
                                                                new Date(1559300104935L), "68a0b.82e51@a87b6.fr",
                                                                new Date(1559300098606L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95", null,
                                                                new Date(1559300104894L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95");
            UserInvitation userinvitation2 = new UserInvitation("e5adc84a514e5b3d136332ece0ac7d95",
                                                                new Date(1559300104935L), "68a0b.82e51@a87b6.fr",
                                                                new Date(1559300098606L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95", null,
                                                                new Date(1559300104894L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95");
            UserInvitation userinvitation3 = new UserInvitation("e5adc84a514e5b3d136332ece0ac7d95",
                                                                new Date(1559300098776L), "4b49d.7abf4@7f7b8.fr",
                                                                new Date(1559300102411L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95", null,
                                                                new Date(1559300105640L),
                                                                "e5adc84a514e5b3d136332ece0ac7d95");
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
