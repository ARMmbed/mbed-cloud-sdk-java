// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model FirmwareManifest.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestFirmwareManifest {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1566811764213L), 98,
                                                                      "30107eda-0200-4ab6-b3aa-41af362ad322",
                                                                      "f971117d-5dc6-481c-a20e-cb10066c5872",
                                                                      "7a57a512-659c-4863-b203-dbb17f282383",
                                                                      "e671e303-303c-47d3-8016-6cad9c2c0bd5",
                                                                      "aef4bb82-2d8b-46c5-b990-475995067f2e",
                                                                      "59c250c1-de41-42ce-8075-2cd98c073d9f",
                                                                      new Date(1566811762015L),
                                                                      new Date(1566811761518L));
            FirmwareManifest firmwaremanifest2 = firmwaremanifest1.clone();
            assertNotNull(firmwaremanifest1);
            assertNotNull(firmwaremanifest2);
            assertNotSame(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
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
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1566811762532L), 16,
                                                                      "753473aa-6e30-4d2a-b069-ad892e643452",
                                                                      "d725be09-5445-46a9-82a2-832949664f5b",
                                                                      "b2e7d25d-b151-455a-a8f3-bfbd6dd5a1b9",
                                                                      "4083fe74-3a3f-4522-a41f-c9a00b339fc0",
                                                                      "c7343537-ddbe-4dec-aa30-7bd7d895d02a",
                                                                      "f2066a04-aad6-47fa-844d-7acf8b1e2961",
                                                                      new Date(1566811758744L),
                                                                      new Date(1566811765110L));
            FirmwareManifest firmwaremanifest2 = new FirmwareManifest(new Date(1566811762532L), 16,
                                                                      "753473aa-6e30-4d2a-b069-ad892e643452",
                                                                      "d725be09-5445-46a9-82a2-832949664f5b",
                                                                      "b2e7d25d-b151-455a-a8f3-bfbd6dd5a1b9",
                                                                      "4083fe74-3a3f-4522-a41f-c9a00b339fc0",
                                                                      "c7343537-ddbe-4dec-aa30-7bd7d895d02a",
                                                                      "f2066a04-aad6-47fa-844d-7acf8b1e2961",
                                                                      new Date(1566811758744L),
                                                                      new Date(1566811765110L));
            assertNotNull(firmwaremanifest1);
            assertNotNull(firmwaremanifest2);
            assertNotSame(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2.hashCode(), firmwaremanifest1.hashCode());
            int hashCode = firmwaremanifest1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, firmwaremanifest1.hashCode());
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
        FirmwareManifest firmwaremanifest = new FirmwareManifest(new Date(1566811766460L), -52,
                                                                 "9f9be5f7-6b9e-47f0-80aa-fe8065f52d95",
                                                                 "dfc8d15a-a0cf-4ec1-89ce-2201035b3c0d",
                                                                 "c6a55e51-f0f2-4dcc-ae78-0a0231a311e7",
                                                                 "2613c91f-b1b0-4295-9dd4-684993e4d284",
                                                                 "002c713e-b032-414a-a7f3-5e986a3a5a7a",
                                                                 "2516076a-e9ba-407a-a858-650c0641181b",
                                                                 new Date(1566811761493L), new Date(1566811758672L));
        assertTrue(firmwaremanifest.isValid());
        FirmwareManifest firmwaremanifestInvalid = new FirmwareManifest(new Date(1566811767131L), -52,
                                                                        "1ee78557-bbf1-42da-94da-ef9293d13d80",
                                                                        "eee8c363-deac-4f00-a6bc-7b799b6699f8a38fc9c4-2695-4ba7-a2f5-7be8ddf484d87d2599d7-39c8-4f0c-9c42-b936c085cea52623b4b5-fd68-4488-a636-a20cd12c886f9db64485-d13f-4fae-9115-a1a2b40bc585e42ad191-a765-411e-ba6e-9d8e3815b86a349fcead-45a0-464d-9302-069474a3152ee739ffe6-e87e-4062-865c-5ebe3d7a76fc025f35b3-db1c-457b-9592-368e84ecb2a01d4c9407-fe3b-4d9f-a433-ebdb1dd2f2741b189c29-0b05-408b-b4dd-dc91388211b4e6bb2e4e-7d92-4fff-aa34-cb683d53dbaeeb186e51-022e-4d03-89bb-a49da4d31adeeab77b55-910c-49cd-a1cf-987baad1359fe492caf8-19c2-4e65-bb6b-a56d4071b22d538f6370-0504-4625-9f7c-529c2a74cd0dabf7db9d-9666-49b4-aeec-11bc8861f271e84f49d6-7b39-4652-9554-7d9a3f25fe8f596a2120-e1ac-4e70-b9dd-4b598f018969a71377c6-f228-499b-9b36-84df056e634d164c3c5b-eac1-41bf-bbf9-dece7cfa5621e7ef074b-d54f-469a-8f47-4965846dc59533f5a31a-a581-44a2-87c3-8eb0cd198731f488503e-87f6-4f07-a3ea-d20860173f24d3e74355-db3e-452d-a6b2-4007771d4d872ee38bdd-8446-4144-a7e8-8ec34d00ba7897a94464-c569-42d9-8969-25b4af5c4fed1d751ae4-c659-499d-bae7-7804e186791d32fb8374-3a53-44f5-abeb-c8bd4c643cbd01e2e3ef-e94d-4d04-9dae-6d114f1c86db6457825c-bcce-44f3-989a-f217867f9ace1b3987f5-6348-430e-980d-d42802e24fbed394e8fc-f8c9-48b5-a172-cf5ae800b856cd825d5e-dad2-4f43-a09b-c1a2fade80357c7083ad-7694-4c27-be50-60b776fea74475abe7e7-58f2-4b7d-b387-e115d2fa39ffb9806098-a8c0-4ace-87e4-8ccc1ad2d51bfe789d75-095e-42b3-83c6-452d748c9e6d8b03f679-9f72-4b54-8807-39690b86b002f729cbdf-5b2a-4265-8b30-0d15866eb3ad3918e2d7-8bd2-4350-98ce-0a3575016a329be9e072-74b9-4018-b312-e654204bf4e2fd576786-a21b-466e-b639-a1e00ccad6a567057be1-d2cd-4b36-bb22-4653bd876b16464b0157-c6d3-4c86-804a-a7598ac097c80e575dd2-66e0-4f43-934c-a01a1e0c7b50285be5e8-03cb-45c2-a661-9f3086be72e5e8ad5844-02a0-4770-8151-74dff322eb34322dc8bb-c192-4932-a42f-edb909eba725bdec2772-6088-4f12-a8d2-daebc6e16fb3eb960e8b-a1e8-452f-964e-51a154161252ab52cb48-77e5-4128-a484-d5aa56cb63841a182167-b3f5-4834-8f8e-5ea726f3bb4912b62c8d-1bcd-4b76-9e10-906fc25f32f6ea3a1ce3-0e97-4caf-b688-80fb7e84dd3a9b757522-e677-4d4e-ab14-3e972f9ec224",
                                                                        "31f7b3ee-2bee-4f1e-9a4d-aa64dbee4d67",
                                                                        "bd9a95d4-1a06-48cf-8f7c-4b743b9ae576",
                                                                        "a07012c9-2689-4965-b29a-d8dcf9ceb0b6",
                                                                        "cfe80cb6-f0c3-4e37-b0c2-9097e4988baed5e0e6a5-69d0-4990-a553-53b39cbc7f16b99aed76-1eb4-47a0-8664-a4bf47cd1ab9abe52736-0003-422a-ba1a-096956df01c6",
                                                                        new Date(1566811758198L),
                                                                        new Date(1566811762317L));
        assertFalse(firmwaremanifestInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1566811761302L), 14,
                                                                      "dc3671c9-09ff-493b-8329-1d6ec4614378",
                                                                      "77f6d3c6-d64a-4e63-9f0b-0d434605454a",
                                                                      "4719e09a-6381-4f1d-bb14-cb4ffb8fd828",
                                                                      "bb06d696-d7b3-4f6b-8d5a-73d9194df743",
                                                                      "3c29277b-d5d2-4fcc-bbce-ec33928955f6",
                                                                      "4e436782-a7a5-4668-920a-7883983faa15",
                                                                      new Date(1566811759186L),
                                                                      new Date(1566811765712L));
            FirmwareManifest firmwaremanifest2 = new FirmwareManifest(new Date(1566811761302L), 14,
                                                                      "dc3671c9-09ff-493b-8329-1d6ec4614378",
                                                                      "77f6d3c6-d64a-4e63-9f0b-0d434605454a",
                                                                      "4719e09a-6381-4f1d-bb14-cb4ffb8fd828",
                                                                      "bb06d696-d7b3-4f6b-8d5a-73d9194df743",
                                                                      "3c29277b-d5d2-4fcc-bbce-ec33928955f6",
                                                                      "4e436782-a7a5-4668-920a-7883983faa15",
                                                                      new Date(1566811759186L),
                                                                      new Date(1566811765712L));
            FirmwareManifest firmwaremanifest3 = new FirmwareManifest(new Date(1566811757663L), 64,
                                                                      "9cb41db1-20a2-4e41-b129-0db848c7c561",
                                                                      "e442815d-211b-4522-932e-071c1cb0e8cf",
                                                                      "2aecae66-851b-4019-b6aa-244048c2e523",
                                                                      "783f4f6c-3448-4b18-905b-6e5f5582e353",
                                                                      "50cbf6f6-f0fc-4f35-aaf4-c7586d3a336c",
                                                                      "212aaaaa-cf9d-4fbb-9ea8-9a2d0638bbf4",
                                                                      new Date(1566811765777L),
                                                                      new Date(1566811758951L));
            assertNotNull(firmwaremanifest1);
            assertNotNull(firmwaremanifest2);
            assertNotNull(firmwaremanifest3);
            assertNotSame(firmwaremanifest2, firmwaremanifest1);
            assertNotSame(firmwaremanifest3, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest1, firmwaremanifest2);
            assertEquals(firmwaremanifest1, firmwaremanifest1);
            assertFalse(firmwaremanifest1.equals(null));
            assertNotEquals(firmwaremanifest3, firmwaremanifest1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
