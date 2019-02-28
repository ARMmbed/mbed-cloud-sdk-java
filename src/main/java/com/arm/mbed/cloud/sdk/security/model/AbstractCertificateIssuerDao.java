// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [CertificateIssuerDao]
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.Security;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.CreateDao;
import com.arm.mbed.cloud.sdk.common.dao.DeleteDao;
import com.arm.mbed.cloud.sdk.common.dao.UpdateDao;
import java.util.Map;

/**
 * Data Access Object (DAO) for certificate issuers.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for certificate issuers.")
public abstract class AbstractCertificateIssuerDao extends AbstractModelDao<CertificateIssuer>
                                                   implements CreateDao<CertificateIssuer>,
                                                   UpdateDao<CertificateIssuer>, DeleteDao<CertificateIssuer> {
    /**
     * Constructor.
     */
    public AbstractCertificateIssuerDao() throws MbedCloudException {
        super();
    }

    /**
     * Adds a certificate issuer.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#createCertificateIssuer(Map,CertificateIssuer)}
     * 
     * @param issuerCredentials
     *            The credentials required for connecting to the certificate issuer. When the issuer_type is
     *            GLOBAL_SIGN, see definition of GlobalSignCredentials. When the issuer_type is CFSSL_AUTH, see
     *            definition of CfsslAuthCredentials.
     *
     * @return an added certificate issuer
     */
    public CertificateIssuer create(@Nullable Map<String, String> issuerCredentials) throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).createCertificateIssuer(issuerCredentials, getModel()));
        return getModel();
    }

    /**
     * Deletes a certificate issuer.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#deleteCertificateIssuer(CertificateIssuer)}
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Security) getModuleOrThrow()).deleteCertificateIssuer(getModel());
    }

    /**
     * Deletes a certificate issuer.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#deleteCertificateIssuer(CertificateIssuer)}
     * 
     * @param certificateIssuer
     *            a certificate issuer.
     */
    @Override
    public void delete(@NonNull CertificateIssuer certificateIssuer) throws MbedCloudException {
        setModel(certificateIssuer);
        delete();
    }

    /**
     * Deletes a certificate issuer.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#deleteCertificateIssuer(String)}
     * 
     * @param id
     *            Certificate issuer ID. <br>
     *            The ID of the certificate issuer. An active certificate issuer may not be deleted.
     *
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Security) getModuleOrThrow()).deleteCertificateIssuer(id);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected CertificateIssuer instantiateModel() {
        return new CertificateIssuer();
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
     * Get certificate issuer by ID.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#read(CertificateIssuer)}
     * 
     * @return something
     */
    public CertificateIssuer read() throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).read(getModel()));
        return getModel();
    }

    /**
     * Get certificate issuer by ID.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#read(String)}
     * 
     * @param id
     *            The ID of the certificate issuer.
     * @return something
     */
    public CertificateIssuer read(@NonNull String id) throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).read(id));
        return getModel();
    }

    /**
     * Modifies a certificate issuer.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#updateCertificateIssuer(Map,CertificateIssuer)}
     * 
     * @param issuerCredentials
     *            The credentials required for connecting to the certificate issuer. When the issuer_type is
     *            GLOBAL_SIGN, see definition of GlobalSignCredentials. When the issuer_type is CFSSL_AUTH, see
     *            definition of CfsslAuthCredentials.
     *
     * @return something
     */
    public CertificateIssuer update(@Nullable Map<String, String> issuerCredentials) throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).updateCertificateIssuer(issuerCredentials, getModel()));
        return getModel();
    }

    /**
     * Modifies a certificate issuer.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#updateCertificateIssuer(Map,String,CertificateIssuer)}
     * 
     * @param issuerCredentials
     *            The credentials required for connecting to the certificate issuer. When the issuer_type is
     *            GLOBAL_SIGN, see definition of GlobalSignCredentials. When the issuer_type is CFSSL_AUTH, see
     *            definition of CfsslAuthCredentials.
     *
     * @param id
     *            The ID of the certificate issuer.
     * @return an updated certificate issuer
     */
    public CertificateIssuer update(@Nullable Map<String, String> issuerCredentials,
                                    @NonNull String id) throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).updateCertificateIssuer(issuerCredentials, id, getModel()));
        return getModel();
    }

    /**
     * Verify certificate issuer.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#verify(CertificateIssuer)}
     * 
     * @return something
     */
    public VerificationResponse verify() throws MbedCloudException {
        return ((Security) getModuleOrThrow()).verify(getModel());
    }

    /**
     * Verify certificate issuer.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#verify(String)}
     * 
     * @param id
     *            Certificate issuer ID. <br>
     *            The ID of the certificate issuer.
     *
     * @return something
     */
    public VerificationResponse verify(@NonNull String id) throws MbedCloudException {
        return ((Security) getModuleOrThrow()).verify(id);
    }
}
