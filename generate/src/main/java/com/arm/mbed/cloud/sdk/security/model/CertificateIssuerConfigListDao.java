// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Fri Dec 28 16:23:53 GMT 2018. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import java.lang.Override;

/**
 * Data Access Object (DAO) for listing certificate issuer configs.
 * <p>
 * @see <a  href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access Object</a> */
@Preamble(
    description = "Data Access Object (DAO) for listing certificate issuer configs."
)
public class CertificateIssuerConfigListDao extends AbstractCertificateIssuerConfigListDao {
  /**
   * Constructor.
   */
  public CertificateIssuerConfigListDao() throws MbedCloudException {
    super();
  }

  /**
   * Lists certificate issuer configs matching filter options.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#listCertificateIssuerConfigs(Integer,String,String,String,String,CertificateIssuerConfigListOptions)}
   * @param options list options.
   * @return one page of certificate issuer configs
   */
  @Override
  protected ListResponse<CertificateIssuerConfig> requestOnePage(
      CertificateIssuerConfigListOptions options) throws MbedCloudException,
      NotImplementedException {
    // TODO Auto-generated method stub.;
    throw new NotImplementedException();
    checkDaoConfiguration();
    return module.listCertificateIssuerConfigs(null, null, null, null, null, options);
  }
}
