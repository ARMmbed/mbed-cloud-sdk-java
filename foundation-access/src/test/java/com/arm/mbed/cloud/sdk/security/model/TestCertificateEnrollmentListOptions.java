// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollmentListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateEnrollmentListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(28),
                                                                                                                      Long.valueOf(-26),
                                                                                                                      Order.getDefault(),
                                                                                                                      "aaf98ee6-ed08-4035-b973-536ee2a8a11e",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = certificateenrollmentlistoptions1.clone();
            assertNotNull(certificateenrollmentlistoptions1);
            assertNotNull(certificateenrollmentlistoptions2);
            assertNotSame(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
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
            CertificateEnrollmentListOptions option = new CertificateEnrollmentListOptions().lessThanUpdatedAt(new Date(1561032452429L))
                                                                                            .greaterThanUpdatedAt(new Date(1561032450935L))
                                                                                            .equalToCertificateName("3c4f18f7-d5c3-47ee-a40f-864ec2998ebd")
                                                                                            .equalToDeviceId("c7a78595-577a-47e0-9b2c-d4978f4ece3a")
                                                                                            .notEqualToEnrollResult(CertificateEnrollmentEnrollResult.getDefault())
                                                                                            .equalToEnrollResult(CertificateEnrollmentEnrollResult.getDefault())
                                                                                            .lessThanCreatedAt(new Date(1561032449642L))
                                                                                            .greaterThanCreatedAt(new Date(1561032453693L))
                                                                                            .notEqualToEnrollStatus(CertificateEnrollmentEnrollStatus.getDefault())
                                                                                            .equalToEnrollStatus(CertificateEnrollmentEnrollStatus.getDefault());
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                        FilterOperator.LESS_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1561032452429L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1561032450935L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getCertificateNameFilters());
            assertEquals("3c4f18f7-d5c3-47ee-a40f-864ec2998ebd",
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("c7a78595-577a-47e0-9b2c-d4978f4ece3a",
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getEnrollResultFilters());
            assertEquals(CertificateEnrollmentEnrollResult.getDefault(),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT,
                                                                       CertificateEnrollmentEnrollResult.class,
                                                                       option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEnrollResultFilters());
            assertEquals(CertificateEnrollmentEnrollResult.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT,
                                                                    CertificateEnrollmentEnrollResult.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                        FilterOperator.LESS_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1561032449642L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1561032453693L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getEnrollStatusFilters());
            assertEquals(CertificateEnrollmentEnrollStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS,
                                                                       CertificateEnrollmentEnrollStatus.class,
                                                                       option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEnrollStatusFilters());
            assertEquals(CertificateEnrollmentEnrollStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS,
                                                                    CertificateEnrollmentEnrollStatus.class, option));
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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(-100),
                                                                                                                      Long.valueOf(110),
                                                                                                                      Order.getDefault(),
                                                                                                                      "c014086d-91ad-44de-be51-5a3df5554229",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = new CertificateEnrollmentListOptions(Integer.valueOf(-100),
                                                                                                                      Long.valueOf(110),
                                                                                                                      Order.getDefault(),
                                                                                                                      "c014086d-91ad-44de-be51-5a3df5554229",
                                                                                                                      null,
                                                                                                                      null);
            assertNotNull(certificateenrollmentlistoptions1);
            assertNotNull(certificateenrollmentlistoptions2);
            assertNotSame(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions2.hashCode(), certificateenrollmentlistoptions1.hashCode());
            int hashCode = certificateenrollmentlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateenrollmentlistoptions1.hashCode());
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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(101),
                                                                                                                      Long.valueOf(-77),
                                                                                                                      Order.getDefault(),
                                                                                                                      "e70a023e-fa56-4442-87f3-439bbdb2cccd",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = new CertificateEnrollmentListOptions(Integer.valueOf(101),
                                                                                                                      Long.valueOf(-77),
                                                                                                                      Order.getDefault(),
                                                                                                                      "e70a023e-fa56-4442-87f3-439bbdb2cccd",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions3 = new CertificateEnrollmentListOptions(Integer.valueOf(48),
                                                                                                                      Long.valueOf(-17),
                                                                                                                      Order.getDefault(),
                                                                                                                      "bc7bfbba-b66a-4475-a5f1-77124196d023",
                                                                                                                      null,
                                                                                                                      null);
            assertNotNull(certificateenrollmentlistoptions1);
            assertNotNull(certificateenrollmentlistoptions2);
            assertNotNull(certificateenrollmentlistoptions3);
            assertNotSame(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertNotSame(certificateenrollmentlistoptions3, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions1, certificateenrollmentlistoptions2);
            assertEquals(certificateenrollmentlistoptions1, certificateenrollmentlistoptions1);
            assertFalse(certificateenrollmentlistoptions1.equals(null));
            assertNotEquals(certificateenrollmentlistoptions3, certificateenrollmentlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
