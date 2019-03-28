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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-].3-?]]]]]]",
                                                                                     new Date(1553795410262L),
                                                                                     "d6395a6d-44b6-463a-8b0c-2cb8e3ed65fc",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "7cb49b13-cbdf-49d2-b25f-a8a9fb459875",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "d413dd8a-612b-42ba-b295-65c9d5fc5a13",
                                                                                     new Date(1553795414422L));
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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("3-]].2-᭯]]]",
                                                                                     new Date(1553795416468L),
                                                                                     "0cdedad6-6601-4daf-8f6b-39b6579b5b88",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "95532106-e86c-48dc-88f1-5b3160953141",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "7b5f8654-aeb7-4609-a618-d32ca05f3c62",
                                                                                     new Date(1553795416631L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("3-]].2-᭯]]]",
                                                                                     new Date(1553795416468L),
                                                                                     "0cdedad6-6601-4daf-8f6b-39b6579b5b88",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "95532106-e86c-48dc-88f1-5b3160953141",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "7b5f8654-aeb7-4609-a618-d32ca05f3c62",
                                                                                     new Date(1553795416631L));
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
        CertificateEnrollment certificateenrollment = new CertificateEnrollment("L-]].l-缧]", new Date(1553795412694L),
                                                                                "fb558a1d-fdff-451e-acf8-22602d812664",
                                                                                CertificateEnrollmentEnrollResult.getDefault(),
                                                                                "2dac9213-4aa6-41a4-b801-933a104359b1",
                                                                                CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                "14186b8c-44f6-4ef9-a1b6-4959167f94dc",
                                                                                new Date(1553795413637L));
        assertTrue(certificateenrollment.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("i-].3-瓚]]",
                                                                                     new Date(1553795417559L),
                                                                                     "ace0a0ca-2f5e-46fe-8e79-b616c51fd6ef",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "259695be-19bb-456c-89ec-15a60590c951",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "411d9435-1934-4ff7-b82e-e532a62f8565",
                                                                                     new Date(1553795409989L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("i-].3-瓚]]",
                                                                                     new Date(1553795417559L),
                                                                                     "ace0a0ca-2f5e-46fe-8e79-b616c51fd6ef",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "259695be-19bb-456c-89ec-15a60590c951",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "411d9435-1934-4ff7-b82e-e532a62f8565",
                                                                                     new Date(1553795409989L));
            CertificateEnrollment certificateenrollment3 = new CertificateEnrollment("8-]].w-⇘]",
                                                                                     new Date(1553795415565L),
                                                                                     "623d8740-6ff3-4c60-a86a-19dc9548582f",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "1f545d09-3e22-41f2-bd60-bd8714d2a303",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "28745ec1-9987-4807-a3d9-f9f816cdd881",
                                                                                     new Date(1553795414303L));
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
