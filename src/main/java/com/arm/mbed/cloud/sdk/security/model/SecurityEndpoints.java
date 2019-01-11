// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.AbstractEndpoints;
import com.arm.mbed.cloud.sdk.common.ServiceRegistry;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.AccountAdminApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.AggregatorAccountAdminApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.CertificateEnrollmentsApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.CertificateIssuersActivationApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.CertificateIssuersApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.DeveloperApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.DeveloperCertificateApi;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api.ServerCredentialsApi;

/**
 * Endpoints for Security APIs module.
 */
@Preamble(description = "Endpoints for Security APIs module.")
@Internal
public class SecurityEndpoints extends AbstractEndpoints {
    /**
     * Low level endpoints for certificate enrollments apis.
     */
    @Internal
    private final CertificateEnrollmentsApi certificateEnrollmentsApi;

    /**
     * Low level endpoints for certificate issuers apis.
     */
    @Internal
    private final CertificateIssuersApi certificateIssuersApi;

    /**
     * Low level endpoints for certificate issuers activation apis.
     */
    @Internal
    private final CertificateIssuersActivationApi certificateIssuersActivationApi;

    /**
     * Low level endpoints for developer certificate apis.
     */
    @Internal
    private final DeveloperCertificateApi developerCertificateApi;

    /**
     * Low level endpoints for developer apis.
     */
    @Internal
    private final DeveloperApi developerApi;

    /**
     * Low level endpoints for server credentials apis.
     */
    @Internal
    private final ServerCredentialsApi serverCredentialsApi;

    /**
     * Low level endpoints for aggregator account admin apis.
     */
    @Internal
    private final AggregatorAccountAdminApi aggregatorAccountAdminApi;

    /**
     * Low level endpoints for account admin apis.
     */
    @Internal
    private final AccountAdminApi accountAdminApi;

    /**
     * Constructor.
     * 
     * @param services
     *            created services {@link ServiceRegistry}.
     */
    public SecurityEndpoints(ServiceRegistry services) {
        super(services);
        this.certificateEnrollmentsApi = initialiseService(CertificateEnrollmentsApi.class);
        this.certificateIssuersApi = initialiseService(CertificateIssuersApi.class);
        this.certificateIssuersActivationApi = initialiseService(CertificateIssuersActivationApi.class);
        this.developerCertificateApi = initialiseService(DeveloperCertificateApi.class);
        this.developerApi = initialiseService(DeveloperApi.class);
        this.serverCredentialsApi = initialiseService(ServerCredentialsApi.class);
        this.aggregatorAccountAdminApi = initialiseService(AggregatorAccountAdminApi.class);
        this.accountAdminApi = initialiseService(AccountAdminApi.class);
    }

    /**
     * Gets low level endpoints for certificate enrollments apis.
     * 
     * @return certificateEnrollmentsApi
     */
    public CertificateEnrollmentsApi getCertificateEnrollmentsApi() {
        return certificateEnrollmentsApi;
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public SecurityEndpoints clone() {
        return new SecurityEndpoints(getRegistryClone());
    }

    /**
     * Gets low level endpoints for certificate issuers apis.
     * 
     * @return certificateIssuersApi
     */
    public CertificateIssuersApi getCertificateIssuersApi() {
        return certificateIssuersApi;
    }

    /**
     * Gets low level endpoints for certificate issuers activation apis.
     * 
     * @return certificateIssuersActivationApi
     */
    public CertificateIssuersActivationApi getCertificateIssuersActivationApi() {
        return certificateIssuersActivationApi;
    }

    /**
     * Gets low level endpoints for developer certificate apis.
     * 
     * @return developerCertificateApi
     */
    public DeveloperCertificateApi getDeveloperCertificateApi() {
        return developerCertificateApi;
    }

    /**
     * Gets low level endpoints for developer apis.
     * 
     * @return developerApi
     */
    public DeveloperApi getDeveloperApi() {
        return developerApi;
    }

    /**
     * Gets low level endpoints for server credentials apis.
     * 
     * @return serverCredentialsApi
     */
    public ServerCredentialsApi getServerCredentialsApi() {
        return serverCredentialsApi;
    }

    /**
     * Gets low level endpoints for aggregator account admin apis.
     * 
     * @return aggregatorAccountAdminApi
     */
    public AggregatorAccountAdminApi getAggregatorAccountAdminApi() {
        return aggregatorAccountAdminApi;
    }

    /**
     * Gets low level endpoints for account admin apis.
     * 
     * @return accountAdminApi
     */
    public AccountAdminApi getAccountAdminApi() {
        return accountAdminApi;
    }
}
