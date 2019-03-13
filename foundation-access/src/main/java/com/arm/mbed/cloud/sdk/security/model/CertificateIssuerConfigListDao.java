// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Thu Mar 07 14:29:44 GMT 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;

/**
 * Data Access Object (DAO) for listing certificate issuer configs.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing certificate issuer configs.")
public class CertificateIssuerConfigListDao extends AbstractCertificateIssuerConfigListDao {
    /**
     * Constructor.
     */
    public CertificateIssuerConfigListDao() throws MbedCloudException {
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
    public CertificateIssuerConfigListDao clone() {
        try {
            return new CertificateIssuerConfigListDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                                   : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Lists certificate issuer configs matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#listCertificateIssuerConfigs(String, com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfigListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of certificate issuer configs
     */
    @Override
    protected ListResponse<CertificateIssuerConfig>
              requestOnePage(CertificateIssuerConfigListOptions options) throws MbedCloudException,
                                                                         NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
        // The following code is auto-generated and can be used if carrying out what requestOnePage() intends/is meant
        // to do.

        /*
         * return ((Security)getModuleOrThrow()).listCertificateIssuerConfigs(null, options);
         */
    }
}