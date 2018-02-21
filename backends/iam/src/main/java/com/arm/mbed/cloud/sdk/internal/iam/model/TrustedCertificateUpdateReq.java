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
import java.io.Serializable;

/**
 * This object represents a trusted certificate in update requests.
 */
@ApiModel(description = "This object represents a trusted certificate in update requests.")

public class TrustedCertificateUpdateReq implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Status of the certificate.
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

  @SerializedName("enrollment_mode")
  private Boolean enrollmentMode = null;

  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Service name where the certificate must be used.
   */
  @JsonAdapter(ServiceEnum.Adapter.class)
  public enum ServiceEnum {
    LWM2M("lwm2m"),
    
    BOOTSTRAP("bootstrap");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceEnum fromValue(String text) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("service")
  private ServiceEnum service = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("name")
  private String name = null;

  public TrustedCertificateUpdateReq status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the certificate.
   * @return status
  **/
  @ApiModelProperty(value = "Status of the certificate.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TrustedCertificateUpdateReq enrollmentMode(Boolean enrollmentMode) {
    this.enrollmentMode = enrollmentMode;
    return this;
  }

   /**
   * If true, signature parameter is not required. Default value is false.
   * @return enrollmentMode
  **/
  @ApiModelProperty(value = "If true, signature parameter is not required. Default value is false.")
  public Boolean isEnrollmentMode() {
    return enrollmentMode;
  }

  public void setEnrollmentMode(Boolean enrollmentMode) {
    this.enrollmentMode = enrollmentMode;
  }

  public TrustedCertificateUpdateReq certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * X509.v3 trusted certificate in PEM format.
   * @return certificate
  **/
  @ApiModelProperty(value = "X509.v3 trusted certificate in PEM format.")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public TrustedCertificateUpdateReq description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Human readable description of this certificate, not longer than 500 characters.
   * @return description
  **/
  @ApiModelProperty(value = "Human readable description of this certificate, not longer than 500 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TrustedCertificateUpdateReq service(ServiceEnum service) {
    this.service = service;
    return this;
  }

   /**
   * Service name where the certificate must be used.
   * @return service
  **/
  @ApiModelProperty(value = "Service name where the certificate must be used.")
  public ServiceEnum getService() {
    return service;
  }

  public void setService(ServiceEnum service) {
    this.service = service;
  }

  public TrustedCertificateUpdateReq signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Base64 encoded signature of the account ID signed by the certificate whose data to be updated. Signature must be hashed with SHA256.
   * @return signature
  **/
  @ApiModelProperty(value = "Base64 encoded signature of the account ID signed by the certificate whose data to be updated. Signature must be hashed with SHA256.")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public TrustedCertificateUpdateReq name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Certificate name, not longer than 100 characters.
   * @return name
  **/
  @ApiModelProperty(value = "Certificate name, not longer than 100 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustedCertificateUpdateReq trustedCertificateUpdateReq = (TrustedCertificateUpdateReq) o;
    return Objects.equals(this.status, trustedCertificateUpdateReq.status) &&
        Objects.equals(this.enrollmentMode, trustedCertificateUpdateReq.enrollmentMode) &&
        Objects.equals(this.certificate, trustedCertificateUpdateReq.certificate) &&
        Objects.equals(this.description, trustedCertificateUpdateReq.description) &&
        Objects.equals(this.service, trustedCertificateUpdateReq.service) &&
        Objects.equals(this.signature, trustedCertificateUpdateReq.signature) &&
        Objects.equals(this.name, trustedCertificateUpdateReq.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, enrollmentMode, certificate, description, service, signature, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustedCertificateUpdateReq {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    enrollmentMode: ").append(toIndentedString(enrollmentMode)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

