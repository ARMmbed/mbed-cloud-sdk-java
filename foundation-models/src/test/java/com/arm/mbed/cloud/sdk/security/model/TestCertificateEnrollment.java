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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("G-].2w", new Date(1566995743514L),
                                                                                     "5acc4814-c868-4618-8f75-37f1c7152274",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "ad9cf875-b4f6-4f7e-bfbe-7ce4974ab24e",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "bd377e2a-1af9-423f-9cc9-86ce1815c3c1",
                                                                                     new Date(1566995744390L));
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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("G-].2w", new Date(1566995745894L),
                                                                                     "ae97c247-38e7-4230-b763-b24e02ec3cf4",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "98843bcd-b378-4680-a763-84713497f7ec",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "f77ee94d-e152-42fc-af55-3e76b8fae8ab",
                                                                                     new Date(1566995748533L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("G-].2w", new Date(1566995745894L),
                                                                                     "ae97c247-38e7-4230-b763-b24e02ec3cf4",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "98843bcd-b378-4680-a763-84713497f7ec",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "f77ee94d-e152-42fc-af55-3e76b8fae8ab",
                                                                                     new Date(1566995748533L));
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
        CertificateEnrollment certificateenrollment = new CertificateEnrollment("G-].2w", new Date(1566995744426L),
                                                                                "37a7f28b-2dae-42b6-8473-854dcfd6851f",
                                                                                CertificateEnrollmentEnrollResult.getDefault(),
                                                                                "4d7d5afb-3a77-4cd2-bfaf-61bbefcc33e0",
                                                                                CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                "4d958627-c543-4807-b268-cde996b981a9",
                                                                                new Date(1566995743522L));
        assertTrue(certificateenrollment.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("G-].2w", new Date(1566995744353L),
                                                                                     "f93b1f0c-602b-4b2f-8e55-bb95ef9a3f89",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "c258b240-051d-41a4-a48d-46025a49d15a",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "9d25e243-aedb-4d95-a41a-374a73ddd472",
                                                                                     new Date(1566995748983L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("G-].2w", new Date(1566995744353L),
                                                                                     "f93b1f0c-602b-4b2f-8e55-bb95ef9a3f89",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "c258b240-051d-41a4-a48d-46025a49d15a",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "9d25e243-aedb-4d95-a41a-374a73ddd472",
                                                                                     new Date(1566995748983L));
            CertificateEnrollment certificateenrollment3 = new CertificateEnrollment("G-].2w", new Date(1566995743641L),
                                                                                     "069bf6dc-7dca-4db5-bc48-c8e2f93905f1",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "3e9a9d47-4fb5-4f09-91e6-af9937792968",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "52b0fe0d-45f6-4dd8-a6d2-5663404e7f22",
                                                                                     new Date(1566995747883L));
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
