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
            Account account1 = new Account("dbff95f7-14fe-4c09-a6b9-7f2e8cf9a9cf",
                                           "d4f37e58-af04-4d68-b238-8d187b2e1fd3",
                                           "ced6721e-9f7e-4e19-b2f9-4bdcbed58e6d",
                                           "33c4653d-b189-44d2-829d-7a41e7b30bfd",
                                           "d8ab28b2-f034-4b23-a082-d95aed5e42ab",
                                           "2fda6f57-8f11-49fc-8f2f-3422b9733e5a",
                                           "bc9e8cb5-0647-49d0-acfe-cb8038680529",
                                           "9d80345c-89f6-4f30-9e73-f051e2888af7", null,
                                           "7de1a1f3-fd5a-4ce3-8599-754b9d2e4f4c",
                                           "c793d414-32d0-48f7-bfa5-205adb9c6cfc",
                                           "423b3319-05cc-41ca-a411-31170f08c156",
                                           "66d7da82-2c70-4b46-8e08-748b58f97b70",
                                           "3132e645-57bc-4fb4-aee3-265462b31399", new Date(1552477765952L), null,
                                           "85531672-477c-47d8-a9ab-cb7fdadfdaf2",
                                           "745a5ebc-5931-441a-a4cd-b24099887752",
                                           "f2324f71-28ca-4fa4-916a-91e86267e187",
                                           "124bcc32-a22d-4ccc-9578-623dc3825bcc", new Date(1552477765366L),
                                           "c439cef0-78a4-482b-aaee-ad24cbcdfe2d",
                                           "539529d1-74f6-437d-907a-bbf6a13d3547",
                                           "9b255817-a984-4f84-a29b-5c407b390ac8", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "c0cec666-7c24-4edb-8ee1-0be441680cfc",
                                           new PasswordPolicy(), -121, "c56d9186-295c-42ad-8437-537faf12037d", null,
                                           "08cc1948-3261-43cb-93e1-8ba3f584ea52",
                                           "db314914-914f-4e38-b8ca-571780a04b95",
                                           "ba4ff03f-6fc1-43ca-868e-b9ef47132409",
                                           "6568014b-da70-493d-b2ab-d009d21eab48",
                                           "a18b357c-d3b3-4d44-9ad3-64f696148a26", AccountStatus.getDefault(),
                                           "9ce08130-b583-4a57-9ead-4d88485f46b3",
                                           "4a1c1d13-3871-4fd0-9e40-ba968650d28e", new Date(1552477763247L),
                                           new Date(1552477763758L));
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
            Account account1 = new Account("f88bc11d-18a7-40d3-a57b-a7e91087e6df",
                                           "c1cbc6a5-f0cc-4551-812e-e9558372a844",
                                           "34b63a4a-793a-47ea-b067-97899ec30459",
                                           "296c8190-3989-41fe-95b2-a40bc67a078c",
                                           "71ae463b-b1a1-458f-9aa0-de2d7323a4e0",
                                           "73a8425b-33c4-4337-8aac-b949d03c83c2",
                                           "ceedaeff-cef7-4a26-a206-5b45181eef48",
                                           "9284899c-ff60-46ec-b558-212ec504d64b", null,
                                           "a4ae1dd6-07ad-4166-9471-9e1e56036cd3",
                                           "a4bee596-e665-4750-b71b-b89c87a657ef",
                                           "929d75a5-8c2c-4d59-b157-261a7e1467cb",
                                           "f79208aa-251f-45a6-b70a-7a1fb643df4f",
                                           "ce1b23d1-b446-4e3d-8289-c62f9659096c", new Date(1552477763417L), null,
                                           "11c86f78-fd56-4623-bce8-e424359327dd",
                                           "9d648313-0cb8-406f-9bf8-412aab9d31ba",
                                           "2cffbfaa-b509-42ae-9199-557f0b4525d9",
                                           "5dcc3e92-c0b4-46e8-8916-110972c02a72", new Date(1552477764581L),
                                           "6464a67d-c75d-4759-9d10-376f2f7ad601",
                                           "021cf902-f957-405b-a22a-c6b7f8623482",
                                           "fd34098f-03cc-4c9a-b7e3-2a0dca5cb50e", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "c8a6f0b6-5f79-4df2-aa6b-19e89ee2a93a",
                                           new PasswordPolicy(), 28, "662e8a13-7c35-4b05-8679-6738dd0295a8", null,
                                           "857e46aa-e0e4-40a0-a1fc-ede4ec91c242",
                                           "9327b0fb-a888-45d1-bdeb-e4a52c8ad837",
                                           "f48f0c73-d4c7-4c0b-b3d5-c492df8311ce",
                                           "d574cbf4-f773-4046-87e1-880678f75857",
                                           "da400ea0-addf-4ded-a5cc-12540b22042c", AccountStatus.getDefault(),
                                           "5f7f3d0f-d561-4248-9b89-ee734103ea68",
                                           "4316effe-6e4a-456a-aa3d-53071fc136b4", new Date(1552477764351L),
                                           new Date(1552477757998L));
            Account account2 = new Account("f88bc11d-18a7-40d3-a57b-a7e91087e6df",
                                           "c1cbc6a5-f0cc-4551-812e-e9558372a844",
                                           "34b63a4a-793a-47ea-b067-97899ec30459",
                                           "296c8190-3989-41fe-95b2-a40bc67a078c",
                                           "71ae463b-b1a1-458f-9aa0-de2d7323a4e0",
                                           "73a8425b-33c4-4337-8aac-b949d03c83c2",
                                           "ceedaeff-cef7-4a26-a206-5b45181eef48",
                                           "9284899c-ff60-46ec-b558-212ec504d64b", null,
                                           "a4ae1dd6-07ad-4166-9471-9e1e56036cd3",
                                           "a4bee596-e665-4750-b71b-b89c87a657ef",
                                           "929d75a5-8c2c-4d59-b157-261a7e1467cb",
                                           "f79208aa-251f-45a6-b70a-7a1fb643df4f",
                                           "ce1b23d1-b446-4e3d-8289-c62f9659096c", new Date(1552477763417L), null,
                                           "11c86f78-fd56-4623-bce8-e424359327dd",
                                           "9d648313-0cb8-406f-9bf8-412aab9d31ba",
                                           "2cffbfaa-b509-42ae-9199-557f0b4525d9",
                                           "5dcc3e92-c0b4-46e8-8916-110972c02a72", new Date(1552477764581L),
                                           "6464a67d-c75d-4759-9d10-376f2f7ad601",
                                           "021cf902-f957-405b-a22a-c6b7f8623482",
                                           "fd34098f-03cc-4c9a-b7e3-2a0dca5cb50e", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "c8a6f0b6-5f79-4df2-aa6b-19e89ee2a93a",
                                           new PasswordPolicy(), 28, "662e8a13-7c35-4b05-8679-6738dd0295a8", null,
                                           "857e46aa-e0e4-40a0-a1fc-ede4ec91c242",
                                           "9327b0fb-a888-45d1-bdeb-e4a52c8ad837",
                                           "f48f0c73-d4c7-4c0b-b3d5-c492df8311ce",
                                           "d574cbf4-f773-4046-87e1-880678f75857",
                                           "da400ea0-addf-4ded-a5cc-12540b22042c", AccountStatus.getDefault(),
                                           "5f7f3d0f-d561-4248-9b89-ee734103ea68",
                                           "4316effe-6e4a-456a-aa3d-53071fc136b4", new Date(1552477764351L),
                                           new Date(1552477757998L));
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
        Account account = new Account("4e4c9418-5720-448d-a6e1-512659602e43", "37aab464-c669-4ff9-b467-e92ecd54106c",
                                      "2d6f8795-116f-4cc3-9e02-af2ede5055e7", "c4b6407b-af6d-41b5-98b3-5356c9488f78",
                                      "d9db77c7-a569-448b-a5ac-beda87d6893f", "8d9aee55-6872-41c4-aa6a-36f167b89a49",
                                      "6963ed34-b170-405a-a8f5-e4515d6df4ef", "da3f2c4f-bc52-47a9-9267-90f68b31e5a6",
                                      null, "95c3c0cf-7833-4456-b7df-fefe2b2815e1",
                                      "fd0209c4-571b-4b4c-8f78-5a938ea04314", "c56b49b8-f82d-4f50-8f03-283c2f9b287c",
                                      "77212b16-3a13-41e6-a916-ed8d1a037bff", "f5f90604-d6b4-4f7b-ae0c-808e95181fa2",
                                      new Date(1552477763405L), null, "f0ba0554-9d0a-43e0-a8bb-08fbcef07594",
                                      "287b1980-8423-461f-a806-a532b7a29467", "62634c65-ef04-4d0f-8611-8971fdfc4a63",
                                      "5cf8bbd5-0ea1-4584-9208-d75b0e414cab", new Date(1552477761645L),
                                      "6d4ffa87-0b44-4868-bfb3-5a9fe328c99e", "ca1b4c46-fb97-41d1-8263-2105711d8e80",
                                      "9d815db3-0b43-495b-ab3f-f674c270aac2", null, AccountMfaStatus.getDefault(), null,
                                      new ParentAccount(), "3bf7b8af-68b0-4dc7-85ad-724cb9700c5a", new PasswordPolicy(),
                                      43, "daf6e7b2-eba6-45b7-9852-0cb624583af6", null,
                                      "41f180ef-f4b4-4d57-a695-7d91f3359ce5", "d4c44ac7-3179-4039-a88c-fff854f6c15d",
                                      "78d53fa6-6933-4686-9b2f-cb1874a6a984", "3db75b04-94b4-4d27-9fa0-432e3ba09245",
                                      "8a8b674e-d8ef-42cd-bf11-603cb9462b91", AccountStatus.getDefault(),
                                      "1df4b589-828e-4f74-8905-a7583d95b449", "1d492070-3ab0-4bdf-bbcf-c7424cf4c2c1",
                                      new Date(1552477764988L), new Date(1552477762387L));
        assertTrue(account.isValid());
        Account accountInvalid = new Account("adb24ef9-5857-418f-b228-14db505737aa",
                                             "05ca128f-b859-4913-99c7-268dc2a90570",
                                             "30794006-7acc-4a7e-81d9-16c190c76550",
                                             "1aaefd06-5945-49d5-b24e-189a7789aef4",
                                             "92df4905-be25-45b7-95c7-5c1791c740bd",
                                             "3dccd2e9-2c3d-402f-82f0-ae1ff4e61a55",
                                             "68ff1a04-6594-46f9-9fd3-55bd45684cb2",
                                             "1534ea91-b878-4720-9f6f-6c331b63fcda", null,
                                             "10943262-602e-4158-8594-dcf95f7e8b8f",
                                             "a3bd4dae-0997-4b0a-9623-7a7fb4165502",
                                             "f7b2f66b-e18d-4d38-a3e6-4a69cee3c0d2",
                                             "c116dd8e-88d3-49b7-95a4-23296961887d",
                                             "bd17e860-d25f-40ff-a48a-b8cefa9519d7", new Date(1552477758129L), null,
                                             "571e8e1e-5936-4cf8-8233-d4c3de78f88b",
                                             "07f27780-cbfb-4fff-899c-151c0977b5c7",
                                             "23ca1880-760a-451d-881e-e7ec89211b83", null, new Date(1552477759608L),
                                             "6b44fce9-1e49-484a-9c71-eefab5713e3a",
                                             "33a1d9c0-cd95-40b9-86ce-0b1159583cba",
                                             "04f3ff58-011a-449b-ad89-945cd965abab", null,
                                             AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                             "927b001d-1e13-437d-8901-f22b84f737b5", new PasswordPolicy(), 48,
                                             "48509772-2637-40e9-871f-ab5d5868f502", null,
                                             "322c10a6-a8a1-466c-bb56-3303a9ee6630",
                                             "960805c0-c3ea-4cb2-b103-084a234bbdb5",
                                             "2512a4aa-b347-45d5-9834-ca8a2e94eb19",
                                             "38812765-0c7b-46d9-8c81-f2dff2613b1a",
                                             "593707a5-1bc1-4d4e-a3d7-563e82e7b36b", AccountStatus.getDefault(),
                                             "b7acb3ed-07bc-4eea-bd3d-f7b0c8f7ebf7",
                                             "48b7804d-d231-42a3-afc9-7d0fcdbade58", new Date(1552477766122L),
                                             new Date(1552477763376L));
        assertFalse(accountInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Account account1 = new Account("169d0205-ef8e-401c-ad11-52539ea84de6",
                                           "bfe0bfd3-e464-434c-8c41-4dfec252761b",
                                           "8e417c63-7a13-4ed5-ad90-32297ab61209",
                                           "557684d1-19b5-42c6-a318-1409f25d99d7",
                                           "4528f859-f97a-42ff-aa09-3c9c77ca9e52",
                                           "f40466b2-b6c4-45b9-885a-283b3f2dce8d",
                                           "8b362a1e-daa0-4587-884e-df178300e721",
                                           "505dd1b0-7886-448f-b29f-3d8fd1b45ceb", null,
                                           "5a76152b-8bd8-452f-bbbf-6a1b397b2e71",
                                           "e82e7459-2d92-4064-94d6-f521d27ca5e8",
                                           "00ecc783-4bcc-4175-9f79-d7be32334b33",
                                           "560530b4-ce1d-4e4d-b78f-6a378daafebc",
                                           "3ff133b5-f16a-4354-99ba-59f687e9cedc", new Date(1552477759834L), null,
                                           "ed4d9b5b-4a73-4f90-9550-ce850dad5c06",
                                           "f8478c12-3aae-44ac-a923-c5904a0b2454",
                                           "3a6a85f9-04da-43ed-a69b-65af4963fade",
                                           "6797519d-7a64-4d98-b0f6-9fbcebc646b8", new Date(1552477758079L),
                                           "b411ea4a-cd64-4ef7-b654-99672429cd2a",
                                           "645b337b-639b-4e20-9eff-e1ff1f5b0f64",
                                           "dbdf837f-1c40-4cd1-87db-485a94ba948d", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "e1f17946-f3fa-4608-8af1-62068abd301f",
                                           new PasswordPolicy(), -125, "e847320a-6e41-48bc-94b2-a372f1f51cca", null,
                                           "5bcf6f9f-1871-492f-b365-6befa2f826ac",
                                           "74bb07d0-a3d7-47cc-a35b-7cd2cb287b12",
                                           "f28c5bd2-f43b-4e77-8a19-bd55a49a54d4",
                                           "c98ba835-eb9c-473d-86f4-7134bc815d05",
                                           "664511fb-8991-4709-ab6b-ae6ada0a296c", AccountStatus.getDefault(),
                                           "b8c1bc05-b60c-450f-96c5-6315b95d11a3",
                                           "98d5b437-6daf-4f87-b77f-57fd90b1cfec", new Date(1552477762968L),
                                           new Date(1552477764086L));
            Account account2 = new Account("169d0205-ef8e-401c-ad11-52539ea84de6",
                                           "bfe0bfd3-e464-434c-8c41-4dfec252761b",
                                           "8e417c63-7a13-4ed5-ad90-32297ab61209",
                                           "557684d1-19b5-42c6-a318-1409f25d99d7",
                                           "4528f859-f97a-42ff-aa09-3c9c77ca9e52",
                                           "f40466b2-b6c4-45b9-885a-283b3f2dce8d",
                                           "8b362a1e-daa0-4587-884e-df178300e721",
                                           "505dd1b0-7886-448f-b29f-3d8fd1b45ceb", null,
                                           "5a76152b-8bd8-452f-bbbf-6a1b397b2e71",
                                           "e82e7459-2d92-4064-94d6-f521d27ca5e8",
                                           "00ecc783-4bcc-4175-9f79-d7be32334b33",
                                           "560530b4-ce1d-4e4d-b78f-6a378daafebc",
                                           "3ff133b5-f16a-4354-99ba-59f687e9cedc", new Date(1552477759834L), null,
                                           "ed4d9b5b-4a73-4f90-9550-ce850dad5c06",
                                           "f8478c12-3aae-44ac-a923-c5904a0b2454",
                                           "3a6a85f9-04da-43ed-a69b-65af4963fade",
                                           "6797519d-7a64-4d98-b0f6-9fbcebc646b8", new Date(1552477758079L),
                                           "b411ea4a-cd64-4ef7-b654-99672429cd2a",
                                           "645b337b-639b-4e20-9eff-e1ff1f5b0f64",
                                           "dbdf837f-1c40-4cd1-87db-485a94ba948d", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "e1f17946-f3fa-4608-8af1-62068abd301f",
                                           new PasswordPolicy(), -125, "e847320a-6e41-48bc-94b2-a372f1f51cca", null,
                                           "5bcf6f9f-1871-492f-b365-6befa2f826ac",
                                           "74bb07d0-a3d7-47cc-a35b-7cd2cb287b12",
                                           "f28c5bd2-f43b-4e77-8a19-bd55a49a54d4",
                                           "c98ba835-eb9c-473d-86f4-7134bc815d05",
                                           "664511fb-8991-4709-ab6b-ae6ada0a296c", AccountStatus.getDefault(),
                                           "b8c1bc05-b60c-450f-96c5-6315b95d11a3",
                                           "98d5b437-6daf-4f87-b77f-57fd90b1cfec", new Date(1552477762968L),
                                           new Date(1552477764086L));
            Account account3 = new Account("df87aa6f-192e-4008-9b31-abd202ff48f4",
                                           "11dbb1c3-415f-4ba4-a491-913828db3926",
                                           "c234c07f-a6ee-4601-94de-48b94fbc50fb",
                                           "3ecdca80-074f-46de-bddd-c15c8d6e0acf",
                                           "f12dcea2-0b19-492f-aee8-82df125a5b06",
                                           "068904b3-a9b4-4323-8a77-661d3e3f11a0",
                                           "13878675-210c-4785-afe7-d389f4386782",
                                           "3dd85e5c-f132-4163-a31e-a95fe04c6657", null,
                                           "743cdff6-96a9-4224-aecd-68ec442762b7",
                                           "0bcb3255-f79c-4f4d-8e34-e7cbe7de8306",
                                           "e16c3532-51e8-4b51-afe6-56b96c2c47bc",
                                           "e441324d-974b-482f-bcf4-bf6fc699c5d4",
                                           "eae637db-c2e7-42e1-a8fb-a1320983d598", new Date(1552477759339L), null,
                                           "a8050a89-d9f9-49de-a614-4b8d0ea000d8",
                                           "74196638-b612-49d1-b6fd-10915882f00d",
                                           "2b223d7c-b817-4201-91d6-208ac7614ccc",
                                           "3abcc511-435f-43d0-bf21-fdacfbd2a0eb", new Date(1552477761721L),
                                           "df12f4d2-fed8-4cfe-8cc5-fd2f30efb3a5",
                                           "cb4036cb-e1d3-4eb4-a7f3-239662163c89",
                                           "27d9b57a-eb73-4904-8f41-9a9217975568", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "1dd67230-8fe3-4ae2-be12-f83d0bfa9b27",
                                           new PasswordPolicy(), 32, "c177c16c-91f3-4ec4-8c80-e29c191577dc", null,
                                           "3494428b-64fb-4efc-a374-0222a9ebbd97",
                                           "4030117a-49d9-4b5a-886d-7b6dc482da85",
                                           "e6b23b15-276b-40bf-a764-a7a70993a783",
                                           "a2792999-d2d1-48b6-af4b-bcea7a3146c6",
                                           "a55a4332-2e5d-47d1-8c12-4c46878a977f", AccountStatus.getDefault(),
                                           "63db5003-8895-4a7a-895d-b604e222385c",
                                           "3cdda480-40ed-4dc1-9edf-3c8b06ed7f7f", new Date(1552477766761L),
                                           new Date(1552477762597L));
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
