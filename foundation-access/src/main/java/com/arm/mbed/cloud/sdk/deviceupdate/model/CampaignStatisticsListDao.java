// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Tue May 14 13:12:52 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import com.arm.mbed.cloud.sdk.DeviceUpdate;
import com.arm.mbed.cloud.sdk.annotations.NotImplemented;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.common.listing.Paginator;

/**
 * Data Access Object (DAO) for listing campaign statistics.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing campaign statistics.")
public class CampaignStatisticsListDao extends AbstractCampaignStatisticsListDao {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public CampaignStatisticsListDao() throws MbedCloudException {
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
    public CampaignStatisticsListDao(ApiClientWrapper client) throws MbedCloudException {
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
    public CampaignStatisticsListDao(ConnectionOptions options) throws MbedCloudException {
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
    public CampaignStatisticsListDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
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
    public CampaignStatisticsListDao clone() {
        try {
            return new CampaignStatisticsListDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                              : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Lists campaign statistics matching filter options.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.DeviceUpdate#listCampaignStatisticss(String, com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of campaign statistics
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    protected ListResponse<CampaignStatistics>
              requestOnePage(CampaignStatisticsListOptions options) throws MbedCloudException, NotImplementedException {
        throw new NotImplementedException();
    }

    /**
     * Lists campaign statistics matching filter options.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.DeviceUpdate#listAllCampaignStatisticss(String, com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsListOptions)}
     * 
     * @param campaignId
     *            related campaign
     * @param options
     *            list options.
     * @return one page of campaign statistics
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Paginator<CampaignStatistics> list(String campaignId,
                                              CampaignStatisticsListOptions options) throws MbedCloudException,
                                                                                     NotImplementedException {
        return ((DeviceUpdate) getModuleOrThrow()).listAllCampaignStatisticss(campaignId, options);
    }

}