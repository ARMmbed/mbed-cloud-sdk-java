// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantTrustedCertificateService.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantTrustedCertificateService {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            SubtenantTrustedCertificateService subtenanttrustedcertificateservice = SubtenantTrustedCertificateService.getValue(null);
            assertNotNull(subtenanttrustedcertificateservice);
            assertTrue(subtenanttrustedcertificateservice.isDefault());
            subtenanttrustedcertificateservice = SubtenantTrustedCertificateService.getValue(SubtenantTrustedCertificateService.getDefault()
                                                                                                                               .getString());
            assertNotNull(subtenanttrustedcertificateservice);
            assertTrue(subtenanttrustedcertificateservice.isDefault());
            subtenanttrustedcertificateservice = SubtenantTrustedCertificateService.getValue("BOOTSTRAP");
            assertNotNull(subtenanttrustedcertificateservice);
            assertTrue(subtenanttrustedcertificateservice.isDefault());
            subtenanttrustedcertificateservice = SubtenantTrustedCertificateService.getValue("lwm2m");
            assertNotNull(subtenanttrustedcertificateservice);
            assertFalse(subtenanttrustedcertificateservice.isDefault());
            subtenanttrustedcertificateservice = SubtenantTrustedCertificateService.getValue("16716690-541d-4595-a29b-5444c8c28abc");
            assertNotNull(subtenanttrustedcertificateservice);
            assertTrue(subtenanttrustedcertificateservice.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
