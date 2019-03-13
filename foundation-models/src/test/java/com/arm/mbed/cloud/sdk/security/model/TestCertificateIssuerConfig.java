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
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("e649fdc4-3c44-4e93-866d-3d9079858ace",
                                                                                           "415c580b-a5f4-44f4-8278-628e2293688c",
                                                                                           new Date(1552477763867L),
                                                                                           "80f2c92f-3f02-4c9d-a41a-7b271fd5f7b2",
                                                                                           new Date(1552477764185L));
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
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("78d434d6-a7db-449c-aab1-a6cae6aa0025",
                                                                                           "3073c826-9d42-49c3-99c2-48e3353d174e",
                                                                                           new Date(1552477758574L),
                                                                                           "5d973c55-1a80-4ced-ad20-8deb779a026f",
                                                                                           new Date(1552477761548L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("78d434d6-a7db-449c-aab1-a6cae6aa0025",
                                                                                           "3073c826-9d42-49c3-99c2-48e3353d174e",
                                                                                           new Date(1552477758574L),
                                                                                           "5d973c55-1a80-4ced-ad20-8deb779a026f",
                                                                                           new Date(1552477761548L));
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
        CertificateIssuerConfig certificateissuerconfig = new CertificateIssuerConfig("d56e5299-6294-4f52-955d-c2be0c89c0a1",
                                                                                      "eaecc9a3-795a-40d0-955e-5b80d6222acb",
                                                                                      new Date(1552477763860L),
                                                                                      "08781632-2e91-4266-b893-93ea685cb6c7",
                                                                                      new Date(1552477758444L));
        assertTrue(certificateissuerconfig.isValid());
        CertificateIssuerConfig certificateissuerconfigInvalid = new CertificateIssuerConfig(null, null,
                                                                                             new Date(1552477763095L),
                                                                                             "f15831a2-b807-4f64-87fd-90253bd9adbc",
                                                                                             new Date(1552477763738L));
        assertFalse(certificateissuerconfigInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("542c467f-f10a-4636-aaa1-5b80b348604a",
                                                                                           "55b1f3b1-12c3-4e8b-a2db-639ea4b37ca8",
                                                                                           new Date(1552477765741L),
                                                                                           "4f82f437-3caa-416e-aa3b-4e1bd96accbd",
                                                                                           new Date(1552477764209L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("542c467f-f10a-4636-aaa1-5b80b348604a",
                                                                                           "55b1f3b1-12c3-4e8b-a2db-639ea4b37ca8",
                                                                                           new Date(1552477765741L),
                                                                                           "4f82f437-3caa-416e-aa3b-4e1bd96accbd",
                                                                                           new Date(1552477764209L));
            CertificateIssuerConfig certificateissuerconfig3 = new CertificateIssuerConfig("19f026ab-6b6c-4f6e-b920-0091d26a1d5b",
                                                                                           "36b7eb47-c06a-40bb-8925-93179106f5e3",
                                                                                           new Date(1552477757081L),
                                                                                           "3fab662e-94df-481b-85f3-27629147e4ee",
                                                                                           new Date(1552477759267L));
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
