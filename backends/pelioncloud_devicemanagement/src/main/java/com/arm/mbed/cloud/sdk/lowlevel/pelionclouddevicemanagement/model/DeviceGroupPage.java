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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * DeviceGroupPage
 */

public class DeviceGroupPage implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("after")
    private String after = null;

    @SerializedName("data")
    private List<DeviceGroup> data = null;

    @SerializedName("has_more")
    private Boolean hasMore = null;

    @SerializedName("limit")
    private Integer limit = null;

    @SerializedName("object")
    private String object = null;

    @SerializedName("order")
    private String order = null;

    @SerializedName("total_count")
    private Integer totalCount = null;

    public DeviceGroupPage after(String after) {
        this.after = after;
        return this;
    }

    /**
     * An offset token for current page.
     * 
     * @return after
     **/
    @ApiModelProperty(example = "01631667477600000000000100100374", value = "An offset token for current page.")
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public DeviceGroupPage data(List<DeviceGroup> data) {
        this.data = data;
        return this;
    }

    public DeviceGroupPage addDataItem(DeviceGroup dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<DeviceGroup>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * 
     * @return data
     **/
    @ApiModelProperty(value = "")
    public List<DeviceGroup> getData() {
        return data;
    }

    public void setData(List<DeviceGroup> data) {
        this.data = data;
    }

    public DeviceGroupPage hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * More results are available.
     * 
     * @return hasMore
     **/
    @ApiModelProperty(example = "false", value = "More results are available.")
    public Boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public DeviceGroupPage limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * How many objects to retrieve in the page (2-1000). Limit values outside of this range are set to the closest
     * limit. minimum: 2 maximum: 1000
     * 
     * @return limit
     **/
    @ApiModelProperty(example = "50",
                      value = "How many objects to retrieve in the page (2-1000). Limit values outside of this range are set to the closest limit.")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public DeviceGroupPage object(String object) {
        this.object = object;
        return this;
    }

    /**
     * The type of this API object is &#39;list&#39;.
     * 
     * @return object
     **/
    @ApiModelProperty(example = "list", value = "The type of this API object is 'list'.")
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public DeviceGroupPage order(String order) {
        this.order = order;
        return this;
    }

    /**
     * Record order based on creation time.
     * 
     * @return order
     **/
    @ApiModelProperty(example = "DESC", value = "Record order based on creation time.")
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public DeviceGroupPage totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * 
     * @return totalCount
     **/
    @ApiModelProperty(example = "1", value = "")
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
        DeviceGroupPage deviceGroupPage = (DeviceGroupPage) o;
        return Objects.equals(this.after, deviceGroupPage.after) && Objects.equals(this.data, deviceGroupPage.data)
               && Objects.equals(this.hasMore, deviceGroupPage.hasMore)
               && Objects.equals(this.limit, deviceGroupPage.limit)
               && Objects.equals(this.object, deviceGroupPage.object)
               && Objects.equals(this.order, deviceGroupPage.order)
               && Objects.equals(this.totalCount, deviceGroupPage.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, data, hasMore, limit, object, order, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceGroupPage {\n");

        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
