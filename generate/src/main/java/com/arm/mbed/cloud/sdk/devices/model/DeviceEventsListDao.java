// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Fri Dec 28 16:23:54 GMT 2018. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.devices.model;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import java.lang.Override;

/**
 * Data Access Object (DAO) for listing device events.
 * <p>
 * @see <a  href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access Object</a> */
@Preamble(
    description = "Data Access Object (DAO) for listing device events."
)
public class DeviceEventsListDao extends AbstractDeviceEventsListDao {
  /**
   * Constructor.
   */
  public DeviceEventsListDao() throws MbedCloudException {
    super();
  }

  /**
   * Lists device events matching filter options.
   * <p>
   * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.DeviceEvents#listDeviceEventss(Integer,String,String,String,String,DeviceEventsListOptions)}
   * @param options list options.
   * @return one page of device events
   */
  @Override
  protected ListResponse<DeviceEvents> requestOnePage(DeviceEventsListOptions options) throws
      MbedCloudException, NotImplementedException {
    // TODO Auto-generated method stub.;
    throw new NotImplementedException();
    checkDaoConfiguration();
    return module.listDeviceEventss(null, null, null, null, null, options);
  }
}
