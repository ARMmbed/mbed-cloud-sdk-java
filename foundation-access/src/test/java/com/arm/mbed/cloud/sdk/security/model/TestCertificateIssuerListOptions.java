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
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(113),
                                                                                                          Long.valueOf(-25),
                                                                                                          Order.getDefault(),
                                                                                                          "0e2b7c51-9c98-4f62-a2e0-f4f71d002d79",
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
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(15),
                                                                                                          Long.valueOf(-128),
                                                                                                          Order.getDefault(),
                                                                                                          "652a19ba-a026-45c3-8cfe-8f7688919574",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions2 = new CertificateIssuerListOptions(Integer.valueOf(15),
                                                                                                          Long.valueOf(-128),
                                                                                                          Order.getDefault(),
                                                                                                          "652a19ba-a026-45c3-8cfe-8f7688919574",
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
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(-12),
                                                                                                          Long.valueOf(10),
                                                                                                          Order.getDefault(),
                                                                                                          "edea43b2-87c8-4b72-89b0-e84040d729ed",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions2 = new CertificateIssuerListOptions(Integer.valueOf(-12),
                                                                                                          Long.valueOf(10),
                                                                                                          Order.getDefault(),
                                                                                                          "edea43b2-87c8-4b72-89b0-e84040d729ed",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions3 = new CertificateIssuerListOptions(Integer.valueOf(-31),
                                                                                                          Long.valueOf(68),
                                                                                                          Order.getDefault(),
                                                                                                          "325ff2f2-6af9-4792-9d38-6619c017dcdb",
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
