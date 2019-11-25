// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [CampaignStatisticsDao]
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import com.arm.mbed.cloud.sdk.DeviceUpdate;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.ReadDao;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.common.listing.Paginator;

/**
 * Data Access Object (DAO) for campaign statistics.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for campaign statistics.")
public abstract class AbstractCampaignStatisticsDao extends AbstractModelDao<CampaignStatistics>
                                                    implements ReadDao<CampaignStatistics> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractCampaignStatisticsDao() throws MbedCloudException {
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
    public AbstractCampaignStatisticsDao(ApiClientWrapper client) throws MbedCloudException {
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
    public AbstractCampaignStatisticsDao(ConnectionOptions options) throws MbedCloudException {
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
    public AbstractCampaignStatisticsDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Creates a {@link Paginator} for the list of campaign statistics events matching filter options.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsDao#allEvents(com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsEventsListOptions, com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatistics)}
     * 
     * @param options
     *            list options.
     * @return paginator over the list of campaign statistics events
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<CampaignStatisticsEvents>
           allEvents(@Nullable CampaignStatisticsEventsListOptions options) throws MbedCloudException {
        return allEvents(options, getModel());
    }

    /**
     * Creates a {@link Paginator} for the list of campaign statistics events matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.DeviceUpdate#allEvents(com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsEventsListOptions, com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatistics)}
     * 
     * @param options
     *            list options.
     * @param campaignStatistics
     *            a campaign statistics.
     * @return paginator over the list of campaign statistics events
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<CampaignStatisticsEvents>
           allEvents(@Nullable CampaignStatisticsEventsListOptions options,
                     @NonNull CampaignStatistics campaignStatistics) throws MbedCloudException {
        return ((DeviceUpdate) getModuleOrThrow()).allEvents(options, campaignStatistics);
    }

    /**
     * Creates a {@link Paginator} for the list of campaign statistics events matching filter options.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.DeviceUpdate#allEvents(String, String, com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsEventsListOptions)}
     * 
     * @param campaignId
     *            The campaign ID.
     * @param id
     *            The summary status. For example, fail.
     * @param options
     *            list options.
     * @return paginator over the list of campaign statistics events
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<CampaignStatisticsEvents>
           allEvents(@NonNull String campaignId, @NonNull String id,
                     @Nullable CampaignStatisticsEventsListOptions options) throws MbedCloudException {
        return ((DeviceUpdate) getModuleOrThrow()).allEvents(campaignId, id, options);
    }

    /**
     * Get a list of events grouped by summary .
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsDao#events(com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsEventsListOptions, com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatistics)}
     * 
     * @param options
     *            list options.
     * @return the list of campaign statistics events corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<CampaignStatisticsEvents>
           events(@Nullable CampaignStatisticsEventsListOptions options) throws MbedCloudException {
        return events(options, getModel());
    }

    /**
     * Get a list of events grouped by summary .
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.DeviceUpdate#events(com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsEventsListOptions, com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatistics)}
     * 
     * @param options
     *            list options.
     * @param campaignStatistics
     *            a campaign statistics.
     * @return the list of campaign statistics events corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<CampaignStatisticsEvents>
           events(@Nullable CampaignStatisticsEventsListOptions options,
                  @NonNull CampaignStatistics campaignStatistics) throws MbedCloudException {
        return ((DeviceUpdate) getModuleOrThrow()).events(options, campaignStatistics);
    }

    /**
     * Get a list of events grouped by summary .
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.DeviceUpdate#events(String, String, com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsEventsListOptions)}
     * 
     * @param campaignId
     *            The campaign ID.
     * @param id
     *            The summary status. For example, fail.
     * @param options
     *            list options.
     * @return the list of campaign statistics events corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ListResponse<CampaignStatisticsEvents>
           events(@NonNull String campaignId, @NonNull String id,
                  @Nullable CampaignStatisticsEventsListOptions options) throws MbedCloudException {
        return ((DeviceUpdate) getModuleOrThrow()).events(campaignId, id, options);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected CampaignStatistics instantiateModel() {
        return new CampaignStatistics();
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
        return new DeviceUpdate(client);
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
        return new DeviceUpdate(options);
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
        return new DeviceUpdate(context);
    }

    /**
     * Gets a campaign statistics.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsDao#read(com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatistics)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public CampaignStatistics read() throws MbedCloudException {
        return read(getModel());
    }

    /**
     * Gets a campaign statistics.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.DeviceUpdate#readCampaignStatistics(com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatistics)}
     * 
     * @param campaignStatistics
     *            a campaign statistics.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public CampaignStatistics read(@NonNull CampaignStatistics campaignStatistics) throws MbedCloudException {
        return setAndGetModel(((DeviceUpdate) getModuleOrThrow()).readCampaignStatistics(campaignStatistics));
    }

    /**
     * Gets a campaign statistics.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.DeviceUpdate#readCampaignStatistics(String, com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsId)}
     * 
     * @param campaignId
     *            ID of the associated campaign.
     * @param id
     *            ID of the event type description.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public CampaignStatistics read(@NonNull String campaignId,
                                   @NonNull CampaignStatisticsId id) throws MbedCloudException {
        return setAndGetModel(((DeviceUpdate) getModuleOrThrow()).readCampaignStatistics(campaignId, id));
    }
}
