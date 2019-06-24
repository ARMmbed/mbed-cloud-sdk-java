// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ActiveSession.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestActiveSession {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ActiveSession activesession1 = new ActiveSession("6fb4ddd2721d7f5fedbf16812e41749b",
                                                             "8a91255e-f462-40bb-b1e1-90b7778b5d89",
                                                             new Date(1561032449495L),
                                                             "f53c2f94-1fb1-4903-985d-1c77bc0e901a",
                                                             "040e568e-e780-4048-a6ff-fef6ffbeb379");
            ActiveSession activesession2 = activesession1.clone();
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotSame(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
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
            ActiveSession activesession1 = new ActiveSession("6fb4ddd2721d7f5fedbf16812e41749b",
                                                             "2b85f037-afea-4cef-9744-8559f0598971",
                                                             new Date(1561032443537L),
                                                             "af5c4232-7cfb-47c8-9b24-1d8a358a6779",
                                                             "d790d316-6549-4f75-91bc-e31e336e6040");
            ActiveSession activesession2 = new ActiveSession("6fb4ddd2721d7f5fedbf16812e41749b",
                                                             "2b85f037-afea-4cef-9744-8559f0598971",
                                                             new Date(1561032443537L),
                                                             "af5c4232-7cfb-47c8-9b24-1d8a358a6779",
                                                             "d790d316-6549-4f75-91bc-e31e336e6040");
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotSame(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession2.hashCode(), activesession1.hashCode());
            int hashCode = activesession1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, activesession1.hashCode());
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
        ActiveSession activesession = new ActiveSession("6fb4ddd2721d7f5fedbf16812e41749b",
                                                        "93da3136-db3f-4879-8c73-805f15036c69",
                                                        new Date(1561032443530L),
                                                        "5c77424f-39e8-42a8-8f19-75d1fac0ed78",
                                                        "80e042a2-bee8-4f10-b8e8-1c99cab834ca");
        assertTrue(activesession.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ActiveSession activesession1 = new ActiveSession("6fb4ddd2721d7f5fedbf16812e41749b",
                                                             "2f1a8a8e-8337-4bc8-946d-5c8968757f99",
                                                             new Date(1561032452378L),
                                                             "d4d78cd0-3f1b-470d-ad3f-bcf82f5711c8",
                                                             "5451bba4-f813-4997-9f30-8841b67b50e1");
            ActiveSession activesession2 = new ActiveSession("6fb4ddd2721d7f5fedbf16812e41749b",
                                                             "2f1a8a8e-8337-4bc8-946d-5c8968757f99",
                                                             new Date(1561032452378L),
                                                             "d4d78cd0-3f1b-470d-ad3f-bcf82f5711c8",
                                                             "5451bba4-f813-4997-9f30-8841b67b50e1");
            ActiveSession activesession3 = new ActiveSession("6fb4ddd2721d7f5fedbf16812e41749b",
                                                             "1769f741-4a5f-4974-9014-0c06e1509367",
                                                             new Date(1561032452418L),
                                                             "e85f87ee-0bcc-4355-86b5-5a39ea446fcb",
                                                             "70775097-86f2-40b1-aa65-c0aafbc77dfb");
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotNull(activesession3);
            assertNotSame(activesession2, activesession1);
            assertNotSame(activesession3, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession1, activesession2);
            assertEquals(activesession1, activesession1);
            assertFalse(activesession1.equals(null));
            assertNotEquals(activesession3, activesession1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
