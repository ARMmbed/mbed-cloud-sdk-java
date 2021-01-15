// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkEnum;

/**
 * Dark theme image reference.
 */
@Preamble(description = "Dark theme image reference.")
public enum DarkThemeImageReference implements SdkEnum {
    APP_LOGO_LANDSCAPE("app_logo_landscape"),

    APP_LOGO_PORTRAIT("app_logo_portrait"),

    APP_LOGO_SQUARE("app_logo_square"),

    BRAND_LOGO_EMAIL("brand_logo_email"),

    BRAND_LOGO_LANDSCAPE("brand_logo_landscape"),

    BRAND_LOGO_PORTRAIT("brand_logo_portrait"),

    BRAND_LOGO_SQUARE("brand_logo_square"),

    CAROUSEL_IMAGE_LANDSCAPE_0("carousel_image_landscape_0"),

    CAROUSEL_IMAGE_LANDSCAPE_1("carousel_image_landscape_1"),

    CAROUSEL_IMAGE_LANDSCAPE_2("carousel_image_landscape_2"),

    CAROUSEL_IMAGE_LANDSCAPE_3("carousel_image_landscape_3"),

    CAROUSEL_IMAGE_LANDSCAPE_4("carousel_image_landscape_4"),

    CAROUSEL_IMAGE_LANDSCAPE_5("carousel_image_landscape_5"),

    CAROUSEL_IMAGE_LANDSCAPE_6("carousel_image_landscape_6"),

    CAROUSEL_IMAGE_LANDSCAPE_7("carousel_image_landscape_7"),

    CAROUSEL_IMAGE_LANDSCAPE_8("carousel_image_landscape_8"),

    CAROUSEL_IMAGE_LANDSCAPE_9("carousel_image_landscape_9"),

    CAROUSEL_IMAGE_PORTRAIT_0("carousel_image_portrait_0"),

    CAROUSEL_IMAGE_PORTRAIT_1("carousel_image_portrait_1"),

    CAROUSEL_IMAGE_PORTRAIT_2("carousel_image_portrait_2"),

    CAROUSEL_IMAGE_PORTRAIT_3("carousel_image_portrait_3"),

    CAROUSEL_IMAGE_PORTRAIT_4("carousel_image_portrait_4"),

    CAROUSEL_IMAGE_PORTRAIT_5("carousel_image_portrait_5"),

    CAROUSEL_IMAGE_PORTRAIT_6("carousel_image_portrait_6"),

    CAROUSEL_IMAGE_PORTRAIT_7("carousel_image_portrait_7"),

    CAROUSEL_IMAGE_PORTRAIT_8("carousel_image_portrait_8"),

    CAROUSEL_IMAGE_PORTRAIT_9("carousel_image_portrait_9"),

    CAROUSEL_IMAGE_SQUARE_0("carousel_image_square_0"),

    CAROUSEL_IMAGE_SQUARE_1("carousel_image_square_1"),

    CAROUSEL_IMAGE_SQUARE_2("carousel_image_square_2"),

    CAROUSEL_IMAGE_SQUARE_3("carousel_image_square_3"),

    CAROUSEL_IMAGE_SQUARE_4("carousel_image_square_4"),

    CAROUSEL_IMAGE_SQUARE_5("carousel_image_square_5"),

    CAROUSEL_IMAGE_SQUARE_6("carousel_image_square_6"),

    CAROUSEL_IMAGE_SQUARE_7("carousel_image_square_7"),

    CAROUSEL_IMAGE_SQUARE_8("carousel_image_square_8"),

    CAROUSEL_IMAGE_SQUARE_9("carousel_image_square_9"),

    DESKTOP_BACKGROUND_LANDSCAPE("desktop_background_landscape"),

    DESKTOP_BACKGROUND_PORTRAIT("desktop_background_portrait"),

    DESKTOP_BACKGROUND_SQUARE("desktop_background_square"),

    UNKNOWN_ENUM(SDK_UNKNOWN_ENUM_VALUE);

    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -371842842411811L;

    /**
     * string representation.
     */
    @Internal
    @Required
    @DefaultValue("APP_LOGO_LANDSCAPE")
    private final String string;

    /**
     * Internal constructor.
     * 
     * @param string
     *            string representation.
     */
    @Internal
    DarkThemeImageReference(@DefaultValue("APP_LOGO_LANDSCAPE") String string) {
        this.string = string;
    }

    /**
     * Gets string representation.
     * 
     * @return string
     */
    @Override
    @Internal
    public String getString() {
        return string;
    }

    /**
     * toString.
     * 
     * <p>
     * 
     * @see java.lang.Enum#toString()
     * @return the string representation of this value
     */
    @Override
    public String toString() {
        return getString();
    }

    /**
     * States whether it is the default value.
     * 
     * <p>
     * 
     * @see SdkEnum#isDefault()
     * @return true if this is the default value; false otherwise
     */
    @Override
    public boolean isDefault() {
        return this == getDefault();
    }

    /**
     * States whether the value is unknown and an error happened during parsing.
     * 
     * <p>
     * 
     * @see SdkEnum#isUnknownValue()
     * @return true if this is an unknown value; false otherwise
     */
    @Override
    public boolean isUnknownValue() {
        return this == getUnknownEnum();
    }

    /**
     * Gets default dark theme image reference.
     * 
     * @return default dark theme image reference
     */
    public static DarkThemeImageReference getDefault() {
        return APP_LOGO_LANDSCAPE;
    }

    /**
     * Gets unknown dark theme image reference value.
     * 
     * @return unknown dark theme image reference
     */
    public static DarkThemeImageReference getUnknownEnum() {
        return UNKNOWN_ENUM;
    }

    /**
     * Gets dark theme image reference from its string representation.
     * 
     * @param value
     *            string.
     * @return corresponding dark theme image reference or default dark theme image reference if not recognised.
     */
    public static DarkThemeImageReference getValue(String value) {
        if (value == null) {
            return getDefault();
        }
        final String trimmedValue = value.trim();
        for (final DarkThemeImageReference option : values()) {
            if (option.getString().equalsIgnoreCase(trimmedValue)) {
                return option;
            }
        }
        return getDefault();
    }

    /**
     * Merges two states.
     * 
     * <p>
     * 
     * @see SdkEnum#merge(SdkEnum, SdkEnum)
     * @param <T>
     *            type of an sdk enum
     * @param obj1
     *            a dark theme image reference.
     * @param obj2
     *            a dark theme image reference.
     * @return the merged enumerator
     */
    @Override
    public <T extends SdkEnum> T merge(T obj1, T obj2) {
        if (obj1 == null) {
            return obj2;
        }
        if (obj2 == null) {
            return obj1;
        }
        if (obj1.isDefault()) {
            return obj2;
        }
        if (obj2.isDefault()) {
            return obj1;
        }
        return obj2;
    }
}
