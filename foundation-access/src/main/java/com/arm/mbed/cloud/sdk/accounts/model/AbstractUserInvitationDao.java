// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [UserInvitationDao]
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.Accounts;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
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
 * Data Access Object (DAO) for user invitations.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for user invitations.")
public abstract class AbstractUserInvitationDao extends AbstractModelDao<UserInvitation>
                                                implements CreateDao<UserInvitation>, DeleteDao<UserInvitation>,
                                                ReadDao<UserInvitation> {
    /**
     * Constructor.
     */
    public AbstractUserInvitationDao() throws MbedCloudException {
        super();
    }

    /**
     * Adds a user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#createUserInvitation(int, com.arm.mbed.cloud.sdk.accounts.model.UserInvitation)}
     * 
     * @param validForDays
     *            Specifies how many days the invitation will be valid for. The default is 30 days. Value should be
     *            between 1 and 100 days.
     * @return an added user invitation
     */
    public UserInvitation create(@Nullable int validForDays) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).createUserInvitation(validForDays, getModel()));
        return getModel();
    }

    /**
     * Deletes a user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#deleteUserInvitation(com.arm.mbed.cloud.sdk.accounts.model.UserInvitation)}
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteUserInvitation(getModel());
    }

    /**
     * Deletes a user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#deleteUserInvitation(com.arm.mbed.cloud.sdk.accounts.model.UserInvitation)}
     * 
     * @param userInvitation
     *            a user invitation.
     */
    @Override
    public void delete(@NonNull UserInvitation userInvitation) throws MbedCloudException {
        setModel(userInvitation);
        delete();
    }

    /**
     * Deletes a user invitation.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteUserInvitation(String)}
     * 
     * @param id
     *            The ID of the invitation to be deleted.
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteUserInvitation(id);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected UserInvitation instantiateModel() {
        return new UserInvitation();
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
     * Gets a user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#readUserInvitation(com.arm.mbed.cloud.sdk.accounts.model.UserInvitation)}
     * 
     * @return something
     */
    @Override
    public UserInvitation read() throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).readUserInvitation(getModel()));
        return getModel();
    }

    /**
     * Gets a user invitation.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#readUserInvitation(String)}
     * 
     * @param id
     *            The ID of the invitation.
     * @return something
     */
    @Override
    public UserInvitation read(@NonNull String id) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).readUserInvitation(id));
        return getModel();
    }
}
