// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
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
 * Data Access Object (DAO) for api keys.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for api keys.")
public class ApiKeyDao extends AbstractModelDao<ApiKey> implements CrudDao<ApiKey> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ApiKeyDao() throws MbedCloudException {
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
    public ApiKeyDao(ApiClientWrapper client) throws MbedCloudException {
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
    public ApiKeyDao(ConnectionOptions options) throws MbedCloudException {
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
    public ApiKeyDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Creates a {@link Paginator} for the list of policy groups matching filter options.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.ApiKeyDao#allPolicyGroups(com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions, com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
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
     * {@link com.arm.mbed.cloud.sdk.Accounts#allPolicyGroups(com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions, com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @param options
     *            list options.
     * @param apiKey
     *            an api key.
     * @return paginator over the list of policy groups
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<PolicyGroup> allPolicyGroups(@Nullable PolicyGroupListOptions options,
                                                  @NonNull ApiKey apiKey) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).allPolicyGroups(options, apiKey);
    }

    /**
     * Creates a {@link Paginator} for the list of policy groups matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#allPolicyGroups(String, com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions)}
     * 
     * @param id
     *            The ID of the API key.
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
    public ApiKeyDao clone() {
        try {
            return new ApiKeyDao().configureAndGet(getModuleOrThrow() == null ? null : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds an api key.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.ApiKeyDao#create(com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @return an added api key
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public ApiKey create() throws MbedCloudException {
        return create(getModel());
    }

    /**
     * Adds an api key.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#createApiKey(com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @param apiKey
     *            an api key.
     * @return an added api key
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public ApiKey create(@NonNull ApiKey apiKey) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).createApiKey(apiKey));
    }

    /**
     * Deletes an api key.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.ApiKeyDao#delete(com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        delete(getModel());
    }

    /**
     * Deletes an api key.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteApiKey(com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @param apiKey
     *            an api key.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull ApiKey apiKey) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteApiKey(apiKey);
    }

    /**
     * Deletes an api key.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteApiKey(String)}
     * 
     * @param id
     *            The ID of the API key to delete.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteApiKey(id);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected ApiKey instantiateModel() {
        return new ApiKey();
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
     * Gets my api key.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#myApiKey()}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("PMD.ShortMethodName")
    public ApiKey me() throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).myApiKey());
    }

    /**
     * Get groups of the API key.
     * 
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.ApiKeyDao#policyGroups(com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions, com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
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
     * Get groups of the API key.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#policyGroups(com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions, com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @param options
     *            list options.
     * @param apiKey
     *            an api key.
     * @return the list of policy groups corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<PolicyGroup> policyGroups(@Nullable PolicyGroupListOptions options,
                                                  @NonNull ApiKey apiKey) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).policyGroups(options, apiKey);
    }

    /**
     * Get groups of the API key.
     * 
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#policyGroups(String, com.arm.mbed.cloud.sdk.accounts.model.PolicyGroupListOptions)}
     * 
     * @param id
     *            The ID of the API key.
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
     * Gets an api key.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.ApiKeyDao#read(com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public ApiKey read() throws MbedCloudException {
        return read(getModel());
    }

    /**
     * Gets an api key.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#readApiKey(com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @param apiKey
     *            an api key.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ApiKey read(@NonNull ApiKey apiKey) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).readApiKey(apiKey));
    }

    /**
     * Gets an api key.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#readApiKey(String)}
     * 
     * @param id
     *            The ID of the API key.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public ApiKey read(@NonNull String id) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).readApiKey(id));
    }

    /**
     * Modifies an api key.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.ApiKeyDao#update(com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public ApiKey update() throws MbedCloudException {
        return update(getModel());
    }

    /**
     * Modifies an api key.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#updateApiKey(com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @param apiKey
     *            an api key.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public ApiKey update(@NonNull ApiKey apiKey) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).updateApiKey(apiKey));
    }

    /**
     * Modifies an api key.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.ApiKeyDao#update(String, com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @param id
     *            The ID of the API key.
     * @return an updated api key
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ApiKey update(@NonNull String id) throws MbedCloudException {
        return update(id, getModel());
    }

    /**
     * Modifies an api key.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#updateApiKey(String, com.arm.mbed.cloud.sdk.accounts.model.ApiKey)}
     * 
     * @param id
     *            The ID of the API key.
     * @param apiKey
     *            an api key.
     * @return an updated api key
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ApiKey update(@NonNull String id, @NonNull ApiKey apiKey) throws MbedCloudException {
        return setAndGetModel(((Accounts) getModuleOrThrow()).updateApiKey(id, apiKey));
    }
}
