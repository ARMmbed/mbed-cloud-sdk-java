// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DaoFactory.
 */
public class TestDaoFactory {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            DaoFactory daofactory1 = new DaoFactory((DaoFactory) null);
            DaoFactory daofactory2 = daofactory1.clone();
            assertNotNull(daofactory1);
            assertNotNull(daofactory2);
            assertNotSame(daofactory2, daofactory1);
            assertEquals(daofactory2, daofactory1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
