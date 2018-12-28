// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Fri Dec 28 16:23:54 GMT 2018. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceDao. */
public class TestDeviceDao {
  /**
   * Tests the clone method.
   */
  @Test
  public void testClone() {
    DeviceDao devicedao1 = new DeviceDao();
    DeviceDao devicedao2 = devicedao1.clone();
    assertNotNull(devicedao1);
    assertNotNull(devicedao2);
    assertNotSame(devicedao2, devicedao1);
    assertEquals(devicedao2, devicedao1);
  }

  /**
   * Tests the hashCode method.
   */
  @Test
  public void testHashcode() {
    DeviceDao devicedao1 = new DeviceDao();
    DeviceDao devicedao2 = new DeviceDao();
    assertNotNull(devicedao1);
    assertNotNull(devicedao2);
    assertNotSame(devicedao2, devicedao1);
    assertEquals(devicedao2, devicedao1);
    assertEquals(devicedao2.hashCode(), devicedao1.hashCode());
    int hashCode = devicedao1.hashCode();
    for (int i = 0; i < 5 ; i++) {
      assertEquals(hashCode, devicedao1.hashCode());
    }
  }

  /**
   * Tests the equals method.
   */
  @Test
  public void testEquals() {
    DeviceDao devicedao1 = new DeviceDao();
    DeviceDao devicedao2 = new DeviceDao();
    DeviceDao devicedao3 = new DeviceDao();
    assertNotNull(devicedao1);
    assertNotNull(devicedao2);
    assertNotNull(devicedao3);
    assertNotSame(devicedao2, devicedao1);
    assertNotSame(devicedao3, devicedao1);
    assertEquals(devicedao2, devicedao1);
    assertEquals(devicedao2, devicedao1);
    assertEquals(devicedao1, devicedao2);
    assertEquals(devicedao1, devicedao1);
    assertFalse(devicedao1.equals(null));
    assertNotEquals(devicedao3, devicedao1);
  }
}
