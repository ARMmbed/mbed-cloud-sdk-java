// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.Security;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.CrudDao;

/**
 * Data Access Object (DAO) for certificate issuer configs.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for certificate issuer configs.")
public class CertificateIssuerConfigDao extends AbstractModelDao<CertificateIssuerConfig>
                                        implements CrudDao<CertificateIssuerConfig> {
    /**
     * Constructor.
     */
    public CertificateIssuerConfigDao() throws MbedCloudException {
        super();
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public CertificateIssuerConfigDao clone() {
        try {
            return new CertificateIssuerConfigDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                               : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#createCertificateIssuerConfig(com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig)}
     * 
     * @return an added certificate issuer config
     */
    @Override
    public CertificateIssuerConfig create() throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).createCertificateIssuerConfig(getModel()));
        return getModel();
    }

    /**
     * Adds a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#createCertificateIssuerConfig(com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig)}
     * 
     * @param createCertificateIssuerConfig
     *            a certificate issuer config.
     * @return an added certificate issuer config
     */
    @Override
    public CertificateIssuerConfig
           create(@NonNull CertificateIssuerConfig createCertificateIssuerConfig) throws MbedCloudException {
        setModel(createCertificateIssuerConfig);
        return create();
    }

    /**
     * Deletes a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#deleteCertificateIssuerConfig(com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig)}
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Security) getModuleOrThrow()).deleteCertificateIssuerConfig(getModel());
    }

    /**
     * Deletes a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#deleteCertificateIssuerConfig(com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig)}
     * 
     * @param certificateIssuerConfig
     *            a certificate issuer config.
     */
    @Override
    public void delete(@NonNull CertificateIssuerConfig certificateIssuerConfig) throws MbedCloudException {
        setModel(certificateIssuerConfig);
        delete();
    }

    /**
     * Deletes a certificate issuer config.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#deleteCertificateIssuerConfig(String)}
     * 
     * @param id
     *            The ID of the certificate issuer configuration.
     * 
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Security) getModuleOrThrow()).deleteCertificateIssuerConfig(id);
    }

    /**
     * Get certificate issuer configuration.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#getDefault()}
     * 
     * @return something
     */
    public CertificateIssuerConfig getDefault() throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).getDefault());
        return getModel();
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected CertificateIssuerConfig instantiateModel() {
        return new CertificateIssuerConfig();
    }

    /**
     * Instantiates modules.
     * 
     * @param client
     *            an api client wrapper.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(ApiClientWrapper client) {
        return new Security(client);
    }

    /**
     * Instantiates modules.
     * 
     * @param options
     *            a connection options.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(ConnectionOptions options) {
        return new Security(options);
    }

    /**
     * Instantiates modules.
     * 
     * @param context
     *            an sdk context.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(SdkContext context) {
        return new Security(context);
    }

    /**
     * Gets a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#readCertificateIssuerConfig(com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig)}
     * 
     * @return something
     */
    @Override
    public CertificateIssuerConfig read() throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).readCertificateIssuerConfig(getModel()));
        return getModel();
    }

    /**
     * Gets a certificate issuer config.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#readCertificateIssuerConfig(String)}
     * 
     * @param id
     *            The ID of the certificate issuer configuration.
     * 
     * @return something
     */
    @Override
    public CertificateIssuerConfig read(@NonNull String id) throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).readCertificateIssuerConfig(id));
        return getModel();
    }

    /**
     * Modifies a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#updateCertificateIssuerConfig(com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig)}
     * 
     * @return something
     */
    @Override
    public CertificateIssuerConfig update() throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).updateCertificateIssuerConfig(getModel()));
        return getModel();
    }

    /**
     * Modifies a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#updateCertificateIssuerConfig(com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig)}
     * 
     * @param certificateIssuerConfig
     *            a certificate issuer config.
     * @return something
     */
    @Override
    public CertificateIssuerConfig
           update(@NonNull CertificateIssuerConfig certificateIssuerConfig) throws MbedCloudException {
        setModel(certificateIssuerConfig);
        return update();
    }

    /**
     * Modifies a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#updateCertificateIssuerConfig(com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig, String)}
     * 
     * @param id
     *            The ID of the certificate issuer configuration.
     * 
     * @return an updated certificate issuer config
     */
    public CertificateIssuerConfig update(@NonNull String id) throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).updateCertificateIssuerConfig(getModel(), id));
        return getModel();
    }
}