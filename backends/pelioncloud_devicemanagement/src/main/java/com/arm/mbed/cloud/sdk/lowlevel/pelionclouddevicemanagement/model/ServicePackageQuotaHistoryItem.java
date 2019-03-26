/*
 * Mbed Cloud API
 * The full Mbed Cloud API
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Quota history item.
 */
@ApiModel(description = "Quota history item.")

public class ServicePackageQuotaHistoryItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("added")
    private DateTime added = null;

    @SerializedName("amount")
    private Long amount = null;

    @SerializedName("id")
    private String id = null;

    /**
     * Type of quota usage entry.
     */
    @JsonAdapter(ReasonEnum.Adapter.class)
    public enum ReasonEnum {
        RESERVATION("reservation"),

        RESERVATION_RELEASE("reservation_release"),

        RESERVATION_TERMINATION("reservation_termination"),

        PACKAGE_CREATION("package_creation"),

        PACKAGE_RENEWAL("package_renewal"),

        PACKAGE_TERMINATION("package_termination");

        private String value;

        ReasonEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ReasonEnum fromValue(String text) {
            for (ReasonEnum b : ReasonEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ReasonEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ReasonEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ReasonEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("reason")
    private ReasonEnum reason = null;

    @SerializedName("reservation")
    private ServicePackageQuotaHistoryReservation reservation = null;

    @SerializedName("service_package")
    private ServicePackageQuotaHistoryServicePackage servicePackage = null;

    public ServicePackageQuotaHistoryItem added(DateTime added) {
        this.added = added;
        return this;
    }

    /**
     * Added time of quota history entry in RFC3339 date-time with millisecond accuracy and UTC time zone.
     * 
     * @return added
     **/
    @ApiModelProperty(required = true,
                      value = "Added time of quota history entry in RFC3339 date-time with millisecond accuracy and UTC time zone.")
    public DateTime getAdded() {
        return added;
    }

    public void setAdded(DateTime added) {
        this.added = added;
    }

    public ServicePackageQuotaHistoryItem amount(Long amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Negative or positive quota usage.
     * 
     * @return amount
     **/
    @ApiModelProperty(required = true, value = "Negative or positive quota usage.")
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public ServicePackageQuotaHistoryItem id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Service package quota history ID.
     * 
     * @return id
     **/
    @ApiModelProperty(required = true, value = "Service package quota history ID.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServicePackageQuotaHistoryItem reason(ReasonEnum reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Type of quota usage entry.
     * 
     * @return reason
     **/
    @ApiModelProperty(required = true, value = "Type of quota usage entry.")
    public ReasonEnum getReason() {
        return reason;
    }

    public void setReason(ReasonEnum reason) {
        this.reason = reason;
    }

    public ServicePackageQuotaHistoryItem reservation(ServicePackageQuotaHistoryReservation reservation) {
        this.reservation = reservation;
        return this;
    }

    /**
     * Reservation details if reason is &#x60;reservation&#x60;, &#x60;reservation_releasem&#x60; or
     * &#x60;reservation_termination&#x60;.
     * 
     * @return reservation
     **/
    @ApiModelProperty(value = "Reservation details if reason is `reservation`, `reservation_releasem` or `reservation_termination`.")
    public ServicePackageQuotaHistoryReservation getReservation() {
        return reservation;
    }

    public void setReservation(ServicePackageQuotaHistoryReservation reservation) {
        this.reservation = reservation;
    }

    public ServicePackageQuotaHistoryItem servicePackage(ServicePackageQuotaHistoryServicePackage servicePackage) {
        this.servicePackage = servicePackage;
        return this;
    }

    /**
     * Service package details if reason is &#x60;package_creation&#x60;, &#x60;package_renewal&#x60; or
     * &#x60;package_termination&#x60;.
     * 
     * @return servicePackage
     **/
    @ApiModelProperty(value = "Service package details if reason is `package_creation`, `package_renewal` or `package_termination`.")
    public ServicePackageQuotaHistoryServicePackage getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(ServicePackageQuotaHistoryServicePackage servicePackage) {
        this.servicePackage = servicePackage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServicePackageQuotaHistoryItem servicePackageQuotaHistoryItem = (ServicePackageQuotaHistoryItem) o;
        return Objects.equals(this.added, servicePackageQuotaHistoryItem.added)
               && Objects.equals(this.amount, servicePackageQuotaHistoryItem.amount)
               && Objects.equals(this.id, servicePackageQuotaHistoryItem.id)
               && Objects.equals(this.reason, servicePackageQuotaHistoryItem.reason)
               && Objects.equals(this.reservation, servicePackageQuotaHistoryItem.reservation)
               && Objects.equals(this.servicePackage, servicePackageQuotaHistoryItem.servicePackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(added, amount, id, reason, reservation, servicePackage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServicePackageQuotaHistoryItem {\n");

        sb.append("    added: ").append(toIndentedString(added)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
        sb.append("    servicePackage: ").append(toIndentedString(servicePackage)).append("\n");
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
