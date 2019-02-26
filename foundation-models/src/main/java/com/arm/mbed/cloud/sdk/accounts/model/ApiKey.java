// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Date;
import java.util.Objects;

/**
 * Model for an api key.
 */
@Preamble(description = "Model for an api key.")
public class ApiKey implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -211973305911691L;

    /**
     * The ID of the account.
     */
    private final String accountId;

    /**
     * Creation UTC time RFC3339.
     */
    private final Date createdAt;

    /**
     * The timestamp of the API key creation in the storage, in milliseconds.
     */
    private final long creationTime;

    /**
     * The ID of the API key.
     */
    private String id;

    /**
     * The API key.
     */
    private final String key;

    /**
     * The timestamp of the latest API key usage, in milliseconds.
     */
    private final long lastLoginTime;

    /**
     * The display name for the API key.
     */
    @Required
    private String name;

    /**
     * The owner of this API key, who is the creator by default.
     */
    private String owner;

    /**
     * The status of the API key.
     */
    private ApiKeyStatus status;

    /**
     * Last update UTC time RFC3339.
     */
    private final Date updatedAt;

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #ApiKey()} instead.
     * 
     * @param accountId
     *            The ID of the account.
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param creationTime
     *            The timestamp of the API key creation in the storage, in milliseconds.
     * @param id
     *            The ID of the API key.
     * @param key
     *            The API key.
     * @param lastLoginTime
     *            The timestamp of the latest API key usage, in milliseconds.
     * @param name
     *            The display name for the API key.
     * @param owner
     *            The owner of this API key, who is the creator by default.
     * @param status
     *            The status of the API key.
     * @param updatedAt
     *            Last update UTC time RFC3339.
     */
    @Internal
    public ApiKey(String accountId, Date createdAt, long creationTime, String id, String key, long lastLoginTime,
                  String name, String owner, ApiKeyStatus status, Date updatedAt) {
        super();
        this.accountId = accountId;
        this.createdAt = createdAt;
        this.creationTime = creationTime;
        this.key = key;
        this.lastLoginTime = lastLoginTime;
        this.updatedAt = updatedAt;
        setId(id);
        setName(name);
        setOwner(owner);
        setStatus(status);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #ApiKey()} instead.
     * 
     * @param apiKey
     *            an api key.
     */
    @Internal
    public ApiKey(ApiKey apiKey) {
        this(apiKey == null ? (String) null : apiKey.accountId,
             apiKey == null ? new java.util.Date() : apiKey.createdAt, apiKey == null ? 0L : apiKey.creationTime,
             apiKey == null ? (String) null : apiKey.id, apiKey == null ? (String) null : apiKey.key,
             apiKey == null ? 0L : apiKey.lastLoginTime, apiKey == null ? (String) null : apiKey.name,
             apiKey == null ? (String) null : apiKey.owner, apiKey == null ? ApiKeyStatus.getDefault() : apiKey.status,
             apiKey == null ? new java.util.Date() : apiKey.updatedAt);
    }

    /**
     * Constructor.
     */
    public ApiKey() {
        this((String) null, new java.util.Date(), 0L, (String) null, (String) null, 0L, (String) null, (String) null,
             ApiKeyStatus.getDefault(), new java.util.Date());
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The ID of the API key.
     */
    public ApiKey(String id) {
        this();
        setId(id);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #ApiKey()} instead.
     * 
     * @param accountId
     *            The ID of the account.
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param creationTime
     *            The timestamp of the API key creation in the storage, in milliseconds.
     * @param key
     *            The API key.
     * @param lastLoginTime
     *            The timestamp of the latest API key usage, in milliseconds.
     * @param updatedAt
     *            Last update UTC time RFC3339.
     */
    @Internal
    public ApiKey(String accountId, Date createdAt, long creationTime, String key, long lastLoginTime, Date updatedAt) {
        this(accountId, createdAt, creationTime, (String) null, key, lastLoginTime, (String) null, (String) null,
             ApiKeyStatus.getDefault(), updatedAt);
    }

    /**
     * Gets the id of the account.
     * 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Gets creation utc time rfc3339.
     * 
     * @return createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Gets the timestamp of the api key creation in the storage, in milliseconds.
     * 
     * @return creationTime
     */
    public long getCreationTime() {
        return creationTime;
    }

    /**
     * Gets the id of the api key.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the api key.
     * 
     * @param id
     *            The ID of the API key.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the id of the api key.
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param apiKeyId
     *            The ID of the API key.
     */
    @Internal
    public void setApiKeyId(String apiKeyId) {
        setId(apiKeyId);
    }

    /**
     * Gets the api key.
     * 
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * Gets the timestamp of the latest api key usage, in milliseconds.
     * 
     * @return lastLoginTime
     */
    public long getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Gets the display name for the api key.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the display name for the api key.
     * 
     * @param name
     *            The display name for the API key.
     */
    @Required
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
        return name != null;
    }

    /**
     * Gets the owner of this api key, who is the creator by default.
     * 
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the owner of this api key, who is the creator by default.
     * 
     * @param owner
     *            The owner of this API key, who is the creator by default.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Gets the status of the api key.
     * 
     * @return status
     */
    public ApiKeyStatus getStatus() {
        return status;
    }

    /**
     * Sets the status of the api key.
     * 
     * @param status
     *            The status of the API key.
     */
    public void setStatus(ApiKeyStatus status) {
        this.status = status;
    }

    /**
     * Gets last update utc time rfc3339.
     * 
     * @return updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Calculates the hash code of this instance based on field values.
     * <p>
     * 
     * @see java.lang.Object#hashCode()
     * @return hash code
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + Objects.hashCode(creationTime);
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + Objects.hashCode(lastLoginTime);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
        return result;
    }

    /**
     * Method to ensure {@link #equals(Object)} is correct.
     * <p>
     * Note: see this article: <a href="https://www.artima.com/lejava/articles/equality.html">canEqual()</a>
     * 
     * @param other
     *            another object.
     * @return true if the other object is an instance of the class in which canEqual is (re)defined, false otherwise.
     */
    protected boolean canEqual(Object other) {
        return other instanceof ApiKey;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
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
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        final ApiKey other = (ApiKey) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (accountId == null) {
            if (other.accountId != null) {
                return false;
            }
        } else if (!accountId.equals(other.accountId)) {
            return false;
        }
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (creationTime != other.creationTime) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        if (lastLoginTime != other.lastLoginTime) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (owner == null) {
            if (other.owner != null) {
                return false;
            }
        } else if (!owner.equals(other.owner)) {
            return false;
        }
        if (status != other.status) {
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
     * Returns a string representation of the object.
     * <p>
     * 
     * @see java.lang.Object#toString()
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ApiKey [accountId=" + accountId + ", createdAt=" + createdAt + ", creationTime=" + creationTime
               + ", id=" + id + ", key=" + key + ", lastLoginTime=" + lastLoginTime + ", name=" + name + ", owner="
               + owner + ", status=" + status + ", updatedAt=" + updatedAt + "]";
    }

    /**
     * Checks whether the model is valid or not.
     * <p>
     * 
     * @see SdkModel#isValid()
     * @return true if the model is valid; false otherwise.
     */
    @Override
    public boolean isValid() {
        return isNameValid();
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public ApiKey clone() {
        return new ApiKey(this);
    }
}