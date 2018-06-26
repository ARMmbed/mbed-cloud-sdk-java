/*
 * Third party CA management API
 * API for managing third party CA for creating certificates on Mbed Cloud
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.externalca.model;

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
 * CertificateIssuerConfigResponse
 */

public class CertificateIssuerConfigResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("certificate_issuer_id")
  private String certificateIssuerId = null;

  /**
   * Gets or Sets object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    CONFIGURATION("certificate-issuer-configuration");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ObjectEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("object")
  private ObjectEnum object = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public CertificateIssuerConfigResponse certificateIssuerId(String certificateIssuerId) {
    this.certificateIssuerId = certificateIssuerId;
    return this;
  }

   /**
   * The ID of the certificate issuer. Null if Arm Mbed Cloud internal HSM is used. 
   * @return certificateIssuerId
  **/
  @ApiModelProperty(example = "ABCDEF0123456789ABCDEF0123456789", value = "The ID of the certificate issuer. Null if Arm Mbed Cloud internal HSM is used. ")
  public String getCertificateIssuerId() {
    return certificateIssuerId;
  }

  public void setCertificateIssuerId(String certificateIssuerId) {
    this.certificateIssuerId = certificateIssuerId;
  }

  public CertificateIssuerConfigResponse object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(value = "")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public CertificateIssuerConfigResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(example = "LwM2M", value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public CertificateIssuerConfigResponse updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Updated UTC time RFC3339.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2017-01-01T00:00:00Z", value = "Updated UTC time RFC3339.")
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
    CertificateIssuerConfigResponse certificateIssuerConfigResponse = (CertificateIssuerConfigResponse) o;
    return Objects.equals(this.certificateIssuerId, certificateIssuerConfigResponse.certificateIssuerId) &&
        Objects.equals(this.object, certificateIssuerConfigResponse.object) &&
        Objects.equals(this.reference, certificateIssuerConfigResponse.reference) &&
        Objects.equals(this.updatedAt, certificateIssuerConfigResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateIssuerId, object, reference, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateIssuerConfigResponse {\n");
    
    sb.append("    certificateIssuerId: ").append(toIndentedString(certificateIssuerId)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

