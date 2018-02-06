/*
 * Connect CA API
 * Connect CA API provides methods to create and get Developer certificate. Also Connect CA provides server-credentials for Bootstarp and LWM2M Server.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.connectorca.model;

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
 * ServerCredentialsResponseData
 */

public class ServerCredentialsResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("server_uri")
  private String serverUri = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("server_certificate")
  private String serverCertificate = null;

  @SerializedName("etag")
  private String etag = null;

  @SerializedName("id")
  private String id = null;

  public ServerCredentialsResponseData serverUri(String serverUri) {
    this.serverUri = serverUri;
    return this;
  }

   /**
   * The server URI to which the client needs to connect to.
   * @return serverUri
  **/
  @ApiModelProperty(value = "The server URI to which the client needs to connect to.")
  public String getServerUri() {
    return serverUri;
  }

  public void setServerUri(String serverUri) {
    this.serverUri = serverUri;
  }

  public ServerCredentialsResponseData createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC time RFC3339.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation UTC time RFC3339.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ServerCredentialsResponseData object(String object) {
    this.object = object;
    return this;
  }

   /**
   * The entity name, always &#x60;server-credentials&#x60;.
   * @return object
  **/
  @ApiModelProperty(value = "The entity name, always `server-credentials`.")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public ServerCredentialsResponseData serverCertificate(String serverCertificate) {
    this.serverCertificate = serverCertificate;
    return this;
  }

   /**
   * The PEM format X.509 server certificate that is used to validate the server certificate that is received during the TLS/DTLS handshake.
   * @return serverCertificate
  **/
  @ApiModelProperty(value = "The PEM format X.509 server certificate that is used to validate the server certificate that is received during the TLS/DTLS handshake.")
  public String getServerCertificate() {
    return serverCertificate;
  }

  public void setServerCertificate(String serverCertificate) {
    this.serverCertificate = serverCertificate;
  }

  public ServerCredentialsResponseData etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * API resource entity version.
   * @return etag
  **/
  @ApiModelProperty(value = "API resource entity version.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public ServerCredentialsResponseData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The mUUID that uniquely identifies the entity.
   * @return id
  **/
  @ApiModelProperty(value = "The mUUID that uniquely identifies the entity.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerCredentialsResponseData serverCredentialsResponseData = (ServerCredentialsResponseData) o;
    return Objects.equals(this.serverUri, serverCredentialsResponseData.serverUri) &&
        Objects.equals(this.createdAt, serverCredentialsResponseData.createdAt) &&
        Objects.equals(this.object, serverCredentialsResponseData.object) &&
        Objects.equals(this.serverCertificate, serverCredentialsResponseData.serverCertificate) &&
        Objects.equals(this.etag, serverCredentialsResponseData.etag) &&
        Objects.equals(this.id, serverCredentialsResponseData.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverUri, createdAt, object, serverCertificate, etag, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerCredentialsResponseData {\n");
    
    sb.append("    serverUri: ").append(toIndentedString(serverUri)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    serverCertificate: ").append(toIndentedString(serverCertificate)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

