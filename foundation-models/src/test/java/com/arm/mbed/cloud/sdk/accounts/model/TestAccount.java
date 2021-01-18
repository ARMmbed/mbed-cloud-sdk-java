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
            Account account1 = new Account("e36646f2-8171-4d5a-b131-fb79c9fc96b5",
                                           "78411e92-9a0f-4103-b3d0-935de653abcb", "a6a57.0b8b6@006f3.me",
                                           "b107cc29-0423-42b0-9333-5986bd694d13", "3b2c98a6b0d3341e5184f0f766dde798",
                                           "dc218b62-5a11-4a5d-8604-72297c1c9a10",
                                           "b2950311-f93a-4f6a-b262-a64768a2a082",
                                           "0e68a726-8b05-47ae-b2fd-214ba3a2ae13", null,
                                           AccountBusinessModel.getDefault(), null,
                                           "15149517-be60-41bd-a0c8-4c96e16ba3b8",
                                           "b30ea2eb-3ffc-455a-8a3b-a8dfdf89a21f",
                                           "b2964ba7-189b-41a4-b863-9bd68498f7f4",
                                           "f02ffe94-75fc-4f68-b61a-47e63ad4c1ac",
                                           "c303b883-f4b5-4113-a883-0f065de7c3ff", new Date(1610683992052L), null,
                                           "c1c6af8b-83fb-4ff4-8698-f7810725a59b",
                                           "67fc2ecc-a7f4-4ed1-b556-252eef354973", "53333.944d0@9d1ba.fr",
                                           "bc78ef1a-0e6e-4ac4-9292-ca0da504fc6d", new Date(1610683989446L), 1,
                                           "3b2c98a6b0d3341e5184f0f766dde798", 1, null, null,
                                           AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", new PasswordPolicy(), 1,
                                           "29f7d514-925d-40d0-a596-fc67bc62e1b6", null,
                                           "d9265984-c8cd-4bb9-85df-7143624519a2",
                                           "f7406665-fca8-40b6-b052-9248da587a23",
                                           "2810ec41-4767-48a2-a297-fa482f2b2dfe", "fe89d.616d1@29884.me",
                                           "e71c1ebd-d791-4cf5-9727-48bf311a0dbf", AccountStatus.getDefault(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", "ed854683-dec7-4036-82a2-9f79c85edc7a",
                                           null, new Date(1610683986576L), new Date(1610683991844L));
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
            Account account1 = new Account("3d2e1d86-1369-45f8-b82a-4136858048fa",
                                           "eec31ba0-0efc-4352-92fa-84e60cfd48f2", "fa2ce.9fb01@7fc3c.me",
                                           "d707c9ef-2b3a-4e02-bc48-63ee5640c90d", "3b2c98a6b0d3341e5184f0f766dde798",
                                           "c0429679-a1fa-41f8-9786-b1e6e777c953",
                                           "5cb9ed58-89fc-425a-9bd0-f449505925ee",
                                           "24439b1c-c2a6-4b5c-8286-76e6924ee0a7", null,
                                           AccountBusinessModel.getDefault(), null,
                                           "ddb67afd-6baf-4667-aff1-54944fad8cf2",
                                           "6308f4a8-fdee-4a86-a88e-c7e6e5383994",
                                           "6643867c-cd91-47c2-975e-8625932e9a7c",
                                           "722f9487-a9b5-476d-a44b-611bfff78abe",
                                           "4a85fbf9-4fd3-4707-86b4-f99c2fa6530f", new Date(1610683992939L), null,
                                           "0567249d-4d59-4dc5-b5aa-49d7dbac5a5b",
                                           "5ebb6bc8-159c-4b32-8b11-002b24a46e3f", "577ba.b6367@4be8e.fr",
                                           "52cd380a-eb02-4fbf-bfa4-f652d4e53771", new Date(1610683986237L), 39,
                                           "3b2c98a6b0d3341e5184f0f766dde798", 1, null, null,
                                           AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", new PasswordPolicy(), 4,
                                           "b259845a-c419-4d69-9698-abee432b2722", null,
                                           "00acb061-81a4-499b-a110-64ee67c0cff8",
                                           "1c58f0e6-49e7-4401-a7c1-19e273c92eb4",
                                           "f04a2551-769b-4966-9a20-6356fde02cb7", "da24d.95db7@1c383.fr",
                                           "9e3c1199-1e65-4f02-bc49-4e396b2e0273", AccountStatus.getDefault(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", "3dddfbb3-ac05-4dd5-8769-023cac30ec11",
                                           null, new Date(1610683988145L), new Date(1610683989061L));
            Account account2 = new Account("3d2e1d86-1369-45f8-b82a-4136858048fa",
                                           "eec31ba0-0efc-4352-92fa-84e60cfd48f2", "fa2ce.9fb01@7fc3c.me",
                                           "d707c9ef-2b3a-4e02-bc48-63ee5640c90d", "3b2c98a6b0d3341e5184f0f766dde798",
                                           "c0429679-a1fa-41f8-9786-b1e6e777c953",
                                           "5cb9ed58-89fc-425a-9bd0-f449505925ee",
                                           "24439b1c-c2a6-4b5c-8286-76e6924ee0a7", null,
                                           AccountBusinessModel.getDefault(), null,
                                           "ddb67afd-6baf-4667-aff1-54944fad8cf2",
                                           "6308f4a8-fdee-4a86-a88e-c7e6e5383994",
                                           "6643867c-cd91-47c2-975e-8625932e9a7c",
                                           "722f9487-a9b5-476d-a44b-611bfff78abe",
                                           "4a85fbf9-4fd3-4707-86b4-f99c2fa6530f", new Date(1610683992939L), null,
                                           "0567249d-4d59-4dc5-b5aa-49d7dbac5a5b",
                                           "5ebb6bc8-159c-4b32-8b11-002b24a46e3f", "577ba.b6367@4be8e.fr",
                                           "52cd380a-eb02-4fbf-bfa4-f652d4e53771", new Date(1610683986237L), 39,
                                           "3b2c98a6b0d3341e5184f0f766dde798", 1, null, null,
                                           AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", new PasswordPolicy(), 4,
                                           "b259845a-c419-4d69-9698-abee432b2722", null,
                                           "00acb061-81a4-499b-a110-64ee67c0cff8",
                                           "1c58f0e6-49e7-4401-a7c1-19e273c92eb4",
                                           "f04a2551-769b-4966-9a20-6356fde02cb7", "da24d.95db7@1c383.fr",
                                           "9e3c1199-1e65-4f02-bc49-4e396b2e0273", AccountStatus.getDefault(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", "3dddfbb3-ac05-4dd5-8769-023cac30ec11",
                                           null, new Date(1610683988145L), new Date(1610683989061L));
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
        Account account = new Account("125c7a36-fd4c-40eb-aa84-de840254407b", "7b08eece-a2c1-466a-990e-55369026e2de",
                                      "e2890.49f03@9671e.me", "61005219-27cd-4360-ab46-089840477674",
                                      "3b2c98a6b0d3341e5184f0f766dde798", "e7293cee-dc2f-4a0a-8120-cb65306df334",
                                      "b3d1fca4-5caa-4817-81dd-77d869430217", "622cf54b-c3b1-40fa-baf1-96c0d63742fc",
                                      null, AccountBusinessModel.getDefault(), null,
                                      "00f4f6c6-8c83-4c2b-9127-2d8ede649b84", "201e6720-0646-4196-8644-bbc150b7488d",
                                      "b5bdcb3d-5022-401f-a623-2b673cd43998", "b7422f7f-ef23-4eaf-bc99-b6b57aca4c50",
                                      "22a2ed25-681b-4adc-879d-a0e5f77fe946", new Date(1610683991912L), null,
                                      "070657a0-38ab-4b60-87b9-70a19d8b4ef7", "4faf4463-6ead-42c6-87e3-b5549430aa73",
                                      "fb738.edf67@3ad76.me", "120a779b-6f54-4ddd-9273-1b0a51c03bc0",
                                      new Date(1610683985008L), 1, "3b2c98a6b0d3341e5184f0f766dde798", 1, null, null,
                                      AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                      "3b2c98a6b0d3341e5184f0f766dde798", new PasswordPolicy(), 1,
                                      "cf6ac7da-c0a7-4f30-9317-3c3f3ac51c0a", null,
                                      "ba8bc423-d341-4a4c-a669-13ba35da4352", "b133fe38-35b6-4fab-a165-b371cfab1416",
                                      "6247f686-6f45-44cc-aea7-faf204ab57aa", "dcf99.af15d@35ec8.me",
                                      "609a0f14-1750-4fc3-b810-2a2bc5aa82b8", AccountStatus.getDefault(),
                                      "3b2c98a6b0d3341e5184f0f766dde798", "0207ad80-e372-4338-82fd-0e22034921fc", null,
                                      new Date(1610683993749L), new Date(1610683986705L));
        assertTrue(account.isValid());
        Account accountInvalid = new Account("7cdb8b7e-f31e-4227-a535-f72bb7fc39b6a2d4e99d-64f6-4f4e-a4e7-bad1dd8234da2ababcb0-d0c5-4a9c-bb92-fc00653f905d",
                                             "771cac4a-3bc4-4386-bc5b-bc9e54e354b3e8d249e2-7dc7-4fbd-a8d1-eb4bea664d7fb9d7ae5d-f6ff-48ee-9901-700ef02066d3",
                                             "ጲⳊ榋엫 쪞5摀%!ﻠ罆;>>₧橴ﾋ1͢ޑ棸-3藡褅\u0013蜇▇鱃�??｢!₥�?�?� 蛰칹 +⸖ﰂ�?4氂侉ｯ椬楔ퟎ#>�?:�?��?!办�?뎓",
                                             "81c0a494-7bed-4a44-b0ad-6e75cd147441452bebe1-2490-4022-8edc-12afea69e9bfdc63544e-0650-47f4-8135-a561cfb8029f",
                                             "\u001a뺳@ꩵ@窥VUD\u000eA.L=GZ⼔�?�W \u0011\u000f敃�?<R>뜲�??�?�T/<-縭 쨊\u0007Y'쪹�?�//,䔑X,Q\u000b᪔S�?�฾=픗(,�?�^\u000e",
                                             "4b3595ad-5bd0-4f1f-940d-d686fdbeaf97",
                                             "45374ea4-088d-463c-865f-578674b1bc02cce73fa0-dc2c-4fa9-9248-230410885cdeaab26f7b-5272-41fd-a613-d7b6b89c3f5d",
                                             "eb41d49d-6030-47d2-aa73-f57f6ea08151", null,
                                             AccountBusinessModel.getDefault(), null,
                                             "bdf297b9-f5b6-4c6c-9be2-03cbd31419c07e67a8c7-a7c6-4b0b-b1bc-39e8267ec0122a908c72-e54d-4ba6-bd12-d94dacd9604c",
                                             "04a2379b-5221-4e66-87dc-6ad40b7a427f528d27f9-185f-48b9-a1e6-8f6d6c980517a990c409-bfe2-4873-9348-0c45d99740f5",
                                             "2f12530b-d62e-4ae3-8dec-9da6f3c2a321e0bf755c-cd7a-4dab-b34c-04f8bfb9152ca0b21dca-a7c8-4b01-8a6c-a9576dc40716",
                                             "08166780-b472-4144-b328-3a40118e851e",
                                             "d1f9baa7-2d73-41ae-b871-96e2c6b90ee8e2c5670d-8c5d-401b-b232-2bcd28f4efc68336003f-203f-4f4b-907e-c3772764e648",
                                             new Date(1610683990677L), null, "7de77d57-dd5e-4550-9c97-f44316ca79ad",
                                             "f124544b-b062-488b-a7cc-707e474ca3797b3ec556-3356-4cde-8063-677d66e8228309ccf4e2-0714-40a5-af20-74359f69eb51",
                                             "ጲⳊ榋엫 쪞5摀%!ﻠ罆;>>₧橴ﾋ1͢ޑ棸-3藡褅\u0013蜇▇鱃�??｢!₥�?�?� 蛰칹 +⸖ﰂ�?4氂侉ｯ椬楔ퟎ#>�?:�?��?!办�?뎓",
                                             null, new Date(1610683990160L), 180 + 1,
                                             "\u001a뺳@ꩵ@窥VUD\u000eA.L=GZ⼔�?�W \u0011\u000f敃�?<R>뜲�??�?�T/<-縭 쨊\u0007Y'쪹�?�//,䔑X,Q\u000b᪔S�?�฾=픗(,�?�^\u000e",
                                             120 + 1, null, null, AccountMfaStatus.getDefault(), null,
                                             new ParentAccount(),
                                             "\u001a뺳@ꩵ@窥VUD\u000eA.L=GZ⼔�?�W \u0011\u000f敃�?<R>뜲�??�?�T/<-縭 쨊\u0007Y'쪹�?�//,䔑X,Q\u000b᪔S�?�฾=픗(,�?�^\u000e",
                                             new PasswordPolicy(), 45 + 1,
                                             "b0f6666f-05f3-4138-b7e9-95529b65de16b45eb2ec-5469-44ab-9fc9-0bffba63e18f78ba3b65-8b85-4e1b-93f8-6e02d21e9dd2",
                                             null,
                                             "5aa63dbb-f180-4e28-9627-569883e4495c3ba79998-6cd3-4a0f-a3b9-3bdb93f56b348ced7981-1ae5-4322-ba14-8a55ec031680",
                                             "ff61ab34-bd51-4a1d-8940-123bc8788172",
                                             "52a315ad-5de8-4533-90df-494780ca5689",
                                             "ጲⳊ榋엫 쪞5摀%!ﻠ罆;>>₧橴ﾋ1͢ޑ棸-3藡褅\u0013蜇▇鱃�??｢!₥�?�?� 蛰칹 +⸖ﰂ�?4氂侉ｯ椬楔ퟎ#>�?:�?��?!办�?뎓",
                                             "093b6a4c-91a2-44c4-b6df-cc00077103c5cfe78803-4f07-483d-84fe-cd1db2c234c9df4ed4a1-f398-48be-b52c-0fad0dc47c3a",
                                             AccountStatus.getDefault(),
                                             "\u001a뺳@ꩵ@窥VUD\u000eA.L=GZ⼔�?�W \u0011\u000f敃�?<R>뜲�??�?�T/<-縭 쨊\u0007Y'쪹�?�//,䔑X,Q\u000b᪔S�?�฾=픗(,�?�^\u000e",
                                             "f44d95d0-3c30-4c69-9d61-e35b9e29bfe5", null, new Date(1610683992161L),
                                             new Date(1610683988838L));
        assertFalse(accountInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Account account1 = new Account("39fb89dc-ce19-4083-ae1f-fc90849a7afa",
                                           "dab195bb-d7d7-40f0-9d02-a4b485f706f0", "28d39.0ae6c@d2e45.me",
                                           "e378748f-c4c2-4ccb-8fc8-fd5564f201f7", "3b2c98a6b0d3341e5184f0f766dde798",
                                           "6c8efab8-77a8-479a-a3b6-5c6c3c7e8fa3",
                                           "a3533e9e-0f52-4a31-b1d9-677edf0c1801",
                                           "11183bcc-7de6-4eec-a514-8f312ca64cec", null,
                                           AccountBusinessModel.getDefault(), null,
                                           "f0c46d9b-b40e-4309-8feb-a9066a4da14c",
                                           "6a8aefa6-48b5-4d65-b22f-19f51b31a3ff",
                                           "ddbbb46e-4032-4eba-852c-fc10ef9885c2",
                                           "e85c9d94-b788-4a78-bd85-2b2c788c8750",
                                           "e09d173d-0930-40ff-ae65-1dd9181fbb31", new Date(1610683990974L), null,
                                           "5bac4435-9db6-4b59-8030-aa715f5d7fb2",
                                           "dfb50ecd-7ecf-44c0-bbc5-006ee683f6fa", "410f9.40869@3de06.me",
                                           "a2278867-bde2-4911-9674-b48a98b78bfc", new Date(1610683989791L), 1,
                                           "3b2c98a6b0d3341e5184f0f766dde798", 60, null, null,
                                           AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", new PasswordPolicy(), 45,
                                           "710596ab-6bfb-46fa-9047-1c266615d7dd", null,
                                           "71e4ab8f-36a4-412e-9e48-5cc7777a9ae2",
                                           "ed235a0a-5e30-4d31-81f2-412ab38f3fc7",
                                           "8c524289-753e-4e86-a887-667fc9e0e771", "5c4c8.620bd@4fa04.fr",
                                           "24d8e3a2-016b-40c8-b623-88abe4af8867", AccountStatus.getDefault(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", "b598247f-95e6-4d27-ac03-dc4642f16f97",
                                           null, new Date(1610683988022L), new Date(1610683988853L));
            Account account2 = new Account("39fb89dc-ce19-4083-ae1f-fc90849a7afa",
                                           "dab195bb-d7d7-40f0-9d02-a4b485f706f0", "28d39.0ae6c@d2e45.me",
                                           "e378748f-c4c2-4ccb-8fc8-fd5564f201f7", "3b2c98a6b0d3341e5184f0f766dde798",
                                           "6c8efab8-77a8-479a-a3b6-5c6c3c7e8fa3",
                                           "a3533e9e-0f52-4a31-b1d9-677edf0c1801",
                                           "11183bcc-7de6-4eec-a514-8f312ca64cec", null,
                                           AccountBusinessModel.getDefault(), null,
                                           "f0c46d9b-b40e-4309-8feb-a9066a4da14c",
                                           "6a8aefa6-48b5-4d65-b22f-19f51b31a3ff",
                                           "ddbbb46e-4032-4eba-852c-fc10ef9885c2",
                                           "e85c9d94-b788-4a78-bd85-2b2c788c8750",
                                           "e09d173d-0930-40ff-ae65-1dd9181fbb31", new Date(1610683990974L), null,
                                           "5bac4435-9db6-4b59-8030-aa715f5d7fb2",
                                           "dfb50ecd-7ecf-44c0-bbc5-006ee683f6fa", "410f9.40869@3de06.me",
                                           "a2278867-bde2-4911-9674-b48a98b78bfc", new Date(1610683989791L), 1,
                                           "3b2c98a6b0d3341e5184f0f766dde798", 60, null, null,
                                           AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", new PasswordPolicy(), 45,
                                           "710596ab-6bfb-46fa-9047-1c266615d7dd", null,
                                           "71e4ab8f-36a4-412e-9e48-5cc7777a9ae2",
                                           "ed235a0a-5e30-4d31-81f2-412ab38f3fc7",
                                           "8c524289-753e-4e86-a887-667fc9e0e771", "5c4c8.620bd@4fa04.fr",
                                           "24d8e3a2-016b-40c8-b623-88abe4af8867", AccountStatus.getDefault(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", "b598247f-95e6-4d27-ac03-dc4642f16f97",
                                           null, new Date(1610683988022L), new Date(1610683988853L));
            Account account3 = new Account("0bccd4fa-aacd-497b-98a2-1bd75289572a",
                                           "7297da29-db4a-4081-a4c2-53a119068838", "9fc21.946a6@28362.fr",
                                           "cc84690f-9434-4f5c-bbf0-e2b311ee8de6", "3b2c98a6b0d3341e5184f0f766dde798",
                                           "63c1a01b-eb7d-4192-849d-f50b8d033776",
                                           "84cd27f6-7173-4569-8ec9-19c9c2d4a43a",
                                           "e0e69347-60d0-4688-a472-0d66e92759d9", null,
                                           AccountBusinessModel.getDefault(), null,
                                           "b8fd579a-b9a6-4b65-96ab-dbff1f657cf5",
                                           "d978fbc4-3a54-412b-bf17-47edf290957c",
                                           "3d2d7306-20fd-42f1-83fe-f0a1cc08d896",
                                           "210f8860-7735-4ec4-a5a5-b7898ea174a7",
                                           "3886297b-294b-4af0-b5fc-252d99407137", new Date(1610683987884L), null,
                                           "2ae0b613-4d94-4cec-a7e1-b2ce0abbbb77",
                                           "4f25749e-5ab5-4e7a-aeb9-2b2661c4dcf1", "d81cd.f3db4@137be.fr",
                                           "16a936f2-cbb7-4619-9c8d-4e4b4fe0764a", new Date(1610683990202L), 76,
                                           "3b2c98a6b0d3341e5184f0f766dde798", 3, null, null,
                                           AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", new PasswordPolicy(), 13,
                                           "7c6d7cc2-f9f0-4749-b6a9-827a41497ff1", null,
                                           "ebc74723-284a-41b5-9c68-1c7e90d10283",
                                           "e5b889f1-a935-468f-b42e-53216d0065fb",
                                           "a1a354a4-a156-414d-a2d0-28e50c1fefd0", "ff179.5284a@aa865.me",
                                           "0db94864-d784-4398-ac19-a853197023dd", AccountStatus.getDefault(),
                                           "3b2c98a6b0d3341e5184f0f766dde798", "635ddd3c-d024-4d82-b2c6-4c5b44103a43",
                                           null, new Date(1610683985063L), new Date(1610683986996L));
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
