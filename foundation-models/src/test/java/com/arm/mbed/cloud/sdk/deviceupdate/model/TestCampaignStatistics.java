// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CampaignStatistics.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignStatistics {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignStatistics campaignstatistics1 = new CampaignStatistics("2e7da93f-76ec-4fa5-b668-0be46a13f8c3", 114,
                                                                            new Date(1559746949259L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            CampaignStatistics campaignstatistics2 = campaignstatistics1.clone();
            assertNotNull(campaignstatistics1);
            assertNotNull(campaignstatistics2);
            assertNotSame(campaignstatistics2, campaignstatistics1);
            assertEquals(campaignstatistics2, campaignstatistics1);
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
            CampaignStatistics campaignstatistics1 = new CampaignStatistics("6235fed8-8672-413e-b994-087dc546f283", 39,
                                                                            new Date(1559746951345L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            CampaignStatistics campaignstatistics2 = new CampaignStatistics("6235fed8-8672-413e-b994-087dc546f283", 39,
                                                                            new Date(1559746951345L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            assertNotNull(campaignstatistics1);
            assertNotNull(campaignstatistics2);
            assertNotSame(campaignstatistics2, campaignstatistics1);
            assertEquals(campaignstatistics2, campaignstatistics1);
            assertEquals(campaignstatistics2.hashCode(), campaignstatistics1.hashCode());
            int hashCode = campaignstatistics1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaignstatistics1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        CampaignStatistics campaignstatistics = new CampaignStatistics("51efe7d4-0f4e-4229-a69a-a8ebc901d709", 35,
                                                                       new Date(1559746950320L),
                                                                       CampaignStatisticsId.getDefault(),
                                                                       CampaignStatisticsSummaryStatus.getDefault());
        assertTrue(campaignstatistics.isValid());
        CampaignStatistics campaignstatisticsInvalid = new CampaignStatistics(null, 116, new Date(1559746950665L),
                                                                              CampaignStatisticsId.getDefault(),
                                                                              CampaignStatisticsSummaryStatus.getDefault());
        assertFalse(campaignstatisticsInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CampaignStatistics campaignstatistics1 = new CampaignStatistics("ac0bb1b8-21d6-4ab2-81fb-8e99ea201e1a", 110,
                                                                            new Date(1559746948899L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            CampaignStatistics campaignstatistics2 = new CampaignStatistics("ac0bb1b8-21d6-4ab2-81fb-8e99ea201e1a", 110,
                                                                            new Date(1559746948899L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            CampaignStatistics campaignstatistics3 = new CampaignStatistics("722629d3-eea5-4f96-866d-2ee725a23a6c", -6,
                                                                            new Date(1559746949744L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            assertNotNull(campaignstatistics1);
            assertNotNull(campaignstatistics2);
            assertNotNull(campaignstatistics3);
            assertNotSame(campaignstatistics2, campaignstatistics1);
            assertNotSame(campaignstatistics3, campaignstatistics1);
            assertEquals(campaignstatistics2, campaignstatistics1);
            assertEquals(campaignstatistics2, campaignstatistics1);
            assertEquals(campaignstatistics1, campaignstatistics2);
            assertEquals(campaignstatistics1, campaignstatistics1);
            assertFalse(campaignstatistics1.equals(null));
            assertNotEquals(campaignstatistics3, campaignstatistics1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
