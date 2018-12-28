// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Fri Dec 28 16:23:54 GMT 2018. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model AccountListDao. */
public class TestAccountListDao {
  /**
   * Tests the clone method.
   */
  @Test
  public void testClone() {
    AccountListDao accountlistdao1 = new AccountListDao();
    AccountListDao accountlistdao2 = accountlistdao1.clone();
    assertNotNull(accountlistdao1);
    assertNotNull(accountlistdao2);
    assertNotSame(accountlistdao2, accountlistdao1);
    assertEquals(accountlistdao2, accountlistdao1);
  }

  /**
   * Tests the hashCode method.
   */
  @Test
  public void testHashcode() {
    AccountListDao accountlistdao1 = new AccountListDao();
    AccountListDao accountlistdao2 = new AccountListDao();
    assertNotNull(accountlistdao1);
    assertNotNull(accountlistdao2);
    assertNotSame(accountlistdao2, accountlistdao1);
    assertEquals(accountlistdao2, accountlistdao1);
    assertEquals(accountlistdao2.hashCode(), accountlistdao1.hashCode());
    int hashCode = accountlistdao1.hashCode();
    for (int i = 0; i < 5 ; i++) {
      assertEquals(hashCode, accountlistdao1.hashCode());
    }
  }

  /**
   * Tests the equals method.
   */
  @Test
  public void testEquals() {
    AccountListDao accountlistdao1 = new AccountListDao();
    AccountListDao accountlistdao2 = new AccountListDao();
    AccountListDao accountlistdao3 = new AccountListDao();
    assertNotNull(accountlistdao1);
    assertNotNull(accountlistdao2);
    assertNotNull(accountlistdao3);
    assertNotSame(accountlistdao2, accountlistdao1);
    assertNotSame(accountlistdao3, accountlistdao1);
    assertEquals(accountlistdao2, accountlistdao1);
    assertEquals(accountlistdao2, accountlistdao1);
    assertEquals(accountlistdao1, accountlistdao2);
    assertEquals(accountlistdao1, accountlistdao1);
    assertFalse(accountlistdao1.equals(null));
    assertNotEquals(accountlistdao3, accountlistdao1);
  }
}
