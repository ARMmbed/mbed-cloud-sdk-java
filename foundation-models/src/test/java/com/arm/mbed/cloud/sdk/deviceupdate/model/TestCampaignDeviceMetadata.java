// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CampaignDeviceMetadata.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignDeviceMetadata {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("5f0cdcc7-2876-4938-8195-5e40c4cca9f5",
                                                                                        new Date(1574704665233L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "e88a390b-d624-4211-8f3f-00f46ad33db1",
                                                                                        "3ffeef08-9ec4-4309-92cf-1825f0ac35bf",
                                                                                        "c784c639-ba4f-44b1-83c8-2cd97b3e3bcf",
                                                                                        "b0c9855e-b6aa-45f6-9a09-f723e7fac100",
                                                                                        "0e357b86-6f7f-4ef6-8b71-b782f0aefd69",
                                                                                        "9049a59a-258b-466c-8f23-41e56cd5d58b",
                                                                                        new Date(1574704666036L));
            CampaignDeviceMetadata campaigndevicemetadata2 = campaigndevicemetadata1.clone();
            assertNotNull(campaigndevicemetadata1);
            assertNotNull(campaigndevicemetadata2);
            assertNotSame(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
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
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("0bf542ef-0e1b-40fd-9ead-3713180a9a49",
                                                                                        new Date(1574704669222L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "aeb87d48-03bb-4149-b9bc-d62102b48746",
                                                                                        "429dc65f-c6c9-4e6e-88ec-528dc8781a30",
                                                                                        "a85cf541-76e4-4edc-b77a-074d688e0597",
                                                                                        "7986fc39-c9cb-4c44-ba23-9074796b23eb",
                                                                                        "dc8da8f0-9bd2-4052-ac3f-41b197bb1b29",
                                                                                        "ecde13f6-8763-45c7-9365-d95ffa92ac4a",
                                                                                        new Date(1574704669901L));
            CampaignDeviceMetadata campaigndevicemetadata2 = new CampaignDeviceMetadata("0bf542ef-0e1b-40fd-9ead-3713180a9a49",
                                                                                        new Date(1574704669222L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "aeb87d48-03bb-4149-b9bc-d62102b48746",
                                                                                        "429dc65f-c6c9-4e6e-88ec-528dc8781a30",
                                                                                        "a85cf541-76e4-4edc-b77a-074d688e0597",
                                                                                        "7986fc39-c9cb-4c44-ba23-9074796b23eb",
                                                                                        "dc8da8f0-9bd2-4052-ac3f-41b197bb1b29",
                                                                                        "ecde13f6-8763-45c7-9365-d95ffa92ac4a",
                                                                                        new Date(1574704669901L));
            assertNotNull(campaigndevicemetadata1);
            assertNotNull(campaigndevicemetadata2);
            assertNotSame(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2.hashCode(), campaigndevicemetadata1.hashCode());
            int hashCode = campaigndevicemetadata1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaigndevicemetadata1.hashCode());
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
        CampaignDeviceMetadata campaigndevicemetadata = new CampaignDeviceMetadata("79d3c08c-ec17-4512-a498-e70df904279c",
                                                                                   new Date(1574704664375L),
                                                                                   CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                   "af78926e-7a21-43be-bd10-7c2c4c1d823a",
                                                                                   "88066d72-bb91-46bf-bc1b-4dc44ac19dc9",
                                                                                   "db9c6ecb-61ff-4df8-8dc6-b7d7c5a4372c",
                                                                                   "5694a3d7-4077-435c-8685-210ced75426c",
                                                                                   "7bdfc991-1820-4f46-b4f9-2a4524d61321",
                                                                                   "15e82bac-6b10-4f24-86b8-f025e603f1d1",
                                                                                   new Date(1574704661373L));
        assertTrue(campaigndevicemetadata.isValid());
        CampaignDeviceMetadata campaigndevicemetadataInvalid = new CampaignDeviceMetadata(null,
                                                                                          new Date(1574704667129L),
                                                                                          CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                          "98c9f3d8-283f-41a8-bb20-256acf3e2ca0c12ea771-f07a-4c23-a1f3-d4bd2884d104622a6199-6641-4c36-9626-0b8fc673bb97d75f019d-1a16-4429-9600-9a85e837625d92ab986c-597f-4707-986f-e77888e96377e8a3b449-588e-4914-b5d5-168cb2619b805fd4fc90-0834-4768-bbb9-5df15617a804021ce1b7-0b22-48f2-9e81-3fd337cb16c248b01f56-3032-41b5-afff-86d97c0b55cf40fd05b3-382c-41dc-8910-91591e5546c7f69ea95b-0aab-40d6-8f82-db6ec94e4bcc3fdd6fda-1815-484f-a1b8-05c08d8a489bcd5a78f9-0fcd-47dc-9df0-8938079842b76f21d340-df3a-4607-b452-5933eac8f777a1bfe1be-fde6-4718-9d50-500b1d48e0f5cd417a09-f4a5-4df6-a990-76e110d431b9a30441a4-89f2-4f80-a0b3-9d11dbeabdfc953f5e40-fd50-4b3f-ae24-c5cf6417b758512ae1ae-33a3-4ff2-a73b-99b70d5616083621a8e6-0875-4bf6-8f2f-ddfcec32c9cfe9b5b60a-06c8-4fa6-9a0b-30250408f924dc338366-ff23-4d07-9d9b-76b23c342b931791be6e-ba67-4719-a6c2-5c98fb1228d943d30252-cb16-4856-b2a9-dacd2f7232271b9935cb-59b7-4fd2-9d41-0e8103c3e3c2909f479d-4cd5-4c5c-b527-b6a7485aa25dc3a914fc-0892-4a25-9db1-08b600a508dd6513516f-80d1-41c6-bcf4-bf35b58a2f63b7a7ada7-6539-4aa8-89e9-7b06c0794a6b561504ab-f3fb-47d9-b3fc-5c0a03bf8d096b037c50-a87a-4423-be4d-af4772dde3b245c14c28-176c-46be-8c3d-ca2ee46eb2e6a54f2566-fe0d-4467-ae8f-4ed83e816118b72b8f25-37cb-4ea1-98a0-9dffd6ba7f5c1d2ece91-7316-47c9-b56a-7b343245470becdef278-c6d1-4db7-a742-41bf93fd043de21b0156-d9ea-4208-9830-de0fdf68862b26aeb4b4-e260-4850-b4c8-1f175ed95f41b50a24a6-b928-479e-b0c0-dd43fa8024119aad3196-b627-48cb-9362-ea30165af503c2102af6-a05f-454a-b67a-2762464edec8bd4207c5-71e5-49a7-a841-4955f4a4eadcbfcdb386-5bae-412a-8795-fc1736b0407d4b3e3f0d-b5ad-4ccb-b7da-3c292b4eeae610921904-0448-4c4d-972a-0251aab78aedd1ce23a6-4f18-487b-b39a-29aefab769083ed2376e-5708-46a2-b6d9-cd58f3532ade16d18c23-0800-474c-bf6e-de85dfa524d526d13bc7-0ffc-4e64-8aa9-0190a138d81755fa525f-f258-4a44-91d6-6c4990c8507905e86511-5fa0-460f-9511-310a84e6e2197d107653-6a69-4c1b-a282-3084f0a718d5b7f3ca7d-46d1-47ab-b6fa-7628a1c9c16a93bdc1ec-a918-4d4e-97e2-09c6fee7cdc67d4f878d-5818-4ddc-a770-e239c6b694708f6db511-6c7c-4fd1-bc65-62e1fa11d088",
                                                                                          "f401d689-4ec0-4be5-a108-363ab67cea0c",
                                                                                          "37268f1d-c480-41ae-8194-4ff40bebd3fe",
                                                                                          "3bbb9bc0-ac88-492c-98d6-c35e3500ed1a",
                                                                                          "f5b1f0a9-ba9e-4f60-a181-22cb9aaea300",
                                                                                          "861248ec-dbd3-4b9d-a021-7d6855de76f55239264f-36f1-4c37-8cf3-86c58c11442ac2eec55c-ac4e-421d-810a-5cd6e9f8104673610657-22bf-4361-a1e1-c61fa67fac0e",
                                                                                          new Date(1574704666745L));
        assertFalse(campaigndevicemetadataInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("203f5688-6c30-4dfc-8a83-9d6c74fbd315",
                                                                                        new Date(1574704663122L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "079ef2e0-d1fc-40aa-9c42-339be10f26f2",
                                                                                        "a356bde1-c81d-40c0-8d5d-c97d57e92407",
                                                                                        "bb6c7c23-e8c4-416e-bbdd-71c4df4515da",
                                                                                        "eea158f2-91a8-4348-9417-ebe86f3b3eb9",
                                                                                        "49f445db-7002-4dd2-8be5-57778c0e03cf",
                                                                                        "3ffd559f-27bd-4041-942c-5224dc092550",
                                                                                        new Date(1574704660677L));
            CampaignDeviceMetadata campaigndevicemetadata2 = new CampaignDeviceMetadata("203f5688-6c30-4dfc-8a83-9d6c74fbd315",
                                                                                        new Date(1574704663122L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "079ef2e0-d1fc-40aa-9c42-339be10f26f2",
                                                                                        "a356bde1-c81d-40c0-8d5d-c97d57e92407",
                                                                                        "bb6c7c23-e8c4-416e-bbdd-71c4df4515da",
                                                                                        "eea158f2-91a8-4348-9417-ebe86f3b3eb9",
                                                                                        "49f445db-7002-4dd2-8be5-57778c0e03cf",
                                                                                        "3ffd559f-27bd-4041-942c-5224dc092550",
                                                                                        new Date(1574704660677L));
            CampaignDeviceMetadata campaigndevicemetadata3 = new CampaignDeviceMetadata("cb71f7b2-04a5-483b-879d-238b89ea1ec3",
                                                                                        new Date(1574704664306L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "3f24e32c-8ad4-4b4a-bbff-b15659142662",
                                                                                        "801ef797-7078-4ef4-b388-3036c72ef24f",
                                                                                        "ccf771c8-59d0-4a21-b68a-7d67eb3d101e",
                                                                                        "fd4d26a5-3cc0-476d-8e4c-73c003713645",
                                                                                        "538ba6b5-b8cf-4d27-8df2-c3ef2571d1de",
                                                                                        "eb1399e2-0978-43b1-abc5-4d5d77bbf6d1",
                                                                                        new Date(1574704663171L));
            assertNotNull(campaigndevicemetadata1);
            assertNotNull(campaigndevicemetadata2);
            assertNotNull(campaigndevicemetadata3);
            assertNotSame(campaigndevicemetadata2, campaigndevicemetadata1);
            assertNotSame(campaigndevicemetadata3, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata1, campaigndevicemetadata2);
            assertEquals(campaigndevicemetadata1, campaigndevicemetadata1);
            assertFalse(campaigndevicemetadata1.equals(null));
            assertNotEquals(campaigndevicemetadata3, campaigndevicemetadata1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
