// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.AbstractEndpoints;
import com.arm.mbed.cloud.sdk.common.ServiceRegistry;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.AccountApiKeysApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.AccountIdentityProvidersApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.AccountPolicyGroupsApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.AccountProfileApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.AccountUserInvitationsApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.AccountUsersApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.TenantAccountsAccountsApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.TenantAccountsApiKeysApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.TenantAccountsIdentityProvidersApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.TenantAccountsPolicyGroupsApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.TenantAccountsUserInvitationsApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.TenantAccountsUsersApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.TenantSecurityAndIdentityCertificatesApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.TenantUserInterfaceConfigurationColorsApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.TenantUserInterfaceConfigurationImagesApi;

/**
 * Endpoints for Accounts APIs module.
 */
@Preamble(description = "Endpoints for Accounts APIs module.")
@Internal
@SuppressWarnings("PMD.CyclomaticComplexity")
public class AccountsEndpoints extends AbstractEndpoints {
    /**
     * Low level endpoints for tenant accounts api keys apis.
     */
    @Internal
    private final TenantAccountsApiKeysApi tenantAccountsApiKeysApi;

    /**
     * Low level endpoints for tenant accounts accounts apis.
     */
    @Internal
    private final TenantAccountsAccountsApi tenantAccountsAccountsApi;

    /**
     * Low level endpoints for tenant user interface configuration colors apis.
     */
    @Internal
    private final TenantUserInterfaceConfigurationColorsApi tenantUserInterfaceConfigurationColorsApi;

    /**
     * Low level endpoints for tenant user interface configuration images apis.
     */
    @Internal
    private final TenantUserInterfaceConfigurationImagesApi tenantUserInterfaceConfigurationImagesApi;

    /**
     * Low level endpoints for tenant accounts identity providers apis.
     */
    @Internal
    private final TenantAccountsIdentityProvidersApi tenantAccountsIdentityProvidersApi;

    /**
     * Low level endpoints for account profile apis.
     */
    @Internal
    private final AccountProfileApi accountProfileApi;

    /**
     * Low level endpoints for tenant accounts policy groups apis.
     */
    @Internal
    private final TenantAccountsPolicyGroupsApi tenantAccountsPolicyGroupsApi;

    /**
     * Low level endpoints for tenant security and identity certificates apis.
     */
    @Internal
    private final TenantSecurityAndIdentityCertificatesApi tenantSecurityAndIdentityCertificatesApi;

    /**
     * Low level endpoints for tenant accounts user invitations apis.
     */
    @Internal
    private final TenantAccountsUserInvitationsApi tenantAccountsUserInvitationsApi;

    /**
     * Low level endpoints for tenant accounts users apis.
     */
    @Internal
    private final TenantAccountsUsersApi tenantAccountsUsersApi;

    /**
     * Low level endpoints for account api keys apis.
     */
    @Internal
    private final AccountApiKeysApi accountApiKeysApi;

    /**
     * Low level endpoints for account identity providers apis.
     */
    @Internal
    private final AccountIdentityProvidersApi accountIdentityProvidersApi;

    /**
     * Low level endpoints for account policy groups apis.
     */
    @Internal
    private final AccountPolicyGroupsApi accountPolicyGroupsApi;

    /**
     * Low level endpoints for account users apis.
     */
    @Internal
    private final AccountUsersApi accountUsersApi;

    /**
     * Low level endpoints for account user invitations apis.
     */
    @Internal
    private final AccountUserInvitationsApi accountUserInvitationsApi;

    /**
     * Constructor.
     * 
     * @param services
     *            created services {@link ServiceRegistry}.
     */
    public AccountsEndpoints(ServiceRegistry services) {
        super(services);
        this.tenantAccountsApiKeysApi = initialiseService(TenantAccountsApiKeysApi.class);
        this.tenantAccountsAccountsApi = initialiseService(TenantAccountsAccountsApi.class);
        this.tenantUserInterfaceConfigurationColorsApi = initialiseService(TenantUserInterfaceConfigurationColorsApi.class);
        this.tenantUserInterfaceConfigurationImagesApi = initialiseService(TenantUserInterfaceConfigurationImagesApi.class);
        this.tenantAccountsIdentityProvidersApi = initialiseService(TenantAccountsIdentityProvidersApi.class);
        this.accountProfileApi = initialiseService(AccountProfileApi.class);
        this.tenantAccountsPolicyGroupsApi = initialiseService(TenantAccountsPolicyGroupsApi.class);
        this.tenantSecurityAndIdentityCertificatesApi = initialiseService(TenantSecurityAndIdentityCertificatesApi.class);
        this.tenantAccountsUserInvitationsApi = initialiseService(TenantAccountsUserInvitationsApi.class);
        this.tenantAccountsUsersApi = initialiseService(TenantAccountsUsersApi.class);
        this.accountApiKeysApi = initialiseService(AccountApiKeysApi.class);
        this.accountIdentityProvidersApi = initialiseService(AccountIdentityProvidersApi.class);
        this.accountPolicyGroupsApi = initialiseService(AccountPolicyGroupsApi.class);
        this.accountUsersApi = initialiseService(AccountUsersApi.class);
        this.accountUserInvitationsApi = initialiseService(AccountUserInvitationsApi.class);
    }

