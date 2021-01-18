// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.adapters;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImage;
import com.arm.mbed.cloud.sdk.branding.model.SubtenantLightThemeImageReference;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BrandingImage;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BrandingImageList;
import java.util.List;

/**
 * Adapter for subtenant light theme images.
 */
@Preamble(description = "Adapter for subtenant light theme images.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class SubtenantLightThemeImageAdapter {
    /**
     * Constructor.
     */
    private SubtenantLightThemeImageAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps a branding image into a subtenant light theme image.
     * 
     * @param toBeMapped
     *            a branding image.
     * @return mapped a subtenant light theme image
     */
    @Internal
    public static SubtenantLightThemeImage map(BrandingImage toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final SubtenantLightThemeImage subtenantLightThemeImage = new SubtenantLightThemeImage(toBeMapped.getStaticUri(),
                                                                                               TranslationUtils.toDate(toBeMapped.getUpdatedAt()));
        subtenantLightThemeImage.setReference(translateToSubtenantLightThemeImageReference(toBeMapped.getReference()));
        return subtenantLightThemeImage;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<BrandingImage, SubtenantLightThemeImage> getMapper() {
        return new GenericAdapter.Mapper<BrandingImage, SubtenantLightThemeImage>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public SubtenantLightThemeImage map(BrandingImage toBeMapped) {
                return SubtenantLightThemeImageAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a reference enum.
     * @return mapped enum value
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    protected static SubtenantLightThemeImageReference
              translateToSubtenantLightThemeImageReference(BrandingImage.ReferenceEnum toBeMapped) {
        if (toBeMapped == null) {
            return SubtenantLightThemeImageReference.getUnknownEnum();
        }
        switch (toBeMapped) {
            case BRAND_LOGO_PORTRAIT:
                return SubtenantLightThemeImageReference.BRAND_LOGO_PORTRAIT;
            case BRAND_LOGO_SQUARE:
                return SubtenantLightThemeImageReference.BRAND_LOGO_SQUARE;
            case BRAND_LOGO_LANDSCAPE:
                return SubtenantLightThemeImageReference.BRAND_LOGO_LANDSCAPE;
            case BRAND_LOGO_EMAIL:
                return SubtenantLightThemeImageReference.BRAND_LOGO_EMAIL;
            case APP_LOGO_LANDSCAPE:
                return SubtenantLightThemeImageReference.APP_LOGO_LANDSCAPE;
            case APP_LOGO_PORTRAIT:
                return SubtenantLightThemeImageReference.APP_LOGO_PORTRAIT;
            case APP_LOGO_SQUARE:
                return SubtenantLightThemeImageReference.APP_LOGO_SQUARE;
            case DESKTOP_BACKGROUND_LANDSCAPE:
                return SubtenantLightThemeImageReference.DESKTOP_BACKGROUND_LANDSCAPE;
            case DESKTOP_BACKGROUND_SQUARE:
                return SubtenantLightThemeImageReference.DESKTOP_BACKGROUND_SQUARE;
            case DESKTOP_BACKGROUND_PORTRAIT:
                return SubtenantLightThemeImageReference.DESKTOP_BACKGROUND_PORTRAIT;
            case CAROUSEL_IMAGE_PORTRAIT_0:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_PORTRAIT_0;
            case CAROUSEL_IMAGE_PORTRAIT_1:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_PORTRAIT_1;
            case CAROUSEL_IMAGE_PORTRAIT_2:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_PORTRAIT_2;
            case CAROUSEL_IMAGE_PORTRAIT_3:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_PORTRAIT_3;
            case CAROUSEL_IMAGE_PORTRAIT_4:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_PORTRAIT_4;
            case CAROUSEL_IMAGE_PORTRAIT_5:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_PORTRAIT_5;
            case CAROUSEL_IMAGE_PORTRAIT_6:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_PORTRAIT_6;
            case CAROUSEL_IMAGE_PORTRAIT_7:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_PORTRAIT_7;
            case CAROUSEL_IMAGE_PORTRAIT_8:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_PORTRAIT_8;
            case CAROUSEL_IMAGE_PORTRAIT_9:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_PORTRAIT_9;
            case CAROUSEL_IMAGE_SQUARE_0:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_SQUARE_0;
            case CAROUSEL_IMAGE_SQUARE_1:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_SQUARE_1;
            case CAROUSEL_IMAGE_SQUARE_2:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_SQUARE_2;
            case CAROUSEL_IMAGE_SQUARE_3:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_SQUARE_3;
            case CAROUSEL_IMAGE_SQUARE_4:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_SQUARE_4;
            case CAROUSEL_IMAGE_SQUARE_5:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_SQUARE_5;
            case CAROUSEL_IMAGE_SQUARE_6:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_SQUARE_6;
            case CAROUSEL_IMAGE_SQUARE_7:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_SQUARE_7;
            case CAROUSEL_IMAGE_SQUARE_8:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_SQUARE_8;
            case CAROUSEL_IMAGE_SQUARE_9:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_SQUARE_9;
            case CAROUSEL_IMAGE_LANDSCAPE_0:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_LANDSCAPE_0;
            case CAROUSEL_IMAGE_LANDSCAPE_1:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_LANDSCAPE_1;
            case CAROUSEL_IMAGE_LANDSCAPE_2:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_LANDSCAPE_2;
            case CAROUSEL_IMAGE_LANDSCAPE_3:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_LANDSCAPE_3;
            case CAROUSEL_IMAGE_LANDSCAPE_4:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_LANDSCAPE_4;
            case CAROUSEL_IMAGE_LANDSCAPE_5:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_LANDSCAPE_5;
            case CAROUSEL_IMAGE_LANDSCAPE_6:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_LANDSCAPE_6;
            case CAROUSEL_IMAGE_LANDSCAPE_7:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_LANDSCAPE_7;
            case CAROUSEL_IMAGE_LANDSCAPE_8:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_LANDSCAPE_8;
            case CAROUSEL_IMAGE_LANDSCAPE_9:
                return SubtenantLightThemeImageReference.CAROUSEL_IMAGE_LANDSCAPE_9;
            default:
                return SubtenantLightThemeImageReference.getUnknownEnum();
        }
    }

    /**
     * Maps a branding image list into a subtenant light theme image.
     * 
     * @param toBeMapped
     *            a branding image list.
     * @return mapped list response
     */
    @Internal
    public static ListResponse<SubtenantLightThemeImage> mapList(BrandingImageList toBeMapped) {
        final BrandingImageList finalList = toBeMapped;
        final GenericAdapter.RespList<BrandingImage> respList = new GenericAdapter.RespList<BrandingImage>() {
            /**
             * Executes getAfter.
             * 
             * @return something
             */
            @Override
            public String getAfter() {
                return (finalList == null) ? null : finalList.getAfter();
            }

            /**
             * Executes getContinuationMarker.
             * 
             * @return something
             */
            @Override
            public String getContinuationMarker() {
                return null;
            }

            /**
             * Executes getData.
             * 
             * @return something
             */
            @Override
            public List<BrandingImage> getData() {
                return (finalList == null) ? null : finalList.getData();
            }

            /**
             * Executes getHasMore.
             * 
             * @return something
             */
            @Override
            public Boolean getHasMore() {
                return (finalList == null) ? null : finalList.isHasMore();
            }

            /**
             * Executes getLimit.
             * 
             * @return something
             */
            @Override
            public Integer getLimit() {
                return (finalList == null) ? null : finalList.getLimit();
            }

            /**
             * Executes getOrder.
             * 
             * @return something
             */
            @Override
            public String getOrder() {
                return (finalList == null) ? null : finalList.getOrder().toString();
            }

            /**
             * Executes getTotalCount.
             * 
             * @return something
             */
            @Override
            public Integer getTotalCount() {
                return (finalList == null) ? null : finalList.getTotalCount();
            }
        };
        return GenericAdapter.mapList(respList, SubtenantLightThemeImageAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<BrandingImageList, ListResponse<SubtenantLightThemeImage>> getListMapper() {
        return new GenericAdapter.Mapper<BrandingImageList, ListResponse<SubtenantLightThemeImage>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public ListResponse<SubtenantLightThemeImage> map(BrandingImageList toBeMapped) {
                return SubtenantLightThemeImageAdapter.mapList(toBeMapped);
            }
        };
    }
}
