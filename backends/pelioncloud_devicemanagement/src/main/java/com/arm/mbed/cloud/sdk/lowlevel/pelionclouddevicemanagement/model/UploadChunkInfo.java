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
 * UploadChunkInfo
 */

public class UploadChunkInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("etag")
    private String etag = null;

    @SerializedName("hash")
    private String hash = null;

    @SerializedName("id")
    private Integer id = null;

    @SerializedName("length")
    private Integer length = null;

    @SerializedName("object")
    private String object = null;

    @SerializedName("updated_at")
    private DateTime updatedAt = null;

    @SerializedName("upload_job_id")
    private String uploadJobId = null;

    public UploadChunkInfo createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time the entity was created
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "The time the entity was created")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public UploadChunkInfo etag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * API resource entity version
     * 
     * @return etag
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:58.753425Z", value = "API resource entity version")
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public UploadChunkInfo hash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * The hash of the chunk. The default hash is MD5. If no Content-MD5 header is supplied as part of uploading the
     * chunk then this will be empty.
     * 
     * @return hash
     **/
    @ApiModelProperty(value = "The hash of the chunk. The default hash is MD5. If no Content-MD5 header is supplied as part of uploading the chunk then this will be empty.")
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public UploadChunkInfo id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * The chunk number
     * 
     * @return id
     **/
    @ApiModelProperty(example = "1", value = "The chunk number")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UploadChunkInfo length(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * The length of the chunk
     * 
     * @return length
     **/
    @ApiModelProperty(example = "1234", value = "The length of the chunk")
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public UploadChunkInfo object(String object) {
        this.object = object;
        return this;
    }

    /**
     * Entity name: always &#39;upload-info&#39;
     * 
     * @return object
     **/
    @ApiModelProperty(example = "upload-info", value = "Entity name: always 'upload-info'")
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public UploadChunkInfo updatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time the entity was updated
     * 
     * @return updatedAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "The time the entity was updated")
    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UploadChunkInfo uploadJobId(String uploadJobId) {
        this.uploadJobId = uploadJobId;
        return this;
    }

    /**
     * The upload job ID.
     * 
     * @return uploadJobId
     **/
    @ApiModelProperty(example = "00000000000000000000000000000000", value = "The upload job ID.")
    public String getUploadJobId() {
        return uploadJobId;
    }

    public void setUploadJobId(String uploadJobId) {
        this.uploadJobId = uploadJobId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadChunkInfo uploadChunkInfo = (UploadChunkInfo) o;
        return Objects.equals(this.createdAt, uploadChunkInfo.createdAt)
               && Objects.equals(this.etag, uploadChunkInfo.etag) && Objects.equals(this.hash, uploadChunkInfo.hash)
               && Objects.equals(this.id, uploadChunkInfo.id) && Objects.equals(this.length, uploadChunkInfo.length)
               && Objects.equals(this.object, uploadChunkInfo.object)
               && Objects.equals(this.updatedAt, uploadChunkInfo.updatedAt)
               && Objects.equals(this.uploadJobId, uploadChunkInfo.uploadJobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, etag, hash, id, length, object, updatedAt, uploadJobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadChunkInfo {\n");

        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    uploadJobId: ").append(toIndentedString(uploadJobId)).append("\n");
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
