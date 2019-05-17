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
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("173b4b75-c2d7-4ad2-b9b6-33ea19346d1d",
                                                                                           new Date(1558086962027L),
                                                                                           "aa705670-00f6-424e-a590-0671040a591e",
                                                                                           "e7c4753d-7459-448b-bc9c-48485210d4ab",
                                                                                           new Date(1558086966244L));
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
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("98d1d831-5e95-41dd-9917-38e5e8ce25fa",
                                                                                           new Date(1558086960075L),
                                                                                           "59724b7f-1e75-4cfc-8577-ec853447acfc",
                                                                                           "0bdb6752-e5d6-4eac-89bd-b125ff775de1",
                                                                                           new Date(1558086968223L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("98d1d831-5e95-41dd-9917-38e5e8ce25fa",
                                                                                           new Date(1558086960075L),
                                                                                           "59724b7f-1e75-4cfc-8577-ec853447acfc",
                                                                                           "0bdb6752-e5d6-4eac-89bd-b125ff775de1",
                                                                                           new Date(1558086968223L));
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
        CertificateIssuerConfig certificateissuerconfig = new CertificateIssuerConfig("e6d55b9b-5161-49ee-9521-fbb8da282a72",
                                                                                      new Date(1558086963576L),
                                                                                      "28463e5b-17d9-436c-bcf9-b3cebad14e8e",
                                                                                      "abdc02de-17a9-4cae-81b6-adb96dbd0770",
                                                                                      new Date(1558086959815L));
        assertTrue(certificateissuerconfig.isValid());
        CertificateIssuerConfig certificateissuerconfigInvalid = new CertificateIssuerConfig(null,
                                                                                             new Date(1558086968451L),
                                                                                             "d57fff02-5e58-4861-8d5d-e0ce6d7afb40",
                                                                                             null,
                                                                                             new Date(1558086968544L));
        assertFalse(certificateissuerconfigInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("03c0288d-6969-415c-be19-2fb3650f6ecf",
                                                                                           new Date(1558086961608L),
                                                                                           "fb46516a-7a57-4753-a9d6-0f43201b0160",
                                                                                           "7edea9c4-934a-44b7-9496-e5ef6a7bf158",
                                                                                           new Date(1558086965718L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("03c0288d-6969-415c-be19-2fb3650f6ecf",
                                                                                           new Date(1558086961608L),
                                                                                           "fb46516a-7a57-4753-a9d6-0f43201b0160",
                                                                                           "7edea9c4-934a-44b7-9496-e5ef6a7bf158",
                                                                                           new Date(1558086965718L));
            CertificateIssuerConfig certificateissuerconfig3 = new CertificateIssuerConfig("27ad080f-3645-4ce8-a8e7-7484eb7a93b1",
                                                                                           new Date(1558086960351L),
                                                                                           "28be3d9f-cb76-4cea-87a4-e59694b2766b",
                                                                                           "38279327-0b5a-4ad6-af57-9dff5d1dad5e",
                                                                                           new Date(1558086960836L));
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
