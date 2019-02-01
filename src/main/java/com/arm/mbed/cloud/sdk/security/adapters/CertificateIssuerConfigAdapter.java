// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.adapters;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateIssuerConfigListResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateIssuerConfigRequest;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateIssuerConfigResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CreateCertificateIssuerConfig;
import com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

/**
 * Adapter for certificate issuer configs. */
@Preamble(
    description = "Adapter for certificate issuer configs."
)
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class CertificateIssuerConfigAdapter {
  /**
   * Constructor.
   */
  private CertificateIssuerConfigAdapter() {
    super();
    // Nothing to do;
  }

  /**
   * Maps a certificate issuer config response into a certificate issuer config.
   * @param toBeMapped a certificate issuer config response.
   * @return mapped a certificate issuer config
   */
  @Internal
  public static CertificateIssuerConfig map(CertificateIssuerConfigResponse toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    final CertificateIssuerConfig certificateIssuerConfig = new CertificateIssuerConfig(TranslationUtils.toDate(toBeMapped.getCreatedAt()),TranslationUtils.toDate(toBeMapped.getUpdatedAt()));
    certificateIssuerConfig.setCertificateIssuerId(toBeMapped.getCertificateIssuerId());
    certificateIssuerConfig.setCertificateReference(toBeMapped.getReference());
    certificateIssuerConfig.setId(toBeMapped.getId());
    return certificateIssuerConfig;
  }

  /**
   * Gets a mapper.
   * @return a mapper
   */
  @Internal
  public static GenericAdapter.Mapper<CertificateIssuerConfigResponse, CertificateIssuerConfig> getMapper(
      ) {
    return new GenericAdapter.Mapper<CertificateIssuerConfigResponse, CertificateIssuerConfig>() {
      /**
       * Maps.
       * @param toBeMapped model to be mapped.
       * @return a mapped object
       */
      @Override
      public CertificateIssuerConfig map(CertificateIssuerConfigResponse toBeMapped) {
        return CertificateIssuerConfigAdapter.map(toBeMapped);
      }
    };
  }

  /**
   * Maps a certificate issuer config into a create certificate issuer config.
   * @param toBeMapped a certificate issuer config.
   * @return mapped a create certificate issuer config
   */
  @Internal
  public static CreateCertificateIssuerConfig reverseMapAddRequest(
      CertificateIssuerConfig toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    final CreateCertificateIssuerConfig createCertificateIssuerConfig = new CreateCertificateIssuerConfig();
    createCertificateIssuerConfig.setCertificateIssuerId(toBeMapped.getCertificateIssuerId());
    createCertificateIssuerConfig.setReference(toBeMapped.getCertificateReference());
    return createCertificateIssuerConfig;
  }

  /**
   * Maps a certificate issuer config list response into a certificate issuer config.
   * @param toBeMapped a certificate issuer config list response.
   * @return mapped list response
   */
  @Internal
  public static ListResponse<CertificateIssuerConfig> mapList(
      CertificateIssuerConfigListResponse toBeMapped) {
    final CertificateIssuerConfigListResponse finalList = toBeMapped;
    final GenericAdapter.RespList<CertificateIssuerConfigResponse> respList = new GenericAdapter.RespList<CertificateIssuerConfigResponse>() {
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
      public List<CertificateIssuerConfigResponse> getData() {
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
        return (finalList == null) ? null : finalList.getOrder();
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
    return GenericAdapter.mapList(respList,CertificateIssuerConfigAdapter.getMapper());
  }

  /**
   * Gets a mapper.
   * @return a mapper
   */
  @Internal
  public static GenericAdapter.Mapper<CertificateIssuerConfigListResponse, ListResponse<CertificateIssuerConfig>> getListMapper(
      ) {
    return new GenericAdapter.Mapper<CertificateIssuerConfigListResponse, ListResponse<CertificateIssuerConfig>>() {
      /**
       * Maps.
       * @param toBeMapped model to be mapped.
       * @return a mapped object
       */
      @Override
      public ListResponse<CertificateIssuerConfig> map(
          CertificateIssuerConfigListResponse toBeMapped) {
        return CertificateIssuerConfigAdapter.mapList(toBeMapped);
      }
    };
  }

  /**
   * Maps a certificate issuer config into a certificate issuer config request.
   * @param toBeMapped a certificate issuer config.
   * @return mapped a certificate issuer config request
   */
  @Internal
  public static CertificateIssuerConfigRequest reverseMapUpdateRequest(
      CertificateIssuerConfig toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    final CertificateIssuerConfigRequest certificateIssuerConfigRequest = new CertificateIssuerConfigRequest();
    certificateIssuerConfigRequest.setCertificateIssuerId(toBeMapped.getCertificateIssuerId());
    return certificateIssuerConfigRequest;
  }
}
