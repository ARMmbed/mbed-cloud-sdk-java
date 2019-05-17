// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerType.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuerType {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            CertificateIssuerType certificateissuertype = CertificateIssuerType.getValue(null);
            assertNotNull(certificateissuertype);
            assertTrue(certificateissuertype.isDefault());
            certificateissuertype = CertificateIssuerType.getValue(CertificateIssuerType.getDefault().getString());
            assertNotNull(certificateissuertype);
            assertTrue(certificateissuertype.isDefault());
            certificateissuertype = CertificateIssuerType.getValue("CFSSL_AUTH");
            assertNotNull(certificateissuertype);
            assertTrue(certificateissuertype.isDefault());
            certificateissuertype = CertificateIssuerType.getValue("GLOBAL_SIGN");
            assertNotNull(certificateissuertype);
            assertFalse(certificateissuertype.isDefault());
            certificateissuertype = CertificateIssuerType.getValue("503b06e9-9560-4212-81ee-4c7eb9b627dd");
            assertNotNull(certificateissuertype);
            assertTrue(certificateissuertype.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
