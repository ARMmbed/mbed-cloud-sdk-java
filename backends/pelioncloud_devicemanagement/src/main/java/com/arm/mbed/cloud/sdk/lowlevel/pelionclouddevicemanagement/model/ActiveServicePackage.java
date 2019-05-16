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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * An active service package.
 */
@ApiModel(description = "An active service package.")

public class ActiveServicePackage implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("created")
    private DateTime created = null;

    @SerializedName("expires")
    private DateTime expires = null;

    @SerializedName("firmware_update_count")
    private Integer firmwareUpdateCount = null;

    @SerializedName("grace_period")
    private Boolean gracePeriod = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("modified")
    private DateTime modified = null;

    @SerializedName("next_id")
    private String nextId = null;

    @SerializedName("previous_id")
    private String previousId = null;

    @SerializedName("start_time")
    private DateTime startTime = null;

    public ActiveServicePackage created(DateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Service package creation time in RFC3339 date-time with millisecond accuracy and UTC time zone.
     * 
     * @return created
     **/
    @ApiModelProperty(required = true,
                      value = "Service package creation time in RFC3339 date-time with millisecond accuracy and UTC time zone.")
    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public ActiveServicePackage expires(DateTime expires) {
        this.expires = expires;
        return this;
    }

    /**
     * Service package expiration time in RFC3339 date-time with millisecond accuracy and UTC time zone.
     * 
     * @return expires
     **/
    @ApiModelProperty(required = true,
                      value = "Service package expiration time in RFC3339 date-time with millisecond accuracy and UTC time zone.")
    public DateTime getExpires() {
        return expires;
    }

    public void setExpires(DateTime expires) {
        this.expires = expires;
    }

    public ActiveServicePackage firmwareUpdateCount(Integer firmwareUpdateCount) {
        this.firmwareUpdateCount = firmwareUpdateCount;
        return this;
    }

    /**
     * Size of firmware update quota of this service package.
     * 
     * @return firmwareUpdateCount
     **/
    @ApiModelProperty(required = true, value = "Size of firmware update quota of this service package.")
    public Integer getFirmwareUpdateCount() {
        return firmwareUpdateCount;
    }

    public void setFirmwareUpdateCount(Integer firmwareUpdateCount) {
        this.firmwareUpdateCount = firmwareUpdateCount;
    }

    public ActiveServicePackage gracePeriod(Boolean gracePeriod) {
        this.gracePeriod = gracePeriod;
        return this;
    }

    /**
     * Indicates whether the service package is in its grace period.
     * 
     * @return gracePeriod
     **/
    @ApiModelProperty(required = true, value = "Indicates whether the service package is in its grace period.")
    public Boolean isGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(Boolean gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public ActiveServicePackage id(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID of this service package.
     * 
     * @return id
     **/
    @ApiModelProperty(required = true, value = "ID of this service package.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ActiveServicePackage modified(DateTime modified) {
        this.modified = modified;
        return this;
    }

    /**
     * Service package latest modified time in RFC3339 date-time with millisecond accuracy and UTC time zone.
     * 
     * @return modified
     **/
    @ApiModelProperty(required = true,
                      value = "Service package latest modified time in RFC3339 date-time with millisecond accuracy and UTC time zone.")
    public DateTime getModified() {
        return modified;
    }

    public void setModified(DateTime modified) {
        this.modified = modified;
    }

    public ActiveServicePackage nextId(String nextId) {
        this.nextId = nextId;
        return this;
    }

    /**
     * Next service package ID if this service package has a pending renewal, or null.
     * 
     * @return nextId
     **/
    @ApiModelProperty(value = "Next service package ID if this service package has a pending renewal, or null.")
    public String getNextId() {
        return nextId;
    }

    public void setNextId(String nextId) {
        this.nextId = nextId;
    }

    public ActiveServicePackage previousId(String previousId) {
        this.previousId = previousId;
        return this;
    }

    /**
     * Previous service package ID or null.
     * 
     * @return previousId
     **/
    @ApiModelProperty(value = "Previous service package ID or null.")
    public String getPreviousId() {
        return previousId;
    }

    public void setPreviousId(String previousId) {
        this.previousId = previousId;
    }

    public ActiveServicePackage startTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Service package start time in RFC3339 date-time with millisecond accuracy and UTC time zone.
     * 
     * @return startTime
     **/
    @ApiModelProperty(required = true,
                      value = "Service package start time in RFC3339 date-time with millisecond accuracy and UTC time zone.")
    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActiveServicePackage activeServicePackage = (ActiveServicePackage) o;
        return Objects.equals(this.created, activeServicePackage.created)
               && Objects.equals(this.expires, activeServicePackage.expires)
               && Objects.equals(this.firmwareUpdateCount, activeServicePackage.firmwareUpdateCount)
               && Objects.equals(this.gracePeriod, activeServicePackage.gracePeriod)
               && Objects.equals(this.id, activeServicePackage.id)
               && Objects.equals(this.modified, activeServicePackage.modified)
               && Objects.equals(this.nextId, activeServicePackage.nextId)
               && Objects.equals(this.previousId, activeServicePackage.previousId)
               && Objects.equals(this.startTime, activeServicePackage.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, expires, firmwareUpdateCount, gracePeriod, id, modified, nextId, previousId,
                            startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActiveServicePackage {\n");

        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
        sb.append("    firmwareUpdateCount: ").append(toIndentedString(firmwareUpdateCount)).append("\n");
        sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    nextId: ").append(toIndentedString(nextId)).append("\n");
        sb.append("    previousId: ").append(toIndentedString(previousId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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