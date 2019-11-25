// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import com.arm.mbed.cloud.sdk.Devices;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.CrudDao;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.common.listing.Paginator;

/**
 * Data Access Object (DAO) for device groups.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for device groups.")
public class DeviceGroupDao extends AbstractModelDao<DeviceGroup> implements CrudDao<DeviceGroup> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeviceGroupDao() throws MbedCloudException {
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
    public DeviceGroupDao(ApiClientWrapper client) throws MbedCloudException {
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
    public DeviceGroupDao(ConnectionOptions options) throws MbedCloudException {
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
    public DeviceGroupDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Add a device to a group.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#addDevice(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void addDevice() throws MbedCloudException {
        addDevice(getModel());
    }

    /**
     * Add a device to a group.
     * 
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#addDevice(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceGroup
     *            a device group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void addDevice(@NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        ((Devices) getModuleOrThrow()).addDevice(deviceGroup);
    }

    /**
     * Add a device to a group.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#addDevice(String, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceId
     *            a string
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void addDevice(@Nullable String deviceId) throws MbedCloudException {
        addDevice(deviceId, getModel());
    }

    /**
     * Add a device to a group.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#addDevice(String, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceId
     *            a string
     * @param deviceGroup
     *            a device group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void addDevice(@Nullable String deviceId, @NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        ((Devices) getModuleOrThrow()).addDevice(deviceId, deviceGroup);
    }

    /**
     * Add a device to a group.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#addDevice(String, String, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceId
     *            a string
     * @param id
     *            The ID of the group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void addDevice(@Nullable String deviceId, @NonNull String id) throws MbedCloudException {
        addDevice(deviceId, id, getModel());
    }

    /**
     * Add a device to a group.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#addDevice(String, String, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceId
     *            a string
     * @param id
     *            The ID of the group.
     * @param deviceGroup
     *            a device group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void addDevice(@Nullable String deviceId, @NonNull String id,
                          @NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        ((Devices) getModuleOrThrow()).addDevice(deviceId, id, deviceGroup);
    }

    /**
     * Creates a {@link Paginator} for the list of devices matching filter options.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#allDevices(com.arm.mbed.cloud.sdk.devices.model.DeviceListOptions, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param options
     *            list options.
     * @return paginator over the list of devices
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<Device> allDevices(@Nullable DeviceListOptions options) throws MbedCloudException {
        return allDevices(options, getModel());
    }

    /**
     * Creates a {@link Paginator} for the list of devices matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#allDevices(com.arm.mbed.cloud.sdk.devices.model.DeviceListOptions, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param options
     *            list options.
     * @param deviceGroup
     *            a device group.
     * @return paginator over the list of devices
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<Device> allDevices(@Nullable DeviceListOptions options,
                                        @NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        return ((Devices) getModuleOrThrow()).allDevices(options, deviceGroup);
    }

    /**
     * Creates a {@link Paginator} for the list of devices matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#allDevices(String, com.arm.mbed.cloud.sdk.devices.model.DeviceListOptions)}
     * 
     * @param id
     *            a string
     * @param options
     *            list options.
     * @return paginator over the list of devices
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<Device> allDevices(@NonNull String id,
                                        @Nullable DeviceListOptions options) throws MbedCloudException {
        return ((Devices) getModuleOrThrow()).allDevices(id, options);
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
    public DeviceGroupDao clone() {
        try {
            return new DeviceGroupDao().configureAndGet(getModuleOrThrow() == null ? null : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds a device group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#create(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @return an added device group
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceGroup create() throws MbedCloudException {
        return create(getModel());
    }

    /**
     * Adds a device group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#createDeviceGroup(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param group
     *            a device group.
     * @return an added device group
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceGroup create(@NonNull DeviceGroup group) throws MbedCloudException {
        return setAndGetModel(((Devices) getModuleOrThrow()).createDeviceGroup(group));
    }

    /**
     * Deletes a device group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#delete(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        delete(getModel());
    }

    /**
     * Deletes a device group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#deleteDeviceGroup(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceGroup
     *            a device group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        ((Devices) getModuleOrThrow()).deleteDeviceGroup(deviceGroup);
    }

    /**
     * Deletes a device group.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#deleteDeviceGroup(String)}
     * 
     * @param id
     *            The ID of the group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Devices) getModuleOrThrow()).deleteDeviceGroup(id);
    }

    /**
     * Get a page of devices.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#devices(com.arm.mbed.cloud.sdk.devices.model.DeviceListOptions, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param options
     *            list options.
     * @return the list of devices corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<Device> devices(@Nullable DeviceListOptions options) throws MbedCloudException {
        return devices(options, getModel());
    }

    /**
     * Get a page of devices.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#devices(com.arm.mbed.cloud.sdk.devices.model.DeviceListOptions, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param options
     *            list options.
     * @param deviceGroup
     *            a device group.
     * @return the list of devices corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<Device> devices(@Nullable DeviceListOptions options,
                                        @NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        return ((Devices) getModuleOrThrow()).devices(options, deviceGroup);
    }

    /**
     * Get a page of devices.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#devices(String, com.arm.mbed.cloud.sdk.devices.model.DeviceListOptions)}
     * 
     * @param id
     *            a string
     * @param options
     *            list options.
     * @return the list of devices corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<Device> devices(@NonNull String id,
                                        @Nullable DeviceListOptions options) throws MbedCloudException {
        return ((Devices) getModuleOrThrow()).devices(id, options);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected DeviceGroup instantiateModel() {
        return new DeviceGroup();
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
     * Gets a device group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#read(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceGroup read() throws MbedCloudException {
        return read(getModel());
    }

    /**
     * Gets a device group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#readDeviceGroup(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceGroup
     *            a device group.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeviceGroup read(@NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        return setAndGetModel(((Devices) getModuleOrThrow()).readDeviceGroup(deviceGroup));
    }

    /**
     * Gets a device group.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#readDeviceGroup(String)}
     * 
     * @param id
     *            The group ID.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceGroup read(@NonNull String id) throws MbedCloudException {
        return setAndGetModel(((Devices) getModuleOrThrow()).readDeviceGroup(id));
    }

    /**
     * Remove a device from a group.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#removeDevice(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void removeDevice() throws MbedCloudException {
        removeDevice(getModel());
    }

    /**
     * Remove a device from a group.
     * 
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#removeDevice(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceGroup
     *            a device group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void removeDevice(@NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        ((Devices) getModuleOrThrow()).removeDevice(deviceGroup);
    }

    /**
     * Remove a device from a group.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#removeDevice(String, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceId
     *            a string
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void removeDevice(@Nullable String deviceId) throws MbedCloudException {
        removeDevice(deviceId, getModel());
    }

    /**
     * Remove a device from a group.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#removeDevice(String, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceId
     *            a string
     * @param deviceGroup
     *            a device group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void removeDevice(@Nullable String deviceId, @NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        ((Devices) getModuleOrThrow()).removeDevice(deviceId, deviceGroup);
    }

    /**
     * Remove a device from a group.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#removeDevice(String, String, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceId
     *            a string
     * @param id
     *            The ID of the group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void removeDevice(@Nullable String deviceId, @NonNull String id) throws MbedCloudException {
        removeDevice(deviceId, id, getModel());
    }

    /**
     * Remove a device from a group.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#removeDevice(String, String, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceId
     *            a string
     * @param id
     *            The ID of the group.
     * @param deviceGroup
     *            a device group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void removeDevice(@Nullable String deviceId, @NonNull String id,
                             @NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        ((Devices) getModuleOrThrow()).removeDevice(deviceId, id, deviceGroup);
    }

    /**
     * Modifies a device group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#update(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceGroup update() throws MbedCloudException {
        return update(getModel());
    }

    /**
     * Modifies a device group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#updateDeviceGroup(com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param deviceGroup
     *            a device group.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceGroup update(@NonNull DeviceGroup deviceGroup) throws MbedCloudException {
        return setAndGetModel(((Devices) getModuleOrThrow()).updateDeviceGroup(deviceGroup));
    }

    /**
     * Modifies a device group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao#update(String, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param id
     *            The group ID.
     * @return an updated device group
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeviceGroup update(@NonNull String id) throws MbedCloudException {
        return update(id, getModel());
    }

    /**
     * Modifies a device group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#updateDeviceGroup(String, com.arm.mbed.cloud.sdk.devices.model.DeviceGroup)}
     * 
     * @param id
     *            The group ID.
     * @param group
     *            a device group.
     * @return an updated device group
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeviceGroup update(@NonNull String id, @NonNull DeviceGroup group) throws MbedCloudException {
        return setAndGetModel(((Devices) getModuleOrThrow()).updateDeviceGroup(id, group));
    }
}
