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
            Account account1 = new Account("1bd604c3-921f-44ee-9012-d90b24f54122",
                                           "3362e343-d111-4b82-b332-2e163b183de5", "f7917.13f72@16f85.me",
                                           "a798c340-182c-4762-b5a8-4800e2dc78b5", "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           "b90e454c-6493-4810-ad3f-f55ea4184ffd",
                                           "ea277812-9c20-402b-9f20-6b001af380b6",
                                           "9666c9d8-e750-49c4-8703-490689db8d86", null,
                                           "1f44eb24-df7c-43db-adb6-329e62dfd0cb",
                                           "757d488b-b8d3-4582-bb42-b34763e8a2fa",
                                           "d73f17e0-9ee6-4efd-9eba-457152fe5e20",
                                           "b3d3aa46-4918-41f0-b271-d6bd7b9ba829",
                                           "ed78974e-034a-427a-b64a-e2c5c8d81e58", new Date(1561379517043L), null,
                                           "5ba13b84-8eb7-4be4-a697-f8eece1c1e17",
                                           "a53a3c6e-5cc6-4a4d-9710-d095438d4872", "ed3f4.6b52e@f3112.fr",
                                           "0dfe7c2d-726d-4248-acb9-7862a5c8c273", new Date(1561379512248L), 1,
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", 120, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           new PasswordPolicy(), 1, "2ebf07c4-5175-47e0-b5f5-34dd78921a78", null,
                                           "3e4ae75c-77b9-4c69-8a51-239c917113f1",
                                           "89a7f532-1b05-43f4-bd2f-51bd5fa8d8bf",
                                           "608d79d0-f371-4ce3-b43f-4fd59c56503e", "404eb.872c5@48352.fr",
                                           "8209cf01-fcd8-4fdf-b532-f01210292f0e", AccountStatus.getDefault(),
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", "abbbbffb-f1f8-49d0-bd20-0d4e5241f258",
                                           new Date(1561379516119L), new Date(1561379517516L));
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
            Account account1 = new Account("b1f93ee3-6e59-4656-9460-fcbac83b954e",
                                           "f18a6302-0945-46f5-999d-882f88fa7f30", "bd3c0.9e9a5@39cf8.fr",
                                           "a2362dc1-657e-42dd-a370-1bbae470abe7", "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           "ff65886f-6f54-467c-a409-d40cdcf20d1f",
                                           "3bc50703-f696-4e51-b543-29c5f0e10bd2",
                                           "7f46783e-f2da-4fc7-b00e-6111a231fcd8", null,
                                           "c3ea311d-ea19-4356-b184-73cf44f00207",
                                           "c4e33ebf-a9e5-4be3-ac12-18aa9b4ed03c",
                                           "5158d1d8-4708-4d18-a83f-a088d67defb7",
                                           "376018c7-31b6-4800-b700-ccc6d2ad346f",
                                           "d2e7bae3-ef47-4fcf-8142-43e3e05d1bed", new Date(1561379512878L), null,
                                           "bbe40384-efa9-414b-ace4-2ff75f330d80",
                                           "bd927c83-7e50-4eaf-b8b4-5e27cae5b960", "3b7ff.9d6a7@7907f.fr",
                                           "377ff1f0-dcc6-4a69-892d-af60ddaaff25", new Date(1561379516736L), 1,
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", 1, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           new PasswordPolicy(), 1, "2e94701c-1839-4173-a400-4505c28e6d99", null,
                                           "7cf2a5f5-c9f3-41f4-b826-65253f1b4d97",
                                           "26bcdb9f-3c31-445e-9044-b01c81f7b9ff",
                                           "a82630dc-3db4-48ba-b052-27f20824e0a2", "2ac64.ffab2@5de91.me",
                                           "2bf03cbd-8443-43d2-812e-d34378279177", AccountStatus.getDefault(),
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", "395da49e-d755-4a4f-9a19-f64e7c03ab53",
                                           new Date(1561379512323L), new Date(1561379517639L));
            Account account2 = new Account("b1f93ee3-6e59-4656-9460-fcbac83b954e",
                                           "f18a6302-0945-46f5-999d-882f88fa7f30", "bd3c0.9e9a5@39cf8.fr",
                                           "a2362dc1-657e-42dd-a370-1bbae470abe7", "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           "ff65886f-6f54-467c-a409-d40cdcf20d1f",
                                           "3bc50703-f696-4e51-b543-29c5f0e10bd2",
                                           "7f46783e-f2da-4fc7-b00e-6111a231fcd8", null,
                                           "c3ea311d-ea19-4356-b184-73cf44f00207",
                                           "c4e33ebf-a9e5-4be3-ac12-18aa9b4ed03c",
                                           "5158d1d8-4708-4d18-a83f-a088d67defb7",
                                           "376018c7-31b6-4800-b700-ccc6d2ad346f",
                                           "d2e7bae3-ef47-4fcf-8142-43e3e05d1bed", new Date(1561379512878L), null,
                                           "bbe40384-efa9-414b-ace4-2ff75f330d80",
                                           "bd927c83-7e50-4eaf-b8b4-5e27cae5b960", "3b7ff.9d6a7@7907f.fr",
                                           "377ff1f0-dcc6-4a69-892d-af60ddaaff25", new Date(1561379516736L), 1,
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", 1, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           new PasswordPolicy(), 1, "2e94701c-1839-4173-a400-4505c28e6d99", null,
                                           "7cf2a5f5-c9f3-41f4-b826-65253f1b4d97",
                                           "26bcdb9f-3c31-445e-9044-b01c81f7b9ff",
                                           "a82630dc-3db4-48ba-b052-27f20824e0a2", "2ac64.ffab2@5de91.me",
                                           "2bf03cbd-8443-43d2-812e-d34378279177", AccountStatus.getDefault(),
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", "395da49e-d755-4a4f-9a19-f64e7c03ab53",
                                           new Date(1561379512323L), new Date(1561379517639L));
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
        Account account = new Account("923f9e9e-6bf1-4050-b23c-ce45835b9df4", "df7ad622-5b56-4211-aa53-7bf84fec70a0",
                                      "f0561.01dc7@d3e32.me", "14aa5e6a-e976-4334-b0d0-482609136e16",
                                      "d352a55a4f9dba6e0ef7ddad0a227bef", "bf7b9b02-4e9b-4d5a-9fa3-84fffd9b6ba0",
                                      "f02e76b1-bd87-4721-8413-dac8cb6da227", "ec70c73b-ea13-4d91-a454-f661a4c51a15",
                                      null, "6037ac0b-1489-48ad-972d-6afc2ed2f1db",
                                      "ffd08dc1-fdb2-41be-9e83-46a118459265", "5a9cb36e-6b8b-428f-91c9-c2fbd2c766ef",
                                      "da3bedfb-01cb-4954-9ba8-91ae5e06678b", "95210e21-9691-462a-a366-c45c632eae4a",
                                      new Date(1561379516096L), null, "4ff2122e-bcb9-4fec-826b-08b339de0994",
                                      "44b530fb-5b70-418f-aa44-0cb74c25f528", "102a7.c6507@0d577.fr",
                                      "cd0d786b-dcc2-42dd-b282-92976f483414", new Date(1561379512470L), 1,
                                      "d352a55a4f9dba6e0ef7ddad0a227bef", 120, null, AccountMfaStatus.getDefault(),
                                      null, new ParentAccount(), "d352a55a4f9dba6e0ef7ddad0a227bef",
                                      new PasswordPolicy(), 45, "68c99815-fd2a-475c-b247-2ca86b47d75e", null,
                                      "013fdf36-4ef3-4f64-9c5f-04ba89677e01", "b4e60d03-b4f2-4272-9e04-5d91df05a8cd",
                                      "f6acd90b-80be-41cb-8784-a8fd89c2a2d6", "96cdc.8f6a5@fc6b0.me",
                                      "512a0043-5255-4bb1-b1cc-1cf9ce62ded2", AccountStatus.getDefault(),
                                      "d352a55a4f9dba6e0ef7ddad0a227bef", "a692bff2-fa63-40df-b110-d15e932c5b85",
                                      new Date(1561379516473L), new Date(1561379519393L));
        assertTrue(account.isValid());
        Account accountInvalid = new Account("ac60e090-3573-4764-a00c-29339b4c318729dfb44f-bbf2-4c5d-a31d-b3267f3d69d60495af6e-8b34-4533-b0f1-79efbad0a3c0",
                                             "12e40eb9-1b93-41c9-a09d-d701cfd56ce5748688b9-d507-44d2-b694-fe4b493c7765857a9fe2-5141-49ef-982e-97d7fad3751e",
                                             "'㩨瀼ഫ>㵿篨讴鈙>?蟌\u001728觼湶ഔ葬!�?>\u0013ﶀ>�?�셂૜�?输\u0010곡\u001a\u0001Ꜫ6!�?�\u0019葤汽ಋ\u0007\u00123Р�?�3>꼖�?墜2礑\u0012\u000eՉꛋ1轪Ϩ襓᎒",
                                             "808e8375-a221-4943-9768-3ac3bb95b7e8510ef56e-ae82-4cd7-9af4-f1896ef0c8584085f09d-6023-4595-a656-86ccd5c7af28",
                                             "1<Q\u0003811ℎc81\u0001]1\u00188c⪀B1cc$$ꌼ;㼊᡺1W\u00111c11.8^11c8\u0014\u00128�?�K\u0012c18@P\u000bccc1)?88",
                                             "8f3b3a4c-2b15-43d6-8830-664baa4ef5ed",
                                             "8aaa3b04-6dc3-4fbb-8b49-632c378d8162ba5f1777-764b-413b-b025-15c1331d01920a164bad-44d3-433b-8ce7-672956655ef4",
                                             "363bec9c-2584-4720-878a-16f4c5c57fb0", null,
                                             "036099d8-76e5-4904-a90b-26e379c324ecc56563a3-4a5c-4763-aef9-686bdc6432088e667d5c-20b1-460c-8a08-a590a68baa58",
                                             "7af044ec-4974-4bda-b4c2-f2d720a7b5b07a5ea67e-3e2b-45e1-b555-42aa9e8c53713f63d288-6c04-4662-93ef-3da3cade1bc0",
                                             "b0507b2e-f393-4e25-ad5c-3b0e32442ed781f8c33d-5a5a-4134-83fb-fbd3a346d1fdf4e43736-24b1-40dd-9677-bd585c68c75b",
                                             "34997a4c-6a50-44d3-9a54-fde0c4f145de",
                                             "e7bea95b-7733-44e6-a0e4-c2f54fd391f3b57ce0a5-a55b-4b92-85be-7b171f07986f3ed0b2e5-3685-4c60-a3d9-d35c641cd17c",
                                             new Date(1561379514979L), null, "c07de204-34cc-4d91-a3e4-576d7eb83507",
                                             "c51157db-27d4-47cb-be54-befa9a876a2995c2edc2-1b8f-4f77-b50d-bdaf9bd1fd63af656db6-f4c1-45c7-8303-5c4cafabb3d4",
                                             "'㩨瀼ഫ>㵿篨讴鈙>?蟌\u001728觼湶ഔ葬!�?>\u0013ﶀ>�?�셂૜�?输\u0010곡\u001a\u0001Ꜫ6!�?�\u0019葤汽ಋ\u0007\u00123Р�?�3>꼖�?墜2礑\u0012\u000eՉꛋ1轪Ϩ襓᎒",
                                             null, new Date(1561379515506L), 180 + 1,
                                             "1<Q\u0003811ℎc81\u0001]1\u00188c⪀B1cc$$ꌼ;㼊᡺1W\u00111c11.8^11c8\u0014\u00128�?�K\u0012c18@P\u000bccc1)?88",
                                             120 + 1, null, AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                             "1<Q\u0003811ℎc81\u0001]1\u00188c⪀B1cc$$ꌼ;㼊᡺1W\u00111c11.8^11c8\u0014\u00128�?�K\u0012c18@P\u000bccc1)?88",
                                             new PasswordPolicy(), 45 + 1,
                                             "aeba3a56-2f7c-4fb8-a2ce-5438901b18152b1f450d-d119-45ed-95e3-be530ab5636f748c8d4e-beba-4299-970e-0387f122ece0",
                                             null,
                                             "f4f25aff-8c6f-462b-a26e-02a94a2522c1603bed0d-42b9-429f-a902-e772c976a56164ca64cf-c146-40a8-9427-c378bfff2205",
                                             "7d9da918-26a8-420c-9a8b-fedc5766025b",
                                             "25c37b5a-71fc-4b18-bd3a-863c01b54258",
                                             "'㩨瀼ഫ>㵿篨讴鈙>?蟌\u001728觼湶ഔ葬!�?>\u0013ﶀ>�?�셂૜�?输\u0010곡\u001a\u0001Ꜫ6!�?�\u0019葤汽ಋ\u0007\u00123Р�?�3>꼖�?墜2礑\u0012\u000eՉꛋ1轪Ϩ襓᎒",
                                             "10979e85-5ccf-4eb9-8c95-f5498e415a846e2ae47f-ac43-468b-8f65-f55451546294780b4d4b-74f1-4c80-ad63-5b1542363eed",
                                             AccountStatus.getDefault(),
                                             "1<Q\u0003811ℎc81\u0001]1\u00188c⪀B1cc$$ꌼ;㼊᡺1W\u00111c11.8^11c8\u0014\u00128�?�K\u0012c18@P\u000bccc1)?88",
                                             "071d0183-8091-4ec5-ba91-f2738f9b7d93", new Date(1561379513203L),
                                             new Date(1561379513660L));
        assertFalse(accountInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Account account1 = new Account("2efca785-d40b-4e28-a462-2cefd13bf4ea",
                                           "35722bf5-c3e0-4457-8788-1a6a9a17f855", "e2e2a.6ea07@46542.me",
                                           "683ebbc7-0374-4931-a690-70beeb261940", "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           "e25f1745-1460-454c-89cb-50d06975d2fc",
                                           "0dde8194-2e8f-40cf-8eca-b2ec2610c200",
                                           "af436664-6c47-48f3-b2fb-950de31a8a4a", null,
                                           "5ab44eba-c343-4cda-889f-5f707040d0c6",
                                           "10d8c6f2-7343-4837-b81f-e291405db1f8",
                                           "0c3f53c1-2b64-41ae-ba70-e3dd1eceb7a1",
                                           "a7d72133-7168-42c8-b82a-5d5abe1646bb",
                                           "ae9d0e56-e786-4338-93f9-34cccc605a54", new Date(1561379515706L), null,
                                           "fffe2aa8-123a-4387-9e3b-c32d162155a0",
                                           "df19c9ae-ec0b-44d9-8752-1214b316a6fe", "983ae.b2d1e@6cd38.me",
                                           "ec669780-d6db-4f65-8326-978ca3364a5b", new Date(1561379518154L), 68,
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", 50, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           new PasswordPolicy(), 45, "81abe20b-075a-40c5-8b4c-a794f6c708a4", null,
                                           "75eb4606-d6b8-4545-b84d-824b993eae5c",
                                           "6d5b8f99-95a7-4ab2-b885-57b821e486f6",
                                           "f2f2b9ed-99fc-4448-a492-0896c1897528", "b25df.c62d9@af01f.fr",
                                           "3e02583b-a1a5-45b7-bca6-af3423b535c1", AccountStatus.getDefault(),
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", "755bc4da-0564-49ab-8293-ca3ab106d918",
                                           new Date(1561379516583L), new Date(1561379520513L));
            Account account2 = new Account("2efca785-d40b-4e28-a462-2cefd13bf4ea",
                                           "35722bf5-c3e0-4457-8788-1a6a9a17f855", "e2e2a.6ea07@46542.me",
                                           "683ebbc7-0374-4931-a690-70beeb261940", "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           "e25f1745-1460-454c-89cb-50d06975d2fc",
                                           "0dde8194-2e8f-40cf-8eca-b2ec2610c200",
                                           "af436664-6c47-48f3-b2fb-950de31a8a4a", null,
                                           "5ab44eba-c343-4cda-889f-5f707040d0c6",
                                           "10d8c6f2-7343-4837-b81f-e291405db1f8",
                                           "0c3f53c1-2b64-41ae-ba70-e3dd1eceb7a1",
                                           "a7d72133-7168-42c8-b82a-5d5abe1646bb",
                                           "ae9d0e56-e786-4338-93f9-34cccc605a54", new Date(1561379515706L), null,
                                           "fffe2aa8-123a-4387-9e3b-c32d162155a0",
                                           "df19c9ae-ec0b-44d9-8752-1214b316a6fe", "983ae.b2d1e@6cd38.me",
                                           "ec669780-d6db-4f65-8326-978ca3364a5b", new Date(1561379518154L), 68,
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", 50, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           new PasswordPolicy(), 45, "81abe20b-075a-40c5-8b4c-a794f6c708a4", null,
                                           "75eb4606-d6b8-4545-b84d-824b993eae5c",
                                           "6d5b8f99-95a7-4ab2-b885-57b821e486f6",
                                           "f2f2b9ed-99fc-4448-a492-0896c1897528", "b25df.c62d9@af01f.fr",
                                           "3e02583b-a1a5-45b7-bca6-af3423b535c1", AccountStatus.getDefault(),
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", "755bc4da-0564-49ab-8293-ca3ab106d918",
                                           new Date(1561379516583L), new Date(1561379520513L));
            Account account3 = new Account("c56bdcc4-fe06-41db-b07c-3b365229a6de",
                                           "19b18062-f585-45bd-b8e5-f5f365faafe2", "29578.a7805@f2ef9.fr",
                                           "9c6575ee-9242-4d4b-91a9-eacbf0b5385d", "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           "47249cbf-b568-4585-965b-f2612fada0ed",
                                           "86cbc734-6944-45d8-b2dd-0612669c7e90",
                                           "58442c3d-7239-4d20-83ac-efe185046d87", null,
                                           "d86fbd29-24df-4e5f-89f1-ebb9f00515e6",
                                           "8a660aa5-1f5a-4634-9dc1-77ce3c6622b2",
                                           "b693760f-cb5a-4df6-a31e-213051bb6d1f",
                                           "3e764f4b-c63e-4a79-b321-bfcfc7bbe566",
                                           "a6015ac7-c4b2-4267-823a-4aac3b5c53c6", new Date(1561379519695L), null,
                                           "588396f5-aa8b-4971-ac06-c0344e4775f9",
                                           "12f9658a-4210-47c3-ac2f-f8a320a23698", "aaf0e.84dac@3c836.fr",
                                           "3611d495-2cde-496f-bf1c-2090f6ef9c5e", new Date(1561379514306L), 19,
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", 1, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "d352a55a4f9dba6e0ef7ddad0a227bef",
                                           new PasswordPolicy(), 42, "6dce0ff8-5afb-407b-b4fa-187bdc46487f", null,
                                           "96319968-4460-4290-9532-b91c9216ea9d",
                                           "7c95da1b-2353-4b17-bbb5-396f73aa9ba1",
                                           "40e24fb1-1d34-4ab6-a767-5f532c24892e", "07e01.c889d@c189a.me",
                                           "e81267dc-d121-4629-a75b-2f4fd328a13e", AccountStatus.getDefault(),
                                           "d352a55a4f9dba6e0ef7ddad0a227bef", "03faa990-3561-4774-b2ab-eba3a4592e87",
                                           new Date(1561379517685L), new Date(1561379512212L));
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
