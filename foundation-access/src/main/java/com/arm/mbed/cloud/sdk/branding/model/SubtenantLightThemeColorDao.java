// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Tue Jun 04 15:39:38 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.branding.model;

import com.arm.mbed.cloud.sdk.annotations.NotImplemented;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.SdkContext;

/**
 * Data Access Object (DAO) for subtenant light theme colors.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for subtenant light theme colors.")
public class SubtenantLightThemeColorDao extends AbstractSubtenantLightThemeColorDao {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantLightThemeColorDao() throws MbedCloudException {
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
    public SubtenantLightThemeColorDao(ApiClientWrapper client) throws MbedCloudException {
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
    public SubtenantLightThemeColorDao(ConnectionOptions options) throws MbedCloudException {
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
    public SubtenantLightThemeColorDao(SdkContext sdkContext) throws MbedCloudException {
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
    public SubtenantLightThemeColorDao clone() {
        try {
            return new SubtenantLightThemeColorDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                                : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Executes delete.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public void delete() throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes delete.
     * 
     * @param modelToDelete
     *            an sdk model.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public void delete(SubtenantLightThemeColor modelToDelete) throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes read.
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public SubtenantLightThemeColor read() throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes update.
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public SubtenantLightThemeColor update() throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes update.
     * 
     * @param modelToUpdate
     *            an sdk model.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public SubtenantLightThemeColor update(SubtenantLightThemeColor modelToUpdate) throws MbedCloudException,
                                                                                   NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }
}