// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Wed Jun 05 19:22:52 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.branding.model;

import java.util.Date;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;

/**
 * Model for a subtenant light theme color.
 */
@Preamble(description = "Model for a subtenant light theme color.")
public class SubtenantLightThemeColor extends AbstractSubtenantLightThemeColor {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 5446140571921220L;

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantLightThemeColor()} instead.
     * 
     * @param color
     *            The color given as name (purple) or as a hex code.
     * @param reference
     *            Color name.
     * @param updatedAt
     *            Last update time in UTC.
     */
    @Internal
    public SubtenantLightThemeColor(String color, SubtenantLightThemeColorReference reference, Date updatedAt) {
        super(color, reference, updatedAt);
    }

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on a similar object.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantLightThemeColor()} instead.
     * 
     * @param subtenantLightThemeColor
     *            a subtenant light theme color.
     */
    @Internal
    public SubtenantLightThemeColor(SubtenantLightThemeColor subtenantLightThemeColor) {
        this(subtenantLightThemeColor == null ? (String) null : subtenantLightThemeColor.color,
             subtenantLightThemeColor == null ? SubtenantLightThemeColorReference.getDefault()
                                              : subtenantLightThemeColor.reference,
             subtenantLightThemeColor == null ? new Date() : subtenantLightThemeColor.updatedAt);
    }

    /**
     * Constructor.
     */
    public SubtenantLightThemeColor() {
        this((String) null, SubtenantLightThemeColorReference.getDefault(), new Date());
    }

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on read-only fields.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantLightThemeColor()} instead.
     * 
     * @param updatedAt
     *            Last update time in UTC.
     */
    @Internal
    public SubtenantLightThemeColor(Date updatedAt) {
        this((String) null, SubtenantLightThemeColorReference.getDefault(), updatedAt);
    }

    /**
     * Executes setId.
     * 
     * @param id
     *            a string.
     */
    @Override
    public void setId(String id) {
        setReference(id);
    }

    /**
     * Executes setId.
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param id
     *            a string.
     */
    @Internal
    public void setSubtenantLightThemeColorId(String id) {
        setId(id);
    }

    /**
     * Executes getId.
     * 
     * @return something
     */
    @Override
    public String getId() {
        return reference == null ? null : reference.getString();
    }

    /**
     * Returns a string representation of the object.
     *
     * <p>
     * 
     * @see java.lang.Object#toString()
     * @return the string representation
     */
    @Override
    public String toString() {
        return "SubtenantLightThemeColor [color=" + color + ", reference=" + reference + ", updatedAt=" + updatedAt
               + "]";
    }

    /**
     * Method to ensure {@link #equals(Object)} is correct.
     *
     * <p>
     * Note: see this article: <a href="https://www.artima.com/lejava/articles/equality.html">canEqual()</a>
     * 
     * @param other
     *            another object.
     * @return true if the other object is an instance of the class in which canEqual is (re)defined, false otherwise.
     */
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SubtenantLightThemeColor;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * <p>
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     * @param obj
     *            an object to compare with this instance.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof SubtenantLightThemeColor)) {
            return false;
        }
        final SubtenantLightThemeColor other = (SubtenantLightThemeColor) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        return true;
    }

    @SuppressWarnings("PMD.UselessOverridingMethod")
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Checks whether the model is valid or not.
     *
     * <p>
     * 
     * @see SdkModel#isValid()
     * @return true if the model is valid; false otherwise.
     */
    @Override
    public boolean isValid() {
        return super.isValid() && reference != null;
    }

    /**
     * Clones this instance.
     *
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public SubtenantLightThemeColor clone() {
        return new SubtenantLightThemeColor(this);
    }
}