    /**
     * Gets low level endpoints for account api keys apis.
     * 
     * @return accountApiKeysApi
     */
    @Internal
    public AccountApiKeysApi getAccountApiKeysApi() {
        return accountApiKeysApi;
    }

    /**
     * Gets low level endpoints for account identity providers apis.
     * 
     * @return accountIdentityProvidersApi
     */
    @Internal
    public AccountIdentityProvidersApi getAccountIdentityProvidersApi() {
        return accountIdentityProvidersApi;
    }

    /**
     * Gets low level endpoints for account policy groups apis.
     * 
     * @return accountPolicyGroupsApi
     */
    @Internal
    public AccountPolicyGroupsApi getAccountPolicyGroupsApi() {
        return accountPolicyGroupsApi;
    }

    /**
     * Gets low level endpoints for tenant accounts api keys apis.
     * 
     * @return tenantAccountsApiKeysApi
     */
    @Internal
    public TenantAccountsApiKeysApi getTenantAccountsApiKeysApi() {
        return tenantAccountsApiKeysApi;
    }

    /**
     * Gets low level endpoints for tenant accounts identity providers apis.
     * 
     * @return tenantAccountsIdentityProvidersApi
     */
    @Internal
    public TenantAccountsIdentityProvidersApi getTenantAccountsIdentityProvidersApi() {
        return tenantAccountsIdentityProvidersApi;
    }

    /**
     * Gets low level endpoints for tenant accounts policy groups apis.
     * 
     * @return tenantAccountsPolicyGroupsApi
     */
    @Internal
    public TenantAccountsPolicyGroupsApi getTenantAccountsPolicyGroupsApi() {
        return tenantAccountsPolicyGroupsApi;
    }

    /**
     * Gets low level endpoints for tenant accounts users apis.
     * 
     * @return tenantAccountsUsersApi
     */
    @Internal
    public TenantAccountsUsersApi getTenantAccountsUsersApi() {
        return tenantAccountsUsersApi;
    }

    /**
     * Gets low level endpoints for tenant accounts user invitations apis.
     * 
     * @return tenantAccountsUserInvitationsApi
     */
    @Internal
    public TenantAccountsUserInvitationsApi getTenantAccountsUserInvitationsApi() {
        return tenantAccountsUserInvitationsApi;
    }

    /**
     * Gets low level endpoints for account users apis.
     * 
     * @return accountUsersApi
     */
    @Internal
    public AccountUsersApi getAccountUsersApi() {
        return accountUsersApi;
    }

    /**
     * Gets low level endpoints for account user invitations apis.
     * 
     * @return accountUserInvitationsApi
     */
    @Internal
    public AccountUserInvitationsApi getAccountUserInvitationsApi() {
        return accountUserInvitationsApi;
    }

    /**
     * Gets low level endpoints for tenant accounts accounts apis.
     * 
     * @return tenantAccountsAccountsApi
     */
    @Internal
    public TenantAccountsAccountsApi getTenantAccountsAccountsApi() {
        return tenantAccountsAccountsApi;
    }

    /**
     * Gets low level endpoints for tenant user interface configuration colors apis.
     * 
     * @return tenantUserInterfaceConfigurationColorsApi
     */
    @Internal
    public TenantUserInterfaceConfigurationColorsApi getTenantUserInterfaceConfigurationColorsApi() {
        return tenantUserInterfaceConfigurationColorsApi;
    }

    /**
     * Gets low level endpoints for tenant user interface configuration images apis.
     * 
     * @return tenantUserInterfaceConfigurationImagesApi
     */
    @Internal
    public TenantUserInterfaceConfigurationImagesApi getTenantUserInterfaceConfigurationImagesApi() {
        return tenantUserInterfaceConfigurationImagesApi;
    }

    /**
     * Gets low level endpoints for account profile apis.
     * 
     * @return accountProfileApi
     */
    @Internal
    public AccountProfileApi getAccountProfileApi() {
        return accountProfileApi;
    }

    /**
     * Gets low level endpoints for tenant security and identity certificates apis.
     * 
     * @return tenantSecurityAndIdentityCertificatesApi
     */
    @Internal
    public TenantSecurityAndIdentityCertificatesApi getTenantSecurityAndIdentityCertificatesApi() {
        return tenantSecurityAndIdentityCertificatesApi;
    }

    /**
     * Clones this instance.
     * 
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public AccountsEndpoints clone() {
        return new AccountsEndpoints(getRegistryClone());
    }
}
