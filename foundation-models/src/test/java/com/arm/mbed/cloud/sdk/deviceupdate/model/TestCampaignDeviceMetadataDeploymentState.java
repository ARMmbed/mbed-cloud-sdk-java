// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CampaignDeviceMetadataDeploymentState.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignDeviceMetadataDeploymentState {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            CampaignDeviceMetadataDeploymentState campaigndevicemetadatadeploymentstate = CampaignDeviceMetadataDeploymentState.getValue(null);
            assertNotNull(campaigndevicemetadatadeploymentstate);
            assertTrue(campaigndevicemetadatadeploymentstate.isDefault());
            campaigndevicemetadatadeploymentstate = CampaignDeviceMetadataDeploymentState.getValue(CampaignDeviceMetadataDeploymentState.getDefault()
                                                                                                                                        .getString());
            assertNotNull(campaigndevicemetadatadeploymentstate);
            assertTrue(campaigndevicemetadatadeploymentstate.isDefault());
            campaigndevicemetadatadeploymentstate = CampaignDeviceMetadataDeploymentState.getValue("DEPLOYED");
            assertNotNull(campaigndevicemetadatadeploymentstate);
            assertTrue(campaigndevicemetadatadeploymentstate.isDefault());
            campaigndevicemetadatadeploymentstate = CampaignDeviceMetadataDeploymentState.getValue("deregistered");
            assertNotNull(campaigndevicemetadatadeploymentstate);
            assertFalse(campaigndevicemetadatadeploymentstate.isDefault());
            campaigndevicemetadatadeploymentstate = CampaignDeviceMetadataDeploymentState.getValue("b676592c-627a-4cae-91f7-3862a692224e");
            assertNotNull(campaigndevicemetadatadeploymentstate);
            assertTrue(campaigndevicemetadatadeploymentstate.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
