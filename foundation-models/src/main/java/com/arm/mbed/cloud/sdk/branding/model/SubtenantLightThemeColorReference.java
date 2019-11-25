// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkEnum;

/**
 * Subtenant light theme color reference.
 */
@Preamble(description = "Subtenant light theme color reference.")
public enum SubtenantLightThemeColorReference implements SdkEnum {
    CANVAS_BACKGROUND("canvas_background"),

    CANVAS_BACKGROUND_FONT_COLOR("canvas_background_font_color"),

    ERROR_COLOR("error_color"),

    ERROR_FONT_COLOR("error_font_color"),

    INFO_COLOR("info_color"),

    INFO_FONT_COLOR("info_font_color"),

    PRIMARY("primary"),

    PRIMARY_FONT_COLOR("primary_font_color"),

    SECONDARY("secondary"),

    SECONDARY_FONT_COLOR("secondary_font_color"),

    SUCCESS_COLOR("success_color"),

    SUCCESS_FONT_COLOR("success_font_color"),

    WARNING_COLOR("warning_color"),

    WARNING_FONT_COLOR("warning_font_color"),

    WORKSPACE_BACKGROUND("workspace_background"),

    WORKSPACE_BACKGROUND_FONT_COLOR("workspace_background_font_color"),

    UNKNOWN_ENUM(SDK_UNKNOWN_ENUM_VALUE);

    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -106832709619212L;

    /**
     * string representation.
     */
    @Internal
    @Required
    @DefaultValue("CANVAS_BACKGROUND")
    private final String string;

    /**
     * Internal constructor.
     * 
     * @param string
     *            string representation.
     */
    @Internal
    SubtenantLightThemeColorReference(@DefaultValue("CANVAS_BACKGROUND") String string) {
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
     * Gets default subtenant light theme color reference.
     * 
     * @return default subtenant light theme color reference
     */
    public static SubtenantLightThemeColorReference getDefault() {
        return CANVAS_BACKGROUND;
    }

    /**
     * Gets unknown subtenant light theme color reference value.
     * 
     * @return unknown subtenant light theme color reference
     */
    public static SubtenantLightThemeColorReference getUnknownEnum() {
        return UNKNOWN_ENUM;
    }

    /**
     * Gets subtenant light theme color reference from its string representation.
     * 
     * @param value
     *            string.
     * @return corresponding subtenant light theme color reference or default subtenant light theme color reference if
     *         not recognised.
     */
    public static SubtenantLightThemeColorReference getValue(String value) {
        if (value == null) {
            return getDefault();
        }
        final String trimmedValue = value.trim();
        for (final SubtenantLightThemeColorReference option : values()) {
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
     *            a subtenant light theme color reference.
     * @param obj2
     *            a subtenant light theme color reference.
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
