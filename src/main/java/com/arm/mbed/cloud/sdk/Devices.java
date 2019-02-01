// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk;

import com.arm.mbed.cloud.sdk.annotations.API;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Module;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.AbstractModule;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.CloudCaller;
import com.arm.mbed.cloud.sdk.common.CloudRequest;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.adapters.DataFileAdapter;
import com.arm.mbed.cloud.sdk.common.listing.ListOptions;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.common.listing.PageRequester;
import com.arm.mbed.cloud.sdk.common.listing.Paginator;
import com.arm.mbed.cloud.sdk.common.model.DataFile;
import com.arm.mbed.cloud.sdk.devices.adapters.DeviceAdapter;
import com.arm.mbed.cloud.sdk.devices.adapters.DeviceEnrollmentAdapter;
import com.arm.mbed.cloud.sdk.devices.adapters.DeviceEnrollmentBulkCreateAdapter;
import com.arm.mbed.cloud.sdk.devices.adapters.DeviceEnrollmentBulkDeleteAdapter;
import com.arm.mbed.cloud.sdk.devices.adapters.DeviceEventsAdapter;
import com.arm.mbed.cloud.sdk.devices.model.Device;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollment;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreate;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDelete;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentListOptions;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEvents;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEventsListOptions;
import com.arm.mbed.cloud.sdk.devices.model.DeviceListOptions;
import com.arm.mbed.cloud.sdk.devices.model.DevicesEndpoints;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BulkResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.DeviceData;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.DeviceEventData;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.DeviceEventPage;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.DevicePage;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.EnrollmentIdentities;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.EnrollmentIdentity;
import com.arm.mbed.cloud.sdk.security.adapters.CertificateEnrollmentAdapter;
import com.arm.mbed.cloud.sdk.security.model.CertificateEnrollment;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import retrofit2.Call;

/**
 * Specifies Devices APIs.
 * <p>
 *  API definitions exposing functionality for dealing with devices */
@Preamble(
    description = "Specifies Devices APIs."
)
@Internal
@Module
public class Devices extends AbstractModule {
  /**
   * Parameter name. */
  @Internal
  private static final String TAG_DEVICE = "device";

  /**
   * Parameter name. */
  @Internal
  private static final String TAG_ID = "id";

  /**
   * Parameter name. */
  @Internal
  private static final String TAG_CERTIFICATE_NAME = "certificateName";

  /**
   * Parameter name. */
  @Internal
  private static final String TAG_ENROLLMENT_IDENTITY = "enrollmentIdentity";

  /**
   * Parameter name. */
  @Internal
  private static final String TAG_DEVICE_ENROLLMENT = "deviceEnrollment";

  /**
   * Parameter name. */
  @Internal
  private static final String TAG_ENROLLMENT_IDENTITIES = "enrollmentIdentities";

  /**
   * Parameter name. */
  @Internal
  private static final String TAG_DEVICE_ENROLLMENT_BULK_CREATE = "deviceEnrollmentBulkCreate";

  /**
   * Parameter name. */
  @Internal
  private static final String TAG_DEVICE_ENROLLMENT_BULK_DELETE = "deviceEnrollmentBulkDelete";

  /**
   * Parameter name. */
  @Internal
  private static final String TAG_DEVICE_EVENTS = "deviceEvents";

  /**
   * module endpoints. */
  @Internal
  private final DevicesEndpoints endpoints;

  /**
   * Constructor.
   * @param client Cloud client @see {@link ApiClientWrapper}.
   */
  public Devices(ApiClientWrapper client) {
    super(client);
    this.endpoints = new DevicesEndpoints(this.serviceRegistry);
  }

  /**
   * Constructor.
   * @param options connection options @see {@link ConnectionOptions}.
   */
  public Devices(ConnectionOptions options) {
    super(options);
    this.endpoints = new DevicesEndpoints(this.serviceRegistry);
  }

  /**
   * Constructor.
   * @param context SDK context @see {@link SdkContext}.
   */
  public Devices(SdkContext context) {
    super(context);
    this.endpoints = new DevicesEndpoints(this.serviceRegistry);
  }

  /**
   * Clones this instance.
   * <p>
   * @see java.lang.Object#clone()
   * @return a cloned instance
   */
  @Override
  public Devices clone() {
    return new Devices(this);
  }

