// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollment.
 */
public class TestCertificateEnrollment {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("w-].2-เฐซ]]]]]]]",
                                                                                     new Date(1551867950549L),
                                                                                     "8388b030-2b8b-4542-91dd-b38045b56df7",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "2bd0f893-5292-4c62-bf44-07325db1ecfb",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "237b88b4-7ed6-413d-b704-585efb4e967a",
                                                                                     new Date(1551867951014L));
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
    @Test
    public void testHashCode() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("g-]]].4-?]]",
                                                                                     new Date(1551867950562L),
                                                                                     "3b594dbf-ae6d-43d3-9d1b-b187c55d5624",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "d4e586cf-930a-4b87-94b0-3b1c99509c76",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "2bf8b156-ed9d-454b-8c01-2d1faa16ab0b",
                                                                                     new Date(1551867946083L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("g-]]].4-?]]",
                                                                                     new Date(1551867950562L),
                                                                                     "3b594dbf-ae6d-43d3-9d1b-b187c55d5624",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "d4e586cf-930a-4b87-94b0-3b1c99509c76",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "2bf8b156-ed9d-454b-8c01-2d1faa16ab0b",
                                                                                     new Date(1551867946083L));
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
    @Test
    public void testIsValid() {
        CertificateEnrollment certificateenrollment = new CertificateEnrollment("Y-].p-แป]", new Date(1551867946445L),
                                                                                "fd8c0f1d-e2d8-4ad7-ba3d-dc31732b8125",
                                                                                CertificateEnrollmentEnrollResult.getDefault(),
                                                                                "343bdc61-3200-4248-a7f7-1d25b67c8589",
                                                                                CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                "491abd1e-23fe-43e2-8288-e363a36fc547",
                                                                                new Date(1551867944669L));
        assertTrue(certificateenrollment.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("J-]]]]].7-่]",
                                                                                     new Date(1551867943800L),
                                                                                     "51171855-fb4f-4d3f-b91e-717eef483f3d",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "39349310-f2be-420e-8c19-b564b812b75a",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "ea48cf1f-6aaa-40e2-86da-1560728c7c89",
                                                                                     new Date(1551867951697L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("J-]]]]].7-่]",
                                                                                     new Date(1551867943800L),
                                                                                     "51171855-fb4f-4d3f-b91e-717eef483f3d",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "39349310-f2be-420e-8c19-b564b812b75a",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "ea48cf1f-6aaa-40e2-86da-1560728c7c89",
                                                                                     new Date(1551867951697L));
            CertificateEnrollment certificateenrollment3 = new CertificateEnrollment("I-]]]._-ํ?]]]]]",
                                                                                     new Date(1551867950114L),
                                                                                     "ba1bac6b-dbaa-4017-87d1-dc225e6b11cd",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "672712d3-a584-44f4-bed2-714ded825315",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "ee31fb3c-d36b-4713-abe8-5a7bceb38a05",
                                                                                     new Date(1551867951183L));
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
