// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuer.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuer {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1610683992850L),
                                                                         "1d79a667-dd8f-4216-9ff4-6d639555b873",
                                                                         "826b49cc-0418-4e42-aad2-3416a67a504e", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "93be253d-c8b5-42ba-9482-6075e382702b");
            CertificateIssuer certificateissuer2 = certificateissuer1.clone();
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
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
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1610683990044L),
                                                                         "0d9ae70e-6d63-44d1-8c7a-876b19231631",
                                                                         "85d7d99b-6066-4f34-bb0f-b14307bed4fe", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "725cb252-6ccb-43da-86f4-83a7f4ed7050");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new Date(1610683990044L),
                                                                         "0d9ae70e-6d63-44d1-8c7a-876b19231631",
                                                                         "85d7d99b-6066-4f34-bb0f-b14307bed4fe", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "725cb252-6ccb-43da-86f4-83a7f4ed7050");
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2.hashCode(), certificateissuer1.hashCode());
            int hashCode = certificateissuer1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuer1.hashCode());
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
        CertificateIssuer certificateissuer = new CertificateIssuer(new Date(1610683991147L),
                                                                    "af9d4558-7923-445f-969b-43acb32cce7c",
                                                                    "9e725445-c23b-4d7e-af64-97301c5842b7", null,
                                                                    CertificateIssuerType.getDefault(),
                                                                    "a75768ea-7817-474c-984e-951aff8a02b5");
        assertTrue(certificateissuer.isValid());
        CertificateIssuer certificateissuerInvalid = new CertificateIssuer(new Date(1610683992544L),
                                                                           "ecb89a09-1a4c-4f8b-85da-c5b687ffd7474c7c10da-56f7-4cf1-aada-7b5a549ca26b2d0ec20e-c4d3-4b5d-9aaa-16081356f570",
                                                                           "4fd8c91f-df09-4a63-b6d1-d10eb46d2b9b", null,
                                                                           null, null);
        assertFalse(certificateissuerInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1610683990781L),
                                                                         "6a82c339-6bd4-4066-a53b-cc9cbc99cb7a",
                                                                         "6ba6b2ff-6a67-49ec-9c30-b8d00d3145dd", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "37c19ca0-a885-4a50-9afc-9aadef7e667a");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new Date(1610683990781L),
                                                                         "6a82c339-6bd4-4066-a53b-cc9cbc99cb7a",
                                                                         "6ba6b2ff-6a67-49ec-9c30-b8d00d3145dd", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "37c19ca0-a885-4a50-9afc-9aadef7e667a");
            CertificateIssuer certificateissuer3 = new CertificateIssuer(new Date(1610683989239L),
                                                                         "655272c5-4ca9-4451-8942-4c4462cbd98a",
                                                                         "deb35a2b-5911-452e-885a-bda3cfa57ea7", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "7b6534ce-a732-416d-b24c-1d06a4717bd4");
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotNull(certificateissuer3);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertNotSame(certificateissuer3, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer1, certificateissuer2);
            assertEquals(certificateissuer1, certificateissuer1);
            assertFalse(certificateissuer1.equals(null));
            assertNotEquals(certificateissuer3, certificateissuer1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
