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
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1561572703598L),
                                                             "58f02d65-5acc-4287-ba3c-fdb0c8a08921", -79,
                                                             "00e6a4f1-b8b3-4668-8d55-0c79bdb2637a",
                                                             "cc2a59de-ec8d-438d-8418-70ae14774034",
                                                             "083ac8bb-d69e-4504-8907-e49156a84ca6",
                                                             "463c8569-cff3-4b42-bcd8-83a58895eb29",
                                                             new Date(1561572706768L));
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
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1561572699798L),
                                                             "d6fe0235-0cfc-4df5-aa50-879333221571", -15,
                                                             "1658ab17-2205-4f48-aa6a-1d727c73aa2a",
                                                             "9b5ab6a1-8da9-4687-a2eb-5291c996aec0",
                                                             "8eb37d4e-b971-425c-a453-8ede5ef337ba",
                                                             "100a77a7-7a0d-4255-a10e-568e7d285b7c",
                                                             new Date(1561572700397L));
            FirmwareImage firmwareimage2 = new FirmwareImage(new Date(1561572699798L),
                                                             "d6fe0235-0cfc-4df5-aa50-879333221571", -15,
                                                             "1658ab17-2205-4f48-aa6a-1d727c73aa2a",
                                                             "9b5ab6a1-8da9-4687-a2eb-5291c996aec0",
                                                             "8eb37d4e-b971-425c-a453-8ede5ef337ba",
                                                             "100a77a7-7a0d-4255-a10e-568e7d285b7c",
                                                             new Date(1561572700397L));
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
        FirmwareImage firmwareimage = new FirmwareImage(new Date(1561572702114L),
                                                        "b62dc8b4-8807-4de2-b803-7fccef971b3b", -7,
                                                        "d9e7da45-5647-4070-a61e-cb98204a8a85",
                                                        "b244cdf1-cb9d-49d9-b02a-382410961822",
                                                        "8e671f8c-86e4-40a7-9cd0-ed85fa6c1ffb",
                                                        "d9c8b35e-98db-483c-b03a-0b4af4698bd0",
                                                        new Date(1561572700667L));
        assertTrue(firmwareimage.isValid());
        FirmwareImage firmwareimageInvalid = new FirmwareImage(new Date(1561572700818L),
                                                               "840aa241-78b0-44b7-884c-692f16c1fdc4", -116,
                                                               "7f58effc-ad27-4ce6-80c4-1d2ec2cb72fe",
                                                               "e29fb91a-6865-45d2-a7fe-9d6947599de763076323-700b-45b9-87ab-256966eeffbce8feb48c-1d15-41ee-8ceb-25366f0328ad650f7796-54dd-4867-bf94-e77a4f3fef11139f2e01-40d2-40db-aa83-96d8269736026e8d6bf9-3f2b-4195-9e47-277ae9ad23f9066b3ab9-bdf8-4649-8f0a-515ddc13861363920a84-5e08-45f6-965b-06add48fecba1932c0e0-9a26-4f68-bd33-94882c4d71a2a7b459ea-bf19-4826-b4a3-b000540769251a92e7f9-8ef8-4f91-8791-79f03c9cf966df896731-0e48-4cb5-8ca5-a48c286d81e441e7e544-71e4-4789-ab86-36e59ef6c701515fcd5f-8819-43a0-a464-d536d0b99361e25c5fb6-bd0b-4d11-a6db-30c7bdc63112d2b5b4ff-0eba-45bb-8ef7-d60cc5ac45a8df42f1ca-6955-4a31-ad82-723d9f9a7ffd491a8278-6819-4629-a677-f2a20289ae06e762519f-fddb-432c-809a-9629c5d82667966ff10f-00be-4351-a176-f0885a0f20516562cc6f-42b6-43cf-a4be-508365bb4f13df404bd5-d196-4a73-b4ed-a8e85f7c564906b4da64-96a4-436a-8fe0-d3579e50ea14ad42270f-161a-4bcd-ab6e-20f910bca64c08ce722f-b46d-4471-a7bb-4032e19254192a4f4e1d-1fba-4177-88e7-1704412b29d065a537fc-03f1-4bd9-b377-905504a5c35c54181ffe-7738-4a22-b740-016afccc029b7c5ae9fc-9c96-431a-96ca-14a250b083f1419e249c-eb28-41cc-86f6-989756d92d157b56ad0a-99cc-4c69-851e-c131030bace9c5ed62da-429a-433c-b8a2-acfea6d84e92bd126f13-723e-445c-b52c-cca9453a0a9020964705-e9a8-4cfd-b8ea-bc1389cc53062a44d287-631b-45ac-a3f3-129771179800021fb2fa-3106-488e-861b-4c4f30b5a9337e7295cc-5004-4f7a-bb8c-7084d41eb0ed8d9f783f-eb8f-4c0b-8ce4-fc01082c9b83cf89ac4f-24f2-4402-a975-5a251d6db2514b98f59d-d1db-428d-afad-5a3873830a9505fba971-ba6d-4328-bccf-144797c9974502f3b772-2813-4951-b3f7-e73d2da932b7a2468137-b567-4eae-b400-a55af82c78d544e77b47-e347-4a07-8564-f704d5eb477f7a5b73d6-459f-4ac3-9937-10cbf614e5b6dd797508-d3ce-458c-a7ba-2d99e574ecc86b61bbe2-274c-4536-bce5-3d9287ca90f4640e3389-d292-4da1-b60c-3bc299272308d691e5c2-d3f5-4ea7-be57-9e1e9656eab8b158839d-74b4-4146-8d9a-aaf55b35051eb72c180d-e983-435b-b5dd-b36cceebeb3b476dd4a2-347c-4299-ac46-c8165a804d79db8b52cf-f6fc-492a-96c4-57cc8f8efbd9eb9f600d-142e-43c0-9183-44aa3d142a3d1fc7d9a5-7b30-4901-84f9-a4406f55b9787b6eb94f-9732-42ae-a9fb-53e8c7e88457",
                                                               "851a12da-c780-4c02-afea-6fdb44ba8f4b",
                                                               "9f95a8e4-99fa-4d29-bbdf-2b5609eaee0dfa8a3f7b-0693-4971-8060-6dcc4cdb4e6f7ebebba9-59d1-41b0-8544-759a1d5202b4772bdff0-9cd6-4987-9024-e0a4e0f80f0b",
                                                               new Date(1561572709388L));
        assertFalse(firmwareimageInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1561572704786L),
                                                             "9e6cad0c-32b3-4b5a-8605-dc8691ff0b9a", -21,
                                                             "5e7ca76a-3361-4572-8073-b23c05ac6809",
                                                             "d73ba3f1-0785-41c3-9ccd-acfef35f820a",
                                                             "81f9c4d4-963c-48d3-b64e-f23d4a16d11b",
                                                             "685addc1-2fc0-4cef-9c07-5d1266d8dc5d",
                                                             new Date(1561572702071L));
            FirmwareImage firmwareimage2 = new FirmwareImage(new Date(1561572704786L),
                                                             "9e6cad0c-32b3-4b5a-8605-dc8691ff0b9a", -21,
                                                             "5e7ca76a-3361-4572-8073-b23c05ac6809",
                                                             "d73ba3f1-0785-41c3-9ccd-acfef35f820a",
                                                             "81f9c4d4-963c-48d3-b64e-f23d4a16d11b",
                                                             "685addc1-2fc0-4cef-9c07-5d1266d8dc5d",
                                                             new Date(1561572702071L));
            FirmwareImage firmwareimage3 = new FirmwareImage(new Date(1561572705958L),
                                                             "823ecc5a-3eb7-40e1-8f84-da6dd82361b9", -20,
                                                             "37d73b58-0e44-4f57-8569-df0528f8f88b",
                                                             "89bbd9a5-bb53-4084-96a9-38847e53883d",
                                                             "55f7a853-b3ee-4ece-9a78-493df396fd85",
                                                             "aabefe3c-2cec-42cc-982e-45e0baab7ed5",
                                                             new Date(1561572700825L));
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
