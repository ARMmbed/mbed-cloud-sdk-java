// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [TrustedCertificateDao]
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

/**
 * Data Access Object (DAO) for trusted certificates.
 * <p>
 * @see <a  href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access Object</a> */
@Preamble(
    description = "Data Access Object (DAO) for trusted certificates."
)
public abstract class AbstractTrustedCertificateDao extends AbstractModelDao<TrustedCertificate> implements CrudDao<TrustedCertificate> {
  /**
   * Constructor.
   */
  public AbstractTrustedCertificateDao() throws MbedCloudException {
    super();
  }

  /**
   * Adds a trusted certificate.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.TrustedCertificate#createTrustedCertificate(TrustedCertificate)}
   */
  @Override
  public void create() throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.createTrustedCertificate(getModel()));
  }

  /**
   * Adds a trusted certificate.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.TrustedCertificate#createTrustedCertificate(TrustedCertificate)}
   * @param arg0 a trusted certificate.
   */
  @Override
  public void create(@NonNull @NonNull TrustedCertificate arg0) throws MbedCloudException {
    checkDaoConfiguration();
    setModel(arg0);
    create();
  }

  /**
   * Deletes a trusted certificate.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.TrustedCertificate#deleteTrustedCertificate(String)}
   * @param arg0 null
   */
  @Override
  public void delete(@Nullable @Nullable String arg0) throws MbedCloudException {
    checkDaoConfiguration();
    module.deleteTrustedCertificate(arg0);
  }

  /**
   * Deletes a trusted certificate.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.TrustedCertificate#deleteTrustedCertificate(TrustedCertificate)}
   */
  @Override
  public void delete() throws MbedCloudException {
    checkDaoConfiguration();
    module.deleteTrustedCertificate(getModel());
  }

  /**
   * Deletes a trusted certificate.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.TrustedCertificate#deleteTrustedCertificate(TrustedCertificate)}
   * @param trustedCertificate a trusted certificate.
   */
  @Override
  public void delete(@NonNull @NonNull TrustedCertificate trustedCertificate) throws
      MbedCloudException {
    checkDaoConfiguration();
    setModel(trustedCertificate);
    delete();
  }

  /**
   * Gets a trusted certificate.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.TrustedCertificate#getTrustedCertificate(String)}
   * @param arg0 null
   */
  @Override
  public void read(@Nullable @Nullable String arg0) throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.getTrustedCertificate(arg0));
  }

  /**
   * Gets a trusted certificate.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.TrustedCertificate#getTrustedCertificate(TrustedCertificate)}
   */
  @Override
  public void read() throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.getTrustedCertificate(getModel()));
  }

  /**
   * Modifies a trusted certificate.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.TrustedCertificate#updateTrustedCertificate(String,TrustedCertificate)}
   * @param arg0 null
   */
  public void update(@Nullable @Nullable String arg0) throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.updateTrustedCertificate(arg0, getModel()));
  }

  /**
   * Modifies a trusted certificate.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.TrustedCertificate#updateTrustedCertificate(TrustedCertificate)}
   */
  @Override
  public void update() throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.updateTrustedCertificate(getModel()));
  }

  /**
   * Modifies a trusted certificate.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.TrustedCertificate#updateTrustedCertificate(TrustedCertificate)}
   * @param trustedCertificate a trusted certificate.
   */
  @Override
  public void update(@NonNull @NonNull TrustedCertificate trustedCertificate) throws
      MbedCloudException {
    checkDaoConfiguration();
    setModel(trustedCertificate);
    update();
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
  protected TrustedCertificate instantiateModel() {
    return new TrustedCertificate();
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
