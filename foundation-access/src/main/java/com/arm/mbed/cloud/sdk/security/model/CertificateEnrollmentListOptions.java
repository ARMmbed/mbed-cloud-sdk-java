// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.IncludeField;
import com.arm.mbed.cloud.sdk.common.listing.ListOptions;
import com.arm.mbed.cloud.sdk.common.listing.filtering.Filter;
import com.arm.mbed.cloud.sdk.common.listing.filtering.Filters;
import java.util.Date;
import java.util.List;

/**
 * Options to use when listing certificate enrollments.
 * <p>
 * Note:
 * <p>
 * <ul>
 * <li>Filters:
 * <p>
 * The list can be filtered server-side on some of the fields of a certificate enrollment.
 * <p>
 * The following filters are currently supported:
 * 
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
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">enrollResult</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_ENROLL_RESULT</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">certificateName</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_CERTIFICATE_NAME</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">updatedAt</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_UPDATED_AT</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">enrollStatus</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_ENROLL_STATUS</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">deviceId</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_DEVICE_ID</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">createdAt</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_CREATED_AT</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * </table>
 * </li>
 * </ul>
 */
@Preamble(description = "Options to use when listing certificate enrollments.")
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class CertificateEnrollmentListOptions extends ListOptions {
    /**
     * Tag for filter by updatedAt.
     */
    public static final String TAG_FILTER_BY_UPDATED_AT = "updatedAt";

    /**
     * Tag for filter by certificateName.
     */
    public static final String TAG_FILTER_BY_CERTIFICATE_NAME = "certificateName";

    /**
     * Tag for filter by deviceId.
     */
    public static final String TAG_FILTER_BY_DEVICE_ID = "deviceId";

    /**
     * Tag for filter by enrollResult.
     */
    public static final String TAG_FILTER_BY_ENROLL_RESULT = "enrollResult";

    /**
     * Tag for filter by createdAt.
     */
    public static final String TAG_FILTER_BY_CREATED_AT = "createdAt";

    /**
     * Tag for filter by enrollStatus.
     */
    public static final String TAG_FILTER_BY_ENROLL_STATUS = "enrollStatus";

    /**
     * Internal constructor.
     * 
     * <p>
     * Note: Should not be used. Use {@link #CertificateEnrollmentListOptions()} instead.
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
    public CertificateEnrollmentListOptions(Integer pageSize, Long maxResults, Order order, String after,
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
     * 
     * <p>
     * Note: Should not be used. Use {@link #CertificateEnrollmentListOptions()} instead.
     * 
     * @param certificateEnrollmentListOptions
     *            a certificate enrollment list options.
     */
    @Internal
    public CertificateEnrollmentListOptions(CertificateEnrollmentListOptions certificateEnrollmentListOptions) {
        this();
        setOptions(certificateEnrollmentListOptions);
    }

    /**
     * Constructor.
     */
    public CertificateEnrollmentListOptions() {
        super();
        setDefault();
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Note: Should not be used. Use {@link #CertificateEnrollmentListOptions()} instead.
     * 
     * @param after
     *            value.
     * @param include
     *            value.
     * @param filter
     *            value.
     */
    @Internal
    public CertificateEnrollmentListOptions(String after, List<IncludeField> include, Filters filter) {
        this((Integer) null, (Long) null, Order.getDefault(), after, include, filter);
    }

    /**
     * Gets all the filters defined on field {@code updatedAt}.
     * 
     * @return All the filters by {@code updatedAt}
     */
    public List<Filter> getUpdatedAtFilters() {
        return fetchFilters(TAG_FILTER_BY_UPDATED_AT);
    }

    /**
     * Sets "a less than" filter by {@code updatedAt}.
     * 
     * @param filterByUpdatedAt
     *            filter value.
     */
    public void addLessThanUpdatedAtFilter(Date filterByUpdatedAt) {
        addLessThanFilter(TAG_FILTER_BY_UPDATED_AT, filterByUpdatedAt);
    }

    /**
     * Sets "a less than" filter by {@code updatedAt}.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#addLessThanUpdatedAtFilter(java.util.Date)}
     * 
     * @param filterByUpdatedAt
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T lessThanUpdatedAt(Date filterByUpdatedAt) {
        addLessThanUpdatedAtFilter(filterByUpdatedAt);
        return (T) this;
    }

    /**
     * Sets "a greater than" filter by {@code updatedAt}.
     * 
     * @param filterByUpdatedAt
     *            filter value.
     */
    public void addGreaterThanUpdatedAtFilter(Date filterByUpdatedAt) {
        addGreaterThanFilter(TAG_FILTER_BY_UPDATED_AT, filterByUpdatedAt);
    }

    /**
     * Sets "a greater than" filter by {@code updatedAt}.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#addGreaterThanUpdatedAtFilter(java.util.Date)}
     * 
     * @param filterByUpdatedAt
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T greaterThanUpdatedAt(Date filterByUpdatedAt) {
        addGreaterThanUpdatedAtFilter(filterByUpdatedAt);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code certificateName}.
     * 
     * @return All the filters by {@code certificateName}
     */
    public List<Filter> getCertificateNameFilters() {
        return fetchFilters(TAG_FILTER_BY_CERTIFICATE_NAME);
    }

    /**
     * Sets "an equal to" filter by {@code certificateName}.
     * 
     * @param filterByCertificateName
     *            filter value.
     */
    public void addEqualToCertificateNameFilter(String filterByCertificateName) {
        addEqualFilter(TAG_FILTER_BY_CERTIFICATE_NAME, filterByCertificateName);
    }

    /**
     * Sets "an equal to" filter by {@code certificateName}.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#addEqualToCertificateNameFilter(String)}
     * 
     * @param filterByCertificateName
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T equalToCertificateName(String filterByCertificateName) {
        addEqualToCertificateNameFilter(filterByCertificateName);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code deviceId}.
     * 
     * @return All the filters by {@code deviceId}
     */
    public List<Filter> getDeviceIdFilters() {
        return fetchFilters(TAG_FILTER_BY_DEVICE_ID);
    }

    /**
     * Sets "an equal to" filter by {@code deviceId}.
     * 
     * @param filterByDeviceId
     *            filter value.
     */
    public void addEqualToDeviceIdFilter(String filterByDeviceId) {
        addEqualFilter(TAG_FILTER_BY_DEVICE_ID, filterByDeviceId);
    }

    /**
     * Sets "an equal to" filter by {@code deviceId}.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#addEqualToDeviceIdFilter(String)}
     * 
     * @param filterByDeviceId
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T equalToDeviceId(String filterByDeviceId) {
        addEqualToDeviceIdFilter(filterByDeviceId);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code enrollResult}.
     * 
     * @return All the filters by {@code enrollResult}
     */
    public List<Filter> getEnrollResultFilters() {
        return fetchFilters(TAG_FILTER_BY_ENROLL_RESULT);
    }

    /**
     * Sets "a not equal to" filter by {@code enrollResult}.
     * 
     * @param filterByEnrollResult
     *            filter value.
     */
    public void addNotEqualToEnrollResultFilter(CertificateEnrollmentEnrollResult filterByEnrollResult) {
        addNotEqualFilter(TAG_FILTER_BY_ENROLL_RESULT, filterByEnrollResult);
    }

    /**
     * Sets "a not equal to" filter by {@code enrollResult}.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#addNotEqualToEnrollResultFilter(com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentEnrollResult)}
     * 
     * @param filterByEnrollResult
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T
           notEqualToEnrollResult(CertificateEnrollmentEnrollResult filterByEnrollResult) {
        addNotEqualToEnrollResultFilter(filterByEnrollResult);
        return (T) this;
    }

    /**
     * Sets "an equal to" filter by {@code enrollResult}.
     * 
     * @param filterByEnrollResult
     *            filter value.
     */
    public void addEqualToEnrollResultFilter(CertificateEnrollmentEnrollResult filterByEnrollResult) {
        addEqualFilter(TAG_FILTER_BY_ENROLL_RESULT, filterByEnrollResult);
    }

    /**
     * Sets "an equal to" filter by {@code enrollResult}.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#addEqualToEnrollResultFilter(com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentEnrollResult)}
     * 
     * @param filterByEnrollResult
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T
           equalToEnrollResult(CertificateEnrollmentEnrollResult filterByEnrollResult) {
        addEqualToEnrollResultFilter(filterByEnrollResult);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code createdAt}.
     * 
     * @return All the filters by {@code createdAt}
     */
    public List<Filter> getCreatedAtFilters() {
        return fetchFilters(TAG_FILTER_BY_CREATED_AT);
    }

    /**
     * Sets "a less than" filter by {@code createdAt}.
     * 
     * @param filterByCreatedAt
     *            filter value.
     */
    public void addLessThanCreatedAtFilter(Date filterByCreatedAt) {
        addLessThanFilter(TAG_FILTER_BY_CREATED_AT, filterByCreatedAt);
    }

    /**
     * Sets "a less than" filter by {@code createdAt}.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#addLessThanCreatedAtFilter(java.util.Date)}
     * 
     * @param filterByCreatedAt
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T lessThanCreatedAt(Date filterByCreatedAt) {
        addLessThanCreatedAtFilter(filterByCreatedAt);
        return (T) this;
    }

    /**
     * Sets "a greater than" filter by {@code createdAt}.
     * 
     * @param filterByCreatedAt
     *            filter value.
     */
    public void addGreaterThanCreatedAtFilter(Date filterByCreatedAt) {
        addGreaterThanFilter(TAG_FILTER_BY_CREATED_AT, filterByCreatedAt);
    }

    /**
     * Sets "a greater than" filter by {@code createdAt}.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#addGreaterThanCreatedAtFilter(java.util.Date)}
     * 
     * @param filterByCreatedAt
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T greaterThanCreatedAt(Date filterByCreatedAt) {
        addGreaterThanCreatedAtFilter(filterByCreatedAt);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code enrollStatus}.
     * 
     * @return All the filters by {@code enrollStatus}
     */
    public List<Filter> getEnrollStatusFilters() {
        return fetchFilters(TAG_FILTER_BY_ENROLL_STATUS);
    }

    /**
     * Sets "a not equal to" filter by {@code enrollStatus}.
     * 
     * @param filterByEnrollStatus
     *            filter value.
     */
    public void addNotEqualToEnrollStatusFilter(CertificateEnrollmentEnrollStatus filterByEnrollStatus) {
        addNotEqualFilter(TAG_FILTER_BY_ENROLL_STATUS, filterByEnrollStatus);
    }

    /**
     * Sets "a not equal to" filter by {@code enrollStatus}.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#addNotEqualToEnrollStatusFilter(com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentEnrollStatus)}
     * 
     * @param filterByEnrollStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T
           notEqualToEnrollStatus(CertificateEnrollmentEnrollStatus filterByEnrollStatus) {
        addNotEqualToEnrollStatusFilter(filterByEnrollStatus);
        return (T) this;
    }

    /**
     * Sets "an equal to" filter by {@code enrollStatus}.
     * 
     * @param filterByEnrollStatus
     *            filter value.
     */
    public void addEqualToEnrollStatusFilter(CertificateEnrollmentEnrollStatus filterByEnrollStatus) {
        addEqualFilter(TAG_FILTER_BY_ENROLL_STATUS, filterByEnrollStatus);
    }

    /**
     * Sets "an equal to" filter by {@code enrollStatus}.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#addEqualToEnrollStatusFilter(com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentEnrollStatus)}
     * 
     * @param filterByEnrollStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T
           equalToEnrollStatus(CertificateEnrollmentEnrollStatus filterByEnrollStatus) {
        addEqualToEnrollStatusFilter(filterByEnrollStatus);
        return (T) this;
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
        return other instanceof CertificateEnrollmentListOptions;
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
        return "CertificateEnrollmentListOptions [pageSize=" + pageSize + ", maxResults=" + maxResults + ", order="
               + order + ", after=" + after + ", include="
               + com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder.encodeInclude(this) + ", filter="
               + retrieveFilterAsJson() + "]";
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
    public CertificateEnrollmentListOptions clone() {
        final CertificateEnrollmentListOptions opt = new CertificateEnrollmentListOptions();
        opt.setOptions(this);
        return opt;
    }
}
