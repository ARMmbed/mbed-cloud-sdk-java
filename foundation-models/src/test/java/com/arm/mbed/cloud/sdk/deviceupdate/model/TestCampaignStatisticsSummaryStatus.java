// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CampaignStatisticsSummaryStatus.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignStatisticsSummaryStatus {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            CampaignStatisticsSummaryStatus campaignstatisticssummarystatus = CampaignStatisticsSummaryStatus.getValue(null);
            assertNotNull(campaignstatisticssummarystatus);
            assertTrue(campaignstatisticssummarystatus.isDefault());
            campaignstatisticssummarystatus = CampaignStatisticsSummaryStatus.getValue(CampaignStatisticsSummaryStatus.getDefault()
                                                                                                                      .getString());
            assertNotNull(campaignstatisticssummarystatus);
            assertTrue(campaignstatisticssummarystatus.isDefault());
            campaignstatisticssummarystatus = CampaignStatisticsSummaryStatus.getValue("FAIL");
            assertNotNull(campaignstatisticssummarystatus);
            assertTrue(campaignstatisticssummarystatus.isDefault());
            campaignstatisticssummarystatus = CampaignStatisticsSummaryStatus.getValue("INFO");
            assertNotNull(campaignstatisticssummarystatus);
            assertFalse(campaignstatisticssummarystatus.isDefault());
            campaignstatisticssummarystatus = CampaignStatisticsSummaryStatus.getValue("72b3eb04-c203-44b4-9852-d83eb8ecc564");
            assertNotNull(campaignstatisticssummarystatus);
            assertTrue(campaignstatisticssummarystatus.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
