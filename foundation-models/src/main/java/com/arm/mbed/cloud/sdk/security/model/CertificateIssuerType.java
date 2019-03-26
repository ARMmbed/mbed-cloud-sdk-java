// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkEnum;

/**
 * Certificate issuer type.
 */
@Preamble(description = "Certificate issuer type.")
public enum CertificateIssuerType implements SdkEnum {
    CFSSL_AUTH("CFSSL_AUTH"),

    GLOBAL_SIGN("GLOBAL_SIGN"),

    UNKNOWN_ENUM(SDK_UNKNOWN_ENUM_VALUE);

    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 5954602323518209L;

    /**
     * string representation.
     */
    @Internal
    @Required
    @DefaultValue("CFSSL_AUTH")
    private final String string;

    /**
     * Internal constructor.
     * 
     * @param string
     *            string representation.
     */
    @Internal
    CertificateIssuerType(@DefaultValue("CFSSL_AUTH") String string) {
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
     * Gets default certificate issuer type.
     * 
     * @return default certificate issuer type
     */
    public static CertificateIssuerType getDefault() {
        return CFSSL_AUTH;
    }

    /**
     * Gets unknown certificate issuer type value.
     * 
     * @return unknown certificate issuer type
     */
    public static CertificateIssuerType getUnknownEnum() {
        return UNKNOWN_ENUM;
    }

    /**
     * Gets certificate issuer type from its string representation.
     * 
     * @param value
     *            string.
     * @return corresponding certificate issuer type or default certificate issuer type if not recognised.
     */
    public static CertificateIssuerType getValue(String value) {
        if (value == null) {
            return getDefault();
        }
        final String trimmedValue = value.trim();
        for (final CertificateIssuerType option : values()) {
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
     * @param obj1
     *            a certificate issuer type.
     * @param obj2
     *            a certificate issuer type.
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
