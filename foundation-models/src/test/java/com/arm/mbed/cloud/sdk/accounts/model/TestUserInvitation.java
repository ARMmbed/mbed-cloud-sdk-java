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
            UserInvitation userinvitation1 = new UserInvitation("3b2c98a6b0d3341e5184f0f766dde798",
                                                                new Date(1610683994516L), "13d30.31a34@cd26c.fr",
                                                                new Date(1610683990864L), null,
                                                                "3b2c98a6b0d3341e5184f0f766dde798", null,
                                                                new Date(1610683985859L),
                                                                "3b2c98a6b0d3341e5184f0f766dde798");
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
            UserInvitation userinvitation1 = new UserInvitation("3b2c98a6b0d3341e5184f0f766dde798",
                                                                new Date(1610683992002L), "7e07e.fa8be@a5c54.fr",
                                                                new Date(1610683990063L), null,
                                                                "3b2c98a6b0d3341e5184f0f766dde798", null,
                                                                new Date(1610683993589L),
                                                                "3b2c98a6b0d3341e5184f0f766dde798");
            UserInvitation userinvitation2 = new UserInvitation("3b2c98a6b0d3341e5184f0f766dde798",
                                                                new Date(1610683992002L), "7e07e.fa8be@a5c54.fr",
                                                                new Date(1610683990063L), null,
                                                                "3b2c98a6b0d3341e5184f0f766dde798", null,
                                                                new Date(1610683993589L),
                                                                "3b2c98a6b0d3341e5184f0f766dde798");
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
        UserInvitation userinvitation = new UserInvitation("3b2c98a6b0d3341e5184f0f766dde798", new Date(1610683991474L),
                                                           "fbd84.15c5d@55c57.fr", new Date(1610683994407L), null,
                                                           "3b2c98a6b0d3341e5184f0f766dde798", null,
                                                           new Date(1610683990738L),
                                                           "3b2c98a6b0d3341e5184f0f766dde798");
        assertTrue(userinvitation.isValid());
        UserInvitation userinvitationInvalid = new UserInvitation("\u001a뺳@ꩵ@窥VUD\u000eA.L=GZ⼔�?�W \u0011\u000f敃�?<R>뜲�??�?�T/<-縭 쨊\u0007Y'쪹�?�//,䔑X,Q\u000b᪔S�?�฾=픗(,�?�^\u000e",
                                                                  new Date(1610683987624L), null,
                                                                  new Date(1610683990369L), null,
                                                                  "\u001a뺳@ꩵ@窥VUD\u000eA.L=GZ⼔�?�W \u0011\u000f敃�?<R>뜲�??�?�T/<-縭 쨊\u0007Y'쪹�?�//,䔑X,Q\u000b᪔S�?�฾=픗(,�?�^\u000e",
                                                                  null, new Date(1610683991559L),
                                                                  "\u001a뺳@ꩵ@窥VUD\u000eA.L=GZ⼔�?�W \u0011\u000f敃�?<R>뜲�??�?�T/<-縭 쨊\u0007Y'쪹�?�//,䔑X,Q\u000b᪔S�?�฾=픗(,�?�^\u000e");
        assertFalse(userinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            UserInvitation userinvitation1 = new UserInvitation("3b2c98a6b0d3341e5184f0f766dde798",
                                                                new Date(1610683989500L), "a8194.72519@e2ca7.me",
                                                                new Date(1610683987488L), null,
                                                                "3b2c98a6b0d3341e5184f0f766dde798", null,
                                                                new Date(1610683986066L),
                                                                "3b2c98a6b0d3341e5184f0f766dde798");
            UserInvitation userinvitation2 = new UserInvitation("3b2c98a6b0d3341e5184f0f766dde798",
                                                                new Date(1610683989500L), "a8194.72519@e2ca7.me",
                                                                new Date(1610683987488L), null,
                                                                "3b2c98a6b0d3341e5184f0f766dde798", null,
                                                                new Date(1610683986066L),
                                                                "3b2c98a6b0d3341e5184f0f766dde798");
            UserInvitation userinvitation3 = new UserInvitation("3b2c98a6b0d3341e5184f0f766dde798",
                                                                new Date(1610683985554L), "57cb3.60fcd@979a2.fr",
                                                                new Date(1610683989253L), null,
                                                                "3b2c98a6b0d3341e5184f0f766dde798", null,
                                                                new Date(1610683988929L),
                                                                "3b2c98a6b0d3341e5184f0f766dde798");
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
