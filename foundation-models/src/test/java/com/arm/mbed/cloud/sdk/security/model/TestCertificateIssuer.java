// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuer.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuer {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1566811765235L),
                                                                         "2d4acf7b-b9d7-4cec-98d4-f7a7a718e79a",
                                                                         "1c4378cc-097a-4014-8b00-b998225da03f", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "dbe5dc8d-bb88-4590-b183-4450385cea81");
            CertificateIssuer certificateissuer2 = certificateissuer1.clone();
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
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
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1566811766224L),
                                                                         "e37e6ed1-bed0-4ec2-bfd4-5eaef1b63041",
                                                                         "d468b32d-00f7-473b-9a3d-0eb8609f332c", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "b9c045e9-da1c-4a57-8ca1-c149cc9046b6");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new Date(1566811766224L),
                                                                         "e37e6ed1-bed0-4ec2-bfd4-5eaef1b63041",
                                                                         "d468b32d-00f7-473b-9a3d-0eb8609f332c", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "b9c045e9-da1c-4a57-8ca1-c149cc9046b6");
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2.hashCode(), certificateissuer1.hashCode());
            int hashCode = certificateissuer1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuer1.hashCode());
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
        CertificateIssuer certificateissuer = new CertificateIssuer(new Date(1566811766725L),
                                                                    "b3777772-8b38-4bcd-80e1-d7bec766f9b0",
                                                                    "f24bef5c-1c3f-46c0-bf6f-624b9638905b", null,
                                                                    CertificateIssuerType.getDefault(),
                                                                    "12d3bc0d-e6f0-4b90-861b-0412928190f8");
        assertTrue(certificateissuer.isValid());
        CertificateIssuer certificateissuerInvalid = new CertificateIssuer(new Date(1566811763263L),
                                                                           "e7eb98fb-bb89-47ec-9ec0-8a12e3bbb7e9dfbfa1ba-3eb0-45a4-ad1e-4b88a9df82f0b3122fb4-4df7-4ece-af8f-a2422f2912ae",
                                                                           "aeb1d91f-863d-47b7-9790-e412f32caa13", null,
                                                                           null, null);
        assertFalse(certificateissuerInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1566811760983L),
                                                                         "542b1750-6b1a-49a7-af4a-33fbd7f8ecfb",
                                                                         "656c660b-8376-4abb-962e-58f4df4383ff", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "05a6c719-390d-4f9b-bc5e-b6f4bbdacbbb");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new Date(1566811760983L),
                                                                         "542b1750-6b1a-49a7-af4a-33fbd7f8ecfb",
                                                                         "656c660b-8376-4abb-962e-58f4df4383ff", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "05a6c719-390d-4f9b-bc5e-b6f4bbdacbbb");
            CertificateIssuer certificateissuer3 = new CertificateIssuer(new Date(1566811759786L),
                                                                         "d2786cb6-e006-4684-8a9d-ee507d21be5e",
                                                                         "bf97542c-393d-4bd1-b486-a5dbfbc0282c", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "87bcb5dc-c61c-40b5-ade5-63e7f406a9c2");
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotNull(certificateissuer3);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertNotSame(certificateissuer3, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer1, certificateissuer2);
            assertEquals(certificateissuer1, certificateissuer1);
            assertFalse(certificateissuer1.equals(null));
            assertNotEquals(certificateissuer3, certificateissuer1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
