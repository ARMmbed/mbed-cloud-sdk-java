// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Mon Jun 03 11:17:45 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.branding.model;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;

/**
 * Data Access Object (DAO) for light theme colors.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for light theme colors.")
public class LightThemeColorDao extends AbstractLightThemeColorDao {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public LightThemeColorDao() throws MbedCloudException {
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
    public LightThemeColorDao(ApiClientWrapper client) throws MbedCloudException {
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
    public LightThemeColorDao(ConnectionOptions options) throws MbedCloudException {
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
    public LightThemeColorDao(SdkContext sdkContext) throws MbedCloudException {
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
    public LightThemeColorDao clone() {
        try {
            return new LightThemeColorDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                       : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Executes delete.
     *
     * @param id
     *            the colour Id.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(String id) throws MbedCloudException {
        delete(LightThemeColorReference.getValue(id));
    }

    /**
     * Executes read.
     *
     * @param id
     *            the colour Id.
     * @return the corresponding colour.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public LightThemeColor read(String id) throws MbedCloudException {
        return read(LightThemeColorReference.getValue(id));
    }
}