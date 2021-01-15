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
import java.io.Serializable;

/**
 * CertificateIssuerVerifyResponse
 */

public class CertificateIssuerVerifyResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("message")
    private String message = null;

    @SerializedName("successful")
    private Boolean successful = null;

    public CertificateIssuerVerifyResponse message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Provides details in case of failure.
     * 
     * @return message
     **/
    @ApiModelProperty(example = "Message describing the verification failure",
                      value = "Provides details in case of failure.")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CertificateIssuerVerifyResponse successful(Boolean successful) {
        this.successful = successful;
        return this;
    }

    /**
     * Indicates whether the certificate issuer was verified successfully.
     * 
     * @return successful
     **/
    @ApiModelProperty(example = "false", value = "Indicates whether the certificate issuer was verified successfully.")
    public Boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificateIssuerVerifyResponse certificateIssuerVerifyResponse = (CertificateIssuerVerifyResponse) o;
        return Objects.equals(this.message, certificateIssuerVerifyResponse.message)
               && Objects.equals(this.successful, certificateIssuerVerifyResponse.successful);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, successful);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateIssuerVerifyResponse {\n");

        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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
