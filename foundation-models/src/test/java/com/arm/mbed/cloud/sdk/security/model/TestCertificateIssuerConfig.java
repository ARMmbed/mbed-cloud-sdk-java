// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerConfig.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuerConfig {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("4170dbe7-fea8-4ac3-8704-4cf82dfdbd28",
                                                                                           new Date(1559313347496L),
                                                                                           "727e07d2-0d75-415b-af12-277e13c5d1c9",
                                                                                           "876187bc-368a-4796-bffc-0f4935bb227c",
                                                                                           new Date(1559313339865L));
            CertificateIssuerConfig certificateissuerconfig2 = certificateissuerconfig1.clone();
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
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
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("3e1125e4-f6cb-450d-82c3-afc8c4fa00a0",
                                                                                           new Date(1559313344093L),
                                                                                           "b6e17f26-71ca-4574-ab8f-5fdf09b84038",
                                                                                           "b2ae1c5e-fabe-458d-8d12-a51a7d58319e",
                                                                                           new Date(1559313339841L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("3e1125e4-f6cb-450d-82c3-afc8c4fa00a0",
                                                                                           new Date(1559313344093L),
                                                                                           "b6e17f26-71ca-4574-ab8f-5fdf09b84038",
                                                                                           "b2ae1c5e-fabe-458d-8d12-a51a7d58319e",
                                                                                           new Date(1559313339841L));
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2.hashCode(), certificateissuerconfig1.hashCode());
            int hashCode = certificateissuerconfig1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuerconfig1.hashCode());
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
        CertificateIssuerConfig certificateissuerconfig = new CertificateIssuerConfig("0d7905fb-834f-4a91-a24a-34e71a4afec7",
                                                                                      new Date(1559313339733L),
                                                                                      "143db3af-9444-4fdd-8568-d9b00886264d",
                                                                                      "7f09e98e-bc06-4c9b-a433-8cc6328c0eda",
                                                                                      new Date(1559313342599L));
        assertTrue(certificateissuerconfig.isValid());
        CertificateIssuerConfig certificateissuerconfigInvalid = new CertificateIssuerConfig(null,
                                                                                             new Date(1559313340004L),
                                                                                             "69f4337f-8d8d-45a3-9c99-e4409a92b003",
                                                                                             null,
                                                                                             new Date(1559313344876L));
        assertFalse(certificateissuerconfigInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("33fa463f-4ea1-4bd6-9f65-a8c793e4f90c",
                                                                                           new Date(1559313347316L),
                                                                                           "9e6b7867-149d-436b-a065-42ea00fa8f10",
                                                                                           "b7b35411-1237-4a39-89b1-8f92aebf7c66",
                                                                                           new Date(1559313346393L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("33fa463f-4ea1-4bd6-9f65-a8c793e4f90c",
                                                                                           new Date(1559313347316L),
                                                                                           "9e6b7867-149d-436b-a065-42ea00fa8f10",
                                                                                           "b7b35411-1237-4a39-89b1-8f92aebf7c66",
                                                                                           new Date(1559313346393L));
            CertificateIssuerConfig certificateissuerconfig3 = new CertificateIssuerConfig("eca846b8-f1f6-4527-8b49-99e36c1aacae",
                                                                                           new Date(1559313347738L),
                                                                                           "a145afbb-e0ea-4b77-990f-0396bda8096e",
                                                                                           "15fda8e2-aac6-4d81-b5b7-19da5bdda010",
                                                                                           new Date(1559313342038L));
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotNull(certificateissuerconfig3);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertNotSame(certificateissuerconfig3, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig1, certificateissuerconfig2);
            assertEquals(certificateissuerconfig1, certificateissuerconfig1);
            assertFalse(certificateissuerconfig1.equals(null));
            assertNotEquals(certificateissuerconfig3, certificateissuerconfig1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
