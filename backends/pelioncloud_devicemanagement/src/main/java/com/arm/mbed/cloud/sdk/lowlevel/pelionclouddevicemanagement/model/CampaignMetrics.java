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
 * CampaignMetrics
 */

public class CampaignMetrics implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("failed_count")
    private Integer failedCount = null;

    @SerializedName("object")
    private String object = null;

    @SerializedName("pending_count")
    private Integer pendingCount = null;

    @SerializedName("skipped_count")
    private Integer skippedCount = null;

    @SerializedName("success_count")
    private Integer successCount = null;

    @SerializedName("total_count")
    private Integer totalCount = null;

    public CampaignMetrics createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time the metrics were created.
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "The time the metrics were created.")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CampaignMetrics failedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * Running total of devices that could not be updated.
     * 
     * @return failedCount
     **/
    @ApiModelProperty(example = "0", value = "Running total of devices that could not be updated.")
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public CampaignMetrics object(String object) {
        this.object = object;
        return this;
    }

    /**
     * Entity name: always &#39;update-campaign-metrics&#39;.
     * 
     * @return object
     **/
    @ApiModelProperty(example = "update-campaign-metrics", value = "Entity name: always 'update-campaign-metrics'.")
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public CampaignMetrics pendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    /**
     * Running total of devices that have yet to receive an update or are applying an update.
     * 
     * @return pendingCount
     **/
    @ApiModelProperty(example = "5",
                      value = "Running total of devices that have yet to receive an update or are applying an update.")
    public Integer getPendingCount() {
        return pendingCount;
    }

    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }

    public CampaignMetrics skippedCount(Integer skippedCount) {
        this.skippedCount = skippedCount;
        return this;
    }

    /**
     * Running total of devices that were skipped.
     * 
     * @return skippedCount
     **/
    @ApiModelProperty(example = "5", value = "Running total of devices that were skipped.")
    public Integer getSkippedCount() {
        return skippedCount;
    }

    public void setSkippedCount(Integer skippedCount) {
        this.skippedCount = skippedCount;
    }

    public CampaignMetrics successCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * Running total of successfully updated devices.
     * 
     * @return successCount
     **/
    @ApiModelProperty(example = "90", value = "Running total of successfully updated devices.")
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public CampaignMetrics totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Number of devices in the campaign.
     * 
     * @return totalCount
     **/
    @ApiModelProperty(example = "100", value = "Number of devices in the campaign.")
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignMetrics campaignMetrics = (CampaignMetrics) o;
        return Objects.equals(this.createdAt, campaignMetrics.createdAt)
               && Objects.equals(this.failedCount, campaignMetrics.failedCount)
               && Objects.equals(this.object, campaignMetrics.object)
               && Objects.equals(this.pendingCount, campaignMetrics.pendingCount)
               && Objects.equals(this.skippedCount, campaignMetrics.skippedCount)
               && Objects.equals(this.successCount, campaignMetrics.successCount)
               && Objects.equals(this.totalCount, campaignMetrics.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, failedCount, object, pendingCount, skippedCount, successCount, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignMetrics {\n");

        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    pendingCount: ").append(toIndentedString(pendingCount)).append("\n");
        sb.append("    skippedCount: ").append(toIndentedString(skippedCount)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
