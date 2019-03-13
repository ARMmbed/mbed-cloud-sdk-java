// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
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
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;

/**
 * Data Access Object (DAO) for listing accounts.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing accounts.")
public class AccountListDao extends AbstractModelListDao<Account, AccountListOptions>
                            implements ModelListDao<Account, AccountListOptions> {
    /**
     * Constructor.
     */
    public AccountListDao() throws MbedCloudException {
        super();
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    @SuppressWarnings({ "unused", "resource" })
    public AccountListDao clone() {
        try {
            return new AccountListDao().configureAndGet(getModuleOrThrow() == null ? null : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * an account dao.
     * 
     * @return an account dao
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public AccountDao getCorrespondingModelDao() throws MbedCloudException {
        return new AccountDao().configureAndGet(getModuleOrThrow());
    }

    /**
     * an account dao class.
     * 
     * @return an account dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<AccountDao> getCorrespondingModelDaoDefinition() {
        return AccountDao.class;
    }

    /**
     * an account list options.
     * 
     * @return an account list options
     */
    @Override
    @Internal
    protected AccountListOptions instantiateListOptions() {
        return new AccountListOptions();
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
     * Lists accounts matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#listAccounts(com.arm.mbed.cloud.sdk.accounts.model.AccountListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of accounts
     */
    @Override
    protected ListResponse<Account> requestOnePage(AccountListOptions options) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).listAccounts(options);
    }
}
