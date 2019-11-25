// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuerListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(101),
                                                                                                          Long.valueOf(-38),
                                                                                                          Order.getDefault(),
                                                                                                          "5f8a687e-7686-4a24-9d4e-d331d6d9868e",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions2 = certificateissuerlistoptions1.clone();
            assertNotNull(certificateissuerlistoptions1);
            assertNotNull(certificateissuerlistoptions2);
            assertNotSame(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions2, certificateissuerlistoptions1);
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
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(119),
                                                                                                          Long.valueOf(3),
                                                                                                          Order.getDefault(),
                                                                                                          "3610d875-b957-48d9-97fd-88486b014489",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions2 = new CertificateIssuerListOptions(Integer.valueOf(119),
                                                                                                          Long.valueOf(3),
                                                                                                          Order.getDefault(),
                                                                                                          "3610d875-b957-48d9-97fd-88486b014489",
                                                                                                          null, null);
            assertNotNull(certificateissuerlistoptions1);
            assertNotNull(certificateissuerlistoptions2);
            assertNotSame(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions2.hashCode(), certificateissuerlistoptions1.hashCode());
            int hashCode = certificateissuerlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuerlistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(102),
                                                                                                          Long.valueOf(8),
                                                                                                          Order.getDefault(),
                                                                                                          "d6078419-f2bb-4098-ac84-a06d5b3ad221",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions2 = new CertificateIssuerListOptions(Integer.valueOf(102),
                                                                                                          Long.valueOf(8),
                                                                                                          Order.getDefault(),
                                                                                                          "d6078419-f2bb-4098-ac84-a06d5b3ad221",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions3 = new CertificateIssuerListOptions(Integer.valueOf(-54),
                                                                                                          Long.valueOf(-19),
                                                                                                          Order.getDefault(),
                                                                                                          "432135c8-0bd8-4e01-a6dc-66ab8a7f919f",
                                                                                                          null, null);
            assertNotNull(certificateissuerlistoptions1);
            assertNotNull(certificateissuerlistoptions2);
            assertNotNull(certificateissuerlistoptions3);
            assertNotSame(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertNotSame(certificateissuerlistoptions3, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions1, certificateissuerlistoptions2);
            assertEquals(certificateissuerlistoptions1, certificateissuerlistoptions1);
            assertFalse(certificateissuerlistoptions1.equals(null));
            assertNotEquals(certificateissuerlistoptions3, certificateissuerlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
