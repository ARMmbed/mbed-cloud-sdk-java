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
 * Data Access Object (DAO) for trusted certificates.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for trusted certificates.")
public class TrustedCertificateDao extends AbstractModelDao<TrustedCertificate> implements CrudDao<TrustedCertificate> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public TrustedCertificateDao() throws MbedCloudException {
        super();
    }

    /**
     * Constructor.
     * 
     * @param client
     *            an api client wrapper.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public TrustedCertificateDao(ApiClientWrapper client) throws MbedCloudException {
        super(client);
    }

    /**
     * Constructor.
     * 
     * @param options
     *            a connection options.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public TrustedCertificateDao(ConnectionOptions options) throws MbedCloudException {
        super(options);
    }

    /**
     * Constructor.
     * 
     * @param sdkContext
     *            an sdk context.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public TrustedCertificateDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
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
    @SuppressWarnings({ "resource", "unused" })
    public TrustedCertificateDao clone() {
        try {
            return new TrustedCertificateDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                          : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds a trusted certificate.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#createTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.TrustedCertificate)}
     * 
     * @return an added trusted certificate
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public TrustedCertificate create() throws MbedCloudException {
        return setAndGetModel(((Security) getModuleOrThrow()).createTrustedCertificate(getModel()));
    }

    /**
     * Adds a trusted certificate.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#createTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.TrustedCertificate)}
     * 
     * @param trustedCertificate
     *            a trusted certificate.
     * @return an added trusted certificate
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public TrustedCertificate create(@NonNull TrustedCertificate trustedCertificate) throws MbedCloudException {
        setModel(trustedCertificate);
        return create();
    }

    /**
     * Deletes a trusted certificate.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#deleteTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.TrustedCertificate)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Security) getModuleOrThrow()).deleteTrustedCertificate(getModel());
    }

    /**
     * Deletes a trusted certificate.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#deleteTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.TrustedCertificate)}
     * 
     * @param trustedCertificate
     *            a trusted certificate.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull TrustedCertificate trustedCertificate) throws MbedCloudException {
        setModel(trustedCertificate);
        delete();
    }

    /**
     * Deletes a trusted certificate.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#deleteTrustedCertificate(String)}
     * 
     * @param id
     *            The ID of the trusted certificate to be deleted.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Security) getModuleOrThrow()).deleteTrustedCertificate(id);
    }

    /**
     * Fetch an existing developer certificate to connect to the bootstrap server.
     *
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#getDeveloperCertificateInfo(com.arm.mbed.cloud.sdk.security.model.TrustedCertificate)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeveloperCertificate getDeveloperCertificateInfo() throws MbedCloudException {
        return ((Security) getModuleOrThrow()).getDeveloperCertificateInfo(getModel());
    }

    /**
     * Fetch an existing developer certificate to connect to the bootstrap server.
     *
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#getDeveloperCertificateInfo(String)}
     * 
     * @param id
     *            ID that uniquely identifies the developer certificate.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeveloperCertificate getDeveloperCertificateInfo(@NonNull String id) throws MbedCloudException {
        return ((Security) getModuleOrThrow()).getDeveloperCertificateInfo(id);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected TrustedCertificate instantiateModel() {
        return new TrustedCertificate();
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
     * Gets a trusted certificate.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#readTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.TrustedCertificate)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public TrustedCertificate read() throws MbedCloudException {
        return setAndGetModel(((Security) getModuleOrThrow()).readTrustedCertificate(getModel()));
    }

    /**
     * Gets a trusted certificate.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#readTrustedCertificate(String)}
     * 
     * @param id
     *            Entity ID.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public TrustedCertificate read(@NonNull String id) throws MbedCloudException {
        return setAndGetModel(((Security) getModuleOrThrow()).readTrustedCertificate(id));
    }

    /**
     * Modifies a trusted certificate.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#updateTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.TrustedCertificate)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public TrustedCertificate update() throws MbedCloudException {
        return setAndGetModel(((Security) getModuleOrThrow()).updateTrustedCertificate(getModel()));
    }

    /**
     * Modifies a trusted certificate.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#updateTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.TrustedCertificate)}
     * 
     * @param trustedCertificate
     *            a trusted certificate.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public TrustedCertificate update(@NonNull TrustedCertificate trustedCertificate) throws MbedCloudException {
        setModel(trustedCertificate);
        return update();
    }

    /**
     * Modifies a trusted certificate.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#updateTrustedCertificate(String, com.arm.mbed.cloud.sdk.security.model.TrustedCertificate)}
     * 
     * @param id
     *            Entity ID.
     * @return an updated trusted certificate
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public TrustedCertificate update(@NonNull String id) throws MbedCloudException {
        return setAndGetModel(((Security) getModuleOrThrow()).updateTrustedCertificate(id, getModel()));
    }
}
