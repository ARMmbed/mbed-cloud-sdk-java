// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Date;

/**
 * Model for a certificate enrollment. */
@Preamble(
    description = "Model for a certificate enrollment."
)
public class CertificateEnrollment implements SdkModel {
  /**
   * Serialisation Id. */
  private static final long serialVersionUID = -748424711351820L;

  /**
   * The certificate name. */
  private final String certificateName;

  /**
   * Creation UTC time RFC3339. */
  private final Date createdAt;

  /**
   * The device ID. */
  private final String deviceId;

  /**
   * enumerator value. */
  private final CertificateEnrollmentEnrollResult enrollResult;

  /**
   * enumerator value. */
  private final CertificateEnrollmentEnrollStatus enrollStatus;

  /**
   * The ID of the certificate enrollment. */
  private String id;

  /**
   * Update UTC time RFC3339. */
  private final Date updatedAt;

  /**
   * Internal constructor.
   * <p>
   * Note: Should not be used. Use {@link #CertificateEnrollment()} instead.
   * @param certificateName The certificate name.
   * @param createdAt Creation UTC time RFC3339.
   * @param deviceId The device ID.
   * @param enrollResult enumerator value.
   * @param enrollStatus enumerator value.
   * @param id The ID of the certificate enrollment.
   * @param updatedAt Update UTC time RFC3339.
   */
  @Internal
  public CertificateEnrollment(String certificateName, Date createdAt, String deviceId,
      CertificateEnrollmentEnrollResult enrollResult,
      CertificateEnrollmentEnrollStatus enrollStatus, String id, Date updatedAt) {
    super();
    this.certificateName = certificateName;
    this.createdAt = createdAt;
    this.deviceId = deviceId;
    this.enrollResult = enrollResult;
    this.enrollStatus = enrollStatus;
    this.updatedAt = updatedAt;
    setId(id);
  }

  /**
   * Internal constructor.
   * <p>
   * Note: Should not be used. Use {@link #CertificateEnrollment()} instead.
   * @param certificateEnrollment a certificate enrollment.
   */
  @Internal
  public CertificateEnrollment(CertificateEnrollment certificateEnrollment) {
    this(certificateEnrollment == null ? (String) null : certificateEnrollment.certificateName,
        certificateEnrollment == null ? new java.util.Date() : certificateEnrollment.createdAt,
        certificateEnrollment == null ? (String) null : certificateEnrollment.deviceId,
        certificateEnrollment == null ? CertificateEnrollmentEnrollResult.getDefault() : certificateEnrollment.enrollResult,
        certificateEnrollment == null ? CertificateEnrollmentEnrollStatus.getDefault() : certificateEnrollment.enrollStatus,
        certificateEnrollment == null ? (String) null : certificateEnrollment.id,
        certificateEnrollment == null ? new java.util.Date() : certificateEnrollment.updatedAt);
  }

  /**
   * Constructor.
   */
  public CertificateEnrollment() {
    this((String) null,
        new java.util.Date(),
        (String) null,
        CertificateEnrollmentEnrollResult.getDefault(),
        CertificateEnrollmentEnrollStatus.getDefault(),
        (String) null,
        new java.util.Date());
  }

  /**
   * Constructor.
   * @param id The ID of the certificate enrollment.
   */
  public CertificateEnrollment(String id) {
    this();
    setId(id);
  }

  /**
   * Internal constructor.
   * <p>
   * Note: Should not be used. Use {@link #CertificateEnrollment()} instead.
   * @param certificateName The certificate name.
   * @param createdAt Creation UTC time RFC3339.
   * @param deviceId The device ID.
   * @param enrollResult enumerator value.
   * @param enrollStatus enumerator value.
   * @param updatedAt Update UTC time RFC3339.
   */
  @Internal
  public CertificateEnrollment(String certificateName, Date createdAt, String deviceId,
      CertificateEnrollmentEnrollResult enrollResult,
      CertificateEnrollmentEnrollStatus enrollStatus, Date updatedAt) {
    this(certificateName,
        createdAt,
        deviceId,
        enrollResult,
        enrollStatus,
        (String) null,
        updatedAt);
  }

