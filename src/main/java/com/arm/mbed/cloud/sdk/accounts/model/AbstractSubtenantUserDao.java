// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [SubtenantUserDao]
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.Accounts;
import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.CrudDao;

/**
 * Data Access Object (DAO) for subtenant users.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for subtenant users.")
public abstract class AbstractSubtenantUserDao extends AbstractModelDao<SubtenantUser>
                                               implements CrudDao<SubtenantUser> {
    /**
     * Constructor.
     */
    public AbstractSubtenantUserDao() throws MbedCloudException {
        super();
    }

    /**
     * Adds a subtenant user.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#createSubtenantUser(String,String,SubtenantUser)}
     * 
     * @param action
     *            Create or invite user.
     * @param accountId
     *            The ID of the account.
     */
    public void create(@Nullable @DefaultValue("create") String action,
                       @NonNull String accountId) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) module).createSubtenantUser(action, accountId, getModel()));
    }

    /**
     * Adds a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#createSubtenantUser(String,SubtenantUser)}
     * 
     * @param action
     *            Create or invite user.
     */
    public void create(@Nullable @DefaultValue("create") String action) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) module).createSubtenantUser(action, getModel()));
    }

    /**
     * Deletes a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#deleteSubtenantUser(String,String)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the user to be deleted.
     */
    public void delete(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        ((Accounts) module).deleteSubtenantUser(accountId, id);
    }

    /**
     * Deletes a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#deleteSubtenantUser(SubtenantUser)}
     */
    @Override
    public void delete() throws MbedCloudException {
        checkDaoConfiguration();
        ((Accounts) module).deleteSubtenantUser(getModel());
    }

    /**
     * Deletes a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#deleteSubtenantUser(SubtenantUser)}
     * 
     * @param subtenantUser
     *            a subtenant user.
     */
    @Override
    public void delete(@NonNull SubtenantUser subtenantUser) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(subtenantUser);
        delete();
    }

    /**
     * Gets a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#getSubtenantUser(String,String)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param id
     *            The ID of the user.
     */
    public void read(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) module).getSubtenantUser(accountId, id));
    }

    /**
     * Gets a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#getSubtenantUser(SubtenantUser)}
     */
    @Override
    public void read() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) module).getSubtenantUser(getModel()));
    }

    /**
     * Modifies a subtenant user.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#updateSubtenantUser(String,String,SubtenantUser)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param id
     *            The ID of the user.
     */
    public void update(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) module).updateSubtenantUser(accountId, id, getModel()));
    }

    /**
     * Modifies a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#updateSubtenantUser(SubtenantUser)}
     */
    @Override
    public void update() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) module).updateSubtenantUser(getModel()));
    }

    /**
     * Modifies a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#updateSubtenantUser(SubtenantUser)}
     * 
     * @param subtenantUser
     *            a subtenant user.
     */
    @Override
    public void update(@NonNull SubtenantUser subtenantUser) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(subtenantUser);
        update();
    }

    /**
     * Validate the user email.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#validateEmail(String,String)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the user whose email is validated.
     */
    public void validateEmail(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        ((Accounts) module).validateEmail(accountId, id);
    }

    /**
     * Validate the user email.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#validateEmail(SubtenantUser)}
     */
    public void validateEmail() throws MbedCloudException {
        checkDaoConfiguration();
        ((Accounts) module).validateEmail(getModel());
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
    protected SubtenantUser instantiateModel() {
        return new SubtenantUser();
    }
}
