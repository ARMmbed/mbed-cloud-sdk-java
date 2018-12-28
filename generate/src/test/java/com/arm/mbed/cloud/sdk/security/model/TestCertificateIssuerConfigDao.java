// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerConfigDao. */
public class TestCertificateIssuerConfigDao {
  /**
   * Tests the clone method.
   */
  @Test
  public void testClone() {
    CertificateIssuerConfigDao certificateissuerconfigdao1 = new CertificateIssuerConfigDao();
    CertificateIssuerConfigDao certificateissuerconfigdao2 = certificateissuerconfigdao1.clone();
    assertNotNull(certificateissuerconfigdao1);
    assertNotNull(certificateissuerconfigdao2);
    assertNotSame(certificateissuerconfigdao2, certificateissuerconfigdao1);
    assertEquals(certificateissuerconfigdao2, certificateissuerconfigdao1);
  }

  /**
   * Tests the hashCode method.
   */
  @Test
  public void testHashcode() {
    CertificateIssuerConfigDao certificateissuerconfigdao1 = new CertificateIssuerConfigDao();
    CertificateIssuerConfigDao certificateissuerconfigdao2 = new CertificateIssuerConfigDao();
    assertNotNull(certificateissuerconfigdao1);
    assertNotNull(certificateissuerconfigdao2);
    assertNotSame(certificateissuerconfigdao2, certificateissuerconfigdao1);
    assertEquals(certificateissuerconfigdao2, certificateissuerconfigdao1);
    assertEquals(certificateissuerconfigdao2.hashCode(), certificateissuerconfigdao1.hashCode());
    int hashCode = certificateissuerconfigdao1.hashCode();
    for (int i = 0; i < 5 ; i++) {
      assertEquals(hashCode, certificateissuerconfigdao1.hashCode());
    }
  }

  /**
   * Tests the equals method.
   */
  @Test
  public void testEquals() {
    CertificateIssuerConfigDao certificateissuerconfigdao1 = new CertificateIssuerConfigDao();
    CertificateIssuerConfigDao certificateissuerconfigdao2 = new CertificateIssuerConfigDao();
    CertificateIssuerConfigDao certificateissuerconfigdao3 = new CertificateIssuerConfigDao();
    assertNotNull(certificateissuerconfigdao1);
    assertNotNull(certificateissuerconfigdao2);
    assertNotNull(certificateissuerconfigdao3);
    assertNotSame(certificateissuerconfigdao2, certificateissuerconfigdao1);
    assertNotSame(certificateissuerconfigdao3, certificateissuerconfigdao1);
    assertEquals(certificateissuerconfigdao2, certificateissuerconfigdao1);
    assertEquals(certificateissuerconfigdao2, certificateissuerconfigdao1);
    assertEquals(certificateissuerconfigdao1, certificateissuerconfigdao2);
    assertEquals(certificateissuerconfigdao1, certificateissuerconfigdao1);
    assertFalse(certificateissuerconfigdao1.equals(null));
    assertNotEquals(certificateissuerconfigdao3, certificateissuerconfigdao1);
  }
}
