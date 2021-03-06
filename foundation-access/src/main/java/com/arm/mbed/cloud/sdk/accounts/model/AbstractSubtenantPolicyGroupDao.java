// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [SubtenantPolicyGroupDao]
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
import com.arm.mbed.cloud.sdk.common.dao.CrudDao;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.common.listing.Paginator;

/**
 * Data Access Object (DAO) for subtenant policy groups.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for subtenant policy groups.")
public abstract class AbstractSubtenantPolicyGroupDao extends AbstractModelDao<SubtenantPolicyGroup>
                                                      implements CrudDao<SubtenantPolicyGroup> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractSubtenantPolicyGroupDao() throws MbedCloudException {
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
    public AbstractSubtenantPolicyGroupDao(ApiClientWrapper client) throws MbedCloudException {
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
    public AbstractSubtenantPolicyGroupDao(ConnectionOptions options) throws MbedCloudException {
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
    public AbstractSubtenantPolicyGroupDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant api keys matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#allApiKeys(String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantApiKeyListOptions)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the group to retrieve API keys for.
     * @param options
     *            list options.
     * @return paginator over the list of subtenant api keys
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<SubtenantApiKey>
           allApiKeys(@NonNull String accountId, @NonNull String id,
                      @Nullable SubtenantApiKeyListOptions options) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).allApiKeys(accountId, id, options);
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant api keys matching filter options.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#allApiKeys(com.arm.mbed.cloud.sdk.accounts.model.SubtenantApiKeyListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param options
     *            list options.
     * @return paginator over the list of subtenant api keys
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<SubtenantApiKey>
           allApiKeys(@Nullable SubtenantApiKeyListOptions options) throws MbedCloudException {
        return allApiKeys(options, getModel());
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant api keys matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#allApiKeys(com.arm.mbed.cloud.sdk.accounts.model.SubtenantApiKeyListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param options
     *            list options.
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return paginator over the list of subtenant api keys
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<SubtenantApiKey>
           allApiKeys(@Nullable SubtenantApiKeyListOptions options,
                      @NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).allApiKeys(options, subtenantPolicyGroup);
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant users matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#allUsers(String, String, String, String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the group to retrieve users for.
     * @param statusEq
     *            a string
     * @param statusIn
     *            a string
     * @param statusNin
     *            a string
     * @param options
     *            list options.
     * @return paginator over the list of subtenant users
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<SubtenantUser> allUsers(@NonNull String accountId, @NonNull String id, @Nullable String statusEq,
                                             @Nullable String statusIn, @Nullable String statusNin,
                                             @Nullable SubtenantUserListOptions options) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).allUsers(accountId, id, statusEq, statusIn, statusNin, options);
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant users matching filter options.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#allUsers(String, String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param statusEq
     *            a string
     * @param statusIn
     *            a string
     * @param statusNin
     *            a string
     * @param options
     *            list options.
     * @return paginator over the list of subtenant users
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<SubtenantUser> allUsers(@Nullable String statusEq, @Nullable String statusIn,
                                             @Nullable String statusNin,
                                             @Nullable SubtenantUserListOptions options) throws MbedCloudException {
        return allUsers(statusEq, statusIn, statusNin, options, getModel());
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant users matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#allUsers(String, String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param statusEq
     *            a string
     * @param statusIn
     *            a string
     * @param statusNin
     *            a string
     * @param options
     *            list options.
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return paginator over the list of subtenant users
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<SubtenantUser>
           allUsers(@Nullable String statusEq, @Nullable String statusIn, @Nullable String statusNin,
                    @Nullable SubtenantUserListOptions options,
                    @NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).allUsers(statusEq, statusIn, statusNin, options, subtenantPolicyGroup);
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant users matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#allUsers(String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the group to retrieve users for.
     * @param options
     *            list options.
     * @return paginator over the list of subtenant users
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<SubtenantUser> allUsers(@NonNull String accountId, @NonNull String id,
                                             @Nullable SubtenantUserListOptions options) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).allUsers(accountId, id, options);
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant users matching filter options.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#allUsers(com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param options
     *            list options.
     * @return paginator over the list of subtenant users
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<SubtenantUser> allUsers(@Nullable SubtenantUserListOptions options) throws MbedCloudException {
        return allUsers(options, getModel());
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant users matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#allUsers(com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param options
     *            list options.
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return paginator over the list of subtenant users
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<SubtenantUser>
           allUsers(@Nullable SubtenantUserListOptions options,
                    @NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).allUsers(options, subtenantPolicyGroup);
    }

    /**
     * Get API keys of a group.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#apiKeys(String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantApiKeyListOptions)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the group to retrieve API keys for.
     * @param options
     *            list options.
     * @return the list of subtenant api keys corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<SubtenantApiKey>
           apiKeys(@NonNull String accountId, @NonNull String id,
                   @Nullable SubtenantApiKeyListOptions options) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).apiKeys(accountId, id, options);
    }

    /**
     * Get API keys of a group.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#apiKeys(com.arm.mbed.cloud.sdk.accounts.model.SubtenantApiKeyListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param options
     *            list options.
     * @return the list of subtenant api keys corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<SubtenantApiKey>
           apiKeys(@Nullable SubtenantApiKeyListOptions options) throws MbedCloudException {
        return apiKeys(options, getModel());
    }

    /**
     * Get API keys of a group.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#apiKeys(com.arm.mbed.cloud.sdk.accounts.model.SubtenantApiKeyListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param options
     *            list options.
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return the list of subtenant api keys corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<SubtenantApiKey>
           apiKeys(@Nullable SubtenantApiKeyListOptions options,
                   @NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).apiKeys(options, subtenantPolicyGroup);
    }

    /**
     * Adds a subtenant policy group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#create(com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantPolicyGroup create() throws MbedCloudException {
        return create(getModel());
    }

    /**
     * Adds a subtenant policy group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#create(java.lang.Object, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param members
     *            Represents arrays of user and API key IDs.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantPolicyGroup create(@Nullable Object members) throws MbedCloudException {
        return create(members, getModel());
    }

    /**
     * Adds a subtenant policy group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#create(java.lang.Object, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param members
     *            Represents arrays of user and API key IDs.
     * @param accountId
     *            The ID of the account this group belongs to.
     * @return an added subtenant policy group
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantPolicyGroup create(@Nullable Object members, @NonNull String accountId) throws MbedCloudException {
        return create(members, accountId, getModel());
    }

    /**
     * Adds a subtenant policy group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#createSubtenantPolicyGroup(java.lang.Object, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param members
     *            Represents arrays of user and API key IDs.
     * @param accountId
     *            The ID of the account this group belongs to.
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return an added subtenant policy group
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantPolicyGroup create(@Nullable Object members, @NonNull String accountId,
                                       @NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).createSubtenantPolicyGroup(members, accountId,
                                                                                         subtenantPolicyGroup));
    }

    /**
     * Adds a subtenant policy group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#createSubtenantPolicyGroup(java.lang.Object, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param members
     *            Represents arrays of user and API key IDs.
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantPolicyGroup create(@Nullable Object members,
                                       @NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).createSubtenantPolicyGroup(members,
                                                                                         subtenantPolicyGroup));
    }

    /**
     * Adds a subtenant policy group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#createSubtenantPolicyGroup(com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantPolicyGroup create(@NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).createSubtenantPolicyGroup(subtenantPolicyGroup));
    }

    /**
     * Adds a subtenant policy group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#create(String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param accountId
     *            The ID of the account this group belongs to.
     * @return an added subtenant policy group
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantPolicyGroup create(@NonNull String accountId) throws MbedCloudException {
        return create(accountId, getModel());
    }

    /**
     * Adds a subtenant policy group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#createSubtenantPolicyGroup(String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param accountId
     *            The ID of the account this group belongs to.
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return an added subtenant policy group
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantPolicyGroup create(@NonNull String accountId,
                                       @NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).createSubtenantPolicyGroup(accountId,
                                                                                         subtenantPolicyGroup));
    }

    /**
     * Deletes a subtenant policy group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#delete(com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        delete(getModel());
    }

    /**
     * Deletes a subtenant policy group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#deleteSubtenantPolicyGroup(com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteSubtenantPolicyGroup(subtenantPolicyGroup);
    }

    /**
     * Deletes a subtenant policy group.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteSubtenantPolicyGroup(String, String)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the group to delete.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void delete(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteSubtenantPolicyGroup(accountId, id);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected SubtenantPolicyGroup instantiateModel() {
        return new SubtenantPolicyGroup();
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
     * Gets a subtenant policy group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#read(com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantPolicyGroup read() throws MbedCloudException {
        return read(getModel());
    }

    /**
     * Gets a subtenant policy group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#readSubtenantPolicyGroup(com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantPolicyGroup read(@NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).readSubtenantPolicyGroup(subtenantPolicyGroup));
    }

    /**
     * Gets a subtenant policy group.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#readSubtenantPolicyGroup(String, String)}
     * 
     * @param accountId
     *            The ID of the account this group belongs to.
     * @param id
     *            The ID of the group.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantPolicyGroup read(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).readSubtenantPolicyGroup(accountId, id));
    }

    /**
     * Modifies a subtenant policy group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#update(com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantPolicyGroup update() throws MbedCloudException {
        return update(getModel());
    }

    /**
     * Modifies a subtenant policy group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#updateSubtenantPolicyGroup(com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantPolicyGroup update(@NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).updateSubtenantPolicyGroup(subtenantPolicyGroup));
    }

    /**
     * Modifies a subtenant policy group.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#update(String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param accountId
     *            The ID of the account this group belongs to.
     * @param id
     *            The ID of the group.
     * @return an updated subtenant policy group
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantPolicyGroup update(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        return update(accountId, id, getModel());
    }

    /**
     * Modifies a subtenant policy group.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#updateSubtenantPolicyGroup(String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param accountId
     *            The ID of the account this group belongs to.
     * @param id
     *            The ID of the group.
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return an updated subtenant policy group
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantPolicyGroup update(@NonNull String accountId, @NonNull String id,
                                       @NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).updateSubtenantPolicyGroup(accountId, id,
                                                                                         subtenantPolicyGroup));
    }

    /**
     * Get users of a group.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#users(String, String, String, String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the group to retrieve users for.
     * @param statusEq
     *            a string
     * @param statusIn
     *            a string
     * @param statusNin
     *            a string
     * @param options
     *            list options.
     * @return the list of subtenant users corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<SubtenantUser> users(@NonNull String accountId, @NonNull String id, @Nullable String statusEq,
                                             @Nullable String statusIn, @Nullable String statusNin,
                                             @Nullable SubtenantUserListOptions options) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).users(accountId, id, statusEq, statusIn, statusNin, options);
    }

    /**
     * Get users of a group.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#users(String, String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param statusEq
     *            a string
     * @param statusIn
     *            a string
     * @param statusNin
     *            a string
     * @param options
     *            list options.
     * @return the list of subtenant users corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<SubtenantUser> users(@Nullable String statusEq, @Nullable String statusIn,
                                             @Nullable String statusNin,
                                             @Nullable SubtenantUserListOptions options) throws MbedCloudException {
        return users(statusEq, statusIn, statusNin, options, getModel());
    }

    /**
     * Get users of a group.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#users(String, String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param statusEq
     *            a string
     * @param statusIn
     *            a string
     * @param statusNin
     *            a string
     * @param options
     *            list options.
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return the list of subtenant users corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<SubtenantUser>
           users(@Nullable String statusEq, @Nullable String statusIn, @Nullable String statusNin,
                 @Nullable SubtenantUserListOptions options,
                 @NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).users(statusEq, statusIn, statusNin, options, subtenantPolicyGroup);
    }

    /**
     * Get users of a group.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#users(String, String, com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the group to retrieve users for.
     * @param options
     *            list options.
     * @return the list of subtenant users corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<SubtenantUser> users(@NonNull String accountId, @NonNull String id,
                                             @Nullable SubtenantUserListOptions options) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).users(accountId, id, options);
    }

    /**
     * Get users of a group.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroupDao#users(com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param options
     *            list options.
     * @return the list of subtenant users corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<SubtenantUser> users(@Nullable SubtenantUserListOptions options) throws MbedCloudException {
        return users(options, getModel());
    }

    /**
     * Get users of a group.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#users(com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserListOptions, com.arm.mbed.cloud.sdk.accounts.model.SubtenantPolicyGroup)}
     * 
     * @param options
     *            list options.
     * @param subtenantPolicyGroup
     *            a subtenant policy group.
     * @return the list of subtenant users corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<SubtenantUser>
           users(@Nullable SubtenantUserListOptions options,
                 @NonNull SubtenantPolicyGroup subtenantPolicyGroup) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).users(options, subtenantPolicyGroup);
    }
}
