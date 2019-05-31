// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollmentEnrollResult.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateEnrollmentEnrollResult {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            CertificateEnrollmentEnrollResult certificateenrollmentenrollresult = CertificateEnrollmentEnrollResult.getValue(null);
            assertNotNull(certificateenrollmentenrollresult);
            assertTrue(certificateenrollmentenrollresult.isDefault());
            certificateenrollmentenrollresult = CertificateEnrollmentEnrollResult.getValue(CertificateEnrollmentEnrollResult.getDefault()
                                                                                                                            .getString());
            assertNotNull(certificateenrollmentenrollresult);
            assertTrue(certificateenrollmentenrollresult.isDefault());
            certificateenrollmentenrollresult = CertificateEnrollmentEnrollResult.getValue("FAILURE");
            assertNotNull(certificateenrollmentenrollresult);
            assertTrue(certificateenrollmentenrollresult.isDefault());
            certificateenrollmentenrollresult = CertificateEnrollmentEnrollResult.getValue("success");
            assertNotNull(certificateenrollmentenrollresult);
            assertFalse(certificateenrollmentenrollresult.isDefault());
            certificateenrollmentenrollresult = CertificateEnrollmentEnrollResult.getValue("7257e3d0-cb74-4fec-b37e-16b67432763f");
            assertNotNull(certificateenrollmentenrollresult);
            assertTrue(certificateenrollmentenrollresult.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
