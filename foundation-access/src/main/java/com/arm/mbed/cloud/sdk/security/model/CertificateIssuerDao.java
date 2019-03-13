// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Wed Jan 23 19:22:16 GMT 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;

/**
 * Data Access Object (DAO) for certificate issuers.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for certificate issuers.")
public class CertificateIssuerDao extends AbstractCertificateIssuerDao {
    /**
     * Constructor.
     */
    public CertificateIssuerDao() throws MbedCloudException {
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
    public CertificateIssuerDao clone() {
        try {
            return new CertificateIssuerDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                         : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Executes create.
     * 
     * @return something
     */
    @Override
    public CertificateIssuer create() throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes create.
     * 
     * @param modelToCreate
     *            an sdk model.
     * @return something
     */
    @Override
    public CertificateIssuer create(CertificateIssuer modelToCreate) throws MbedCloudException,
                                                                     NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes update.
     * 
     * @return something
     */
    @Override
    public CertificateIssuer update() throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes update.
     * 
     * @param modelToUpdate
     *            an sdk model.
     * @return something
     */
    @Override
    public CertificateIssuer update(CertificateIssuer modelToUpdate) throws MbedCloudException,
                                                                     NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }
}