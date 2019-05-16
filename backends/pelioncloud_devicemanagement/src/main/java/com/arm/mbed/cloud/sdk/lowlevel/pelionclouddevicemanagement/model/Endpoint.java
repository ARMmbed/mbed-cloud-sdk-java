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
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Endpoint
 */

public class Endpoint implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("name")
    private String name = null;

    @SerializedName("q")
    private Boolean q = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("type")
    private String type = null;

    public Endpoint name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Unique Device Management Device ID representing the endpoint.
     * 
     * @return name
     **/
    @ApiModelProperty(example = "015f3850a657000000000001001002ab",
                      value = "Unique Device Management Device ID representing the endpoint.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Endpoint q(Boolean q) {
        this.q = q;
        return this;
    }

    /**
     * Determines whether the device is in queue mode. **Queue mode** When an endpoint is in queue mode, messages sent
     * to the endpoint do not wake up the physical device. The messages are queued and delivered when the device wakes
     * up and connects to Device Management Connect. You can also use the queue mode when the device is behind an NAT
     * and cannot be reached directly by Device Management Connect.
     * 
     * @return q
     **/
    @ApiModelProperty(example = "false",
                      value = "Determines whether the device is in queue mode.  **Queue mode**  When an endpoint is in queue mode, messages sent to the endpoint do not wake up the physical device. The messages are queued and delivered when the device wakes up and connects to Device Management Connect. You can also use the queue mode when the device is behind an NAT and cannot be reached directly by Device Management Connect.")
    public Boolean isQ() {
        return q;
    }

    public void setQ(Boolean q) {
        this.q = q;
    }

    public Endpoint status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Deprecated and the value is always ACTIVE. Only used for API backwards compatibility reasons.
     * 
     * @return status
     **/
    @ApiModelProperty(example = "ACTIVE",
                      value = "Deprecated and the value is always ACTIVE. Only used for API backwards compatibility reasons.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Endpoint type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of endpoint. (Free text)
     * 
     * @return type
     **/
    @ApiModelProperty(example = "Light", value = "Type of endpoint. (Free text)")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Endpoint endpoint = (Endpoint) o;
        return Objects.equals(this.name, endpoint.name) && Objects.equals(this.q, endpoint.q)
               && Objects.equals(this.status, endpoint.status) && Objects.equals(this.type, endpoint.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, q, status, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoint {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    q: ").append(toIndentedString(q)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