  /**
   * Adds a device.
   * <p>
   * Create a new device.
   * 
   * @param device a device.
   * @return an added device
   */
  @API
  @Nullable
  public Device createDevice(@NonNull Device device) throws MbedCloudException {
    checkNotNull(device,TAG_DEVICE);
    checkModelValidity(device,TAG_DEVICE);
    final Device finalDevice = device;
    return CloudCaller.call(this, "createDevice()",DeviceAdapter.getMapper(),new CloudRequest.CloudCall<DeviceData>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<DeviceData> call() {
        return endpoints.getDefaultApi().deviceCreate(DeviceAdapter.reverseMapAddRequest(finalDevice));
      }
    } );
  }

  /**
   * Adds a device enrollment.
   * <p>
   * When the device connects to the bootstrap server and provides the enrollment ID, it will be assigned to your account.
   * [br]
   * **Example usage:**
   * ```
   * curl -X POST \
   * -H 'Authorization: Bearer [valid access token]' \
   * -H 'content-type: application/json' \
   * https://api.us-east-1.mbedcloud.com/v3/device-enrollments \
   * -d '{"enrollment_identity": "A-35:e7:72:8a:07:50:3b:3d:75:96:57:52:72:41:0d:78:cc:c6:e5:53:48:c6:65:58:5b:fa:af:4d:2d:73:95:c5"}'
   * ```
   * 
   * @param enrollmentIdentity a device enrollment.
   * @return an added device enrollment
   */
  @API
  @Nullable
  public DeviceEnrollment createDeviceEnrollment(@NonNull DeviceEnrollment enrollmentIdentity)
      throws MbedCloudException {
    checkNotNull(enrollmentIdentity,TAG_ENROLLMENT_IDENTITY);
    checkModelValidity(enrollmentIdentity,TAG_ENROLLMENT_IDENTITY);
    final DeviceEnrollment finalEnrollmentIdentity = enrollmentIdentity;
    return CloudCaller.call(this, "createDeviceEnrollment()",DeviceEnrollmentAdapter.getMapper(),new CloudRequest.CloudCall<EnrollmentIdentity>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<EnrollmentIdentity> call() {
        return endpoints.getPublicApiApi().createDeviceEnrollment(DeviceEnrollmentAdapter.reverseMapAddRequest(finalEnrollmentIdentity));
      }
    } );
  }

  /**
   * Adds a device enrollment bulk create.
   * <p>
   * With bulk upload, you can upload a `CSV` file containing a number of enrollment IDs.
   * 
   * **Example usage:**
   * ```
   * curl -X POST \
   * -H 'Authorization: Bearer [valid access token]' \
   * -F 'enrollment_identities=@/path/to/enrollments/enrollments.csv' \
   * https://api.us-east-1.mbedcloud.com/v3/device-enrollments-bulk-uploads
   * 
   * ```
   * **The validation rules for an CSV file.**
   * 1. The first line in the uploaded CSV file is assumed to be the header and is ignored.
   * 1. Each line can contain comma-separated values, where the first value is always assumed to be the Enrollment ID. Everything after the first comma is ignored.
   * 1. Valid enrollments begin with A followed by a - and 95 characters in the format as below.
   * 1. Up to one enrollment ID is expected per line. Empty lines are ignored.
   * 1. Trailing comma at the end of the line is optional.
   * 1. Lines are terminated with either a line feed \n, a carriage return \r, or both together \r\n.
   * 1. Leading and trailing whitespace characters (Unicode U+0000 - U+0020) are removed from the identity before validation.
   * 1. Empty identities are ignored.
   * 1. Valid enrollment identities may be enclosed within quotes. Whitespace inside quotes is not trimmed and will fail validation. Empty quotes are also considered to be an invalid enrollment identity.
   * 1. UTF-8 encoding is expected.
   * 
   * 
   * **A valid enrollment file:**
   * ```
   * "Examples of valid identites, notes"
   * "A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:44:71:93:23:22:15:43:23:12",
   * "A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:48:44:71:22:15:43:23:12"
   * A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:48:44:71:22:15:43:23:12
   * A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:24:44:71:22:15:43:23:12, This text is ignored,
   * A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:60:25:48:44:71:22:15:43:23:12       , Whitespace is trimmed before validation
   * "A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:60:25:48:44:71:22:15:43:23:12"       , Whitespace around quotes is also trimmed
   * 
   * ```
   * 
   * **A file containing invalid identities:**
   * ```
   * "A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:44:71:93:23:22:15:43:23:12", First line is ignored
   * A_4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:48:44:71:22:15:43:23:12, Invalid version identifier
   * A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:48:44:71:22:15:43:23:12, Too short identity
   * "", Empty quotes are an invalid identity
   * " A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:44:71:93:23:22:15:43:23:12 ", Whitespace inside quotes is not trimmed causing an error
   * 
   * ```
   * 
   * **An empty file:**
   * ```
   * "Examples of blank lines that are ignored"
   * 
   * ,,
   * , This is also considered to a blank line
   * ```
   * 
   * @param enrollmentIdentities The `CSV` file containing the enrollment IDs. The maximum file size is 10MB.
   * @return an added device enrollment bulk create
   */
  @API
  @Nullable
  public DeviceEnrollmentBulkCreate createDeviceEnrollmentBulkCreate(
      @NonNull DataFile enrollmentIdentities) throws MbedCloudException {
    checkNotNull(enrollmentIdentities,TAG_ENROLLMENT_IDENTITIES);
    checkModelValidity(enrollmentIdentities,TAG_ENROLLMENT_IDENTITIES);
    final DataFile finalEnrollmentIdentities = enrollmentIdentities;
    return CloudCaller.call(this, "createDeviceEnrollmentBulkCreate()",DeviceEnrollmentBulkCreateAdapter.getMapper(),new CloudRequest.CloudCall<BulkResponse>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<BulkResponse> call() {
        return endpoints.getPublicApiApi().createBulkDeviceEnrollment(DataFileAdapter.reverseMap("enrollment_identities", finalEnrollmentIdentities));
      }
    } );
  }

  /**
   * Deletes a device.
   * <p>
   * Similar to {@link #deleteDevice(String)}
   * @param device a device.
   */
  @API
  public void deleteDevice(@NonNull Device device) throws MbedCloudException {
    checkNotNull(device,TAG_DEVICE);
     deleteDevice(device.getId());
  }

  /**
   * Deletes a device.
   * <p>
   * Delete device. Only available for devices with a developer certificate. Attempts to delete a device with a production certicate will return a 400 response.
   * 
   * @param id null
   */
  @API
  public void deleteDevice(@NonNull String id) throws MbedCloudException {
    checkNotNull(id,TAG_ID);
    final String finalId = id;
    CloudCaller.call(this, "deleteDevice()",null,new CloudRequest.CloudCall<Void>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<Void> call() {
        return endpoints.getDefaultApi().deviceDestroy(finalId);
      }
    } );
  }

  /**
   * Deletes a device enrollment.
   * <p>
   * Similar to {@link #deleteDeviceEnrollment(String)}
   * @param deviceEnrollment a device enrollment.
   */
  @API
  public void deleteDeviceEnrollment(@NonNull DeviceEnrollment deviceEnrollment) throws
      MbedCloudException {
    checkNotNull(deviceEnrollment,TAG_DEVICE_ENROLLMENT);
     deleteDeviceEnrollment(deviceEnrollment.getId());
  }

  /**
   * Deletes a device enrollment.
   * <p>
   * To free a device from your account you can delete the enrollment claim. To bypass the device ownership, you need to delete the enrollment and do a factory reset for the device. For more information, s
   * ee [Transferring the ownership using First-to-Claim](/docs/current/connecting/device-ownership-first-to-claim-by-enrollment-list.html).
   * [br]
   * **Example usage:**
   * ```
   * curl -X DELETE \
   * -H 'Authorization: Bearer [valid access token]' \
   * https://api.us-east-1.mbedcloud.com/v3/device-enrollments/{id}
   * ```
   * 
   * @param id Enrollment identity.
   */
  @API
  public void deleteDeviceEnrollment(@NonNull String id) throws MbedCloudException {
    checkNotNull(id,TAG_ID);
    final String finalId = id;
    CloudCaller.call(this, "deleteDeviceEnrollment()",null,new CloudRequest.CloudCall<Void>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<Void> call() {
        return endpoints.getPublicApiApi().deleteDeviceEnrollment(finalId);
      }
    } );
  }

  /**
   * Deletes a device enrollment bulk delete.
   * <p>
   * With bulk delete, you can upload a `CSV` file containing a number of enrollment IDs to be deleted.
   * 
   * **Example usage:**
   * ```
   * curl -X POST \
   * -H 'Authorization: Bearer [valid access token]' \
   * -F 'enrollment_identities=@/path/to/enrollments/enrollments.csv' \
   * https://api.us-east-1.mbedcloud.com/v3/device-enrollments-bulk-deletes
   * 
   * ```
   * **The validation rules for an CSV file.**
   * 1. The first line in the uploaded CSV file is assumed to be the header and is ignored.
   * 1. Each line can contain comma-separated values, where the first value is always assumed to be the Enrollment ID. Everything after the first comma is ignored.
   * 1. Valid enrollments begin with A followed by a - and 95 characters in the format as below.
   * 1. Up to one enrollment ID is expected per line. Empty lines are ignored.
   * 1. Trailing comma at the end of the line is optional.
   * 1. Lines are terminated with either a line feed \n, a carriage return \r, or both together \r\n.
   * 1. Leading and trailing whitespace characters (Unicode U+0000 - U+0020) are removed from the identity before validation.
   * 1. Empty identities are ignored.
   * 1. Valid enrollment identities may be enclosed within quotes. Whitespace inside quotes is not trimmed and will fail validation. Empty quotes are also considered to be an invalid enrollment identity.
   * 1. UTF-8 encoding is expected.
   * 
   * 
   * **A valid enrollment file:**
   * ```
   * "Examples of valid identites, notes"
   * "A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:44:71:93:23:22:15:43:23:12",
   * "A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:48:44:71:22:15:43:23:12"
   * A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:48:44:71:22:15:43:23:12
   * A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:24:44:71:22:15:43:23:12, This text is ignored,
   * A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:60:25:48:44:71:22:15:43:23:12       , Whitespace is trimmed before validation
   * "A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:60:25:48:44:71:22:15:43:23:12"       , Whitespace around quotes is also trimmed
   * 
   * ```
   * 
   * **A file containing invalid identities:**
   * ```
   * "A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:44:71:93:23:22:15:43:23:12", First line is ignored
   * A_4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:48:44:71:22:15:43:23:12, Invalid version identifier
   * A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:48:44:71:22:15:43:23:12, Too short identity
   * "", Empty quotes are an invalid identity
   * " A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:44:71:93:23:22:15:43:23:12 ", Whitespace inside quotes is not trimmed causing an error
   * 
   * ```
   * 
   * **An empty file:**
   * ```
   * "Examples of blank lines that are ignored"
   * 
   * ,,
   * , This is also considered to a blank line
   * ```
   * 
   * @param enrollmentIdentities The `CSV` file containing the enrollment IDs. The maximum file size is 10MB.
   * @return something
   */
  @API
  @Nullable
  public DeviceEnrollmentBulkDelete deleteDeviceEnrollmentBulkDelete(
      @NonNull DataFile enrollmentIdentities) throws MbedCloudException {
    checkNotNull(enrollmentIdentities,TAG_ENROLLMENT_IDENTITIES);
    checkModelValidity(enrollmentIdentities,TAG_ENROLLMENT_IDENTITIES);
    final DataFile finalEnrollmentIdentities = enrollmentIdentities;
    return CloudCaller.call(this, "deleteDeviceEnrollmentBulkDelete()",DeviceEnrollmentBulkDeleteAdapter.getMapper(),new CloudRequest.CloudCall<BulkResponse>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<BulkResponse> call() {
        return endpoints.getPublicApiApi().deleteBulkDeviceEnrollment(DataFileAdapter.reverseMap("enrollment_identities", finalEnrollmentIdentities));
      }
    } );
  }

  /**
   * Gets a device.
   * <p>
   * Similar to {@link #getDevice(String)}
   * @param device a device.
   * @return something
   */
  @API
  @Nullable
  public Device getDevice(@NonNull Device device) throws MbedCloudException {
    checkNotNull(device,TAG_DEVICE);
    return  getDevice(device.getId());
  }

  /**
   * Gets a device.
   * <p>
   * Retrieve information about a specific device.
   * 
   * @param id The ID of the device. The device ID is used across all Device Management APIs.
   * @return something
   */
  @API
  @Nullable
  public Device getDevice(@NonNull String id) throws MbedCloudException {
    checkNotNull(id,TAG_ID);
    final String finalId = id;
    return CloudCaller.call(this, "getDevice()",DeviceAdapter.getMapper(),new CloudRequest.CloudCall<DeviceData>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<DeviceData> call() {
        return endpoints.getDefaultApi().deviceRetrieve(finalId);
      }
    } );
  }

  /**
   * Gets a device enrollment.
   * <p>
   * Similar to {@link #getDeviceEnrollment(String)}
   * @param deviceEnrollment a device enrollment.
   * @return something
   */
  @API
  @Nullable
  public DeviceEnrollment getDeviceEnrollment(@NonNull DeviceEnrollment deviceEnrollment) throws
      MbedCloudException {
    checkNotNull(deviceEnrollment,TAG_DEVICE_ENROLLMENT);
    return  getDeviceEnrollment(deviceEnrollment.getId());
  }

  /**
   * Gets a device enrollment.
   * <p>
   * To check the enrollment info in detail, for example date of claim and expiration date.
   * **Example usage:**
   * ```
   * curl -X GET \
   * -H 'Authorization: Bearer [valid access token]' \
   * https://api.us-east-1.mbedcloud.com/v3/device-enrollments/{id}
   * ```
   * 
   * @param id Enrollment identity.
   * @return something
   */
  @API
  @Nullable
  public DeviceEnrollment getDeviceEnrollment(@NonNull String id) throws MbedCloudException {
    checkNotNull(id,TAG_ID);
    final String finalId = id;
    return CloudCaller.call(this, "getDeviceEnrollment()",DeviceEnrollmentAdapter.getMapper(),new CloudRequest.CloudCall<EnrollmentIdentity>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<EnrollmentIdentity> call() {
        return endpoints.getPublicApiApi().getDeviceEnrollment(finalId);
      }
    } );
  }

  /**
   * Gets a device enrollment bulk create.
   * <p>
   * Similar to {@link #getDeviceEnrollmentBulkCreate(String)}
   * @param deviceEnrollmentBulkCreate a device enrollment bulk create.
   * @return something
   */
  @API
  @Nullable
  public DeviceEnrollmentBulkCreate getDeviceEnrollmentBulkCreate(
      @NonNull DeviceEnrollmentBulkCreate deviceEnrollmentBulkCreate) throws MbedCloudException {
    checkNotNull(deviceEnrollmentBulkCreate,TAG_DEVICE_ENROLLMENT_BULK_CREATE);
    return  getDeviceEnrollmentBulkCreate(deviceEnrollmentBulkCreate.getId());
  }

  /**
   * Gets a device enrollment bulk create.
   * <p>
   * Provides information on bulk upload for the given ID. For example, the bulk status and the number of processed enrollment identities. Also links to the bulk upload reports are provided.
   * **Report file format:**
   * The report files have a header line and the value are separated by commas. The lines are delimited by a line break (CRLF). The report file is compliant with IETF Informal CSV common format [RFC 4180](
   * https://tools.ietf.org/html/rfc4180).
   * An example of a full report file:
   * ```
   * "entity__id","entity__created_at","error__code","error__type","error__message","error__fields"
   * "A-F9:AA:AA:AA:DE:31:C7:30:72:55:27:AE:8B:E1:1C:6F:42:7D:06:CF:FB:18:6F:59:48:29:B3:98:4B:76:8F:9E","2018-09-07T12:10:58.428Z","","","",""
   * "A-FF:AA:AA:AA:3B:43:EB:D7:C7:30:03:5F:C8:D0:15:91:70:C2:5D:4F:EB:24:E9:3A:BB:D8:3C:FE:20:EA:B1:72","2018-09-07T12:10:58.428Z","","","",""
   * ```
   * An example of an error report file:
   * ```
   * "entity__id","error__code","error__type","error__message","error__fields"
   * "A-F9:AA:AA:AA:DE:31:C7:30:72:55:27:AE:8B:E1:1C:6F:42:7D:06:CF:FB:18:6F:59:48:29:B3:98:4B:76:8F:9E","409","duplicate","Enrollment identity is already claimed in the mbed Cloud.",""
   * "A-FF:AA:AA:AA:3B:43:EB:D7:C7:30:03:5F:C8:D0:15:91:70:C2:5D:4F:EB:24:E9:3A:BB:D8:3C:FE:20:EA:B1:72","409","duplicate","Enrollment identity is already claimed in the mbed Cloud.",""
   * ```
   * **Example usage:**
   * ```
   * curl -X GET \
   * -H 'Authorization: Bearer [valid access token]' \
   * https://api.us-east-1.mbedcloud.com/v3/device-enrollments-bulk-uploads/{id}
   * ```
   * 
   * @param id Bulk ID.
   * @return something
   */
  @API
  @Nullable
  public DeviceEnrollmentBulkCreate getDeviceEnrollmentBulkCreate(@NonNull String id) throws
      MbedCloudException {
    checkNotNull(id,TAG_ID);
    final String finalId = id;
    return CloudCaller.call(this, "getDeviceEnrollmentBulkCreate()",DeviceEnrollmentBulkCreateAdapter.getMapper(),new CloudRequest.CloudCall<BulkResponse>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<BulkResponse> call() {
        return endpoints.getPublicApiApi().getBulkDeviceEnrollment(finalId);
      }
    } );
  }

  /**
   * Gets a device enrollment bulk delete.
   * <p>
   * Similar to {@link #getDeviceEnrollmentBulkDelete(String)}
   * @param deviceEnrollmentBulkDelete a device enrollment bulk delete.
   * @return something
   */
  @API
  @Nullable
  public DeviceEnrollmentBulkDelete getDeviceEnrollmentBulkDelete(
      @NonNull DeviceEnrollmentBulkDelete deviceEnrollmentBulkDelete) throws MbedCloudException {
    checkNotNull(deviceEnrollmentBulkDelete,TAG_DEVICE_ENROLLMENT_BULK_DELETE);
    return  getDeviceEnrollmentBulkDelete(deviceEnrollmentBulkDelete.getId());
  }

  /**
   * Gets a device enrollment bulk delete.
   * <p>
   * Provides information on bulk delete for the given ID. For example, the bulk status and the number of processed enrollment identities. Also links to the bulk delete reports are provided.
   * **Report file format:**
   * The report files have a header line and the value are separated by commas. The lines are delimited by a line break (CRLF). The report file is compliant with IETF Informal CSV common format [RFC 4180](
   * https://tools.ietf.org/html/rfc4180).
   * An example of a full report file:
   * ```
   * "entity__id","entity__deleted_at","error__code","error__type","error__message","error__fields"
   * "A-F9:AA:AA:AA:DE:31:C7:30:72:55:27:AE:8B:E1:1C:6F:42:7D:06:CF:FB:18:6F:59:48:29:B3:98:4B:76:8F:9E","2018-09-07T12:10:58.428Z","","","",""
   * "A-FF:AA:AA:AA:3B:43:EB:D7:C7:30:03:5F:C8:D0:15:91:70:C2:5D:4F:EB:24:E9:3A:BB:D8:3C:FE:20:EA:B1:72","2018-09-07T12:10:58.428Z","","","",""
   * ```
   * An example of an error report file:
   * ```
   * "entity__id","error__code","error__type","error__message","error__fields"
   * "A-F9:AA:AA:AA:DE:31:C7:30:72:55:27:AE:8B:E1:1C:6F:42:7D:06:CF:FB:18:6F:59:48:29:B3:98:4B:76:8F:9E","409","duplicate","Enrollment identity is already claimed in the mbed Cloud.",""
   * "A-FF:AA:AA:AA:3B:43:EB:D7:C7:30:03:5F:C8:D0:15:91:70:C2:5D:4F:EB:24:E9:3A:BB:D8:3C:FE:20:EA:B1:72","409","duplicate","Enrollment identity is already claimed in the mbed Cloud.",""
   * ```
   * **Example usage:**
   * ```
   * curl -X GET \
   * -H 'Authorization: Bearer [valid access token]' \
   * https://api.us-east-1.mbedcloud.com/v3/device-enrollments-bulk-deletes/{id}
   * ```
   * 
   * @param id Bulk ID.
   * @return something
   */
  @API
  @Nullable
  public DeviceEnrollmentBulkDelete getDeviceEnrollmentBulkDelete(@NonNull String id) throws
      MbedCloudException {
    checkNotNull(id,TAG_ID);
    final String finalId = id;
    return CloudCaller.call(this, "getDeviceEnrollmentBulkDelete()",DeviceEnrollmentBulkDeleteAdapter.getMapper(),new CloudRequest.CloudCall<BulkResponse>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<BulkResponse> call() {
        return endpoints.getPublicApiApi().getBulkDeviceEnrollmentDelete(finalId);
      }
    } );
  }

  /**
   * Gets a device events.
   * <p>
   * Similar to {@link #getDeviceEvents(String)}
   * @param deviceEvents a device events.
   * @return something
   */
  @API
  @Nullable
  public DeviceEvents getDeviceEvents(@NonNull DeviceEvents deviceEvents) throws
      MbedCloudException {
    checkNotNull(deviceEvents,TAG_DEVICE_EVENTS);
    return  getDeviceEvents(deviceEvents.getId());
  }

  /**
   * Gets a device events.
   * <p>
   * Retrieve a specific device event.
   * 
   * @param id null
   * @return something
   */
  @API
  @Nullable
  public DeviceEvents getDeviceEvents(@NonNull String id) throws MbedCloudException {
    checkNotNull(id,TAG_ID);
    final String finalId = id;
    return CloudCaller.call(this, "getDeviceEvents()",DeviceEventsAdapter.getMapper(),new CloudRequest.CloudCall<DeviceEventData>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<DeviceEventData> call() {
        return endpoints.getDefaultApi().deviceEventRetrieve(finalId);
      }
    } );
  }

  /**
   * Gets module endpoints.
   * @return endpoints
   */
  public DevicesEndpoints getEndpoints() {
    return endpoints;
  }

  /**
   * Gets module name.
   * @return module name
   */
  @Override
  @Internal
  public String getModuleName() {
    return "Devices";
  }

  /**
   * Creates a {@link Paginator} for the list of device enrollments matching filter options.
   * <p>
   * Gets an iterator over all device enrollments matching filter options.
   * @param options list options.
   * @return paginator over the list of device enrollments
   */
  @API
  @Nullable
  public Paginator<DeviceEnrollment> listAllDeviceEnrollments(
      @Nullable DeviceEnrollmentListOptions options) throws MbedCloudException {
    final DeviceEnrollmentListOptions finalOptions = (options == null)? new DeviceEnrollmentListOptions() : options;
    return new Paginator<DeviceEnrollment>(finalOptions, new PageRequester<DeviceEnrollment>() {
      /**
       * Makes one page request.
       * @param options a list options.
       * @return Corresponding page requester
       */
      @Override
      public ListResponse<DeviceEnrollment> requestNewPage(ListOptions options) throws
          MbedCloudException {
        return listDeviceEnrollments((DeviceEnrollmentListOptions) options);
      }
    });
  }

  /**
   * Creates a {@link Paginator} for the list of device events matching filter options.
   * <p>
   * Gets an iterator over all device events matching filter options.
   * @param options list options.
   * @return paginator over the list of device events
   */
  @API
  @Nullable
  public Paginator<DeviceEvents> listAllDeviceEventss(@Nullable DeviceEventsListOptions options)
      throws MbedCloudException {
    final DeviceEventsListOptions finalOptions = (options == null)? new DeviceEventsListOptions() : options;
    return new Paginator<DeviceEvents>(finalOptions, new PageRequester<DeviceEvents>() {
      /**
       * Makes one page request.
       * @param options a list options.
       * @return Corresponding page requester
       */
      @Override
      public ListResponse<DeviceEvents> requestNewPage(ListOptions options) throws
          MbedCloudException {
        return listDeviceEventss((DeviceEventsListOptions) options);
      }
    });
  }

  /**
   * Creates a {@link Paginator} for the list of devices matching filter options.
   * <p>
   * Gets an iterator over all devices matching filter options.
   * @param options list options.
   * @return paginator over the list of devices
   */
  @API
  @Nullable
  public Paginator<Device> listAllDevices(@Nullable DeviceListOptions options) throws
      MbedCloudException {
    final DeviceListOptions finalOptions = (options == null)? new DeviceListOptions() : options;
    return new Paginator<Device>(finalOptions, new PageRequester<Device>() {
      /**
       * Makes one page request.
       * @param options a list options.
       * @return Corresponding page requester
       */
      @Override
      public ListResponse<Device> requestNewPage(ListOptions options) throws MbedCloudException {
        return listDevices((DeviceListOptions) options);
      }
    });
  }

  /**
   * Lists device enrollments matching filter options.
   * <p>
   * Provides a list of pending and claimed enrollments.
   * **Example usage:**
   * ```
   * curl -X GET \
   * -H 'Authorization: Bearer [valid access token]' \
   * https://api.us-east-1.mbedcloud.com/v3/device-enrollments
   * ```
   * With query parameters:
   * ```
   * curl -X GET \
   * -H 'Authorization: Bearer [valid access token]' \
   * 'https://api.us-east-1.mbedcloud.com/v3/device-enrollments?limit=10'
   * ```
   * 
   * @param options list options.
   * @return the list of device enrollments corresponding to filter options (One page).
   */
  @API
  @Nullable
  public ListResponse<DeviceEnrollment> listDeviceEnrollments(
      @Nullable DeviceEnrollmentListOptions options) throws MbedCloudException {
    final DeviceEnrollmentListOptions finalOptions = (options == null)? new DeviceEnrollmentListOptions() : options;
    return CloudCaller.call(this, "listDeviceEnrollments()",DeviceEnrollmentAdapter.getListMapper(),new CloudRequest.CloudCall<EnrollmentIdentities>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<EnrollmentIdentities> call() {
        return endpoints.getPublicApiApi().getDeviceEnrollments(finalOptions.getPageSize(), finalOptions.getAfter(), finalOptions.getOrder().toString(), finalOptions.encodeInclude());
      }
    } );
  }

  /**
   * Lists device events matching filter options.
   * <p>
   * List all device events for an account.
   * 
   * @param options list options.
   * @return the list of device events corresponding to filter options (One page).
   */
  @API
  @Nullable
  public ListResponse<DeviceEvents> listDeviceEventss(@Nullable DeviceEventsListOptions options)
      throws MbedCloudException {
    final DeviceEventsListOptions finalOptions = (options == null)? new DeviceEventsListOptions() : options;
    return CloudCaller.call(this, "listDeviceEventss()",DeviceEventsAdapter.getListMapper(),new CloudRequest.CloudCall<DeviceEventPage>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<DeviceEventPage> call() {
        return endpoints.getDefaultApi().deviceEventList(finalOptions.getPageSize(), finalOptions.getOrder().toString(), finalOptions.getAfter(), finalOptions.encodeInclude(), null);
      }
    } );
  }

  /**
   * Lists devices matching filter options.
   * <p>
   * List all devices.
   * 
   * @param options list options.
   * @return the list of devices corresponding to filter options (One page).
   */
  @API
  @Nullable
  public ListResponse<Device> listDevices(@Nullable DeviceListOptions options) throws
      MbedCloudException {
    final DeviceListOptions finalOptions = (options == null)? new DeviceListOptions() : options;
    return CloudCaller.call(this, "listDevices()",DeviceAdapter.getListMapper(),new CloudRequest.CloudCall<DevicePage>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<DevicePage> call() {
        return endpoints.getDefaultApi().deviceList(finalOptions.getPageSize(), finalOptions.getOrder().toString(), finalOptions.getAfter(), finalOptions.encodeInclude(), null);
      }
    } );
  }

  /**
   * Request certificate renewal.
   * 
   * <p>
   * Similar to {@link #renewCertificate(String,String)}
   * @param certificateName The certificate name.
   * @param device a device.
   * @return something
   */
  @API
  @Nullable
  public CertificateEnrollment renewCertificate(@NonNull String certificateName,
      @NonNull Device device) throws MbedCloudException {
    checkNotNull(certificateName,TAG_CERTIFICATE_NAME);
    checkNotNull(device,TAG_DEVICE);
    return  renewCertificate(certificateName, device.getId());
  }

  /**
   * Request certificate renewal.
   * 
   * <p>
   * Request a certificate renewal.
   * 
   * **Example usage:**
   * 
   * ```
   * curl -X POST
   * -H 'authorization: Bearer [valid access token]'
   * -H 'content-length: 0'
   * https://api.us-east-1.mbedcloud.com/v3/devices/01612df56f3b0a580a010fc700000000/certificates/customer.dlms/renew
   * ```
   * 
   * @param certificateName The certificate name.
   * @param id The ID of the certificate enrollment.
   * @return something
   */
  @API
  @Nullable
  public CertificateEnrollment renewCertificate(@NonNull String certificateName, @NonNull String id)
      throws MbedCloudException {
    checkNotNull(certificateName,TAG_CERTIFICATE_NAME);
    checkNotNull(id,TAG_ID);
    final String finalCertificateName = certificateName;
    final String finalId = id;
    return CloudCaller.call(this, "renewCertificate()",CertificateEnrollmentAdapter.getMapper(),new CloudRequest.CloudCall<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CertificateEnrollment> call(
          ) {
        return endpoints.getCertificateRenewalApi().requestCertificateRenewal(finalId, finalCertificateName);
      }
    } );
  }

  /**
   * Modifies a device.
   * <p>
   * Similar to {@link #updateDevice(String,Device)}
   * @param device a device.
   * @return something
   */
  @API
  @Nullable
  public Device updateDevice(@NonNull Device device) throws MbedCloudException {
    checkNotNull(device,TAG_DEVICE);
    checkModelValidity(device,TAG_DEVICE);
    return  updateDevice(device.getId(), device);
  }

  /**
   * Modifies a device.
   * <p>
   * Update a specific device.
   * 
   * @param id The ID of the device. The device ID is used across all Device Management APIs.
   * @param device a device.
   * @return an updated device
   */
  @API
  @Nullable
  public Device updateDevice(@NonNull String id, @NonNull Device device) throws MbedCloudException {
    checkNotNull(id,TAG_ID);
    checkNotNull(device,TAG_DEVICE);
    checkModelValidity(device,TAG_DEVICE);
    final String finalId = id;
    final Device finalDevice = device;
    return CloudCaller.call(this, "updateDevice()",DeviceAdapter.getMapper(),new CloudRequest.CloudCall<DeviceData>() {
      /**
       * Makes the low level call to the Cloud.
       * @return Corresponding Retrofit2 Call object
       */
      @Override
      public Call<DeviceData> call() {
        return endpoints.getDefaultApi().deviceUpdate(finalId, DeviceAdapter.reverseMapUpdateRequest(finalDevice));
      }
    } );
  }
}
