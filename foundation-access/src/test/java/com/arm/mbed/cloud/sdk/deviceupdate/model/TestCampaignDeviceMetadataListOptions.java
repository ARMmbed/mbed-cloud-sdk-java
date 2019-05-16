// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model CampaignDeviceMetadataListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignDeviceMetadataListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignDeviceMetadataListOptions campaigndevicemetadatalistoptions1 = new CampaignDeviceMetadataListOptions(Integer.valueOf(59),
                                                                                                                         Long.valueOf(-98),
                                                                                                                         Order.getDefault(),
                                                                                                                         "7cec38ef-7352-4d45-beda-b336aee8c16d",
                                                                                                                         null,
                                                                                                                         null);
            CampaignDeviceMetadataListOptions campaigndevicemetadatalistoptions2 = campaigndevicemetadatalistoptions1.clone();
            assertNotNull(campaigndevicemetadatalistoptions1);
            assertNotNull(campaigndevicemetadatalistoptions2);
            assertNotSame(campaigndevicemetadatalistoptions2, campaigndevicemetadatalistoptions1);
            assertEquals(campaigndevicemetadatalistoptions2, campaigndevicemetadatalistoptions1);
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
            CampaignDeviceMetadataListOptions campaigndevicemetadatalistoptions1 = new CampaignDeviceMetadataListOptions(Integer.valueOf(58),
                                                                                                                         Long.valueOf(73),
                                                                                                                         Order.getDefault(),
                                                                                                                         "ebfbbef2-1eaa-49d0-a11d-61ee9ab1fd9e",
                                                                                                                         null,
                                                                                                                         null);
            CampaignDeviceMetadataListOptions campaigndevicemetadatalistoptions2 = new CampaignDeviceMetadataListOptions(Integer.valueOf(58),
                                                                                                                         Long.valueOf(73),
                                                                                                                         Order.getDefault(),
                                                                                                                         "ebfbbef2-1eaa-49d0-a11d-61ee9ab1fd9e",
                                                                                                                         null,
                                                                                                                         null);
            assertNotNull(campaigndevicemetadatalistoptions1);
            assertNotNull(campaigndevicemetadatalistoptions2);
            assertNotSame(campaigndevicemetadatalistoptions2, campaigndevicemetadatalistoptions1);
            assertEquals(campaigndevicemetadatalistoptions2, campaigndevicemetadatalistoptions1);
            assertEquals(campaigndevicemetadatalistoptions2.hashCode(), campaigndevicemetadatalistoptions1.hashCode());
            int hashCode = campaigndevicemetadatalistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaigndevicemetadatalistoptions1.hashCode());
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
            CampaignDeviceMetadataListOptions campaigndevicemetadatalistoptions1 = new CampaignDeviceMetadataListOptions(Integer.valueOf(-10),
                                                                                                                         Long.valueOf(87),
                                                                                                                         Order.getDefault(),
                                                                                                                         "07ac7903-eebd-43fd-9546-15ffe8a879df",
                                                                                                                         null,
                                                                                                                         null);
            CampaignDeviceMetadataListOptions campaigndevicemetadatalistoptions2 = new CampaignDeviceMetadataListOptions(Integer.valueOf(-10),
                                                                                                                         Long.valueOf(87),
                                                                                                                         Order.getDefault(),
                                                                                                                         "07ac7903-eebd-43fd-9546-15ffe8a879df",
                                                                                                                         null,
                                                                                                                         null);
            CampaignDeviceMetadataListOptions campaigndevicemetadatalistoptions3 = new CampaignDeviceMetadataListOptions(Integer.valueOf(-58),
                                                                                                                         Long.valueOf(-124),
                                                                                                                         Order.getDefault(),
                                                                                                                         "54927313-4fca-47f9-b393-73db646a5009",
                                                                                                                         null,
                                                                                                                         null);
            assertNotNull(campaigndevicemetadatalistoptions1);
            assertNotNull(campaigndevicemetadatalistoptions2);
            assertNotNull(campaigndevicemetadatalistoptions3);
            assertNotSame(campaigndevicemetadatalistoptions2, campaigndevicemetadatalistoptions1);
            assertNotSame(campaigndevicemetadatalistoptions3, campaigndevicemetadatalistoptions1);
            assertEquals(campaigndevicemetadatalistoptions2, campaigndevicemetadatalistoptions1);
            assertEquals(campaigndevicemetadatalistoptions2, campaigndevicemetadatalistoptions1);
            assertEquals(campaigndevicemetadatalistoptions1, campaigndevicemetadatalistoptions2);
            assertEquals(campaigndevicemetadatalistoptions1, campaigndevicemetadatalistoptions1);
            assertFalse(campaigndevicemetadatalistoptions1.equals(null));
            assertNotEquals(campaigndevicemetadatalistoptions3, campaigndevicemetadatalistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
