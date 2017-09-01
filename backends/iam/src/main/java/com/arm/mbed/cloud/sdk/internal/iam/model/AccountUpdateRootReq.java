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
import com.arm.mbed.cloud.sdk.internal.iam.model.FeaturePolicy;
import com.arm.mbed.cloud.sdk.internal.iam.model.PasswordPolicy;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * This object represents an account update request.
 */
@ApiModel(description = "This object represents an account update request.")

public class AccountUpdateRootReq implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("end_market")
  private String endMarket = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("password_policy")
  private PasswordPolicy passwordPolicy = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("parentID")
  private String parentID = null;

  @SerializedName("aliases")
  private List<String> aliases = new ArrayList<String>();

  @SerializedName("address_line2")
  private String addressLine2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("address_line1")
  private String addressLine1 = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("is_provisioning_allowed")
  private Boolean isProvisioningAllowed = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("tier")
  private String tier = null;

  @SerializedName("limits")
  private Map<String, String> limits = new HashMap<String, String>();

  @SerializedName("country")
  private String country = null;

  @SerializedName("idle_timeout")
  private String idleTimeout = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("policies")
  private List<FeaturePolicy> policies = new ArrayList<FeaturePolicy>();

  @SerializedName("template_id")
  private String templateId = null;

  public AccountUpdateRootReq endMarket(String endMarket) {
    this.endMarket = endMarket;
    return this;
  }

   /**
   * The end market for this account, not longer than 100 characters.
   * @return endMarket
  **/
  @ApiModelProperty(example = "null", value = "The end market for this account, not longer than 100 characters.")
  public String getEndMarket() {
    return endMarket;
  }

  public void setEndMarket(String endMarket) {
    this.endMarket = endMarket;
  }

  public AccountUpdateRootReq phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number of the company, not longer than 100 characters.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "The phone number of the company, not longer than 100 characters.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AccountUpdateRootReq passwordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
    return this;
  }

   /**
   * Password policy for this account.
   * @return passwordPolicy
  **/
  @ApiModelProperty(example = "null", value = "Password policy for this account.")
  public PasswordPolicy getPasswordPolicy() {
    return passwordPolicy;
  }

  public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }

  public AccountUpdateRootReq postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code part of the postal address, not longer than 100 characters.
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", value = "The postal code part of the postal address, not longer than 100 characters.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AccountUpdateRootReq parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }

   /**
   * The ID of the parent account, if it has any.
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "The ID of the parent account, if it has any.")
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

  public AccountUpdateRootReq aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public AccountUpdateRootReq addAliasesItem(String aliasesItem) {
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * An array of aliases, not more than 10. An alias is not shorter than 8 and not longer than 100 characters.
   * @return aliases
  **/
  @ApiModelProperty(example = "null", value = "An array of aliases, not more than 10. An alias is not shorter than 8 and not longer than 100 characters.")
  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }

  public AccountUpdateRootReq addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Postal address line 2, not longer than 100 characters.
   * @return addressLine2
  **/
  @ApiModelProperty(example = "null", value = "Postal address line 2, not longer than 100 characters.")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public AccountUpdateRootReq city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city part of the postal address, not longer than 100 characters. Required for commercial accounts only.
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "The city part of the postal address, not longer than 100 characters. Required for commercial accounts only.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountUpdateRootReq addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Postal address line 1, not longer than 100 characters. Required for commercial accounts only.
   * @return addressLine1
  **/
  @ApiModelProperty(example = "null", value = "Postal address line 1, not longer than 100 characters. Required for commercial accounts only.")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public AccountUpdateRootReq displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name for the account, not longer than 100 characters.
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "The display name for the account, not longer than 100 characters.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AccountUpdateRootReq state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state part of the postal address, not longer than 100 characters.
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "The state part of the postal address, not longer than 100 characters.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AccountUpdateRootReq isProvisioningAllowed(Boolean isProvisioningAllowed) {
    this.isProvisioningAllowed = isProvisioningAllowed;
    return this;
  }

   /**
   * Flag (true/false) indicating whether Factory Tool is allowed to download or not. Manageable by the root admin only.
   * @return isProvisioningAllowed
  **/
  @ApiModelProperty(example = "null", value = "Flag (true/false) indicating whether Factory Tool is allowed to download or not. Manageable by the root admin only.")
  public Boolean getIsProvisioningAllowed() {
    return isProvisioningAllowed;
  }

  public void setIsProvisioningAllowed(Boolean isProvisioningAllowed) {
    this.isProvisioningAllowed = isProvisioningAllowed;
  }

  public AccountUpdateRootReq email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The company email address for this account, not longer than 100 characters. Required for commercial accounts only.
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "The company email address for this account, not longer than 100 characters. Required for commercial accounts only.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountUpdateRootReq status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the account. Manageable by the root admin only.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The status of the account. Manageable by the root admin only.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AccountUpdateRootReq company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The name of the company, not longer than 100 characters. Required for commercial accounts only.
   * @return company
  **/
  @ApiModelProperty(example = "null", value = "The name of the company, not longer than 100 characters. Required for commercial accounts only.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public AccountUpdateRootReq reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * A reason note for changing account status. Manageable by the root admin only.
   * @return reason
  **/
  @ApiModelProperty(example = "null", value = "A reason note for changing account status. Manageable by the root admin only.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public AccountUpdateRootReq tier(String tier) {
    this.tier = tier;
    return this;
  }

   /**
   * The tier level of the account; '0': free tier, '1': commercial account, '2': partner account, '98': internal/demo account, '99': root admin team. Other values are reserved for the future. Manageable by the root admin only.
   * @return tier
  **/
  @ApiModelProperty(example = "null", value = "The tier level of the account; '0': free tier, '1': commercial account, '2': partner account, '98': internal/demo account, '99': root admin team. Other values are reserved for the future. Manageable by the root admin only.")
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }

  public AccountUpdateRootReq limits(Map<String, String> limits) {
    this.limits = limits;
    return this;
  }

  public AccountUpdateRootReq putLimitsItem(String key, String limitsItem) {
    this.limits.put(key, limitsItem);
    return this;
  }

   /**
   * List of service limits. Manageable by the root admin only.
   * @return limits
  **/
  @ApiModelProperty(example = "null", value = "List of service limits. Manageable by the root admin only.")
  public Map<String, String> getLimits() {
    return limits;
  }

  public void setLimits(Map<String, String> limits) {
    this.limits = limits;
  }

  public AccountUpdateRootReq country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country part of the postal address, not longer than 100 characters. Required for commercial accounts only.
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "The country part of the postal address, not longer than 100 characters. Required for commercial accounts only.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountUpdateRootReq idleTimeout(String idleTimeout) {
    this.idleTimeout = idleTimeout;
    return this;
  }

   /**
   * The reference token expiration time in minutes for this account. Between 1 and 120 minutes.
   * @return idleTimeout
  **/
  @ApiModelProperty(example = "null", value = "The reference token expiration time in minutes for this account. Between 1 and 120 minutes.")
  public String getIdleTimeout() {
    return idleTimeout;
  }

  public void setIdleTimeout(String idleTimeout) {
    this.idleTimeout = idleTimeout;
  }

  public AccountUpdateRootReq contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * The name of the contact person for this account, not longer than 100 characters. Required for commercial accounts only.
   * @return contact
  **/
  @ApiModelProperty(example = "null", value = "The name of the contact person for this account, not longer than 100 characters. Required for commercial accounts only.")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public AccountUpdateRootReq policies(List<FeaturePolicy> policies) {
    this.policies = policies;
    return this;
  }

  public AccountUpdateRootReq addPoliciesItem(FeaturePolicy policiesItem) {
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * List of policies. Manageable by the root admin only.
   * @return policies
  **/
  @ApiModelProperty(example = "null", value = "List of policies. Manageable by the root admin only.")
  public List<FeaturePolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<FeaturePolicy> policies) {
    this.policies = policies;
  }

  public AccountUpdateRootReq templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Account template ID. Manageable by the root admin only.
   * @return templateId
  **/
  @ApiModelProperty(example = "null", value = "Account template ID. Manageable by the root admin only.")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdateRootReq accountUpdateRootReq = (AccountUpdateRootReq) o;
    return Objects.equals(this.endMarket, accountUpdateRootReq.endMarket) &&
        Objects.equals(this.phoneNumber, accountUpdateRootReq.phoneNumber) &&
        Objects.equals(this.passwordPolicy, accountUpdateRootReq.passwordPolicy) &&
        Objects.equals(this.postalCode, accountUpdateRootReq.postalCode) &&
        Objects.equals(this.parentID, accountUpdateRootReq.parentID) &&
        Objects.equals(this.aliases, accountUpdateRootReq.aliases) &&
        Objects.equals(this.addressLine2, accountUpdateRootReq.addressLine2) &&
        Objects.equals(this.city, accountUpdateRootReq.city) &&
        Objects.equals(this.addressLine1, accountUpdateRootReq.addressLine1) &&
        Objects.equals(this.displayName, accountUpdateRootReq.displayName) &&
        Objects.equals(this.state, accountUpdateRootReq.state) &&
        Objects.equals(this.isProvisioningAllowed, accountUpdateRootReq.isProvisioningAllowed) &&
        Objects.equals(this.email, accountUpdateRootReq.email) &&
        Objects.equals(this.status, accountUpdateRootReq.status) &&
        Objects.equals(this.company, accountUpdateRootReq.company) &&
        Objects.equals(this.reason, accountUpdateRootReq.reason) &&
        Objects.equals(this.tier, accountUpdateRootReq.tier) &&
        Objects.equals(this.limits, accountUpdateRootReq.limits) &&
        Objects.equals(this.country, accountUpdateRootReq.country) &&
        Objects.equals(this.idleTimeout, accountUpdateRootReq.idleTimeout) &&
        Objects.equals(this.contact, accountUpdateRootReq.contact) &&
        Objects.equals(this.policies, accountUpdateRootReq.policies) &&
        Objects.equals(this.templateId, accountUpdateRootReq.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMarket, phoneNumber, passwordPolicy, postalCode, parentID, aliases, addressLine2, city, addressLine1, displayName, state, isProvisioningAllowed, email, status, company, reason, tier, limits, country, idleTimeout, contact, policies, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdateRootReq {\n");
    
    sb.append("    endMarket: ").append(toIndentedString(endMarket)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    isProvisioningAllowed: ").append(toIndentedString(isProvisioningAllowed)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    idleTimeout: ").append(toIndentedString(idleTimeout)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

