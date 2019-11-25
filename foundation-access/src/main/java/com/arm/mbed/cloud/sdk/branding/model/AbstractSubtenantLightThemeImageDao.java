// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [SubtenantLightThemeImageDao]
package com.arm.mbed.cloud.sdk.branding.model;

import com.arm.mbed.cloud.sdk.Branding;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.DeleteDao;
import com.arm.mbed.cloud.sdk.common.dao.ReadDao;
import com.arm.mbed.cloud.sdk.common.dao.UpdateDao;
import com.arm.mbed.cloud.sdk.common.model.DataFile;

/**
 * Data Access Object (DAO) for subtenant light theme images.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for subtenant light theme images.")
public abstract class AbstractSubtenantLightThemeImageDao extends AbstractModelDao<SubtenantLightThemeImage>
                                                          implements UpdateDao<SubtenantLightThemeImage>,
                                                          DeleteDao<SubtenantLightThemeImage>,
                                                          ReadDao<SubtenantLightThemeImage> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractSubtenantLightThemeImageDao() throws MbedCloudException {
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
    public AbstractSubtenantLightThemeImageDao(ApiClientWrapper client) throws MbedCloudException {
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
    public AbstractSubtenantLightThemeImageDao(ConnectionOptions options) throws MbedCloudException {
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
    public AbstractSubtenantLightThemeImageDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Deletes a subtenant light theme image.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImageDao#delete(String, com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImage)}
     * 
     * @param accountId
     *            The ID of the account.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull String accountId) throws MbedCloudException {
        delete(accountId, getModel());
    }

    /**
     * Deletes a subtenant light theme image.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#deleteSubtenantLightThemeImage(String, com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImage)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param subtenantLightThemeImage
     *            a subtenant light theme image.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void delete(@NonNull String accountId,
                       @NonNull SubtenantLightThemeImage subtenantLightThemeImage) throws MbedCloudException {
        ((Branding) getModuleOrThrow()).deleteSubtenantLightThemeImage(accountId, subtenantLightThemeImage);
    }

    /**
     * Deletes a subtenant light theme image.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#deleteSubtenantLightThemeImage(String, com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImageReference)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param reference
     *            Name of the branding images (icon or picture).
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void delete(@NonNull String accountId,
                       @NonNull SubtenantLightThemeImageReference reference) throws MbedCloudException {
        ((Branding) getModuleOrThrow()).deleteSubtenantLightThemeImage(accountId, reference);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected SubtenantLightThemeImage instantiateModel() {
        return new SubtenantLightThemeImage();
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
        return new Branding(client);
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
        return new Branding(options);
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
        return new Branding(context);
    }

    /**
     * Gets a subtenant light theme image.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImageDao#read(String, com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImage)}
     * 
     * @param accountId
     *            The ID of the account.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantLightThemeImage read(@NonNull String accountId) throws MbedCloudException {
        return read(accountId, getModel());
    }

    /**
     * Gets a subtenant light theme image.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#readSubtenantLightThemeImage(String, com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImage)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param subtenantLightThemeImage
     *            a subtenant light theme image.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantLightThemeImage
           read(@NonNull String accountId,
                @NonNull SubtenantLightThemeImage subtenantLightThemeImage) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).readSubtenantLightThemeImage(accountId,
                                                                                           subtenantLightThemeImage));
    }

    /**
     * Gets a subtenant light theme image.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#readSubtenantLightThemeImage(String, com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImageReference)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param reference
     *            Name of the image.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantLightThemeImage
           read(@NonNull String accountId,
                @NonNull SubtenantLightThemeImageReference reference) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).readSubtenantLightThemeImage(accountId, reference));
    }

    /**
     * Modifies a subtenant light theme image.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImageDao#update(String, com.arm.mbed.cloud.sdk.common.model.DataFile, com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImage)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param image
     *            The image in PNG or JPEG format as multipart form data.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantLightThemeImage update(@NonNull String accountId,
                                           @NonNull DataFile image) throws MbedCloudException {
        return update(accountId, image, getModel());
    }

    /**
     * Modifies a subtenant light theme image.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#updateSubtenantLightThemeImage(String, com.arm.mbed.cloud.sdk.common.model.DataFile, com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImage)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param image
     *            The image in PNG or JPEG format as multipart form data.
     * @param subtenantLightThemeImage
     *            a subtenant light theme image.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantLightThemeImage
           update(@NonNull String accountId, @NonNull DataFile image,
                  @NonNull SubtenantLightThemeImage subtenantLightThemeImage) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).updateSubtenantLightThemeImage(accountId, image,
                                                                                             subtenantLightThemeImage));
    }

    /**
     * Modifies a subtenant light theme image.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#updateSubtenantLightThemeImage(String, com.arm.mbed.cloud.sdk.common.model.DataFile, com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImageReference)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param image
     *            The image in PNG or JPEG format as multipart form data.
     * @param reference
     *            Name of the image.
     * @return an updated subtenant light theme image
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantLightThemeImage
           update(@NonNull String accountId, @NonNull DataFile image,
                  @NonNull SubtenantLightThemeImageReference reference) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).updateSubtenantLightThemeImage(accountId, image,
                                                                                             reference));
    }
}
