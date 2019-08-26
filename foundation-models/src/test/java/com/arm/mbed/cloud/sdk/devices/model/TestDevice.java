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
            Device device1 = new Device("417228e4-cf05-4e74-8eb4-9fac71582da9", false, new Date(1566811761417L),
                                        new Date(1566811759699L), "440d64ff-30d4-484c-b286-0d8f697c7652",
                                        new Date(1566811765469L), new Date(1566811759903L), null,
                                        DeviceDeployedState.getDefault(), "3cce6ed7-8aae-4da1-b734-817a7fea8477",
                                        "5e415cb6-cde3-4204-a403-a9182d4d35ff", "a7610551-b2df-454a-aa50-5ebb1b6", -15,
                                        "5b56640c-2bd7-4dbd-ae50-bf273e6f203d", "5ecd8267-5ea0-4503-8384-bf8f92bc2629",
                                        "f1954f08-d178-49a8-b090-5b22da9bda36", new Date(1566811766116L),
                                        "8b1253bf-e88b-4d83-9d58-8a4587632216", null,
                                        "355f6dc5-dd7d-4618-9245-f1ab1a4a77e4", "64c1f33c-fd7a-4bbd-9d72-cc80a7424f67",
                                        "bf9dFdc67c17bbFEc7dCeDF5efBe316d1faDc208CE50DeD5B68a2A162BDE0aaC",
                                        "0d3e86df-1bf0-4041-a794-7afb3a155615", new Date(1566811758608L),
                                        DeviceMechanism.getDefault(), "839ba99b-da5b-494a-b13b-728f5e6b29f3",
                                        "0d17d8f8-99e0-43a1-b18e-04529e230816", "ed4d5d0b-b205-4144-9bff-aec66e6e3c6c",
                                        DeviceState.getDefault(), new Date(1566811759767L),
                                        "e10a87fa-833a-47d6-8459-acd01c100ebb");
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
            Device device1 = new Device("36800f2a-3fd3-4b57-badc-e3b1a6fb4ce2", false, new Date(1566811765698L),
                                        new Date(1566811762309L), "3d6293ee-1a4e-4714-8a13-da806f3ad790",
                                        new Date(1566811760438L), new Date(1566811767388L), null,
                                        DeviceDeployedState.getDefault(), "c6714a2f-398f-4521-98dd-e0af7e99063c",
                                        "3d5a85a7-a1f3-447d-85b7-316bc61c6390", "b7073aa2-6812-4380-b387-e60bcb1", 24,
                                        "d716a1f4-7dc5-4ddc-9478-930735917d0f", "649aa149-c6c6-4a63-b2ba-1e2c6522cefd",
                                        "1857fdbb-154d-4e17-a6ff-1d44a186d8c5", new Date(1566811760640L),
                                        "53fde6c9-3b7c-42ed-8a15-28d025af37e2", null,
                                        "2ea25bba-5a83-4552-98d8-64330a6cc1ef", "d1d8c043-469d-448a-839a-8c924562ca2e",
                                        "bf9dFdc67c17bbFEc7dCeDF5efBe316d1faDc208CE50DeD5B68a2A162BDE0aaC",
                                        "999341e6-be57-4005-ba3e-11aa84cf6121", new Date(1566811762136L),
                                        DeviceMechanism.getDefault(), "e2754817-094f-47ae-93a5-f88286658a92",
                                        "25d36a57-e453-4db9-a2e6-8758bb9e2b79", "e1aedc7c-3f20-4d25-ba12-1623aa6f0c6c",
                                        DeviceState.getDefault(), new Date(1566811763682L),
                                        "4c67d5d6-346e-42e0-9ff0-069c77cd2466");
            Device device2 = new Device("36800f2a-3fd3-4b57-badc-e3b1a6fb4ce2", false, new Date(1566811765698L),
                                        new Date(1566811762309L), "3d6293ee-1a4e-4714-8a13-da806f3ad790",
                                        new Date(1566811760438L), new Date(1566811767388L), null,
                                        DeviceDeployedState.getDefault(), "c6714a2f-398f-4521-98dd-e0af7e99063c",
                                        "3d5a85a7-a1f3-447d-85b7-316bc61c6390", "b7073aa2-6812-4380-b387-e60bcb1", 24,
                                        "d716a1f4-7dc5-4ddc-9478-930735917d0f", "649aa149-c6c6-4a63-b2ba-1e2c6522cefd",
                                        "1857fdbb-154d-4e17-a6ff-1d44a186d8c5", new Date(1566811760640L),
                                        "53fde6c9-3b7c-42ed-8a15-28d025af37e2", null,
                                        "2ea25bba-5a83-4552-98d8-64330a6cc1ef", "d1d8c043-469d-448a-839a-8c924562ca2e",
                                        "bf9dFdc67c17bbFEc7dCeDF5efBe316d1faDc208CE50DeD5B68a2A162BDE0aaC",
                                        "999341e6-be57-4005-ba3e-11aa84cf6121", new Date(1566811762136L),
                                        DeviceMechanism.getDefault(), "e2754817-094f-47ae-93a5-f88286658a92",
                                        "25d36a57-e453-4db9-a2e6-8758bb9e2b79", "e1aedc7c-3f20-4d25-ba12-1623aa6f0c6c",
                                        DeviceState.getDefault(), new Date(1566811763682L),
                                        "4c67d5d6-346e-42e0-9ff0-069c77cd2466");
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
        Device device = new Device("f26c3ab6-7595-4211-8224-bf473152c8cc", true, new Date(1566811766918L),
                                   new Date(1566811759027L), "4f3d7f88-6224-451f-a520-22cf3af10733",
                                   new Date(1566811758258L), new Date(1566811765629L), null,
                                   DeviceDeployedState.getDefault(), "bfde4db0-fcee-4c74-aa7e-653f2201e15c",
                                   "b303aaa1-2e65-4098-af8c-a1333e2010f5", "e1dc916e-68ae-471c-af22-6ce3af2", -54,
                                   "5682c94d-b46f-4d40-bfac-f117470e8e07", "bdee36e8-deef-4edb-8ba2-dc2c3b8929dc",
                                   "fc15da9e-e653-49e1-a0f7-92474756ef43", new Date(1566811764465L),
                                   "7df5947a-447b-449d-bc59-f6b020aed44a", null, "5593017a-99a1-47f4-9310-fd5c6cdf7605",
                                   "cecdb1f5-48a0-4d66-9f95-cdb561eebf23",
                                   "bf9dFdc67c17bbFEc7dCeDF5efBe316d1faDc208CE50DeD5B68a2A162BDE0aaC",
                                   "7cc3dfed-c0c3-4190-953b-818af3551abb", new Date(1566811761673L),
                                   DeviceMechanism.getDefault(), "faf98442-b46c-482f-9ac4-59263983cd04",
                                   "8d9cfa3d-6b24-49f9-8fea-98710c3b44e9", "c23ac674-ca27-4bf7-88ca-c87439f48b5b",
                                   DeviceState.getDefault(), new Date(1566811765142L),
                                   "de28e4c1-de16-4044-a5c3-3dca1c6cf602");
        assertTrue(device.isValid());
        Device deviceInvalid = new Device("2f8274ac-ce27-4d6c-a9a9-1c2882779ea3", false, new Date(1566811759069L),
                                          new Date(1566811762343L),
                                          "2db4861b-b7cb-4f33-b2c5-da0d8fb7a5420cc9bea4-efe6-4e58-a3a6-8d9b2e03bf746d6440ed-5e5a-4d73-a072-84a73e27d7e67d14451f-4cae-4049-a2c2-9b66f7b0a324d37eb494-58b6-493c-afb3-8d0528fdac1ae0debac3-5c10-4a61-bd53-e9fedaa1ebdae85a84f5-8404-4a46-a21b-8de91b6586a2d8e11d86-7bc7-4dea-8d1f-b6eb547b4a89b7dee004-f2cf-43f2-8d16-59aae923a420e79773c7-fcce-4eaa-82e1-60046064344bb0843062-21e4-44cd-84f4-dfac35f1a80865455dfc-c8a6-4ee7-9ce2-81f945e747cc2e3f8ba3-363f-4fc7-bce5-859b78ae954832aaffcb-2000-4299-b813-485eed730be0",
                                          new Date(1566811760205L), new Date(1566811761753L), null,
                                          DeviceDeployedState.getDefault(), "06b3db41-f1fc-4800-9cd9-6293e597dcf4",
                                          "526f2092-c8df-4fd4-b5b9-d250bb5f0bdeb8fccec1-865a-4e3a-bbdc-00f58b314cde41b5a0b4-dfed-42e6-9ee6-77c809e77e7399f11f9a-884a-4ee7-8458-7587a88bf399ec4b8da9-e616-4afe-b36d-4cf901e845d124640fae-554b-4405-80af-11c4b2db4658939ca48e-6150-4d16-b123-a8ec55f7e33fe1c18b3c-6fd6-4d00-8792-fd9a1eb69217292c4dfb-2a3e-42b5-9e7b-59bbd735493e20d641ab-0f3a-437a-ae18-5e536027750f29c5c3b7-b7a0-41ee-b9c5-8796161f939d8f4fa64b-cda2-4984-a46b-8df8c4f1299e0684a923-6bca-4593-9d59-55afac1d7a8d474507bc-e6ba-47e8-a57f-9ad2d53952888a905b37-fb79-4c43-82b2-63b6966b28341193f318-e169-4502-ad0a-2c5c80e633bd6e5bc9f9-9ea2-4202-bb97-ff6fc073546cb715f7f2-c545-4624-9de0-5307e6a720c1d9d10abe-aa2e-46f8-8090-0cee149f2268821a8ad5-fd3a-4ad4-a81b-bdcfba802b548f59aafb-d452-45e5-8cf9-75a1ba04abff2cc09cb8-e56b-43d7-a3bf-24f2cb06086fb5116e66-9fac-4e6c-9af3-ee903b60d5e18f9b906c-ae19-47c8-961a-730ec581461eb879010a-a08f-4d5b-a383-f132f806c2f388b9e267-d868-445c-882c-1c6b6a213fe40d090f9b-1adc-4825-bd9d-c521c20835c0d9d3437b-9219-4bf5-89d5-58d13dbaaa3607fc3a06-f8f4-48a1-8a8c-eed3f6034e1587884589-5606-4e6b-95eb-f567df35eaf55a264565-51d2-4154-b889-545c6a946a7654b85dca-d8f9-4086-ab72-3759663b05b25f045439-c4f1-47e6-8d77-dfbb2a1cec4d0ab9bd3e-62b0-4025-ac23-5f432eaf32e35a0f86b5-59bd-403c-9714-ff0a7c5cce0cef0b8b0f-0888-470f-bea1-da5699bcc00490e3e122-f398-4305-951c-bc820b10dc5a05aedc70-4429-4aca-911c-9e99d6d351bd5cf67bf9-4780-4cdc-ad81-7a7f86081b96f39d93b9-864e-4935-8c6a-8d4ae6523ed8e13df3e2-d313-49ec-88fa-5be620daa4c420851a66-dac2-4bdd-950f-29e415b08c75ca6f3efa-4b4a-457c-9451-5ebe25cf72fa00a19d84-7b2d-4fa3-8461-8dcc3b6cccbe43f8631b-2364-433d-b523-6aa25570677bd4867ae5-e563-40e9-a5d4-344212b296714cce1a68-5f0d-4c13-b2ee-78979f03e291a279f62f-3b73-47c6-9b23-924a48637be10ad72514-f07f-42a7-9955-a318e9a06da5744ef614-305e-40ee-ab23-4dd03aca76b687a0369a-54ee-4c1d-9ffa-d6ba4767f69072777912-c213-4747-9a31-304368b1e0003ee5fd24-f7eb-4b17-a2c5-0d6b0c5666624453b91a-9380-46be-a522-038e499c7d046c3d9dcb-0614-4faf-937a-22148841837b8637b9f8-5afe-41c5-9382-0e3535bcd905",
                                          "e914a584-bfe1-4bd2-845e-57baf29c853a", 119,
                                          "905d2c1c-2eca-46a5-8c4a-1b60a49cfc471cdf6991-75b8-48d3-99f4-a1fed06d02cbabc5396e-f7a9-47d2-9598-02616d46d9e52f22e496-24cc-4cde-8fdf-1bc654a64f0762a4e1c8-6b21-4076-87a4-5597af359d6ea9e00c8e-d66c-49a6-bc57-8fdb6583c33d161f3aed-ac81-4712-af14-6d43b5b869642bc5bfbe-7256-49c3-b104-117f2aaadf302cfd6fda-341c-4b1d-8b2e-19a1878d367cb0a6737e-5d79-4666-81d7-54ff8113226a249db30a-e591-4731-9028-1fade7a9cfc01f086d7b-f92b-4bad-b3df-52edc2d0d505beb6cd01-92f1-4a32-94d4-fd2fb1bef2d2d94ac1a7-fb47-42ae-ac36-abb678704f9529017954-614d-4b5f-b8cd-53fa3545f963",
                                          "a74917b5-c674-4134-b9fc-5d9e53ce28aa",
                                          "7265e9ae-ca7e-49e1-9e45-83ab51eb8b2d6e43c23f-c4f4-4726-8b18-24f1260fbb3c",
                                          new Date(1566811763219L), "8faf891a-4bc9-497f-ba7e-76477976eb78", null,
                                          "a164976f-c133-438d-bf1c-c7083810f0e7",
                                          "0c2dce87-e6bf-42b5-b930-676e8521bff8",
                                          "Z4哽#U㷾\u0013陸\u0000=\u0002N4Zރ[�?4=%N듢浒.L4\u0015<4<4\u00134T᧳<;♫\bW\t\u0000`?W=�?T\u0004�?GU\u0014=?\u001d4䴴�?�4:",
                                          "e4b65f4c-7d20-4e48-ab6a-0f8288a971c1", new Date(1566811765179L),
                                          DeviceMechanism.getDefault(), "c9582ec8-114c-4f40-b860-c82b66741488",
                                          "5b859ba4-67e7-4236-a5b3-bcabd76d23b175f2ddc1-1c21-441b-ad18-385cb82fac86d53dcd84-0a77-4ceb-8763-d7f39c9dff15dba0a422-641c-4773-ae07-f9cbc9e82350",
                                          "c467b0f1-8736-43a8-a846-617839f041d2", DeviceState.getDefault(),
                                          new Date(1566811761286L), "05ff9994-255b-48a3-9921-0d7751b48a51");
        assertFalse(deviceInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Device device1 = new Device("1705f041-9f12-4bca-aa08-de23fe82549f", false, new Date(1566811767226L),
                                        new Date(1566811767267L), "cd8154dd-7c1d-43e5-9624-ac0d7f96addf",
                                        new Date(1566811759972L), new Date(1566811765651L), null,
                                        DeviceDeployedState.getDefault(), "5f3f7cd3-5e49-41a0-8733-dde821c1f4d3",
                                        "dea8b8f4-921f-4dde-ba4d-1644182498a8", "054c85f1-f088-4361-843e-0cf7a15", 30,
                                        "d08764a2-222f-461e-a9c8-3ade802112ef", "8adbf6e7-5f67-44d7-864a-5ba94307d7f9",
                                        "d4cb4365-7a5f-4083-a92d-3216ab2447f8", new Date(1566811757673L),
                                        "52fcb65c-756e-47b8-b561-c9e7244b54d0", null,
                                        "3aad0c37-4908-4ed3-a2d2-05bd6a7a5f3b", "25c6f11c-e41f-4248-bab7-77c5e773dc32",
                                        "bf9dFdc67c17bbFEc7dCeDF5efBe316d1faDc208CE50DeD5B68a2A162BDE0aaC",
                                        "d1e37139-7125-4922-b649-696c4e3be061", new Date(1566811758743L),
                                        DeviceMechanism.getDefault(), "197e6d19-69e9-4b0c-8fbc-634b81db2b5c",
                                        "8db027ba-bdc4-444a-85a3-2875a54705ba", "1192e83f-0d11-49a4-8b5f-07c9542dcf3f",
                                        DeviceState.getDefault(), new Date(1566811765700L),
                                        "d5df204a-5228-404a-a838-66caabc365fb");
            Device device2 = new Device("1705f041-9f12-4bca-aa08-de23fe82549f", false, new Date(1566811767226L),
                                        new Date(1566811767267L), "cd8154dd-7c1d-43e5-9624-ac0d7f96addf",
                                        new Date(1566811759972L), new Date(1566811765651L), null,
                                        DeviceDeployedState.getDefault(), "5f3f7cd3-5e49-41a0-8733-dde821c1f4d3",
                                        "dea8b8f4-921f-4dde-ba4d-1644182498a8", "054c85f1-f088-4361-843e-0cf7a15", 30,
                                        "d08764a2-222f-461e-a9c8-3ade802112ef", "8adbf6e7-5f67-44d7-864a-5ba94307d7f9",
                                        "d4cb4365-7a5f-4083-a92d-3216ab2447f8", new Date(1566811757673L),
                                        "52fcb65c-756e-47b8-b561-c9e7244b54d0", null,
                                        "3aad0c37-4908-4ed3-a2d2-05bd6a7a5f3b", "25c6f11c-e41f-4248-bab7-77c5e773dc32",
                                        "bf9dFdc67c17bbFEc7dCeDF5efBe316d1faDc208CE50DeD5B68a2A162BDE0aaC",
                                        "d1e37139-7125-4922-b649-696c4e3be061", new Date(1566811758743L),
                                        DeviceMechanism.getDefault(), "197e6d19-69e9-4b0c-8fbc-634b81db2b5c",
                                        "8db027ba-bdc4-444a-85a3-2875a54705ba", "1192e83f-0d11-49a4-8b5f-07c9542dcf3f",
                                        DeviceState.getDefault(), new Date(1566811765700L),
                                        "d5df204a-5228-404a-a838-66caabc365fb");
            Device device3 = new Device("69308c2f-bf22-44f2-89bd-d3a540a78967", false, new Date(1566811765194L),
                                        new Date(1566811758993L), "101661b9-fecc-48d8-82fe-8f6284dcfadf",
                                        new Date(1566811764896L), new Date(1566811763412L), null,
                                        DeviceDeployedState.getDefault(), "0c202406-bd20-4a24-9b33-276ad9742e79",
                                        "e791d772-13b4-45e5-a450-3148de2fe5eb", "78e8edd1-6139-407e-bbca-23f0ba1", -2,
                                        "a293205d-8f73-453e-8471-fc1c3508003e", "c3e619cb-1efd-4603-956f-251435f8964f",
                                        "40dedc0f-0c4c-4291-a228-7cff3c47c79f", new Date(1566811763419L),
                                        "bb64a198-707b-4011-b9c7-a8695dccf049", null,
                                        "8d4a1572-e2f5-4bbb-8205-b9911fae0adc", "6a67b890-0c43-46f9-b6e7-9d851426726a",
                                        "bf9dFdc67c17bbFEc7dCeDF5efBe316d1faDc208CE50DeD5B68a2A162BDE0aaC",
                                        "c8a33cd8-dbc2-44a4-9493-5c97bd19baa6", new Date(1566811764314L),
                                        DeviceMechanism.getDefault(), "1a41436a-ac13-40e2-a917-a52da2e62e0e",
                                        "eb5dc9f9-7b13-489f-bb31-b8065ace220e", "7c10a10d-94bd-4531-86ed-8133899f1ffd",
                                        DeviceState.getDefault(), new Date(1566811757901L),
                                        "8715b3b7-dae2-4df7-85cb-83632a6a2c0c");
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
