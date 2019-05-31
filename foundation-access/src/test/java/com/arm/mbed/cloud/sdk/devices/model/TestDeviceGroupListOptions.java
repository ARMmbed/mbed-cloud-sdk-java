// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 * Unit tests for Model DeviceGroupListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceGroupListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceGroupListOptions devicegrouplistoptions1 = new DeviceGroupListOptions(Integer.valueOf(-29),
                                                                                        Long.valueOf(-76),
                                                                                        Order.getDefault(),
                                                                                        "5eb3063d-a5e2-4725-afbc-fddb6e1dab6b",
                                                                                        null, null);
            DeviceGroupListOptions devicegrouplistoptions2 = devicegrouplistoptions1.clone();
            assertNotNull(devicegrouplistoptions1);
            assertNotNull(devicegrouplistoptions2);
            assertNotSame(devicegrouplistoptions2, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions2, devicegrouplistoptions1);
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
            // Cannot test Filter [field=customAttributes, spec field=customAttributes,
            // tag=TAG_FILTER_BY_CUSTOM_ATTRIBUTES, operator=equal to, type=Map<String, String>, isVerified=true]
            // because the field is a hashtable
            // Cannot test Filter [field=customAttributes, spec field=customAttributes,
            // tag=TAG_FILTER_BY_CUSTOM_ATTRIBUTES, operator=not equal to, type=Map<String, String>, isVerified=true]
            // because the field is a hashtable
            DeviceGroupListOptions option = new DeviceGroupListOptions().inUpdatedAts(Arrays.asList(new Date(1559313346001L),
                                                                                                    new Date(1559313343115L),
                                                                                                    new Date(1559313344260L),
                                                                                                    new Date(1559313343486L),
                                                                                                    new Date(1559313350364L)))
                                                                        .notInUpdatedAts(Arrays.asList(new Date(1559313350796L),
                                                                                                       new Date(1559313349445L)))
                                                                        .lessThanUpdatedAt(new Date(1559313350453L))
                                                                        .greaterThanUpdatedAt(new Date(1559313343778L))
                                                                        .equalToName("148261cc-48a8-4b53-bb3c-f7d45023854d")
                                                                        .notEqualToName("b36e9d50-65b1-4410-9c0b-00148b2ed1cd")
                                                                        .inNames(Arrays.asList("7077e067-0f10-44a6-ab03-1a7c7f673ad7"))
                                                                        .notInNames(Arrays.asList("0d24e5e0-fe0e-4b84-aaa5-0c4a5c6d7d75"))
                                                                        .equalToDevicesCount(Integer.valueOf(-34))
                                                                        .notEqualToDevicesCount(Integer.valueOf(14))
                                                                        .inDevicesCounts(Arrays.asList(Integer.valueOf(71),
                                                                                                       Integer.valueOf(-31),
                                                                                                       Integer.valueOf(-90)))
                                                                        .notInDevicesCounts(Arrays.asList(Integer.valueOf(28)))
                                                                        .lessThanDevicesCount(Integer.valueOf(-4))
                                                                        .greaterThanDevicesCount(Integer.valueOf(84))
                                                                        .inCreatedAts(Arrays.asList(new Date(1559313350010L),
                                                                                                    new Date(1559313348935L),
                                                                                                    new Date(1559313351393L),
                                                                                                    new Date(1559313346375L),
                                                                                                    new Date(1559313348190L),
                                                                                                    new Date(1559313344779L),
                                                                                                    new Date(1559313343780L),
                                                                                                    new Date(1559313346743L)))
                                                                        .notInCreatedAts(Arrays.asList(new Date(1559313348257L)))
                                                                        .lessThanCreatedAt(new Date(1559313348634L))
                                                                        .greaterThanCreatedAt(new Date(1559313346404L))
                                                                        .equalToId("8954eaf5-e95b-4ed8-a801-3be129d875e4")
                                                                        .notEqualToId("bfea8e2d-f8d1-4f69-b8db-de6191966a4a")
                                                                        .inIds(Arrays.asList("a4e8c409-8fab-4c77-8f3e-88aa0dc34061",
                                                                                             "3d0d905c-386a-4f78-a425-e7a94b12bedd",
                                                                                             "7c406006-714a-483d-9a96-cbb7d268b921",
                                                                                             "6b1bc2a4-8361-4cf4-b709-33fb8c198718",
                                                                                             "42ec2420-2c6e-47c8-a7fb-a7658f011236"))
                                                                        .notInIds(Arrays.asList("40561527-1abb-4a34-aa0a-a69eb598a345",
                                                                                                "885e4653-d921-4579-a564-a51c427c2bad",
                                                                                                "a6d08515-dcf2-41b9-8327-0d2d0eae6855",
                                                                                                "91613d3c-991d-414d-b3aa-f558c3bc5e72",
                                                                                                "5e6b7727-e9eb-40fd-82c4-9010f1bf56e0"));
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT, FilterOperator.IN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(Arrays.asList(new Date(1559313346001L), new Date(1559313343115L), new Date(1559313344260L),
                                       new Date(1559313343486L), new Date(1559313350364L)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT, FilterOperator.NOT_IN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(Arrays.asList(new Date(1559313350796L), new Date(1559313349445L)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT, FilterOperator.LESS_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1559313350453L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT, FilterOperator.GREATER_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1559313343778L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME, FilterOperator.EQUAL));
            assertNotNull(option.getNameFilters());
            assertEquals("148261cc-48a8-4b53-bb3c-f7d45023854d",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getNameFilters());
            assertEquals("b36e9d50-65b1-4410-9c0b-00148b2ed1cd",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME, FilterOperator.IN));
            assertNotNull(option.getNameFilters());
            assertEquals(Arrays.asList("7077e067-0f10-44a6-ab03-1a7c7f673ad7"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME, List.class,
                                                                 option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME, FilterOperator.NOT_IN));
            assertNotNull(option.getNameFilters());
            assertEquals(Arrays.asList("0d24e5e0-fe0e-4b84-aaa5-0c4a5c6d7d75"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT, FilterOperator.EQUAL));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Integer.valueOf(-34),
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                    Integer.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Integer.valueOf(14),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT, FilterOperator.IN));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Arrays.asList(Integer.valueOf(71), Integer.valueOf(-31), Integer.valueOf(-90)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT, FilterOperator.NOT_IN));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Arrays.asList(Integer.valueOf(28)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT, FilterOperator.LESS_THAN));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Integer.valueOf(-4),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Integer.valueOf(84),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                          Integer.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT, FilterOperator.IN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(Arrays.asList(new Date(1559313350010L), new Date(1559313348935L), new Date(1559313351393L),
                                       new Date(1559313346375L), new Date(1559313348190L), new Date(1559313344779L),
                                       new Date(1559313343780L), new Date(1559313346743L)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT, FilterOperator.NOT_IN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(Arrays.asList(new Date(1559313348257L)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT, FilterOperator.LESS_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1559313348634L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT, FilterOperator.GREATER_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1559313346404L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                          Date.class, option));
            // Cannot test Filter [field=customAttributes, spec field=customAttributes,
            // tag=TAG_FILTER_BY_CUSTOM_ATTRIBUTES, operator=equal to, type=Map<String, String>, isVerified=true]
            // because the field is a hashtable
            // Cannot test Filter [field=customAttributes, spec field=customAttributes,
            // tag=TAG_FILTER_BY_CUSTOM_ATTRIBUTES, operator=not equal to, type=Map<String, String>, isVerified=true]
            // because the field is a hashtable
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, FilterOperator.EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("8954eaf5-e95b-4ed8-a801-3be129d875e4",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("bfea8e2d-f8d1-4f69-b8db-de6191966a4a",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, FilterOperator.IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("a4e8c409-8fab-4c77-8f3e-88aa0dc34061", "3d0d905c-386a-4f78-a425-e7a94b12bedd",
                                       "7c406006-714a-483d-9a96-cbb7d268b921", "6b1bc2a4-8361-4cf4-b709-33fb8c198718",
                                       "42ec2420-2c6e-47c8-a7fb-a7658f011236"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, List.class,
                                                                 option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("40561527-1abb-4a34-aa0a-a69eb598a345", "885e4653-d921-4579-a564-a51c427c2bad",
                                       "a6d08515-dcf2-41b9-8327-0d2d0eae6855", "91613d3c-991d-414d-b3aa-f558c3bc5e72",
                                       "5e6b7727-e9eb-40fd-82c4-9010f1bf56e0"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, List.class,
                                                                    option));
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
            DeviceGroupListOptions devicegrouplistoptions1 = new DeviceGroupListOptions(Integer.valueOf(57),
                                                                                        Long.valueOf(76),
                                                                                        Order.getDefault(),
                                                                                        "1c9954b3-4558-4eb3-abf0-e36cb8cd8966",
                                                                                        null, null);
            DeviceGroupListOptions devicegrouplistoptions2 = new DeviceGroupListOptions(Integer.valueOf(57),
                                                                                        Long.valueOf(76),
                                                                                        Order.getDefault(),
                                                                                        "1c9954b3-4558-4eb3-abf0-e36cb8cd8966",
                                                                                        null, null);
            assertNotNull(devicegrouplistoptions1);
            assertNotNull(devicegrouplistoptions2);
            assertNotSame(devicegrouplistoptions2, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions2, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions2.hashCode(), devicegrouplistoptions1.hashCode());
            int hashCode = devicegrouplistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, devicegrouplistoptions1.hashCode());
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
            DeviceGroupListOptions devicegrouplistoptions1 = new DeviceGroupListOptions(Integer.valueOf(-86),
                                                                                        Long.valueOf(-101),
                                                                                        Order.getDefault(),
                                                                                        "c812f4c0-4516-4749-bca4-d1aa07e67df4",
                                                                                        null, null);
            DeviceGroupListOptions devicegrouplistoptions2 = new DeviceGroupListOptions(Integer.valueOf(-86),
                                                                                        Long.valueOf(-101),
                                                                                        Order.getDefault(),
                                                                                        "c812f4c0-4516-4749-bca4-d1aa07e67df4",
                                                                                        null, null);
            DeviceGroupListOptions devicegrouplistoptions3 = new DeviceGroupListOptions(Integer.valueOf(-33),
                                                                                        Long.valueOf(-118),
                                                                                        Order.getDefault(),
                                                                                        "269124eb-40e8-4ea0-bea3-d48c0a224f1f",
                                                                                        null, null);
            assertNotNull(devicegrouplistoptions1);
            assertNotNull(devicegrouplistoptions2);
            assertNotNull(devicegrouplistoptions3);
            assertNotSame(devicegrouplistoptions2, devicegrouplistoptions1);
            assertNotSame(devicegrouplistoptions3, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions2, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions2, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions1, devicegrouplistoptions2);
            assertEquals(devicegrouplistoptions1, devicegrouplistoptions1);
            assertFalse(devicegrouplistoptions1.equals(null));
            assertNotEquals(devicegrouplistoptions3, devicegrouplistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
