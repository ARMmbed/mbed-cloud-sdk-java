// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.adapters;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollmentListResponse;
import com.arm.mbed.cloud.sdk.security.model.CertificateEnrollment;
import com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentEnrollResult;
import com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentEnrollStatus;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

/**
 * Adapter for certificate enrollments. */
@Preamble(
    description = "Adapter for certificate enrollments."
)
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class CertificateEnrollmentAdapter {
  /**
   * Constructor.
   */
  private CertificateEnrollmentAdapter() {
    super();
    // Nothing to do;
  }

  /**
   * Maps a certificate enrollment into a certificate enrollment.
   * @param toBeMapped a certificate enrollment.
   * @return mapped a certificate enrollment
   */
  @Internal
  public static CertificateEnrollment map(
      com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    final CertificateEnrollment certificateEnrollment = new CertificateEnrollment(toBeMapped.getCertificateName(),TranslationUtils.toDate(toBeMapped.getCreatedAt()),toBeMapped.getDeviceId(),translateToCertificateEnrollmentEnrollResult(toBeMapped.getEnrollResult()),translateToCertificateEnrollmentEnrollStatus(toBeMapped.getEnrollStatus()),TranslationUtils.toDate(toBeMapped.getUpdatedAt()));
    certificateEnrollment.setId(toBeMapped.getId());
    return certificateEnrollment;
  }

  /**
   * Gets a mapper.
   * @return a mapper
   */
  @Internal
  public static GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment, CertificateEnrollment> getMapper(
      ) {
    return new GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment, CertificateEnrollment>() {
      /**
       * Maps.
       * @param toBeMapped model to be mapped.
       * @return a mapped object
       */
      @Override
      public CertificateEnrollment map(
          com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment toBeMapped) {
        return CertificateEnrollmentAdapter.map(toBeMapped);
      }
    };
  }

  /**
   * Maps a certificate enrollment list response into a certificate enrollment.
   * @param toBeMapped a certificate enrollment list response.
   * @return mapped list response
   */
  @Internal
  public static ListResponse<CertificateEnrollment> mapList(
      CertificateEnrollmentListResponse toBeMapped) {
    final CertificateEnrollmentListResponse finalList = toBeMapped;
    final GenericAdapter.RespList<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment> respList = new GenericAdapter.RespList<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment>() {
      /**
       * Executes getAfter.
       * @return something
       */
      @Override
      public String getAfter() {
        return (finalList == null) ? null : finalList.getAfter();
      }

      /**
       * Executes getContinuationMarker.
       * @return something
       */
      @Override
      public String getContinuationMarker() {
        return null;
      }

      /**
       * Executes getData.
       * @return something
       */
      @Override
      public List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment> getData(
          ) {
        return (finalList == null) ? null : finalList.getData();
      }

      /**
       * Executes getHasMore.
       * @return something
       */
      @Override
      public Boolean getHasMore() {
        return (finalList == null) ? null : finalList.isHasMore();
      }

      /**
       * Executes getLimit.
       * @return something
       */
      @Override
      public Integer getLimit() {
        return (finalList == null) ? null : finalList.getLimit();
      }

      /**
       * Executes getOrder.
       * @return something
       */
      @Override
      public String getOrder() {
        return (finalList == null) ? null : finalList.getOrder().toString();
      }

      /**
       * Executes getTotalCount.
       * @return something
       */
      @Override
      public Integer getTotalCount() {
        return (finalList == null) ? null : finalList.getTotalCount();
      }
    };
    return GenericAdapter.mapList(respList,CertificateEnrollmentAdapter.getMapper());
  }

  /**
   * Gets a mapper.
   * @return a mapper
   */
  @Internal
  public static GenericAdapter.Mapper<CertificateEnrollmentListResponse, ListResponse<CertificateEnrollment>> getListMapper(
      ) {
    return new GenericAdapter.Mapper<CertificateEnrollmentListResponse, ListResponse<CertificateEnrollment>>() {
      /**
       * Maps.
       * @param toBeMapped model to be mapped.
       * @return a mapped object
       */
      @Override
      public ListResponse<CertificateEnrollment> map(CertificateEnrollmentListResponse toBeMapped) {
        return CertificateEnrollmentAdapter.mapList(toBeMapped);
      }
    };
  }

  /**
   * Maps the enum value.
   * @param toBeMapped an enroll result enum.
   * @return mapped enum value
   */
  @Internal
  protected static CertificateEnrollmentEnrollResult translateToCertificateEnrollmentEnrollResult(
      com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment.EnrollResultEnum toBeMapped) {
    if(toBeMapped == null) {
      return CertificateEnrollmentEnrollResult.getUnknownEnum();
    }
    switch(toBeMapped) {
      case SUCCESS:
      return CertificateEnrollmentEnrollResult.SUCCESS;
      case NOT_FOUND:
      return CertificateEnrollmentEnrollResult.NOT_FOUND;
      case FORBIDDEN:
      return CertificateEnrollmentEnrollResult.FORBIDDEN;
      case FAILURE:
      return CertificateEnrollmentEnrollResult.FAILURE;
      default:
      return CertificateEnrollmentEnrollResult.getUnknownEnum();
    }
  }

  /**
   * Maps the enum value.
   * @param toBeMapped an enroll status enum.
   * @return mapped enum value
   */
  @Internal
  protected static CertificateEnrollmentEnrollStatus translateToCertificateEnrollmentEnrollStatus(
      com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment.EnrollStatusEnum toBeMapped) {
    if(toBeMapped == null) {
      return CertificateEnrollmentEnrollStatus.getUnknownEnum();
    }
    switch(toBeMapped) {
      case NEW:
      return CertificateEnrollmentEnrollStatus.NEW;
      case COMPLETED:
      return CertificateEnrollmentEnrollStatus.COMPLETED;
      default:
      return CertificateEnrollmentEnrollStatus.getUnknownEnum();
    }
  }
}
