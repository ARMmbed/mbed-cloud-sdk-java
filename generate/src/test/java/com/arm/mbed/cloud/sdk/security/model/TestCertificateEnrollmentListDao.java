// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Fri Dec 28 16:23:54 GMT 2018. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollmentListDao. */
public class TestCertificateEnrollmentListDao {
  /**
   * Tests the clone method.
   */
  @Test
  public void testClone() {
    CertificateEnrollmentListDao certificateenrollmentlistdao1 = new CertificateEnrollmentListDao();
    CertificateEnrollmentListDao certificateenrollmentlistdao2 = certificateenrollmentlistdao1.clone();
    assertNotNull(certificateenrollmentlistdao1);
    assertNotNull(certificateenrollmentlistdao2);
    assertNotSame(certificateenrollmentlistdao2, certificateenrollmentlistdao1);
    assertEquals(certificateenrollmentlistdao2, certificateenrollmentlistdao1);
  }

  /**
   * Tests the hashCode method.
   */
  @Test
  public void testHashcode() {
    CertificateEnrollmentListDao certificateenrollmentlistdao1 = new CertificateEnrollmentListDao();
    CertificateEnrollmentListDao certificateenrollmentlistdao2 = new CertificateEnrollmentListDao();
    assertNotNull(certificateenrollmentlistdao1);
    assertNotNull(certificateenrollmentlistdao2);
    assertNotSame(certificateenrollmentlistdao2, certificateenrollmentlistdao1);
    assertEquals(certificateenrollmentlistdao2, certificateenrollmentlistdao1);
    assertEquals(certificateenrollmentlistdao2.hashCode(), certificateenrollmentlistdao1.hashCode());
    int hashCode = certificateenrollmentlistdao1.hashCode();
    for (int i = 0; i < 5 ; i++) {
      assertEquals(hashCode, certificateenrollmentlistdao1.hashCode());
    }
  }

  /**
   * Tests the equals method.
   */
  @Test
  public void testEquals() {
    CertificateEnrollmentListDao certificateenrollmentlistdao1 = new CertificateEnrollmentListDao();
    CertificateEnrollmentListDao certificateenrollmentlistdao2 = new CertificateEnrollmentListDao();
    CertificateEnrollmentListDao certificateenrollmentlistdao3 = new CertificateEnrollmentListDao();
    assertNotNull(certificateenrollmentlistdao1);
    assertNotNull(certificateenrollmentlistdao2);
    assertNotNull(certificateenrollmentlistdao3);
    assertNotSame(certificateenrollmentlistdao2, certificateenrollmentlistdao1);
    assertNotSame(certificateenrollmentlistdao3, certificateenrollmentlistdao1);
    assertEquals(certificateenrollmentlistdao2, certificateenrollmentlistdao1);
    assertEquals(certificateenrollmentlistdao2, certificateenrollmentlistdao1);
    assertEquals(certificateenrollmentlistdao1, certificateenrollmentlistdao2);
    assertEquals(certificateenrollmentlistdao1, certificateenrollmentlistdao1);
    assertFalse(certificateenrollmentlistdao1.equals(null));
    assertNotEquals(certificateenrollmentlistdao3, certificateenrollmentlistdao1);
  }
}
