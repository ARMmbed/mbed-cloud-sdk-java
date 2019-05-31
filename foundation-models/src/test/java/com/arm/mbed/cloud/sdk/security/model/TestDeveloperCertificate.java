// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeveloperCertificate.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeveloperCertificate {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("c626bf24-7030-4402-bb62-08637de19776",
                                                                                  "6324e75e-b2db-47e7-bbab-d7d13c4ed97b",
                                                                                  new Date(1559313341211L),
                                                                                  "81a1e8b9-443f-4d2a-aefa-241c0b56712a",
                                                                                  "6b2615f4-d60d-4506-8c25-db9511a4376d",
                                                                                  "763d92c5-5927-4e60-8e94-bf6072ee9b3f",
                                                                                  "132d3d33-3217-4078-b922-3f4c641f80af",
                                                                                  "3c074490-f304-4d9c-b010-fcc1618a12bf");
            DeveloperCertificate developercertificate2 = developercertificate1.clone();
            assertNotNull(developercertificate1);
            assertNotNull(developercertificate2);
            assertNotSame(developercertificate2, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
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
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("82d3523f-c4ae-435a-b259-36954ebbd07a",
                                                                                  "75ef27a3-e6fa-4228-91cc-0f1f28dc3bc7",
                                                                                  new Date(1559313346068L),
                                                                                  "ba0f2643-ae2a-405c-8d1b-4ffdf42819e3",
                                                                                  "8d490e66-3e5e-426f-a4bd-a29300b6c4d6",
                                                                                  "88353f10-1103-44f1-adf3-d1fbca79f439",
                                                                                  "f44f335c-b7ad-487c-a5af-9e8d8749960a",
                                                                                  "df535e55-d095-4934-b502-557a8d022e84");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("82d3523f-c4ae-435a-b259-36954ebbd07a",
                                                                                  "75ef27a3-e6fa-4228-91cc-0f1f28dc3bc7",
                                                                                  new Date(1559313346068L),
                                                                                  "ba0f2643-ae2a-405c-8d1b-4ffdf42819e3",
                                                                                  "8d490e66-3e5e-426f-a4bd-a29300b6c4d6",
                                                                                  "88353f10-1103-44f1-adf3-d1fbca79f439",
                                                                                  "f44f335c-b7ad-487c-a5af-9e8d8749960a",
                                                                                  "df535e55-d095-4934-b502-557a8d022e84");
            assertNotNull(developercertificate1);
            assertNotNull(developercertificate2);
            assertNotSame(developercertificate2, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
            assertEquals(developercertificate2.hashCode(), developercertificate1.hashCode());
            int hashCode = developercertificate1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, developercertificate1.hashCode());
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
        DeveloperCertificate developercertificate = new DeveloperCertificate("6c232aa5-ab58-4062-8662-7b5917d0ce6a",
                                                                             "66b8ef83-14f4-44f0-b07a-058e5cf0addb",
                                                                             new Date(1559313341469L),
                                                                             "6478d10f-b622-497d-9771-5b8f6dfddf77",
                                                                             "fc0d168d-8df9-4e05-ae1d-657576cae785",
                                                                             "4260ba03-46f2-4c3d-b83c-10687fe5e3da",
                                                                             "53e35ce7-a510-4f4e-b6ff-e0d323b59e63",
                                                                             "dcd9a2ef-2eba-4a5f-a614-c06de0d54b6e");
        assertTrue(developercertificate.isValid());
        DeveloperCertificate developercertificateInvalid = new DeveloperCertificate("6897e283-22c7-4420-a7ff-643987f4d19e",
                                                                                    "dc47a12a-4b4f-45b4-ab71-fbcd18881316",
                                                                                    new Date(1559313341865L),
                                                                                    "6fb9fc2e-7ca1-470f-acba-a8f184725232",
                                                                                    "0e003dcd-7ad3-4a90-9a96-70e3adca5483",
                                                                                    "75261c8e-0c1c-412d-a37c-69d73925bbe8",
                                                                                    null,
                                                                                    "6dd3e11d-e87c-419b-8a24-a950eed22a52");
        assertFalse(developercertificateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("8b1db613-ad56-4a80-a041-3d7496891aa4",
                                                                                  "66a92fbc-e819-4ab2-ad67-d5cbedef9089",
                                                                                  new Date(1559313341028L),
                                                                                  "3b9346f0-a764-4af4-a2a2-3c12c700e743",
                                                                                  "9229108f-af70-440e-b880-c4275d08ed02",
                                                                                  "ce85a8da-1b32-48fb-abc1-c5a48e8ad84f",
                                                                                  "e152b5cd-c5fa-44a3-9d1f-99b40b43abf3",
                                                                                  "04b722bd-907a-4e47-b6bb-492212793bb6");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("8b1db613-ad56-4a80-a041-3d7496891aa4",
                                                                                  "66a92fbc-e819-4ab2-ad67-d5cbedef9089",
                                                                                  new Date(1559313341028L),
                                                                                  "3b9346f0-a764-4af4-a2a2-3c12c700e743",
                                                                                  "9229108f-af70-440e-b880-c4275d08ed02",
                                                                                  "ce85a8da-1b32-48fb-abc1-c5a48e8ad84f",
                                                                                  "e152b5cd-c5fa-44a3-9d1f-99b40b43abf3",
                                                                                  "04b722bd-907a-4e47-b6bb-492212793bb6");
            DeveloperCertificate developercertificate3 = new DeveloperCertificate("bdda78d8-7905-4adc-ac75-8b1445f68f13",
                                                                                  "42781d47-cc99-4aeb-97f2-eb12dd74ad33",
                                                                                  new Date(1559313348168L),
                                                                                  "5a99edf4-be5a-4547-986e-c23602015445",
                                                                                  "4a539e00-ab3f-4f3a-9ac9-ba0c66c0a358",
                                                                                  "43c1d8b7-2657-425b-a62c-3dcc4ea4932a",
                                                                                  "7bdb56c9-d621-4732-94e8-ee31fde200f3",
                                                                                  "df3bb719-31ba-4d48-926d-94ada7091eb2");
            assertNotNull(developercertificate1);
            assertNotNull(developercertificate2);
            assertNotNull(developercertificate3);
            assertNotSame(developercertificate2, developercertificate1);
            assertNotSame(developercertificate3, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
            assertEquals(developercertificate1, developercertificate2);
            assertEquals(developercertificate1, developercertificate1);
            assertFalse(developercertificate1.equals(null));
            assertNotEquals(developercertificate3, developercertificate1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
