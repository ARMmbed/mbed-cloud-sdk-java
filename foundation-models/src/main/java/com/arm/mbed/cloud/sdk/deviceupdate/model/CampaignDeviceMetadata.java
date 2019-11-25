// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

/**
 * Model for a campaign device metadata.
 */
@Preamble(description = "Model for a campaign device metadata.")
@SuppressWarnings({ "PMD.CyclomaticComplexity", "PMD.AvoidDuplicateLiterals" })
public class CampaignDeviceMetadata implements SdkModel {
    /**
     * Mapping needed for encoding or decoding filters.
     * 
     * <p>
     * Filters are used when listing models. See {@link com.arm.mbed.cloud.sdk.common.listing.filtering.Filters}
     */
    @Internal
    public static final Map<String, String> FILTER_MAPPING = generateFilterMapping();

    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -441885996311316L;

    /**
     * The device's campaign ID.
     */
    @Required
    private String campaignId;

    /**
     * The time the entity was created.
     */
    private final Date createdAt;

    /**
     * The state of the update campaign on the device.
     */
    private final CampaignDeviceMetadataDeploymentState deploymentState;

    /**
     * Description.
     */
    private final String description;

    /**
     * The device ID.
     */
    private final String deviceId;

    /**
     * The metadata record ID.
     */
    private String id;

    /**
     * How the firmware is delivered (connector or direct).
     */
    private final String mechanism;

    /**
     * The Device Management Connect URL.
     */
    private final String mechanismUrl;

    /**
     * The record name.
     */
    @DefaultValue("default_object_name")
    private final String name;

