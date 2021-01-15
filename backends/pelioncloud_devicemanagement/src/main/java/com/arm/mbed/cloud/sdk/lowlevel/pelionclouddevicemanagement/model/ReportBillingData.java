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
 * ReportBillingData
 */

public class ReportBillingData implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("active_devices")
    private Integer activeDevices = null;

    @SerializedName("device_to_pelion_messages")
    private DeviceToPelionMessagesCounter deviceToPelionMessages = null;

    @SerializedName("firmware_updates")
    private Integer firmwareUpdates = null;

    @SerializedName("generated")
    private DateTime generated = null;

    @SerializedName("pelion_to_device_messages")
    private PelionToDeviceMessagesCounter pelionToDeviceMessages = null;

    @SerializedName("pelion_to_webapp_notifications")
    private Integer pelionToWebappNotifications = null;

    @SerializedName("period_end")
    private DateTime periodEnd = null;

    @SerializedName("period_start")
    private DateTime periodStart = null;

    @SerializedName("rest_api_requests_with_api_key_token")
    private Integer restApiRequestsWithApiKeyToken = null;

    @SerializedName("rest_api_requests_with_user_token")
    private Integer restApiRequestsWithUserToken = null;

    @SerializedName("sda_tokens")
    private Integer sdaTokens = null;

    public ReportBillingData activeDevices(Integer activeDevices) {
        this.activeDevices = activeDevices;
        return this;
    }

    /**
     * Get activeDevices
     * 
     * @return activeDevices
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getActiveDevices() {
        return activeDevices;
    }

    public void setActiveDevices(Integer activeDevices) {
        this.activeDevices = activeDevices;
    }

    public ReportBillingData deviceToPelionMessages(DeviceToPelionMessagesCounter deviceToPelionMessages) {
        this.deviceToPelionMessages = deviceToPelionMessages;
        return this;
    }

    /**
     * Get deviceToPelionMessages
     * 
     * @return deviceToPelionMessages
     **/
    @ApiModelProperty(value = "")
    public DeviceToPelionMessagesCounter getDeviceToPelionMessages() {
        return deviceToPelionMessages;
    }

    public void setDeviceToPelionMessages(DeviceToPelionMessagesCounter deviceToPelionMessages) {
        this.deviceToPelionMessages = deviceToPelionMessages;
    }

    public ReportBillingData firmwareUpdates(Integer firmwareUpdates) {
        this.firmwareUpdates = firmwareUpdates;
        return this;
    }

    /**
     * Get firmwareUpdates
     * 
     * @return firmwareUpdates
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getFirmwareUpdates() {
        return firmwareUpdates;
    }

    public void setFirmwareUpdates(Integer firmwareUpdates) {
        this.firmwareUpdates = firmwareUpdates;
    }

    public ReportBillingData generated(DateTime generated) {
        this.generated = generated;
        return this;
    }

    /**
     * Billing report generated time in RFC3339 date-time with millisecond accuracy and UTC time zone.
     * 
     * @return generated
     **/
    @ApiModelProperty(required = true,
                      value = "Billing report generated time in RFC3339 date-time with millisecond accuracy and UTC time zone.")
    public DateTime getGenerated() {
        return generated;
    }

    public void setGenerated(DateTime generated) {
        this.generated = generated;
    }

    public ReportBillingData pelionToDeviceMessages(PelionToDeviceMessagesCounter pelionToDeviceMessages) {
        this.pelionToDeviceMessages = pelionToDeviceMessages;
        return this;
    }

    /**
     * Get pelionToDeviceMessages
     * 
     * @return pelionToDeviceMessages
     **/
    @ApiModelProperty(value = "")
    public PelionToDeviceMessagesCounter getPelionToDeviceMessages() {
        return pelionToDeviceMessages;
    }

    public void setPelionToDeviceMessages(PelionToDeviceMessagesCounter pelionToDeviceMessages) {
        this.pelionToDeviceMessages = pelionToDeviceMessages;
    }

    public ReportBillingData pelionToWebappNotifications(Integer pelionToWebappNotifications) {
        this.pelionToWebappNotifications = pelionToWebappNotifications;
        return this;
    }

    /**
     * Get pelionToWebappNotifications
     * 
     * @return pelionToWebappNotifications
     **/
    @ApiModelProperty(value = "")
    public Integer getPelionToWebappNotifications() {
        return pelionToWebappNotifications;
    }

    public void setPelionToWebappNotifications(Integer pelionToWebappNotifications) {
        this.pelionToWebappNotifications = pelionToWebappNotifications;
    }

    public ReportBillingData periodEnd(DateTime periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }

    /**
     * Billing report end time in RFC3339 date-time with millisecond accuracy and UTC time zone.
     * 
     * @return periodEnd
     **/
    @ApiModelProperty(required = true,
                      value = "Billing report end time in RFC3339 date-time with millisecond accuracy and UTC time zone.")
    public DateTime getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(DateTime periodEnd) {
        this.periodEnd = periodEnd;
    }

    public ReportBillingData periodStart(DateTime periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    /**
     * Billing report start time in RFC3339 date-time with millisecond accuracy and UTC time zone.
     * 
     * @return periodStart
     **/
    @ApiModelProperty(required = true,
                      value = "Billing report start time in RFC3339 date-time with millisecond accuracy and UTC time zone.")
    public DateTime getPeriodStart() {
        return periodStart;
    }

    public void setPeriodStart(DateTime periodStart) {
        this.periodStart = periodStart;
    }

    public ReportBillingData restApiRequestsWithApiKeyToken(Integer restApiRequestsWithApiKeyToken) {
        this.restApiRequestsWithApiKeyToken = restApiRequestsWithApiKeyToken;
        return this;
    }

    /**
     * Get restApiRequestsWithApiKeyToken
     * 
     * @return restApiRequestsWithApiKeyToken
     **/
    @ApiModelProperty(value = "")
    public Integer getRestApiRequestsWithApiKeyToken() {
        return restApiRequestsWithApiKeyToken;
    }

    public void setRestApiRequestsWithApiKeyToken(Integer restApiRequestsWithApiKeyToken) {
        this.restApiRequestsWithApiKeyToken = restApiRequestsWithApiKeyToken;
    }

    public ReportBillingData restApiRequestsWithUserToken(Integer restApiRequestsWithUserToken) {
        this.restApiRequestsWithUserToken = restApiRequestsWithUserToken;
        return this;
    }

    /**
     * Get restApiRequestsWithUserToken
     * 
     * @return restApiRequestsWithUserToken
     **/
    @ApiModelProperty(value = "")
    public Integer getRestApiRequestsWithUserToken() {
        return restApiRequestsWithUserToken;
    }

    public void setRestApiRequestsWithUserToken(Integer restApiRequestsWithUserToken) {
        this.restApiRequestsWithUserToken = restApiRequestsWithUserToken;
    }

    public ReportBillingData sdaTokens(Integer sdaTokens) {
        this.sdaTokens = sdaTokens;
        return this;
    }

    /**
     * Get sdaTokens
     * 
     * @return sdaTokens
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getSdaTokens() {
        return sdaTokens;
    }

    public void setSdaTokens(Integer sdaTokens) {
        this.sdaTokens = sdaTokens;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportBillingData reportBillingData = (ReportBillingData) o;
        return Objects.equals(this.activeDevices, reportBillingData.activeDevices)
               && Objects.equals(this.deviceToPelionMessages, reportBillingData.deviceToPelionMessages)
               && Objects.equals(this.firmwareUpdates, reportBillingData.firmwareUpdates)
               && Objects.equals(this.generated, reportBillingData.generated)
               && Objects.equals(this.pelionToDeviceMessages, reportBillingData.pelionToDeviceMessages)
               && Objects.equals(this.pelionToWebappNotifications, reportBillingData.pelionToWebappNotifications)
               && Objects.equals(this.periodEnd, reportBillingData.periodEnd)
               && Objects.equals(this.periodStart, reportBillingData.periodStart)
               && Objects.equals(this.restApiRequestsWithApiKeyToken, reportBillingData.restApiRequestsWithApiKeyToken)
               && Objects.equals(this.restApiRequestsWithUserToken, reportBillingData.restApiRequestsWithUserToken)
               && Objects.equals(this.sdaTokens, reportBillingData.sdaTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeDevices, deviceToPelionMessages, firmwareUpdates, generated, pelionToDeviceMessages,
                            pelionToWebappNotifications, periodEnd, periodStart, restApiRequestsWithApiKeyToken,
                            restApiRequestsWithUserToken, sdaTokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportBillingData {\n");

        sb.append("    activeDevices: ").append(toIndentedString(activeDevices)).append("\n");
        sb.append("    deviceToPelionMessages: ").append(toIndentedString(deviceToPelionMessages)).append("\n");
        sb.append("    firmwareUpdates: ").append(toIndentedString(firmwareUpdates)).append("\n");
        sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
        sb.append("    pelionToDeviceMessages: ").append(toIndentedString(pelionToDeviceMessages)).append("\n");
        sb.append("    pelionToWebappNotifications: ").append(toIndentedString(pelionToWebappNotifications))
          .append("\n");
        sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
        sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
        sb.append("    restApiRequestsWithApiKeyToken: ").append(toIndentedString(restApiRequestsWithApiKeyToken))
          .append("\n");
        sb.append("    restApiRequestsWithUserToken: ").append(toIndentedString(restApiRequestsWithUserToken))
          .append("\n");
        sb.append("    sdaTokens: ").append(toIndentedString(sdaTokens)).append("\n");
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
