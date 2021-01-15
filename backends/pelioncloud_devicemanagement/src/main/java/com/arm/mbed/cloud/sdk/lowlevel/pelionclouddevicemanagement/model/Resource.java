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
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Resource
 */

public class Resource implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("obs")
    private Boolean obs = null;

    @SerializedName("rt")
    private String rt = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("uri")
    private String uri = null;

    public Resource obs(Boolean obs) {
        this.obs = obs;
        return this;
    }

    /**
     * &#39;Determines whether you can subscribe to changes for this resource. It can have values &#x60;true&#x60; or
     * &#x60;false&#x60;.&#39;
     * 
     * @return obs
     **/
    @ApiModelProperty(example = "true",
                      value = "'Determines whether you can subscribe to changes for this resource. It can have values `true` or `false`.'")
    public Boolean isObs() {
        return obs;
    }

    public void setObs(Boolean obs) {
        this.obs = obs;
    }

    public Resource rt(String rt) {
        this.rt = rt;
        return this;
    }

    /**
     * Application-specific resource type that describes this resource, created by the [client
     * application](https://developer.pelion.com/docs/device-management/current/resources/resource-setup-in-device-management-client.html).
     * Not meant to be a human-readable name for the resource. Multiple resource types may be included, separated by a
     * space.
     * 
     * @return rt
     **/
    @ApiModelProperty(example = "light_sensor",
                      value = "Application-specific resource type that describes this resource, created by the [client application](https://developer.pelion.com/docs/device-management/current/resources/resource-setup-in-device-management-client.html). Not meant to be a human-readable name for the resource. Multiple resource types may be included, separated by a space.")
    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public Resource type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The content type of the resource. We recommend you use the content types listed in the [LwM2M
     * specification](http://www.openmobilealliance.org/wp/omna/lwm2m/lwm2mregistry.html).
     * 
     * @return type
     **/
    @ApiModelProperty(example = "text/plain",
                      value = "The content type of the resource.  We recommend you use the content types listed in the [LwM2M specification](http://www.openmobilealliance.org/wp/omna/lwm2m/lwm2mregistry.html).")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Resource uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The resource URL. This can be the path to: - An object; for example, &#x60;3303&#x60;. - An object instance; for
     * example &#x60;3303/0&#x60;. - A resource; for example &#x60;3303/0/5602&#x60;. For more information about the
     * Device Management resource model, please see the [Device Management
     * documentation](https://developer.pelion.com/docs/device-management/current/resources/resource-model.html).
     * 
     * @return uri
     **/
    @ApiModelProperty(example = "/sen/light", required = true,
                      value = "The resource URL. This can be the path to:  - An object; for example, `3303`. - An object instance; for example `3303/0`. - A resource; for example `3303/0/5602`.  For more information about the Device Management resource model, please see the [Device Management documentation](https://developer.pelion.com/docs/device-management/current/resources/resource-model.html).")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resource resource = (Resource) o;
        return Objects.equals(this.obs, resource.obs) && Objects.equals(this.rt, resource.rt)
               && Objects.equals(this.type, resource.type) && Objects.equals(this.uri, resource.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, rt, type, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");

        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    rt: ").append(toIndentedString(rt)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
