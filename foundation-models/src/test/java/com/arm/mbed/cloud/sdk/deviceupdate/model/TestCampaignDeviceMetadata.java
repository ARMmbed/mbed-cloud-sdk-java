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
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("3f7aa27c-a3ce-4d87-86cb-f9e66c102135",
                                                                                        new Date(1559655029133L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "b20471d8-0841-4c67-ac60-af9186f041e9",
                                                                                        "46c09d60-5b99-4e89-8a51-80166e2cc3d7",
                                                                                        "16abf48d-ec5a-4041-adb8-5632ee061137",
                                                                                        "ad7b7dc6-1443-4dd3-9b50-bff2b62a8c93",
                                                                                        "c3ca3173-2319-45c2-b1ef-9f3bdc8d6be6",
                                                                                        "b5fe7dd5-2cb1-4e07-9d0c-2d9887d449f2",
                                                                                        new Date(1559655028306L));
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
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("73379cf9-19d4-4360-990a-5781a526b8c7",
                                                                                        new Date(1559655034232L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "d4dd6fb8-3bd8-4d11-b15a-3a75e261f401",
                                                                                        "ab1031a2-365e-45f4-ab38-5e30e06385ba",
                                                                                        "6b5c4dc5-4e98-41f7-a4d9-9bace7ab004e",
                                                                                        "65d9d60f-3796-42f8-952f-a9a98ebec096",
                                                                                        "98d6d5ff-728a-45b5-ae48-5038672dd3c7",
                                                                                        "2fc77c31-967a-4646-b755-8590963a5e06",
                                                                                        new Date(1559655029754L));
            CampaignDeviceMetadata campaigndevicemetadata2 = new CampaignDeviceMetadata("73379cf9-19d4-4360-990a-5781a526b8c7",
                                                                                        new Date(1559655034232L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "d4dd6fb8-3bd8-4d11-b15a-3a75e261f401",
                                                                                        "ab1031a2-365e-45f4-ab38-5e30e06385ba",
                                                                                        "6b5c4dc5-4e98-41f7-a4d9-9bace7ab004e",
                                                                                        "65d9d60f-3796-42f8-952f-a9a98ebec096",
                                                                                        "98d6d5ff-728a-45b5-ae48-5038672dd3c7",
                                                                                        "2fc77c31-967a-4646-b755-8590963a5e06",
                                                                                        new Date(1559655029754L));
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
        CampaignDeviceMetadata campaigndevicemetadata = new CampaignDeviceMetadata("bc70142c-ac31-4624-a06e-e36837e04e01",
                                                                                   new Date(1559655029132L),
                                                                                   CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                   "269da071-bab4-466c-9ce2-50275ae46735",
                                                                                   "0e6bb5de-c789-4da2-b45f-3e8c356d4332",
                                                                                   "017a63f4-b2a8-4186-bd82-ba3a8645002e",
                                                                                   "b634e0c9-1e1e-43af-a251-239c34d0361e",
                                                                                   "133b84fa-3089-4d6b-bfa3-e9c7453c42ab",
                                                                                   "fa75e19d-3b68-46c3-b9dc-31cd762584f2",
                                                                                   new Date(1559655028475L));
        assertTrue(campaigndevicemetadata.isValid());
        CampaignDeviceMetadata campaigndevicemetadataInvalid = new CampaignDeviceMetadata(null,
                                                                                          new Date(1559655032476L),
                                                                                          CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                          "aef7385f-2224-48d8-abc3-582e3900cf70d1f113d2-2763-46fa-9a1a-f758b1e4154a6bf94a7e-5cc6-4b10-a852-b1e1d3730fcd9b19e9d1-6432-4063-aa94-ddcd049572c677216d24-fd45-43ee-8175-041ff11130613092d67e-8d6a-4129-a0ac-af446bfdf1650f189d2b-8502-4df8-b54a-7d1d798f91656a021732-cb9b-48a1-a243-75bcf48196abd5bb0fdf-5fb7-4b71-a8f2-bc1c94372c6f64dae0d8-59c5-4bcb-91dc-d319378d3a228cecce40-4466-452c-9764-442f53a0a87e06c40c53-d175-4586-a87b-a5179924ed0604462cd3-03fe-46f3-9a4c-24952fcc8852e6e72cfc-9d3b-4b31-ada8-f4f085e58983bee9bafb-1b09-4e82-865f-e0129981dc00f8287e6d-f82a-422f-9ae5-88ede4a541ba381ce918-049c-4a39-a939-1d2ee2be54220ed00a48-c814-4989-b1ff-bd053cd03435e89230f4-9340-45a9-8cdb-ba10b9ad199c245f6f85-66c8-4ab4-bcca-5eca82b91fed3470282f-9e1b-4886-935f-e4f4f98fef38ba25c09f-c687-456e-9e19-956501f6011c11562218-2329-4b6d-a6e1-a39a4d6effea5266662a-be00-4f5b-a75a-cde0d8f237a9ba3252f8-bd22-47a9-8107-d96f2d5ba8b20e4cda53-a0d7-4313-a44a-b56d89ae64d8b0d05cf5-8d3c-4386-b354-381bdf5de4cb2d0980b7-c647-4eea-be50-a9cafbb90e59feb22ced-4094-4ab0-a7d6-834a52fae8e7c52afbf4-84d7-448e-aeea-c00d7abf1e638342eb99-d8fc-4b1a-a074-e2aa639cb1d429d3df38-e7f6-42c8-b2bd-83478f605bee34d3d7ca-fade-45ab-941a-7912dfd711a0a6a512c1-2f38-4dee-9449-ab9e4f4b6f25af0d1d09-4d54-4e54-8a02-2cfd5cc924bab98ddf9b-25b1-4db6-a447-c14d52f13094f2664eba-ab97-4762-a32b-58ef6eef22dcc63602a6-c7b1-4d49-8805-01f93488f010eab0b4c6-b7f7-43ff-b0b7-d52f379d3bae45d57ab3-2073-46d7-a8f5-a71d6c0245d2a872cfd5-a28c-42e7-98a4-316f0dff5a843773303f-14a4-46ef-a26a-8f04d45e6bb6e1cd749e-d4d6-46fb-a84c-eb6e8776bab99d8c9fd1-8649-4c57-80d3-63500c5966b30e0dded0-faab-46b0-9dbe-5d09588d202fa4611773-c646-4b00-82bd-53a9fdb818ef5a29715e-c5ad-4bda-91d1-6dbd819629dbe827cd51-d71b-4d4e-ba37-ee4f298b91c5d7cff67a-e92a-47f9-b403-dc9f188bf3933f55c137-2c1b-4ceb-86ff-2aa6e31de85ab7cc7bb5-173e-4db8-a0b5-001364f1cf9a472cde16-d108-4e09-8def-ad52583df795c78015c9-0b37-47bb-8388-ca15a3b788fe5f8fb013-1cf1-463b-aaa0-f1ed217a0af5f2da5953-06c0-478b-84e2-91f7dfea86659b6ec315-ed1b-4461-91e2-17fb90e15a53",
                                                                                          "6c65c2e9-216a-4e86-bc66-0a7aca2272c3",
                                                                                          "e7c2cad7-0b1c-4b75-b5b2-da69f08283ed",
                                                                                          "2b69ac65-173b-4857-b5cd-f125a147383d",
                                                                                          "0aaf0bff-4f5a-438e-b982-58a9d2cf1496",
                                                                                          "c6fb8bd5-12d6-4457-9655-20e287e640c3561cd56a-ced0-4c1b-a397-609089da143976f7a52b-725a-48ea-b17f-f6a6b18716012fdf4ca7-59ae-47a5-a5bb-79752e8c890e",
                                                                                          new Date(1559655033230L));
        assertFalse(campaigndevicemetadataInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("42c15e14-99ef-4786-aeb1-45e7a50884d5",
                                                                                        new Date(1559655034481L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "6ace0844-d3a3-4a3b-93e5-154dbc8e306d",
                                                                                        "03d093c7-fe94-47db-80a9-2b1e3a8e1787",
                                                                                        "fe35e07d-09f5-4acc-8cb2-87bf209bcc3f",
                                                                                        "772bae01-b21c-4492-a9c7-18972684b1d4",
                                                                                        "3baf7782-a6fb-4257-a08d-28525e6ef51a",
                                                                                        "10b26a7a-3de6-46dc-9f0a-f10ef6d6ecbe",
                                                                                        new Date(1559655031119L));
            CampaignDeviceMetadata campaigndevicemetadata2 = new CampaignDeviceMetadata("42c15e14-99ef-4786-aeb1-45e7a50884d5",
                                                                                        new Date(1559655034481L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "6ace0844-d3a3-4a3b-93e5-154dbc8e306d",
                                                                                        "03d093c7-fe94-47db-80a9-2b1e3a8e1787",
                                                                                        "fe35e07d-09f5-4acc-8cb2-87bf209bcc3f",
                                                                                        "772bae01-b21c-4492-a9c7-18972684b1d4",
                                                                                        "3baf7782-a6fb-4257-a08d-28525e6ef51a",
                                                                                        "10b26a7a-3de6-46dc-9f0a-f10ef6d6ecbe",
                                                                                        new Date(1559655031119L));
            CampaignDeviceMetadata campaigndevicemetadata3 = new CampaignDeviceMetadata("2b622695-bf6c-422a-b559-bb3ba68f1cd0",
                                                                                        new Date(1559655035956L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "d9695400-5356-4061-92e6-29d0abe415f6",
                                                                                        "3634be85-ca2c-47dd-912c-92aab602660d",
                                                                                        "ce04b014-2d77-4c34-bda7-5e6ae889edbb",
                                                                                        "5a9cb90d-0c9e-4f5d-95ae-42f615be5111",
                                                                                        "e9cc099a-a565-423a-95c0-9f630c499168",
                                                                                        "beba59da-bab4-4096-97e8-45c2b74b0442",
                                                                                        new Date(1559655033592L));
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
