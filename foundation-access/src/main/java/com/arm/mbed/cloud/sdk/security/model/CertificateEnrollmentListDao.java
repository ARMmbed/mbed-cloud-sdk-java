// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
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
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;

/**
 * Data Access Object (DAO) for listing certificate enrollments.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing certificate enrollments.")
public class CertificateEnrollmentListDao extends
                                          AbstractModelListDao<CertificateEnrollment, CertificateEnrollmentListOptions>
                                          implements
                                          ModelListDao<CertificateEnrollment, CertificateEnrollmentListOptions> {
    /**
     * Constructor.
     */
    public CertificateEnrollmentListDao() throws MbedCloudException {
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
    @SuppressWarnings({ "unused", "resource" })
    public CertificateEnrollmentListDao clone() {
        try {
            return new CertificateEnrollmentListDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                                 : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * a certificate enrollment dao.
     * 
     * @return a certificate enrollment dao
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public CertificateEnrollmentDao getCorrespondingModelDao() throws MbedCloudException {
        return new CertificateEnrollmentDao().configureAndGet(getModuleOrThrow());
    }

    /**
     * a certificate enrollment dao class.
     * 
     * @return a certificate enrollment dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<CertificateEnrollmentDao> getCorrespondingModelDaoDefinition() {
        return CertificateEnrollmentDao.class;
    }

    /**
     * a certificate enrollment list options.
     * 
     * @return a certificate enrollment list options
     */
    @Override
    @Internal
    protected CertificateEnrollmentListOptions instantiateListOptions() {
        return new CertificateEnrollmentListOptions();
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
     * Lists certificate enrollments matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#listCertificateEnrollments(com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of certificate enrollments
     */
    @Override
    protected ListResponse<CertificateEnrollment>
              requestOnePage(CertificateEnrollmentListOptions options) throws MbedCloudException {
        return ((Security) getModuleOrThrow()).listCertificateEnrollments(options);
    }
}
