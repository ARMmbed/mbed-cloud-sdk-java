// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model CampaignStatisticsEventsListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignStatisticsEventsListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-38),
                                                                                                                               Long.valueOf(-127),
                                                                                                                               Order.getDefault(),
                                                                                                                               "a9acfd24-5106-43d2-9adf-b4b9120d7207",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions2 = campaignstatisticseventslistoptions1.clone();
            assertNotNull(campaignstatisticseventslistoptions1);
            assertNotNull(campaignstatisticseventslistoptions2);
            assertNotSame(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
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
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(101),
                                                                                                                               Long.valueOf(101),
                                                                                                                               Order.getDefault(),
                                                                                                                               "9795afe7-d014-49f4-947c-e1929e00560d",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions2 = new CampaignStatisticsEventsListOptions(Integer.valueOf(101),
                                                                                                                               Long.valueOf(101),
                                                                                                                               Order.getDefault(),
                                                                                                                               "9795afe7-d014-49f4-947c-e1929e00560d",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(campaignstatisticseventslistoptions1);
            assertNotNull(campaignstatisticseventslistoptions2);
            assertNotSame(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions2.hashCode(),
                         campaignstatisticseventslistoptions1.hashCode());
            int hashCode = campaignstatisticseventslistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaignstatisticseventslistoptions1.hashCode());
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
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-51),
                                                                                                                               Long.valueOf(-55),
                                                                                                                               Order.getDefault(),
                                                                                                                               "95f347e6-83cb-41a5-9f5b-ea579d823096",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions2 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-51),
                                                                                                                               Long.valueOf(-55),
                                                                                                                               Order.getDefault(),
                                                                                                                               "95f347e6-83cb-41a5-9f5b-ea579d823096",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions3 = new CampaignStatisticsEventsListOptions(Integer.valueOf(47),
                                                                                                                               Long.valueOf(-3),
                                                                                                                               Order.getDefault(),
                                                                                                                               "04cf90e7-df44-466c-95ea-2cde3e1d5290",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(campaignstatisticseventslistoptions1);
            assertNotNull(campaignstatisticseventslistoptions2);
            assertNotNull(campaignstatisticseventslistoptions3);
            assertNotSame(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertNotSame(campaignstatisticseventslistoptions3, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions1, campaignstatisticseventslistoptions2);
            assertEquals(campaignstatisticseventslistoptions1, campaignstatisticseventslistoptions1);
            assertFalse(campaignstatisticseventslistoptions1.equals(null));
            assertNotEquals(campaignstatisticseventslistoptions3, campaignstatisticseventslistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
