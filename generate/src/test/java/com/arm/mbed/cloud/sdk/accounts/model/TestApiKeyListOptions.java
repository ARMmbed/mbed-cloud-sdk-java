// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model ApiKeyListOptions. */
public class TestApiKeyListOptions {
  /**
   * Tests the clone method.
   */
  @Test
  public void testClone() {
    ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(-34,
        101,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "cb86d040-9ae9-4feb-8033-d15745c9dae3",
        null,
        null);
    ApiKeyListOptions apikeylistoptions2 = apikeylistoptions1.clone();
    assertNotNull(apikeylistoptions1);
    assertNotNull(apikeylistoptions2);
    assertNotSame(apikeylistoptions2, apikeylistoptions1);
    assertEquals(apikeylistoptions2, apikeylistoptions1);
  }

  /**
   * Tests the hashCode method.
   */
  @Test
  public void testHashcode() {
    ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(-83,
        -16,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "7f52bb5f-ce71-4792-beb9-165b48daaf77",
        null,
        null);
    ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(-83,
        -16,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "7f52bb5f-ce71-4792-beb9-165b48daaf77",
        null,
        null);
    assertNotNull(apikeylistoptions1);
    assertNotNull(apikeylistoptions2);
    assertNotSame(apikeylistoptions2, apikeylistoptions1);
    assertEquals(apikeylistoptions2, apikeylistoptions1);
    assertEquals(apikeylistoptions2.hashCode(), apikeylistoptions1.hashCode());
    int hashCode = apikeylistoptions1.hashCode();
    for (int i = 0; i < 5 ; i++) {
      assertEquals(hashCode, apikeylistoptions1.hashCode());
    }
  }

  /**
   * Tests the equals method.
   */
  @Test
  public void testEquals() {
    ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(14,
        -118,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "4185192d-196a-4749-81bd-4e5ecfb47105",
        null,
        null);
    ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(14,
        -118,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "4185192d-196a-4749-81bd-4e5ecfb47105",
        null,
        null);
    ApiKeyListOptions apikeylistoptions3 = new ApiKeyListOptions(-85,
        29,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "a25423da-43a5-4837-a806-ccd661d9bfd5",
        null,
        null);
    assertNotNull(apikeylistoptions1);
    assertNotNull(apikeylistoptions2);
    assertNotNull(apikeylistoptions3);
    assertNotSame(apikeylistoptions2, apikeylistoptions1);
    assertNotSame(apikeylistoptions3, apikeylistoptions1);
    assertEquals(apikeylistoptions2, apikeylistoptions1);
    assertEquals(apikeylistoptions2, apikeylistoptions1);
    assertEquals(apikeylistoptions1, apikeylistoptions2);
    assertEquals(apikeylistoptions1, apikeylistoptions1);
    assertFalse(apikeylistoptions1.equals(null));
    assertNotEquals(apikeylistoptions3, apikeylistoptions1);
  }
}
