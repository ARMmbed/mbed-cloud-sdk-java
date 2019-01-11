// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [UserInvitationListDao]
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.Accounts;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelListDao;
import com.arm.mbed.cloud.sdk.common.dao.ModelListDao;

/**
 * Data Access Object (DAO) for listing user invitations.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing user invitations.")
public abstract class AbstractUserInvitationListDao extends
                                                    AbstractModelListDao<UserInvitation, UserInvitationListOptions>
                                                    implements ModelListDao<UserInvitation, UserInvitationListOptions> {
    /**
     * Constructor.
     */
    public AbstractUserInvitationListDao() throws MbedCloudException {
        super();
    }

    /**
     * a user invitation dao.
     * 
     * @return a user invitation dao
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public UserInvitationDao getCorrespondingModelDao() throws MbedCloudException {
        return new UserInvitationDao().configureAndGet(module);
    }

    /**
     * a user invitation dao class.
     * 
     * @return a user invitation dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<UserInvitationDao> getCorrespondingModelDaoDefinition() {
        return UserInvitationDao.class;
    }

    /**
     * a user invitation list options.
     * 
     * @return a user invitation list options
     */
    @Override
    @Internal
    protected UserInvitationListOptions instantiateListOptions() {
        return new UserInvitationListOptions();
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
        return new Accounts(context);
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
        return new Accounts(options);
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
        return new Accounts(client);
    }
}
