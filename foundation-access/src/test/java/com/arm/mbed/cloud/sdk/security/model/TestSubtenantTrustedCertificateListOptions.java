// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantTrustedCertificateListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantTrustedCertificateListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(57),
                                                                                                                                        Long.valueOf(-64),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "c8ff0f35-1b5a-4620-8226-449c1fedb826",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = subtenanttrustedcertificatelistoptions1.clone();
            assertNotNull(subtenanttrustedcertificatelistoptions1);
            assertNotNull(subtenanttrustedcertificatelistoptions2);
            assertNotSame(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the filters method.
     */
    @SuppressWarnings({ "boxing", "resource" })
    @Test
    public void testFilters() {
        try {
            SubtenantTrustedCertificateListOptions option = new SubtenantTrustedCertificateListOptions().equalToValid(Boolean.TRUE)
                                                                                                        .equalToName("c37c246f-7d38-48e2-871e-2571b077136d")
                                                                                                        .equalToStatus(SubtenantTrustedCertificateStatus.getDefault())
                                                                                                        .equalToDeviceExecutionMode(Integer.valueOf(-73))
                                                                                                        .notEqualToDeviceExecutionMode(Integer.valueOf(-36))
                                                                                                        .likeIssuer("c23ea98a-7ffc-4424-8124-2c846bca7a15")
                                                                                                        .equalToService(SubtenantTrustedCertificateService.getDefault())
                                                                                                        .likeSubject("d3551eb4-de34-4e07-8bba-cb799714da56")
                                                                                                        .equalToEnrollmentMode(Boolean.TRUE);
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_VALID));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_VALID,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getValidFilters());
            assertEquals(Boolean.TRUE,
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_VALID,
                                                                    Boolean.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_NAME,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getNameFilters());
            assertEquals("c37c246f-7d38-48e2-871e-2571b077136d",
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_STATUS,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getStatusFilters());
            assertEquals(SubtenantTrustedCertificateStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_STATUS,
                                                                    SubtenantTrustedCertificateStatus.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(-73),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                    Integer.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(-36),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER,
                                        FilterOperator.LIKE));
            assertNotNull(option.getIssuerFilters());
            assertEquals("c23ea98a-7ffc-4424-8124-2c846bca7a15",
                         ListOptionsEncoder.encodeSingleLikeFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER,
                                                                   String.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SERVICE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SERVICE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getServiceFilters());
            assertEquals(SubtenantTrustedCertificateService.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SERVICE,
                                                                    SubtenantTrustedCertificateService.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT,
                                        FilterOperator.LIKE));
            assertNotNull(option.getSubjectFilters());
            assertEquals("d3551eb4-de34-4e07-8bba-cb799714da56",
                         ListOptionsEncoder.encodeSingleLikeFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT,
                                                                   String.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEnrollmentModeFilters());
            assertEquals(Boolean.TRUE,
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
                                                                    Boolean.class, option));
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
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(-41),
                                                                                                                                        Long.valueOf(-7),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "f57c604b-0d08-4054-9d28-03ac273ff293",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(-41),
                                                                                                                                        Long.valueOf(-7),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "f57c604b-0d08-4054-9d28-03ac273ff293",
                                                                                                                                        null,
                                                                                                                                        null);
            assertNotNull(subtenanttrustedcertificatelistoptions1);
            assertNotNull(subtenanttrustedcertificatelistoptions2);
            assertNotSame(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2.hashCode(),
                         subtenanttrustedcertificatelistoptions1.hashCode());
            int hashCode = subtenanttrustedcertificatelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenanttrustedcertificatelistoptions1.hashCode());
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
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(0),
                                                                                                                                        Long.valueOf(103),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "8a6aebb5-e6d2-49a7-b712-915dc997a42e",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(0),
                                                                                                                                        Long.valueOf(103),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "8a6aebb5-e6d2-49a7-b712-915dc997a42e",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions3 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(44),
                                                                                                                                        Long.valueOf(-61),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "2715a50a-c58b-4b12-8425-b9703dd1151b",
                                                                                                                                        null,
                                                                                                                                        null);
            assertNotNull(subtenanttrustedcertificatelistoptions1);
            assertNotNull(subtenanttrustedcertificatelistoptions2);
            assertNotNull(subtenanttrustedcertificatelistoptions3);
            assertNotSame(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertNotSame(subtenanttrustedcertificatelistoptions3, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions1, subtenanttrustedcertificatelistoptions2);
            assertEquals(subtenanttrustedcertificatelistoptions1, subtenanttrustedcertificatelistoptions1);
            assertFalse(subtenanttrustedcertificatelistoptions1.equals(null));
            assertNotEquals(subtenanttrustedcertificatelistoptions3, subtenanttrustedcertificatelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
