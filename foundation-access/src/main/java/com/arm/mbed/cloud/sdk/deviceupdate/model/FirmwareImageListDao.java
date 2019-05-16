// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import com.arm.mbed.cloud.sdk.DeviceUpdate;
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
 * Data Access Object (DAO) for listing firmware images.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing firmware images.")
public class FirmwareImageListDao extends AbstractModelListDao<FirmwareImage, FirmwareImageListOptions>
                                  implements ModelListDao<FirmwareImage, FirmwareImageListOptions> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public FirmwareImageListDao() throws MbedCloudException {
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
    public FirmwareImageListDao(ApiClientWrapper client) throws MbedCloudException {
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
    public FirmwareImageListDao(ConnectionOptions options) throws MbedCloudException {
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
    public FirmwareImageListDao(SdkContext sdkContext) throws MbedCloudException {
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
    public FirmwareImageListDao clone() {
        try {
            return new FirmwareImageListDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                         : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * a firmware image dao class.
     * 
     * @return a firmware image dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<FirmwareImageDao> getModelDaoClass() {
        return FirmwareImageDao.class;
    }

    /**
     * a firmware image dao.
     * 
     * @return a firmware image dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @Internal
    @SuppressWarnings({ "unchecked", "resource" })
    public FirmwareImageDao getNewModelDao() throws MbedCloudException {
        return new FirmwareImageDao().configureAndGet(getModuleOrThrow());
    }

    /**
     * a firmware image list options.
     * 
     * @return a firmware image list options
     */
    @Override
    @Internal
    protected FirmwareImageListOptions instantiateListOptions() {
        return new FirmwareImageListOptions();
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
        return new DeviceUpdate(client);
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
        return new DeviceUpdate(options);
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
        return new DeviceUpdate(context);
    }

    /**
     * Lists firmware images matching filter options.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.DeviceUpdate#listFirmwareImages(com.arm.mbed.cloud.sdk.deviceupdate.model.FirmwareImageListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of firmware images
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    protected ListResponse<FirmwareImage> requestOnePage(FirmwareImageListOptions options) throws MbedCloudException {
        return ((DeviceUpdate) getModuleOrThrow()).listFirmwareImages(options);
    }
}