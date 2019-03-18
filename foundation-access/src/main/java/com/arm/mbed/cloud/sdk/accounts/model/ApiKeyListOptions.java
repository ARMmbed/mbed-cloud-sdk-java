// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.IncludeField;
import com.arm.mbed.cloud.sdk.common.listing.ListOptions;
import com.arm.mbed.cloud.sdk.common.listing.filtering.Filter;
import com.arm.mbed.cloud.sdk.common.listing.filtering.Filters;
import java.util.List;

/**
 * Options to use when listing api keys.
 * <p>
 * Note:
 * <p>
 * <ul>
 * <li>Filters:
 * <p>
 * The list can be filtered server-side on some of the fields of an api key.
 * <p>
 * The following filters are currently supported:
 * <p>
 * <table style="border: 2px solid navy; width:100%; border-collapse:collapse;border-spacing:0" summary="Available
 * filters">
 * <caption>Server-side filters</caption>
 * <tr>
 * <th style="background-color:#cbcefb;border-color:inherit;text-align:center" rowspan="2">Field</th>
 * <th style="background-color:#cbcefb;border-color:inherit;text-align:center" rowspan="2">Tag</th>
 * <th style="background-color:#cbcefb;border-color:inherit;text-align:center" colspan="7">Filters</th>
 * </tr>
 * <tr>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">not equal to</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">equal to</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">greater than</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">less than</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">like</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">in</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">not in</td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">owner</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_OWNER</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">key</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_KEY</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * </table>
 * </li>
 * </ul>
 */
@Preamble(description = "Options to use when listing api keys.")
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class ApiKeyListOptions extends ListOptions {
    /**
     * Tag for filter by owner.
     */
    public static final String TAG_FILTER_BY_OWNER = "owner";

    /**
     * Tag for filter by key.
     */
    public static final String TAG_FILTER_BY_KEY = "key";

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #ApiKeyListOptions()} instead.
     * 
     * @param pageSize
     *            value.
     * @param maxResults
     *            value.
     * @param order
     *            enumerator value.
     * @param after
     *            value.
     * @param include
     *            value.
     * @param filter
     *            value.
     */
    @Internal
    public ApiKeyListOptions(Integer pageSize, Long maxResults, Order order, String after, List<IncludeField> include,
                             Filters filter) {
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
     * Note: Should not be used. Use {@link #ApiKeyListOptions()} instead.
     * 
     * @param apiKeyListOptions
     *            an api key list options.
     */
    @Internal
    public ApiKeyListOptions(ApiKeyListOptions apiKeyListOptions) {
        this();
        setOptions(apiKeyListOptions);
    }

    /**
     * Constructor.
     */
    public ApiKeyListOptions() {
        super();
        setDefault();
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #ApiKeyListOptions()} instead.
     * 
     * @param after
     *            value.
     * @param include
     *            value.
     * @param filter
     *            value.
     */
    @Internal
    public ApiKeyListOptions(String after, List<IncludeField> include, Filters filter) {
        this((Integer) null, (Long) null, Order.getDefault(), after, include, filter);
    }

    /**
     * Gets all the filters defined on field {@code owner}.
     * 
     * @return All the filters by {@code owner}
     */
    public List<Filter> getOwnerFilters() {
        return fetchFilters(TAG_FILTER_BY_OWNER);
    }

    /**
     * Sets "an equal to" filter by {@code owner}.
     * 
     * @param filterByOwner
     *            filter value.
     */
    public void addEqualToOwnerFilter(String filterByOwner) {
        addEqualFilter(TAG_FILTER_BY_OWNER, filterByOwner);
    }

    /**
     * Sets "an equal to" filter by {@code owner}.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.ApiKeyListOptions#addEqualToOwnerFilter(String)}
     * 
     * @param filterByOwner
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends ApiKeyListOptions> T equalToOwner(String filterByOwner) {
        addEqualToOwnerFilter(filterByOwner);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code key}.
     * 
     * @return All the filters by {@code key}
     */
    public List<Filter> getKeyFilters() {
        return fetchFilters(TAG_FILTER_BY_KEY);
    }

    /**
     * Sets "an equal to" filter by {@code key}.
     * 
     * @param filterByKey
     *            filter value.
     */
    public void addEqualToKeyFilter(String filterByKey) {
        addEqualFilter(TAG_FILTER_BY_KEY, filterByKey);
    }

    /**
     * Sets "an equal to" filter by {@code key}.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.ApiKeyListOptions#addEqualToKeyFilter(String)}
     * 
     * @param filterByKey
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends ApiKeyListOptions> T equalToKey(String filterByKey) {
        addEqualToKeyFilter(filterByKey);
        return (T) this;
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
        return other instanceof ApiKeyListOptions;
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
        return "ApiKeyListOptions [pageSize=" + pageSize + ", maxResults=" + maxResults + ", order=" + order
               + ", after=" + after + ", include="
               + com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder.encodeInclude(this) + ", filter="
               + retrieveFilterAsJson() + "]";
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public ApiKeyListOptions clone() {
        final ApiKeyListOptions opt = new ApiKeyListOptions();
        opt.setOptions(this);
        return opt;
    }
}
