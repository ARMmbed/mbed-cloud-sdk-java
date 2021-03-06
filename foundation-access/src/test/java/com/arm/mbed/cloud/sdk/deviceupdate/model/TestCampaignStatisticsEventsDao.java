// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Tue May 14 13:12:52 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CampaignStatisticsEventsDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignStatisticsEventsDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignStatisticsEventsDao campaignstatisticseventsdao1 = new CampaignStatisticsEventsDao();
            CampaignStatisticsEventsDao campaignstatisticseventsdao2 = campaignstatisticseventsdao1.clone();
            assertNotNull(campaignstatisticseventsdao1);
            assertNotNull(campaignstatisticseventsdao2);
            assertNotSame(campaignstatisticseventsdao2, campaignstatisticseventsdao1);
            assertEquals(campaignstatisticseventsdao2, campaignstatisticseventsdao1);
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
            CampaignStatisticsEventsDao campaignstatisticseventsdao1 = new CampaignStatisticsEventsDao();
            CampaignStatisticsEventsDao campaignstatisticseventsdao2 = new CampaignStatisticsEventsDao();
            assertNotNull(campaignstatisticseventsdao1);
            assertNotNull(campaignstatisticseventsdao2);
            assertNotSame(campaignstatisticseventsdao2, campaignstatisticseventsdao1);
            assertEquals(campaignstatisticseventsdao2, campaignstatisticseventsdao1);
            assertEquals(campaignstatisticseventsdao2.hashCode(), campaignstatisticseventsdao1.hashCode());
            int hashCode = campaignstatisticseventsdao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaignstatisticseventsdao1.hashCode());
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
            CampaignStatisticsEventsDao campaignstatisticseventsdao1 = new CampaignStatisticsEventsDao();
            CampaignStatisticsEventsDao campaignstatisticseventsdao2 = new CampaignStatisticsEventsDao();
            assertNotNull(campaignstatisticseventsdao1);
            assertNotNull(campaignstatisticseventsdao2);
            assertNotSame(campaignstatisticseventsdao2, campaignstatisticseventsdao1);
            assertEquals(campaignstatisticseventsdao2, campaignstatisticseventsdao1);
            assertEquals(campaignstatisticseventsdao2, campaignstatisticseventsdao1);
            assertEquals(campaignstatisticseventsdao1, campaignstatisticseventsdao2);
            assertEquals(campaignstatisticseventsdao1, campaignstatisticseventsdao1);
            assertFalse(campaignstatisticseventsdao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
