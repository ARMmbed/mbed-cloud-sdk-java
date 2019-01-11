// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [SubtenantUserInvitationDao]
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
 * Data Access Object (DAO) for subtenant user invitations.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for subtenant user invitations.")
public abstract class AbstractSubtenantUserInvitationDao extends AbstractModelDao<SubtenantUserInvitation>
                                                         implements CreateDao<SubtenantUserInvitation>,
                                                         DeleteDao<SubtenantUserInvitation>,
                                                         ReadDao<SubtenantUserInvitation> {
    /**
     * Constructor.
     */
    public AbstractSubtenantUserInvitationDao() throws MbedCloudException {
        super();
    }

    /**
     * Adds a subtenant user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserInvitation#createSubtenantUserInvitation(int,String,SubtenantUserInvitation)}
     * 
     * @param validForDays
     *            Specifies how many days the invitation will be valid for. The default is 30 days. Value should be
     *            between 1 and 100 days.
     * @param accountId
     *            The ID of the account the user is invited to.
     */
    public void create(@Nullable int validForDays, @NonNull String accountId) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) module).createSubtenantUserInvitation(validForDays, accountId, getModel()));
    }

    /**
     * Adds a subtenant user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserInvitation#createSubtenantUserInvitation(int,SubtenantUserInvitation)}
     * 
     * @param validForDays
     *            Specifies how many days the invitation will be valid for. The default is 30 days. Value should be
     *            between 1 and 100 days.
     */
    public void create(@Nullable int validForDays) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) module).createSubtenantUserInvitation(validForDays, getModel()));
    }

    /**
     * Deletes a subtenant user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserInvitation#deleteSubtenantUserInvitation(String,String)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the invitation to be deleted.
     */
    public void delete(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        ((Accounts) module).deleteSubtenantUserInvitation(accountId, id);
    }

    /**
     * Deletes a subtenant user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserInvitation#deleteSubtenantUserInvitation(SubtenantUserInvitation)}
     */
    @Override
    public void delete() throws MbedCloudException {
        checkDaoConfiguration();
        ((Accounts) module).deleteSubtenantUserInvitation(getModel());
    }

    /**
     * Deletes a subtenant user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserInvitation#deleteSubtenantUserInvitation(SubtenantUserInvitation)}
     * 
     * @param subtenantUserInvitation
     *            a subtenant user invitation.
     */
    @Override
    public void delete(@NonNull SubtenantUserInvitation subtenantUserInvitation) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(subtenantUserInvitation);
        delete();
    }

    /**
     * Gets a subtenant user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserInvitation#getSubtenantUserInvitation(String,String)}
     * 
     * @param accountId
     *            The ID of the account the user is invited to.
     * @param id
     *            The ID of the invitation.
     */
    public void read(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) module).getSubtenantUserInvitation(accountId, id));
    }

    /**
     * Gets a subtenant user invitation.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserInvitation#getSubtenantUserInvitation(SubtenantUserInvitation)}
     */
    @Override
    public void read() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) module).getSubtenantUserInvitation(getModel()));
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
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected SubtenantUserInvitation instantiateModel() {
        return new SubtenantUserInvitation();
    }
}
