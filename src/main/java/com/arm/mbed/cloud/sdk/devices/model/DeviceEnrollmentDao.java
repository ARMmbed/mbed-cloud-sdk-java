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
     */
    public DeviceEnrollmentDao() throws MbedCloudException {
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
    public DeviceEnrollmentDao clone() {
        try {
            return new DeviceEnrollmentDao().configureAndGet(module == null ? null : module.clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds a device enrollment.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#createDeviceEnrollment(DeviceEnrollment)}
     */
    @Override
    public void create() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Devices) module).createDeviceEnrollment(getModel()));
    }

    /**
     * Adds a device enrollment.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#createDeviceEnrollment(DeviceEnrollment)}
     * 
     * @param enrollmentIdentity
     *            a device enrollment.
     */
    @Override
    public void create(@NonNull DeviceEnrollment enrollmentIdentity) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(enrollmentIdentity);
        create();
    }

    /**
     * Deletes a device enrollment.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#deleteDeviceEnrollment(DeviceEnrollment)}
     */
    @Override
    public void delete() throws MbedCloudException {
        checkDaoConfiguration();
        ((Devices) module).deleteDeviceEnrollment(getModel());
    }

    /**
     * Deletes a device enrollment.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#deleteDeviceEnrollment(DeviceEnrollment)}
     * 
     * @param deviceEnrollment
     *            a device enrollment.
     */
    @Override
    public void delete(@NonNull DeviceEnrollment deviceEnrollment) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(deviceEnrollment);
        delete();
    }

    /**
     * Deletes a device enrollment.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#deleteDeviceEnrollment(String)}
     * 
     * @param id
     *            Enrollment identity.
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        ((Devices) module).deleteDeviceEnrollment(id);
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
     * Gets a device enrollment.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#getDeviceEnrollment(DeviceEnrollment)}
     */
    @Override
    public void read() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Devices) module).getDeviceEnrollment(getModel()));
    }

    /**
     * Gets a device enrollment.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#getDeviceEnrollment(String)}
     * 
     * @param id
     *            Enrollment identity.
     */
    @Override
    public void read(@NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Devices) module).getDeviceEnrollment(id));
    }
}
