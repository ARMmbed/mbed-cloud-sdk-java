// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Wed Jun 05 19:22:52 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.branding.model;

import java.util.Date;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;

/**
 * Model for a light theme image.
 */
@Preamble(description = "Model for a light theme image.")
public class LightThemeImage extends AbstractLightThemeImage {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 8504209071297820L;

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #LightThemeImage()} instead.
     * 
     * @param reference
     *            Name of the image.
     * @param staticUri
     *            The static link to the image.
     * @param updatedAt
     *            Last update time in UTC.
     */
    @Internal
    public LightThemeImage(LightThemeImageReference reference, String staticUri, Date updatedAt) {
        super(reference, staticUri, updatedAt);
    }

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on a similar object.
     * <p>
     * Note: Should not be used. Use {@link #LightThemeImage()} instead.
     * 
     * @param lightThemeImage
     *            a light theme image.
     */
    @Internal
    public LightThemeImage(LightThemeImage lightThemeImage) {
        this(lightThemeImage == null ? LightThemeImageReference.getDefault() : lightThemeImage.reference,
             lightThemeImage == null ? (String) null : lightThemeImage.staticUri,
             lightThemeImage == null ? new Date() : lightThemeImage.updatedAt);
    }

    /**
     * Constructor.
     */
    public LightThemeImage() {
        this(LightThemeImageReference.getDefault(), (String) null, new Date());
    }

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on read-only fields.
     * <p>
     * Note: Should not be used. Use {@link #LightThemeImage()} instead.
     * 
     * @param staticUri
     *            The static link to the image.
     * @param updatedAt
     *            Last update time in UTC.
     */
    @Internal
    public LightThemeImage(String staticUri, Date updatedAt) {
        this(LightThemeImageReference.getDefault(), staticUri, updatedAt);
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
    public void setLightThemeImageId(String id) {
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
        return "LightThemeImage [reference=" + reference + ", staticUri=" + staticUri + ", updatedAt=" + updatedAt
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
        return other instanceof LightThemeImage;
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
        if (!(obj instanceof LightThemeImage)) {
            return false;
        }
        final LightThemeImage other = (LightThemeImage) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        return true;
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
    public LightThemeImage clone() {
        return new LightThemeImage(this);
    }
}
