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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(10),
                                                                                                                      Long.valueOf(125),
                                                                                                                      Order.getDefault(),
                                                                                                                      "b3dca754-3ad7-491e-8e13-94f478399e48",
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
            CertificateEnrollmentListOptions option = new CertificateEnrollmentListOptions().lessThanUpdatedAt(new Date(1558096038354L))
                                                                                            .greaterThanUpdatedAt(new Date(1558096046839L))
                                                                                            .equalToCertificateName("417aba49-72b1-45ae-b3d7-b544925df4dd")
                                                                                            .equalToDeviceId("fd2d4af4-ff01-44ed-8ece-41f44220a5ad")
                                                                                            .notEqualToEnrollResult(CertificateEnrollmentEnrollResult.getDefault())
                                                                                            .equalToEnrollResult(CertificateEnrollmentEnrollResult.getDefault())
                                                                                            .lessThanCreatedAt(new Date(1558096043334L))
                                                                                            .greaterThanCreatedAt(new Date(1558096042066L))
                                                                                            .notEqualToEnrollStatus(CertificateEnrollmentEnrollStatus.getDefault())
                                                                                            .equalToEnrollStatus(CertificateEnrollmentEnrollStatus.getDefault());
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                        FilterOperator.LESS_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1558096038354L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1558096046839L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getCertificateNameFilters());
            assertEquals("417aba49-72b1-45ae-b3d7-b544925df4dd",
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("fd2d4af4-ff01-44ed-8ece-41f44220a5ad",
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
            assertEquals(new Date(1558096043334L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1558096042066L),
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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(63),
                                                                                                                      Long.valueOf(-1),
                                                                                                                      Order.getDefault(),
                                                                                                                      "4cfb546d-2283-449a-8b6b-ec2b593faf72",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = new CertificateEnrollmentListOptions(Integer.valueOf(63),
                                                                                                                      Long.valueOf(-1),
                                                                                                                      Order.getDefault(),
                                                                                                                      "4cfb546d-2283-449a-8b6b-ec2b593faf72",
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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(-109),
                                                                                                                      Long.valueOf(-17),
                                                                                                                      Order.getDefault(),
                                                                                                                      "cc752a54-e23b-4378-a228-d7f6c459c75f",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = new CertificateEnrollmentListOptions(Integer.valueOf(-109),
                                                                                                                      Long.valueOf(-17),
                                                                                                                      Order.getDefault(),
                                                                                                                      "cc752a54-e23b-4378-a228-d7f6c459c75f",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions3 = new CertificateEnrollmentListOptions(Integer.valueOf(75),
                                                                                                                      Long.valueOf(-73),
                                                                                                                      Order.getDefault(),
                                                                                                                      "81991a9c-e4ad-42a6-b0c6-4afd523a05b5",
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
