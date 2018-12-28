// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollmentEnrollStatus.
 */
public class TestCertificateEnrollmentEnrollStatus {
    /**
     * Tests the getValue method.
     */
    @Test
    public void testGetvalue() {
        CertificateEnrollmentEnrollStatus certificateenrollmentenrollstatus = CertificateEnrollmentEnrollStatus.getValue(null);
        assertNotNull(certificateenrollmentenrollstatus);
        assertTrue(certificateenrollmentenrollstatus.isDefault());
        certificateenrollmentenrollstatus = CertificateEnrollmentEnrollStatus.getValue(CertificateEnrollmentEnrollStatus.getDefault()
                                                                                                                        .getString());
        assertNotNull(certificateenrollmentenrollstatus);
        assertTrue(certificateenrollmentenrollstatus.isDefault());
        certificateenrollmentenrollstatus = CertificateEnrollmentEnrollStatus.getValue("COMPLETED");
        assertNotNull(certificateenrollmentenrollstatus);
        assertTrue(certificateenrollmentenrollstatus.isDefault());
        certificateenrollmentenrollstatus = CertificateEnrollmentEnrollStatus.getValue("new");
        assertNotNull(certificateenrollmentenrollstatus);
        assertFalse(certificateenrollmentenrollstatus.isDefault());
        certificateenrollmentenrollstatus = CertificateEnrollmentEnrollStatus.getValue("cda96e2e-793c-4983-b40f-8cd87cf536dc");
        assertNotNull(certificateenrollmentenrollstatus);
        assertTrue(certificateenrollmentenrollstatus.isDefault());
    }
}
