// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollmentInclude.
 */
public class TestCertificateEnrollmentInclude {
    /**
     * Tests the getValue method.
     */
    @Test
    public void testGetvalue() {
        try {
            CertificateEnrollmentInclude certificateenrollmentinclude = CertificateEnrollmentInclude.getValue(null);
            assertNotNull(certificateenrollmentinclude);
            assertTrue(certificateenrollmentinclude.isDefault());
            certificateenrollmentinclude = CertificateEnrollmentInclude.getValue(CertificateEnrollmentInclude.getDefault()
                                                                                                             .getString());
            assertNotNull(certificateenrollmentinclude);
            assertTrue(certificateenrollmentinclude.isDefault());
            certificateenrollmentinclude = CertificateEnrollmentInclude.getValue("TOTAL_COUNT");
            assertNotNull(certificateenrollmentinclude);
            assertTrue(certificateenrollmentinclude.isDefault());
            certificateenrollmentinclude = CertificateEnrollmentInclude.getValue("46f413f2-8752-4840-baa8-073ec14101f6");
            assertNotNull(certificateenrollmentinclude);
            assertTrue(certificateenrollmentinclude.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
