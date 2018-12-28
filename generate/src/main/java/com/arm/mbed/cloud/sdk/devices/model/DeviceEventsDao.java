// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import com.arm.mbed.cloud.sdk.Devices;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.ReadDao;
import java.lang.Override;
import java.lang.String;

/**
 * Data Access Object (DAO) for device events.
 * <p>
 * @see <a  href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access Object</a> */
@Preamble(
    description = "Data Access Object (DAO) for device events."
)
public class DeviceEventsDao extends AbstractModelDao<DeviceEvents> implements ReadDao<DeviceEvents> {
  /**
   * Constructor.
   */
  public DeviceEventsDao() throws MbedCloudException {
    super();
  }

  /**
   * Gets a device events.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.DeviceEvents#getDeviceEvents(String)}
   * @param arg0 null
   */
  @Override
  public void read(@Nullable @Nullable String arg0) throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.getDeviceEvents(arg0));
  }

  /**
   * Gets a device events.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.DeviceEvents#getDeviceEvents(DeviceEvents)}
   */
  @Override
  public void read() throws MbedCloudException {
    checkDaoConfiguration();
    setModel(module.getDeviceEvents(getModel()));
  }

  /**
   * Instantiates modules.
   * @param client an api client wrapper.
   * @return instantiated module
   */
  @Override
  @Internal
  protected SdkContext instantiateModule(ApiClientWrapper client) {
    return new Devices(client);
  }

  /**
   * Instantiates modules.
   * @param context an sdk context.
   * @return instantiated module
   */
  @Override
  @Internal
  protected SdkContext instantiateModule(SdkContext context) {
    return new Devices(context);
  }

  /**
   * Instantiates modules.
   * @param options a connection options.
   * @return instantiated module
   */
  @Override
  @Internal
  protected SdkContext instantiateModule(ConnectionOptions options) {
    return new Devices(options);
  }

  /**
   * Instantiates model.
   * @return instantiated model
   */
  @Override
  @Internal
  protected DeviceEvents instantiateModel() {
    return new DeviceEvents();
  }
}
