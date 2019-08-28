// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model ParentAccount.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestParentAccount {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ParentAccount parentaccount1 = new ParentAccount("bb58f.ad012@466a4.fr",
                                                             "d9111446-8fae-4673-934d-b320631a1ad9",
                                                             "02c5996de8d57cd67670ecd25b819d1a");
            ParentAccount parentaccount2 = parentaccount1.clone();
            assertNotNull(parentaccount1);
            assertNotNull(parentaccount2);
            assertNotSame(parentaccount2, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
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
            ParentAccount parentaccount1 = new ParentAccount("15cfe.2b5af@a79ba.me",
                                                             "b28ccb8e-11bb-4fec-9092-4e620acb4b0b",
                                                             "02c5996de8d57cd67670ecd25b819d1a");
            ParentAccount parentaccount2 = new ParentAccount("15cfe.2b5af@a79ba.me",
                                                             "b28ccb8e-11bb-4fec-9092-4e620acb4b0b",
                                                             "02c5996de8d57cd67670ecd25b819d1a");
            assertNotNull(parentaccount1);
            assertNotNull(parentaccount2);
            assertNotSame(parentaccount2, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
            assertEquals(parentaccount2.hashCode(), parentaccount1.hashCode());
            int hashCode = parentaccount1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, parentaccount1.hashCode());
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
        ParentAccount parentaccount = new ParentAccount("1f510.5d446@7c02d.me", "d4d41df6-6300-4618-aebe-463802bf6719",
                                                        "02c5996de8d57cd67670ecd25b819d1a");
        assertTrue(parentaccount.isValid());
        ParentAccount parentaccountInvalid = new ParentAccount("�?�>峒Ԙ隭3沤�?�鷓㎠곖縹\t�?랛Ĭ特禳\u0001㠈毟Ꙇ>筗\tᚒ�?맰\u0007>뎇棦\u0001＾ﺱ>ﴄ\u0007⎃퉻뚋�?\u0015\u001f�?�\u000b鼾㟺\u0017⺞嵴\u0001ￇ#�?제",
                                                               "9ce6a459-3972-4d9a-9fa8-1d0e6b195361f92832d6-decf-4595-a4af-6a53234efb244245d0cc-efd5-4952-8160-0ee3562a7540",
                                                               "^>43Y<汓;H�?�443螋訌\b?4 .3ᔜ4\u001434\u0015�?�.㱫3\u001d43\u001aWT4Z뾕皦�?E\u000444,A뙾\u001f4�?�Wྶ\u0000]4`D3");
        assertFalse(parentaccountInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ParentAccount parentaccount1 = new ParentAccount("1f4bb.74cbf@9aef2.me",
                                                             "6878bd55-e714-471d-972f-ad9c560ead73",
                                                             "02c5996de8d57cd67670ecd25b819d1a");
            ParentAccount parentaccount2 = new ParentAccount("1f4bb.74cbf@9aef2.me",
                                                             "6878bd55-e714-471d-972f-ad9c560ead73",
                                                             "02c5996de8d57cd67670ecd25b819d1a");
            ParentAccount parentaccount3 = new ParentAccount("eb673.5bdbe@3339d.me",
                                                             "b5f14b3b-3624-45cb-a2e9-c3c4866f8b4a",
                                                             "02c5996de8d57cd67670ecd25b819d1a");
            assertNotNull(parentaccount1);
            assertNotNull(parentaccount2);
            assertNotNull(parentaccount3);
            assertNotSame(parentaccount2, parentaccount1);
            assertNotSame(parentaccount3, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
            assertEquals(parentaccount1, parentaccount2);
            assertEquals(parentaccount1, parentaccount1);
            assertFalse(parentaccount1.equals(null));
            assertNotEquals(parentaccount3, parentaccount1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
