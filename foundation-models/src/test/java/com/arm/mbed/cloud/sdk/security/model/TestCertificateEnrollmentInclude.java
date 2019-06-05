// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollmentInclude.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateEnrollmentInclude {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
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
            certificateenrollmentinclude = CertificateEnrollmentInclude.getValue("7f117209-6000-47be-b5d0-d4813a4768d8");
            assertNotNull(certificateenrollmentinclude);
            assertTrue(certificateenrollmentinclude.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
