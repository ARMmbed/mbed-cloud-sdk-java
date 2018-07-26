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
import com.arm.mbed.cloud.sdk.internal.updateservice.model.UploadJob;
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
 * UploadJobPage
 */

public class UploadJobPage implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("after")
  private String after = null;

  @SerializedName("data")
  private List<UploadJob> data = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("object")
  private String object = null;

  /**
   * The order of the records to return. Acceptable values: ASC, DESC. Default: ASC
   */
  @JsonAdapter(OrderEnum.Adapter.class)
  public enum OrderEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderEnum fromValue(String text) {
      for (OrderEnum b : OrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("order")
  private OrderEnum order = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  public UploadJobPage after(String after) {
    this.after = after;
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @ApiModelProperty(value = "")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public UploadJobPage data(List<UploadJob> data) {
    this.data = data;
    return this;
  }

  public UploadJobPage addDataItem(UploadJob dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<UploadJob>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<UploadJob> getData() {
    return data;
  }

  public void setData(List<UploadJob> data) {
    this.data = data;
  }

  public UploadJobPage hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public UploadJobPage limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public UploadJobPage object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(example = "list", value = "")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public UploadJobPage order(OrderEnum order) {
    this.order = order;
    return this;
  }

   /**
   * The order of the records to return. Acceptable values: ASC, DESC. Default: ASC
   * @return order
  **/
  @ApiModelProperty(example = "ASC", value = "The order of the records to return. Acceptable values: ASC, DESC. Default: ASC")
  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  public UploadJobPage totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(value = "")
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
    UploadJobPage uploadJobPage = (UploadJobPage) o;
    return Objects.equals(this.after, uploadJobPage.after) &&
        Objects.equals(this.data, uploadJobPage.data) &&
        Objects.equals(this.hasMore, uploadJobPage.hasMore) &&
        Objects.equals(this.limit, uploadJobPage.limit) &&
        Objects.equals(this.object, uploadJobPage.object) &&
        Objects.equals(this.order, uploadJobPage.order) &&
        Objects.equals(this.totalCount, uploadJobPage.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, data, hasMore, limit, object, order, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadJobPage {\n");
    
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

