// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantTrustedCertificateStatus.
 */
public class TestSubtenantTrustedCertificateStatus {
    /**
     * Tests the getValue method.
     */
    @Test
    public void testGetvalue() {
        try {
            SubtenantTrustedCertificateStatus subtenanttrustedcertificatestatus = SubtenantTrustedCertificateStatus.getValue(null);
            assertNotNull(subtenanttrustedcertificatestatus);
            assertTrue(subtenanttrustedcertificatestatus.isDefault());
            subtenanttrustedcertificatestatus = SubtenantTrustedCertificateStatus.getValue(SubtenantTrustedCertificateStatus.getDefault()
                                                                                                                            .getString());
            assertNotNull(subtenanttrustedcertificatestatus);
            assertTrue(subtenanttrustedcertificatestatus.isDefault());
            subtenanttrustedcertificatestatus = SubtenantTrustedCertificateStatus.getValue("ACTIVE");
            assertNotNull(subtenanttrustedcertificatestatus);
            assertTrue(subtenanttrustedcertificatestatus.isDefault());
            subtenanttrustedcertificatestatus = SubtenantTrustedCertificateStatus.getValue("INACTIVE");
            assertNotNull(subtenanttrustedcertificatestatus);
            assertFalse(subtenanttrustedcertificatestatus.isDefault());
            subtenanttrustedcertificatestatus = SubtenantTrustedCertificateStatus.getValue("4ea0546c-e100-4049-9c4f-af82505f1589");
            assertNotNull(subtenanttrustedcertificatestatus);
            assertTrue(subtenanttrustedcertificatestatus.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
