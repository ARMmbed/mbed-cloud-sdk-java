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
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(91),
                                                                                                                               Long.valueOf(71),
                                                                                                                               Order.getDefault(),
                                                                                                                               "06723b13-f952-462f-a9ae-72e6489c553c",
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
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(24),
                                                                                                                               Long.valueOf(-5),
                                                                                                                               Order.getDefault(),
                                                                                                                               "b552a08a-387b-4d9c-9d9e-50cb10b5f5ce",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions2 = new CampaignStatisticsEventsListOptions(Integer.valueOf(24),
                                                                                                                               Long.valueOf(-5),
                                                                                                                               Order.getDefault(),
                                                                                                                               "b552a08a-387b-4d9c-9d9e-50cb10b5f5ce",
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
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-57),
                                                                                                                               Long.valueOf(-92),
                                                                                                                               Order.getDefault(),
                                                                                                                               "2bb15ccb-9981-4f68-9370-0f0554a49e3b",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions2 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-57),
                                                                                                                               Long.valueOf(-92),
                                                                                                                               Order.getDefault(),
                                                                                                                               "2bb15ccb-9981-4f68-9370-0f0554a49e3b",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions3 = new CampaignStatisticsEventsListOptions(Integer.valueOf(85),
                                                                                                                               Long.valueOf(-91),
                                                                                                                               Order.getDefault(),
                                                                                                                               "d5539801-1d89-4029-b3f0-1c01bf263504",
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