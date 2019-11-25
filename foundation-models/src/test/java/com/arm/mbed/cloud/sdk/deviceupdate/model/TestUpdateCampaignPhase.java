// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model UpdateCampaignPhase.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUpdateCampaignPhase {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            UpdateCampaignPhase updatecampaignphase = UpdateCampaignPhase.getValue(null);
            assertNotNull(updatecampaignphase);
            assertTrue(updatecampaignphase.isDefault());
            updatecampaignphase = UpdateCampaignPhase.getValue(UpdateCampaignPhase.getDefault().getString());
            assertNotNull(updatecampaignphase);
            assertTrue(updatecampaignphase.isDefault());
            updatecampaignphase = UpdateCampaignPhase.getValue("ACTIVE");
            assertNotNull(updatecampaignphase);
            assertTrue(updatecampaignphase.isDefault());
            updatecampaignphase = UpdateCampaignPhase.getValue("archived");
            assertNotNull(updatecampaignphase);
            assertFalse(updatecampaignphase.isDefault());
            updatecampaignphase = UpdateCampaignPhase.getValue("fd76e791-e9cf-4075-96cb-1d23b06453ef");
            assertNotNull(updatecampaignphase);
            assertTrue(updatecampaignphase.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
