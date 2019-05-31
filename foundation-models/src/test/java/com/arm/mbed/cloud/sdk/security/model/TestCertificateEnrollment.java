// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollment.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateEnrollment {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-].Tp", new Date(1559313339641L),
                                                                                     "812e6dd1-c181-4575-afa6-4fa203ecf26f",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "4fc7df17-d404-4c0e-9220-f909738ad806",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "4e33c23d-5e27-4833-96c6-f49e7753bf81",
                                                                                     new Date(1559313340296L));
            CertificateEnrollment certificateenrollment2 = certificateenrollment1.clone();
            assertNotNull(certificateenrollment1);
            assertNotNull(certificateenrollment2);
            assertNotSame(certificateenrollment2, certificateenrollment1);
            assertEquals(certificateenrollment2, certificateenrollment1);
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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-].Tp", new Date(1559313341561L),
                                                                                     "4f75d81e-dd12-4392-a978-9b8b2e048979",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "66cd7f70-0f36-49eb-b93b-59d604e8d2e9",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "f2079687-02d0-40a0-acd6-910ddc1deee5",
                                                                                     new Date(1559313345248L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("_-].Tp", new Date(1559313341561L),
                                                                                     "4f75d81e-dd12-4392-a978-9b8b2e048979",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "66cd7f70-0f36-49eb-b93b-59d604e8d2e9",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "f2079687-02d0-40a0-acd6-910ddc1deee5",
                                                                                     new Date(1559313345248L));
            assertNotNull(certificateenrollment1);
            assertNotNull(certificateenrollment2);
            assertNotSame(certificateenrollment2, certificateenrollment1);
            assertEquals(certificateenrollment2, certificateenrollment1);
            assertEquals(certificateenrollment2.hashCode(), certificateenrollment1.hashCode());
            int hashCode = certificateenrollment1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateenrollment1.hashCode());
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
        CertificateEnrollment certificateenrollment = new CertificateEnrollment("_-].Tp", new Date(1559313340404L),
                                                                                "863c9b6a-7c65-4fa1-99cf-06a87fdf78c5",
                                                                                CertificateEnrollmentEnrollResult.getDefault(),
                                                                                "7911f4e6-b111-49e1-a4f8-4bb98367a619",
                                                                                CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                "082e8094-6ccf-4f14-a890-7bf1cb88ff52",
                                                                                new Date(1559313343711L));
        assertTrue(certificateenrollment.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-].Tp", new Date(1559313347450L),
                                                                                     "3ecf123c-dacb-4737-92aa-24426aa8dbd0",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "166bc138-ea31-4092-a1dc-1eb35ea3d9a3",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "6b263604-c013-4617-b4e7-45e649f09a80",
                                                                                     new Date(1559313342232L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("_-].Tp", new Date(1559313347450L),
                                                                                     "3ecf123c-dacb-4737-92aa-24426aa8dbd0",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "166bc138-ea31-4092-a1dc-1eb35ea3d9a3",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "6b263604-c013-4617-b4e7-45e649f09a80",
                                                                                     new Date(1559313342232L));
            CertificateEnrollment certificateenrollment3 = new CertificateEnrollment("_-].Tp", new Date(1559313341466L),
                                                                                     "b5efcc6d-291e-4c77-a9ae-353f83d1311a",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "a7926d65-1b66-4939-8ab1-f7b337527d8f",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "5eef195b-2936-4447-8cbe-608dda18c85c",
                                                                                     new Date(1559313348221L));
            assertNotNull(certificateenrollment1);
            assertNotNull(certificateenrollment2);
            assertNotNull(certificateenrollment3);
            assertNotSame(certificateenrollment2, certificateenrollment1);
            assertNotSame(certificateenrollment3, certificateenrollment1);
            assertEquals(certificateenrollment2, certificateenrollment1);
            assertEquals(certificateenrollment2, certificateenrollment1);
            assertEquals(certificateenrollment1, certificateenrollment2);
            assertEquals(certificateenrollment1, certificateenrollment1);
            assertFalse(certificateenrollment1.equals(null));
            assertNotEquals(certificateenrollment3, certificateenrollment1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
