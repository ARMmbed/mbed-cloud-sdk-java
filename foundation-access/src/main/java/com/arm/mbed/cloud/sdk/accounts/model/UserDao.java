// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
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
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.common.listing.Paginator;

/**
 * Data Access Object (DAO) for users.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for users.")
public class UserDao extends AbstractModelDao<User> implements CrudDao<User> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public UserDao() throws MbedCloudException {
        super();
    }

    /**
     * Constructor.
     * 
     * @param client
     *            an api client wrapper.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public UserDao(ApiClientWrapper client) throws MbedCloudException {
        super(client);
    }

    /**
     * Constructor.
     * 
     * @param options
     *            a connection options.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public UserDao(ConnectionOptions options) throws MbedCloudException {
        super(options);
    }

    /**
     * Constructor.
     * 
     * @param sdkContext
     *            an sdk context.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public UserDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Creates a {@link Paginator} for the list of policy groups matching filter options.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserDao#allPolicyGroups(com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions, com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param options
     *            list options.
     * @return paginator over the list of policy groups
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<PolicyGroup> allPolicyGroups(@Nullable PolicyGroupListOptions options) throws MbedCloudException {
        return allPolicyGroups(options, getModel());
    }

    /**
     * Creates a {@link Paginator} for the list of policy groups matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#allPolicyGroups(com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions, com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param options
     *            list options.
     * @param user
     *            a user.
     * @return paginator over the list of policy groups
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<PolicyGroup> allPolicyGroups(@Nullable PolicyGroupListOptions options,
                                                  @NonNull User user) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).allPolicyGroups(options, user);
    }

    /**
     * Creates a {@link Paginator} for the list of policy groups matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#allPolicyGroups(String, com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions)}
     * 
     * @param id
     *            The ID of the user.
     * @param options
     *            list options.
     * @return paginator over the list of policy groups
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<PolicyGroup> allPolicyGroups(@NonNull String id,
                                                  @Nullable PolicyGroupListOptions options) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).allPolicyGroups(id, options);
    }

    /**
     * Clones this instance.
     * 
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    @SuppressWarnings({ "resource", "unused" })
    public UserDao clone() {
        try {
            return new UserDao().configureAndGet(getModuleOrThrow() == null ? null : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds a user.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserDao#create(com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @return an added user
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public User create() throws MbedCloudException {
        return create(getModel());
    }

    /**
     * Adds a user.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#createUser(com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param user
     *            a user.
     * @return an added user
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public User create(@NonNull User user) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).createUser(user));
    }

    /**
     * Adds a user.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserDao#create(String, com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param action
     *            Action, either `create` or `invite`.
     * @return an added user
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public User create(@Nullable @DefaultValue("create") String action) throws MbedCloudException {
        return create(action, getModel());
    }

    /**
     * Adds a user.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#createUser(String, com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param action
     *            Action, either `create` or `invite`.
     * @param user
     *            a user.
     * @return an added user
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public User create(@Nullable @DefaultValue("create") String action, @NonNull User user) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).createUser(action, user));
    }

    /**
     * Deletes a user.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserDao#delete(com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        delete(getModel());
    }

    /**
     * Deletes a user.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteUser(com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param user
     *            a user.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull User user) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteUser(user);
    }

    /**
     * Deletes a user.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteUser(String)}
     * 
     * @param id
     *            The ID of the user to delete.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteUser(id);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected User instantiateModel() {
        return new User();
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
     * Get groups of the user.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserDao#policyGroups(com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions, com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param options
     *            list options.
     * @return the list of policy groups corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<PolicyGroup> policyGroups(@Nullable PolicyGroupListOptions options) throws MbedCloudException {
        return policyGroups(options, getModel());
    }

    /**
     * Get groups of the user.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#policyGroups(com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions, com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param options
     *            list options.
     * @param user
     *            a user.
     * @return the list of policy groups corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<PolicyGroup> policyGroups(@Nullable PolicyGroupListOptions options,
                                                  @NonNull User user) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).policyGroups(options, user);
    }

    /**
     * Get groups of the user.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#policyGroups(String, com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions)}
     * 
     * @param id
     *            The ID of the user.
     * @param options
     *            list options.
     * @return the list of policy groups corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<PolicyGroup> policyGroups(@NonNull String id,
                                                  @Nullable PolicyGroupListOptions options) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).policyGroups(id, options);
    }

    /**
     * Gets a user.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.UserDao#read(com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public User read() throws MbedCloudException {
        return read(getModel());
    }

    /**
     * Gets a user.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#readUser(com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param user
     *            a user.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public User read(@NonNull User user) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).readUser(user));
    }

    /**
     * Gets a user.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#readUser(String)}
     * 
     * @param id
     *            The ID of the user.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public User read(@NonNull String id) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).readUser(id));
    }

    /**
     * Modifies a user.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserDao#update(com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public User update() throws MbedCloudException {
        return update(getModel());
    }

    /**
     * Modifies a user.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#updateUser(com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param user
     *            a user.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public User update(@NonNull User user) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).updateUser(user));
    }

    /**
     * Modifies a user.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserDao#update(String, com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param id
     *            The ID of the user.
     * @return an updated user
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public User update(@NonNull String id) throws MbedCloudException {
        return update(id, getModel());
    }

    /**
     * Modifies a user.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#updateUser(String, com.arm.mbed.cloud.sdk.accounts.model.User)}
     * 
     * @param id
     *            The ID of the user.
     * @param user
     *            a user.
     * @return an updated user
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public User update(@NonNull String id, @NonNull User user) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).updateUser(id, user));
    }
}
