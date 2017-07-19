package com.arm.mbed.cloud.sdk.accountmanagement.model;

import java.util.Date;

import com.arm.mbed.cloud.sdk.annotations.Preamble;

@Preamble(description = "Group")
public class Group {
	/**
	 * The UUID of the group.
	 */
	private final String id;
	/**
	 * The UUID of the account this group belongs to.
	 */
	private final String accountId;
	/**
	 * The name of the group.
	 */
	private final String name;
	/**
	 * The number of users in this group.
	 */
	private final long userCount;
	/**
	 * The number of API keys in this group.
	 */
	private final long apiKeyCount;
	/**
	 * Creation time.
	 */
	private final Date createdAt;
	/**
	 * A timestamp of the group creation in the storage, in milliseconds.
	 */
	private final long creationTime;
	/**
	 * A timestamp of the latest group update, in milliseconds.
	 */
	private final long lastUpdateTime;

	public Group(String id, String accountId, String name, long userCount, long apiKeyCount, Date createdAt,
			long creationTime, long lastUpdateTime) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.name = name;
		this.userCount = userCount;
		this.apiKeyCount = apiKeyCount;
		this.createdAt = createdAt;
		this.creationTime = creationTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the userCount
	 */
	public long getUserCount() {
		return userCount;
	}

	/**
	 * @return the apiKeyCount
	 */
	public long getApiKeyCount() {
		return apiKeyCount;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @return the creationTime
	 */
	public long getCreationTime() {
		return creationTime;
	}

	/**
	 * @return the lastUpdateTime
	 */
	public long getLastUpdateTime() {
		return lastUpdateTime;
	}

}
