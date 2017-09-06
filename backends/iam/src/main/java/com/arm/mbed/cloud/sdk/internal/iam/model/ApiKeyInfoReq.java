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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * This object represents an API key in requests towards mbed Cloud.
 */
@ApiModel(description = "This object represents an API key in requests towards mbed Cloud.")

public class ApiKeyInfoReq implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("owner")
  private String owner = null;

  /**
   * The status of the API key.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
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

  @SerializedName("name")
  private String name = null;

  @SerializedName("groups")
  private List<String> groups = null;

  public ApiKeyInfoReq owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner of this API key, who is the creator by default.
   * @return owner
  **/
  @ApiModelProperty(value = "The owner of this API key, who is the creator by default.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ApiKeyInfoReq status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the API key.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the API key.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ApiKeyInfoReq name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name for the API key, not longer than 100 characters.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The display name for the API key, not longer than 100 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiKeyInfoReq groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ApiKeyInfoReq addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of group IDs this API key belongs to.
   * @return groups
  **/
  @ApiModelProperty(value = "A list of group IDs this API key belongs to.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyInfoReq apiKeyInfoReq = (ApiKeyInfoReq) o;
    return Objects.equals(this.owner, apiKeyInfoReq.owner) &&
        Objects.equals(this.status, apiKeyInfoReq.status) &&
        Objects.equals(this.name, apiKeyInfoReq.name) &&
        Objects.equals(this.groups, apiKeyInfoReq.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, status, name, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyInfoReq {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

