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
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(-63),
                                                                                                                            Long.valueOf(-35),
                                                                                                                            Order.getDefault(),
                                                                                                                            "9304c91f-b218-427d-b13f-e7967e91850a",
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
            CertificateIssuerConfigListOptions option = new CertificateIssuerConfigListOptions().equalToReference("6b976839-e56b-4fb3-bb84-ccfb5872b789");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(CertificateIssuerConfigListOptions.TAG_FILTER_BY_REFERENCE));
            assertTrue(option.hasFilter(CertificateIssuerConfigListOptions.TAG_FILTER_BY_REFERENCE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getReferenceFilters());
            assertEquals("6b976839-e56b-4fb3-bb84-ccfb5872b789",
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
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(-80),
                                                                                                                            Long.valueOf(-64),
                                                                                                                            Order.getDefault(),
                                                                                                                            "c9eae723-3c6d-4f74-b909-a38b0e66d4f3",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = new CertificateIssuerConfigListOptions(Integer.valueOf(-80),
                                                                                                                            Long.valueOf(-64),
                                                                                                                            Order.getDefault(),
                                                                                                                            "c9eae723-3c6d-4f74-b909-a38b0e66d4f3",
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
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(106),
                                                                                                                            Long.valueOf(-84),
                                                                                                                            Order.getDefault(),
                                                                                                                            "725faa08-2d92-4100-8060-50b4f47424ac",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = new CertificateIssuerConfigListOptions(Integer.valueOf(106),
                                                                                                                            Long.valueOf(-84),
                                                                                                                            Order.getDefault(),
                                                                                                                            "725faa08-2d92-4100-8060-50b4f47424ac",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions3 = new CertificateIssuerConfigListOptions(Integer.valueOf(113),
                                                                                                                            Long.valueOf(-54),
                                                                                                                            Order.getDefault(),
                                                                                                                            "45753bf6-a3ed-4a00-9be9-a9b6e9570d8c",
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
