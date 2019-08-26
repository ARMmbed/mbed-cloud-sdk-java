// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerConfig.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuerConfig {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("dd68a8d6-96ba-485a-bf50-3d2200d514bc",
                                                                                           new Date(1566811760035L),
                                                                                           "e47632a1-be37-475f-ab1d-b70346642f58",
                                                                                           "865efbdc-4b94-4f27-99e6-9041b3458774",
                                                                                           new Date(1566811758429L));
            CertificateIssuerConfig certificateissuerconfig2 = certificateissuerconfig1.clone();
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
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
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("8c62451d-955f-4b3b-b1c3-bb6c7f529239",
                                                                                           new Date(1566811759527L),
                                                                                           "b4c0f973-4713-4946-9b09-0fa0d0b16a25",
                                                                                           "f00400e6-b759-4762-9374-664d732b04cc",
                                                                                           new Date(1566811758256L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("8c62451d-955f-4b3b-b1c3-bb6c7f529239",
                                                                                           new Date(1566811759527L),
                                                                                           "b4c0f973-4713-4946-9b09-0fa0d0b16a25",
                                                                                           "f00400e6-b759-4762-9374-664d732b04cc",
                                                                                           new Date(1566811758256L));
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2.hashCode(), certificateissuerconfig1.hashCode());
            int hashCode = certificateissuerconfig1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuerconfig1.hashCode());
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
        CertificateIssuerConfig certificateissuerconfig = new CertificateIssuerConfig("5d733b33-d311-404f-a523-1ec60c4e003e",
                                                                                      new Date(1566811766343L),
                                                                                      "042f459b-3e77-409b-9d84-3ea427f89694",
                                                                                      "ec983385-d512-49c2-a07b-cf4bf5dcb033",
                                                                                      new Date(1566811766959L));
        assertTrue(certificateissuerconfig.isValid());
        CertificateIssuerConfig certificateissuerconfigInvalid = new CertificateIssuerConfig(null,
                                                                                             new Date(1566811762939L),
                                                                                             "bf17b111-55db-454f-8497-aa3211e4c651",
                                                                                             null,
                                                                                             new Date(1566811765230L));
        assertFalse(certificateissuerconfigInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("b3c522b5-d066-47a6-a2c6-7e570e1b35ae",
                                                                                           new Date(1566811760781L),
                                                                                           "8b08b335-0651-451b-8055-5c5fc371726d",
                                                                                           "475bfd8d-88ac-4837-a4ae-635755e21919",
                                                                                           new Date(1566811758401L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("b3c522b5-d066-47a6-a2c6-7e570e1b35ae",
                                                                                           new Date(1566811760781L),
                                                                                           "8b08b335-0651-451b-8055-5c5fc371726d",
                                                                                           "475bfd8d-88ac-4837-a4ae-635755e21919",
                                                                                           new Date(1566811758401L));
            CertificateIssuerConfig certificateissuerconfig3 = new CertificateIssuerConfig("7036280d-7b08-475b-b840-0e3e9dc8357e",
                                                                                           new Date(1566811758149L),
                                                                                           "caa2e49f-eb04-4d87-a328-05d3e1e5f20f",
                                                                                           "80ddb7f7-c3a6-4cce-9357-f24f1dd67de6",
                                                                                           new Date(1566811767441L));
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotNull(certificateissuerconfig3);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertNotSame(certificateissuerconfig3, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig1, certificateissuerconfig2);
            assertEquals(certificateissuerconfig1, certificateissuerconfig1);
            assertFalse(certificateissuerconfig1.equals(null));
            assertNotEquals(certificateissuerconfig3, certificateissuerconfig1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
