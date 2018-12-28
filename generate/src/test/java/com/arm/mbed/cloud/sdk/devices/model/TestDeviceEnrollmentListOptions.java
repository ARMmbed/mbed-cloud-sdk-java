// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentListOptions. */
public class TestDeviceEnrollmentListOptions {
  /**
   * Tests the clone method.
   */
  @Test
  public void testClone() {
    DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(-34,
        -120,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "6d93ad64-3271-4824-b3c7-54f8d9948e9b",
        null,
        null);
    DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = deviceenrollmentlistoptions1.clone();
    assertNotNull(deviceenrollmentlistoptions1);
    assertNotNull(deviceenrollmentlistoptions2);
    assertNotSame(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
    assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
  }

  /**
   * Tests the hashCode method.
   */
  @Test
  public void testHashcode() {
    DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(-120,
        14,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "1162db08-7b4b-4839-9083-2c88214e3ea1",
        null,
        null);
    DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = new DeviceEnrollmentListOptions(-120,
        14,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "1162db08-7b4b-4839-9083-2c88214e3ea1",
        null,
        null);
    assertNotNull(deviceenrollmentlistoptions1);
    assertNotNull(deviceenrollmentlistoptions2);
    assertNotSame(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
    assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
    assertEquals(deviceenrollmentlistoptions2.hashCode(), deviceenrollmentlistoptions1.hashCode());
    int hashCode = deviceenrollmentlistoptions1.hashCode();
    for (int i = 0; i < 5 ; i++) {
      assertEquals(hashCode, deviceenrollmentlistoptions1.hashCode());
    }
  }

  /**
   * Tests the equals method.
   */
  @Test
  public void testEquals() {
    DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(-96,
        99,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "f46338bc-f37d-4d58-845e-e99efeb8914e",
        null,
        null);
    DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = new DeviceEnrollmentListOptions(-96,
        99,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "f46338bc-f37d-4d58-845e-e99efeb8914e",
        null,
        null);
    DeviceEnrollmentListOptions deviceenrollmentlistoptions3 = new DeviceEnrollmentListOptions(91,
        6,
        com.arm.mbed.cloud.sdk.common.Order.getDefault(),
        "a3c8ec6d-770b-472f-929c-aea142d1e48a",
        null,
        null);
    assertNotNull(deviceenrollmentlistoptions1);
    assertNotNull(deviceenrollmentlistoptions2);
    assertNotNull(deviceenrollmentlistoptions3);
    assertNotSame(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
    assertNotSame(deviceenrollmentlistoptions3, deviceenrollmentlistoptions1);
    assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
    assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
    assertEquals(deviceenrollmentlistoptions1, deviceenrollmentlistoptions2);
    assertEquals(deviceenrollmentlistoptions1, deviceenrollmentlistoptions1);
    assertFalse(deviceenrollmentlistoptions1.equals(null));
    assertNotEquals(deviceenrollmentlistoptions3, deviceenrollmentlistoptions1);
  }
}
