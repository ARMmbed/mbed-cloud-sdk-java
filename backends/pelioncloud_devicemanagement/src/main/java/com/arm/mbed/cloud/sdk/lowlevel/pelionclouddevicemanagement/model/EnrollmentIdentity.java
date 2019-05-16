/*
 * Mbed Cloud API
 * The full Mbed Cloud API
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * EnrollmentIdentity
 */

public class EnrollmentIdentity implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("account_id")
    private String accountId = null;

    @SerializedName("claimed_at")
    private DateTime claimedAt = null;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("enrolled_device_id")
    private String enrolledDeviceId = null;

    @SerializedName("enrollment_identity")
    private String enrollmentIdentity = null;

    @SerializedName("etag")
    private String etag = null;

    @SerializedName("expires_at")
    private DateTime expiresAt = null;

    @SerializedName("id")
    private String id = null;

    /**
     * Gets or Sets object
     */
    @JsonAdapter(ObjectEnum.Adapter.class)
    public enum ObjectEnum {
        ENROLLMENT("enrollment");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ObjectEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ObjectEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ObjectEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("object")
    private ObjectEnum object = null;

    public EnrollmentIdentity accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * ID
     * 
     * @return accountId
     **/
    @ApiModelProperty(example = "00005a4e027f0a580a01081c00000000", required = true, value = "ID")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public EnrollmentIdentity claimedAt(DateTime claimedAt) {
        this.claimedAt = claimedAt;
        return this;
    }

    /**
     * The time the device was claimed.
     * 
     * @return claimedAt
     **/
    @ApiModelProperty(required = true, value = "The time the device was claimed.")
    public DateTime getClaimedAt() {
        return claimedAt;
    }

    public void setClaimedAt(DateTime claimedAt) {
        this.claimedAt = claimedAt;
    }

    public EnrollmentIdentity createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time of the enrollment identity creation.
     * 
     * @return createdAt
     **/
    @ApiModelProperty(required = true, value = "The time of the enrollment identity creation.")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public EnrollmentIdentity enrolledDeviceId(String enrolledDeviceId) {
        this.enrolledDeviceId = enrolledDeviceId;
        return this;
    }

    /**
     * The ID of the device in the Device Directory once it is registered.
     * 
     * @return enrolledDeviceId
     **/
    @ApiModelProperty(example = "00005a4e027f0a580a01081c00000000", required = true,
                      value = "The ID of the device in the Device Directory once it is registered.")
    public String getEnrolledDeviceId() {
        return enrolledDeviceId;
    }

    public void setEnrolledDeviceId(String enrolledDeviceId) {
        this.enrolledDeviceId = enrolledDeviceId;
    }

    public EnrollmentIdentity enrollmentIdentity(String enrollmentIdentity) {
        this.enrollmentIdentity = enrollmentIdentity;
        return this;
    }

    /**
     * Enrollment identity.
     * 
     * @return enrollmentIdentity
     **/
    @ApiModelProperty(example = "A-35:e7:72:8a:07:50:3b:3d:75:96:57:52:72:41:0d:78:cc:c6:e5:53:48:c6:65:58:5b:fa:af:4d:2d:73:95:c5",
                      required = true, value = "Enrollment identity.")
    public String getEnrollmentIdentity() {
        return enrollmentIdentity;
    }

    public void setEnrollmentIdentity(String enrollmentIdentity) {
        this.enrollmentIdentity = enrollmentIdentity;
    }

    public EnrollmentIdentity etag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get etag
     * 
     * @return etag
     **/
    @ApiModelProperty(example = "7642xfaxz", required = true, value = "")
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public EnrollmentIdentity expiresAt(DateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * The enrollment claim expiration time. If the device does not connect to Device Management before expiration, the
     * claim is removed without separate notice.
     * 
     * @return expiresAt
     **/
    @ApiModelProperty(required = true,
                      value = "The enrollment claim expiration time. If the device does not connect to Device Management before expiration, the claim is removed without separate notice.")
    public DateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(DateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public EnrollmentIdentity id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Enrollment identity.
     * 
     * @return id
     **/
    @ApiModelProperty(example = "00005a4e027f0a580a01081c00000000", required = true, value = "Enrollment identity.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnrollmentIdentity object(ObjectEnum object) {
        this.object = object;
        return this;
    }

    /**
     * Get object
     * 
     * @return object
     **/
    @ApiModelProperty(example = "enrollment", required = true, value = "")
    public ObjectEnum getObject() {
        return object;
    }

    public void setObject(ObjectEnum object) {
        this.object = object;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnrollmentIdentity enrollmentIdentity = (EnrollmentIdentity) o;
        return Objects.equals(this.accountId, enrollmentIdentity.accountId)
               && Objects.equals(this.claimedAt, enrollmentIdentity.claimedAt)
               && Objects.equals(this.createdAt, enrollmentIdentity.createdAt)
               && Objects.equals(this.enrolledDeviceId, enrollmentIdentity.enrolledDeviceId)
               && Objects.equals(this.enrollmentIdentity, enrollmentIdentity.enrollmentIdentity)
               && Objects.equals(this.etag, enrollmentIdentity.etag)
               && Objects.equals(this.expiresAt, enrollmentIdentity.expiresAt)
               && Objects.equals(this.id, enrollmentIdentity.id)
               && Objects.equals(this.object, enrollmentIdentity.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, claimedAt, createdAt, enrolledDeviceId, enrollmentIdentity, etag, expiresAt, id,
                            object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnrollmentIdentity {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    claimedAt: ").append(toIndentedString(claimedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    enrolledDeviceId: ").append(toIndentedString(enrolledDeviceId)).append("\n");
        sb.append("    enrollmentIdentity: ").append(toIndentedString(enrollmentIdentity)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
