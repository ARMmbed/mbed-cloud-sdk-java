/*
 * Update Service API
 * This is the API documentation for the Mbed deployment service, which is part of the update service.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.updateservice.model;

import java.util.Objects;
import com.arm.mbed.cloud.sdk.internal.updateservice.model.ManifestContentsPayloadFormat;
import com.arm.mbed.cloud.sdk.internal.updateservice.model.ManifestContentsPayloadReference;
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
 * ManifestContentsPayload
 */

public class ManifestContentsPayload implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("format")
  private ManifestContentsPayloadFormat format = null;

  @SerializedName("reference")
  private ManifestContentsPayloadReference reference = null;

  @SerializedName("storageIdentifier")
  private String storageIdentifier = null;

  public ManifestContentsPayload format(ManifestContentsPayloadFormat format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")
  public ManifestContentsPayloadFormat getFormat() {
    return format;
  }

  public void setFormat(ManifestContentsPayloadFormat format) {
    this.format = format;
  }

  public ManifestContentsPayload reference(ManifestContentsPayloadReference reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public ManifestContentsPayloadReference getReference() {
    return reference;
  }

  public void setReference(ManifestContentsPayloadReference reference) {
    this.reference = reference;
  }

  public ManifestContentsPayload storageIdentifier(String storageIdentifier) {
    this.storageIdentifier = storageIdentifier;
    return this;
  }

   /**
   * An payload storage destination identifier. The identifier specifies where to place the firmware image on the device. For example, when an IoT device has multiple microcontrollers (MCUs), the identifier determines which MCU receives the image.
   * @return storageIdentifier
  **/
  @ApiModelProperty(value = "An payload storage destination identifier. The identifier specifies where to place the firmware image on the device. For example, when an IoT device has multiple microcontrollers (MCUs), the identifier determines which MCU receives the image.")
  public String getStorageIdentifier() {
    return storageIdentifier;
  }

  public void setStorageIdentifier(String storageIdentifier) {
    this.storageIdentifier = storageIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestContentsPayload manifestContentsPayload = (ManifestContentsPayload) o;
    return Objects.equals(this.format, manifestContentsPayload.format) &&
        Objects.equals(this.reference, manifestContentsPayload.reference) &&
        Objects.equals(this.storageIdentifier, manifestContentsPayload.storageIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, reference, storageIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestContentsPayload {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    storageIdentifier: ").append(toIndentedString(storageIdentifier)).append("\n");
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

