/*
 * Connect API
 * Mbed Cloud Connect API allows web applications to communicate with devices. You can subscribe to device resources and read/write values to them. mbed Cloud Connect makes connectivity to devices easy by queuing requests and caching resource values.
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.mds.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Presubscription
 */

public class Presubscription implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("endpoint-name")
  private String endpointName = null;

  @SerializedName("endpoint-type")
  private String endpointType = null;

  @SerializedName("resource-path")
  private List<String> resourcePath = null;

  public Presubscription endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * The Device ID
   * @return endpointName
  **/
  @ApiModelProperty(example = "015f3850a657000000000001001002ab", value = "The Device ID")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public Presubscription endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @ApiModelProperty(example = "Light", value = "")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public Presubscription resourcePath(List<String> resourcePath) {
    this.resourcePath = resourcePath;
    return this;
  }

  public Presubscription addResourcePathItem(String resourcePathItem) {
    if (this.resourcePath == null) {
      this.resourcePath = new ArrayList<String>();
    }
    this.resourcePath.add(resourcePathItem);
    return this;
  }

   /**
   * Get resourcePath
   * @return resourcePath
  **/
  @ApiModelProperty(example = "\"/sen/_*\"", value = "")
  public List<String> getResourcePath() {
    return resourcePath;
  }

  public void setResourcePath(List<String> resourcePath) {
    this.resourcePath = resourcePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Presubscription presubscription = (Presubscription) o;
    return Objects.equals(this.endpointName, presubscription.endpointName) &&
        Objects.equals(this.endpointType, presubscription.endpointType) &&
        Objects.equals(this.resourcePath, presubscription.resourcePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName, endpointType, resourcePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Presubscription {\n");
    
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
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