  /**
   * Gets the certificate name.
   * @return certificateName
   */
  public String getCertificateName() {
    return certificateName;
  }

  /**
   * Gets creation utc time rfc3339.
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the device id.
   * @return deviceId
   */
  public String getDeviceId() {
    return deviceId;
  }

  /**
   * Gets enumerator value.
   * @return enrollResult
   */
  public CertificateEnrollmentEnrollResult getEnrollResult() {
    return enrollResult;
  }

  /**
   * Gets enumerator value.
   * @return enrollStatus
   */
  public CertificateEnrollmentEnrollStatus getEnrollStatus() {
    return enrollStatus;
  }

  /**
   * Gets the id of the certificate enrollment.
   * @return id
   */
  @Override
  public String getId() {
    return id;
  }

  /**
   * Sets the id of the certificate enrollment.
   * @param id The ID of the certificate enrollment.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the id of the certificate enrollment.
   * <p>
   * Similar to {@link #setId(String)}
   * @param certificateEnrollmentId The ID of the certificate enrollment.
   */
  @Internal
  public void setCertificateEnrollmentId(String certificateEnrollmentId) {
    setId(certificateEnrollmentId);
  }

  /**
   * Gets update utc time rfc3339.
   * @return updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Calculates the hash code of this instance based on field values.
   * <p>
   * @see java.lang.Object#hashCode()
   * @return hash code
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((certificateName == null) ? 0 : certificateName.hashCode());
    result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
    result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
    result = prime * result + ((enrollResult == null) ? 0 : enrollResult.hashCode());
    result = prime * result + ((enrollStatus == null) ? 0 : enrollStatus.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
    return result;
  }

  /**
   *  Method to ensure {@link #equals(Object)} is correct.
   * <p>
   *  Note: see this article: <a href="https://www.artima.com/lejava/articles/equality.html">canEqual()</a>
   * @param other another object.
   * @return true if the other object is an instance of the class in which canEqual is (re)defined, false otherwise.
   */
  protected boolean canEqual(Object other) {
    return other instanceof CertificateEnrollment;
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   * <p>
   * @see java.lang.Object#equals(java.lang.Object)
   * @param obj an object to compare with this instance.
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
    if( !(obj instanceof CertificateEnrollment)) {
      return false;
    }
    final CertificateEnrollment other = (CertificateEnrollment) obj;
    if( !other.canEqual(this)) {
      return false;
    }
    if (certificateName == null) {
      if (other.certificateName != null) {
        return false;
      }
    } else if (!certificateName.equals(other.certificateName)) {
      return false;
    }
    if (createdAt == null) {
      if (other.createdAt != null) {
        return false;
      }
    } else if (!createdAt.equals(other.createdAt)) {
      return false;
    }
    if (deviceId == null) {
      if (other.deviceId != null) {
        return false;
      }
    } else if (!deviceId.equals(other.deviceId)) {
      return false;
    }
    if (enrollResult != other.enrollResult) {
      return false;
    }
    if (enrollStatus != other.enrollStatus) {
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
   * <p>
   * @see java.lang.Object#toString()
   * @return the string representation
   */
  @Override
  public String toString() {
    return "CertificateEnrollment [certificateName=" + certificateName
        + ", createdAt=" + createdAt
        + ", deviceId=" + deviceId
        + ", enrollResult=" + enrollResult
        + ", enrollStatus=" + enrollStatus
        + ", id=" + id
        + ", updatedAt=" + updatedAt + "]";
  }

  /**
   * Checks whether the model is valid or not.
   * <p>
   * @see SdkModel#isValid()
   * @return true if the model is valid; false otherwise.
   */
  @Override
  public boolean isValid() {
    return true;
  }

  /**
   * Clones this instance.
   * <p>
   * @see java.lang.Object#clone()
   * @return a cloned instance
   */
  @Override
  public CertificateEnrollment clone() {
    return new CertificateEnrollment(this);
  }
}
