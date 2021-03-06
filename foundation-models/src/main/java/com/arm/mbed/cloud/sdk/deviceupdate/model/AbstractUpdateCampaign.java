// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [UpdateCampaign]
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * Model for an update campaign.
 */
@Preamble(description = "Model for an update campaign.")
@SuppressWarnings({ "PMD.CyclomaticComplexity", "PMD.AvoidDuplicateLiterals" })
public abstract class AbstractUpdateCampaign implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -131142121920181L;

    /**
     * The time the campaign entered the active state.
     */
    protected final Date activeAt;

    /**
     * Flag indicating whether approval is needed to start the campaign.
     */
    protected boolean approvalRequired;

    /**
     * The time the campaign was archived.
     */
    protected final Date archivedAt;

    /**
     * Flag indicating whether the campaign should be auto-stopped on reaching a threshold.
     */
    protected boolean autostop;

    /**
     * Text description of why a campaign failed to start or why a campaign stopped.
     */
    protected final String autostopReason;

    /**
     * Percent of successful device updates to auto stop the campaign.
     */
    protected double autostopSuccessPercent;

    /**
     * How the campaign adds devices. A `one-shot` campaign does not add new devices after it has started. A
     * `continuous` campaign means that devices may be added to the campaign after it has started. The default is
     * `one-shot`.
     */
    @DefaultValue("one-shot")
    protected UpdateCampaignStrategy campaignStrategy;

    /**
     * The time the entity was created.
     */
    protected final Date createdAt;

    /**
     * An optional description of the campaign.
     */
    protected String description;

    /**
     * The filter for the devices the campaign is targeting at.
     */
    @Required
    protected String deviceFilter;

    /**
     * The time the campaign finished.
     */
    protected final Date finished;

    /**
     * The campaign ID.
     */
    protected String id;

    /**
     * The campaign name.
     */
    protected String name;

    /**
     * The phase of the campaign.
     */
    protected final UpdateCampaignPhase phase;

    /**
     * The ID of the manifest that will be sent to the device as part of the campaign.
     */
    protected String rootManifestId;

    /**
     * The URL for the manifest that will be sent to the device as part of the campaign.
     */
    protected final String rootManifestUrl;

    /**
     * The time the campaign was started.
     */
    protected final Date startedAt;

    /**
     * The time the campaign will be started.
     */
    protected final Date startingAt;

    /**
     * The time the campaign was stopped.
     */
    protected final Date stoppedAt;

    /**
     * The time the campaign will be stopped.
     */
    protected final Date stoppingAt;

    /**
     * The time the entity was updated.
     */
    protected final Date updatedAt;

    /**
     * The scheduled start time for the campaign. The campaign will start within 1 minute when then start time has
     * elapsed.
     */
    protected final Date when;

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #AbstractUpdateCampaign()} instead.
     * 
     * @param activeAt
     *            The time the campaign entered the active state.
     * @param approvalRequired
     *            Flag indicating whether approval is needed to start the campaign.
     * @param archivedAt
     *            The time the campaign was archived.
     * @param autostop
     *            Flag indicating whether the campaign should be auto-stopped on reaching a threshold.
     * @param autostopReason
     *            Text description of why a campaign failed to start or why a campaign stopped.
     * @param autostopSuccessPercent
     *            Percent of successful device updates to auto stop the campaign.
     * @param campaignStrategy
     *            How the campaign adds devices. A `one-shot` campaign does not add new devices after it has started. A
     *            `continuous` campaign means that devices may be added to the campaign after it has started. The
     *            default is `one-shot`.
     * @param createdAt
     *            The time the entity was created.
     * @param description
     *            An optional description of the campaign.
     * @param deviceFilter
     *            The filter for the devices the campaign is targeting at.
     * @param finished
     *            The time the campaign finished.
     * @param id
     *            The campaign ID.
     * @param name
     *            The campaign name.
     * @param phase
     *            The phase of the campaign.
     * @param rootManifestId
     *            The ID of the manifest that will be sent to the device as part of the campaign.
     * @param rootManifestUrl
     *            The URL for the manifest that will be sent to the device as part of the campaign.
     * @param startedAt
     *            The time the campaign was started.
     * @param startingAt
     *            The time the campaign will be started.
     * @param stoppedAt
     *            The time the campaign was stopped.
     * @param stoppingAt
     *            The time the campaign will be stopped.
     * @param updatedAt
     *            The time the entity was updated.
     * @param when
     *            The scheduled start time for the campaign. The campaign will start within 1 minute when then start
     *            time has elapsed.
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    public AbstractUpdateCampaign(Date activeAt, boolean approvalRequired, Date archivedAt, boolean autostop,
                                  String autostopReason, double autostopSuccessPercent,
                                  @DefaultValue("one-shot") UpdateCampaignStrategy campaignStrategy, Date createdAt,
                                  String description, String deviceFilter, Date finished, String id, String name,
                                  UpdateCampaignPhase phase, String rootManifestId, String rootManifestUrl,
                                  Date startedAt, Date startingAt, Date stoppedAt, Date stoppingAt, Date updatedAt,
                                  Date when) {
        super();
        this.activeAt = activeAt;
        this.archivedAt = archivedAt;
        this.autostopReason = autostopReason;
        this.createdAt = createdAt;
        this.finished = finished;
        this.phase = phase;
        this.rootManifestUrl = rootManifestUrl;
        this.startedAt = startedAt;
        this.startingAt = startingAt;
        this.stoppedAt = stoppedAt;
        this.stoppingAt = stoppingAt;
        this.updatedAt = updatedAt;
        this.when = when;
        setApprovalRequired(approvalRequired);
        setAutostop(autostop);
        setAutostopSuccessPercent(autostopSuccessPercent);
        setCampaignStrategy(campaignStrategy);
        setDescription(description);
        setDeviceFilter(deviceFilter);
        setId(id);
        setName(name);
        setRootManifestId(rootManifestId);
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on a similar object.
     * <p>
     * Note: Should not be used. Use {@link #AbstractUpdateCampaign()} instead.
     * 
     * @param abstractUpdateCampaign
     *            an abstract update campaign.
     */
    @Internal
    public AbstractUpdateCampaign(AbstractUpdateCampaign abstractUpdateCampaign) {
        this(abstractUpdateCampaign == null ? new Date() : abstractUpdateCampaign.activeAt,
             abstractUpdateCampaign != null && abstractUpdateCampaign.approvalRequired,
             abstractUpdateCampaign == null ? new Date() : abstractUpdateCampaign.archivedAt,
             abstractUpdateCampaign != null && abstractUpdateCampaign.autostop,
             abstractUpdateCampaign == null ? (String) null : abstractUpdateCampaign.autostopReason,
             abstractUpdateCampaign == null ? 0.0 : abstractUpdateCampaign.autostopSuccessPercent,
             abstractUpdateCampaign == null ? UpdateCampaignStrategy.getValue("one-shot")
                                            : abstractUpdateCampaign.campaignStrategy,
             abstractUpdateCampaign == null ? new Date() : abstractUpdateCampaign.createdAt,
             abstractUpdateCampaign == null ? (String) null : abstractUpdateCampaign.description,
             abstractUpdateCampaign == null ? (String) null : abstractUpdateCampaign.deviceFilter,
             abstractUpdateCampaign == null ? new Date() : abstractUpdateCampaign.finished,
             abstractUpdateCampaign == null ? (String) null : abstractUpdateCampaign.id,
             abstractUpdateCampaign == null ? (String) null : abstractUpdateCampaign.name,
             abstractUpdateCampaign == null ? UpdateCampaignPhase.getDefault() : abstractUpdateCampaign.phase,
             abstractUpdateCampaign == null ? (String) null : abstractUpdateCampaign.rootManifestId,
             abstractUpdateCampaign == null ? (String) null : abstractUpdateCampaign.rootManifestUrl,
             abstractUpdateCampaign == null ? new Date() : abstractUpdateCampaign.startedAt,
             abstractUpdateCampaign == null ? new Date() : abstractUpdateCampaign.startingAt,
             abstractUpdateCampaign == null ? new Date() : abstractUpdateCampaign.stoppedAt,
             abstractUpdateCampaign == null ? new Date() : abstractUpdateCampaign.stoppingAt,
             abstractUpdateCampaign == null ? new Date() : abstractUpdateCampaign.updatedAt,
             abstractUpdateCampaign == null ? new Date() : abstractUpdateCampaign.when);
    }

    /**
     * Constructor.
     */
    public AbstractUpdateCampaign() {
        this(new Date(), false, new Date(), false, (String) null, 0.0, UpdateCampaignStrategy.getValue("one-shot"),
             new Date(), (String) null, (String) null, new Date(), (String) null, (String) null,
             UpdateCampaignPhase.getDefault(), (String) null, (String) null, new Date(), new Date(), new Date(),
             new Date(), new Date(), new Date());
    }

    /**
     * Constructor.
     * 
     * <p>
     * Constructor based on object identifier.
     * <p>
     * 
     * @param id
     *            The campaign ID.
     */
    public AbstractUpdateCampaign(String id) {
        this();
        setId(id);
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on read-only fields.
     * <p>
     * Note: Should not be used. Use {@link #AbstractUpdateCampaign()} instead.
     * 
     * @param activeAt
     *            The time the campaign entered the active state.
     * @param archivedAt
     *            The time the campaign was archived.
     * @param autostopReason
     *            Text description of why a campaign failed to start or why a campaign stopped.
     * @param createdAt
     *            The time the entity was created.
     * @param finished
     *            The time the campaign finished.
     * @param phase
     *            The phase of the campaign.
     * @param rootManifestUrl
     *            The URL for the manifest that will be sent to the device as part of the campaign.
     * @param startedAt
     *            The time the campaign was started.
     * @param startingAt
     *            The time the campaign will be started.
     * @param stoppedAt
     *            The time the campaign was stopped.
     * @param stoppingAt
     *            The time the campaign will be stopped.
     * @param updatedAt
     *            The time the entity was updated.
     * @param when
     *            The scheduled start time for the campaign. The campaign will start within 1 minute when then start
     *            time has elapsed.
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    public AbstractUpdateCampaign(Date activeAt, Date archivedAt, String autostopReason, Date createdAt, Date finished,
                                  UpdateCampaignPhase phase, String rootManifestUrl, Date startedAt, Date startingAt,
                                  Date stoppedAt, Date stoppingAt, Date updatedAt, Date when) {
        this(activeAt, false, archivedAt, false, autostopReason, 0.0, UpdateCampaignStrategy.getValue("one-shot"),
             createdAt, (String) null, (String) null, finished, (String) null, (String) null, phase, (String) null,
             rootManifestUrl, startedAt, startingAt, stoppedAt, stoppingAt, updatedAt, when);
    }

    /**
     * Gets the time the campaign entered the active state.
     * 
     * @return activeAt
     */
    public Date getActiveAt() {
        return activeAt;
    }

    /**
     * Gets flag indicating whether approval is needed to start the campaign.
     * 
     * @return approvalRequired
     */
    public boolean isApprovalRequired() {
        return approvalRequired;
    }

    /**
     * Sets flag indicating whether approval is needed to start the campaign.
     * 
     * @param approvalRequired
     *            Flag indicating whether approval is needed to start the campaign.
     */
    public void setApprovalRequired(boolean approvalRequired) {
        this.approvalRequired = approvalRequired;
    }

    /**
     * Gets the time the campaign was archived.
     * 
     * @return archivedAt
     */
    public Date getArchivedAt() {
        return archivedAt;
    }

    /**
     * Gets flag indicating whether the campaign should be auto-stopped on reaching a threshold.
     * 
     * @return autostop
     */
    public boolean isAutostop() {
        return autostop;
    }

    /**
     * Sets flag indicating whether the campaign should be auto-stopped on reaching a threshold.
     * 
     * @param autostop
     *            Flag indicating whether the campaign should be auto-stopped on reaching a threshold.
     */
    public void setAutostop(boolean autostop) {
        this.autostop = autostop;
    }

    /**
     * Gets text description of why a campaign failed to start or why a campaign stopped.
     * 
     * @return autostopReason
     */
    public String getAutostopReason() {
        return autostopReason;
    }

    /**
     * Gets percent of successful device updates to auto stop the campaign.
     * 
     * @return autostopSuccessPercent
     */
    public double getAutostopSuccessPercent() {
        return autostopSuccessPercent;
    }

    /**
     * Sets percent of successful device updates to auto stop the campaign.
     * 
     * @param autostopSuccessPercent
     *            Percent of successful device updates to auto stop the campaign.
     */
    public void setAutostopSuccessPercent(double autostopSuccessPercent) {
        this.autostopSuccessPercent = autostopSuccessPercent;
    }

    /**
     * Gets how the campaign adds devices. a `one-shot` campaign does not add new devices after it has started. a
     * `continuous` campaign means that devices may be added to the campaign after it has started. the default is
     * `one-shot`.
     * 
     * @return campaignStrategy
     */
    public UpdateCampaignStrategy getCampaignStrategy() {
        return campaignStrategy;
    }

    /**
     * Sets how the campaign adds devices. a `one-shot` campaign does not add new devices after it has started. a
     * `continuous` campaign means that devices may be added to the campaign after it has started. the default is
     * `one-shot`.
     * 
     * @param campaignStrategy
     *            How the campaign adds devices. A `one-shot` campaign does not add new devices after it has started. A
     *            `continuous` campaign means that devices may be added to the campaign after it has started. The
     *            default is `one-shot`.
     */
    public void setCampaignStrategy(@DefaultValue("one-shot") UpdateCampaignStrategy campaignStrategy) {
        this.campaignStrategy = campaignStrategy;
    }

    /**
     * Sets how the campaign adds devices. a `one-shot` campaign does not add new devices after it has started. a
     * `continuous` campaign means that devices may be added to the campaign after it has started. the default is
     * `one-shot`.
     * 
     * <p>
     * Similar to {@link #setCampaignStrategy(com.arm.mbed.cloud.sdk.deviceupdate.model.UpdateCampaignStrategy)}
     * 
     * @param campaignStrategy
     *            How the campaign adds devices. A `one-shot` campaign does not add new devices after it has started. A
     *            `continuous` campaign means that devices may be added to the campaign after it has started. The
     *            default is `one-shot`.
     */
    @Internal
    public void setCampaignStrategy(@DefaultValue("one-shot") String campaignStrategy) {
        this.campaignStrategy = UpdateCampaignStrategy.getValue(campaignStrategy);
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
     * Gets an optional description of the campaign.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets an optional description of the campaign.
     * 
     * <p>
     * Note: the length of the string has to be less than or equal to {@code 2000} to be valid
     * 
     * @param description
     *            An optional description of the campaign.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Checks whether description value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    @SuppressWarnings("PMD.UselessParentheses")
    public boolean isDescriptionValid() {
        return (description == null || description.length() <= 2000);
    }

    /**
     * Gets the filter for the devices the campaign is targeting at.
     * 
     * @return deviceFilter
     */
    public String getDeviceFilter() {
        return deviceFilter;
    }

    /**
     * Sets the filter for the devices the campaign is targeting at.
     * 
     * @param deviceFilter
     *            The filter for the devices the campaign is targeting at.
     */
    @Required
    public void setDeviceFilter(String deviceFilter) {
        this.deviceFilter = deviceFilter;
    }

    /**
     * Checks whether deviceFilter value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    @SuppressWarnings("PMD.UselessParentheses")
    public boolean isDeviceFilterValid() {
        return deviceFilter != null;
    }

    /**
     * Gets the time the campaign finished.
     * 
     * @return finished
     */
    public Date getFinished() {
        return finished;
    }

    /**
     * Gets the campaign id.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets the campaign id.
     * 
     * @param id
     *            The campaign ID.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the campaign id.
     * 
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param updateCampaignId
     *            The campaign ID.
     */
    @Internal
    public void setUpdateCampaignId(String updateCampaignId) {
        setId(updateCampaignId);
    }

    /**
     * Gets the campaign name.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the campaign name.
     * 
     * <p>
     * Note: the length of the string has to be less than or equal to {@code 128} to be valid
     * 
     * @param name
     *            The campaign name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Checks whether name value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    @SuppressWarnings("PMD.UselessParentheses")
    public boolean isNameValid() {
        return (name == null || name.length() <= 128);
    }

    /**
     * Gets the phase of the campaign.
     * 
     * @return phase
     */
    public UpdateCampaignPhase getPhase() {
        return phase;
    }

    /**
     * Gets the id of the manifest that will be sent to the device as part of the campaign.
     * 
     * @return rootManifestId
     */
    public String getRootManifestId() {
        return rootManifestId;
    }

    /**
     * Sets the id of the manifest that will be sent to the device as part of the campaign.
     * 
     * @param rootManifestId
     *            The ID of the manifest that will be sent to the device as part of the campaign.
     */
    public void setRootManifestId(String rootManifestId) {
        this.rootManifestId = rootManifestId;
    }

    /**
     * Gets the url for the manifest that will be sent to the device as part of the campaign.
     * 
     * @return rootManifestUrl
     */
    public String getRootManifestUrl() {
        return rootManifestUrl;
    }

    /**
     * Gets the time the campaign was started.
     * 
     * @return startedAt
     */
    public Date getStartedAt() {
        return startedAt;
    }

    /**
     * Gets the time the campaign will be started.
     * 
     * @return startingAt
     */
    public Date getStartingAt() {
        return startingAt;
    }

    /**
     * Gets the time the campaign was stopped.
     * 
     * @return stoppedAt
     */
    public Date getStoppedAt() {
        return stoppedAt;
    }

    /**
     * Gets the time the campaign will be stopped.
     * 
     * @return stoppingAt
     */
    public Date getStoppingAt() {
        return stoppingAt;
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
     * Gets the scheduled start time for the campaign. the campaign will start within 1 minute when then start time has
     * elapsed.
     * 
     * @return when
     */
    public Date getWhen() {
        return when;
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
        return other instanceof AbstractUpdateCampaign;
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
    public abstract Object clone();

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
        return "AbstractUpdateCampaign [activeAt=" + activeAt + ", approvalRequired=" + approvalRequired
               + ", archivedAt=" + archivedAt + ", autostop=" + autostop + ", autostopReason=" + autostopReason
               + ", autostopSuccessPercent=" + autostopSuccessPercent + ", campaignStrategy=" + campaignStrategy
               + ", createdAt=" + createdAt + ", description=" + description + ", deviceFilter=" + deviceFilter
               + ", finished=" + finished + ", id=" + id + ", name=" + name + ", phase=" + phase + ", rootManifestId="
               + rootManifestId + ", rootManifestUrl=" + rootManifestUrl + ", startedAt=" + startedAt + ", startingAt="
               + startingAt + ", stoppedAt=" + stoppedAt + ", stoppingAt=" + stoppingAt + ", updatedAt=" + updatedAt
               + ", when=" + when + "]";
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
        result = prime * result + ((activeAt == null) ? 0 : activeAt.hashCode());
        result = prime * result + Objects.hashCode(Boolean.valueOf(approvalRequired));
        result = prime * result + ((archivedAt == null) ? 0 : archivedAt.hashCode());
        result = prime * result + Objects.hashCode(Boolean.valueOf(autostop));
        result = prime * result + ((autostopReason == null) ? 0 : autostopReason.hashCode());
        result = prime * result + Objects.hashCode(BigDecimal.valueOf(autostopSuccessPercent));
        result = prime * result + ((campaignStrategy == null) ? 0 : campaignStrategy.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((deviceFilter == null) ? 0 : deviceFilter.hashCode());
        result = prime * result + ((finished == null) ? 0 : finished.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phase == null) ? 0 : phase.hashCode());
        result = prime * result + ((rootManifestId == null) ? 0 : rootManifestId.hashCode());
        result = prime * result + ((rootManifestUrl == null) ? 0 : rootManifestUrl.hashCode());
        result = prime * result + ((startedAt == null) ? 0 : startedAt.hashCode());
        result = prime * result + ((startingAt == null) ? 0 : startingAt.hashCode());
        result = prime * result + ((stoppedAt == null) ? 0 : stoppedAt.hashCode());
        result = prime * result + ((stoppingAt == null) ? 0 : stoppingAt.hashCode());
        result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
        result = prime * result + ((when == null) ? 0 : when.hashCode());
        return result;
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
        if (!(obj instanceof AbstractUpdateCampaign)) {
            return false;
        }
        final AbstractUpdateCampaign other = (AbstractUpdateCampaign) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (activeAt == null) {
            if (other.activeAt != null) {
                return false;
            }
        } else if (!activeAt.equals(other.activeAt)) {
            return false;
        }
        if (approvalRequired != other.approvalRequired) {
            return false;
        }
        if (archivedAt == null) {
            if (other.archivedAt != null) {
                return false;
            }
        } else if (!archivedAt.equals(other.archivedAt)) {
            return false;
        }
        if (autostop != other.autostop) {
            return false;
        }
        if (autostopReason == null) {
            if (other.autostopReason != null) {
                return false;
            }
        } else if (!autostopReason.equals(other.autostopReason)) {
            return false;
        }
        if (autostopSuccessPercent != other.autostopSuccessPercent) {
            return false;
        }
        if (campaignStrategy != other.campaignStrategy) {
            return false;
        }
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (deviceFilter == null) {
            if (other.deviceFilter != null) {
                return false;
            }
        } else if (!deviceFilter.equals(other.deviceFilter)) {
            return false;
        }
        if (finished == null) {
            if (other.finished != null) {
                return false;
            }
        } else if (!finished.equals(other.finished)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (phase != other.phase) {
            return false;
        }
        if (rootManifestId == null) {
            if (other.rootManifestId != null) {
                return false;
            }
        } else if (!rootManifestId.equals(other.rootManifestId)) {
            return false;
        }
        if (rootManifestUrl == null) {
            if (other.rootManifestUrl != null) {
                return false;
            }
        } else if (!rootManifestUrl.equals(other.rootManifestUrl)) {
            return false;
        }
        if (startedAt == null) {
            if (other.startedAt != null) {
                return false;
            }
        } else if (!startedAt.equals(other.startedAt)) {
            return false;
        }
        if (startingAt == null) {
            if (other.startingAt != null) {
                return false;
            }
        } else if (!startingAt.equals(other.startingAt)) {
            return false;
        }
        if (stoppedAt == null) {
            if (other.stoppedAt != null) {
                return false;
            }
        } else if (!stoppedAt.equals(other.stoppedAt)) {
            return false;
        }
        if (stoppingAt == null) {
            if (other.stoppingAt != null) {
                return false;
            }
        } else if (!stoppingAt.equals(other.stoppingAt)) {
            return false;
        }
        if (updatedAt == null) {
            if (other.updatedAt != null) {
                return false;
            }
        } else if (!updatedAt.equals(other.updatedAt)) {
            return false;
        }
        if (when == null) {
            if (other.when != null) {
                return false;
            }
        } else if (!when.equals(other.when)) {
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
        return isDescriptionValid() && isDeviceFilterValid() && isNameValid();
    }
}
