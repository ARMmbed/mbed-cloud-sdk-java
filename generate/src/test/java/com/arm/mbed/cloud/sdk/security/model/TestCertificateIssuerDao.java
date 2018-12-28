// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Fri Dec 28 16:23:54 GMT 2018. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerDao. */
public class TestCertificateIssuerDao {
  /**
   * Tests the clone method.
   */
  @Test
  public void testClone() {
    CertificateIssuerDao certificateissuerdao1 = new CertificateIssuerDao();
    CertificateIssuerDao certificateissuerdao2 = certificateissuerdao1.clone();
    assertNotNull(certificateissuerdao1);
    assertNotNull(certificateissuerdao2);
    assertNotSame(certificateissuerdao2, certificateissuerdao1);
    assertEquals(certificateissuerdao2, certificateissuerdao1);
  }

  /**
   * Tests the hashCode method.
   */
  @Test
  public void testHashcode() {
    CertificateIssuerDao certificateissuerdao1 = new CertificateIssuerDao();
    CertificateIssuerDao certificateissuerdao2 = new CertificateIssuerDao();
    assertNotNull(certificateissuerdao1);
    assertNotNull(certificateissuerdao2);
    assertNotSame(certificateissuerdao2, certificateissuerdao1);
    assertEquals(certificateissuerdao2, certificateissuerdao1);
    assertEquals(certificateissuerdao2.hashCode(), certificateissuerdao1.hashCode());
    int hashCode = certificateissuerdao1.hashCode();
    for (int i = 0; i < 5 ; i++) {
      assertEquals(hashCode, certificateissuerdao1.hashCode());
    }
  }

  /**
   * Tests the equals method.
   */
  @Test
  public void testEquals() {
    CertificateIssuerDao certificateissuerdao1 = new CertificateIssuerDao();
    CertificateIssuerDao certificateissuerdao2 = new CertificateIssuerDao();
    CertificateIssuerDao certificateissuerdao3 = new CertificateIssuerDao();
    assertNotNull(certificateissuerdao1);
    assertNotNull(certificateissuerdao2);
    assertNotNull(certificateissuerdao3);
    assertNotSame(certificateissuerdao2, certificateissuerdao1);
    assertNotSame(certificateissuerdao3, certificateissuerdao1);
    assertEquals(certificateissuerdao2, certificateissuerdao1);
    assertEquals(certificateissuerdao2, certificateissuerdao1);
    assertEquals(certificateissuerdao1, certificateissuerdao2);
    assertEquals(certificateissuerdao1, certificateissuerdao1);
    assertFalse(certificateissuerdao1.equals(null));
    assertNotEquals(certificateissuerdao3, certificateissuerdao1);
  }
}
