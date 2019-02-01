// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Date;

/**
 * Model for a device enrollment. */
@Preamble(
    description = "Model for a device enrollment."
)
public class DeviceEnrollment implements SdkModel {
  /**
   * Serialisation Id. */
  private static final long serialVersionUID = -587451125452293L;

  /**
   * ID. */
  private final String accountId;

  /**
   * The time of claiming the device to be assigned to the account. */
  private final Date claimedAt;

  /**
   * The time of the enrollment identity creation. */
  private final Date createdAt;

  /**
   * The ID of the device in the Device Directory once it has been registered. */
  private final String enrolledDeviceId;

  /**
   * Enrollment identity. */
  @Required
  private String enrollmentIdentity;

  /**
   * The enrollment claim expiration time. If the device does not connect to Device Management before the expiration, the claim is removed without a separate notice. */
  private final Date expiresAt;

  /**
   * Enrollment identity. */
  private String id;

  /**
   * Internal constructor.
   * <p>
   * Note: Should not be used. Use {@link #DeviceEnrollment()} instead.
   * @param accountId ID.
   * @param claimedAt The time of claiming the device to be assigned to the account.
   * @param createdAt The time of the enrollment identity creation.
   * @param enrolledDeviceId The ID of the device in the Device Directory once it has been registered.
   * @param enrollmentIdentity Enrollment identity.
   * @param expiresAt The enrollment claim expiration time. If the device does not connect to Device Management before the expiration, the claim is removed without a separate notice.
   * @param id Enrollment identity.
   */
  @Internal
  public DeviceEnrollment(String accountId, Date claimedAt, Date createdAt, String enrolledDeviceId,
      String enrollmentIdentity, Date expiresAt, String id) {
    super();
    this.accountId = accountId;
    this.claimedAt = claimedAt;
    this.createdAt = createdAt;
    this.enrolledDeviceId = enrolledDeviceId;
    this.expiresAt = expiresAt;
    setEnrollmentIdentity(enrollmentIdentity);
    setId(id);
  }

  /**
   * Internal constructor.
   * <p>
   * Note: Should not be used. Use {@link #DeviceEnrollment()} instead.
   * @param deviceEnrollment a device enrollment.
   */
  @Internal
  public DeviceEnrollment(DeviceEnrollment deviceEnrollment) {
    this(deviceEnrollment == null ? (String) null : deviceEnrollment.accountId,
        deviceEnrollment == null ? new java.util.Date() : deviceEnrollment.claimedAt,
        deviceEnrollment == null ? new java.util.Date() : deviceEnrollment.createdAt,
        deviceEnrollment == null ? (String) null : deviceEnrollment.enrolledDeviceId,
        deviceEnrollment == null ? (String) null : deviceEnrollment.enrollmentIdentity,
        deviceEnrollment == null ? new java.util.Date() : deviceEnrollment.expiresAt,
        deviceEnrollment == null ? (String) null : deviceEnrollment.id);
  }

  /**
   * Constructor.
   */
  public DeviceEnrollment() {
    this((String) null,
        new java.util.Date(),
        new java.util.Date(),
        (String) null,
        (String) null,
        new java.util.Date(),
        (String) null);
  }

  /**
   * Constructor.
   * @param id Enrollment identity.
   */
  public DeviceEnrollment(String id) {
    this();
    setId(id);
  }

  /**
   * Internal constructor.
   * <p>
   * Note: Should not be used. Use {@link #DeviceEnrollment()} instead.
   * @param accountId ID.
   * @param claimedAt The time of claiming the device to be assigned to the account.
   * @param createdAt The time of the enrollment identity creation.
   * @param enrolledDeviceId The ID of the device in the Device Directory once it has been registered.
   * @param expiresAt The enrollment claim expiration time. If the device does not connect to Device Management before the expiration, the claim is removed without a separate notice.
   */
  @Internal
  public DeviceEnrollment(String accountId, Date claimedAt, Date createdAt, String enrolledDeviceId,
      Date expiresAt) {
    this(accountId,
        claimedAt,
        createdAt,
        enrolledDeviceId,
        (String) null,
        expiresAt,
        (String) null);
  }

  /**
   * Gets id.
   * @return accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the time of claiming the device to be assigned to the account.
   * @return claimedAt
   */
  public Date getClaimedAt() {
    return claimedAt;
  }

  /**
   * Gets the time of the enrollment identity creation.
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the id of the device in the device directory once it has been registered.
   * @return enrolledDeviceId
   */
  public String getEnrolledDeviceId() {
    return enrolledDeviceId;
  }

  /**
   * Gets enrollment identity.
   * @return enrollmentIdentity
   */
  public String getEnrollmentIdentity() {
    return enrollmentIdentity;
  }

