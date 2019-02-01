// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.adapters;

import com.arm.mbed.cloud.sdk.accounts.model.ApiKey;
import com.arm.mbed.cloud.sdk.accounts.model.ApiKeyStatus;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.ApiKeyInfoReq;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.ApiKeyInfoResp;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.ApiKeyInfoRespList;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.ApiKeyUpdateReq;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

/**
 * Adapter for api keys. */
@Preamble(
    description = "Adapter for api keys."
)
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class ApiKeyAdapter {
  /**
   * Constructor.
   */
  private ApiKeyAdapter() {
    super();
    // Nothing to do;
  }

  /**
   * Maps an api key info resp into an api key.
   * @param toBeMapped an api key info resp.
   * @return mapped an api key
   */
  @Internal
  public static ApiKey map(ApiKeyInfoResp toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    final ApiKey apiKey = new ApiKey(toBeMapped.getAccountId(),TranslationUtils.toDate(toBeMapped.getCreatedAt()),TranslationUtils.toLong(toBeMapped.getCreationTime()),toBeMapped.getKey(),TranslationUtils.toLong(toBeMapped.getLastLoginTime()),TranslationUtils.toDate(toBeMapped.getUpdatedAt()));
    apiKey.setId(toBeMapped.getId());
    apiKey.setName(toBeMapped.getName());
    apiKey.setOwner(toBeMapped.getOwner());
    apiKey.setStatus(translateToApiKeyStatus(toBeMapped.getStatus()));
    return apiKey;
  }

  /**
   * Gets a mapper.
   * @return a mapper
   */
  @Internal
  public static GenericAdapter.Mapper<ApiKeyInfoResp, ApiKey> getMapper() {
    return new GenericAdapter.Mapper<ApiKeyInfoResp, ApiKey>() {
      /**
       * Maps.
       * @param toBeMapped model to be mapped.
       * @return a mapped object
       */
      @Override
      public ApiKey map(ApiKeyInfoResp toBeMapped) {
        return ApiKeyAdapter.map(toBeMapped);
      }
    };
  }

  /**
   * Maps an api key into an api key info req.
   * @param toBeMapped an api key.
   * @return mapped an api key info req
   */
  @Internal
  public static ApiKeyInfoReq reverseMapAddRequest(ApiKey toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    final ApiKeyInfoReq apiKeyInfoReq = new ApiKeyInfoReq();
    //No field equivalent to groups in ApiKeyInfoReq was found in ApiKey
    apiKeyInfoReq.setName(toBeMapped.getName());
    apiKeyInfoReq.setOwner(toBeMapped.getOwner());
    apiKeyInfoReq.setStatus(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelApikeyinforeqStatusenum(toBeMapped.getStatus()));
    return apiKeyInfoReq;
  }

  /**
   * Maps an api key info resp list into an api key.
   * @param toBeMapped an api key info resp list.
   * @return mapped list response
   */
  @Internal
  public static ListResponse<ApiKey> mapList(ApiKeyInfoRespList toBeMapped) {
    final ApiKeyInfoRespList finalList = toBeMapped;
    final GenericAdapter.RespList<ApiKeyInfoResp> respList = new GenericAdapter.RespList<ApiKeyInfoResp>() {
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
      public List<ApiKeyInfoResp> getData() {
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
    return GenericAdapter.mapList(respList,ApiKeyAdapter.getMapper());
  }

  /**
   * Gets a mapper.
   * @return a mapper
   */
  @Internal
  public static GenericAdapter.Mapper<ApiKeyInfoRespList, ListResponse<ApiKey>> getListMapper() {
    return new GenericAdapter.Mapper<ApiKeyInfoRespList, ListResponse<ApiKey>>() {
      /**
       * Maps.
       * @param toBeMapped model to be mapped.
       * @return a mapped object
       */
      @Override
      public ListResponse<ApiKey> map(ApiKeyInfoRespList toBeMapped) {
        return ApiKeyAdapter.mapList(toBeMapped);
      }
    };
  }

  /**
   * Maps an api key into an api key update req.
   * @param toBeMapped an api key.
   * @return mapped an api key update req
   */
  @Internal
  public static ApiKeyUpdateReq reverseMapUpdateRequest(ApiKey toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    final ApiKeyUpdateReq apiKeyUpdateReq = new ApiKeyUpdateReq();
    //No field equivalent to groups in ApiKeyUpdateReq was found in ApiKey
    apiKeyUpdateReq.setName(toBeMapped.getName());
    apiKeyUpdateReq.setOwner(toBeMapped.getOwner());
    apiKeyUpdateReq.setStatus(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelApikeyupdatereqStatusenum(toBeMapped.getStatus()));
    return apiKeyUpdateReq;
  }

  /**
   * Maps the enum value.
   * @param toBeMapped a status enum.
   * @return mapped enum value
   */
  @Internal
  protected static ApiKeyStatus translateToApiKeyStatus(ApiKeyInfoResp.StatusEnum toBeMapped) {
    if(toBeMapped == null) {
      return ApiKeyStatus.getUnknownEnum();
    }
    switch(toBeMapped) {
      case ACTIVE:
      return ApiKeyStatus.ACTIVE;
      case INACTIVE:
      return ApiKeyStatus.INACTIVE;
      default:
      return ApiKeyStatus.getUnknownEnum();
    }
  }

  /**
   * Maps the enum value.
   * @param toBeMapped an api key status.
   * @return mapped enum value
   */
  @Internal
  protected static ApiKeyInfoReq.StatusEnum translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelApikeyinforeqStatusenum(
      ApiKeyStatus toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    switch(toBeMapped) {
      case ACTIVE:
      return ApiKeyInfoReq.StatusEnum.ACTIVE;
      case INACTIVE:
      return ApiKeyInfoReq.StatusEnum.INACTIVE;
      default:
      return null;
    }
  }

  /**
   * Maps the enum value.
   * @param toBeMapped an api key status.
   * @return mapped enum value
   */
  @Internal
  protected static ApiKeyUpdateReq.StatusEnum translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelApikeyupdatereqStatusenum(
      ApiKeyStatus toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    switch(toBeMapped) {
      case ACTIVE:
      return ApiKeyUpdateReq.StatusEnum.ACTIVE;
      case INACTIVE:
      return ApiKeyUpdateReq.StatusEnum.INACTIVE;
      default:
      return null;
    }
  }
}
