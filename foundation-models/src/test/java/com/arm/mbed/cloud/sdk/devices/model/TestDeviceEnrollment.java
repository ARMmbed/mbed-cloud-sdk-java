// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollment.
 */
public class TestDeviceEnrollment {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("f2698479-77b8-4b24-99df-a51640827148",
                                                                      new java.util.Date(1546452538466L),
                                                                      new java.util.Date(1546452539114L),
                                                                      "1RYWOZcMP6pF8OXrHDPZY0nU9I3x2G9Q",
                                                                      "A-xfqcCAldUUu3zqJ1:pmulquFBt70UsaW7XV4P7rav9q5fStR9xC3fbjZqu2x6939l7M5DK7duqgxc1l5rIueB7wX349kvz:",
                                                                      new java.util.Date(1546452540495L),
                                                                      "MsGzAqPb58A5kI70sFAG96T7stU8Bj02");
            DeviceEnrollment deviceenrollment2 = deviceenrollment1.clone();
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        DeviceEnrollment deviceenrollment = new DeviceEnrollment("fc78141b-304b-4d6d-bc78-dec069ea51d2",
                                                                 new java.util.Date(1546452538733L),
                                                                 new java.util.Date(1546452536669L),
                                                                 "sfZMXH53xJDPMJ5mCdJ8zRSWSsj6pqkn",
                                                                 "A-Bdtwk0OB9WQ2063Uoj7590kU0J2B6QWOLe46C9T3r65YSiCZhYJLlktE14:830svUI3c6td77Nm5YB7I:8089kl5:2iUqU4",
                                                                 new java.util.Date(1546452537434L),
                                                                 "jA7Cf1tR28Z0Epsze45ms0M611E22ZaL");
        assertTrue(deviceenrollment.isValid());
        DeviceEnrollment deviceenrollmentInvalid = new DeviceEnrollment("a5bbb26d-b7a0-4858-beb7-1e0897794df9",
                                                                        new java.util.Date(1546452534447L),
                                                                        new java.util.Date(1546452532499L),
                                                                        "G1wrqQMkf<Er1KwrEE៷쀕?qNh@ooko>iw;kokOXGHvN2GG�?�vkG=cE޵9JEoe垺ER",
                                                                        "Uw*m_3bume;苩'3`e\\bqqmmDmmwq]e虩mq3qmb?`3u�?VmquU<quq33<UmDbq\\`U",
                                                                        new java.util.Date(1546452538551L),
                                                                        "^6牗U_F6wqNqoFq뻼KoQ6MKy]iN.qU6wTqqywtFoMosqoqqM_P>繒MyTywE6寎");
        assertFalse(deviceenrollmentInvalid.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("53be2774-5f25-4c29-9c05-0095fefe7b9a",
                                                                      new java.util.Date(1546452536179L),
                                                                      new java.util.Date(1546452541224L),
                                                                      "lXTG9uPj48y15p912b8K290zS0BlEDVH",
                                                                      "A-1l9f45Qa69GNq0roGpLVQ30sNneE5NaDD9iXxl62:NX88H7j6G7G:Na47:I238q5ZDvA1dUs5JvTbI51fomvsm8H:svfjIT",
                                                                      new java.util.Date(1546452539771L),
                                                                      "yMb3Y3D50fP7TmeX56D4gd9auA02M4z8");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("53be2774-5f25-4c29-9c05-0095fefe7b9a",
                                                                      new java.util.Date(1546452536179L),
                                                                      new java.util.Date(1546452541224L),
                                                                      "lXTG9uPj48y15p912b8K290zS0BlEDVH",
                                                                      "A-1l9f45Qa69GNq0roGpLVQ30sNneE5NaDD9iXxl62:NX88H7j6G7G:Na47:I238q5ZDvA1dUs5JvTbI51fomvsm8H:svfjIT",
                                                                      new java.util.Date(1546452539771L),
                                                                      "yMb3Y3D50fP7TmeX56D4gd9auA02M4z8");
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2.hashCode(), deviceenrollment1.hashCode());
            int hashCode = deviceenrollment1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollment1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("f74fb00c-6383-4a04-96ee-0f49c3edaed3",
                                                                      new java.util.Date(1546452534450L),
                                                                      new java.util.Date(1546452540449L),
                                                                      "e19jy7Z36s9WeX4yZz6pFtBByX72KcZ8",
                                                                      "A-E87s10jr2:9LSmvtfnW:V6I4yAkVgk5Gd2aTRNKfU3QZh6BaBE2xI2YLeSJJJO7Q4i4gE4L:eN00957JR3wLRD8c01lDGQG",
                                                                      new java.util.Date(1546452536086L),
                                                                      "LAKKr6c9lZ423tYpOF8X7A04CXxlE3Z8");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("f74fb00c-6383-4a04-96ee-0f49c3edaed3",
                                                                      new java.util.Date(1546452534450L),
                                                                      new java.util.Date(1546452540449L),
                                                                      "e19jy7Z36s9WeX4yZz6pFtBByX72KcZ8",
                                                                      "A-E87s10jr2:9LSmvtfnW:V6I4yAkVgk5Gd2aTRNKfU3QZh6BaBE2xI2YLeSJJJO7Q4i4gE4L:eN00957JR3wLRD8c01lDGQG",
                                                                      new java.util.Date(1546452536086L),
                                                                      "LAKKr6c9lZ423tYpOF8X7A04CXxlE3Z8");
            DeviceEnrollment deviceenrollment3 = new DeviceEnrollment("4f8c96d1-358e-45c3-96ca-7a0a1a54997a",
                                                                      new java.util.Date(1546452536025L),
                                                                      new java.util.Date(1546452539225L),
                                                                      "1m9V4LJ70O7L5k5Velvz784zLH2KBrbJ",
                                                                      "A-Z5JH9mSdmS5eBLj9Jn:4VN7dDls6I6A9K136VFo0HH87FTM7qennbol013vZ45ztK7H0WsrsUV7IIKDkWCC91AoW13eiHL6",
                                                                      new java.util.Date(1546452536528L),
                                                                      "J2Tvn6rE1zRwHcIPnct2G18q9YWHnsB5");
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotNull(deviceenrollment3);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertNotSame(deviceenrollment3, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment1, deviceenrollment2);
            assertEquals(deviceenrollment1, deviceenrollment1);
            assertFalse(deviceenrollment1.equals(null));
            assertNotEquals(deviceenrollment3, deviceenrollment1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
