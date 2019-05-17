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
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(-88),
                                                                                                          Long.valueOf(38),
                                                                                                          Order.getDefault(),
                                                                                                          "84f90c4b-840a-41c8-afea-e3648f3ae120",
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
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(-11),
                                                                                                          Long.valueOf(-79),
                                                                                                          Order.getDefault(),
                                                                                                          "d534476c-4ed6-4f90-afba-545139530ed6",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions2 = new CertificateIssuerListOptions(Integer.valueOf(-11),
                                                                                                          Long.valueOf(-79),
                                                                                                          Order.getDefault(),
                                                                                                          "d534476c-4ed6-4f90-afba-545139530ed6",
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
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(99),
                                                                                                          Long.valueOf(-42),
                                                                                                          Order.getDefault(),
                                                                                                          "614fd582-d1f3-4f28-89c1-502f790b921d",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions2 = new CertificateIssuerListOptions(Integer.valueOf(99),
                                                                                                          Long.valueOf(-42),
                                                                                                          Order.getDefault(),
                                                                                                          "614fd582-d1f3-4f28-89c1-502f790b921d",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions3 = new CertificateIssuerListOptions(Integer.valueOf(49),
                                                                                                          Long.valueOf(5),
                                                                                                          Order.getDefault(),
                                                                                                          "d8c59dd6-b005-4496-8ada-e200fe49a0c5",
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
