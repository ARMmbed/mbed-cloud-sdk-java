// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [TrustedCertificateListDao]
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.Security;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelListDao;
import com.arm.mbed.cloud.sdk.common.dao.ModelListDao;
import java.lang.Class;
import java.lang.CloneNotSupportedException;
import java.lang.Object;
import java.lang.Override;

/**
 * Data Access Object (DAO) for listing trusted certificates.
 * <p>
 * @see <a  href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access Object</a> */
@Preamble(
    description = "Data Access Object (DAO) for listing trusted certificates."
)
public abstract class AbstractTrustedCertificateListDao extends AbstractModelListDao<TrustedCertificate, TrustedCertificateListOptions> implements ModelListDao<TrustedCertificate> {
  /**
   * Constructor.
   */
  public AbstractTrustedCertificateListDao() throws MbedCloudException {
    super();
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
   * a trusted certificate list options.
   * @return a trusted certificate list options
   */
  @Override
  @Internal
  protected TrustedCertificateListOptions instantiateListOptions() {
    return new TrustedCertificateListOptions();
  }

  /**
   * a trusted certificate dao class.
   * @return a trusted certificate dao class
   */
  @Override
  @Internal
  public Class<TrustedCertificateDao> getCorrespondingModelDaoDefinition() {
    return TrustedCertificateDao.class;
  }

  /**
   * a trusted certificate dao.
   * @return a trusted certificate dao
   */
  @Override
  @Internal
  public TrustedCertificateDao getCorrespondingModelDao() {
    return new TrustedCertificateDao().configureAndGet(module);
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