    /**
     * The time the entity was updated.
     */
    private final Date updatedAt;

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #CampaignDeviceMetadata()} instead.
     * 
     * @param campaignId
     *            The device's campaign ID.
     * @param createdAt
     *            The time the entity was created.
     * @param deploymentState
     *            The state of the update campaign on the device.
     * @param description
     *            Description.
     * @param deviceId
     *            The device ID.
     * @param id
     *            The metadata record ID.
     * @param mechanism
     *            How the firmware is delivered (connector or direct).
     * @param mechanismUrl
     *            The Device Management Connect URL.
     * @param name
     *            The record name.
     * @param updatedAt
     *            The time the entity was updated.
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    public CampaignDeviceMetadata(String campaignId, Date createdAt,
                                  CampaignDeviceMetadataDeploymentState deploymentState, String description,
                                  String deviceId, String id, String mechanism, String mechanismUrl,
                                  @DefaultValue("default_object_name") String name, Date updatedAt) {
        super();
        this.createdAt = createdAt;
        this.deploymentState = deploymentState;
        this.description = description;
        this.deviceId = deviceId;
        this.mechanism = mechanism;
        this.mechanismUrl = mechanismUrl;
        this.name = name;
        this.updatedAt = updatedAt;
        setCampaignId(campaignId);
        setId(id);
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on a similar object.
     * <p>
     * Note: Should not be used. Use {@link #CampaignDeviceMetadata()} instead.
     * 
     * @param campaignDeviceMetadata
     *            a campaign device metadata.
     */
    @Internal
    public CampaignDeviceMetadata(CampaignDeviceMetadata campaignDeviceMetadata) {
        this(campaignDeviceMetadata == null ? (String) null : campaignDeviceMetadata.campaignId,
             campaignDeviceMetadata == null ? new Date() : campaignDeviceMetadata.createdAt,
             campaignDeviceMetadata == null ? CampaignDeviceMetadataDeploymentState.getDefault()
                                            : campaignDeviceMetadata.deploymentState,
             campaignDeviceMetadata == null ? (String) null : campaignDeviceMetadata.description,
             campaignDeviceMetadata == null ? (String) null : campaignDeviceMetadata.deviceId,
             campaignDeviceMetadata == null ? (String) null : campaignDeviceMetadata.id,
             campaignDeviceMetadata == null ? (String) null : campaignDeviceMetadata.mechanism,
             campaignDeviceMetadata == null ? (String) null : campaignDeviceMetadata.mechanismUrl,
             campaignDeviceMetadata == null ? "default_object_name" : campaignDeviceMetadata.name,
             campaignDeviceMetadata == null ? new Date() : campaignDeviceMetadata.updatedAt);
    }

    /**
     * Constructor.
     */
    public CampaignDeviceMetadata() {
        this((String) null, new Date(), CampaignDeviceMetadataDeploymentState.getDefault(), (String) null,
             (String) null, (String) null, (String) null, (String) null, "default_object_name", new Date());
    }

    /**
     * Constructor.
     * 
     * <p>
     * Constructor based on object identifier.
     * <p>
     * 
     * @param id
     *            The metadata record ID.
     */
    public CampaignDeviceMetadata(String id) {
        this();
        setId(id);
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on read-only fields.
     * <p>
     * Note: Should not be used. Use {@link #CampaignDeviceMetadata()} instead.
     * 
     * @param createdAt
     *            The time the entity was created.
     * @param deploymentState
     *            The state of the update campaign on the device.
     * @param description
     *            Description.
     * @param deviceId
     *            The device ID.
     * @param mechanism
     *            How the firmware is delivered (connector or direct).
     * @param mechanismUrl
     *            The Device Management Connect URL.
     * @param name
     *            The record name.
     * @param updatedAt
     *            The time the entity was updated.
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    public CampaignDeviceMetadata(Date createdAt, CampaignDeviceMetadataDeploymentState deploymentState,
                                  String description, String deviceId, String mechanism, String mechanismUrl,
                                  @DefaultValue("default_object_name") String name, Date updatedAt) {
        this((String) null, createdAt, deploymentState, description, deviceId, (String) null, mechanism, mechanismUrl,
             name, updatedAt);
    }

    /**
     * Gets the device's campaign id.
     * 
     * @return campaignId
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the device's campaign id.
     * 
     * @param campaignId
     *            The device's campaign ID.
     */
    @Required
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Checks whether campaignId value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    @SuppressWarnings("PMD.UselessParentheses")
    public boolean isCampaignIdValid() {
        return campaignId != null;
    }

    /**
     * Gets the time the entity was created.
     * 
     * @return createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Gets the state of the update campaign on the device.
     * 
     * @return deploymentState
     */
    public CampaignDeviceMetadataDeploymentState getDeploymentState() {
        return deploymentState;
    }

    /**
     * Gets description.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the device id.
     * 
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Gets the metadata record id.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets the metadata record id.
     * 
     * @param id
     *            The metadata record ID.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the metadata record id.
     * 
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param campaignDeviceMetadataId
     *            The metadata record ID.
     */
    @Internal
    public void setCampaignDeviceMetadataId(String campaignDeviceMetadataId) {
        setId(campaignDeviceMetadataId);
    }

    /**
     * Gets how the firmware is delivered (connector or direct).
     * 
     * @return mechanism
     */
    public String getMechanism() {
        return mechanism;
    }

    /**
     * Gets the device management connect url.
     * 
     * @return mechanismUrl
     */
    public String getMechanismUrl() {
        return mechanismUrl;
    }

    /**
     * Gets the record name.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the time the entity was updated.
     * 
     * @return updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Method generating the mapping needed for encoding or decoding filters.
     * 
     * <p>
     * Filters are used when listing models. See {@link com.arm.mbed.cloud.sdk.common.listing.filtering.Filters}
     * 
     * @return the mapping table
     */
    @Internal
    protected static final Map<String, String> generateFilterMapping() {
        final Map<String, String> filterMapping = new Hashtable<>(1);
        filterMapping.put("campaignId", "campaign");
        return filterMapping;
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
        return "CampaignDeviceMetadata [campaignId=" + campaignId + ", createdAt=" + createdAt + ", deploymentState="
               + deploymentState + ", description=" + description + ", deviceId=" + deviceId + ", id=" + id
               + ", mechanism=" + mechanism + ", mechanismUrl=" + mechanismUrl + ", name=" + name + ", updatedAt="
               + updatedAt + "]";
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
        result = prime * result + ((campaignId == null) ? 0 : campaignId.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((deploymentState == null) ? 0 : deploymentState.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((mechanism == null) ? 0 : mechanism.hashCode());
        result = prime * result + ((mechanismUrl == null) ? 0 : mechanismUrl.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
        return result;
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
        return other instanceof CampaignDeviceMetadata;
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
    @SuppressWarnings({ "PMD.ExcessiveMethodLength", "PMD.NcssMethodCount" })
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof CampaignDeviceMetadata)) {
            return false;
        }
        final CampaignDeviceMetadata other = (CampaignDeviceMetadata) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (campaignId == null) {
            if (other.campaignId != null) {
                return false;
            }
        } else if (!campaignId.equals(other.campaignId)) {
            return false;
        }
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (deploymentState != other.deploymentState) {
            return false;
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (deviceId == null) {
            if (other.deviceId != null) {
                return false;
            }
        } else if (!deviceId.equals(other.deviceId)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (mechanism == null) {
            if (other.mechanism != null) {
                return false;
            }
        } else if (!mechanism.equals(other.mechanism)) {
            return false;
        }
        if (mechanismUrl == null) {
            if (other.mechanismUrl != null) {
                return false;
            }
        } else if (!mechanismUrl.equals(other.mechanismUrl)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (updatedAt == null) {
            if (other.updatedAt != null) {
                return false;
            }
        } else if (!updatedAt.equals(other.updatedAt)) {
            return false;
        }
        return true;
    }

    /**
     * Checks whether the model is valid or not.
     * 
     * <p>
     * 
     * @see SdkModel#isValid()
     * @return true if the model is valid; false otherwise.
     */
    @Override
    public boolean isValid() {
        return isCampaignIdValid();
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
    public CampaignDeviceMetadata clone() {
        return new CampaignDeviceMetadata(this);
    }
}
