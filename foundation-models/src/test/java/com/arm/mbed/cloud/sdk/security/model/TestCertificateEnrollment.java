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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("f-]]]]]]._-�?�]]",
                                                                                     new Date(1553200093130L),
                                                                                     "583ca61b-19a6-4a9d-9d80-dc8447172102",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "497d6ac4-b72d-4473-ac6a-2bee1e006c95",
                                                                                     new Date(1553200093248L));
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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("v-].N-?]]",
                                                                                     new Date(1553200097724L),
                                                                                     "c6f64c4e-398d-4f25-8980-22ae497ee81c",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "8d78fa7e-f417-414e-bfd3-4a8e10db716c",
                                                                                     new Date(1553200097644L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("v-].N-?]]",
                                                                                     new Date(1553200097724L),
                                                                                     "c6f64c4e-398d-4f25-8980-22ae497ee81c",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "8d78fa7e-f417-414e-bfd3-4a8e10db716c",
                                                                                     new Date(1553200097644L));
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
        CertificateEnrollment certificateenrollment = new CertificateEnrollment("e-].Y-�?]", new Date(1553200101564L),
                                                                                "17ff7692-c424-4681-acaa-43d2f97f21af",
                                                                                CertificateEnrollmentEnrollResult.getDefault(),
                                                                                CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                "f6508cff-f073-48e5-80e1-fecd04fea822",
                                                                                new Date(1553200099073L));
        assertTrue(certificateenrollment.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("6-]].a-嫱]]]]]]]",
                                                                                     new Date(1553200099495L),
                                                                                     "5bca49bc-3068-44eb-89c2-f5d9633dd1f3",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "d4448873-1cff-4c1e-b590-55ee33466193",
                                                                                     new Date(1553200101831L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("6-]].a-嫱]]]]]]]",
                                                                                     new Date(1553200099495L),
                                                                                     "5bca49bc-3068-44eb-89c2-f5d9633dd1f3",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "d4448873-1cff-4c1e-b590-55ee33466193",
                                                                                     new Date(1553200101831L));
            CertificateEnrollment certificateenrollment3 = new CertificateEnrollment("0-]].7-�?]]]]]]",
                                                                                     new Date(1553200102248L),
                                                                                     "867fbee3-ef0e-4dd9-8701-5886dde0adc1",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "b4063456-2183-4618-b1f9-fb67e645ab5c",
                                                                                     new Date(1553200098106L));
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