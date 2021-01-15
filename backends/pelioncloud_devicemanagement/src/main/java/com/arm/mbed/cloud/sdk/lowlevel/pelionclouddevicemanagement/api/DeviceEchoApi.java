package com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api;

import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.EchoDevice;

public interface DeviceEchoApi {
    /**
     * Delete the Device Echo object. Calling this API removes your application data and device from the Device Echo
     * service. You can still find the device using &#39;GET /v3/devices/{id}&#39; from the Device Directory API. For
     * privacy reasons, you might need to delete device data that contains personal information about the device owner
     * or user. Private information is stored by the application; Pelion Device Management Client does not provide or
     * store any private data. **Note:** If the device is able to connect, its data will reappear in Echo the next time
     * the device sends that information to the service. To ensure data is permanently removed, suspend the device first
     * by calling &#39;POST /v3/devices/{id}/suspend&#39;. **Example:** &#x60;&#x60;&#x60; curl -X DELETE
     * https://api.us-east-1.mbedcloud.com/v3/devices/{device-id}/echo -H &#39;Authorization: Bearer
     * &lt;access_key&gt;&#39; &#x60;&#x60;&#x60;
     * 
     * @param deviceId
     *            The device ID generated by Device Management. (required)
     * @return Call&lt;Void&gt;
     */
    @DELETE("v3/devices/{device-id}/echo")
    Call<Void> deleteDeviceEchoObject(@retrofit2.http.Path(value = "device-id", encoded = true) String deviceId);

    /**
     * Get the Device Echo object. Retrieve the Device Echo object, which represents the last known state of the device.
     * The state includes the resources and their reported values with the desired state of the device. Auto-observable
     * and subscribed resources are stored as the reported state of the device. To change the desired state, issue write
     * commands with &#x60;/v2/device-requests/{device-id}&#x60;. **Example:** &#x60;&#x60;&#x60; curl -X GET
     * https://api.us-east-1.mbedcloud.com/v3/devices/{device-id}/echo -H &#39;Authorization: Bearer
     * &lt;access_key&gt;&#39; &#x60;&#x60;&#x60;
     * 
     * @param deviceId
     *            The device ID generated by Device Management. (required)
     * @return Call&lt;EchoDevice&gt;
     */
    @GET("v3/devices/{device-id}/echo")
    Call<EchoDevice> getDeviceEchoObject(@retrofit2.http.Path(value = "device-id", encoded = true) String deviceId);

}
