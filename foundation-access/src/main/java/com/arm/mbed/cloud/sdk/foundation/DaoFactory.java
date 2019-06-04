// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.foundation;

import com.arm.mbed.cloud.sdk.accounts.model.AccountDao;
import com.arm.mbed.cloud.sdk.accounts.model.AccountListDao;
import com.arm.mbed.cloud.sdk.accounts.model.ApiKeyDao;
import com.arm.mbed.cloud.sdk.accounts.model.ApiKeyListDao;
import com.arm.mbed.cloud.sdk.accounts.model.SubtenantApiKeyDao;
import com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserDao;
import com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserInvitationDao;
import com.arm.mbed.cloud.sdk.accounts.model.UserDao;
import com.arm.mbed.cloud.sdk.accounts.model.UserInvitationDao;
import com.arm.mbed.cloud.sdk.accounts.model.UserInvitationListDao;
import com.arm.mbed.cloud.sdk.accounts.model.UserListDao;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorDao;
import com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorListDao;
import com.arm.mbed.cloud.sdk.branding.model.DarkThemeImageDao;
import com.arm.mbed.cloud.sdk.branding.model.DarkThemeImageListDao;
import com.arm.mbed.cloud.sdk.branding.model.LightThemeColorDao;
import com.arm.mbed.cloud.sdk.branding.model.LightThemeColorListDao;
import com.arm.mbed.cloud.sdk.branding.model.LightThemeImageDao;
import com.arm.mbed.cloud.sdk.branding.model.LightThemeImageListDao;
import com.arm.mbed.cloud.sdk.branding.model.SubtenantDarkThemeColorDao;
import com.arm.mbed.cloud.sdk.branding.model.SubtenantDarkThemeColorListDao;
import com.arm.mbed.cloud.sdk.branding.model.SubtenantDarkThemeImageDao;
import com.arm.mbed.cloud.sdk.branding.model.SubtenantDarkThemeImageListDao;
import com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeColorDao;
import com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeColorListDao;
import com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImageDao;
import com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImageListDao;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.DaoProvider;
import com.arm.mbed.cloud.sdk.devices.model.DeviceDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDeleteDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentDenialDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentDenialListDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentListDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEventsDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEventsListDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceGroupDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceGroupListDao;
import com.arm.mbed.cloud.sdk.devices.model.DeviceListDao;
import com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignDeviceMetadataDao;
import com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsDao;
import com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsEventsDao;
import com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsListDao;
import com.arm.mbed.cloud.sdk.deviceupdate.model.FirmwareImageDao;
import com.arm.mbed.cloud.sdk.deviceupdate.model.FirmwareImageListDao;
import com.arm.mbed.cloud.sdk.deviceupdate.model.FirmwareManifestDao;
import com.arm.mbed.cloud.sdk.deviceupdate.model.FirmwareManifestListDao;
import com.arm.mbed.cloud.sdk.deviceupdate.model.UpdateCampaignDao;
import com.arm.mbed.cloud.sdk.deviceupdate.model.UpdateCampaignListDao;
import com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentDao;
import com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListDao;
import com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfigDao;
import com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfigListDao;
import com.arm.mbed.cloud.sdk.security.model.CertificateIssuerDao;
import com.arm.mbed.cloud.sdk.security.model.CertificateIssuerListDao;
import com.arm.mbed.cloud.sdk.security.model.DeveloperCertificateDao;
import com.arm.mbed.cloud.sdk.security.model.PreSharedKeyDao;
import com.arm.mbed.cloud.sdk.security.model.PreSharedKeyListDao;
import com.arm.mbed.cloud.sdk.security.model.ServerCredentialsDao;
import com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateDao;
import com.arm.mbed.cloud.sdk.security.model.TrustedCertificateDao;
import com.arm.mbed.cloud.sdk.security.model.TrustedCertificateListDao;

/**
 * Factory for SDK DAOs.
 * <p>
 * Utility for fetching DAOs similar to DaoProvider but without using reflection
 */
