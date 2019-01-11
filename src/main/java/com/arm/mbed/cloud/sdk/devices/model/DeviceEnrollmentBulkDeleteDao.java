// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Fri Jan 11 01:52:39 GMT 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.devices.model;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;

/**
 * Data Access Object (DAO) for device enrollment bulk deletes.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for device enrollment bulk deletes.")
public class DeviceEnrollmentBulkDeleteDao extends AbstractDeviceEnrollmentBulkDeleteDao {
    /**
     * Constructor.
     */
    public DeviceEnrollmentBulkDeleteDao() throws MbedCloudException {
        super();
    }

    /**
     * Download the error report file for the bulk enrollment deletion.
     * <p>
     * This method will download the CSV file containing detailed information on status of the bulk enrollment.
     */
    public void downloadErrorsReportFile() throws NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Download the full report file for the bulk enrollment deletion.
     * <p>
     * This method will download the CSV file containing detailed information on status of the bulk enrollment.
     */
    public void downloadFullReportFile() throws NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes delete.
     * 
     * @param id
     *            a string.
     */
    @Override
    public void delete(String id) throws MbedCloudException, UnsupportedOperationException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes delete.
     * 
     * @param modelToDelete
     *            an sdk model.
     */
    @Override
    public void delete(DeviceEnrollmentBulkDelete modelToDelete) throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes delete.
     */
    @Override
    public void delete() throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public DeviceEnrollmentBulkDeleteDao clone() {
        try {
            return new DeviceEnrollmentBulkDeleteDao().configureAndGet(module == null ? null : module.clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }
}
