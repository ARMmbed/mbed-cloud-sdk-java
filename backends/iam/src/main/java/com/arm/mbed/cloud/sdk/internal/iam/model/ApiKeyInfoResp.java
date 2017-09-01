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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * This object represents an API key in mbed Cloud.
 */
@ApiModel(description = "This object represents an API key in mbed Cloud.")

public class ApiKeyInfoResp implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("groups")
  private List<String> groups = new ArrayList<String>();

  /**
   * The status of the API key.
   */
  public enum StatusEnum {
    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),
    
    @SerializedName("INACTIVE")
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  /**
   * Entity name: always 'api-key'
   */
  public enum ObjectEnum {
    @SerializedName("user")
    USER("user"),
    
    @SerializedName("api-key")
    API_KEY("api-key"),
    
    @SerializedName("group")
    GROUP("group"),
    
    @SerializedName("account")
    ACCOUNT("account"),
    
    @SerializedName("account-template")
    ACCOUNT_TEMPLATE("account-template"),
    
    @SerializedName("trusted-cert")
    TRUSTED_CERT("trusted-cert"),
    
    @SerializedName("list")
    LIST("list"),
    
    @SerializedName("error")
    ERROR("error");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("object")
  private ObjectEnum object = null;

  @SerializedName("creation_time")
  private Long creationTime = null;

  @SerializedName("etag")
  private String etag = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("last_login_time")
  private Long lastLoginTime = null;

  public ApiKeyInfoResp groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ApiKeyInfoResp addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of group IDs this API key belongs to.
   * @return groups
  **/
  @ApiModelProperty(example = "null", value = "A list of group IDs this API key belongs to.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public ApiKeyInfoResp status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the API key.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The status of the API key.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ApiKeyInfoResp name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name for the API key.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The display name for the API key.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiKeyInfoResp createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC time RFC3339.
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "Creation UTC time RFC3339.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ApiKeyInfoResp object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Entity name: always 'api-key'
   * @return object
  **/
  @ApiModelProperty(example = "null", required = true, value = "Entity name: always 'api-key'")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public ApiKeyInfoResp creationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The timestamp of the API key creation in the storage, in milliseconds.
   * @return creationTime
  **/
  @ApiModelProperty(example = "null", value = "The timestamp of the API key creation in the storage, in milliseconds.")
  public Long getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }

  public ApiKeyInfoResp etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * API resource entity version.
   * @return etag
  **/
  @ApiModelProperty(example = "null", required = true, value = "API resource entity version.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public ApiKeyInfoResp key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The API key.
   * @return key
  **/
  @ApiModelProperty(example = "null", required = true, value = "The API key.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApiKeyInfoResp owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner of this API key, who is the creator by default.
   * @return owner
  **/
  @ApiModelProperty(example = "null", value = "The owner of this API key, who is the creator by default.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ApiKeyInfoResp id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The UUID of the API key.
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "The UUID of the API key.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApiKeyInfoResp lastLoginTime(Long lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
    return this;
  }

   /**
   * The timestamp of the latest API key usage, in milliseconds.
   * @return lastLoginTime
  **/
  @ApiModelProperty(example = "null", value = "The timestamp of the latest API key usage, in milliseconds.")
  public Long getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(Long lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyInfoResp apiKeyInfoResp = (ApiKeyInfoResp) o;
    return Objects.equals(this.groups, apiKeyInfoResp.groups) &&
        Objects.equals(this.status, apiKeyInfoResp.status) &&
        Objects.equals(this.name, apiKeyInfoResp.name) &&
        Objects.equals(this.createdAt, apiKeyInfoResp.createdAt) &&
        Objects.equals(this.object, apiKeyInfoResp.object) &&
        Objects.equals(this.creationTime, apiKeyInfoResp.creationTime) &&
        Objects.equals(this.etag, apiKeyInfoResp.etag) &&
        Objects.equals(this.key, apiKeyInfoResp.key) &&
        Objects.equals(this.owner, apiKeyInfoResp.owner) &&
        Objects.equals(this.id, apiKeyInfoResp.id) &&
        Objects.equals(this.lastLoginTime, apiKeyInfoResp.lastLoginTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, status, name, createdAt, object, creationTime, etag, key, owner, id, lastLoginTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyInfoResp {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastLoginTime: ").append(toIndentedString(lastLoginTime)).append("\n");
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

