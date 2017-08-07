package com.arm.mbed.cloud.sdk.internal.api;

import com.arm.mbed.cloud.sdk.internal.ApiClient;
import com.arm.mbed.cloud.sdk.internal.model.CampaignDeviceMetadata;
import com.arm.mbed.cloud.sdk.internal.model.CampaignDeviceMetadataPage;
import java.io.File;
import com.arm.mbed.cloud.sdk.internal.model.FirmwareImage;
import com.arm.mbed.cloud.sdk.internal.model.FirmwareImagePage;
import com.arm.mbed.cloud.sdk.internal.model.FirmwareManifest;
import com.arm.mbed.cloud.sdk.internal.model.FirmwareManifestPage;
import com.arm.mbed.cloud.sdk.internal.model.UpdateCampaign;
import com.arm.mbed.cloud.sdk.internal.model.UpdateCampaignPage;
import com.arm.mbed.cloud.sdk.internal.model.UpdateCampaignPatchRequest;
import com.arm.mbed.cloud.sdk.internal.model.UpdateCampaignPostRequest;
import com.arm.mbed.cloud.sdk.internal.model.UpdateCampaignPutRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DefaultApi.class);
    }

    
    /**
     * 
     *
     * Create firmware image.
     */
    @Test
    public void firmwareImageCreateTest() {
        File datafile = null;
        String name = null;
        String description = null;
        // FirmwareImage response = api.firmwareImageCreate(datafile, name, description);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete firmware image.
     */
    @Test
    public void firmwareImageDestroyTest() {
        String imageId = null;
        // Void response = api.firmwareImageDestroy(imageId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all firmware images
     */
    @Test
    public void firmwareImageListTest() {
        Integer limit = null;
        String order = null;
        String after = null;
        String filter = null;
        String include = null;
        // FirmwareImagePage response = api.firmwareImageList(limit, order, after, filter, include);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve firmware image.
     */
    @Test
    public void firmwareImageRetrieveTest() {
        String imageId = null;
        // FirmwareImage response = api.firmwareImageRetrieve(imageId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create firmware manifest.
     */
    @Test
    public void firmwareManifestCreateTest() {
        File datafile = null;
        String name = null;
        String description = null;
        // FirmwareManifest response = api.firmwareManifestCreate(datafile, name, description);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete firmware manifest.
     */
    @Test
    public void firmwareManifestDestroyTest() {
        String manifestId = null;
        // Void response = api.firmwareManifestDestroy(manifestId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all firmware manifests.
     */
    @Test
    public void firmwareManifestListTest() {
        Integer limit = null;
        String order = null;
        String after = null;
        String filter = null;
        String include = null;
        // FirmwareManifestPage response = api.firmwareManifestList(limit, order, after, filter, include);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve firmware manifest.
     */
    @Test
    public void firmwareManifestRetrieveTest() {
        String manifestId = null;
        // FirmwareManifest response = api.firmwareManifestRetrieve(manifestId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * &lt;p&gt;The APIs for creating and manipulating update campaigns. Update campaigns are used to control firmware update to a list of devices specified by a filter.  &lt;/p&gt; &lt;p&gt;Create update campaign&lt;/p&gt;
     */
    @Test
    public void updateCampaignCreateTest() {
        UpdateCampaignPostRequest campaign = null;
        // UpdateCampaign response = api.updateCampaignCreate(campaign);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * &lt;p&gt;The APIs for creating and manipulating update campaigns. Update campaigns are used to control firmware update to a list of devices specified by a filter.  &lt;/p&gt; &lt;p&gt;Delete update campaign&lt;/p&gt;
     */
    @Test
    public void updateCampaignDestroyTest() {
        String campaignId = null;
        // Void response = api.updateCampaignDestroy(campaignId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * The APIs for creating and manipulating update campaigns.
     */
    @Test
    public void updateCampaignListTest() {
        Integer limit = null;
        String order = null;
        String after = null;
        String filter = null;
        String include = null;
        // UpdateCampaignPage response = api.updateCampaignList(limit, order, after, filter, include);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * &lt;p&gt;The APIs for creating and manipulating update campaigns. Update campaigns are used to control firmware update to a list of devices specified by a filter.  &lt;/p&gt; &lt;p&gt;Update campaign fields&lt;/p&gt;
     */
    @Test
    public void updateCampaignPartialUpdateTest() {
        String campaignId = null;
        UpdateCampaignPatchRequest campaign = null;
        // UpdateCampaign response = api.updateCampaignPartialUpdate(campaignId, campaign);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * &lt;p&gt;The APIs for creating and manipulating update campaigns. Update campaigns are used to control firmware update to a list of devices specified by a filter.  &lt;/p&gt; &lt;p&gt;Retrieve campaign&lt;/p&gt;
     */
    @Test
    public void updateCampaignRetrieveTest() {
        String campaignId = null;
        // UpdateCampaign response = api.updateCampaignRetrieve(campaignId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * &lt;p&gt;The APIs for creating and manipulating update campaigns. Update campaigns are used to control firmware update to a list of devices specified by a filter.  &lt;/p&gt; &lt;p&gt;Update campaign&lt;/p&gt;
     */
    @Test
    public void updateCampaignUpdateTest() {
        String campaignId = null;
        UpdateCampaignPutRequest campaign = null;
        // UpdateCampaign response = api.updateCampaignUpdate(campaignId, campaign);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void v3CampaignDeviceMetadataCampaignDeviceMetadataIdGetTest() {
        String campaignDeviceMetadataId = null;
        // CampaignDeviceMetadata response = api.v3CampaignDeviceMetadataCampaignDeviceMetadataIdGet(campaignDeviceMetadataId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void v3CampaignDeviceMetadataGetTest() {
        // CampaignDeviceMetadataPage response = api.v3CampaignDeviceMetadataGet();

        // TODO: test validations
    }
    
}
