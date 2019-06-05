// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model LightThemeImageListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLightThemeImageListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            LightThemeImageListOptions lightthemeimagelistoptions1 = new LightThemeImageListOptions(Integer.valueOf(-57),
                                                                                                    Long.valueOf(-47),
                                                                                                    Order.getDefault(),
                                                                                                    "8e75ab01-5037-4d29-a3d6-be41eaca3eae",
                                                                                                    null, null);
            LightThemeImageListOptions lightthemeimagelistoptions2 = lightthemeimagelistoptions1.clone();
            assertNotNull(lightthemeimagelistoptions1);
            assertNotNull(lightthemeimagelistoptions2);
            assertNotSame(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
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
            LightThemeImageListOptions lightthemeimagelistoptions1 = new LightThemeImageListOptions(Integer.valueOf(-24),
                                                                                                    Long.valueOf(71),
                                                                                                    Order.getDefault(),
                                                                                                    "f85c3796-4a9e-4496-a110-662f2f49b6a4",
                                                                                                    null, null);
            LightThemeImageListOptions lightthemeimagelistoptions2 = new LightThemeImageListOptions(Integer.valueOf(-24),
                                                                                                    Long.valueOf(71),
                                                                                                    Order.getDefault(),
                                                                                                    "f85c3796-4a9e-4496-a110-662f2f49b6a4",
                                                                                                    null, null);
            assertNotNull(lightthemeimagelistoptions1);
            assertNotNull(lightthemeimagelistoptions2);
            assertNotSame(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions2.hashCode(), lightthemeimagelistoptions1.hashCode());
            int hashCode = lightthemeimagelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, lightthemeimagelistoptions1.hashCode());
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
            LightThemeImageListOptions lightthemeimagelistoptions1 = new LightThemeImageListOptions(Integer.valueOf(-21),
                                                                                                    Long.valueOf(85),
                                                                                                    Order.getDefault(),
                                                                                                    "316b51a6-88c8-4b93-94ca-4cf38e3f63a0",
                                                                                                    null, null);
            LightThemeImageListOptions lightthemeimagelistoptions2 = new LightThemeImageListOptions(Integer.valueOf(-21),
                                                                                                    Long.valueOf(85),
                                                                                                    Order.getDefault(),
                                                                                                    "316b51a6-88c8-4b93-94ca-4cf38e3f63a0",
                                                                                                    null, null);
            LightThemeImageListOptions lightthemeimagelistoptions3 = new LightThemeImageListOptions(Integer.valueOf(-74),
                                                                                                    Long.valueOf(22),
                                                                                                    Order.getDefault(),
                                                                                                    "795ea5e8-b1d3-4b16-8ce6-ba2d7d7a50f3",
                                                                                                    null, null);
            assertNotNull(lightthemeimagelistoptions1);
            assertNotNull(lightthemeimagelistoptions2);
            assertNotNull(lightthemeimagelistoptions3);
            assertNotSame(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertNotSame(lightthemeimagelistoptions3, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions1, lightthemeimagelistoptions2);
            assertEquals(lightthemeimagelistoptions1, lightthemeimagelistoptions1);
            assertFalse(lightthemeimagelistoptions1.equals(null));
            assertNotEquals(lightthemeimagelistoptions3, lightthemeimagelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
