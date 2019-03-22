// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
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
import com.arm.mbed.cloud.sdk.common.dao.DeleteDao;
import com.arm.mbed.cloud.sdk.common.dao.ReadDao;

/**
 * Data Access Object (DAO) for device enrollments.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for device enrollments.")
public class DeviceEnrollmentDao extends AbstractModelDao<DeviceEnrollment> implements CreateDao<DeviceEnrollment>,
                                 DeleteDao<DeviceEnrollment>, ReadDao<DeviceEnrollment> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeviceEnrollmentDao() throws MbedCloudException {
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
    public DeviceEnrollmentDao(ApiClientWrapper client) throws MbedCloudException {
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
    public DeviceEnrollmentDao(ConnectionOptions options) throws MbedCloudException {
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
    public DeviceEnrollmentDao(SdkContext sdkContext) throws MbedCloudException {
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
    public DeviceEnrollmentDao clone() {
        try {
            return new DeviceEnrollmentDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                        : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds a device enrollment.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#createDeviceEnrollment(com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollment)}
     * 
     * @return an added device enrollment
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceEnrollment create() throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).createDeviceEnrollment(getModel()));
        return getModel();
    }

    /**
     * Adds a device enrollment.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#createDeviceEnrollment(com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollment)}
     * 
     * @param enrollmentIdentity
     *            a device enrollment.
     * @return an added device enrollment
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceEnrollment create(@NonNull DeviceEnrollment enrollmentIdentity) throws MbedCloudException {
        setModel(enrollmentIdentity);
        return create();
    }

    /**
     * Deletes a device enrollment.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#deleteDeviceEnrollment(com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollment)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Devices) getModuleOrThrow()).deleteDeviceEnrollment(getModel());
    }

    /**
     * Deletes a device enrollment.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#deleteDeviceEnrollment(com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollment)}
     * 
     * @param deviceEnrollment
     *            a device enrollment.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull DeviceEnrollment deviceEnrollment) throws MbedCloudException {
        setModel(deviceEnrollment);
        delete();
    }

    /**
     * Deletes a device enrollment.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#deleteDeviceEnrollment(String)}
     * 
     * @param id
     *            Enrollment identity.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Devices) getModuleOrThrow()).deleteDeviceEnrollment(id);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected DeviceEnrollment instantiateModel() {
        return new DeviceEnrollment();
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
     * Gets a device enrollment.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#readDeviceEnrollment(com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollment)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceEnrollment read() throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).readDeviceEnrollment(getModel()));
        return getModel();
    }

    /**
     * Gets a device enrollment.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#readDeviceEnrollment(String)}
     * 
     * @param id
     *            Enrollment identity.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceEnrollment read(@NonNull String id) throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).readDeviceEnrollment(id));
        return getModel();
    }
}