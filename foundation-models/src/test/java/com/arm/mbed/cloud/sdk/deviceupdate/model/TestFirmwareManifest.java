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
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1559288259829L), -27,
                                                                      "e883e72a-db1a-4ca0-ad57-735e68082e95",
                                                                      "b4c32bee-80d7-4049-9dc2-888b570209bc",
                                                                      "9d7bfae9-3675-45b2-ad1b-fce7d10cfb06",
                                                                      "4fbf1979-c159-4ed6-abbe-0fb3132a819c",
                                                                      "ad9051ab-97d9-425b-b055-547980f3af37",
                                                                      "49e23789-a2db-447f-9ca9-04962bf07d25",
                                                                      new Date(1559288262948L),
                                                                      new Date(1559288256426L));
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
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1559288255570L), 17,
                                                                      "f7e9ecd2-70d9-48be-b44b-e962226fbf15",
                                                                      "5f70d3b6-b5b6-4944-96fc-5cedcfd8bac8",
                                                                      "40fc85ac-84ce-4b0d-ba20-41f97690dc8b",
                                                                      "cce503bd-adaf-4648-9eee-48d8d91d04da",
                                                                      "4eb8767e-c97d-44fe-8e09-3751996e088c",
                                                                      "3aad94e3-cebb-420a-b254-fe5bb8940525",
                                                                      new Date(1559288257781L),
                                                                      new Date(1559288259556L));
            FirmwareManifest firmwaremanifest2 = new FirmwareManifest(new Date(1559288255570L), 17,
                                                                      "f7e9ecd2-70d9-48be-b44b-e962226fbf15",
                                                                      "5f70d3b6-b5b6-4944-96fc-5cedcfd8bac8",
                                                                      "40fc85ac-84ce-4b0d-ba20-41f97690dc8b",
                                                                      "cce503bd-adaf-4648-9eee-48d8d91d04da",
                                                                      "4eb8767e-c97d-44fe-8e09-3751996e088c",
                                                                      "3aad94e3-cebb-420a-b254-fe5bb8940525",
                                                                      new Date(1559288257781L),
                                                                      new Date(1559288259556L));
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
        FirmwareManifest firmwaremanifest = new FirmwareManifest(new Date(1559288256439L), 45,
                                                                 "7baa16ff-7640-4c80-8611-a0cdcf1d0449",
                                                                 "1cba04c2-f37d-46ab-9939-008d0397939d",
                                                                 "1e606b80-31ff-4e62-b504-5e9c2cf63a06",
                                                                 "08ccaee4-2599-40aa-9356-a98c27beef6d",
                                                                 "d471f616-768e-41cd-a708-7f1160025e58",
                                                                 "ea3c41b5-f88a-4a0f-be31-62e2fdd16ed3",
                                                                 new Date(1559288256324L), new Date(1559288260451L));
        assertTrue(firmwaremanifest.isValid());
        FirmwareManifest firmwaremanifestInvalid = new FirmwareManifest(new Date(1559288257961L), 122,
                                                                        "491fc032-77c6-4f49-8e56-6a03827d2764",
                                                                        "f9fe54b5-4e5c-4b79-981f-806590f796eee4449f8c-697d-4c65-9860-218149718c355daac359-7929-492b-bdb0-764c969fac0dc54da015-7a9f-4d92-875a-12d0dc006b8b89c02ca9-946c-4718-8993-07317578ead6fd91892d-1275-4162-92a9-5544b189ea0bf8eefb81-ed21-4fe6-8fd9-1c63e17106bcdf2527ad-8d35-4146-81bf-a557f8263106181ee8d7-9622-4806-98ad-1eab195da5655a1de892-95e2-42e0-bfef-d031dcbbc9a0d95b30f1-eebd-4d4d-835c-3da67ed196bd4755e481-850f-49e6-b1a2-51631147b8c88ee0773e-66c2-44cb-aea3-b95b238814c8624f4e83-fb00-4afc-ab86-e5a75e8206bbda0945cd-2ac0-4700-a15e-936c8a536f49a0ba030c-f53f-4618-b75b-1cd22fe50c49124ccc2c-e1f6-45ed-a263-cf7b1c94465e31ee333c-e7fd-4cfc-9c09-537229c5375d3ee8eaa5-d329-4a44-aa45-164b5c740095a5528bb3-1958-4e3b-b76f-9102524500a2f0e19539-edb9-470f-833f-4b13f887ea0a072ddd78-a73e-46b6-ae63-a5e658b9fcdb3dac8253-3d32-4869-a1cf-6eff09591a926426be27-9e68-449d-adbe-41f3c92a00822c044aeb-142c-4ad2-8972-57f26bc6b427810aed63-60fc-415a-9333-fec7dbe154f57175219a-c7fb-469e-a265-01587b896f51237136a5-f6b4-4c5b-979d-15e24a68b9811828ddd2-4423-426d-8f89-a4014955acf577f3003c-c321-4073-b42d-0783f755aff6dded0512-1a62-4497-933c-14c3b98695b260041a30-cc5d-4a8b-ac7e-51be7328bd9e8b84a7bb-9762-4e7f-a650-4237601edb3c003653e9-bd8a-4f1b-8363-8f1f41b2bcf9717d820c-6afe-49a5-9a8e-c03765e676d713e7099f-54bc-43ff-8e49-8db172c3efc2418fbc13-d652-4f58-8f79-b5b2f1ef64e38694712f-aad6-4884-b6a2-18bdec0952174506357d-5a12-4a36-8354-1b8b664d9e1021111602-c8cf-4dc1-87c2-dbb820e66632e83847a4-1219-4775-9ccd-ec0678b18b574432139a-ea04-40aa-865a-f29c7fac3922b43b7813-6eb1-4957-8d14-ad6c6af4ad4da9e83763-1ce2-4c67-ab81-b5ab094f8113c641e5db-3bfd-4326-bc53-631b377825b9eaca7566-bef3-408d-874d-90b6f098ea7b5377d0ef-5743-4cf5-bbf3-0144b6d7cc2aee081be5-4bd1-466e-8394-4318b81a3e13eb62a4c8-de08-41d8-942c-0ff742272b76cd887038-63c2-4245-a68a-24158a294d8b073a710c-b8f1-4362-90d9-6b73db6fd1c384779d82-6c2a-433b-9b2b-ee63c3e357fd3281e989-59d8-47b1-960c-043bf9730902f0c22115-da4a-4a00-be7f-45849e3b4c78e0fda7e9-a7b6-47b1-a4a2-f885429695a9e92c5ea3-bbc7-4086-ab6c-374b31937605",
                                                                        "d88486d5-a07d-42f1-8d0c-10003dddbf89",
                                                                        "527272d9-7558-4f5b-a57b-49516892291f",
                                                                        "b63a8aae-9a79-4e30-9a81-d2f35d7553f5",
                                                                        "989d26ea-a9a0-49ad-8d13-d29fa252d53150b84f4c-3cee-4041-8f89-67c96f3502f70e1df13b-34a2-41d8-a750-34084a9f950a37518f38-ceed-40f3-bcb4-9b93cdf3c212",
                                                                        new Date(1559288253633L),
                                                                        new Date(1559288256162L));
        assertFalse(firmwaremanifestInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1559288254743L), -81,
                                                                      "6a9ff4de-5519-4dbf-8d43-bc69ab852c8f",
                                                                      "65e27892-b295-46b2-b9df-9da4c55fe070",
                                                                      "96eb13d3-61c8-4192-9c1a-4ed499dded48",
                                                                      "8b841780-3f7e-449b-b720-27372bccc443",
                                                                      "8b0e5595-15ec-4dd5-8c5e-a72f3faafd80",
                                                                      "87d86c3d-08b0-44de-a488-5d4606e7731c",
                                                                      new Date(1559288261970L),
                                                                      new Date(1559288262131L));
            FirmwareManifest firmwaremanifest2 = new FirmwareManifest(new Date(1559288254743L), -81,
                                                                      "6a9ff4de-5519-4dbf-8d43-bc69ab852c8f",
                                                                      "65e27892-b295-46b2-b9df-9da4c55fe070",
                                                                      "96eb13d3-61c8-4192-9c1a-4ed499dded48",
                                                                      "8b841780-3f7e-449b-b720-27372bccc443",
                                                                      "8b0e5595-15ec-4dd5-8c5e-a72f3faafd80",
                                                                      "87d86c3d-08b0-44de-a488-5d4606e7731c",
                                                                      new Date(1559288261970L),
                                                                      new Date(1559288262131L));
            FirmwareManifest firmwaremanifest3 = new FirmwareManifest(new Date(1559288253944L), -13,
                                                                      "a8507580-70f3-4d40-8f57-c33c0046568e",
                                                                      "2794d0d9-cf94-4f42-a4da-ee3d95949c5b",
                                                                      "b8d3c436-8c17-4c11-9ce1-f0eb71a9bfb6",
                                                                      "7a4dae65-176a-4f1c-b197-4b2c358998b6",
                                                                      "8e0928c8-3d3b-4cf1-a922-d5a3882958a0",
                                                                      "eebac93b-1852-4837-ade2-0237b119bc5a",
                                                                      new Date(1559288263020L),
                                                                      new Date(1559288262023L));
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
