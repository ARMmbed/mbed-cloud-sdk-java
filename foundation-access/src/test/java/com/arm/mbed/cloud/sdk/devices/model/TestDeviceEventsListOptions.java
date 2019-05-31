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
 * Unit tests for Model DeviceEventsListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEventsListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(23),
                                                                                           Long.valueOf(-8),
                                                                                           Order.getDefault(),
                                                                                           "ae201ef2-8383-432f-a9a1-d455e43d22df",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = deviceeventslistoptions1.clone();
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
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
            DeviceEventsListOptions option = new DeviceEventsListOptions().equalToDeviceId("46a7a510-4fe0-42b4-8b09-f56950d022fe")
                                                                          .notEqualToDeviceId("1f10b862-d75c-4761-9434-97ac8d7d5138")
                                                                          .inDeviceIds(Arrays.asList("7b881e16-b25e-4f75-9d21-d5be18bcc7ca",
                                                                                                     "724ea281-b41d-4a46-9c4e-f20c971c3b6a",
                                                                                                     "a4ccbf0d-4241-4c5e-9717-f43faed04cb5",
                                                                                                     "9bbf0ac5-5014-4f79-8a6b-8b5cd0c52159",
                                                                                                     "997296f8-8fa1-47cb-b050-67ee7fbd7bd4",
                                                                                                     "85c0ea4a-296f-40eb-bf80-1c085470657f",
                                                                                                     "100617fe-15b1-49b0-88f9-864dc4573df1"))
                                                                          .notInDeviceIds(Arrays.asList("205bf685-b4bd-4c4c-95ac-4f9ba6637733",
                                                                                                        "b2b0ed3c-928f-4c92-961d-0255b2107a6e",
                                                                                                        "439bef4f-11b0-42c6-81b5-068479b7536d",
                                                                                                        "96aeca31-6d27-4731-bf27-7a34594d2fb8",
                                                                                                        "60d1e422-b2fe-4193-bed2-25f7bac486f7",
                                                                                                        "2b7ac700-85df-4e42-9a07-0f2080425f6a",
                                                                                                        "2103742c-cec3-4e76-818a-6b98a659f40f",
                                                                                                        "be48e7e4-139c-4caa-8d17-b3345920c9e7"))
                                                                          .equalToDescription("37471b46-a5e6-4e93-9d11-d6edbdfffcf3")
                                                                          .notEqualToDescription("e5caef54-a379-44af-b7e2-c4678086d20a")
                                                                          .inDescriptions(Arrays.asList("7b71832c-a6aa-4c72-8c91-ad09c20e75d9",
                                                                                                        "48629fd7-bdf1-4b17-89b6-c28ac0496e4a",
                                                                                                        "0f390ffc-3cf4-4e3f-bbbe-f1808c795ed8",
                                                                                                        "aef85ebb-4ebb-4c13-ac29-8f4fc4ecb0d8"))
                                                                          .notInDescriptions(Arrays.asList("e8dd74cc-6987-4e8b-adf8-ceef416c4527",
                                                                                                           "960592f5-18f1-4ea4-ad9e-699692f3e2c9",
                                                                                                           "aa45d3dd-e1e7-4c18-a66e-188b8ca05d3f",
                                                                                                           "91ef2bab-312e-4043-ba8f-316bb1fe2490",
                                                                                                           "62f9b55a-c069-4ec7-9c49-e73362da09df",
                                                                                                           "b02f3cf8-0d96-4a66-bd94-7cd42a71e2d5",
                                                                                                           "9ece0567-d958-45d4-89a9-3e71a2dcace8",
                                                                                                           "5520baff-9fc2-4dbb-ab99-e4895d8bca60"))
                                                                          .inDateTimes(Arrays.asList(new Date(1559313345439L),
                                                                                                     new Date(1559313347510L),
                                                                                                     new Date(1559313343763L),
                                                                                                     new Date(1559313349353L),
                                                                                                     new Date(1559313347461L),
                                                                                                     new Date(1559313342508L),
                                                                                                     new Date(1559313346350L),
                                                                                                     new Date(1559313345981L)))
                                                                          .notInDateTimes(Arrays.asList(new Date(1559313347308L),
                                                                                                        new Date(1559313343775L),
                                                                                                        new Date(1559313345977L),
                                                                                                        new Date(1559313344078L),
                                                                                                        new Date(1559313346926L),
                                                                                                        new Date(1559313347116L),
                                                                                                        new Date(1559313348122L)))
                                                                          .lessThanDateTime(new Date(1559313349081L))
                                                                          .greaterThanDateTime(new Date(1559313345833L))
                                                                          .equalToStateChange(Boolean.FALSE)
                                                                          .notEqualToStateChange(Boolean.FALSE)
                                                                          .equalToId("f932b25b-c910-44da-9c52-9eb81442b1c6")
                                                                          .notEqualToId("b0d24e3c-5d68-4133-8d70-fcdab82c489a")
                                                                          .inIds(Arrays.asList("70502ff2-82d8-4509-ac7f-0c74ed2c8f21",
                                                                                               "a55985ba-2bb2-4ba8-b968-7d673dcaf347",
                                                                                               "8dafbca1-b5c6-4dd5-9d70-2b23677b8969"))
                                                                          .notInIds(Arrays.asList("88a7e6e5-c52d-4347-9892-82ce1a276813",
                                                                                                  "164ccafe-a939-4e72-9b88-78b68cf3c1c0",
                                                                                                  "89b9122e-ee16-4eee-9fe7-9ef8a763480a",
                                                                                                  "b84b659b-99e3-4d14-b772-566a73419f84",
                                                                                                  "77a32626-2a71-4302-85fa-074d8ad86940",
                                                                                                  "a56487f9-bb5f-4514-8188-659ff6169feb",
                                                                                                  "631d82e9-64cb-42ba-9039-15df03091cba"))
                                                                          .equalToEventType("0ba0e7b9-ec22-46aa-b3ec-af2cc468ab6c")
                                                                          .notEqualToEventType("1f12884a-23a8-4904-8eec-8bbd90627aef")
                                                                          .inEventTypes(Arrays.asList("212de1fc-ba99-4aac-b801-9f9327039635",
                                                                                                      "c3323a61-20d8-4fcd-9c0c-a3c463c01e94",
                                                                                                      "62c127d8-e812-4bd7-866a-41fae2624999",
                                                                                                      "09493143-9784-4d83-bbc0-5bed1a2d8b4f"))
                                                                          .notInEventTypes(Arrays.asList("616aa854-15b6-456c-8a5c-caaf3f1ab25b",
                                                                                                         "43fefdc1-fdfd-4eaa-9770-845cff84e42e",
                                                                                                         "56ba148d-215a-44fc-b317-72d70c6eba8b",
                                                                                                         "dd1cdd09-867e-4d87-a975-329572e8d757"));
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("46a7a510-4fe0-42b4-8b09-f56950d022fe",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("1f10b862-d75c-4761-9434-97ac8d7d5138",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.IN));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals(Arrays.asList("7b881e16-b25e-4f75-9d21-d5be18bcc7ca", "724ea281-b41d-4a46-9c4e-f20c971c3b6a",
                                       "a4ccbf0d-4241-4c5e-9717-f43faed04cb5", "9bbf0ac5-5014-4f79-8a6b-8b5cd0c52159",
                                       "997296f8-8fa1-47cb-b050-67ee7fbd7bd4", "85c0ea4a-296f-40eb-bf80-1c085470657f",
                                       "100617fe-15b1-49b0-88f9-864dc4573df1"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals(Arrays.asList("205bf685-b4bd-4c4c-95ac-4f9ba6637733", "b2b0ed3c-928f-4c92-961d-0255b2107a6e",
                                       "439bef4f-11b0-42c6-81b5-068479b7536d", "96aeca31-6d27-4731-bf27-7a34594d2fb8",
                                       "60d1e422-b2fe-4193-bed2-25f7bac486f7", "2b7ac700-85df-4e42-9a07-0f2080425f6a",
                                       "2103742c-cec3-4e76-818a-6b98a659f40f", "be48e7e4-139c-4caa-8d17-b3345920c9e7"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.EQUAL));
            assertNotNull(option.getDescriptionFilters());
            assertEquals("37471b46-a5e6-4e93-9d11-d6edbdfffcf3",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDescriptionFilters());
            assertEquals("e5caef54-a379-44af-b7e2-c4678086d20a",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.IN));
            assertNotNull(option.getDescriptionFilters());
            assertEquals(Arrays.asList("7b71832c-a6aa-4c72-8c91-ad09c20e75d9", "48629fd7-bdf1-4b17-89b6-c28ac0496e4a",
                                       "0f390ffc-3cf4-4e3f-bbbe-f1808c795ed8", "aef85ebb-4ebb-4c13-ac29-8f4fc4ecb0d8"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.NOT_IN));
            assertNotNull(option.getDescriptionFilters());
            assertEquals(Arrays.asList("e8dd74cc-6987-4e8b-adf8-ceef416c4527", "960592f5-18f1-4ea4-ad9e-699692f3e2c9",
                                       "aa45d3dd-e1e7-4c18-a66e-188b8ca05d3f", "91ef2bab-312e-4043-ba8f-316bb1fe2490",
                                       "62f9b55a-c069-4ec7-9c49-e73362da09df", "b02f3cf8-0d96-4a66-bd94-7cd42a71e2d5",
                                       "9ece0567-d958-45d4-89a9-3e71a2dcace8", "5520baff-9fc2-4dbb-ab99-e4895d8bca60"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.IN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(Arrays.asList(new Date(1559313345439L), new Date(1559313347510L), new Date(1559313343763L),
                                       new Date(1559313349353L), new Date(1559313347461L), new Date(1559313342508L),
                                       new Date(1559313346350L), new Date(1559313345981L)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.NOT_IN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(Arrays.asList(new Date(1559313347308L), new Date(1559313343775L), new Date(1559313345977L),
                                       new Date(1559313344078L), new Date(1559313346926L), new Date(1559313347116L),
                                       new Date(1559313348122L)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.LESS_THAN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(new Date(1559313349081L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.GREATER_THAN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(new Date(1559313345833L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE, FilterOperator.EQUAL));
            assertNotNull(option.getStateChangeFilters());
            assertEquals(Boolean.FALSE,
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE,
                                                                    Boolean.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getStateChangeFilters());
            assertEquals(Boolean.FALSE,
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE,
                                                                       Boolean.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("f932b25b-c910-44da-9c52-9eb81442b1c6",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("b0d24e3c-5d68-4133-8d70-fcdab82c489a",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("70502ff2-82d8-4509-ac7f-0c74ed2c8f21", "a55985ba-2bb2-4ba8-b968-7d673dcaf347",
                                       "8dafbca1-b5c6-4dd5-9d70-2b23677b8969"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, List.class,
                                                                 option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("88a7e6e5-c52d-4347-9892-82ce1a276813", "164ccafe-a939-4e72-9b88-78b68cf3c1c0",
                                       "89b9122e-ee16-4eee-9fe7-9ef8a763480a", "b84b659b-99e3-4d14-b772-566a73419f84",
                                       "77a32626-2a71-4302-85fa-074d8ad86940", "a56487f9-bb5f-4514-8188-659ff6169feb",
                                       "631d82e9-64cb-42ba-9039-15df03091cba"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.EQUAL));
            assertNotNull(option.getEventTypeFilters());
            assertEquals("0ba0e7b9-ec22-46aa-b3ec-af2cc468ab6c",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getEventTypeFilters());
            assertEquals("1f12884a-23a8-4904-8eec-8bbd90627aef",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.IN));
            assertNotNull(option.getEventTypeFilters());
            assertEquals(Arrays.asList("212de1fc-ba99-4aac-b801-9f9327039635", "c3323a61-20d8-4fcd-9c0c-a3c463c01e94",
                                       "62c127d8-e812-4bd7-866a-41fae2624999", "09493143-9784-4d83-bbc0-5bed1a2d8b4f"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.NOT_IN));
            assertNotNull(option.getEventTypeFilters());
            assertEquals(Arrays.asList("616aa854-15b6-456c-8a5c-caaf3f1ab25b", "43fefdc1-fdfd-4eaa-9770-845cff84e42e",
                                       "56ba148d-215a-44fc-b317-72d70c6eba8b", "dd1cdd09-867e-4d87-a975-329572e8d757"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                    List.class, option));
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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(44),
                                                                                           Long.valueOf(113),
                                                                                           Order.getDefault(),
                                                                                           "190e7acf-aeea-494d-a12c-54c4a84e2b7b",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(44),
                                                                                           Long.valueOf(113),
                                                                                           Order.getDefault(),
                                                                                           "190e7acf-aeea-494d-a12c-54c4a84e2b7b",
                                                                                           null, null);
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2.hashCode(), deviceeventslistoptions1.hashCode());
            int hashCode = deviceeventslistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceeventslistoptions1.hashCode());
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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(-81),
                                                                                           Long.valueOf(10),
                                                                                           Order.getDefault(),
                                                                                           "cc61fdf9-2fc1-4445-a806-d080d191ef03",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(-81),
                                                                                           Long.valueOf(10),
                                                                                           Order.getDefault(),
                                                                                           "cc61fdf9-2fc1-4445-a806-d080d191ef03",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions3 = new DeviceEventsListOptions(Integer.valueOf(53),
                                                                                           Long.valueOf(123),
                                                                                           Order.getDefault(),
                                                                                           "897908fe-a0d5-4f2a-a1aa-1d44d16b06e7",
                                                                                           null, null);
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotNull(deviceeventslistoptions3);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertNotSame(deviceeventslistoptions3, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions1, deviceeventslistoptions2);
            assertEquals(deviceeventslistoptions1, deviceeventslistoptions1);
            assertFalse(deviceeventslistoptions1.equals(null));
            assertNotEquals(deviceeventslistoptions3, deviceeventslistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
