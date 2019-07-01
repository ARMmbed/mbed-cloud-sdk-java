// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceGroup.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceGroup {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceGroup devicegroup1 = new DeviceGroup(new Date(1561989470811L), null,
                                                       "2dd02bc2-e76c-4fbc-8678-a473952bedc7", 8,
                                                       "d1734719-4520-4bac-b82d-ca6f74354a4e",
                                                       "08e9792f-913d-4596-aef2-b5ae2a9f0eb1",
                                                       new Date(1561989474507L));
            DeviceGroup devicegroup2 = devicegroup1.clone();
            assertNotNull(devicegroup1);
            assertNotNull(devicegroup2);
            assertNotSame(devicegroup2, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
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
            DeviceGroup devicegroup1 = new DeviceGroup(new Date(1561989473676L), null,
                                                       "b33c80f4-c076-4ddd-81f9-0e01ddef1961", -45,
                                                       "2f41c008-38e2-4fca-b2e7-ab053445dbb0",
                                                       "cd9148da-a384-4352-9d63-bb93c617b588",
                                                       new Date(1561989469574L));
            DeviceGroup devicegroup2 = new DeviceGroup(new Date(1561989473676L), null,
                                                       "b33c80f4-c076-4ddd-81f9-0e01ddef1961", -45,
                                                       "2f41c008-38e2-4fca-b2e7-ab053445dbb0",
                                                       "cd9148da-a384-4352-9d63-bb93c617b588",
                                                       new Date(1561989469574L));
            assertNotNull(devicegroup1);
            assertNotNull(devicegroup2);
            assertNotSame(devicegroup2, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
            assertEquals(devicegroup2.hashCode(), devicegroup1.hashCode());
            int hashCode = devicegroup1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, devicegroup1.hashCode());
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
        DeviceGroup devicegroup = new DeviceGroup(new Date(1561989478494L), null,
                                                  "943dfff0-9e0e-45c5-ba58-aeaf4b5e35ce", -28,
                                                  "eefb78a6-2dcc-42a2-928e-d5c42e298739",
                                                  "32c21c34-cb79-4176-a696-a66e32912a67", new Date(1561989472899L));
        assertTrue(devicegroup.isValid());
        DeviceGroup devicegroupInvalid = new DeviceGroup(new Date(1561989475678L), null,
                                                         "41c97cf5-449d-4acc-87d7-f73bab53ab7579f0c116-66a6-44fd-a5f4-ef86b60df1380c6b9657-6c5b-4d69-98bc-0a4b57b084e6a4ce1dec-a9ec-468b-82a9-2c91bfd9655e676a909d-e73b-449d-863d-7897d748ae9032949e32-455a-442e-8c6a-46d6442d45fa03102a3d-3c63-4f2d-8a61-5290863765762a1b6243-0337-45b5-9e6b-4551dbd820b2034d72b2-7717-40ed-8348-421df79d04ce582f1400-c993-473b-900d-1b694628e59fc2da53cd-dc4c-4dd1-b1d1-3f54ecce3c5957b74c9f-8b93-4f52-a48f-2ca2bbc147c2571e6bb9-7c62-4ede-9d59-fb5cad43aeff4be1fdcf-005a-48e8-a305-af81d315a1818ab0ef02-7296-4b1c-b86f-59e387467c4d14c20a3c-90c8-40b2-a41e-4901322c519e66749cce-8006-4c68-9fb9-db5860b75a711bd3f034-8e1c-49b5-b2ad-ac463d74c769e2558b1b-4fcf-4a4b-9534-4bc0b9b4321ee4e246b5-55ce-4ae1-bd88-9e937213d4e48676fcc4-fa4a-4005-921e-057f6602516da3f85859-3551-4ffa-9140-980dfc16107e5110bb71-c46b-443d-b495-2f9836fc945b39d25f30-6637-4534-a4c3-5189785c4c21d4bfeabf-dd53-426c-9a33-aba7fc6a2ac34b3722f8-ec99-4fd4-a06b-a74c2e47ca5f15c83932-a56f-4857-9ae5-ebf9343dd0942d54151d-1250-4615-8c5a-6ffe20086181a41a943d-2d6e-4022-956d-2986c2fe7b39e0607f0d-d3c7-4eca-b6e5-330c2d8030d38810ae89-4c63-4bf0-b503-1f0f1723608f06baf29e-fd05-4648-814f-37c3b59ae1bed242f6d2-eb37-40c7-8d96-66433bef847ade6e26a3-1fa6-4eea-911b-eeec99ea313ba531c714-5d73-4ed4-97c9-8304be832b8b4c33b9a6-92df-43e0-b6c2-cd3d20884c60cdb59c90-1c0e-40ba-93a5-aeaaa9fed47f453e16c6-fb3d-48b5-a351-b55ce5c51a22efaaf1dc-2297-44ed-87a9-11b65448ad478fe5e850-3ab6-415c-aa75-a6a553dba03bc3a65823-4397-41df-9fd0-ff4bf02e0267b0eaa9e6-112e-4c06-a0ee-687f148ff76fdf960389-b960-4e7c-815d-1d5e476847de7aac98d8-b77f-4868-9e3b-fd83d3c0b533390f927e-951a-442c-94cd-dc6c524c1cb0689bc655-c648-416a-823d-b18c5a8ba210640891ae-796f-4fd2-ac15-09738233f6e95bed6e65-4cf1-442b-99d2-1113b7fc9c7c4f9813df-1173-4090-83d4-2dab1766dfbd8bbf9cbe-e49f-4534-a9e4-906e559f0778a31bd83a-81e8-4b88-ba57-4686a8a8ef7f2130b484-896c-4b6b-9318-a7048b764b3aa2c443ae-d8b7-473e-a05d-ae0630f7ccf282036f36-8a64-4d22-98f5-5e9d10adc50e3973d936-ae5b-47ab-9bd8-b7700ecbc1c7f8b69dd6-dd06-4af9-95a6-2d03a72409bf",
                                                         -51, "b51b6eb3-be5b-454a-bbe0-2c9f6be97367",
                                                         "8d47af29-15a4-4653-9c39-108136ff4d17cf7d5c39-6f1b-4fe5-ab8c-4a65d9a6f4a78c43a4de-8648-4200-b009-bfd1f6467f9df83faf61-488e-47ba-ab71-ef108f9789c4",
                                                         new Date(1561989474270L));
        assertFalse(devicegroupInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceGroup devicegroup1 = new DeviceGroup(new Date(1561989475975L), null,
                                                       "e55eee0a-3253-4057-b023-e0229616df37", 103,
                                                       "25d33e1f-6536-4940-9f01-6d097014f092",
                                                       "91dc9245-fdce-4d30-8b09-3afe7d07b69c",
                                                       new Date(1561989470737L));
            DeviceGroup devicegroup2 = new DeviceGroup(new Date(1561989475975L), null,
                                                       "e55eee0a-3253-4057-b023-e0229616df37", 103,
                                                       "25d33e1f-6536-4940-9f01-6d097014f092",
                                                       "91dc9245-fdce-4d30-8b09-3afe7d07b69c",
                                                       new Date(1561989470737L));
            DeviceGroup devicegroup3 = new DeviceGroup(new Date(1561989477567L), null,
                                                       "cd101170-78e1-4ea1-a4ad-b8e443498940", -111,
                                                       "30ab8171-610e-4c38-8174-84977bfe8572",
                                                       "e33ee1b6-edcd-4d08-bda0-0d9776eeb8b0",
                                                       new Date(1561989469289L));
            assertNotNull(devicegroup1);
            assertNotNull(devicegroup2);
            assertNotNull(devicegroup3);
            assertNotSame(devicegroup2, devicegroup1);
            assertNotSame(devicegroup3, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
            assertEquals(devicegroup1, devicegroup2);
            assertEquals(devicegroup1, devicegroup1);
            assertFalse(devicegroup1.equals(null));
            assertNotEquals(devicegroup3, devicegroup1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
