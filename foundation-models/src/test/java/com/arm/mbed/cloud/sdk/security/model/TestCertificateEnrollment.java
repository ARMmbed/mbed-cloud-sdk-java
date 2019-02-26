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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("0-]].U-묑]]",
                                                                                     new Date(1548165445464L),
                                                                                     "9364d2b2-e982-4d08-96b2-0c09d11fa8a0",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "7ad8da9d-d881-44d9-a89c-994ea4ae7d6c",
                                                                                     new Date(1548165444409L));
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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("T-]].Z-귨]]]",
                                                                                     new Date(1548165439987L),
                                                                                     "046373fa-87db-4eeb-9c89-7955151d98d0",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "d07e4e24-d75e-4151-8272-db9ed712c1e6",
                                                                                     new Date(1548165445974L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("T-]].Z-귨]]]",
                                                                                     new Date(1548165439987L),
                                                                                     "046373fa-87db-4eeb-9c89-7955151d98d0",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "d07e4e24-d75e-4151-8272-db9ed712c1e6",
                                                                                     new Date(1548165445974L));
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
        CertificateEnrollment certificateenrollment = new CertificateEnrollment("E-].H-�?]]]]]",
                                                                                new Date(1548165442675L),
                                                                                "e56e53d8-418d-45d6-8686-0590470a34ae",
                                                                                CertificateEnrollmentEnrollResult.getDefault(),
                                                                                CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                "bf7864f8-9fbb-4ffe-9e71-908b33a26244",
                                                                                new Date(1548165441055L));
        assertTrue(certificateenrollment.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("3-]]].s-�?]",
                                                                                     new Date(1548165439998L),
                                                                                     "668edf0b-5fd9-47a3-be25-d7f99db58f76",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "e9c8f28f-9d71-4f08-b8d4-532b96476726",
                                                                                     new Date(1548165446916L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("3-]]].s-�?]",
                                                                                     new Date(1548165439998L),
                                                                                     "668edf0b-5fd9-47a3-be25-d7f99db58f76",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "e9c8f28f-9d71-4f08-b8d4-532b96476726",
                                                                                     new Date(1548165446916L));
            CertificateEnrollment certificateenrollment3 = new CertificateEnrollment("l-]]._-榇]]",
                                                                                     new Date(1548165439568L),
                                                                                     "cc149ed6-e180-42a6-91b2-13ee62f62132",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "14892dc0-739f-40af-aed0-d005e30bf62e",
                                                                                     new Date(1548165441794L));
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