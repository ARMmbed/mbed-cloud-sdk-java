// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.PerformsNoOperation;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Objects;

/**
 * Model for a password policy.
 */
@Preamble(description = "Model for a password policy.")
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class PasswordPolicy implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -141408703516119L;

    /**
     * Minimum length for the password.
     */
    @DefaultValue("8")
    private final int minimumLength;

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #PasswordPolicy()} instead.
     * 
     * @param minimumLength
     *            Minimum length for the password.
     */
    @Internal
    public PasswordPolicy(@DefaultValue("8") int minimumLength) {
        super();
        this.minimumLength = minimumLength;
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on a similar object.
     * <p>
     * Note: Should not be used. Use {@link #PasswordPolicy()} instead.
     * 
     * @param passwordPolicy
     *            a password policy.
     */
    @Internal
    public PasswordPolicy(PasswordPolicy passwordPolicy) {
        this(passwordPolicy == null ? 8 : passwordPolicy.minimumLength);
    }

    /**
     * Constructor.
     */
    public PasswordPolicy() {
        this(8);
    }

    /**
     * Sets id.
     * 
     * @param id
     *            id.
     */
    @Override
    @Internal
    @PerformsNoOperation
    public void setId(String id) {
        // Nothing to do
    }

    /**
     * Gets id.
     * 
     * <p>
     * Warning: PasswordPolicy model does not have any ID field. This always returns {@code null}.
     * 
     * @return id
     */
    @Override
    @Internal
    public String getId() {
        return null;
    }

    /**
     * Gets minimum length for the password.
     * 
     * @return minimumLength
     */
    public int getMinimumLength() {
        return minimumLength;
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
        return "PasswordPolicy [minimumLength=" + minimumLength + "]";
    }

    /**
     * Calculates the hash code of this instance based on field values.
     * 
     * <p>
     * 
     * @see java.lang.Object#hashCode()
     * @return hash code
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(Integer.valueOf(minimumLength));
        return result;
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
    protected boolean canEqual(Object other) {
        return other instanceof PasswordPolicy;
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
        if (!(obj instanceof PasswordPolicy)) {
            return false;
        }
        final PasswordPolicy other = (PasswordPolicy) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (minimumLength != other.minimumLength) {
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
        return true;
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
    public PasswordPolicy clone() {
        return new PasswordPolicy(this);
    }
}
