// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [DeviceEnrollmentBulkCreateDao]
package com.arm.mbed.cloud.sdk.devices.model;

import com.arm.mbed.cloud.sdk.Devices;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.CreateDao;
import com.arm.mbed.cloud.sdk.common.dao.ReadDao;
import com.arm.mbed.cloud.sdk.common.model.DataFile;

/**
 * Data Access Object (DAO) for device enrollment bulk creates.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for device enrollment bulk creates.")
public abstract class AbstractDeviceEnrollmentBulkCreateDao extends AbstractModelDao<DeviceEnrollmentBulkCreate>
                                                            implements CreateDao<DeviceEnrollmentBulkCreate>,
                                                            ReadDao<DeviceEnrollmentBulkCreate> {
    /**
     * Constructor.
     */
    public AbstractDeviceEnrollmentBulkCreateDao() throws MbedCloudException {
        super();
    }

    /**
     * Adds a device enrollment bulk create.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#createDeviceEnrollmentBulkCreate(com.arm.mbed.cloud.sdk.common.model.DataFile)}
     * 
     * @param enrollmentIdentities
     *            The `CSV` file containing the enrollment IDs. The maximum file size is 10MB.
     * @return an added device enrollment bulk create
     */
    public DeviceEnrollmentBulkCreate create(@NonNull DataFile enrollmentIdentities) throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).createDeviceEnrollmentBulkCreate(enrollmentIdentities));
        return getModel();
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected DeviceEnrollmentBulkCreate instantiateModel() {
        return new DeviceEnrollmentBulkCreate();
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
        return new Devices(client);
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
        return new Devices(options);
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
        return new Devices(context);
    }

    /**
     * Gets a device enrollment bulk create.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#readDeviceEnrollmentBulkCreate(com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreate)}
     * 
     * @return something
     */
    @Override
    public DeviceEnrollmentBulkCreate read() throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).readDeviceEnrollmentBulkCreate(getModel()));
        return getModel();
    }

    /**
     * Gets a device enrollment bulk create.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#readDeviceEnrollmentBulkCreate(String)}
     * 
     * @param id
     *            Bulk ID.
     * @return something
     */
    @Override
    public DeviceEnrollmentBulkCreate read(@NonNull String id) throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).readDeviceEnrollmentBulkCreate(id));
        return getModel();
    }
}
