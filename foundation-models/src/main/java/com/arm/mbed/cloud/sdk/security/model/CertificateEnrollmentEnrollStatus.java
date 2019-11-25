// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkEnum;

/**
 * Certificate enrollment enroll status.
 */
@Preamble(description = "Certificate enrollment enroll status.")
public enum CertificateEnrollmentEnrollStatus implements SdkEnum {
    COMPLETED("completed"),

    NEW("new"),

    UNKNOWN_ENUM(SDK_UNKNOWN_ENUM_VALUE);

    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -172297067135182L;

    /**
     * string representation.
     */
    @Internal
    @Required
    @DefaultValue("COMPLETED")
    private final String string;

    /**
     * Internal constructor.
     * 
     * @param string
     *            string representation.
     */
    @Internal
    CertificateEnrollmentEnrollStatus(@DefaultValue("COMPLETED") String string) {
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
     * Gets default certificate enrollment enroll status.
     * 
     * @return default certificate enrollment enroll status
     */
    public static CertificateEnrollmentEnrollStatus getDefault() {
        return COMPLETED;
    }

    /**
     * Gets unknown certificate enrollment enroll status value.
     * 
     * @return unknown certificate enrollment enroll status
     */
    public static CertificateEnrollmentEnrollStatus getUnknownEnum() {
        return UNKNOWN_ENUM;
    }

    /**
     * Gets certificate enrollment enroll status from its string representation.
     * 
     * @param value
     *            string.
     * @return corresponding certificate enrollment enroll status or default certificate enrollment enroll status if not
     *         recognised.
     */
    public static CertificateEnrollmentEnrollStatus getValue(String value) {
        if (value == null) {
            return getDefault();
        }
        final String trimmedValue = value.trim();
        for (final CertificateEnrollmentEnrollStatus option : values()) {
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
     *            a certificate enrollment enroll status.
     * @param obj2
     *            a certificate enrollment enroll status.
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
