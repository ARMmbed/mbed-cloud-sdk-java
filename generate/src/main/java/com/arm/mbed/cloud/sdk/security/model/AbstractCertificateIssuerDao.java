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
import com.arm.mbed.cloud.sdk.common.dao.CrudDao;
import java.lang.CloneNotSupportedException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Data Access Object (DAO) for certificate issuers.
 * <p>
 * @see <a  href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access Object</a> */
@Preamble(
    description = "Data Access Object (DAO) for certificate issuers."
)
public abstract class AbstractCertificateIssuerDao extends AbstractModelDao<CertificateIssuer> implements CrudDao<CertificateIssuer> {
  /**
   * Constructor.
   */
  public AbstractCertificateIssuerDao() throws MbedCloudException {
    super();
  }

  /**
   * Adds a certificate issuer.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuer#createCertificateIssuer(Map,CertificateIssuer)}
   * @param issuerCredentials The credentials required for connecting to the certificate issuer.
   * When the issuer_type is GLOBAL_SIGN, see definition of GlobalSignCredentials.
   * When the issuer_type is CFSSL_AUTH, see definition of CfsslAuthCredentials.
   * 
   */
  public void create(@Nullable @Nullable Map<String, String> issuerCredentials) throws
      MbedCloudException {
    checkDaoConfiguration();
    setModel(module.createCertificateIssuer(issuerCredentials, getModel()));
  }

  /**
   * Deletes a certificate issuer.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuer#deleteCertificateIssuer(String)}
   * @param arg0 null
   */
  @Override
  public void delete(@Nullable @Nullable String arg0) throws MbedCloudException {
    checkDaoConfiguration();
    module.deleteCertificateIssuer(arg0);
  }

  /**
   * Deletes a certificate issuer.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuer#deleteCertificateIssuer(CertificateIssuer)}
   */
  @Override
  public void delete() throws MbedCloudException {
    checkDaoConfiguration();
    module.deleteCertificateIssuer(getModel());
  }

  /**
   * Deletes a certificate issuer.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuer#deleteCertificateIssuer(CertificateIssuer)}
   * @param certificateIssuer a certificate issuer.
   */
  @Override
  public void delete(@NonNull @NonNull CertificateIssuer certificateIssuer) throws
      MbedCloudException {
    checkDaoConfiguration();
    setModel(certificateIssuer);
    delete();
  }

  /**
   * Gets a certificate issuer.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuer#getCertificateIssuer(String)}
   * @param arg0 null
   */
  @Override
  public void read(@Nullable @Nullable String arg0) throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.getCertificateIssuer(arg0));
  }

  /**
   * Gets a certificate issuer.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuer#getCertificateIssuer(CertificateIssuer)}
   */
  @Override
  public void read() throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.getCertificateIssuer(getModel()));
  }

  /**
   * Modifies a certificate issuer.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuer#updateCertificateIssuer(Map,String,CertificateIssuer)}
   * @param issuerCredentials The credentials required for connecting to the certificate issuer.
   * When the issuer_type is GLOBAL_SIGN, see definition of GlobalSignCredentials.
   * When the issuer_type is CFSSL_AUTH, see definition of CfsslAuthCredentials.
   * 
   * @param arg0 null
   */
  public void update(@Nullable @Nullable Map<String, String> issuerCredentials,
      @Nullable @Nullable String arg0) throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.updateCertificateIssuer(issuerCredentials, arg0, getModel()));
  }

  /**
   * Modifies a certificate issuer.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuer#updateCertificateIssuer(Map,CertificateIssuer)}
   * @param issuerCredentials The credentials required for connecting to the certificate issuer.
   * When the issuer_type is GLOBAL_SIGN, see definition of GlobalSignCredentials.
   * When the issuer_type is CFSSL_AUTH, see definition of CfsslAuthCredentials.
   * 
   */
  public void update(@Nullable @Nullable Map<String, String> issuerCredentials) throws
      MbedCloudException {
    checkDaoConfiguration();
    setModel(module.updateCertificateIssuer(issuerCredentials, getModel()));
  }

  /**
   * Verify certificate issuer.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuer#verify(String)}
   * @param arg0 null
   */
  public void verify(@Nullable @Nullable String arg0) throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.verify(arg0));
  }

  /**
   * Verify certificate issuer.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuer#verify(CertificateIssuer)}
   */
  public void verify() throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.verify(getModel()));
  }

  /**
   * Instantiates modules.
   * @param client an api client wrapper.
   * @return instantiated module
   */
  @Override
  @Internal
  protected SdkContext instantiateModule(ApiClientWrapper client) {
    return new Security(client);
  }

  /**
   * Instantiates modules.
   * @param context an sdk context.
   * @return instantiated module
   */
  @Override
  @Internal
  protected SdkContext instantiateModule(SdkContext context) {
    return new Security(context);
  }

  /**
   * Instantiates modules.
   * @param options a connection options.
   * @return instantiated module
   */
  @Override
  @Internal
  protected SdkContext instantiateModule(ConnectionOptions options) {
    return new Security(options);
  }

  /**
   * Instantiates model.
   * @return instantiated model
   */
  @Override
  @Internal
  protected CertificateIssuer instantiateModel() {
    return new CertificateIssuer();
  }

  /**
   * Clones this instance.
   * <p>
   * @see java.lang.Object#clone()
   * @return a cloned instance
   */
  @Override
  public Object clone() {
    try {
      return super.clone();
    }
    catch(CloneNotSupportedException exception) {
      return null;
    }
  }
}
