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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * This object represents a user in requests towards mbed Cloud.
 */
@ApiModel(description = "This object represents a user in requests towards mbed Cloud.")

public class UserUpdateReq implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("status")
  private String status = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("is_marketing_accepted")
  private Boolean isMarketingAccepted = null;

  @SerializedName("is_gtc_accepted")
  private Boolean isGtcAccepted = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("is_totp_enabled")
  private Boolean isTotpEnabled = null;

  public UserUpdateReq status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the user.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The status of the user.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UserUpdateReq username(String username) {
    this.username = username;
    return this;
  }

   /**
   * A username containing alphanumerical letters and -,._@+= characters. It must be at least 4 but not more than 30 character long.
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "A username containing alphanumerical letters and -,._@+= characters. It must be at least 4 but not more than 30 character long.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserUpdateReq isMarketingAccepted(Boolean isMarketingAccepted) {
    this.isMarketingAccepted = isMarketingAccepted;
    return this;
  }

   /**
   * A flag indicating that receiving marketing information has been accepted.
   * @return isMarketingAccepted
  **/
  @ApiModelProperty(example = "null", value = "A flag indicating that receiving marketing information has been accepted.")
  public Boolean getIsMarketingAccepted() {
    return isMarketingAccepted;
  }

  public void setIsMarketingAccepted(Boolean isMarketingAccepted) {
    this.isMarketingAccepted = isMarketingAccepted;
  }

  public UserUpdateReq isGtcAccepted(Boolean isGtcAccepted) {
    this.isGtcAccepted = isGtcAccepted;
    return this;
  }

   /**
   * A flag indicating that the General Terms and Conditions has been accepted.
   * @return isGtcAccepted
  **/
  @ApiModelProperty(example = "null", value = "A flag indicating that the General Terms and Conditions has been accepted.")
  public Boolean getIsGtcAccepted() {
    return isGtcAccepted;
  }

  public void setIsGtcAccepted(Boolean isGtcAccepted) {
    this.isGtcAccepted = isGtcAccepted;
  }

  public UserUpdateReq email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address, not longer than 254 characters.
   * @return email
  **/
  @ApiModelProperty(example = "null", required = true, value = "The email address, not longer than 254 characters.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserUpdateReq fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * The full name of the user, not longer than 100 characters.
   * @return fullName
  **/
  @ApiModelProperty(example = "null", value = "The full name of the user, not longer than 100 characters.")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserUpdateReq address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address, not longer than 100 characters.
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "Address, not longer than 100 characters.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UserUpdateReq password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password when creating a new user. It will will generated when not present in the request.
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "The password when creating a new user. It will will generated when not present in the request.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserUpdateReq phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number, not longer than 100 characters.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "Phone number, not longer than 100 characters.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UserUpdateReq isTotpEnabled(Boolean isTotpEnabled) {
    this.isTotpEnabled = isTotpEnabled;
    return this;
  }

   /**
   * A flag indicating whether 2-factor authentication (TOTP) has to be enabled or disabled.
   * @return isTotpEnabled
  **/
  @ApiModelProperty(example = "null", value = "A flag indicating whether 2-factor authentication (TOTP) has to be enabled or disabled.")
  public Boolean getIsTotpEnabled() {
    return isTotpEnabled;
  }

  public void setIsTotpEnabled(Boolean isTotpEnabled) {
    this.isTotpEnabled = isTotpEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateReq userUpdateReq = (UserUpdateReq) o;
    return Objects.equals(this.status, userUpdateReq.status) &&
        Objects.equals(this.username, userUpdateReq.username) &&
        Objects.equals(this.isMarketingAccepted, userUpdateReq.isMarketingAccepted) &&
        Objects.equals(this.isGtcAccepted, userUpdateReq.isGtcAccepted) &&
        Objects.equals(this.email, userUpdateReq.email) &&
        Objects.equals(this.fullName, userUpdateReq.fullName) &&
        Objects.equals(this.address, userUpdateReq.address) &&
        Objects.equals(this.password, userUpdateReq.password) &&
        Objects.equals(this.phoneNumber, userUpdateReq.phoneNumber) &&
        Objects.equals(this.isTotpEnabled, userUpdateReq.isTotpEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, username, isMarketingAccepted, isGtcAccepted, email, fullName, address, password, phoneNumber, isTotpEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateReq {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    isMarketingAccepted: ").append(toIndentedString(isMarketingAccepted)).append("\n");
    sb.append("    isGtcAccepted: ").append(toIndentedString(isGtcAccepted)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    isTotpEnabled: ").append(toIndentedString(isTotpEnabled)).append("\n");
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

