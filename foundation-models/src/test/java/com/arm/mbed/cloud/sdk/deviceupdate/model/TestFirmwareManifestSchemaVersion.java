// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model FirmwareManifestSchemaVersion.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestFirmwareManifestSchemaVersion {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            FirmwareManifestSchemaVersion firmwaremanifestschemaversion = FirmwareManifestSchemaVersion.getValue(null);
            assertNotNull(firmwaremanifestschemaversion);
            assertTrue(firmwaremanifestschemaversion.isDefault());
            firmwaremanifestschemaversion = FirmwareManifestSchemaVersion.getValue(FirmwareManifestSchemaVersion.getDefault()
                                                                                                                .getString());
            assertNotNull(firmwaremanifestschemaversion);
            assertTrue(firmwaremanifestschemaversion.isDefault());
            firmwaremanifestschemaversion = FirmwareManifestSchemaVersion.getValue("1");
            assertNotNull(firmwaremanifestschemaversion);
            assertTrue(firmwaremanifestschemaversion.isDefault());
            firmwaremanifestschemaversion = FirmwareManifestSchemaVersion.getValue("3");
            assertNotNull(firmwaremanifestschemaversion);
            assertFalse(firmwaremanifestschemaversion.isDefault());
            firmwaremanifestschemaversion = FirmwareManifestSchemaVersion.getValue("11300dec-eba5-46af-ac78-43db189d630b");
            assertNotNull(firmwaremanifestschemaversion);
            assertTrue(firmwaremanifestschemaversion.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
