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
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("3474cf67-d8e2-4d89-ae01-6841e1dedc6c",
                                                                                  "5022c0cf-d95e-4bdb-b249-ff0ba011118c",
                                                                                  new Date(1565779004547L),
                                                                                  "80b72554-ed21-4ed5-852d-3086998cb17f",
                                                                                  "f7dfeca9-516c-4ebe-8929-44cd38a4c8d2",
                                                                                  "f4d256de-c0d2-42cd-abd6-9651ec6bea32",
                                                                                  "7eaf8b81-6775-4b97-b526-55db7e1147c8",
                                                                                  "202275ee-7d5c-4e13-ba34-f42e7ae11840");
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
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("639316e4-fcc4-47df-9390-5f449777ef82",
                                                                                  "271336cf-3be3-4254-a75b-26c36be84197",
                                                                                  new Date(1565779004597L),
                                                                                  "4326eb03-28fe-44d3-8a49-2eb61aae8a08",
                                                                                  "88cce86b-b761-4f09-aa61-eddaee552308",
                                                                                  "a3d0aa02-9a75-4d2e-bcf2-7fb9bacbc3cd",
                                                                                  "8a5c6bbd-3632-4551-b95e-b499554280f0",
                                                                                  "fd6b8e15-6297-402d-97cc-1a5b99da6940");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("639316e4-fcc4-47df-9390-5f449777ef82",
                                                                                  "271336cf-3be3-4254-a75b-26c36be84197",
                                                                                  new Date(1565779004597L),
                                                                                  "4326eb03-28fe-44d3-8a49-2eb61aae8a08",
                                                                                  "88cce86b-b761-4f09-aa61-eddaee552308",
                                                                                  "a3d0aa02-9a75-4d2e-bcf2-7fb9bacbc3cd",
                                                                                  "8a5c6bbd-3632-4551-b95e-b499554280f0",
                                                                                  "fd6b8e15-6297-402d-97cc-1a5b99da6940");
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
        DeveloperCertificate developercertificate = new DeveloperCertificate("0500a7e4-c6ce-4508-83cd-83286cf5126f",
                                                                             "f63deef2-45dc-4eae-9596-16b8e7f7b566",
                                                                             new Date(1565779000821L),
                                                                             "a4a90d93-8c5b-421a-8a6d-89b9eb76f58b",
                                                                             "b70baf8a-4190-4c49-99c7-55877ae80728",
                                                                             "021eef4e-8ab1-4c3f-8bfd-2cac24642126",
                                                                             "25c526b1-823b-4c99-aa0e-1bbd9a2c90c4",
                                                                             "8bde8347-de12-4d55-8c60-67562c334417");
        assertTrue(developercertificate.isValid());
        DeveloperCertificate developercertificateInvalid = new DeveloperCertificate("5a250591-3e3f-4572-83aa-7d1a92ff088b",
                                                                                    "959b4ca3-e655-4f47-b48e-ad3db52eb019",
                                                                                    new Date(1565779005317L),
                                                                                    "1346125a-742c-41e9-b707-205cb508fbf3",
                                                                                    "ec53dae3-ebca-4d43-9d81-b7ff1ce62bb5",
                                                                                    "259d32bf-85b2-45c8-8194-d060cbb7c11f",
                                                                                    null,
                                                                                    "6648c8dc-d424-4d63-a0c5-21bfe2d1bc17");
        assertFalse(developercertificateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("89b8635b-4e0f-434e-9828-deac60c2da87",
                                                                                  "e4c4b42a-5b5c-4437-b0b0-1821a66e0524",
                                                                                  new Date(1565778999621L),
                                                                                  "a1d40499-4b97-4483-85a0-ef193ce30ec7",
                                                                                  "7aa67387-17d8-49dd-8110-d143cede0e51",
                                                                                  "a84c3e16-6365-43c5-901e-5d2c3b682293",
                                                                                  "666f36fe-bd1e-435b-839e-0918538c228e",
                                                                                  "4165445f-382c-48ff-acb1-706bbaf64c9e");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("89b8635b-4e0f-434e-9828-deac60c2da87",
                                                                                  "e4c4b42a-5b5c-4437-b0b0-1821a66e0524",
                                                                                  new Date(1565778999621L),
                                                                                  "a1d40499-4b97-4483-85a0-ef193ce30ec7",
                                                                                  "7aa67387-17d8-49dd-8110-d143cede0e51",
                                                                                  "a84c3e16-6365-43c5-901e-5d2c3b682293",
                                                                                  "666f36fe-bd1e-435b-839e-0918538c228e",
                                                                                  "4165445f-382c-48ff-acb1-706bbaf64c9e");
            DeveloperCertificate developercertificate3 = new DeveloperCertificate("9bae48bd-53e3-4570-9ef4-ebc14b0798fc",
                                                                                  "24e961d4-5c79-49c5-88c6-4fd4b16105cf",
                                                                                  new Date(1565779000211L),
                                                                                  "d7fc062c-41b4-495f-a1f6-6d7f98307532",
                                                                                  "46a53eac-c281-4651-af0d-0e60de31828f",
                                                                                  "eb40d36b-b898-41f9-b8f5-147ad892f26d",
                                                                                  "5133aad2-9a26-448f-966a-586b1bb47c8f",
                                                                                  "ee3e0208-edf6-4255-a4e6-b9ca0abd43c2");
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
