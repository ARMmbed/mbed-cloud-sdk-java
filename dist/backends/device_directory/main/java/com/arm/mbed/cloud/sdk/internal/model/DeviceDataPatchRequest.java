/*
 * Device Directory API
 * This is the API Documentation for the mbed device directory update service.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * DeviceDataPatchRequest
 */

public class DeviceDataPatchRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("description")
  private String description = null;

  @SerializedName("endpoint_name")
  private String endpointName = null;

  @SerializedName("auto_update")
  private Boolean autoUpdate = null;

  @SerializedName("host_gateway")
  private String hostGateway = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("custom_attributes")
  private Object customAttributes = null;

  @SerializedName("device_key")
  private String deviceKey = null;

  @SerializedName("endpoint_type")
  private String endpointType = null;

  @SerializedName("ca_id")
  private String caId = null;

  @SerializedName("name")
  private String name = null;

  public DeviceDataPatchRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the object.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description of the object.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeviceDataPatchRequest endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * The endpoint name given to the device.
   * @return endpointName
  **/
  @ApiModelProperty(example = "null", value = "The endpoint name given to the device.")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public DeviceDataPatchRequest autoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
    return this;
  }

   /**
   * DEPRECATED Mark this device for auto firmware update.
   * @return autoUpdate
  **/
  @ApiModelProperty(example = "null", value = "DEPRECATED Mark this device for auto firmware update.")
  public Boolean getAutoUpdate() {
    return autoUpdate;
  }

  public void setAutoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
  }

  public DeviceDataPatchRequest hostGateway(String hostGateway) {
    this.hostGateway = hostGateway;
    return this;
  }

   /**
   * The endpoint_name of the host gateway, if appropriate.
   * @return hostGateway
  **/
  @ApiModelProperty(example = "null", value = "The endpoint_name of the host gateway, if appropriate.")
  public String getHostGateway() {
    return hostGateway;
  }

  public void setHostGateway(String hostGateway) {
    this.hostGateway = hostGateway;
  }

  public DeviceDataPatchRequest object(String object) {
    this.object = object;
    return this;
  }

   /**
   * The API resource entity.
   * @return object
  **/
  @ApiModelProperty(example = "null", value = "The API resource entity.")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public DeviceDataPatchRequest customAttributes(Object customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

   /**
   * Up to 5 custom JSON attributes
   * @return customAttributes
  **/
  @ApiModelProperty(example = "null", value = "Up to 5 custom JSON attributes")
  public Object getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(Object customAttributes) {
    this.customAttributes = customAttributes;
  }

  public DeviceDataPatchRequest deviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
    return this;
  }

   /**
   * Fingerprint of the device certificate.
   * @return deviceKey
  **/
  @ApiModelProperty(example = "null", value = "Fingerprint of the device certificate.")
  public String getDeviceKey() {
    return deviceKey;
  }

  public void setDeviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
  }

  public DeviceDataPatchRequest endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * The endpoint type of the device - e.g. if the device is a gateway.
   * @return endpointType
  **/
  @ApiModelProperty(example = "null", value = "The endpoint type of the device - e.g. if the device is a gateway.")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public DeviceDataPatchRequest caId(String caId) {
    this.caId = caId;
    return this;
  }

   /**
   * ID of the issuer of the certificate.
   * @return caId
  **/
  @ApiModelProperty(example = "null", value = "ID of the issuer of the certificate.")
  public String getCaId() {
    return caId;
  }

  public void setCaId(String caId) {
    this.caId = caId;
  }

  public DeviceDataPatchRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the object.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the object.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceDataPatchRequest deviceDataPatchRequest = (DeviceDataPatchRequest) o;
    return Objects.equals(this.description, deviceDataPatchRequest.description) &&
        Objects.equals(this.endpointName, deviceDataPatchRequest.endpointName) &&
        Objects.equals(this.autoUpdate, deviceDataPatchRequest.autoUpdate) &&
        Objects.equals(this.hostGateway, deviceDataPatchRequest.hostGateway) &&
        Objects.equals(this.object, deviceDataPatchRequest.object) &&
        Objects.equals(this.customAttributes, deviceDataPatchRequest.customAttributes) &&
        Objects.equals(this.deviceKey, deviceDataPatchRequest.deviceKey) &&
        Objects.equals(this.endpointType, deviceDataPatchRequest.endpointType) &&
        Objects.equals(this.caId, deviceDataPatchRequest.caId) &&
        Objects.equals(this.name, deviceDataPatchRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endpointName, autoUpdate, hostGateway, object, customAttributes, deviceKey, endpointType, caId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceDataPatchRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    autoUpdate: ").append(toIndentedString(autoUpdate)).append("\n");
    sb.append("    hostGateway: ").append(toIndentedString(hostGateway)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    deviceKey: ").append(toIndentedString(deviceKey)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
