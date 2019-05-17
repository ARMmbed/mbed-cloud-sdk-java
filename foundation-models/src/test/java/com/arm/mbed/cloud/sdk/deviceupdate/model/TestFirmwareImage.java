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
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1558096035591L),
                                                             "f472ab06-8795-401c-af06-c39c492866ce", -67,
                                                             "9de9944b-cebb-4a3a-b7c9-7370508ff4e3",
                                                             "9c00f4e5-b651-41a8-a13f-ccbcccfd9fc5",
                                                             "ef6429a3-8342-4c69-8bc9-f188f1a72fb0",
                                                             "51cd9e52-340a-43c8-b3a7-5ac63d1a2657",
                                                             new Date(1558096038354L));
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
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1558096043509L),
                                                             "0820919f-e282-42f3-8db0-9262f2e4d998", -127,
                                                             "43de7610-0343-4f17-b059-3d39ff8c688a",
                                                             "1c036ad8-f290-4faa-991a-dcf6c867d370",
                                                             "2b016319-97cd-45ba-a7a3-0b4d019255b8",
                                                             "087bd532-07d8-40f1-abe3-b6422fdde4bd",
                                                             new Date(1558096041695L));
            FirmwareImage firmwareimage2 = new FirmwareImage(new Date(1558096043509L),
                                                             "0820919f-e282-42f3-8db0-9262f2e4d998", -127,
                                                             "43de7610-0343-4f17-b059-3d39ff8c688a",
                                                             "1c036ad8-f290-4faa-991a-dcf6c867d370",
                                                             "2b016319-97cd-45ba-a7a3-0b4d019255b8",
                                                             "087bd532-07d8-40f1-abe3-b6422fdde4bd",
                                                             new Date(1558096041695L));
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
        FirmwareImage firmwareimage = new FirmwareImage(new Date(1558096038923L),
                                                        "ef4730c6-2484-4d35-81d7-4230e6a15b76", 62,
                                                        "d1e425e4-c996-4ee2-a1fb-bb8d26bb4fea",
                                                        "e65089ff-3ff8-4fe8-a665-50f4df8b030f",
                                                        "a3a8939e-38b9-4038-9c5d-fa12232f03fb",
                                                        "0b89887e-5513-4155-a471-fde57c153297",
                                                        new Date(1558096040361L));
        assertTrue(firmwareimage.isValid());
        FirmwareImage firmwareimageInvalid = new FirmwareImage(new Date(1558096035832L),
                                                               "285a1863-0aeb-4562-a717-29d66c42538f", 7,
                                                               "fadffcdb-941a-41aa-a3b7-276779844fd6",
                                                               "d8c37ffc-b6c6-488d-a9d9-691c8ef21c6e6ceedbe1-e9a0-45d6-9b9a-e615475e4d5c08866afc-de26-4652-8f82-ae9ab411ec0a7d028bec-05e8-421b-a283-566e57f606d6ec391b0f-11d5-4342-b856-22827ececdfb4c1fd6cd-6bf9-4b8a-a1e0-67f55feb30d26a03686b-7ed5-414b-aaff-e55cead9de312118a7e2-2658-4d2d-b893-ff926af4024c34bca072-e926-43b8-a378-80abc329c208d4b3dd58-b669-4ac6-9992-c2134806d4ab6343fcf5-c587-4a57-b713-a19f2dd25773ad63565f-7fc8-4663-a573-4b5681f87d95c8409d7e-e799-4457-a2dc-0fbcef14204efafacce4-9ac0-42e1-88fd-6d97d43eb4b4c0a4635c-98a3-474a-a989-aeb8d3e8cd885cfb4bb0-0deb-4afb-8b8b-16aaffc0fd4e59632bc1-ea83-47e8-a33f-4eafeeb2761bf90b9a9e-7512-4bbf-ad09-742226ef15eefc7f9a8b-db9b-466b-854a-3f2cf684d0616b1fdae0-49d3-4793-b275-0a88e053c0dd76b66095-658c-43d8-8256-77e469b3b1da4eed7eee-d74b-4b36-8780-85f8babf2c3706039088-39b2-4157-a085-92868652e8593c0bffb3-9c21-4a6b-a5cf-af48ccc4d8b90b6197b3-e726-49c2-adb6-de726c323a4c95aa6822-fdf9-4410-affc-1d1e2c8f222d4f0dea94-46ab-487d-93a1-c53e94e943e726e1fd4b-9003-4f07-900d-f64f697b66566136e116-fa12-447d-841b-397971212768dba8aefa-d68b-4f7b-8e8b-2eecd317da02b62f5a32-f166-4683-b701-0408e196f8a4ae31e5a0-068a-4775-949c-50ca843e53bd47fd0985-8021-4eca-a0b7-8a3b11c28a2297d83e04-2c85-44d7-86dc-a6643370ed2d751e7d96-781e-483b-aaa4-3ddc1c00dde08973c80c-0bdc-4d16-b8d7-3f164e95f5bb57ad23e3-fd66-45f5-a674-e84d8839053c68fb71d7-b9cf-4e4c-882a-cb5ed5cbc902be756bc8-6d04-4d48-ac22-5e29f2f7332a52b88553-5584-486a-a849-86ca05baaa17bda987d3-4b55-4e80-9990-23dac471413a4eb4663e-cca6-46f0-9de1-c275a7c586985e2c2fb9-8fad-4d4d-87d5-db84df1a842839628326-9b8b-484c-8073-f43cb3c99e286b19b321-4445-4abf-ad7f-11131353ac3c3f53ce70-ab11-406b-a6ac-4f77e16de8d2dbbc93e0-e72a-4e55-9f2b-4b757abb4e984c8d10c8-b5c2-4b3f-a592-c122af52970528876e55-c6cd-4faa-ba4c-299a4bf676fe28327a51-07cb-4874-9a29-c9bf322e46fc2833350c-ade5-4ebb-b4a8-e0927e44fa9a223fe68e-5bcf-4f96-b3b4-242bc387fa4c5f57259b-cdab-43ca-a70a-204130a3504001500e87-77fd-4bd2-baaa-328708b7a1a42a0823d2-fd1a-4927-8415-831ffbc015b50914682a-b361-4eb9-8370-b00684ac908c",
                                                               "d6a657df-9e5d-4516-83a6-be91f644c180",
                                                               "62afecb7-8afd-44a4-aaaa-c8ae353400189195952b-cb40-4273-966c-3a58559725a9f7aeb482-2155-44e7-a92d-a2e9f759ba983e649c07-b4f5-4cba-a58b-13c8ab630bff",
                                                               new Date(1558096043582L));
        assertFalse(firmwareimageInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1558096035740L),
                                                             "4b1ee425-d2b2-4499-b52b-75b92771d399", 21,
                                                             "5668b067-2a1d-486a-be66-46ff95a7583c",
                                                             "cf295a21-c9ff-4468-bcec-96d6083703f7",
                                                             "22aa22d8-a2f6-4ecd-bb40-59acca5c0333",
                                                             "ab2845fd-3a10-4726-bb6f-775cf7b09e0a",
                                                             new Date(1558096036670L));
            FirmwareImage firmwareimage2 = new FirmwareImage(new Date(1558096035740L),
                                                             "4b1ee425-d2b2-4499-b52b-75b92771d399", 21,
                                                             "5668b067-2a1d-486a-be66-46ff95a7583c",
                                                             "cf295a21-c9ff-4468-bcec-96d6083703f7",
                                                             "22aa22d8-a2f6-4ecd-bb40-59acca5c0333",
                                                             "ab2845fd-3a10-4726-bb6f-775cf7b09e0a",
                                                             new Date(1558096036670L));
            FirmwareImage firmwareimage3 = new FirmwareImage(new Date(1558096039012L),
                                                             "4044fcfa-0815-4475-8cd8-75403927bef9", -36,
                                                             "01907f7d-45c9-44ab-9043-7ea90300a6f4",
                                                             "9523b2bb-8c48-4041-93b7-b210e463682d",
                                                             "0e9e39f0-afcf-4223-a16b-5ef1d21f1403",
                                                             "dfd8d100-d838-4a58-a913-cb4298a2b1f9",
                                                             new Date(1558096038201L));
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
