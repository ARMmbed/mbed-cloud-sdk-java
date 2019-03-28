// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model Account.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestAccount {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            Account account1 = new Account("390e3789-ec5d-4035-866e-088e4071f1ae",
                                           "284c370d-bee8-4928-af00-ad213c665022",
                                           "bed033a9-8ff8-4844-815f-e41ab21e7de8",
                                           "f5c285da-2795-42bd-9303-5fe0818b8d44",
                                           "beee137b-4209-4882-9ebc-aca891c6fb8b",
                                           "0d52c232-68f5-4547-8bf4-b4ae19dbec0b",
                                           "3a94b6c3-5a74-4a2e-adf5-fcf636c12599",
                                           "8ca2828a-45bb-4f7e-b44e-a5cfcbffe568", null,
                                           "2beffcdf-a830-4c44-a7cf-d4a4167b390f",
                                           "9f73fd2a-2047-45fe-9641-4486e7c63ec9",
                                           "d63b9587-f706-4578-ab0c-ade384cee3a7",
                                           "3df1708a-0ba4-4b58-b28b-62b599351399",
                                           "c07e2705-dc3c-48a3-8d6c-e922ec05460d", new Date(1553795416892L), null,
                                           "eb90a92f-81ff-4db2-ad50-5e07e75299c5",
                                           "e8650dc5-ab78-4063-8d79-be5cac725901",
                                           "c24f6b4e-7424-4efc-9950-9d7863b68c2e",
                                           "1ba0bf41-2038-4cc0-85ab-006ab4fb9e4f", new Date(1553795409276L),
                                           "14f02f2a-aee1-43fc-a5ad-050550eff88b",
                                           "8466898c-6fbc-4c71-bf23-73d97bd30aec",
                                           "4185df69-ce95-4090-9612-acb5840a44b0", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "a9afe811-3a34-4e13-adbb-d0de32e4bd49",
                                           new PasswordPolicy(), 1, "644a4f65-eb22-4c94-9dff-2ae404c8d599", null,
                                           "7afbd86d-a5cf-4b00-9bf2-e2a740f3d3d6",
                                           "5e8312ac-e79b-4069-8e18-d0e9a06f3417",
                                           "343ad594-dad6-417d-9e1c-5d9a0285e6a0",
                                           "29cc285e-4d80-4a0d-9cd0-4f1d7a0d426c",
                                           "5652776d-5163-455e-a118-cbd72012685f", AccountStatus.getDefault(),
                                           "4f8c6b9d-4dff-4edc-8d63-49b11671fcdc",
                                           "f197b34f-4991-4769-b33c-edc1f55c6464", new Date(1553795417274L),
                                           new Date(1553795411258L));
            Account account2 = account1.clone();
            assertNotNull(account1);
            assertNotNull(account2);
            assertNotSame(account2, account1);
            assertEquals(account2, account1);
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
            Account account1 = new Account("40bb855c-255d-44dd-a991-3aede67b63af",
                                           "d3447d51-6543-47e4-be84-97d7e8994986",
                                           "d8f3e267-d9fb-4666-89ce-b7aa93a675a7",
                                           "f9957403-89e4-4292-bec5-3e1dda472f2c",
                                           "33da6cbb-4d16-4722-b802-c9abc72ee1a4",
                                           "db550b51-7549-4429-8126-b79b0dbeccaf",
                                           "3a65a223-6947-4a7b-84df-95e09dbc2e94",
                                           "d8bef5ad-0d57-4fc9-b318-0feef2f4699f", null,
                                           "f554c96b-3a91-4b44-970e-f7b72861ed27",
                                           "5f3f6a57-58fd-45db-b037-ae64b21c5df3",
                                           "4aef8f30-c8ac-409e-bc0d-d6aed967027a",
                                           "4b942ac3-aa14-4d7e-bcf1-562fc1c74600",
                                           "f8bf627c-fdf5-4025-ab97-abcf34f0e620", new Date(1553795418535L), null,
                                           "7582d28f-44f5-488e-a058-85891a1ef468",
                                           "bb59a320-ec1c-4e8a-a4d2-e5bf02ee254f",
                                           "23887ad5-484c-42d8-8383-49ea34d812f0",
                                           "2117455d-a84d-4b2d-9d88-7a919782a357", new Date(1553795415909L),
                                           "4eb2d0cd-2c24-486e-9dd8-7a66fee5c44d",
                                           "e1f6c61f-f121-44cb-858e-0c52cc9dd949",
                                           "ebf13de0-16a1-484e-aaec-93b43ba1d184", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "645e4945-fe34-4e63-80f2-a5525c13c806",
                                           new PasswordPolicy(), 45, "5fb3aaff-307d-452a-8e4b-d6640c7e4045", null,
                                           "228bf0ca-3f6d-488c-81cc-ca2499c05ce1",
                                           "e84782f0-e5be-44c1-b3eb-309996896949",
                                           "fcc0097a-1c0b-421d-8f26-392a0142c19d",
                                           "6ed9306d-2ff3-489a-bb83-624fc0c3a90a",
                                           "799bf5e4-9605-489a-8b67-b63c661d7dad", AccountStatus.getDefault(),
                                           "83be0bc0-577b-4856-b81c-f75a2e8bd723",
                                           "ae8b6810-c618-4f72-9425-4c6339763d36", new Date(1553795418591L),
                                           new Date(1553795416997L));
            Account account2 = new Account("40bb855c-255d-44dd-a991-3aede67b63af",
                                           "d3447d51-6543-47e4-be84-97d7e8994986",
                                           "d8f3e267-d9fb-4666-89ce-b7aa93a675a7",
                                           "f9957403-89e4-4292-bec5-3e1dda472f2c",
                                           "33da6cbb-4d16-4722-b802-c9abc72ee1a4",
                                           "db550b51-7549-4429-8126-b79b0dbeccaf",
                                           "3a65a223-6947-4a7b-84df-95e09dbc2e94",
                                           "d8bef5ad-0d57-4fc9-b318-0feef2f4699f", null,
                                           "f554c96b-3a91-4b44-970e-f7b72861ed27",
                                           "5f3f6a57-58fd-45db-b037-ae64b21c5df3",
                                           "4aef8f30-c8ac-409e-bc0d-d6aed967027a",
                                           "4b942ac3-aa14-4d7e-bcf1-562fc1c74600",
                                           "f8bf627c-fdf5-4025-ab97-abcf34f0e620", new Date(1553795418535L), null,
                                           "7582d28f-44f5-488e-a058-85891a1ef468",
                                           "bb59a320-ec1c-4e8a-a4d2-e5bf02ee254f",
                                           "23887ad5-484c-42d8-8383-49ea34d812f0",
                                           "2117455d-a84d-4b2d-9d88-7a919782a357", new Date(1553795415909L),
                                           "4eb2d0cd-2c24-486e-9dd8-7a66fee5c44d",
                                           "e1f6c61f-f121-44cb-858e-0c52cc9dd949",
                                           "ebf13de0-16a1-484e-aaec-93b43ba1d184", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "645e4945-fe34-4e63-80f2-a5525c13c806",
                                           new PasswordPolicy(), 45, "5fb3aaff-307d-452a-8e4b-d6640c7e4045", null,
                                           "228bf0ca-3f6d-488c-81cc-ca2499c05ce1",
                                           "e84782f0-e5be-44c1-b3eb-309996896949",
                                           "fcc0097a-1c0b-421d-8f26-392a0142c19d",
                                           "6ed9306d-2ff3-489a-bb83-624fc0c3a90a",
                                           "799bf5e4-9605-489a-8b67-b63c661d7dad", AccountStatus.getDefault(),
                                           "83be0bc0-577b-4856-b81c-f75a2e8bd723",
                                           "ae8b6810-c618-4f72-9425-4c6339763d36", new Date(1553795418591L),
                                           new Date(1553795416997L));
            assertNotNull(account1);
            assertNotNull(account2);
            assertNotSame(account2, account1);
            assertEquals(account2, account1);
            assertEquals(account2.hashCode(), account1.hashCode());
            int hashCode = account1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, account1.hashCode());
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
        Account account = new Account("c306841d-6a11-48a9-8245-cd74d54a7a09", "4a861078-815f-42db-b39c-b3fe0722ea1b",
                                      "d15bc5c7-568d-40c7-b24f-abff8a4c959d", "3d94ce73-a358-4cb7-9a8c-b8cd8324656f",
                                      "2b12099c-648a-48ee-a7c9-69b59e79d6f9", "bfd1ad62-0d70-434e-acc0-c6aee640d8c2",
                                      "94c95066-5fc4-4452-8849-9dd39673b36d", "aafb2d62-f320-4aa2-a095-7972b5222488",
                                      null, "fdd76523-a5fd-4021-ac50-5f00a2b68609",
                                      "9a4c0919-4de7-427b-bb5d-659b282d7cd0", "3a81996a-cc74-4753-88d6-01191d6b9e34",
                                      "91871b8b-55ac-4672-b345-b5dfdf017b35", "a9a0fd0a-a55e-4b38-b4cd-193ad1c0b768",
                                      new Date(1553795410898L), null, "65a20758-03bd-433b-b371-0bbe3539a403",
                                      "f4624501-eeae-4740-b322-ee70939f59c1", "b67cfbad-4f9a-43cc-beb0-19dec78a4373",
                                      "a7ce0b96-2fae-4ae0-a9a7-dfa6197f85ac", new Date(1553795416158L),
                                      "fcdb2c9d-f4a8-4484-8d3c-26771489b70d", "332a82a8-8930-479e-ac9e-543af878069b",
                                      "e66555bb-2483-4edc-bb90-82684f483f1e", null, AccountMfaStatus.getDefault(), null,
                                      new ParentAccount(), "13056899-9ad0-424d-bb8c-3389f22e35be", new PasswordPolicy(),
                                      45, "8b56f8cb-d881-4d7d-9b07-c9416216bd65", null,
                                      "d9fe9e58-ec35-4016-8699-e0f27f18ce92", "9ac4b101-479c-4c6e-a72b-167c39c19ca9",
                                      "d9eee78c-17a8-40e1-aac9-1a9e78593bab", "ebd8c174-f4bb-4c69-a412-f8c850a1d86a",
                                      "532d7923-527c-40ca-81fc-08e71bff6010", AccountStatus.getDefault(),
                                      "6bbc19c2-2ec2-43b4-b53d-6486cbf8758f", "8926d116-7f49-4a7d-a17f-ef9de16ba8ad",
                                      new Date(1553795412495L), new Date(1553795414363L));
        assertTrue(account.isValid());
        Account accountInvalid = new Account("e67db38b-256d-4231-93e2-2f614c8d71ae",
                                             "1f6b7b9d-353c-47c2-943a-71eca8c03570",
                                             "70bc0f87-9b16-443c-a59b-d4c693160b78",
                                             "8ae49013-c2a8-4e53-850f-c976d2cf9b5d",
                                             "90774904-c6e0-4805-b375-fe4459719e67",
                                             "6fec5ce4-c306-46e5-a087-db912dcd733a",
                                             "b37b3fba-7212-44a8-adc3-11aa620044ef",
                                             "97b46a3d-c2e9-4fd3-b793-f3d2a5388593", null,
                                             "487d415e-1a06-4d8f-b3ec-311aea470dea",
                                             "81dc0a50-86a3-4ee1-bb70-e5fec371d1ce",
                                             "7951de05-39b0-4aa9-b392-5ff21fc7099f",
                                             "840ae682-2225-43ea-8049-8807795420ec",
                                             "30a1c078-77e3-4e70-a0fa-de43aa997f00", new Date(1553795410702L), null,
                                             "ef8fe99e-6df4-4790-868f-6d443336a9dd",
                                             "9f2aa966-b379-4833-9f0d-38ee70415283",
                                             "8a818045-520b-4c06-b979-0276742c782d", null, new Date(1553795413414L),
                                             "3418f8b5-e207-4036-af00-d24b448578b4",
                                             "5dff8316-2ba9-4de4-8dfe-3588400e1b40",
                                             "c806ab1e-96ab-4a40-8c49-49be8843c60d", null,
                                             AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                             "76a585d3-f1dd-4142-be7c-7ec8d23f8624", new PasswordPolicy(), 45 + 1,
                                             "6114e83f-4908-42b6-8c54-7cdb44885650", null,
                                             "491458b3-b61c-4b49-bc3e-f688159736e4",
                                             "031a969d-240e-4522-bab7-3aa509963f31",
                                             "e1eee18b-8aba-4548-807c-554dc6eb0ad5",
                                             "ca55454f-2b6b-4d89-8a4f-6edf4f26f501",
                                             "06c5cdc5-8ad1-4ca6-ac8c-c3a782e610c3", AccountStatus.getDefault(),
                                             "3567b29d-696c-412a-b5a0-a8cecc830684",
                                             "342040b3-6e34-4ba9-82b9-da8f82e628f9", new Date(1553795413229L),
                                             new Date(1553795413042L));
        assertFalse(accountInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Account account1 = new Account("0ea6ce09-b1e9-4311-aa9d-511d9418d777",
                                           "968b76ec-ee39-485d-bb8a-54b9554ca71e",
                                           "767a7ca9-559a-42b3-887c-599b7a86f2be",
                                           "28893090-d16c-4de6-a6bd-96968048bf94",
                                           "420d3d47-c273-4f52-abde-0bb99c2fb136",
                                           "870f7683-15d8-490c-8a75-c0ac389efd7c",
                                           "28ba9191-512b-4109-82a8-d4b380eb044d",
                                           "4e56d7d7-1ec1-473c-95fb-878207eac42b", null,
                                           "6613e7b0-f21c-4695-88a5-fcf8cf17836c",
                                           "a1536370-0a2e-4776-83dd-60d1ad3d26a0",
                                           "38d3f989-6ddc-48bd-8f67-cf074f7c1be3",
                                           "cac2e770-e11e-4c6c-b9fe-8e9f273e0950",
                                           "f86e3ead-0b7b-4f0e-adb6-1801fd666a16", new Date(1553795413132L), null,
                                           "a4353d49-8297-4400-ad01-91d8052bac71",
                                           "55b4d70e-7e69-4e08-8f88-69177dc23d37",
                                           "437bda1b-20b0-4c28-9ca9-003fb4a07351",
                                           "d6b58952-8faf-45a1-98dc-daa67d633012", new Date(1553795411991L),
                                           "2bf31c74-c71d-447d-82b0-0b33bcfdb79a",
                                           "4ddb5a4f-25b6-48e8-8e1a-52a415a75de0",
                                           "d780872f-87d7-4709-a256-c8617503fba8", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "9fee34ff-5777-4f84-bd12-2448452c6ae6",
                                           new PasswordPolicy(), 45, "d03173aa-81f8-4791-988f-2ee7ce2e8ae0", null,
                                           "c3b1704f-e5c6-40ee-9a9b-f9fe8bd286f5",
                                           "1915fd2e-06fb-47aa-801e-0f650ae0f653",
                                           "d183e18c-37c8-4b22-a55e-d0c10c2c4489",
                                           "33ee385a-fbb9-49b7-96e9-1df2824602d0",
                                           "08fff7b5-7983-46cc-936d-3e7ecbeac7ba", AccountStatus.getDefault(),
                                           "f449bb68-060a-49d4-b3c2-673f8fc7e286",
                                           "5e4b39ab-924d-461e-b520-ca7799d7067d", new Date(1553795414496L),
                                           new Date(1553795418704L));
            Account account2 = new Account("0ea6ce09-b1e9-4311-aa9d-511d9418d777",
                                           "968b76ec-ee39-485d-bb8a-54b9554ca71e",
                                           "767a7ca9-559a-42b3-887c-599b7a86f2be",
                                           "28893090-d16c-4de6-a6bd-96968048bf94",
                                           "420d3d47-c273-4f52-abde-0bb99c2fb136",
                                           "870f7683-15d8-490c-8a75-c0ac389efd7c",
                                           "28ba9191-512b-4109-82a8-d4b380eb044d",
                                           "4e56d7d7-1ec1-473c-95fb-878207eac42b", null,
                                           "6613e7b0-f21c-4695-88a5-fcf8cf17836c",
                                           "a1536370-0a2e-4776-83dd-60d1ad3d26a0",
                                           "38d3f989-6ddc-48bd-8f67-cf074f7c1be3",
                                           "cac2e770-e11e-4c6c-b9fe-8e9f273e0950",
                                           "f86e3ead-0b7b-4f0e-adb6-1801fd666a16", new Date(1553795413132L), null,
                                           "a4353d49-8297-4400-ad01-91d8052bac71",
                                           "55b4d70e-7e69-4e08-8f88-69177dc23d37",
                                           "437bda1b-20b0-4c28-9ca9-003fb4a07351",
                                           "d6b58952-8faf-45a1-98dc-daa67d633012", new Date(1553795411991L),
                                           "2bf31c74-c71d-447d-82b0-0b33bcfdb79a",
                                           "4ddb5a4f-25b6-48e8-8e1a-52a415a75de0",
                                           "d780872f-87d7-4709-a256-c8617503fba8", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "9fee34ff-5777-4f84-bd12-2448452c6ae6",
                                           new PasswordPolicy(), 45, "d03173aa-81f8-4791-988f-2ee7ce2e8ae0", null,
                                           "c3b1704f-e5c6-40ee-9a9b-f9fe8bd286f5",
                                           "1915fd2e-06fb-47aa-801e-0f650ae0f653",
                                           "d183e18c-37c8-4b22-a55e-d0c10c2c4489",
                                           "33ee385a-fbb9-49b7-96e9-1df2824602d0",
                                           "08fff7b5-7983-46cc-936d-3e7ecbeac7ba", AccountStatus.getDefault(),
                                           "f449bb68-060a-49d4-b3c2-673f8fc7e286",
                                           "5e4b39ab-924d-461e-b520-ca7799d7067d", new Date(1553795414496L),
                                           new Date(1553795418704L));
            Account account3 = new Account("f26e801c-29e4-4c76-9aff-cce276527ecb",
                                           "eb4fdc17-f6b1-49d0-8959-19050003c80f",
                                           "a15de867-59bf-4947-95c7-9e9b0f65bb7d",
                                           "c78e8e09-459d-4ec9-a8ff-1961a4277427",
                                           "dc400c5f-9a1b-4ace-a22c-51a39cf2610a",
                                           "7414e7ae-454a-4bfe-a064-27d682681dc7",
                                           "addb19ce-7314-4157-b0ab-85b00be74eef",
                                           "b7aa3756-5903-41d4-992f-c5f8678a94d7", null,
                                           "07479043-7c14-46ec-a4cb-5984a28154be",
                                           "8044ff16-bd60-4f7b-a584-babe435955df",
                                           "24bb5764-5234-425c-bbe3-469c882b3b45",
                                           "a5f84dbf-1892-4a4b-8716-24427d128d15",
                                           "cfaa9862-4bad-4507-926d-5c741dedf94a", new Date(1553795415260L), null,
                                           "158eb5aa-d10b-4fa7-8fa1-a84cb5bedb46",
                                           "05fcc04d-1577-47a4-8c88-98e7fc0a190c",
                                           "b8b82614-edab-432b-822e-72a30a72c175",
                                           "1e3a54c1-9500-4bdd-935a-af411670f070", new Date(1553795418663L),
                                           "fa97fd86-0084-4293-b841-8f499b5bb129",
                                           "c9438832-6da1-463a-9ea0-64a531e02706",
                                           "192dbced-5e06-45a4-9514-17f5feb681bc", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "6b3de973-47b6-4994-b8be-82a486f4d18f",
                                           new PasswordPolicy(), 1, "2a7abf20-03fd-43a8-ba34-e6961ca47aeb", null,
                                           "371ce0a3-ceb8-4da4-bc70-ff4099e5d266",
                                           "b53b1879-2cbd-4a9a-bca6-3547580929d8",
                                           "6345b3c8-5fe7-499f-bf97-e780ef250dcf",
                                           "a29bbafd-300c-4942-ad78-1d1dd4098f7e",
                                           "ec6b8a4a-12f8-49e6-bc7e-70d2fae7d5cb", AccountStatus.getDefault(),
                                           "928b2352-6398-40a5-a1df-099a8744aa40",
                                           "d86b8bc1-a1e2-4b65-839d-829a76d02007", new Date(1553795414013L),
                                           new Date(1553795417726L));
            assertNotNull(account1);
            assertNotNull(account2);
            assertNotNull(account3);
            assertNotSame(account2, account1);
            assertNotSame(account3, account1);
            assertEquals(account2, account1);
            assertEquals(account2, account1);
            assertEquals(account1, account2);
            assertEquals(account1, account1);
            assertFalse(account1.equals(null));
            assertNotEquals(account3, account1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
