// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.adapters;

import com.arm.mbed.cloud.sdk.accounts.model.IdentityProvider;
import com.arm.mbed.cloud.sdk.accounts.model.IdentityProviderStatus;
import com.arm.mbed.cloud.sdk.accounts.model.IdentityProviderType;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateGenerationReq;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.IdentityProviderCreationReq;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.IdentityProviderInfo;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.IdentityProviderList;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.IdentityProviderUpdateReq;
import java.util.List;

/**
 * Adapter for identity providers.
 */
@Preamble(description = "Adapter for identity providers.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class IdentityProviderAdapter {
    /**
     * Constructor.
     */
    private IdentityProviderAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps an identity provider into an identity provider creation req.
     * 
     * @param toBeMapped
     *            an identity provider.
     * @return mapped an identity provider creation req
     */
    @Internal
    public static IdentityProviderCreationReq reverseMapAddRequest(IdentityProvider toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final IdentityProviderCreationReq identityProviderCreationReq = new IdentityProviderCreationReq();
        identityProviderCreationReq.setDescription(toBeMapped.getDescription());
        identityProviderCreationReq.setName(toBeMapped.getName());
        identityProviderCreationReq.setOidcAttributes(OidcRequestAdapter.reverseMapAddRequest(toBeMapped.getOidcAttributes()));
        // No adapter method was found in order to perform a translation from Object to SAML2Req for field:
        // saml2Attributes
        identityProviderCreationReq.setStatus(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelIdentityprovidercreationreqStatusenum(toBeMapped.getStatus()));
        identityProviderCreationReq.setType(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelIdentityprovidercreationreqTypeenum(toBeMapped.getIdentityProviderType()));
        return identityProviderCreationReq;
    }

    /**
     * Maps an identity provider info into an identity provider.
     * 
     * @param toBeMapped
     *            an identity provider info.
     * @return mapped an identity provider
     */
    @Internal
    public static IdentityProvider map(IdentityProviderInfo toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final IdentityProvider identityProvider = new IdentityProvider(toBeMapped.getAccountId(),
                                                                       TranslationUtils.toDate(toBeMapped.getCreatedAt()),
                                                                       TranslationUtils.toBool(toBeMapped.isIsDefault()),
                                                                       TranslationUtils.toDate(toBeMapped.getUpdatedAt()));
        identityProvider.setDescription(toBeMapped.getDescription());
        identityProvider.setId(toBeMapped.getId());
        identityProvider.setIdentityProviderType(translateToIdentityProviderType(toBeMapped.getType()));
        identityProvider.setName(toBeMapped.getName());
        identityProvider.setOidcAttributes(OidcRequestAdapter.map(toBeMapped.getOidcAttributes()));
        identityProvider.setSaml2Attributes(toBeMapped.getSaml2Attributes());
        identityProvider.setStatus(translateToIdentityProviderStatus(toBeMapped.getStatus()));
        return identityProvider;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<IdentityProviderInfo, IdentityProvider> getMapper() {
        return new GenericAdapter.Mapper<IdentityProviderInfo, IdentityProvider>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public IdentityProvider map(IdentityProviderInfo toBeMapped) {
                return IdentityProviderAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps an identity provider into a certificate generation req.
     * 
     * @param toBeMapped
     *            an identity provider.
     * @return mapped a certificate generation req
     */
    @Internal
    public static CertificateGenerationReq
           mapToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelCertificateGenerationReq(IdentityProvider toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final CertificateGenerationReq certificateGenerationReq = new CertificateGenerationReq();
        // No field equivalent to algorithm in CertificateGenerationReq was found in IdentityProvider
        // No field equivalent to validity in CertificateGenerationReq was found in IdentityProvider
        return certificateGenerationReq;
    }

    /**
     * Maps an identity provider list into an identity provider.
     * 
     * @param toBeMapped
     *            an identity provider list.
     * @return mapped list response
     */
    @Internal
    public static ListResponse<IdentityProvider> mapList(IdentityProviderList toBeMapped) {
        final IdentityProviderList finalList = toBeMapped;
        final GenericAdapter.RespList<IdentityProviderInfo> respList = new GenericAdapter.RespList<IdentityProviderInfo>() {
            /**
             * Executes getAfter.
             * 
             * @return something
             */
            @Override
            public String getAfter() {
                return (finalList == null) ? null : finalList.getAfter();
            }

            /**
             * Executes getContinuationMarker.
             * 
             * @return something
             */
            @Override
            public String getContinuationMarker() {
                return null;
            }

            /**
             * Executes getData.
             * 
             * @return something
             */
            @Override
            public List<IdentityProviderInfo> getData() {
                return (finalList == null) ? null : finalList.getData();
            }

            /**
             * Executes getHasMore.
             * 
             * @return something
             */
            @Override
            public Boolean getHasMore() {
                return (finalList == null) ? null : finalList.isHasMore();
            }

            /**
             * Executes getLimit.
             * 
             * @return something
             */
            @Override
            public Integer getLimit() {
                return (finalList == null) ? null : finalList.getLimit();
            }

            /**
             * Executes getOrder.
             * 
             * @return something
             */
            @Override
            public String getOrder() {
                return (finalList == null) ? null : finalList.getOrder().toString();
            }

            /**
             * Executes getTotalCount.
             * 
             * @return something
             */
            @Override
            public Integer getTotalCount() {
                return (finalList == null) ? null : finalList.getTotalCount();
            }
        };
        return GenericAdapter.mapList(respList, IdentityProviderAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<IdentityProviderList, ListResponse<IdentityProvider>> getListMapper() {
        return new GenericAdapter.Mapper<IdentityProviderList, ListResponse<IdentityProvider>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public ListResponse<IdentityProvider> map(IdentityProviderList toBeMapped) {
                return IdentityProviderAdapter.mapList(toBeMapped);
            }
        };
    }

    /**
     * Maps an identity provider into an identity provider update req.
     * 
     * @param toBeMapped
     *            an identity provider.
     * @return mapped an identity provider update req
     */
    @Internal
    public static IdentityProviderUpdateReq reverseMapUpdateRequest(IdentityProvider toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final IdentityProviderUpdateReq identityProviderUpdateReq = new IdentityProviderUpdateReq();
        identityProviderUpdateReq.setDescription(toBeMapped.getDescription());
        identityProviderUpdateReq.setName(toBeMapped.getName());
        identityProviderUpdateReq.setOidcAttributes(OidcRequestAdapter.reverseMapUpdateRequest(toBeMapped.getOidcAttributes()));
        // No adapter method was found in order to perform a translation from Object to SAML2Req for field:
        // saml2Attributes
        identityProviderUpdateReq.setStatus(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelIdentityproviderupdatereqStatusenum(toBeMapped.getStatus()));
        identityProviderUpdateReq.setType(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelIdentityproviderupdatereqTypeenum(toBeMapped.getIdentityProviderType()));
        return identityProviderUpdateReq;
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            an identity provider status.
     * @return mapped enum value
     */
    @Internal
    protected static IdentityProviderCreationReq.StatusEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelIdentityprovidercreationreqStatusenum(IdentityProviderStatus toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case ACTIVE:
                return IdentityProviderCreationReq.StatusEnum.ACTIVE;
            case SUSPENDED:
                return IdentityProviderCreationReq.StatusEnum.SUSPENDED;
            default:
                return null;
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            an identity provider type.
     * @return mapped enum value
     */
    @Internal
    protected static IdentityProviderCreationReq.TypeEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelIdentityprovidercreationreqTypeenum(IdentityProviderType toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case SAML2:
                return IdentityProviderCreationReq.TypeEnum.SAML2;
            case OIDC:
                return IdentityProviderCreationReq.TypeEnum.OIDC;
            default:
                return null;
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a type enum.
     * @return mapped enum value
     */
    @Internal
    protected static IdentityProviderType translateToIdentityProviderType(IdentityProviderInfo.TypeEnum toBeMapped) {
        if (toBeMapped == null) {
            return IdentityProviderType.getUnknownEnum();
        }
        switch (toBeMapped) {
            case NATIVE:
                return IdentityProviderType.NATIVE;
            case MBED:
                return IdentityProviderType.MBED;
            case SAML2:
                return IdentityProviderType.SAML2;
            case OIDC:
                return IdentityProviderType.OIDC;
            default:
                return IdentityProviderType.getUnknownEnum();
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a status enum.
     * @return mapped enum value
     */
    @Internal
    protected static IdentityProviderStatus
              translateToIdentityProviderStatus(IdentityProviderInfo.StatusEnum toBeMapped) {
        if (toBeMapped == null) {
            return IdentityProviderStatus.getUnknownEnum();
        }
        switch (toBeMapped) {
            case ACTIVE:
                return IdentityProviderStatus.ACTIVE;
            case SUSPENDED:
                return IdentityProviderStatus.SUSPENDED;
            default:
                return IdentityProviderStatus.getUnknownEnum();
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            an identity provider status.
     * @return mapped enum value
     */
    @Internal
    protected static IdentityProviderUpdateReq.StatusEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelIdentityproviderupdatereqStatusenum(IdentityProviderStatus toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case ACTIVE:
                return IdentityProviderUpdateReq.StatusEnum.ACTIVE;
            case SUSPENDED:
                return IdentityProviderUpdateReq.StatusEnum.SUSPENDED;
            default:
                return null;
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            an identity provider type.
     * @return mapped enum value
     */
    @Internal
    protected static IdentityProviderUpdateReq.TypeEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelIdentityproviderupdatereqTypeenum(IdentityProviderType toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case SAML2:
                return IdentityProviderUpdateReq.TypeEnum.SAML2;
            case OIDC:
                return IdentityProviderUpdateReq.TypeEnum.OIDC;
            default:
                return null;
        }
    }
}
