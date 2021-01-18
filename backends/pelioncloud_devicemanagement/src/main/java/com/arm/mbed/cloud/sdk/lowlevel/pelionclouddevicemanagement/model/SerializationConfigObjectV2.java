/*
 * Pelion Device Management API
 * Pelion Device Management API build from the publicly defined API definitions.
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
import java.io.Serializable;

/**
 * Serialization configuration object according to configuration type.
 */
@ApiModel(description = "Serialization configuration object according to configuration type.")

public class SerializationConfigObjectV2 implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("deregistrations_as_object")
    private Boolean deregistrationsAsObject = false;

    @SerializedName("include_original_ep")
    private Boolean includeOriginalEp = false;

    @SerializedName("include_timestamp")
    private Boolean includeTimestamp = false;

    @SerializedName("include_uid")
    private Boolean includeUid = false;

    public SerializationConfigObjectV2 deregistrationsAsObject(Boolean deregistrationsAsObject) {
        this.deregistrationsAsObject = deregistrationsAsObject;
        return this;
    }

    /**
     * Defines serialization format for &#39;de-registrations&#39; and &#39;registrations-expired&#39;. If set to true,
     * de-registration and registration-expired messages will be represented as json objects and can have additional
     * fields: &#39;uid&#39;, &#39;timestamp&#39;, &#39;original-ep&#39;, together with the &#39;ep&#39; field. If set
     * to false, (default) - de-registration and &#39;registration-expired&#39; will be represented by a string,
     * containing only data from &#39;ep&#39; field.
     * 
     * @return deregistrationsAsObject
     **/
    @ApiModelProperty(example = "true",
                      value = "Defines serialization format for 'de-registrations' and 'registrations-expired'. If set to true, de-registration and registration-expired messages will be represented as json objects and can have additional fields: 'uid', 'timestamp', 'original-ep', together with the 'ep' field. If set to false, (default) - de-registration and 'registration-expired' will be represented by a string, containing only data from 'ep' field. ")
    public Boolean isDeregistrationsAsObject() {
        return deregistrationsAsObject;
    }

    public void setDeregistrationsAsObject(Boolean deregistrationsAsObject) {
        this.deregistrationsAsObject = deregistrationsAsObject;
    }

    public SerializationConfigObjectV2 includeOriginalEp(Boolean includeOriginalEp) {
        this.includeOriginalEp = includeOriginalEp;
        return this;
    }

    /**
     * Include &#39;original-ep&#39; message field in serialized objects. This is the endpoint_name from the device.
     * 
     * @return includeOriginalEp
     **/
    @ApiModelProperty(example = "true",
                      value = "Include 'original-ep' message field in serialized objects. This is the endpoint_name from the device. ")
    public Boolean isIncludeOriginalEp() {
        return includeOriginalEp;
    }

    public void setIncludeOriginalEp(Boolean includeOriginalEp) {
        this.includeOriginalEp = includeOriginalEp;
    }

    public SerializationConfigObjectV2 includeTimestamp(Boolean includeTimestamp) {
        this.includeTimestamp = includeTimestamp;
        return this;
    }

    /**
     * Include &#39;timestamp&#39; message field in serialized objects. The timestamp represents the time that the
     * notification service receives the message and sorts it into the queue. Timestamp provides information of queue
     * length (web-app current time - timestamp &#x3D; delay).
     * 
     * @return includeTimestamp
     **/
    @ApiModelProperty(example = "true",
                      value = "Include 'timestamp' message field in serialized objects. The timestamp represents the time that the notification service receives the message and sorts it into the queue. Timestamp provides information of queue length (web-app current time - timestamp = delay). ")
    public Boolean isIncludeTimestamp() {
        return includeTimestamp;
    }

    public void setIncludeTimestamp(Boolean includeTimestamp) {
        this.includeTimestamp = includeTimestamp;
    }

    public SerializationConfigObjectV2 includeUid(Boolean includeUid) {
        this.includeUid = includeUid;
        return this;
    }

    /**
     * Include &#39;uid&#39; message field to serialized objects. This is message ID, and can be used for duplicate
     * detection.
     * 
     * @return includeUid
     **/
    @ApiModelProperty(example = "true",
                      value = "Include 'uid' message field to serialized objects. This is message ID, and can be used for duplicate detection. ")
    public Boolean isIncludeUid() {
        return includeUid;
    }

    public void setIncludeUid(Boolean includeUid) {
        this.includeUid = includeUid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SerializationConfigObjectV2 serializationConfigObjectV2 = (SerializationConfigObjectV2) o;
        return Objects.equals(this.deregistrationsAsObject, serializationConfigObjectV2.deregistrationsAsObject)
               && Objects.equals(this.includeOriginalEp, serializationConfigObjectV2.includeOriginalEp)
               && Objects.equals(this.includeTimestamp, serializationConfigObjectV2.includeTimestamp)
               && Objects.equals(this.includeUid, serializationConfigObjectV2.includeUid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deregistrationsAsObject, includeOriginalEp, includeTimestamp, includeUid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SerializationConfigObjectV2 {\n");

        sb.append("    deregistrationsAsObject: ").append(toIndentedString(deregistrationsAsObject)).append("\n");
        sb.append("    includeOriginalEp: ").append(toIndentedString(includeOriginalEp)).append("\n");
        sb.append("    includeTimestamp: ").append(toIndentedString(includeTimestamp)).append("\n");
        sb.append("    includeUid: ").append(toIndentedString(includeUid)).append("\n");
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
