// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerConfigListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuerConfigListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(2),
                                                                                                                            Long.valueOf(26),
                                                                                                                            Order.getDefault(),
                                                                                                                            "c271dfb1-e193-47c5-a0c4-0adc7478cc23",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = certificateissuerconfiglistoptions1.clone();
            assertNotNull(certificateissuerconfiglistoptions1);
            assertNotNull(certificateissuerconfiglistoptions2);
            assertNotSame(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the filters method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testFilters() {
        try {
            CertificateIssuerConfigListOptions option = new CertificateIssuerConfigListOptions().equalToReference("53076548-5943-41c7-a056-7f5a841e46ec");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(CertificateIssuerConfigListOptions.TAG_FILTER_BY_REFERENCE));
            assertTrue(option.hasFilter(CertificateIssuerConfigListOptions.TAG_FILTER_BY_REFERENCE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getReferenceFilters());
            assertEquals("53076548-5943-41c7-a056-7f5a841e46ec",
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateIssuerConfigListOptions.TAG_FILTER_BY_REFERENCE,
                                                                    String.class, option));
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
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(-46),
                                                                                                                            Long.valueOf(-63),
                                                                                                                            Order.getDefault(),
                                                                                                                            "9b07aad8-16b0-46d2-b404-0fd862e42d9e",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = new CertificateIssuerConfigListOptions(Integer.valueOf(-46),
                                                                                                                            Long.valueOf(-63),
                                                                                                                            Order.getDefault(),
                                                                                                                            "9b07aad8-16b0-46d2-b404-0fd862e42d9e",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(certificateissuerconfiglistoptions1);
            assertNotNull(certificateissuerconfiglistoptions2);
            assertNotSame(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions2.hashCode(),
                         certificateissuerconfiglistoptions1.hashCode());
            int hashCode = certificateissuerconfiglistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuerconfiglistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(62),
                                                                                                                            Long.valueOf(-99),
                                                                                                                            Order.getDefault(),
                                                                                                                            "f677c1bf-1335-4318-81e0-d3de925aacac",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = new CertificateIssuerConfigListOptions(Integer.valueOf(62),
                                                                                                                            Long.valueOf(-99),
                                                                                                                            Order.getDefault(),
                                                                                                                            "f677c1bf-1335-4318-81e0-d3de925aacac",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions3 = new CertificateIssuerConfigListOptions(Integer.valueOf(-109),
                                                                                                                            Long.valueOf(3),
                                                                                                                            Order.getDefault(),
                                                                                                                            "6e4b3648-ac73-4ef5-ab33-37304b41b6be",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(certificateissuerconfiglistoptions1);
            assertNotNull(certificateissuerconfiglistoptions2);
            assertNotNull(certificateissuerconfiglistoptions3);
            assertNotSame(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertNotSame(certificateissuerconfiglistoptions3, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions1, certificateissuerconfiglistoptions2);
            assertEquals(certificateissuerconfiglistoptions1, certificateissuerconfiglistoptions1);
            assertFalse(certificateissuerconfiglistoptions1.equals(null));
            assertNotEquals(certificateissuerconfiglistoptions3, certificateissuerconfiglistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
