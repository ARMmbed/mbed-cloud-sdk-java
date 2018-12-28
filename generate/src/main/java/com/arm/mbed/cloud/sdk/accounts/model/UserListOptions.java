// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.IncludeField;
import com.arm.mbed.cloud.sdk.common.listing.ListOptions;
import com.arm.mbed.cloud.sdk.common.listing.filtering.Filters;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;

/**
 * Options to use when listing users. */
@Preamble(
    description = "Options to use when listing users."
)
public class UserListOptions extends ListOptions {
  /**
   * Internal constructor.
   * <p>
   * Note: Should not be used. Use {@link #UserListOptions()} instead.
   * @param pageSize value.
   * @param maxResults value.
   * @param order enumerator value.
   * @param after value.
   * @param include value.
   * @param filter value.
   */
  @Internal
  public UserListOptions(Integer pageSize, Long maxResults, Order order, String after,
      List<IncludeField> include, Filters filter) {
    super();
    this.pageSize = pageSize;
    this.maxResults = maxResults;
    this.order = order;
    this.after = after;
    this.include = include;
    this.filter = filter;
  }

  /**
   * Internal constructor.
   * <p>
   * Note: Should not be used. Use {@link #UserListOptions()} instead.
   * @param userListOptions a user list options.
   */
  @Internal
  public UserListOptions(UserListOptions userListOptions) {
    this();
    setOptions(userListOptions);
  }

  /**
   * Constructor.
   */
  public UserListOptions() {
    super();
    setDefault();
  }

  /**
   * Returns a string representation of the object.
   * <p>
   * @see java.lang.Object#toString()
   * @return the string representation
   */
  @Override
  public String toString() {
    return "UserListOptions [pageSize=" + pageSize
        + ", maxResults=" + maxResults
        + ", order=" + order
        + ", after=" + after
        + ", include=" + encodeInclude() 
        + ", filter=" + retrieveFilterAsJson()  + "]";
  }

  /**
   * Clones this instance.
   * <p>
   * @see java.lang.Object#clone()
   * @return a cloned instance
   */
  @Override
  public UserListOptions clone() {
    final UserListOptions opt = new UserListOptions();
    opt.setOptions(this);
    return opt;
  }
}
