// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model Device.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDevice {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            Device device1 = new Device("b8794fff-76a2-4b45-b58b-dc1aef0e9ce2", true, new Date(1552477760914L),
                                        new Date(1552477761412L), "419ae470-dda8-449d-833f-74b646894951",
                                        new Date(1552477767001L), new Date(1552477759569L), null,
                                        DeviceDeployedState.getDefault(), "dd2f6fb2-26f1-460c-a213-b81cf5548afc",
                                        "9d8ba1dd-3091-459e-95ff-fc690d98f1e7", "c4a6e83d-dab1-4c78-9e1b-cf4021d2a160",
                                        -63, "6f8ed063-f912-4aef-bcbc-497e3887cd46",
                                        "e8e44b91-feb9-44e6-a05b-e0f598aca387", "4ef529f3-71dd-4895-8712-61d3953d2ec6",
                                        new Date(1552477762343L), "ef428fd6-6186-4db8-87d0-6b5e742eceba",
                                        "99435ab8-f7a1-4bdc-963d-2be713a5e983", "c2e6b1d3-3ae4-46e1-b196-df767c8ada61",
                                        "592924cb-4c24-405d-9aad-18b256ffd45c", new Date(1552477764662L),
                                        DeviceMechanism.getDefault(), "f47d5980-f6f5-4a75-85cc-3d42b12882c3",
                                        "5e3b45f1-d3a6-46d0-8929-c18f7382df19", "9fc659b8-73bc-4ba6-87d1-122d96a37f77",
                                        DeviceState.getDefault(), new Date(1552477762987L),
                                        "a4c42fb6-2824-402d-8bd8-6adc8d57266e");
            Device device2 = device1.clone();
            assertNotNull(device1);
            assertNotNull(device2);
            assertNotSame(device2, device1);
            assertEquals(device2, device1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            Device device1 = new Device("d791ec33-0f9d-44c6-ad3a-bc8b816e1e83", false, new Date(1552477757528L),
                                        new Date(1552477763084L), "d5b42d22-7118-4a82-8110-a6168593e8fa",
                                        new Date(1552477764752L), new Date(1552477758529L), null,
                                        DeviceDeployedState.getDefault(), "e67527ad-4245-45b7-bcd6-3c834bacc906",
                                        "aed5b477-94cd-4e5d-962b-2277021e5b24", "a208d3a3-c77f-41a9-ab41-a633ab2c4eb7",
                                        -43, "b7944fa9-a040-4b5e-98a5-3ad8099e0259",
                                        "51e1fa4e-907b-4e52-99ad-8a43c49fd169", "05023b26-243e-4058-ba02-2d256e12ea13",
                                        new Date(1552477760571L), "daae2d11-c6d3-4272-9526-ef2f17c9f6dd",
                                        "668fcac1-7d09-401d-b5d1-99ff0a45fbc3", "efe04ffd-75f8-4463-9715-36527958c47e",
                                        "4f8e3819-5e25-43a9-9e48-378f2c7f9d52", new Date(1552477760530L),
                                        DeviceMechanism.getDefault(), "b96c0a41-dacf-403b-acb2-22f0a6d6be11",
                                        "b3b7e1d1-4448-423a-bae2-c1a7754f6ff8", "36277540-9037-4e26-88d0-c3dfded7c854",
                                        DeviceState.getDefault(), new Date(1552477760025L),
                                        "1baa92b3-ed77-4729-80b3-8cbc651f218e");
            Device device2 = new Device("d791ec33-0f9d-44c6-ad3a-bc8b816e1e83", false, new Date(1552477757528L),
                                        new Date(1552477763084L), "d5b42d22-7118-4a82-8110-a6168593e8fa",
                                        new Date(1552477764752L), new Date(1552477758529L), null,
                                        DeviceDeployedState.getDefault(), "e67527ad-4245-45b7-bcd6-3c834bacc906",
                                        "aed5b477-94cd-4e5d-962b-2277021e5b24", "a208d3a3-c77f-41a9-ab41-a633ab2c4eb7",
                                        -43, "b7944fa9-a040-4b5e-98a5-3ad8099e0259",
                                        "51e1fa4e-907b-4e52-99ad-8a43c49fd169", "05023b26-243e-4058-ba02-2d256e12ea13",
                                        new Date(1552477760571L), "daae2d11-c6d3-4272-9526-ef2f17c9f6dd",
                                        "668fcac1-7d09-401d-b5d1-99ff0a45fbc3", "efe04ffd-75f8-4463-9715-36527958c47e",
                                        "4f8e3819-5e25-43a9-9e48-378f2c7f9d52", new Date(1552477760530L),
                                        DeviceMechanism.getDefault(), "b96c0a41-dacf-403b-acb2-22f0a6d6be11",
                                        "b3b7e1d1-4448-423a-bae2-c1a7754f6ff8", "36277540-9037-4e26-88d0-c3dfded7c854",
                                        DeviceState.getDefault(), new Date(1552477760025L),
                                        "1baa92b3-ed77-4729-80b3-8cbc651f218e");
            assertNotNull(device1);
            assertNotNull(device2);
            assertNotSame(device2, device1);
            assertEquals(device2, device1);
            assertEquals(device2.hashCode(), device1.hashCode());
            int hashCode = device1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, device1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        Device device = new Device("324292a1-b704-4c23-8cee-5b3d19d896a5", true, new Date(1552477760980L),
                                   new Date(1552477762647L), "8a5389c3-79a8-4d8f-bfb3-50dcf9764591",
                                   new Date(1552477766908L), new Date(1552477760407L), null,
                                   DeviceDeployedState.getDefault(), "4447cc6c-522c-4819-b0f4-80499546a791",
                                   "76896e19-4aaf-4015-9b68-64cb8e0568f3", "ce54f8cc-fc2e-475d-81e2-02f8f25ada76", 35,
                                   "d0738739-d96a-4c94-b40f-92001de857f5", "9edee048-7cd9-4b1d-a4b5-cbee7e1e4e77",
                                   "317e41b8-2a36-4271-aa84-63734417856b", new Date(1552477757399L),
                                   "f1f2eb76-70fd-43ae-83de-be8b48241d1f", "82a8691d-c2c6-495a-bb8e-5a186fc9917c",
                                   "ed03a932-f01d-401d-a58b-ba473ea08e08", "7dab7cee-d47c-4cee-8a63-e5a1a96b65ab",
                                   new Date(1552477764859L), DeviceMechanism.getDefault(),
                                   "3428e075-7391-4077-8b67-ee31040815ec", "206198f5-1618-48dc-8baa-e08dfddcf78d",
                                   "6a34b9ed-a131-445c-80e3-31ee64eda8d4", DeviceState.getDefault(),
                                   new Date(1552477767064L), "9219ef3b-5b5d-458a-aba5-cb076adb8a10");
        assertTrue(device.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Device device1 = new Device("ed76839e-b803-4e88-b4cb-07f71941534f", false, new Date(1552477758179L),
                                        new Date(1552477764543L), "596db09c-07af-4b1e-a66d-ecb6e8427a32",
                                        new Date(1552477760600L), new Date(1552477764926L), null,
                                        DeviceDeployedState.getDefault(), "00e5cff6-4e00-4427-a0e6-35b98468b2a3",
                                        "ad29725d-7552-4ca0-91ee-3697ffe0aba8", "ed25b46f-71a2-4738-9a9d-ce625e8e3d6f",
                                        -58, "4ad580e2-25fc-4d80-b75d-a59fd26f9258",
                                        "a7503ef2-d65d-4344-be00-96f2f01e19f8", "d9d50298-f1e8-4a27-b2f2-28c8ab5f46be",
                                        new Date(1552477763423L), "a7cfd5b0-90d6-47ad-be38-af9c25e0f0e5",
                                        "2541588a-9ee3-48e1-b79b-7485cf06e709", "1ed61c75-7ad6-4f5d-be45-851fdaed0be5",
                                        "273cd871-3a72-4b6d-a998-cb80eb9be1c5", new Date(1552477765287L),
                                        DeviceMechanism.getDefault(), "2f351c01-6ecd-4411-a9da-b5fdce9d0521",
                                        "e7805f7d-d9ab-4560-ac2d-09360ffc8a07", "58e1ef0d-7880-4ef3-bd8f-f4d5840a77a8",
                                        DeviceState.getDefault(), new Date(1552477764813L),
                                        "b563c261-7f46-4187-8080-4b5e01b57db9");
            Device device2 = new Device("ed76839e-b803-4e88-b4cb-07f71941534f", false, new Date(1552477758179L),
                                        new Date(1552477764543L), "596db09c-07af-4b1e-a66d-ecb6e8427a32",
                                        new Date(1552477760600L), new Date(1552477764926L), null,
                                        DeviceDeployedState.getDefault(), "00e5cff6-4e00-4427-a0e6-35b98468b2a3",
                                        "ad29725d-7552-4ca0-91ee-3697ffe0aba8", "ed25b46f-71a2-4738-9a9d-ce625e8e3d6f",
                                        -58, "4ad580e2-25fc-4d80-b75d-a59fd26f9258",
                                        "a7503ef2-d65d-4344-be00-96f2f01e19f8", "d9d50298-f1e8-4a27-b2f2-28c8ab5f46be",
                                        new Date(1552477763423L), "a7cfd5b0-90d6-47ad-be38-af9c25e0f0e5",
                                        "2541588a-9ee3-48e1-b79b-7485cf06e709", "1ed61c75-7ad6-4f5d-be45-851fdaed0be5",
                                        "273cd871-3a72-4b6d-a998-cb80eb9be1c5", new Date(1552477765287L),
                                        DeviceMechanism.getDefault(), "2f351c01-6ecd-4411-a9da-b5fdce9d0521",
                                        "e7805f7d-d9ab-4560-ac2d-09360ffc8a07", "58e1ef0d-7880-4ef3-bd8f-f4d5840a77a8",
                                        DeviceState.getDefault(), new Date(1552477764813L),
                                        "b563c261-7f46-4187-8080-4b5e01b57db9");
            Device device3 = new Device("1d4fac3d-5415-4b16-a6ff-d158124acd37", false, new Date(1552477762092L),
                                        new Date(1552477759492L), "5a3e8cca-33d5-4051-a9fa-cf30a6a7dfc7",
                                        new Date(1552477764110L), new Date(1552477759711L), null,
                                        DeviceDeployedState.getDefault(), "2f521248-2611-436b-8fd6-b1f95dddf3ae",
                                        "da5be02e-9bf1-4855-b1ee-273834a34cd5", "75a130d1-479d-482d-a7bb-980761246ac5",
                                        84, "af1789d8-8c74-4dbb-8e11-5f6f87b9093b",
                                        "ebd37459-066c-47f4-9d90-76daa5c2b11f", "bde12d32-e6e7-44fc-b630-3a40be7324c0",
                                        new Date(1552477764342L), "7b7b0fad-d41d-4ff5-a628-80ae7bf81404",
                                        "e63022d8-afff-43a7-b96f-b8f72f789113", "18c2fdf2-e25b-4427-a4c1-5f183b4bbfb8",
                                        "010448d4-bc23-45c7-87b0-92f550bebc79", new Date(1552477759625L),
                                        DeviceMechanism.getDefault(), "fe0a6c95-8374-4772-bfe6-8b4ec5f6efe5",
                                        "4aef8191-d25f-4b0a-bcea-debd7c2813bb", "f8d6f932-d440-48f9-b27d-1a4adfb80d0e",
                                        DeviceState.getDefault(), new Date(1552477763711L),
                                        "1db38a4c-0a2d-4c79-83ad-4763fe96d326");
            assertNotNull(device1);
            assertNotNull(device2);
            assertNotNull(device3);
            assertNotSame(device2, device1);
            assertNotSame(device3, device1);
            assertEquals(device2, device1);
            assertEquals(device2, device1);
            assertEquals(device1, device2);
            assertEquals(device1, device1);
            assertFalse(device1.equals(null));
            assertNotEquals(device3, device1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
