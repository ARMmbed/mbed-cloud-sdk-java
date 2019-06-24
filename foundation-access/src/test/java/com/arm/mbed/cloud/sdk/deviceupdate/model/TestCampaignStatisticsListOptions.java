// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model CampaignStatisticsListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignStatisticsListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignStatisticsListOptions campaignstatisticslistoptions1 = new CampaignStatisticsListOptions(Integer.valueOf(-119),
                                                                                                             Long.valueOf(-48),
                                                                                                             Order.getDefault(),
                                                                                                             "e58e3755-f6ab-4fd1-a14f-0dbda93de427",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions2 = campaignstatisticslistoptions1.clone();
            assertNotNull(campaignstatisticslistoptions1);
            assertNotNull(campaignstatisticslistoptions2);
            assertNotSame(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
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
            CampaignStatisticsListOptions campaignstatisticslistoptions1 = new CampaignStatisticsListOptions(Integer.valueOf(62),
                                                                                                             Long.valueOf(-25),
                                                                                                             Order.getDefault(),
                                                                                                             "228f1406-1385-4fb8-bd3f-d6f35161247b",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions2 = new CampaignStatisticsListOptions(Integer.valueOf(62),
                                                                                                             Long.valueOf(-25),
                                                                                                             Order.getDefault(),
                                                                                                             "228f1406-1385-4fb8-bd3f-d6f35161247b",
                                                                                                             null,
                                                                                                             null);
            assertNotNull(campaignstatisticslistoptions1);
            assertNotNull(campaignstatisticslistoptions2);
            assertNotSame(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions2.hashCode(), campaignstatisticslistoptions1.hashCode());
            int hashCode = campaignstatisticslistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaignstatisticslistoptions1.hashCode());
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
            CampaignStatisticsListOptions campaignstatisticslistoptions1 = new CampaignStatisticsListOptions(Integer.valueOf(25),
                                                                                                             Long.valueOf(103),
                                                                                                             Order.getDefault(),
                                                                                                             "7f00c16a-c83d-48fd-9657-26843938de47",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions2 = new CampaignStatisticsListOptions(Integer.valueOf(25),
                                                                                                             Long.valueOf(103),
                                                                                                             Order.getDefault(),
                                                                                                             "7f00c16a-c83d-48fd-9657-26843938de47",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions3 = new CampaignStatisticsListOptions(Integer.valueOf(-60),
                                                                                                             Long.valueOf(84),
                                                                                                             Order.getDefault(),
                                                                                                             "e6c4089f-1a38-47a8-807b-0e8118a51f66",
                                                                                                             null,
                                                                                                             null);
            assertNotNull(campaignstatisticslistoptions1);
            assertNotNull(campaignstatisticslistoptions2);
            assertNotNull(campaignstatisticslistoptions3);
            assertNotSame(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertNotSame(campaignstatisticslistoptions3, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions1, campaignstatisticslistoptions2);
            assertEquals(campaignstatisticslistoptions1, campaignstatisticslistoptions1);
            assertFalse(campaignstatisticslistoptions1.equals(null));
            assertNotEquals(campaignstatisticslistoptions3, campaignstatisticslistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
