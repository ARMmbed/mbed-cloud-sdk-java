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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-]]]]]._",
                                                                                     new Date(1559148827811L),
                                                                                     "7184c9c5-09bd-4443-921f-5a94e270187e",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "24daab91-23db-4a19-b6fd-35c1368e4699",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "791856d6-542d-428c-ab69-604be8432ec0",
                                                                                     new Date(1559148827122L));
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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-]]]]]._",
                                                                                     new Date(1559148833320L),
                                                                                     "170c10cb-5f92-4b4e-b012-7d4643c0f462",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "b5ffcea9-cb12-4677-b732-be822753a342",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "0206d4a1-d2e8-4a8d-b22a-fbaf610eedf0",
                                                                                     new Date(1559148830235L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("_-]]]]]._",
                                                                                     new Date(1559148833320L),
                                                                                     "170c10cb-5f92-4b4e-b012-7d4643c0f462",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "b5ffcea9-cb12-4677-b732-be822753a342",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "0206d4a1-d2e8-4a8d-b22a-fbaf610eedf0",
                                                                                     new Date(1559148830235L));
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
        CertificateEnrollment certificateenrollment = new CertificateEnrollment("_-]]]]]._", new Date(1559148835086L),
                                                                                "20ed1bc5-5fc6-4ab2-b8a1-5e37b84e1c63",
                                                                                CertificateEnrollmentEnrollResult.getDefault(),
                                                                                "6cb85be7-c71f-4e59-b38c-1e454149ed1e",
                                                                                CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                "6f22227c-a2bd-44fc-b654-40b79666b91b",
                                                                                new Date(1559148828331L));
        assertTrue(certificateenrollment.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-]]]]]._",
                                                                                     new Date(1559148833671L),
                                                                                     "6090c2aa-ff4c-42dd-a9f6-5094ea1d65be",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "88ec9851-f786-4b89-8f17-dc3874b2ce96",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "9fa998a4-d577-4e94-9efc-2221a3f1d675",
                                                                                     new Date(1559148826677L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("_-]]]]]._",
                                                                                     new Date(1559148833671L),
                                                                                     "6090c2aa-ff4c-42dd-a9f6-5094ea1d65be",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "88ec9851-f786-4b89-8f17-dc3874b2ce96",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "9fa998a4-d577-4e94-9efc-2221a3f1d675",
                                                                                     new Date(1559148826677L));
            CertificateEnrollment certificateenrollment3 = new CertificateEnrollment("_-]]]]]._",
                                                                                     new Date(1559148830470L),
                                                                                     "378cb741-6232-4820-8a85-687ef15a6e92",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "b2541498-64c3-4d8d-b5a1-19792ba719cb",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "9a8896ae-7429-4240-a039-70fa33075487",
                                                                                     new Date(1559148832225L));
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
