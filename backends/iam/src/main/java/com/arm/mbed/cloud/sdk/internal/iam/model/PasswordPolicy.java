/*
 * Account Management API
 * API for managing accounts, users, creating API keys, uploading trusted certificates
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.iam.model;

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
 * PasswordPolicy
 */

public class PasswordPolicy implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("minimum_length")
  private String minimumLength = null;

  public PasswordPolicy minimumLength(String minimumLength) {
    this.minimumLength = minimumLength;
    return this;
  }

   /**
   * Minimum length for the password. A number between 8 and 512.
   * @return minimumLength
  **/
  @ApiModelProperty(example = "8", required = true, value = "Minimum length for the password. A number between 8 and 512.")
  public String getMinimumLength() {
    return minimumLength;
  }

  public void setMinimumLength(String minimumLength) {
    this.minimumLength = minimumLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordPolicy passwordPolicy = (PasswordPolicy) o;
    return Objects.equals(this.minimumLength, passwordPolicy.minimumLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicy {\n");
    
    sb.append("    minimumLength: ").append(toIndentedString(minimumLength)).append("\n");
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

