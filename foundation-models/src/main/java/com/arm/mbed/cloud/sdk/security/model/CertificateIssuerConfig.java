// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Date;

/**
 * Model for a certificate issuer config.
 */
@Preamble(description = "Model for a certificate issuer config.")
public class CertificateIssuerConfig implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 1579411600351820L;

    /**
     * The ID of the certificate issuer. Null if Device Management internal HSM is used.
     *
     */
    @Required
    private String certificateIssuerId;

    /**
     * The certificate name to which the certificate issuer configuration applies.
     */
    @Required
    private String certificateReference;

    /**
     * Created UTC time RFC3339.
     */
    private final Date createdAt;

    /**
     * The ID of the certificate issuer configuration.
     *
     */
    private String id;

    /**
     * Updated UTC time RFC3339.
     */
    private final Date updatedAt;

    /**
     * Internal constructor.
     *
     * <p>
     * Note: Should not be used. Use {@link #CertificateIssuerConfig()} instead.
     * 
     * @param certificateIssuerId
     *            The ID of the certificate issuer. Null if Device Management internal HSM is used.
     *
     * @param certificateReference
     *            The certificate name to which the certificate issuer configuration applies.
     * @param createdAt
     *            Created UTC time RFC3339.
     * @param id
     *            The ID of the certificate issuer configuration.
     *
     * @param updatedAt
     *            Updated UTC time RFC3339.
     */
    @Internal
    public CertificateIssuerConfig(String certificateIssuerId, String certificateReference, Date createdAt, String id,
                                   Date updatedAt) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        setCertificateIssuerId(certificateIssuerId);
        setCertificateReference(certificateReference);
        setId(id);
    }

    /**
     * Internal constructor.
     *
     * <p>
     * Note: Should not be used. Use {@link #CertificateIssuerConfig()} instead.
     * 
     * @param certificateIssuerConfig
     *            a certificate issuer config.
     */
    @Internal
    public CertificateIssuerConfig(CertificateIssuerConfig certificateIssuerConfig) {
        this(certificateIssuerConfig == null ? (String) null : certificateIssuerConfig.certificateIssuerId,
             certificateIssuerConfig == null ? (String) null : certificateIssuerConfig.certificateReference,
             certificateIssuerConfig == null ? new java.util.Date() : certificateIssuerConfig.createdAt,
             certificateIssuerConfig == null ? (String) null : certificateIssuerConfig.id,
             certificateIssuerConfig == null ? new java.util.Date() : certificateIssuerConfig.updatedAt);
    }

    /**
     * Constructor.
     */
    public CertificateIssuerConfig() {
        this((String) null, (String) null, new java.util.Date(), (String) null, new java.util.Date());
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The ID of the certificate issuer configuration.
     *
     */
    public CertificateIssuerConfig(String id) {
        this();
        setId(id);
    }

    /**
     * Internal constructor.
     *
     * <p>
     * Note: Should not be used. Use {@link #CertificateIssuerConfig()} instead.
     * 
     * @param createdAt
     *            Created UTC time RFC3339.
     * @param updatedAt
     *            Updated UTC time RFC3339.
     */
    @Internal
    public CertificateIssuerConfig(Date createdAt, Date updatedAt) {
        this((String) null, (String) null, createdAt, (String) null, updatedAt);
    }

    /**
     * Constructor.
     * 
     * @param certificateIssuerId
     *            The ID of the certificate issuer. Null if Device Management internal HSM is used.
     *
     * @param certificateReference
     *            The certificate name to which the certificate issuer configuration applies.
     */
    public CertificateIssuerConfig(String certificateIssuerId, String certificateReference) {
        this(certificateIssuerId, certificateReference, new java.util.Date(), (String) null, new java.util.Date());
    }

    /**
     * Gets the id of the certificate issuer. null if device management internal hsm is used.
     * 
     * @return certificateIssuerId
     */
    public String getCertificateIssuerId() {
        return certificateIssuerId;
    }

    /**
     * Sets the id of the certificate issuer. null if device management internal hsm is used.
     * 
     * @param certificateIssuerId
     *            The ID of the certificate issuer. Null if Device Management internal HSM is used.
     *
     */
    @Required
    public void setCertificateIssuerId(String certificateIssuerId) {
        this.certificateIssuerId = certificateIssuerId;
    }

    /**
     * Checks whether certificateIssuerId value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    @SuppressWarnings("PMD.UselessParentheses")
    public boolean isCertificateIssuerIdValid() {
        return certificateIssuerId != null;
    }

    /**
     * Gets the certificate name to which the certificate issuer configuration applies.
     * 
     * @return certificateReference
     */
    public String getCertificateReference() {
        return certificateReference;
    }

    /**
     * Sets the certificate name to which the certificate issuer configuration applies.
     * 
     * @param certificateReference
     *            The certificate name to which the certificate issuer configuration applies.
     */
    @Required
    public void setCertificateReference(String certificateReference) {
        this.certificateReference = certificateReference;
    }

    /**
     * Checks whether certificateReference value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    @SuppressWarnings("PMD.UselessParentheses")
    public boolean isCertificateReferenceValid() {
        return certificateReference != null;
    }

    /**
     * Gets created utc time rfc3339.
     * 
     * @return createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Gets the id of the certificate issuer configuration.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the certificate issuer configuration.
     * 
     * @param id
     *            The ID of the certificate issuer configuration.
     *
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the id of the certificate issuer configuration.
     *
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param certificateIssuerConfigId
     *            The ID of the certificate issuer configuration.
     *
     */
    @Internal
    public void setCertificateIssuerConfigId(String certificateIssuerConfigId) {
        setId(certificateIssuerConfigId);
    }

    /**
     * Gets updated utc time rfc3339.
     * 
     * @return updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
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
        result = prime * result + ((certificateIssuerId == null) ? 0 : certificateIssuerId.hashCode());
        result = prime * result + ((certificateReference == null) ? 0 : certificateReference.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
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
        return other instanceof CertificateIssuerConfig;
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
        if (!(obj instanceof CertificateIssuerConfig)) {
            return false;
        }
        final CertificateIssuerConfig other = (CertificateIssuerConfig) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (certificateIssuerId == null) {
            if (other.certificateIssuerId != null) {
                return false;
            }
        } else if (!certificateIssuerId.equals(other.certificateIssuerId)) {
            return false;
        }
        if (certificateReference == null) {
            if (other.certificateReference != null) {
                return false;
            }
        } else if (!certificateReference.equals(other.certificateReference)) {
            return false;
        }
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (updatedAt == null) {
            if (other.updatedAt != null) {
                return false;
            }
        } else if (!updatedAt.equals(other.updatedAt)) {
            return false;
        }
        return true;
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
        return "CertificateIssuerConfig [certificateIssuerId=" + certificateIssuerId + ", certificateReference="
               + certificateReference + ", createdAt=" + createdAt + ", id=" + id + ", updatedAt=" + updatedAt + "]";
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
        return isCertificateIssuerIdValid() && isCertificateReferenceValid();
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
    public CertificateIssuerConfig clone() {
        return new CertificateIssuerConfig(this);
    }
}