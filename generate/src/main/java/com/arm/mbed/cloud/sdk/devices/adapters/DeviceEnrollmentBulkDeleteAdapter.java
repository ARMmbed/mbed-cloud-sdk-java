// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.adapters;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDelete;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDeleteStatus;
import com.arm.mbed.cloud.sdk.internal.enrollment.model.BulkResponse;
import java.lang.Override;

/**
 * Adapter for device enrollment bulk deletes. */
@Preamble(
    description = "Adapter for device enrollment bulk deletes."
)
@Internal
public class DeviceEnrollmentBulkDeleteAdapter {
  /**
   * Constructor.
   */
  protected DeviceEnrollmentBulkDeleteAdapter() {
    super();
    // Nothing to do;
  }

  /**
   * Maps a bulk response into a device enrollment bulk delete.
   * @param toBeMapped a bulk response.
   * @return mapped a device enrollment bulk delete
   */
  @Internal
  public static DeviceEnrollmentBulkDelete map(BulkResponse toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    final DeviceEnrollmentBulkDelete deviceEnrollmentBulkDelete = new DeviceEnrollmentBulkDelete();
    deviceEnrollmentBulkDelete.setAccountId(toBeMapped.getAccountId());
    deviceEnrollmentBulkDelete.setCompletedAt(TranslationUtils.toDate(toBeMapped.getCompletedAt()));
    deviceEnrollmentBulkDelete.setCreatedAt(TranslationUtils.toDate(toBeMapped.getCreatedAt()));
    deviceEnrollmentBulkDelete.setErrorsCount(TranslationUtils.toInt(toBeMapped.getErrorsCount()));
    deviceEnrollmentBulkDelete.setErrorsReportFile(toBeMapped.getErrorsReportFile());
    deviceEnrollmentBulkDelete.setFullReportFile(toBeMapped.getFullReportFile());
    deviceEnrollmentBulkDelete.setId(toBeMapped.getId());
    deviceEnrollmentBulkDelete.setProcessedCount(TranslationUtils.toInt(toBeMapped.getProcessedCount()));
    deviceEnrollmentBulkDelete.setStatus(translateToDeviceEnrollmentBulkDeleteStatus(toBeMapped.getStatus()));
    deviceEnrollmentBulkDelete.setTotalCount(TranslationUtils.toInt(toBeMapped.getTotalCount()));
    return deviceEnrollmentBulkDelete;
  }

  /**
   * Gets a mapper.
   * @return a mapper
   */
  @Internal
  public static GenericAdapter.Mapper<BulkResponse, DeviceEnrollmentBulkDelete> getMapper() {
    return new GenericAdapter.Mapper<BulkResponse, DeviceEnrollmentBulkDelete>() {
      /**
       * Maps.
       * @param toBeMapped model to be mapped.
       * @return a mapped object
       */
      @Override
      public DeviceEnrollmentBulkDelete map(BulkResponse toBeMapped) {
        return DeviceEnrollmentBulkDeleteAdapter.map(toBeMapped);
      }
    };
  }

  /**
   * Maps the enum value.
   * @param toBeMapped a status enum.
   * @return mapped enum value
   */
  @Internal
  protected static DeviceEnrollmentBulkDeleteStatus translateToDeviceEnrollmentBulkDeleteStatus(
      BulkResponse.StatusEnum toBeMapped) {
    if(toBeMapped == null) {
      return DeviceEnrollmentBulkDeleteStatus.getUnknownEnum();
    }
    switch(toBeMapped) {
      case NEW:
      return DeviceEnrollmentBulkDeleteStatus.NEW;
      case PROCESSING:
      return DeviceEnrollmentBulkDeleteStatus.PROCESSING;
      case COMPLETED:
      return DeviceEnrollmentBulkDeleteStatus.COMPLETED;
      default:
      return DeviceEnrollmentBulkDeleteStatus.getUnknownEnum();
    }
  }
}
