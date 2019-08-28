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
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-72),
                                                                                                                               Long.valueOf(17),
                                                                                                                               Order.getDefault(),
                                                                                                                               "12c2da93-9e68-45c7-a997-286041db8dff",
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
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(114),
                                                                                                                               Long.valueOf(94),
                                                                                                                               Order.getDefault(),
                                                                                                                               "65dd3cee-a659-4372-a6ac-30ee43db9290",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions2 = new CampaignStatisticsEventsListOptions(Integer.valueOf(114),
                                                                                                                               Long.valueOf(94),
                                                                                                                               Order.getDefault(),
                                                                                                                               "65dd3cee-a659-4372-a6ac-30ee43db9290",
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
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-110),
                                                                                                                               Long.valueOf(29),
                                                                                                                               Order.getDefault(),
                                                                                                                               "45dabca1-7330-4def-a232-0f87cfa33094",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions2 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-110),
                                                                                                                               Long.valueOf(29),
                                                                                                                               Order.getDefault(),
                                                                                                                               "45dabca1-7330-4def-a232-0f87cfa33094",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions3 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-68),
                                                                                                                               Long.valueOf(15),
                                                                                                                               Order.getDefault(),
                                                                                                                               "7d28af1b-df42-4cd5-bec7-695f5ca42a81",
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
