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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * CertificateIssuerInfo
 */

public class CertificateIssuerInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("etag")
    private String etag = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("issuer_attributes")
    private Map<String, String> issuerAttributes = null;

    /**
     * Certificate issuer type. - GLOBAL_SIGN: Certificates are issued by GlobalSign service. You must provide your own
     * GlobalSign account credentials. - CFSSL_AUTH: Certificates are issued by CFSSL authenticated signing service. You
     * must provide your own CFSSL host_url and credentials.
     */
    @JsonAdapter(IssuerTypeEnum.Adapter.class)
    public enum IssuerTypeEnum {
        GLOBAL_SIGN("GLOBAL_SIGN"),

        CFSSL_AUTH("CFSSL_AUTH");

        private String value;

        IssuerTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static IssuerTypeEnum fromValue(String text) {
            for (IssuerTypeEnum b : IssuerTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<IssuerTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final IssuerTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public IssuerTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return IssuerTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("issuer_type")
    private IssuerTypeEnum issuerType = null;

    @SerializedName("name")
    private String name = null;

    /**
     * Gets or Sets object
     */
    @JsonAdapter(ObjectEnum.Adapter.class)
    public enum ObjectEnum {
        ISSUER("certificate-issuer");

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

    public CertificateIssuerInfo createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Creation UTC time RFC3339.
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "2017-01-01T00:00:00Z", value = "Creation UTC time RFC3339.")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CertificateIssuerInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * General description for the certificate issuer.
     * 
     * @return description
     **/
    @ApiModelProperty(example = "GlobalSign sample issuer", value = "General description for the certificate issuer.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CertificateIssuerInfo etag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Entity instance signature.
     * 
     * @return etag
     **/
    @ApiModelProperty(example = "1", value = "Entity instance signature.")
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public CertificateIssuerInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Certificate issuer ID.
     * 
     * @return id
     **/
    @ApiModelProperty(example = "01234567890ABCDEF01234567890ABCDEF", value = "Certificate issuer ID.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CertificateIssuerInfo issuerAttributes(Map<String, String> issuerAttributes) {
        this.issuerAttributes = issuerAttributes;
        return this;
    }

    public CertificateIssuerInfo putIssuerAttributesItem(String key, String issuerAttributesItem) {
        if (this.issuerAttributes == null) {
            this.issuerAttributes = new HashMap<String, String>();
        }
        this.issuerAttributes.put(key, issuerAttributesItem);
        return this;
    }

    /**
     * General attributes for connecting the certificate issuer. When the issuer_type is GLOBAL_SIGN, the value is
     * empty. When the issuer_type is CFSSL_AUTH, see definition of CfsslAttributes.
     * 
     * @return issuerAttributes
     **/
    @ApiModelProperty(example = "{}",
                      value = "General attributes for connecting the certificate issuer. When the issuer_type is GLOBAL_SIGN, the value is empty. When the issuer_type is CFSSL_AUTH, see definition of CfsslAttributes.")
    public Map<String, String> getIssuerAttributes() {
        return issuerAttributes;
    }

    public void setIssuerAttributes(Map<String, String> issuerAttributes) {
        this.issuerAttributes = issuerAttributes;
    }

    public CertificateIssuerInfo issuerType(IssuerTypeEnum issuerType) {
        this.issuerType = issuerType;
        return this;
    }

    /**
     * Certificate issuer type. - GLOBAL_SIGN: Certificates are issued by GlobalSign service. You must provide your own
     * GlobalSign account credentials. - CFSSL_AUTH: Certificates are issued by CFSSL authenticated signing service. You
     * must provide your own CFSSL host_url and credentials.
     * 
     * @return issuerType
     **/
    @ApiModelProperty(example = "GLOBAL_SIGN", required = true,
                      value = "Certificate issuer type. - GLOBAL_SIGN:   Certificates are issued by GlobalSign service. You must provide your own GlobalSign account credentials. - CFSSL_AUTH:   Certificates are issued by CFSSL authenticated signing service.   You must provide your own CFSSL host_url and credentials.")
    public IssuerTypeEnum getIssuerType() {
        return issuerType;
    }

    public void setIssuerType(IssuerTypeEnum issuerType) {
        this.issuerType = issuerType;
    }

    public CertificateIssuerInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Certificate issuer name, unique per account.
     * 
     * @return name
     **/
    @ApiModelProperty(example = "GS Issuer", value = "Certificate issuer name, unique per account.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CertificateIssuerInfo object(ObjectEnum object) {
        this.object = object;
        return this;
    }

    /**
     * Get object
     * 
     * @return object
     **/
    @ApiModelProperty(value = "")
    public ObjectEnum getObject() {
        return object;
    }

    public void setObject(ObjectEnum object) {
        this.object = object;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificateIssuerInfo certificateIssuerInfo = (CertificateIssuerInfo) o;
        return Objects.equals(this.createdAt, certificateIssuerInfo.createdAt)
               && Objects.equals(this.description, certificateIssuerInfo.description)
               && Objects.equals(this.etag, certificateIssuerInfo.etag)
               && Objects.equals(this.id, certificateIssuerInfo.id)
               && Objects.equals(this.issuerAttributes, certificateIssuerInfo.issuerAttributes)
               && Objects.equals(this.issuerType, certificateIssuerInfo.issuerType)
               && Objects.equals(this.name, certificateIssuerInfo.name)
               && Objects.equals(this.object, certificateIssuerInfo.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, description, etag, id, issuerAttributes, issuerType, name, object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateIssuerInfo {\n");

        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issuerAttributes: ").append(toIndentedString(issuerAttributes)).append("\n");
        sb.append("    issuerType: ").append(toIndentedString(issuerType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
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