  /**
   * Sets enrollment identity.
   * <p>
   * null
   * <p>
   * Note: the value has to match {@code /^A-[A-Za-z0-9:]{95}$/} to be valid
   * @param enrollmentIdentity Enrollment identity.
   */
  @Required
  public void setEnrollmentIdentity(String enrollmentIdentity) {
    this.enrollmentIdentity = enrollmentIdentity;
  }

  /**
   * Checks whether enrollmentIdentity value is valid.
   * @return true if the value is valid; false otherwise.
   */
  @SuppressWarnings("PMD.UselessParentheses")
  public boolean isEnrollmentIdentityValid() {
    return enrollmentIdentity != null
        && (enrollmentIdentity == null || enrollmentIdentity.matches("^A-[A-Za-z0-9:]{95}$"));
  }

  /**
   * Gets the enrollment claim expiration time. if the device does not connect to device management before the expiration, the claim is removed without a separate notice.
   * @return expiresAt
   */
  public Date getExpiresAt() {
    return expiresAt;
  }

  /**
   * Gets enrollment identity.
   * @return id
   */
  @Override
  public String getId() {
    return id;
  }

  /**
   * Sets enrollment identity.
   * <p>
   * null
   * <p>
   * Note: the value has to match {@code /^[A-Za-z0-9]{32}/} to be valid
   * @param id Enrollment identity.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets enrollment identity.
   * <p>
   * Similar to {@link #setId(String)}
   * <p>
   * Note: the value has to match {@code /^[A-Za-z0-9]{32}/} to be valid
   * @param deviceEnrollmentId Enrollment identity.
   */
  @Internal
  public void setDeviceEnrollmentId(String deviceEnrollmentId) {
    setId(deviceEnrollmentId);
  }

  /**
   * Checks whether id value is valid.
   * @return true if the value is valid; false otherwise.
   */
  @SuppressWarnings("PMD.UselessParentheses")
  public boolean isIdValid() {
    return (id == null || id.matches("^[A-Za-z0-9]{32}"));
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
    result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
    result = prime * result + ((claimedAt == null) ? 0 : claimedAt.hashCode());
    result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
    result = prime * result + ((enrolledDeviceId == null) ? 0 : enrolledDeviceId.hashCode());
    result = prime * result + ((enrollmentIdentity == null) ? 0 : enrollmentIdentity.hashCode());
    result = prime * result + ((expiresAt == null) ? 0 : expiresAt.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
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
    return other instanceof DeviceEnrollment;
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
    if( !(obj instanceof DeviceEnrollment)) {
      return false;
    }
    final DeviceEnrollment other = (DeviceEnrollment) obj;
    if( !other.canEqual(this)) {
      return false;
    }
    if (accountId == null) {
      if (other.accountId != null) {
        return false;
      }
    } else if (!accountId.equals(other.accountId)) {
      return false;
    }
    if (claimedAt == null) {
      if (other.claimedAt != null) {
        return false;
      }
    } else if (!claimedAt.equals(other.claimedAt)) {
      return false;
    }
    if (createdAt == null) {
      if (other.createdAt != null) {
        return false;
      }
    } else if (!createdAt.equals(other.createdAt)) {
      return false;
    }
    if (enrolledDeviceId == null) {
      if (other.enrolledDeviceId != null) {
        return false;
      }
    } else if (!enrolledDeviceId.equals(other.enrolledDeviceId)) {
      return false;
    }
    if (enrollmentIdentity == null) {
      if (other.enrollmentIdentity != null) {
        return false;
      }
    } else if (!enrollmentIdentity.equals(other.enrollmentIdentity)) {
      return false;
    }
    if (expiresAt == null) {
      if (other.expiresAt != null) {
        return false;
      }
    } else if (!expiresAt.equals(other.expiresAt)) {
      return false;
    }
    if (id == null) {
      if (other.id != null) {
        return false;
      }
    } else if (!id.equals(other.id)) {
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
    return "DeviceEnrollment [accountId=" + accountId
        + ", claimedAt=" + claimedAt
        + ", createdAt=" + createdAt
        + ", enrolledDeviceId=" + enrolledDeviceId
        + ", enrollmentIdentity=" + enrollmentIdentity
        + ", expiresAt=" + expiresAt
        + ", id=" + id + "]";
  }

  /**
   * Checks whether the model is valid or not.
   * <p>
   * @see SdkModel#isValid()
   * @return true if the model is valid; false otherwise.
   */
  @Override
  public boolean isValid() {
    return isEnrollmentIdentityValid()
        && isIdValid();
  }

  /**
   * Clones this instance.
   * <p>
   * @see java.lang.Object#clone()
   * @return a cloned instance
   */
  @Override
  public DeviceEnrollment clone() {
    return new DeviceEnrollment(this);
  }
}
