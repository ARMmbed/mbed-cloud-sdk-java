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
            Account account1 = new Account("e664e216-05cc-467d-b4c7-c0e175223686",
                                           "5e0f2901-02b0-427d-9d42-df46bc8f8b03", "4b6f6.985f2@a834d.me",
                                           "cf332f4f-e261-45eb-8c20-a8d549573f1c", "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           "157dcc8b-06a6-4b9c-9383-de64a4913321",
                                           "f3add517-4277-469a-be08-95b1931e1d6e",
                                           "c3318906-156f-4d2d-b049-80d07dc46acd", null,
                                           "68ed1eee-3e74-46a1-8ec4-8f8c360cfdb8",
                                           "93ede0a2-038e-4a08-9c7f-bff7166ab497",
                                           "5a11bc9c-536a-420b-b838-7b2cac5ee64c",
                                           "ac4dda0a-d9a4-4aa3-91ca-0d55a4e1fe7b",
                                           "d9bc1ca7-63aa-4156-87e2-c7e5739c96fe", new Date(1558096039293L), null,
                                           "3c46fede-947b-497a-98bc-f1cd1417566b",
                                           "ce04b73a-2bf6-4c15-a096-12fbddb98d98", "59c35.cd6a1@64f05.fr",
                                           "8a6965a3-5433-4e6d-90dd-ec232ee42c85", new Date(1558096041144L), 66,
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", 36, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           new PasswordPolicy(), 3, "1db4f5d4-8d30-4796-8cb4-5476655caf3d", null,
                                           "87aaddaa-0499-4145-a26e-d0de616fa77b",
                                           "51f78a07-1a40-4fde-907d-8f711499536b",
                                           "fe13415a-bdae-4096-b46e-5f70b25be018", "a6144.5aed6@f41b1.fr",
                                           "8452cfe6-c29f-4597-b875-f19c4a658abe", AccountStatus.getDefault(),
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", "9079c2e9-2cc1-4230-9c22-29fcb252cea5",
                                           new Date(1558096043808L), new Date(1558096038131L));
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
            Account account1 = new Account("d1937433-3b68-4e26-8071-5f8f7f9769cb",
                                           "262fe860-2d1d-4f45-841f-7bc13eebf7d3", "b5f7a.0bc08@96b35.me",
                                           "5e0b8116-9187-4642-a94b-2a1652bcd134", "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           "4626c921-6687-472a-a12d-71e5b2cc3a3d",
                                           "bbf70b02-27a0-45a9-b58e-326b2f73ad34",
                                           "79fdea10-d7a0-42be-809c-6139b787043c", null,
                                           "944baa88-1a81-49b2-9bec-3eb85fb4dfce",
                                           "745ec1bb-38df-4b78-a8ce-11eab77d3885",
                                           "a9f23b1c-4527-4b37-ad73-35bc9ef375a0",
                                           "b2742d8b-bbe2-4edd-a7f3-d44705a85322",
                                           "45ea5c44-ff6e-4fae-b42e-b565a1312143", new Date(1558096037218L), null,
                                           "48631013-0d7e-4e94-9745-36d1d28a7934",
                                           "7fe21141-66f8-4c72-a29e-a8539ea3d5c5", "d5816.fbf46@cd889.me",
                                           "0ef4344e-b7ea-4ce1-976b-8f8c30ce2431", new Date(1558096042967L), 92,
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", 79, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           new PasswordPolicy(), 1, "fe416729-b290-4b9d-b585-3e738902e000", null,
                                           "229b81a8-dd78-4049-ba8d-447aee1c4c37",
                                           "44276ebd-ef44-4576-a90e-9a68c3ab3efd",
                                           "460f82df-5488-44c0-889e-0ebd5658c0c9", "04b20.a9764@8a4ea.fr",
                                           "2807a33b-aae1-4cda-8565-95cff6c9c927", AccountStatus.getDefault(),
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", "6bedd067-c4e3-4af0-a8d9-d9aa9dd0f2d8",
                                           new Date(1558096042350L), new Date(1558096037450L));
            Account account2 = new Account("d1937433-3b68-4e26-8071-5f8f7f9769cb",
                                           "262fe860-2d1d-4f45-841f-7bc13eebf7d3", "b5f7a.0bc08@96b35.me",
                                           "5e0b8116-9187-4642-a94b-2a1652bcd134", "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           "4626c921-6687-472a-a12d-71e5b2cc3a3d",
                                           "bbf70b02-27a0-45a9-b58e-326b2f73ad34",
                                           "79fdea10-d7a0-42be-809c-6139b787043c", null,
                                           "944baa88-1a81-49b2-9bec-3eb85fb4dfce",
                                           "745ec1bb-38df-4b78-a8ce-11eab77d3885",
                                           "a9f23b1c-4527-4b37-ad73-35bc9ef375a0",
                                           "b2742d8b-bbe2-4edd-a7f3-d44705a85322",
                                           "45ea5c44-ff6e-4fae-b42e-b565a1312143", new Date(1558096037218L), null,
                                           "48631013-0d7e-4e94-9745-36d1d28a7934",
                                           "7fe21141-66f8-4c72-a29e-a8539ea3d5c5", "d5816.fbf46@cd889.me",
                                           "0ef4344e-b7ea-4ce1-976b-8f8c30ce2431", new Date(1558096042967L), 92,
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", 79, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           new PasswordPolicy(), 1, "fe416729-b290-4b9d-b585-3e738902e000", null,
                                           "229b81a8-dd78-4049-ba8d-447aee1c4c37",
                                           "44276ebd-ef44-4576-a90e-9a68c3ab3efd",
                                           "460f82df-5488-44c0-889e-0ebd5658c0c9", "04b20.a9764@8a4ea.fr",
                                           "2807a33b-aae1-4cda-8565-95cff6c9c927", AccountStatus.getDefault(),
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", "6bedd067-c4e3-4af0-a8d9-d9aa9dd0f2d8",
                                           new Date(1558096042350L), new Date(1558096037450L));
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
        Account account = new Account("dba94f41-6590-4136-8119-a9ac3d7eca9d", "acc1c800-c25a-4453-a99a-d7c7e546ddaa",
                                      "8410c.c5808@3d6e1.me", "37e170a2-f5e9-4e2e-928b-8a93f6ab9bc4",
                                      "afbdeea60718ef43acbc07ccc8d8b7ff", "6b679fad-9933-4945-b86c-1f3576565763",
                                      "cfdc2638-94d7-45af-b97b-93049f1168c1", "1d553d37-e8fa-4e35-848d-526a163bdc62",
                                      null, "06696f27-4fcc-435b-a106-d9d90bc292c0",
                                      "7c3dd7ea-2ace-40f0-a1e0-a33781bd93d9", "dcebb8a0-e71d-497a-8d4c-a9d0a8091867",
                                      "8d451596-93ab-410c-844d-67b95ea75d7b", "edaa2465-66fb-4e83-bc14-882404461bb2",
                                      new Date(1558096035638L), null, "d6714b8f-fff4-45e6-9779-af8d8d5a0adc",
                                      "2f841eeb-540e-40ab-a8da-536b62554115", "026ea.67967@bb4d6.fr",
                                      "a02d46a7-2f02-4d2b-a62f-7782479fd7d6", new Date(1558096039764L), 7,
                                      "afbdeea60718ef43acbc07ccc8d8b7ff", 102, null, AccountMfaStatus.getDefault(),
                                      null, new ParentAccount(), "afbdeea60718ef43acbc07ccc8d8b7ff",
                                      new PasswordPolicy(), 1, "76b38797-8e91-4388-913e-a389a2a31fee", null,
                                      "f418f74f-cc00-4527-81aa-5f2d4b34a48c", "743faf09-3791-4b5a-a8e9-ca4e1899fd49",
                                      "27db340e-5331-45ab-8017-66b7c8b4a9b5", "cdfc2.e0b34@faeb3.fr",
                                      "0984c086-12e0-47d8-81da-c61460fd98e2", AccountStatus.getDefault(),
                                      "afbdeea60718ef43acbc07ccc8d8b7ff", "b8ad68db-1171-4e8a-a8ca-71f8aeaf5d4b",
                                      new Date(1558096038971L), new Date(1558096038026L));
        assertTrue(account.isValid());
        Account accountInvalid = new Account("85c4246c-36a4-48fc-ac17-4e2e5be4a66aeea01045-55fc-4b31-adf3-ed89c4e72dcd0f1dba51-965b-4c0d-8d73-050115a17c93",
                                             "61f9e170-27cb-4a0e-b946-a0b93fc9d74c1f769fe0-7227-4720-bb28-25489415fe623c6af851-aa9d-46c2-a9d3-34306a108553",
                                             "⎅0?ᣨा᪆楇려>蒃䒓෭\u001d�?�-礟ᕼ傰7炙멸>䂤>ꑼ�?>4蘼넌�??\u0017?떫疥4>?,�?\u0002㈼䩋ﵴ>;>9踌幉\u0015犾촴9瘊ﻥ\u0013>>",
                                             "62fd4bc5-416b-4aa3-9bd5-2c168b2674bab11dc4d6-2559-456e-aafa-8795a52ac98807996450-6428-4525-bb61-3e8f99e739e7",
                                             "2FX쯆52\u0007R5뙣\u0000ﴵ2552S麓劼䗴22/汵5�?�25!�?�5,2\b22\u000725%2`苅5\u001a)ꖟ2B2\u001352�?5\u001c)\u0013",
                                             "d54fe1d7-dfe5-45ee-97b4-b2ea50e823e2",
                                             "357d35f6-e10a-4687-85a0-8da46c715c8c84c556dc-029d-4d6f-8667-dc564ce6a73edff0c0fe-2bd2-43c7-a777-cae4a54e2ecb",
                                             "feb32be3-ccc9-4de4-81bf-6edc77be55b3", null,
                                             "905b735d-39ea-4e83-ad97-ff596fb98c96c1051ad4-9152-4f50-b8ab-da6d0249b312a0df1ef1-438b-47c1-8c18-267ecf63295d",
                                             "3d65024c-79e9-482b-aad0-87ebb40dfa18a8721c30-4062-4501-96e4-5f092931e44e8396605a-cd15-4517-9af7-286362a73bb5",
                                             "1ecab43b-b82e-4814-92ac-261718b5bf2ce437d8bd-10c2-4230-9cbb-6d5994f91b1d4ed1ff5e-7bb7-4612-a192-d3fb0261aaf7",
                                             "5d20832b-8deb-4c15-965b-9f60a20d299a",
                                             "30806581-e24e-411d-b92d-b6d58915b44ee689e0ff-d3a6-473e-8b04-90e09bfceb64f44e5099-d46b-4534-a257-d278a4ddccd9",
                                             new Date(1558096037402L), null, "a2c782d7-1c90-46f1-9e1d-557dc25ef3e7",
                                             "e4661033-0925-439e-abb4-618f5c0dac795f3d0e14-717b-40c8-9041-2f003ed4259a4339f0ee-2641-47eb-82c9-80eaa9ae9210",
                                             "⎅0?ᣨा᪆楇려>蒃䒓෭\u001d�?�-礟ᕼ傰7炙멸>䂤>ꑼ�?>4蘼넌�??\u0017?떫疥4>?,�?\u0002㈼䩋ﵴ>;>9踌幉\u0015犾촴9瘊ﻥ\u0013>>",
                                             null, new Date(1558096038711L), 180 + 1,
                                             "2FX쯆52\u0007R5뙣\u0000ﴵ2552S麓劼䗴22/汵5�?�25!�?�5,2\b22\u000725%2`苅5\u001a)ꖟ2B2\u001352�?5\u001c)\u0013",
                                             120 + 1, null, AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                             "2FX쯆52\u0007R5뙣\u0000ﴵ2552S麓劼䗴22/汵5�?�25!�?�5,2\b22\u000725%2`苅5\u001a)ꖟ2B2\u001352�?5\u001c)\u0013",
                                             new PasswordPolicy(), 45 + 1,
                                             "bfb5a124-d722-4b01-809d-3d86077a880444409c09-c972-45c8-ae1b-296647a1fcd6b7448d6f-3734-4d0c-9dcf-cd0d164c8372",
                                             null,
                                             "9aeffe34-03a7-49d5-b431-da3a3a97e6eff9f9e7b2-ff7d-4710-b581-c57913c1658a1f8465da-75d4-41be-940c-6da18d6ac50d",
                                             "1b86f2ab-13b1-4c63-9843-6dcd78b78318",
                                             "9014783e-6753-4796-9ce1-6b2f2120ca3b",
                                             "⎅0?ᣨा᪆楇려>蒃䒓෭\u001d�?�-礟ᕼ傰7炙멸>䂤>ꑼ�?>4蘼넌�??\u0017?떫疥4>?,�?\u0002㈼䩋ﵴ>;>9踌幉\u0015犾촴9瘊ﻥ\u0013>>",
                                             "db6af224-d5a2-478c-81e6-813872bf1bbe4e2cb9b7-31c2-4f7e-a434-a1ed5409bb22e41a7a2c-a3c9-4196-a10f-474861aec084",
                                             AccountStatus.getDefault(),
                                             "2FX쯆52\u0007R5뙣\u0000ﴵ2552S麓劼䗴22/汵5�?�25!�?�5,2\b22\u000725%2`苅5\u001a)ꖟ2B2\u001352�?5\u001c)\u0013",
                                             "9aeaa72e-c733-44c8-acd3-b0b52028b6cb", new Date(1558096039624L),
                                             new Date(1558096038002L));
        assertFalse(accountInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Account account1 = new Account("85f87256-0373-4331-918f-b2443970d390",
                                           "71030962-2ccb-4554-9f51-3b6f5604e42a", "7c14a.e046b@bd7e6.fr",
                                           "0e0e2205-7bd8-462a-9d26-ff279c48b84b", "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           "cd5a1ba4-7115-4058-8b84-093176621155",
                                           "b308a9e4-b1e1-4d71-9b52-3d9f434e66ec",
                                           "ea608429-266e-45bf-a139-b62d75db4341", null,
                                           "34272efc-d763-4f29-957f-714120a24b39",
                                           "bca504a5-e04e-4ba2-ac12-e6a8462aa84a",
                                           "449a862f-6fdd-4fdc-ae80-fe68cc7ff114",
                                           "4202a4a8-7233-421f-aba8-cec61c715ba5",
                                           "b24bf6d3-e308-43f3-be49-676831bc7dd0", new Date(1558096038827L), null,
                                           "a9fb6b80-89e5-4cec-ae9d-f17399fb450a",
                                           "9f3c4455-5e0f-464d-9ed6-bbcb2ea5599a", "ad451.cd9de@07407.fr",
                                           "5f84ab6b-f565-4142-83e5-e00c7f95b354", new Date(1558096038377L), 64,
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", 120, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           new PasswordPolicy(), 45, "93ca8f32-531a-4868-a20b-0494143c58f1", null,
                                           "1a78fed6-09fe-480b-a5ba-623cde03b65c",
                                           "6345bf7e-2487-43d5-9053-241674f18629",
                                           "ce85bfc5-fe04-4037-88a8-f695e0f864ba", "2ee56.9f81f@c9dbe.fr",
                                           "4ef67276-5273-485e-ad58-f2113911a199", AccountStatus.getDefault(),
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", "1ee2328a-cd50-46cf-882d-b55e0ba9fdb0",
                                           new Date(1558096044807L), new Date(1558096039730L));
            Account account2 = new Account("85f87256-0373-4331-918f-b2443970d390",
                                           "71030962-2ccb-4554-9f51-3b6f5604e42a", "7c14a.e046b@bd7e6.fr",
                                           "0e0e2205-7bd8-462a-9d26-ff279c48b84b", "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           "cd5a1ba4-7115-4058-8b84-093176621155",
                                           "b308a9e4-b1e1-4d71-9b52-3d9f434e66ec",
                                           "ea608429-266e-45bf-a139-b62d75db4341", null,
                                           "34272efc-d763-4f29-957f-714120a24b39",
                                           "bca504a5-e04e-4ba2-ac12-e6a8462aa84a",
                                           "449a862f-6fdd-4fdc-ae80-fe68cc7ff114",
                                           "4202a4a8-7233-421f-aba8-cec61c715ba5",
                                           "b24bf6d3-e308-43f3-be49-676831bc7dd0", new Date(1558096038827L), null,
                                           "a9fb6b80-89e5-4cec-ae9d-f17399fb450a",
                                           "9f3c4455-5e0f-464d-9ed6-bbcb2ea5599a", "ad451.cd9de@07407.fr",
                                           "5f84ab6b-f565-4142-83e5-e00c7f95b354", new Date(1558096038377L), 64,
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", 120, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           new PasswordPolicy(), 45, "93ca8f32-531a-4868-a20b-0494143c58f1", null,
                                           "1a78fed6-09fe-480b-a5ba-623cde03b65c",
                                           "6345bf7e-2487-43d5-9053-241674f18629",
                                           "ce85bfc5-fe04-4037-88a8-f695e0f864ba", "2ee56.9f81f@c9dbe.fr",
                                           "4ef67276-5273-485e-ad58-f2113911a199", AccountStatus.getDefault(),
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", "1ee2328a-cd50-46cf-882d-b55e0ba9fdb0",
                                           new Date(1558096044807L), new Date(1558096039730L));
            Account account3 = new Account("f4c2fa95-02fb-4f96-badd-d10546222eca",
                                           "9f4a4fa5-a153-44cf-a86d-14f66161d0b3", "6a128.933e7@d70dd.fr",
                                           "68abf7cf-9325-41e2-a3a7-e0c109df32b4", "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           "3a5195d8-6cdd-4e72-9087-7060bad6616b",
                                           "ae75470a-617b-477a-8d7d-dcba45ac551a",
                                           "0493234d-9287-458e-adb4-428f54e70297", null,
                                           "d5425acc-502b-4ac3-b960-8b6e2617da2d",
                                           "3f39c9a2-5f1e-48c6-ae92-64e936470e06",
                                           "c450d6e6-1d93-41b4-b73b-f9e07f6c1940",
                                           "e7b8f421-302e-4811-a728-c72b32d59170",
                                           "278daebb-5e7a-49d7-a708-6ff0b0a7edfa", new Date(1558096039971L), null,
                                           "ac8ebfbf-897d-457a-973f-21e6eff062ad",
                                           "93973ebc-c287-4e36-8451-3c591f72bea5", "60887.4b8a7@e06de.me",
                                           "61532d34-2072-48a9-bd20-41f4509b860e", new Date(1558096040631L), 69,
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", 1, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "afbdeea60718ef43acbc07ccc8d8b7ff",
                                           new PasswordPolicy(), 1, "8fe4c49a-5b0d-4971-93ce-0b5411f70d6e", null,
                                           "aeca6cee-6362-4c79-9837-4be8c3b32136",
                                           "c1f737c1-a96a-4607-87e0-a94df7e96261",
                                           "288b9410-0520-48f6-8af5-9697f9807c47", "36419.b67ee@b1c5e.me",
                                           "1b430fe3-cb44-4271-bf25-37c55e2b44db", AccountStatus.getDefault(),
                                           "afbdeea60718ef43acbc07ccc8d8b7ff", "04c02c5a-aa3a-4f16-89df-e76e885e3911",
                                           new Date(1558096039610L), new Date(1558096037019L));
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
