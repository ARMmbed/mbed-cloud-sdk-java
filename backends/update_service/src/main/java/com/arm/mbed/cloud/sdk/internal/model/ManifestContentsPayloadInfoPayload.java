/*
 * Update Service API
 * This is the API Documentation for the mbed deployment service which is part of the update service.
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
import com.arm.mbed.cloud.sdk.internal.model.ManifestContentsPayloadInfoPayloadReference;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * ManifestContentsPayloadInfoPayload
 */

public class ManifestContentsPayloadInfoPayload implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("integrated")
  private String integrated = null;

  @SerializedName("reference")
  private ManifestContentsPayloadInfoPayloadReference reference = null;

  public ManifestContentsPayloadInfoPayload integrated(String integrated) {
    this.integrated = integrated;
    return this;
  }

   /**
   * Get integrated
   * @return integrated
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIntegrated() {
    return integrated;
  }

  public void setIntegrated(String integrated) {
    this.integrated = integrated;
  }

  public ManifestContentsPayloadInfoPayload reference(ManifestContentsPayloadInfoPayloadReference reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(example = "null", value = "")
  public ManifestContentsPayloadInfoPayloadReference getReference() {
    return reference;
  }

  public void setReference(ManifestContentsPayloadInfoPayloadReference reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestContentsPayloadInfoPayload manifestContentsPayloadInfoPayload = (ManifestContentsPayloadInfoPayload) o;
    return Objects.equals(this.integrated, manifestContentsPayloadInfoPayload.integrated) &&
        Objects.equals(this.reference, manifestContentsPayloadInfoPayload.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrated, reference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestContentsPayloadInfoPayload {\n");
    
    sb.append("    integrated: ").append(toIndentedString(integrated)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
