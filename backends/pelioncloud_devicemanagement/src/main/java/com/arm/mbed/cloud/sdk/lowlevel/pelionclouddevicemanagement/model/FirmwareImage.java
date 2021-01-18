/*
 * Pelion Device Management API
 * Pelion Device Management API build from the publicly defined API definitions.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * FirmwareImage
 */

public class FirmwareImage implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("datafile")
    private String datafile = null;

    @SerializedName("datafile_checksum")
    private String datafileChecksum = null;

    @SerializedName("datafile_size")
    private Long datafileSize = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("etag")
    private String etag = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("object")
    private String object = null;

    @SerializedName("updated_at")
    private DateTime updatedAt = null;

    public FirmwareImage createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time the entity was created.
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "The time the entity was created.")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public FirmwareImage datafile(String datafile) {
        this.datafile = datafile;
        return this;
    }

    /**
     * The firmware image file URL.
     * 
     * @return datafile
     **/
    @ApiModelProperty(example = "http://bucket.com/myimage.elf", value = "The firmware image file URL.")
    public String getDatafile() {
        return datafile;
    }

    public void setDatafile(String datafile) {
        this.datafile = datafile;
    }

    public FirmwareImage datafileChecksum(String datafileChecksum) {
        this.datafileChecksum = datafileChecksum;
        return this;
    }

    /**
     * The checksum (sha256) generated for the datafile.
     * 
     * @return datafileChecksum
     **/
    @ApiModelProperty(example = "e979fe432d6a19b0e70a93b33ac29094cd5fe35a8fd5fbedfd383d8d107d6a7e",
                      value = "The checksum (sha256) generated for the datafile.")
    public String getDatafileChecksum() {
        return datafileChecksum;
    }

    public void setDatafileChecksum(String datafileChecksum) {
        this.datafileChecksum = datafileChecksum;
    }

    public FirmwareImage datafileSize(Long datafileSize) {
        this.datafileSize = datafileSize;
        return this;
    }

    /**
     * The size of the datafile in bytes.
     * 
     * @return datafileSize
     **/
    @ApiModelProperty(value = "The size of the datafile in bytes.")
    public Long getDatafileSize() {
        return datafileSize;
    }

    public void setDatafileSize(Long datafileSize) {
        this.datafileSize = datafileSize;
    }

    public FirmwareImage description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the object.
     * 
     * @return description
     **/
    @ApiModelProperty(example = "a description", value = "The description of the object.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FirmwareImage etag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * API resource entity version.
     * 
     * @return etag
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:58.753425Z", value = "API resource entity version.")
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public FirmwareImage id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The firmware image ID.
     * 
     * @return id
     **/
    @ApiModelProperty(example = "016e652be671000000000001001001e5", value = "The firmware image ID.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FirmwareImage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The firmware image name.
     * 
     * @return name
     **/
    @ApiModelProperty(value = "The firmware image name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirmwareImage object(String object) {
        this.object = object;
        return this;
    }

    /**
     * Entity name: always &#39;firmware-image&#39;.
     * 
     * @return object
     **/
    @ApiModelProperty(example = "firmware-image", value = "Entity name: always 'firmware-image'.")
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public FirmwareImage updatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time the entity was updated.
     * 
     * @return updatedAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "The time the entity was updated.")
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
        FirmwareImage firmwareImage = (FirmwareImage) o;
        return Objects.equals(this.createdAt, firmwareImage.createdAt)
               && Objects.equals(this.datafile, firmwareImage.datafile)
               && Objects.equals(this.datafileChecksum, firmwareImage.datafileChecksum)
               && Objects.equals(this.datafileSize, firmwareImage.datafileSize)
               && Objects.equals(this.description, firmwareImage.description)
               && Objects.equals(this.etag, firmwareImage.etag) && Objects.equals(this.id, firmwareImage.id)
               && Objects.equals(this.name, firmwareImage.name) && Objects.equals(this.object, firmwareImage.object)
               && Objects.equals(this.updatedAt, firmwareImage.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, datafile, datafileChecksum, datafileSize, description, etag, id, name, object,
                            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirmwareImage {\n");

        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    datafile: ").append(toIndentedString(datafile)).append("\n");
        sb.append("    datafileChecksum: ").append(toIndentedString(datafileChecksum)).append("\n");
        sb.append("    datafileSize: ").append(toIndentedString(datafileSize)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
