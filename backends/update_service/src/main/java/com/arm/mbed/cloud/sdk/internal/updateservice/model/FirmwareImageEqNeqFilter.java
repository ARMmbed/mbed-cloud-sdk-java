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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * FirmwareImageEqNeqFilter
 */

public class FirmwareImageEqNeqFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("datafile")
  private String datafile = null;

  @SerializedName("datafile_checksum")
  private String datafileChecksum = null;

  @SerializedName("datafile_size")
  private Integer datafileSize = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("etag")
  private DateTime etag = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public FirmwareImageEqNeqFilter createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FirmwareImageEqNeqFilter datafile(String datafile) {
    this.datafile = datafile;
    return this;
  }

   /**
   * Get datafile
   * @return datafile
  **/
  @ApiModelProperty(value = "")
  public String getDatafile() {
    return datafile;
  }

  public void setDatafile(String datafile) {
    this.datafile = datafile;
  }

  public FirmwareImageEqNeqFilter datafileChecksum(String datafileChecksum) {
    this.datafileChecksum = datafileChecksum;
    return this;
  }

   /**
   * Get datafileChecksum
   * @return datafileChecksum
  **/
  @ApiModelProperty(value = "")
  public String getDatafileChecksum() {
    return datafileChecksum;
  }

  public void setDatafileChecksum(String datafileChecksum) {
    this.datafileChecksum = datafileChecksum;
  }

  public FirmwareImageEqNeqFilter datafileSize(Integer datafileSize) {
    this.datafileSize = datafileSize;
    return this;
  }

   /**
   * Get datafileSize
   * @return datafileSize
  **/
  @ApiModelProperty(value = "")
  public Integer getDatafileSize() {
    return datafileSize;
  }

  public void setDatafileSize(Integer datafileSize) {
    this.datafileSize = datafileSize;
  }

  public FirmwareImageEqNeqFilter description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FirmwareImageEqNeqFilter etag(DateTime etag) {
    this.etag = etag;
    return this;
  }

   /**
   * Get etag
   * @return etag
  **/
  @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
  public DateTime getEtag() {
    return etag;
  }

  public void setEtag(DateTime etag) {
    this.etag = etag;
  }

  public FirmwareImageEqNeqFilter id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FirmwareImageEqNeqFilter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FirmwareImageEqNeqFilter updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareImageEqNeqFilter firmwareImageEqNeqFilter = (FirmwareImageEqNeqFilter) o;
    return Objects.equals(this.createdAt, firmwareImageEqNeqFilter.createdAt) &&
        Objects.equals(this.datafile, firmwareImageEqNeqFilter.datafile) &&
        Objects.equals(this.datafileChecksum, firmwareImageEqNeqFilter.datafileChecksum) &&
        Objects.equals(this.datafileSize, firmwareImageEqNeqFilter.datafileSize) &&
        Objects.equals(this.description, firmwareImageEqNeqFilter.description) &&
        Objects.equals(this.etag, firmwareImageEqNeqFilter.etag) &&
        Objects.equals(this.id, firmwareImageEqNeqFilter.id) &&
        Objects.equals(this.name, firmwareImageEqNeqFilter.name) &&
        Objects.equals(this.updatedAt, firmwareImageEqNeqFilter.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, datafile, datafileChecksum, datafileSize, description, etag, id, name, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareImageEqNeqFilter {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datafile: ").append(toIndentedString(datafile)).append("\n");
    sb.append("    datafileChecksum: ").append(toIndentedString(datafileChecksum)).append("\n");
    sb.append("    datafileSize: ").append(toIndentedString(datafileSize)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

