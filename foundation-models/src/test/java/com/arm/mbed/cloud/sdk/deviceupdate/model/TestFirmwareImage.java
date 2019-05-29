// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model FirmwareImage.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestFirmwareImage {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1559143718356L),
                                                             "decd7a5c-fcf0-4c45-b981-c96cd7f4992b", 7,
                                                             "f5326e03-1015-498b-9aea-32730423f8de",
                                                             "b599652b-2714-4df1-9437-19459776468e",
                                                             "1cc0c12d-10bb-4e40-bf14-0ccf81b0b44f",
                                                             "33f66df7-1d5d-4e01-9d1c-3ad1930dc8e9",
                                                             new Date(1559143720369L));
            FirmwareImage firmwareimage2 = firmwareimage1.clone();
            assertNotNull(firmwareimage1);
            assertNotNull(firmwareimage2);
            assertNotSame(firmwareimage2, firmwareimage1);
            assertEquals(firmwareimage2, firmwareimage1);
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
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1559143713829L),
                                                             "9ec0c6bb-2300-4902-b1a4-a9236a0ae0a1", -50,
                                                             "1fccf069-055f-4890-a9f1-f39c7049946d",
                                                             "987bde22-4027-4acf-a071-0eba1dad063b",
                                                             "a73bc824-acdd-46c7-82e9-35aeaa479497",
                                                             "5aeda8ef-7ace-4586-b090-88f112120133",
                                                             new Date(1559143721154L));
            FirmwareImage firmwareimage2 = new FirmwareImage(new Date(1559143713829L),
                                                             "9ec0c6bb-2300-4902-b1a4-a9236a0ae0a1", -50,
                                                             "1fccf069-055f-4890-a9f1-f39c7049946d",
                                                             "987bde22-4027-4acf-a071-0eba1dad063b",
                                                             "a73bc824-acdd-46c7-82e9-35aeaa479497",
                                                             "5aeda8ef-7ace-4586-b090-88f112120133",
                                                             new Date(1559143721154L));
            assertNotNull(firmwareimage1);
            assertNotNull(firmwareimage2);
            assertNotSame(firmwareimage2, firmwareimage1);
            assertEquals(firmwareimage2, firmwareimage1);
            assertEquals(firmwareimage2.hashCode(), firmwareimage1.hashCode());
            int hashCode = firmwareimage1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, firmwareimage1.hashCode());
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
        FirmwareImage firmwareimage = new FirmwareImage(new Date(1559143720289L),
                                                        "7d0c6f0a-f9bf-4350-8d0d-8328cac8c1aa", 12,
                                                        "bdcdeed7-c266-4af1-8b4f-f10ce77eab8f",
                                                        "e51b56ba-aafd-425e-8fc9-371bdcb470dc",
                                                        "6691d5cf-c042-4520-9dea-79ebb207f921",
                                                        "8680f543-9978-4d21-acfb-169a4a1e8c37",
                                                        new Date(1559143719790L));
        assertTrue(firmwareimage.isValid());
        FirmwareImage firmwareimageInvalid = new FirmwareImage(new Date(1559143721498L),
                                                               "745df25c-dd68-4f12-8c14-6d559e2077ae", -44,
                                                               "17743992-3143-47e3-b21a-113517f5a798",
                                                               "8b94edee-6df0-4ab3-8a5c-fdb23b6e9b77c8fdd085-c8fa-4d8e-8c77-6a936ab54a54c1f6c614-b182-401a-8c44-84b60087fbe16d769e42-ac10-40e8-9044-021d883a4004f853d026-4bb8-4889-8cdc-8d0a96c70bd6eae89aa8-5ef7-4814-a476-9183da8c575f032705dc-543e-4a06-b5b7-e66204261423bc3b6200-d2bd-498a-9917-40d9100ba0bc3316220e-c9d4-4544-b318-7a94d429149167691f91-0deb-4d9f-aa68-a59f9ab7b1a86ce08272-0709-43c8-8913-945b5810480ca3634901-f5d6-4428-ac7e-966051b285501f883951-62df-4816-858f-238e8ac03bdacf157ea5-4e69-4c0b-8da0-48caf16d16e9fbdb5598-f8d5-4ff9-8a97-52c0bf0ff91aa7641647-aeb2-401d-8e7f-fe9e67cefd3f10a06b13-4ec1-4de0-bdb2-f1782c3cc0c14de0c787-8752-42d9-8fd9-7b6926fbcb1473c8201b-2dda-490c-9fc6-a5c34a65ae271de14685-7268-4e24-a0a1-11ab77a8123abc6d7019-4ee5-48cd-88a0-ff8cf60944a42adc834d-b520-4fed-8132-6cc619556b3fde8e3064-26ab-42f9-993e-d75f3115181b0968963d-b1ab-47a9-a91a-f8b54f05c671d1ea4b21-e561-44a6-b9a8-62a833c2f01468969044-e4b1-4a3c-959a-8219e254a07146af9aaf-6178-4390-9435-d6720603b6ee0f5a31d7-ff2b-4b6d-b641-332bb5eea3196b5dfd76-6ee0-4d13-a82f-f58f222cb9105bac4ec8-fb37-4c8f-9e6d-9e9b552d4e714614e899-2e08-42cc-b439-5b42b32bbf728e3117bf-62cd-4bd3-b6ef-05a5d7973a12c26fdca7-a3b2-494f-a171-e01bbe08e7b9fcd064fb-74df-46be-94e5-dac2468610d429f52a84-af64-49d4-90d1-3bf81986af597b540d50-a970-4a41-b828-2e277d929a9bf2229c7b-1de1-4159-99a4-23bf2780c1e2dcf37b1d-d28c-4d90-befb-cc0e9a657f03f5683715-14bb-4d60-81a3-ed2c6de868f9bc112776-91be-4ae4-aa05-a9c4fcade3b226298e45-5e65-4e8e-83aa-080380456ed4837801ae-986b-4d7e-b8fd-bc731d3fc010da8790cf-359f-44d5-8bd6-8d60d6db4f788590367d-ad9d-4b78-a29d-da021311a6ca3ce28531-3407-4ded-bdbf-95b3af07456f437b546a-f5db-485a-b1fa-de804dbfb1d9c7497402-adda-4ccb-aec9-a0e592c9f611e3973878-058f-42cd-bb1d-89d8bb77fc4854d90fcb-8126-4c38-8dfa-fa9f710b2626dc285c06-47af-498b-9233-2f5d56198e5fe7fc7618-72ad-4809-b446-8a10025c0bae5527db5d-4151-40bb-bd03-1acd7b53dfd16812ba23-199e-438b-964e-1b0c679d921a01e51e8c-0440-4206-913f-9e1c6517da121567a0d7-1594-4fcf-8c55-321db0d82883f614ef5f-ec9a-4192-bb4d-3e0d1666aff3",
                                                               "01d2290f-d59e-49a8-aa07-4decd5d74ece",
                                                               "dbd7e3f0-3892-46d5-aa39-766f7be3c4b9d3332d18-5cf8-409e-ae6d-e9f77bd5855edc49ac20-ae68-4027-928b-37019cf7dc0ad724095e-44df-4624-a583-0561862fd6fa",
                                                               new Date(1559143719243L));
        assertFalse(firmwareimageInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1559143717970L),
                                                             "7790bd01-8ccb-48f8-99a5-ad8a1c08dc70", -46,
                                                             "ca296944-3850-404e-a13e-a0f7bb486a1c",
                                                             "60b19032-8ec0-4c62-8adb-84fa249839e7",
                                                             "6b6d85e3-71c3-45fd-9d1e-455230d3e613",
                                                             "adef441b-690c-48cc-a96d-8722ad4391e6",
                                                             new Date(1559143719721L));
            FirmwareImage firmwareimage2 = new FirmwareImage(new Date(1559143717970L),
                                                             "7790bd01-8ccb-48f8-99a5-ad8a1c08dc70", -46,
                                                             "ca296944-3850-404e-a13e-a0f7bb486a1c",
                                                             "60b19032-8ec0-4c62-8adb-84fa249839e7",
                                                             "6b6d85e3-71c3-45fd-9d1e-455230d3e613",
                                                             "adef441b-690c-48cc-a96d-8722ad4391e6",
                                                             new Date(1559143719721L));
            FirmwareImage firmwareimage3 = new FirmwareImage(new Date(1559143719696L),
                                                             "56ad4095-8d8b-4e61-87f1-9c4ff4721f3f", 9,
                                                             "13a320a2-2bad-4644-bbe6-fb4deac4c4f8",
                                                             "1c56eec3-67b4-4e54-bcbf-4a0a92dbc139",
                                                             "cbc3d2c7-9b72-486d-85df-5b075c49b1b3",
                                                             "cfa74761-ef9c-4b08-a321-a4b39718d143",
                                                             new Date(1559143719268L));
            assertNotNull(firmwareimage1);
            assertNotNull(firmwareimage2);
            assertNotNull(firmwareimage3);
            assertNotSame(firmwareimage2, firmwareimage1);
            assertNotSame(firmwareimage3, firmwareimage1);
            assertEquals(firmwareimage2, firmwareimage1);
            assertEquals(firmwareimage2, firmwareimage1);
            assertEquals(firmwareimage1, firmwareimage2);
            assertEquals(firmwareimage1, firmwareimage1);
            assertFalse(firmwareimage1.equals(null));
            assertNotEquals(firmwareimage3, firmwareimage1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
