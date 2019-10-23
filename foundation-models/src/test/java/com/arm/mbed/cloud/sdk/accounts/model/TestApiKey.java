// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ApiKey.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestApiKey {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ApiKey apikey1 = new ApiKey("4fe3ed46883d07edae68d4aee4a2a477", new Date(1571831496716L), 86,
                                        "4fe3ed46883d07edae68d4aee4a2a477", "6a8f4913-079d-47f7-ac90-95255ec9cb70", -46,
                                        "b0f85974-da72-4dc2-97e6-ffaa8a57e8a7", "4fe3ed46883d07edae68d4aee4a2a477",
                                        ApiKeyStatus.getDefault(), new Date(1571831490405L));
            ApiKey apikey2 = apikey1.clone();
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotSame(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
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
            ApiKey apikey1 = new ApiKey("4fe3ed46883d07edae68d4aee4a2a477", new Date(1571831486883L), 59,
                                        "4fe3ed46883d07edae68d4aee4a2a477", "004ae4e3-56b9-462f-9142-6425d7308bfe",
                                        -119, "5aef5494-6d02-418f-acef-6db17985f6cd",
                                        "4fe3ed46883d07edae68d4aee4a2a477", ApiKeyStatus.getDefault(),
                                        new Date(1571831493168L));
            ApiKey apikey2 = new ApiKey("4fe3ed46883d07edae68d4aee4a2a477", new Date(1571831486883L), 59,
                                        "4fe3ed46883d07edae68d4aee4a2a477", "004ae4e3-56b9-462f-9142-6425d7308bfe",
                                        -119, "5aef5494-6d02-418f-acef-6db17985f6cd",
                                        "4fe3ed46883d07edae68d4aee4a2a477", ApiKeyStatus.getDefault(),
                                        new Date(1571831493168L));
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotSame(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey2.hashCode(), apikey1.hashCode());
            int hashCode = apikey1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, apikey1.hashCode());
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
        ApiKey apikey = new ApiKey("4fe3ed46883d07edae68d4aee4a2a477", new Date(1571831492094L), -80,
                                   "4fe3ed46883d07edae68d4aee4a2a477", "35e39f52-e50d-46d9-a86e-d14746f4dcf1", 4,
                                   "93b58c39-5fc1-4533-9efd-f87110d4d840", "4fe3ed46883d07edae68d4aee4a2a477",
                                   ApiKeyStatus.getDefault(), new Date(1571831487353L));
        assertTrue(apikey.isValid());
        ApiKey apikeyInvalid = new ApiKey("111bb155c೅51?15⦒15ZJcbbQc#頷1\u0010\u001fFC55?O5᫢D5\u0001峰5*⇴=c15cB5cDbᰲ5?5㼺舦1b1",
                                          new Date(1571831491180L), -64,
                                          "111bb155c೅51?15⦒15ZJcbbQc#頷1\u0010\u001fFC55?O5᫢D5\u0001峰5*⇴=c15cB5cDbᰲ5?5㼺舦1b1",
                                          "1b7b9b07-f4c2-4a96-96bc-57021171ca67", -128, null,
                                          "111bb155c೅51?15⦒15ZJcbbQc#頷1\u0010\u001fFC55?O5᫢D5\u0001峰5*⇴=c15cB5cDbᰲ5?5㼺舦1b1",
                                          ApiKeyStatus.getDefault(), new Date(1571831495925L));
        assertFalse(apikeyInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ApiKey apikey1 = new ApiKey("4fe3ed46883d07edae68d4aee4a2a477", new Date(1571831490972L), 94,
                                        "4fe3ed46883d07edae68d4aee4a2a477", "dbd4150f-5e28-4538-96b1-2518a5f2667c", 79,
                                        "16bcc297-502d-4555-a4a3-574bafa541b6", "4fe3ed46883d07edae68d4aee4a2a477",
                                        ApiKeyStatus.getDefault(), new Date(1571831491500L));
            ApiKey apikey2 = new ApiKey("4fe3ed46883d07edae68d4aee4a2a477", new Date(1571831490972L), 94,
                                        "4fe3ed46883d07edae68d4aee4a2a477", "dbd4150f-5e28-4538-96b1-2518a5f2667c", 79,
                                        "16bcc297-502d-4555-a4a3-574bafa541b6", "4fe3ed46883d07edae68d4aee4a2a477",
                                        ApiKeyStatus.getDefault(), new Date(1571831491500L));
            ApiKey apikey3 = new ApiKey("4fe3ed46883d07edae68d4aee4a2a477", new Date(1571831496300L), 99,
                                        "4fe3ed46883d07edae68d4aee4a2a477", "30e083ea-5ac0-4e53-a8ef-08c43a464bb1",
                                        -112, "1efdb80c-8145-490a-928d-eba003f67f73",
                                        "4fe3ed46883d07edae68d4aee4a2a477", ApiKeyStatus.getDefault(),
                                        new Date(1571831492690L));
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotNull(apikey3);
            assertNotSame(apikey2, apikey1);
            assertNotSame(apikey3, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey1, apikey2);
            assertEquals(apikey1, apikey1);
            assertFalse(apikey1.equals(null));
            assertNotEquals(apikey3, apikey1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
