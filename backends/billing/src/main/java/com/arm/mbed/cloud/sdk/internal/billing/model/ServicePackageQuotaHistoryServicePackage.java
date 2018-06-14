/*
 * billing REST API documentation
 * This document contains the public REST API definitions of the mbed-billing service.
 *
 * OpenAPI spec version: 1.4.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.billing.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Service package quota history service package object.
 */
@ApiModel(description = "Service package quota history service package object.")

public class ServicePackageQuotaHistoryServicePackage implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("expires")
  private String expires = null;

  @SerializedName("firmware_update_count")
  private Integer firmwareUpdateCount = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("previous_id")
  private String previousId = null;

  @SerializedName("start_time")
  private String startTime = null;

  public ServicePackageQuotaHistoryServicePackage expires(String expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Service package expiration time in RFC3339 date-time with UTC time zone.
   * @return expires
  **/
  @ApiModelProperty(required = true, value = "Service package expiration time in RFC3339 date-time with UTC time zone.")
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public ServicePackageQuotaHistoryServicePackage firmwareUpdateCount(Integer firmwareUpdateCount) {
    this.firmwareUpdateCount = firmwareUpdateCount;
    return this;
  }

   /**
   * Size of firmware update quota of this service package.
   * @return firmwareUpdateCount
  **/
  @ApiModelProperty(required = true, value = "Size of firmware update quota of this service package.")
  public Integer getFirmwareUpdateCount() {
    return firmwareUpdateCount;
  }

  public void setFirmwareUpdateCount(Integer firmwareUpdateCount) {
    this.firmwareUpdateCount = firmwareUpdateCount;
  }

  public ServicePackageQuotaHistoryServicePackage id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of this service package.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of this service package.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServicePackageQuotaHistoryServicePackage previousId(String previousId) {
    this.previousId = previousId;
    return this;
  }

   /**
   * Previous service package ID or null.
   * @return previousId
  **/
  @ApiModelProperty(value = "Previous service package ID or null.")
  public String getPreviousId() {
    return previousId;
  }

  public void setPreviousId(String previousId) {
    this.previousId = previousId;
  }

  public ServicePackageQuotaHistoryServicePackage startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Service package start time in RFC3339 date-time with UTC time zone.
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "Service package start time in RFC3339 date-time with UTC time zone.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
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
    ServicePackageQuotaHistoryServicePackage servicePackageQuotaHistoryServicePackage = (ServicePackageQuotaHistoryServicePackage) o;
    return Objects.equals(this.expires, servicePackageQuotaHistoryServicePackage.expires) &&
        Objects.equals(this.firmwareUpdateCount, servicePackageQuotaHistoryServicePackage.firmwareUpdateCount) &&
        Objects.equals(this.id, servicePackageQuotaHistoryServicePackage.id) &&
        Objects.equals(this.previousId, servicePackageQuotaHistoryServicePackage.previousId) &&
        Objects.equals(this.startTime, servicePackageQuotaHistoryServicePackage.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expires, firmwareUpdateCount, id, previousId, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePackageQuotaHistoryServicePackage {\n");
    
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    firmwareUpdateCount: ").append(toIndentedString(firmwareUpdateCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    previousId: ").append(toIndentedString(previousId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
