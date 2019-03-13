// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Fri Jan 11 01:52:39 GMT 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.Accounts;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;

/**
 * Data Access Object (DAO) for subtenant users.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for subtenant users.")
public class SubtenantUserDao extends AbstractSubtenantUserDao {
    private static final String DEFAULT_ACTION = "create";

    /**
     * Constructor.
     */
    public SubtenantUserDao() throws MbedCloudException {
        super();
    }

    /**
     * Executes create.
     * 
     * @param modelToCreate
     *            an sdk model.
     */
    @Override
    public SubtenantUser create(SubtenantUser modelToCreate) throws MbedCloudException, NotImplementedException {
        setModel(((Accounts) getModuleOrThrow()).createSubtenantUser(DEFAULT_ACTION, modelToCreate));
        return getModel();
    }

    /**
     * Executes create.
     */
    @Override
    public SubtenantUser create() throws MbedCloudException {
        super.create(DEFAULT_ACTION);
        return getModel();
    }

    /**
     * Executes read.
     * 
     * @param id
     *            a string.
     */
    @Override
    public SubtenantUser read(String id) throws MbedCloudException, UnsupportedOperationException,
                                         NotImplementedException {
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
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @SuppressWarnings("resource")
    @Override
    public SubtenantUserDao clone() {
        try {
            return new SubtenantUserDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                     : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }
}