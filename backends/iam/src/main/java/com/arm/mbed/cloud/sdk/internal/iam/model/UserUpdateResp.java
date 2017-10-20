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
import com.arm.mbed.cloud.sdk.internal.iam.model.LoginHistory;
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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * This object represents a user update response.
 */
@ApiModel(description = "This object represents a user update response.")

public class UserUpdateResp implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("username")
  private String username = null;

  @SerializedName("login_history")
  private List<LoginHistory> loginHistory = null;

  @SerializedName("creation_time")
  private Long creationTime = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("last_login_time")
  private Long lastLoginTime = null;

  @SerializedName("is_gtc_accepted")
  private Boolean isGtcAccepted = null;

  @SerializedName("etag")
  private String etag = null;

  @SerializedName("is_marketing_accepted")
  private Boolean isMarketingAccepted = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("email")
  private String email = null;

  /**
   * The status of the user. ENROLLING state indicates that the user is in the middle of the enrollment process. INVITED means that the user has not accepted the invitation request. RESET means that the password must be changed immediately. INACTIVE users are locked out and not permitted to use the system.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ENROLLING("ENROLLING"),
    
    INVITED("INVITED"),
    
    ACTIVE("ACTIVE"),
    
    RESET("RESET"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("totp_scratch_codes")
  private List<String> totpScratchCodes = null;

  /**
   * Entity name: always &#39;user&#39;
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    USER("user"),
    
    API_KEY("api-key"),
    
    GROUP("group"),
    
    ACCOUNT("account"),
    
    ACCOUNT_TEMPLATE("account-template"),
    
    TRUSTED_CERT("trusted-cert"),
    
    LIST("list"),
    
    ERROR("error");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ObjectEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("object")
  private ObjectEnum object = null;

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("totp_secret")
  private String totpSecret = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("email_verified")
  private Boolean emailVerified = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("is_totp_enabled")
  private Boolean isTotpEnabled = null;

  @SerializedName("password_changed_time")
  private Long passwordChangedTime = null;

  public UserUpdateResp username(String username) {
    this.username = username;
    return this;
  }

   /**
   * A username containing alphanumerical letters and -,._@+&#x3D; characters.
   * @return username
  **/
  @ApiModelProperty(value = "A username containing alphanumerical letters and -,._@+= characters.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserUpdateResp loginHistory(List<LoginHistory> loginHistory) {
    this.loginHistory = loginHistory;
    return this;
  }

  public UserUpdateResp addLoginHistoryItem(LoginHistory loginHistoryItem) {
    if (this.loginHistory == null) {
      this.loginHistory = new ArrayList<LoginHistory>();
    }
    this.loginHistory.add(loginHistoryItem);
    return this;
  }

   /**
   * Timestamps, succeedings, IP addresses and user agent information of the last five logins of the user, with timestamps in RFC3339 format.
   * @return loginHistory
  **/
  @ApiModelProperty(value = "Timestamps, succeedings, IP addresses and user agent information of the last five logins of the user, with timestamps in RFC3339 format.")
  public List<LoginHistory> getLoginHistory() {
    return loginHistory;
  }

  public void setLoginHistory(List<LoginHistory> loginHistory) {
    this.loginHistory = loginHistory;
  }

  public UserUpdateResp creationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * A timestamp of the user creation in the storage, in milliseconds.
   * @return creationTime
  **/
  @ApiModelProperty(value = "A timestamp of the user creation in the storage, in milliseconds.")
  public Long getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }

  public UserUpdateResp fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * The full name of the user.
   * @return fullName
  **/
  @ApiModelProperty(value = "The full name of the user.")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserUpdateResp id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The UUID of the user.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The UUID of the user.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserUpdateResp lastLoginTime(Long lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
    return this;
  }

   /**
   * A timestamp of the latest login of the user, in milliseconds.
   * @return lastLoginTime
  **/
  @ApiModelProperty(value = "A timestamp of the latest login of the user, in milliseconds.")
  public Long getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(Long lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }

  public UserUpdateResp isGtcAccepted(Boolean isGtcAccepted) {
    this.isGtcAccepted = isGtcAccepted;
    return this;
  }

   /**
   * A flag indicating that the General Terms and Conditions has been accepted.
   * @return isGtcAccepted
  **/
  @ApiModelProperty(value = "A flag indicating that the General Terms and Conditions has been accepted.")
  public Boolean getIsGtcAccepted() {
    return isGtcAccepted;
  }

  public void setIsGtcAccepted(Boolean isGtcAccepted) {
    this.isGtcAccepted = isGtcAccepted;
  }

  public UserUpdateResp etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * API resource entity version.
   * @return etag
  **/
  @ApiModelProperty(required = true, value = "API resource entity version.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public UserUpdateResp isMarketingAccepted(Boolean isMarketingAccepted) {
    this.isMarketingAccepted = isMarketingAccepted;
    return this;
  }

   /**
   * A flag indicating that receiving marketing information has been accepted.
   * @return isMarketingAccepted
  **/
  @ApiModelProperty(value = "A flag indicating that receiving marketing information has been accepted.")
  public Boolean getIsMarketingAccepted() {
    return isMarketingAccepted;
  }

  public void setIsMarketingAccepted(Boolean isMarketingAccepted) {
    this.isMarketingAccepted = isMarketingAccepted;
  }

  public UserUpdateResp phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UserUpdateResp email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserUpdateResp status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the user. ENROLLING state indicates that the user is in the middle of the enrollment process. INVITED means that the user has not accepted the invitation request. RESET means that the password must be changed immediately. INACTIVE users are locked out and not permitted to use the system.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the user. ENROLLING state indicates that the user is in the middle of the enrollment process. INVITED means that the user has not accepted the invitation request. RESET means that the password must be changed immediately. INACTIVE users are locked out and not permitted to use the system.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UserUpdateResp accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The UUID of the account.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The UUID of the account.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UserUpdateResp totpScratchCodes(List<String> totpScratchCodes) {
    this.totpScratchCodes = totpScratchCodes;
    return this;
  }

  public UserUpdateResp addTotpScratchCodesItem(String totpScratchCodesItem) {
    if (this.totpScratchCodes == null) {
      this.totpScratchCodes = new ArrayList<String>();
    }
    this.totpScratchCodes.add(totpScratchCodesItem);
    return this;
  }

   /**
   * A list of scratch codes for the 2-factor authentication. Visible only when 2FA is requested to be enabled or the codes regenerated.
   * @return totpScratchCodes
  **/
  @ApiModelProperty(value = "A list of scratch codes for the 2-factor authentication. Visible only when 2FA is requested to be enabled or the codes regenerated.")
  public List<String> getTotpScratchCodes() {
    return totpScratchCodes;
  }

  public void setTotpScratchCodes(List<String> totpScratchCodes) {
    this.totpScratchCodes = totpScratchCodes;
  }

  public UserUpdateResp object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Entity name: always &#39;user&#39;
   * @return object
  **/
  @ApiModelProperty(required = true, value = "Entity name: always 'user'")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public UserUpdateResp groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public UserUpdateResp addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of IDs of the groups this user belongs to.
   * @return groups
  **/
  @ApiModelProperty(value = "A list of IDs of the groups this user belongs to.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public UserUpdateResp address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address.
   * @return address
  **/
  @ApiModelProperty(value = "Address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UserUpdateResp totpSecret(String totpSecret) {
    this.totpSecret = totpSecret;
    return this;
  }

   /**
   * Secret for the 2-factor authenticator app. Visible only when 2FA is requested to be enabled.
   * @return totpSecret
  **/
  @ApiModelProperty(value = "Secret for the 2-factor authenticator app. Visible only when 2FA is requested to be enabled.")
  public String getTotpSecret() {
    return totpSecret;
  }

  public void setTotpSecret(String totpSecret) {
    this.totpSecret = totpSecret;
  }

  public UserUpdateResp password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password when creating a new user. It will be generated when not present in the request.
   * @return password
  **/
  @ApiModelProperty(value = "The password when creating a new user. It will be generated when not present in the request.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserUpdateResp emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * A flag indicating whether the user&#39;s email address has been verified or not.
   * @return emailVerified
  **/
  @ApiModelProperty(value = "A flag indicating whether the user's email address has been verified or not.")
  public Boolean getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public UserUpdateResp createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC time RFC3339.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation UTC time RFC3339.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserUpdateResp isTotpEnabled(Boolean isTotpEnabled) {
    this.isTotpEnabled = isTotpEnabled;
    return this;
  }

   /**
   * A flag indicating whether 2-factor authentication (TOTP) has been enabled.
   * @return isTotpEnabled
  **/
  @ApiModelProperty(value = "A flag indicating whether 2-factor authentication (TOTP) has been enabled.")
  public Boolean getIsTotpEnabled() {
    return isTotpEnabled;
  }

  public void setIsTotpEnabled(Boolean isTotpEnabled) {
    this.isTotpEnabled = isTotpEnabled;
  }

  public UserUpdateResp passwordChangedTime(Long passwordChangedTime) {
    this.passwordChangedTime = passwordChangedTime;
    return this;
  }

   /**
   * A timestamp of the latest change of the user password, in milliseconds.
   * @return passwordChangedTime
  **/
  @ApiModelProperty(value = "A timestamp of the latest change of the user password, in milliseconds.")
  public Long getPasswordChangedTime() {
    return passwordChangedTime;
  }

  public void setPasswordChangedTime(Long passwordChangedTime) {
    this.passwordChangedTime = passwordChangedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateResp userUpdateResp = (UserUpdateResp) o;
    return Objects.equals(this.username, userUpdateResp.username) &&
        Objects.equals(this.loginHistory, userUpdateResp.loginHistory) &&
        Objects.equals(this.creationTime, userUpdateResp.creationTime) &&
        Objects.equals(this.fullName, userUpdateResp.fullName) &&
        Objects.equals(this.id, userUpdateResp.id) &&
        Objects.equals(this.lastLoginTime, userUpdateResp.lastLoginTime) &&
        Objects.equals(this.isGtcAccepted, userUpdateResp.isGtcAccepted) &&
        Objects.equals(this.etag, userUpdateResp.etag) &&
        Objects.equals(this.isMarketingAccepted, userUpdateResp.isMarketingAccepted) &&
        Objects.equals(this.phoneNumber, userUpdateResp.phoneNumber) &&
        Objects.equals(this.email, userUpdateResp.email) &&
        Objects.equals(this.status, userUpdateResp.status) &&
        Objects.equals(this.accountId, userUpdateResp.accountId) &&
        Objects.equals(this.totpScratchCodes, userUpdateResp.totpScratchCodes) &&
        Objects.equals(this.object, userUpdateResp.object) &&
        Objects.equals(this.groups, userUpdateResp.groups) &&
        Objects.equals(this.address, userUpdateResp.address) &&
        Objects.equals(this.totpSecret, userUpdateResp.totpSecret) &&
        Objects.equals(this.password, userUpdateResp.password) &&
        Objects.equals(this.emailVerified, userUpdateResp.emailVerified) &&
        Objects.equals(this.createdAt, userUpdateResp.createdAt) &&
        Objects.equals(this.isTotpEnabled, userUpdateResp.isTotpEnabled) &&
        Objects.equals(this.passwordChangedTime, userUpdateResp.passwordChangedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, loginHistory, creationTime, fullName, id, lastLoginTime, isGtcAccepted, etag, isMarketingAccepted, phoneNumber, email, status, accountId, totpScratchCodes, object, groups, address, totpSecret, password, emailVerified, createdAt, isTotpEnabled, passwordChangedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateResp {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    loginHistory: ").append(toIndentedString(loginHistory)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastLoginTime: ").append(toIndentedString(lastLoginTime)).append("\n");
    sb.append("    isGtcAccepted: ").append(toIndentedString(isGtcAccepted)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    isMarketingAccepted: ").append(toIndentedString(isMarketingAccepted)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    totpScratchCodes: ").append(toIndentedString(totpScratchCodes)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    totpSecret: ").append(toIndentedString(totpSecret)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isTotpEnabled: ").append(toIndentedString(isTotpEnabled)).append("\n");
    sb.append("    passwordChangedTime: ").append(toIndentedString(passwordChangedTime)).append("\n");
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

