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
 * LogsPage
 */

public class LogsPage implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("after")
    private String after = null;

    @SerializedName("data")
    private List<Log> data = null;

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

    public LogsPage after(String after) {
        this.after = after;
        return this;
    }

    /**
     * An offset token for current page.
     * 
     * @return after
     **/
    @ApiModelProperty(value = "An offset token for current page.")
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public LogsPage data(List<Log> data) {
        this.data = data;
        return this;
    }

    public LogsPage addDataItem(Log dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<Log>();
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
    public List<Log> getData() {
        return data;
    }

    public void setData(List<Log> data) {
        this.data = data;
    }

    public LogsPage hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * Indicates whether more results are available.
     * 
     * @return hasMore
     **/
    @ApiModelProperty(example = "false", value = "Indicates whether more results are available.")
    public Boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public LogsPage limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Limit applied on number of device log resource objects retrieved in the page (2-1000). minimum: 2 maximum: 1000
     * 
     * @return limit
     **/
    @ApiModelProperty(example = "100",
                      value = "Limit applied on number of device log resource objects retrieved in the page (2-1000).")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public LogsPage object(String object) {
        this.object = object;
        return this;
    }

    /**
     * Always &#x60;list&#x60;.
     * 
     * @return object
     **/
    @ApiModelProperty(example = "list", value = "Always `list`.")
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public LogsPage order(String order) {
        this.order = order;
        return this;
    }

    /**
     * Entry order based on creation time.
     * 
     * @return order
     **/
    @ApiModelProperty(example = "DESC", value = "Entry order based on creation time.")
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public LogsPage totalCount(Integer totalCount) {
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
        LogsPage logsPage = (LogsPage) o;
        return Objects.equals(this.after, logsPage.after) && Objects.equals(this.data, logsPage.data)
               && Objects.equals(this.hasMore, logsPage.hasMore) && Objects.equals(this.limit, logsPage.limit)
               && Objects.equals(this.object, logsPage.object) && Objects.equals(this.order, logsPage.order)
               && Objects.equals(this.totalCount, logsPage.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, data, hasMore, limit, object, order, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogsPage {\n");

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
