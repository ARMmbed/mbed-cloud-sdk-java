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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(8),
                                                                                           Long.valueOf(-62),
                                                                                           Order.getDefault(),
                                                                                           "ad0e44b5-eb27-4bb2-b24b-b9e74706eafe",
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
            DeviceEventsListOptions option = new DeviceEventsListOptions().equalToDeviceId("82bba09e-14de-43ef-a477-ba9745385cdc")
                                                                          .notEqualToDeviceId("3af1538a-07dd-4e18-a080-7653658ea7a2")
                                                                          .inDeviceIds(Arrays.asList("b632a584-b3a8-40b0-8068-118662be7d60"))
                                                                          .notInDeviceIds(Arrays.asList("4fc5814f-3859-4769-9e5e-a75133e41f74",
                                                                                                        "ddc654b8-9f01-406b-83ef-756d4d9a0c1e"))
                                                                          .equalToDescription("c945f233-0f43-4ece-b944-066a7525df7e")
                                                                          .notEqualToDescription("98770b96-0c57-4522-ac79-6113807922cd")
                                                                          .inDescriptions(Arrays.asList("312e2357-57fb-4f30-90b9-7cffddc242a8"))
                                                                          .notInDescriptions(Arrays.asList("86459179-eb4e-4dec-95fa-d32800712fb9",
                                                                                                           "969d8ed6-298d-4215-a977-4ddb2af205cb",
                                                                                                           "6df1df52-35ef-4af4-a2e4-f2903a4c7ae5",
                                                                                                           "3ed5715b-a6b3-4db8-951a-68946d55163c",
                                                                                                           "73ecbca1-caf4-42fe-95ff-c57033e63ab7",
                                                                                                           "4057314b-c3ec-4db0-aa1d-53207e55ab07",
                                                                                                           "ea655417-b87e-4029-943e-0238af4f24aa"))
                                                                          .inDateTimes(Arrays.asList(new Date(1565779003911L),
                                                                                                     new Date(1565779002736L),
                                                                                                     new Date(1565779006810L),
                                                                                                     new Date(1565779000759L),
                                                                                                     new Date(1565779008497L),
                                                                                                     new Date(1565779002577L),
                                                                                                     new Date(1565779000203L)))
                                                                          .notInDateTimes(Arrays.asList(new Date(1565779008024L),
                                                                                                        new Date(1565779008557L),
                                                                                                        new Date(1565779003154L),
                                                                                                        new Date(1565779001777L),
                                                                                                        new Date(1565779001290L),
                                                                                                        new Date(1565779004893L),
                                                                                                        new Date(1565779008071L),
                                                                                                        new Date(1565779002710L)))
                                                                          .lessThanDateTime(new Date(1565779007001L))
                                                                          .greaterThanDateTime(new Date(1565779003192L))
                                                                          .equalToStateChange(Boolean.TRUE)
                                                                          .notEqualToStateChange(Boolean.FALSE)
                                                                          .equalToId("afd0bb68-40ca-4937-a931-efec194547e8")
                                                                          .notEqualToId("52618f99-4691-4d14-8985-356b5a2334b8")
                                                                          .inIds(Arrays.asList("3fd575c0-f39b-4c71-9847-7ec9ae2d2384",
                                                                                               "bad8fa43-914a-4017-8880-1d1fc56c0591",
                                                                                               "96f2bf02-54e2-411f-b5ce-1b0e510a69f4",
                                                                                               "4d5e5fb5-678e-49cf-9891-7817ee7f20eb",
                                                                                               "c289b8a6-fde8-4d49-956f-ebb953475e40",
                                                                                               "525fcb29-e248-4291-9ec5-cebc0a6c44c3",
                                                                                               "be5e28cd-d7f4-4807-9ed3-fe21f827c8a9"))
                                                                          .notInIds(Arrays.asList("e3961f2f-fce8-4f5f-89a8-697dce4b4fdb",
                                                                                                  "98a3189d-5aab-4a41-8652-8fe6331b8e75",
                                                                                                  "b50bf6f2-caf3-4a56-af0f-024e18ba6445",
                                                                                                  "92901831-bb39-4bdf-80b8-a56c9d8c2ec9",
                                                                                                  "f45cd248-d98c-4c74-afb0-6a7c5399b1fd",
                                                                                                  "b7e59b2e-6f45-4cce-a0e9-46671ff3f950",
                                                                                                  "ec6f6d94-6114-424d-9590-b4c305394e83"))
                                                                          .equalToEventType("eddef905-7139-4ca1-b5c4-0d76ca58f04f")
                                                                          .notEqualToEventType("e684aee1-5e83-418f-ba95-60223e399ac2")
                                                                          .inEventTypes(Arrays.asList("510237be-320f-43f8-9997-f5a5a83e925f",
                                                                                                      "f771240d-d060-4a8a-a292-a0054082dcff",
                                                                                                      "a4ba18aa-fc26-4b3f-a34a-ad0b89c02585",
                                                                                                      "8185ca1f-1d9d-4eaf-8a62-6b13c35acc3a",
                                                                                                      "06c04cf5-06ec-47fe-8b90-12ce60e46242",
                                                                                                      "4c1cd355-777f-49a1-b325-8ff00ffacc1e",
                                                                                                      "6d6458de-b6de-4e5e-9ed9-e988068581c1",
                                                                                                      "1891293e-6c83-47b8-851f-4d858b9c7168"))
                                                                          .notInEventTypes(Arrays.asList("cc967e42-f208-478c-b2ff-fe0227c4e30b",
                                                                                                         "24460cd5-5285-4b0e-96e0-a90204bc6a04",
                                                                                                         "7df69650-0b62-4b97-b82f-45bdcea019f0",
                                                                                                         "92f7a082-513b-409d-9d1d-897de170a272",
                                                                                                         "fa7c01d9-77e7-4c9e-954c-92d42b6db454"));
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("82bba09e-14de-43ef-a477-ba9745385cdc",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("3af1538a-07dd-4e18-a080-7653658ea7a2",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.IN));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals(Arrays.asList("b632a584-b3a8-40b0-8068-118662be7d60"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals(Arrays.asList("4fc5814f-3859-4769-9e5e-a75133e41f74", "ddc654b8-9f01-406b-83ef-756d4d9a0c1e"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.EQUAL));
            assertNotNull(option.getDescriptionFilters());
            assertEquals("c945f233-0f43-4ece-b944-066a7525df7e",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDescriptionFilters());
            assertEquals("98770b96-0c57-4522-ac79-6113807922cd",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.IN));
            assertNotNull(option.getDescriptionFilters());
            assertEquals(Arrays.asList("312e2357-57fb-4f30-90b9-7cffddc242a8"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.NOT_IN));
            assertNotNull(option.getDescriptionFilters());
            assertEquals(Arrays.asList("86459179-eb4e-4dec-95fa-d32800712fb9", "969d8ed6-298d-4215-a977-4ddb2af205cb",
                                       "6df1df52-35ef-4af4-a2e4-f2903a4c7ae5", "3ed5715b-a6b3-4db8-951a-68946d55163c",
                                       "73ecbca1-caf4-42fe-95ff-c57033e63ab7", "4057314b-c3ec-4db0-aa1d-53207e55ab07",
                                       "ea655417-b87e-4029-943e-0238af4f24aa"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.IN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(Arrays.asList(new Date(1565779003911L), new Date(1565779002736L), new Date(1565779006810L),
                                       new Date(1565779000759L), new Date(1565779008497L), new Date(1565779002577L),
                                       new Date(1565779000203L)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.NOT_IN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(Arrays.asList(new Date(1565779008024L), new Date(1565779008557L), new Date(1565779003154L),
                                       new Date(1565779001777L), new Date(1565779001290L), new Date(1565779004893L),
                                       new Date(1565779008071L), new Date(1565779002710L)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.LESS_THAN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(new Date(1565779007001L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.GREATER_THAN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(new Date(1565779003192L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE, FilterOperator.EQUAL));
            assertNotNull(option.getStateChangeFilters());
            assertEquals(Boolean.TRUE,
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
            assertEquals("afd0bb68-40ca-4937-a931-efec194547e8",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("52618f99-4691-4d14-8985-356b5a2334b8",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("3fd575c0-f39b-4c71-9847-7ec9ae2d2384", "bad8fa43-914a-4017-8880-1d1fc56c0591",
                                       "96f2bf02-54e2-411f-b5ce-1b0e510a69f4", "4d5e5fb5-678e-49cf-9891-7817ee7f20eb",
                                       "c289b8a6-fde8-4d49-956f-ebb953475e40", "525fcb29-e248-4291-9ec5-cebc0a6c44c3",
                                       "be5e28cd-d7f4-4807-9ed3-fe21f827c8a9"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, List.class,
                                                                 option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("e3961f2f-fce8-4f5f-89a8-697dce4b4fdb", "98a3189d-5aab-4a41-8652-8fe6331b8e75",
                                       "b50bf6f2-caf3-4a56-af0f-024e18ba6445", "92901831-bb39-4bdf-80b8-a56c9d8c2ec9",
                                       "f45cd248-d98c-4c74-afb0-6a7c5399b1fd", "b7e59b2e-6f45-4cce-a0e9-46671ff3f950",
                                       "ec6f6d94-6114-424d-9590-b4c305394e83"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.EQUAL));
            assertNotNull(option.getEventTypeFilters());
            assertEquals("eddef905-7139-4ca1-b5c4-0d76ca58f04f",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getEventTypeFilters());
            assertEquals("e684aee1-5e83-418f-ba95-60223e399ac2",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.IN));
            assertNotNull(option.getEventTypeFilters());
            assertEquals(Arrays.asList("510237be-320f-43f8-9997-f5a5a83e925f", "f771240d-d060-4a8a-a292-a0054082dcff",
                                       "a4ba18aa-fc26-4b3f-a34a-ad0b89c02585", "8185ca1f-1d9d-4eaf-8a62-6b13c35acc3a",
                                       "06c04cf5-06ec-47fe-8b90-12ce60e46242", "4c1cd355-777f-49a1-b325-8ff00ffacc1e",
                                       "6d6458de-b6de-4e5e-9ed9-e988068581c1", "1891293e-6c83-47b8-851f-4d858b9c7168"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.NOT_IN));
            assertNotNull(option.getEventTypeFilters());
            assertEquals(Arrays.asList("cc967e42-f208-478c-b2ff-fe0227c4e30b", "24460cd5-5285-4b0e-96e0-a90204bc6a04",
                                       "7df69650-0b62-4b97-b82f-45bdcea019f0", "92f7a082-513b-409d-9d1d-897de170a272",
                                       "fa7c01d9-77e7-4c9e-954c-92d42b6db454"),
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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(35),
                                                                                           Long.valueOf(-14),
                                                                                           Order.getDefault(),
                                                                                           "4abab6c5-65ae-4429-bb84-61957f53c3b0",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(35),
                                                                                           Long.valueOf(-14),
                                                                                           Order.getDefault(),
                                                                                           "4abab6c5-65ae-4429-bb84-61957f53c3b0",
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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(67),
                                                                                           Long.valueOf(-31),
                                                                                           Order.getDefault(),
                                                                                           "934a9560-8a90-488f-a7e3-1c0bff313313",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(67),
                                                                                           Long.valueOf(-31),
                                                                                           Order.getDefault(),
                                                                                           "934a9560-8a90-488f-a7e3-1c0bff313313",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions3 = new DeviceEventsListOptions(Integer.valueOf(111),
                                                                                           Long.valueOf(120),
                                                                                           Order.getDefault(),
                                                                                           "2a029e18-64b2-408f-8496-ffc5a4e3186e",
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
