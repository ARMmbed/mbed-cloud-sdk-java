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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(107),
                                                                                                                      Long.valueOf(23),
                                                                                                                      Order.getDefault(),
                                                                                                                      "d033499c-a433-40b8-955a-ee9bd1637c1c",
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
            CertificateEnrollmentListOptions option = new CertificateEnrollmentListOptions().lessThanUpdatedAt(new Date(1553524610865L))
                                                                                            .greaterThanUpdatedAt(new Date(1553524616160L))
                                                                                            .equalToCertificateName("0cc2b3a5-4691-4480-98f5-3a48f6d50a74")
                                                                                            .equalToDeviceId("ef8dcf73-c44b-478c-97b6-2b89dd050c9e")
                                                                                            .notEqualToEnrollResult(CertificateEnrollmentEnrollResult.getDefault())
                                                                                            .equalToEnrollResult(CertificateEnrollmentEnrollResult.getDefault())
                                                                                            .lessThanCreatedAt(new Date(1553524613696L))
                                                                                            .greaterThanCreatedAt(new Date(1553524611368L))
                                                                                            .notEqualToEnrollStatus(CertificateEnrollmentEnrollStatus.getDefault())
                                                                                            .equalToEnrollStatus(CertificateEnrollmentEnrollStatus.getDefault());
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                        FilterOperator.LESS_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1553524610865L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1553524616160L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getCertificateNameFilters());
            assertEquals("0cc2b3a5-4691-4480-98f5-3a48f6d50a74",
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("ef8dcf73-c44b-478c-97b6-2b89dd050c9e",
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
            assertEquals(new Date(1553524613696L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1553524611368L),
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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(44),
                                                                                                                      Long.valueOf(-78),
                                                                                                                      Order.getDefault(),
                                                                                                                      "2f253427-a962-41ad-9ae3-41675e3aa532",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = new CertificateEnrollmentListOptions(Integer.valueOf(44),
                                                                                                                      Long.valueOf(-78),
                                                                                                                      Order.getDefault(),
                                                                                                                      "2f253427-a962-41ad-9ae3-41675e3aa532",
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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(-16),
                                                                                                                      Long.valueOf(-47),
                                                                                                                      Order.getDefault(),
                                                                                                                      "dbe3fef9-a8e6-4a32-9bef-e11b19d76855",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = new CertificateEnrollmentListOptions(Integer.valueOf(-16),
                                                                                                                      Long.valueOf(-47),
                                                                                                                      Order.getDefault(),
                                                                                                                      "dbe3fef9-a8e6-4a32-9bef-e11b19d76855",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions3 = new CertificateEnrollmentListOptions(Integer.valueOf(115),
                                                                                                                      Long.valueOf(-18),
                                                                                                                      Order.getDefault(),
                                                                                                                      "985ffbe1-757a-477a-9914-972aba6bffa1",
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
