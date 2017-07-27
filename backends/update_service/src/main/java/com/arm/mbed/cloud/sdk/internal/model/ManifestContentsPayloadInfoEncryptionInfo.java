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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * ManifestContentsPayloadInfoEncryptionInfo
 */

public class ManifestContentsPayloadInfoEncryptionInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("encryptedPayloadHash")
  private String encryptedPayloadHash = null;

  @SerializedName("config")
  private String config = null;

  @SerializedName("mode")
  private String mode = null;

  public ManifestContentsPayloadInfoEncryptionInfo encryptedPayloadHash(String encryptedPayloadHash) {
    this.encryptedPayloadHash = encryptedPayloadHash;
    return this;
  }

   /**
   * Get encryptedPayloadHash
   * @return encryptedPayloadHash
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEncryptedPayloadHash() {
    return encryptedPayloadHash;
  }

  public void setEncryptedPayloadHash(String encryptedPayloadHash) {
    this.encryptedPayloadHash = encryptedPayloadHash;
  }

  public ManifestContentsPayloadInfoEncryptionInfo config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public ManifestContentsPayloadInfoEncryptionInfo mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestContentsPayloadInfoEncryptionInfo manifestContentsPayloadInfoEncryptionInfo = (ManifestContentsPayloadInfoEncryptionInfo) o;
    return Objects.equals(this.encryptedPayloadHash, manifestContentsPayloadInfoEncryptionInfo.encryptedPayloadHash) &&
        Objects.equals(this.config, manifestContentsPayloadInfoEncryptionInfo.config) &&
        Objects.equals(this.mode, manifestContentsPayloadInfoEncryptionInfo.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedPayloadHash, config, mode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestContentsPayloadInfoEncryptionInfo {\n");
    
    sb.append("    encryptedPayloadHash: ").append(toIndentedString(encryptedPayloadHash)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
