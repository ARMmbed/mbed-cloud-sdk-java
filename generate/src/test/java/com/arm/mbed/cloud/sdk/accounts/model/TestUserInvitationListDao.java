// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Fri Dec 28 16:23:55 GMT 2018. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model UserInvitationListDao. */
public class TestUserInvitationListDao {
  /**
   * Tests the clone method.
   */
  @Test
  public void testClone() {
    UserInvitationListDao userinvitationlistdao1 = new UserInvitationListDao();
    UserInvitationListDao userinvitationlistdao2 = userinvitationlistdao1.clone();
    assertNotNull(userinvitationlistdao1);
    assertNotNull(userinvitationlistdao2);
    assertNotSame(userinvitationlistdao2, userinvitationlistdao1);
    assertEquals(userinvitationlistdao2, userinvitationlistdao1);
  }

  /**
   * Tests the hashCode method.
   */
  @Test
  public void testHashcode() {
    UserInvitationListDao userinvitationlistdao1 = new UserInvitationListDao();
    UserInvitationListDao userinvitationlistdao2 = new UserInvitationListDao();
    assertNotNull(userinvitationlistdao1);
    assertNotNull(userinvitationlistdao2);
    assertNotSame(userinvitationlistdao2, userinvitationlistdao1);
    assertEquals(userinvitationlistdao2, userinvitationlistdao1);
    assertEquals(userinvitationlistdao2.hashCode(), userinvitationlistdao1.hashCode());
    int hashCode = userinvitationlistdao1.hashCode();
    for (int i = 0; i < 5 ; i++) {
      assertEquals(hashCode, userinvitationlistdao1.hashCode());
    }
  }

  /**
   * Tests the equals method.
   */
  @Test
  public void testEquals() {
    UserInvitationListDao userinvitationlistdao1 = new UserInvitationListDao();
    UserInvitationListDao userinvitationlistdao2 = new UserInvitationListDao();
    UserInvitationListDao userinvitationlistdao3 = new UserInvitationListDao();
    assertNotNull(userinvitationlistdao1);
    assertNotNull(userinvitationlistdao2);
    assertNotNull(userinvitationlistdao3);
    assertNotSame(userinvitationlistdao2, userinvitationlistdao1);
    assertNotSame(userinvitationlistdao3, userinvitationlistdao1);
    assertEquals(userinvitationlistdao2, userinvitationlistdao1);
    assertEquals(userinvitationlistdao2, userinvitationlistdao1);
    assertEquals(userinvitationlistdao1, userinvitationlistdao2);
    assertEquals(userinvitationlistdao1, userinvitationlistdao1);
    assertFalse(userinvitationlistdao1.equals(null));
    assertNotEquals(userinvitationlistdao3, userinvitationlistdao1);
  }
}