@Preamble(description = "Factory for SDK DAOs.")
@Internal
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class DaoFactory implements Cloneable {
    /**
     * Context.
     */
    @Internal
    @Required
    private final SdkContext context;

    /**
     * Constructor.
     *
     * <p>
     * Constructor based on all fields.
     * <p>
     *
     * @param context
     *            Context.
     */
    public DaoFactory(SdkContext context) {
        super();
        this.context = context;
    }

    /**
     * Constructor.
     */
    public DaoFactory() {
        this((SdkContext) null);
    }

    /**
     * Constructor.
     *
     * <p>
     * Constructor based on a similar object.
     * <p>
     *
     * @param daoFactory
     *            a dao factory.
     */
    public DaoFactory(DaoFactory daoFactory) {
        this(daoFactory == null ? (SdkContext) null : daoFactory.context);
    }

    /**
     * Method to ensure {@link #equals(Object)} is correct.
     *
     * <p>
     * Note: see this article: <a href="https://www.artima.com/lejava/articles/equality.html">canEqual()</a>
     * 
     * @param other
     *            another object.
     * @return true if the other object is an instance of the class in which canEqual is (re)defined, false otherwise.
     */
    protected boolean canEqual(Object other) {
        return other instanceof DaoFactory;
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
    public DaoFactory clone() {
        return new DaoFactory(this);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * <p>
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     * @param obj
     *            an object to compare with this instance.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DaoFactory)) {
            return false;
        }
        final DaoFactory other = (DaoFactory) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (context == null) {
            if (other.context != null) {
                return false;
            }
        } else if (!context.equals(other.context)) {
            return false;
        }
        return true;
    }

    /**
     * Gets an account dao.
     * 
     * @return an account dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public AccountDao getAccountDao() throws MbedCloudException {
        return new AccountDao().configureAndGet(context);
    }

    /**
     * Gets an account list dao.
     * 
     * @return an account list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public AccountListDao getAccountListDao() throws MbedCloudException {
        return new AccountListDao().configureAndGet(context);
    }

    /**
     * Gets an api key dao.
     * 
     * @return an api key dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public ApiKeyDao getApiKeyDao() throws MbedCloudException {
        return new ApiKeyDao().configureAndGet(context);
    }

    /**
     * Gets an api key list dao.
     * 
     * @return an api key list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public ApiKeyListDao getApiKeyListDao() throws MbedCloudException {
        return new ApiKeyListDao().configureAndGet(context);
    }

    /**
     * Gets a campaign device metadata dao.
     * 
     * @return a campaign device metadata dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public CampaignDeviceMetadataDao getCampaignDeviceMetadataDao() throws MbedCloudException {
        return new CampaignDeviceMetadataDao().configureAndGet(context);
    }

    /**
     * Gets a campaign statistics dao.
     * 
     * @return a campaign statistics dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public CampaignStatisticsDao getCampaignStatisticsDao() throws MbedCloudException {
        return new CampaignStatisticsDao().configureAndGet(context);
    }

    /**
     * Gets a campaign statistics events dao.
     * 
     * @return a campaign statistics events dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public CampaignStatisticsEventsDao getCampaignStatisticsEventsDao() throws MbedCloudException {
        return new CampaignStatisticsEventsDao().configureAndGet(context);
    }

    /**
     * Gets a campaign statistics list dao.
     * 
     * @return a campaign statistics list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public CampaignStatisticsListDao getCampaignStatisticsListDao() throws MbedCloudException {
        return new CampaignStatisticsListDao().configureAndGet(context);
    }

    /**
     * Gets a certificate enrollment dao.
     * 
     * @return a certificate enrollment dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public CertificateEnrollmentDao getCertificateEnrollmentDao() throws MbedCloudException {
        return new CertificateEnrollmentDao().configureAndGet(context);
    }

    /**
     * Gets a certificate enrollment list dao.
     * 
     * @return a certificate enrollment list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public CertificateEnrollmentListDao getCertificateEnrollmentListDao() throws MbedCloudException {
        return new CertificateEnrollmentListDao().configureAndGet(context);
    }

    /**
     * Gets a certificate issuer config dao.
     * 
     * @return a certificate issuer config dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public CertificateIssuerConfigDao getCertificateIssuerConfigDao() throws MbedCloudException {
        return new CertificateIssuerConfigDao().configureAndGet(context);
    }

    /**
     * Gets a certificate issuer config list dao.
     * 
     * @return a certificate issuer config list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public CertificateIssuerConfigListDao getCertificateIssuerConfigListDao() throws MbedCloudException {
        return new CertificateIssuerConfigListDao().configureAndGet(context);
    }

    /**
     * Gets a certificate issuer dao.
     * 
     * @return a certificate issuer dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public CertificateIssuerDao getCertificateIssuerDao() throws MbedCloudException {
        return new CertificateIssuerDao().configureAndGet(context);
    }

    /**
     * Gets a certificate issuer list dao.
     * 
     * @return a certificate issuer list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public CertificateIssuerListDao getCertificateIssuerListDao() throws MbedCloudException {
        return new CertificateIssuerListDao().configureAndGet(context);
    }

    /**
     * Gets context.
     * 
     * @return context
     */
    @Internal
    public SdkContext getContext() {
        return context;
    }

    /**
     * Gets a dao provider.
     * 
     * @return a dao provider
     */
    public DaoProvider getDaoProvider() {
        return new DaoProvider(context);
    }

    /**
     * Gets a dark theme color dao.
     * 
     * @return a dark theme color dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DarkThemeColorDao getDarkThemeColorDao() throws MbedCloudException {
        return new DarkThemeColorDao().configureAndGet(context);
    }

    /**
     * Gets a dark theme color list dao.
     * 
     * @return a dark theme color list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DarkThemeColorListDao getDarkThemeColorListDao() throws MbedCloudException {
        return new DarkThemeColorListDao().configureAndGet(context);
    }

    /**
     * Gets a dark theme image dao.
     * 
     * @return a dark theme image dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DarkThemeImageDao getDarkThemeImageDao() throws MbedCloudException {
        return new DarkThemeImageDao().configureAndGet(context);
    }

    /**
     * Gets a dark theme image list dao.
     * 
     * @return a dark theme image list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DarkThemeImageListDao getDarkThemeImageListDao() throws MbedCloudException {
        return new DarkThemeImageListDao().configureAndGet(context);
    }

    /**
     * Gets a developer certificate dao.
     * 
     * @return a developer certificate dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeveloperCertificateDao getDeveloperCertificateDao() throws MbedCloudException {
        return new DeveloperCertificateDao().configureAndGet(context);
    }

    /**
     * Gets a device dao.
     * 
     * @return a device dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceDao getDeviceDao() throws MbedCloudException {
        return new DeviceDao().configureAndGet(context);
    }

    /**
     * Gets a device enrollment bulk create dao.
     * 
     * @return a device enrollment bulk create dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceEnrollmentBulkCreateDao getDeviceEnrollmentBulkCreateDao() throws MbedCloudException {
        return new DeviceEnrollmentBulkCreateDao().configureAndGet(context);
    }

    /**
     * Gets a device enrollment bulk delete dao.
     * 
     * @return a device enrollment bulk delete dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceEnrollmentBulkDeleteDao getDeviceEnrollmentBulkDeleteDao() throws MbedCloudException {
        return new DeviceEnrollmentBulkDeleteDao().configureAndGet(context);
    }

    /**
     * Gets a device enrollment dao.
     * 
     * @return a device enrollment dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceEnrollmentDao getDeviceEnrollmentDao() throws MbedCloudException {
        return new DeviceEnrollmentDao().configureAndGet(context);
    }

    /**
     * Gets a device enrollment denial dao.
     * 
     * @return a device enrollment denial dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceEnrollmentDenialDao getDeviceEnrollmentDenialDao() throws MbedCloudException {
        return new DeviceEnrollmentDenialDao().configureAndGet(context);
    }

    /**
     * Gets a device enrollment denial list dao.
     * 
     * @return a device enrollment denial list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceEnrollmentDenialListDao getDeviceEnrollmentDenialListDao() throws MbedCloudException {
        return new DeviceEnrollmentDenialListDao().configureAndGet(context);
    }

    /**
     * Gets a device enrollment list dao.
     * 
     * @return a device enrollment list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceEnrollmentListDao getDeviceEnrollmentListDao() throws MbedCloudException {
        return new DeviceEnrollmentListDao().configureAndGet(context);
    }

    /**
     * Gets a device events dao.
     * 
     * @return a device events dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceEventsDao getDeviceEventsDao() throws MbedCloudException {
        return new DeviceEventsDao().configureAndGet(context);
    }

    /**
     * Gets a device events list dao.
     * 
     * @return a device events list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceEventsListDao getDeviceEventsListDao() throws MbedCloudException {
        return new DeviceEventsListDao().configureAndGet(context);
    }

    /**
     * Gets a device group dao.
     * 
     * @return a device group dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceGroupDao getDeviceGroupDao() throws MbedCloudException {
        return new DeviceGroupDao().configureAndGet(context);
    }

    /**
     * Gets a device group list dao.
     * 
     * @return a device group list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceGroupListDao getDeviceGroupListDao() throws MbedCloudException {
        return new DeviceGroupListDao().configureAndGet(context);
    }

    /**
     * Gets a device list dao.
     * 
     * @return a device list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public DeviceListDao getDeviceListDao() throws MbedCloudException {
        return new DeviceListDao().configureAndGet(context);
    }

    /**
     * Gets a firmware image dao.
     * 
     * @return a firmware image dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public FirmwareImageDao getFirmwareImageDao() throws MbedCloudException {
        return new FirmwareImageDao().configureAndGet(context);
    }

    /**
     * Gets a firmware image list dao.
     * 
     * @return a firmware image list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public FirmwareImageListDao getFirmwareImageListDao() throws MbedCloudException {
        return new FirmwareImageListDao().configureAndGet(context);
    }

    /**
     * Gets a firmware manifest dao.
     * 
     * @return a firmware manifest dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public FirmwareManifestDao getFirmwareManifestDao() throws MbedCloudException {
        return new FirmwareManifestDao().configureAndGet(context);
    }

    /**
     * Gets a firmware manifest list dao.
     * 
     * @return a firmware manifest list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public FirmwareManifestListDao getFirmwareManifestListDao() throws MbedCloudException {
        return new FirmwareManifestListDao().configureAndGet(context);
    }

    /**
     * Gets a light theme color dao.
     * 
     * @return a light theme color dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public LightThemeColorDao getLightThemeColorDao() throws MbedCloudException {
        return new LightThemeColorDao().configureAndGet(context);
    }

    /**
     * Gets a light theme color list dao.
     * 
     * @return a light theme color list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public LightThemeColorListDao getLightThemeColorListDao() throws MbedCloudException {
        return new LightThemeColorListDao().configureAndGet(context);
    }

    /**
     * Gets a light theme image dao.
     * 
     * @return a light theme image dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public LightThemeImageDao getLightThemeImageDao() throws MbedCloudException {
        return new LightThemeImageDao().configureAndGet(context);
    }

    /**
     * Gets a light theme image list dao.
     * 
     * @return a light theme image list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public LightThemeImageListDao getLightThemeImageListDao() throws MbedCloudException {
        return new LightThemeImageListDao().configureAndGet(context);
    }

    /**
     * Gets a pre shared key dao.
     * 
     * @return a pre shared key dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public PreSharedKeyDao getPreSharedKeyDao() throws MbedCloudException {
        return new PreSharedKeyDao().configureAndGet(context);
    }

    /**
     * Gets a pre shared key list dao.
     * 
     * @return a pre shared key list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public PreSharedKeyListDao getPreSharedKeyListDao() throws MbedCloudException {
        return new PreSharedKeyListDao().configureAndGet(context);
    }

    /**
     * Gets a server credentials dao.
     * 
     * @return a server credentials dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public ServerCredentialsDao getServerCredentialsDao() throws MbedCloudException {
        return new ServerCredentialsDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant api key dao.
     * 
     * @return a subtenant api key dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantApiKeyDao getSubtenantApiKeyDao() throws MbedCloudException {
        return new SubtenantApiKeyDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant dark theme color dao.
     * 
     * @return a subtenant dark theme color dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantDarkThemeColorDao getSubtenantDarkThemeColorDao() throws MbedCloudException {
        return new SubtenantDarkThemeColorDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant dark theme color list dao.
     * 
     * @return a subtenant dark theme color list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantDarkThemeColorListDao getSubtenantDarkThemeColorListDao() throws MbedCloudException {
        return new SubtenantDarkThemeColorListDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant dark theme image dao.
     * 
     * @return a subtenant dark theme image dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantDarkThemeImageDao getSubtenantDarkThemeImageDao() throws MbedCloudException {
        return new SubtenantDarkThemeImageDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant dark theme image list dao.
     * 
     * @return a subtenant dark theme image list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantDarkThemeImageListDao getSubtenantDarkThemeImageListDao() throws MbedCloudException {
        return new SubtenantDarkThemeImageListDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant light theme color dao.
     * 
     * @return a subtenant light theme color dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantLightThemeColorDao getSubtenantLightThemeColorDao() throws MbedCloudException {
        return new SubtenantLightThemeColorDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant light theme color list dao.
     * 
     * @return a subtenant light theme color list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantLightThemeColorListDao getSubtenantLightThemeColorListDao() throws MbedCloudException {
        return new SubtenantLightThemeColorListDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant light theme image dao.
     * 
     * @return a subtenant light theme image dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantLightThemeImageDao getSubtenantLightThemeImageDao() throws MbedCloudException {
        return new SubtenantLightThemeImageDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant light theme image list dao.
     * 
     * @return a subtenant light theme image list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantLightThemeImageListDao getSubtenantLightThemeImageListDao() throws MbedCloudException {
        return new SubtenantLightThemeImageListDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant trusted certificate dao.
     * 
     * @return a subtenant trusted certificate dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantTrustedCertificateDao getSubtenantTrustedCertificateDao() throws MbedCloudException {
        return new SubtenantTrustedCertificateDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant user dao.
     * 
     * @return a subtenant user dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantUserDao getSubtenantUserDao() throws MbedCloudException {
        return new SubtenantUserDao().configureAndGet(context);
    }

    /**
     * Gets a subtenant user invitation dao.
     * 
     * @return a subtenant user invitation dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public SubtenantUserInvitationDao getSubtenantUserInvitationDao() throws MbedCloudException {
        return new SubtenantUserInvitationDao().configureAndGet(context);
    }

    /**
     * Gets a trusted certificate dao.
     * 
     * @return a trusted certificate dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public TrustedCertificateDao getTrustedCertificateDao() throws MbedCloudException {
        return new TrustedCertificateDao().configureAndGet(context);
    }

    /**
     * Gets a trusted certificate list dao.
     * 
     * @return a trusted certificate list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public TrustedCertificateListDao getTrustedCertificateListDao() throws MbedCloudException {
        return new TrustedCertificateListDao().configureAndGet(context);
    }

    /**
     * Gets an update campaign dao.
     * 
     * @return an update campaign dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public UpdateCampaignDao getUpdateCampaignDao() throws MbedCloudException {
        return new UpdateCampaignDao().configureAndGet(context);
    }

    /**
     * Gets an update campaign list dao.
     * 
     * @return an update campaign list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public UpdateCampaignListDao getUpdateCampaignListDao() throws MbedCloudException {
        return new UpdateCampaignListDao().configureAndGet(context);
    }

    /**
     * Gets a user dao.
     * 
     * @return a user dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public UserDao getUserDao() throws MbedCloudException {
        return new UserDao().configureAndGet(context);
    }

    /**
     * Gets a user invitation dao.
     * 
     * @return a user invitation dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public UserInvitationDao getUserInvitationDao() throws MbedCloudException {
        return new UserInvitationDao().configureAndGet(context);
    }

    /**
     * Gets a user invitation list dao.
     * 
     * @return a user invitation list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public UserInvitationListDao getUserInvitationListDao() throws MbedCloudException {
        return new UserInvitationListDao().configureAndGet(context);
    }

    /**
     * Gets a user list dao.
     * 
     * @return a user list dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @SuppressWarnings("resource")
    public UserListDao getUserListDao() throws MbedCloudException {
        return new UserListDao().configureAndGet(context);
    }

    /**
     * Calculates the hash code of this instance based on field values.
     *
     * <p>
     * 
     * @see java.lang.Object#hashCode()
     * @return hash code
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((context == null) ? 0 : context.hashCode());
        return result;
    }

    /**
     * Returns a string representation of the object.
     *
     * <p>
     * 
     * @see java.lang.Object#toString()
     * @return the string representation
     */
    @Override
    public String toString() {
        return "DaoFactory [context=" + context + "]";
    }
}
