// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuer.
 */
public class TestCertificateIssuer {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1547225115860L),
                                                                         "e9aacb37-17a0-41e6-ab37-123381bae6e1",
                                                                         "c94df8d4-3bcd-4157-8c43-236bd03203f0", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "40447172-f29a-4cd4-a04b-36d3ba3c9fbd");
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
    @Test
    public void testHashCode() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1547225122533L),
                                                                         "ed1d8d12-6e4c-403b-9dff-0f620da8661f",
                                                                         "f2aa2510-3f87-4be3-aff3-bdcbbeaf3b6f", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "b65f492d-2477-4ec2-85ae-8abdb90abc30");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new Date(1547225122533L),
                                                                         "ed1d8d12-6e4c-403b-9dff-0f620da8661f",
                                                                         "f2aa2510-3f87-4be3-aff3-bdcbbeaf3b6f", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "b65f492d-2477-4ec2-85ae-8abdb90abc30");
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
    @Test
    public void testIsValid() {
        CertificateIssuer certificateissuer = new CertificateIssuer(new Date(1547225121571L),
                                                                    "1493abeb-a1d8-40c6-b5c9-0d194cb7d8b3",
                                                                    "37f4622d-5aa3-4481-bba0-d99e9bc9c0ab", null,
                                                                    CertificateIssuerType.getDefault(),
                                                                    "9d714da4-e94a-4472-9dca-f27ecffd3d50");
        assertTrue(certificateissuer.isValid());
        CertificateIssuer certificateissuerInvalid = new CertificateIssuer(new Date(1547225119541L),
                                                                           "0754c6b0-3727-42af-9c9b-b79df73b85cf",
                                                                           "bd9e8677-6720-4894-b762-628e0ef74afb", null,
                                                                           CertificateIssuerType.getDefault(), null);
        assertFalse(certificateissuerInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1547225117677L),
                                                                         "947e7cfe-6545-4044-8dd7-d0aeed2ef139",
                                                                         "a169ffcc-810e-42b1-9ae0-8c4b8e063225", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "9314a85d-e580-4748-aed2-74b71dfd4c34");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new Date(1547225117677L),
                                                                         "947e7cfe-6545-4044-8dd7-d0aeed2ef139",
                                                                         "a169ffcc-810e-42b1-9ae0-8c4b8e063225", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "9314a85d-e580-4748-aed2-74b71dfd4c34");
            CertificateIssuer certificateissuer3 = new CertificateIssuer(new Date(1547225114439L),
                                                                         "368a2201-4e1d-49e9-b263-2216fb5cb892",
                                                                         "ec329f23-e24a-443c-a2b3-db5b8f000708", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "b3a76984-7180-4ade-b53f-d31bd7f30a42");
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
