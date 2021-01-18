// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.adapters;

import com.arm.mbed.cloud.sdk.accounts.model.BusinessModelHistory;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import java.util.List;

/**
 * Adapter for business model histories.
 */
@Preamble(description = "Adapter for business model histories.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class BusinessModelHistoryAdapter {
    /**
     * Constructor.
     */
    private BusinessModelHistoryAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps a business model history into a business model history.
     * 
     * @param toBeMapped
     *            a business model history.
     * @return mapped a business model history
     */
    @Internal
    public static BusinessModelHistory
           map(com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BusinessModelHistory toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final BusinessModelHistory businessModelHistory = new BusinessModelHistory(TranslationUtils.toString(toBeMapped.getBusinessModel()),
                                                                                   TranslationUtils.toDate(toBeMapped.getUpdatedAt()));
        return businessModelHistory;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static
           GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BusinessModelHistory,
                                 BusinessModelHistory>
           getMapper() {
        return new GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BusinessModelHistory,
                                         BusinessModelHistory>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public BusinessModelHistory
                   map(com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BusinessModelHistory toBeMapped) {
                return BusinessModelHistoryAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps a list of business model history into a list of business model history.
     * 
     * @param toBeMapped
     *            a list of business model history.
     * @return mapped simple list
     */
    @Internal
    public static List<BusinessModelHistory>
           mapSimpleList(List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BusinessModelHistory> toBeMapped) {
        return GenericAdapter.mapList(toBeMapped, BusinessModelHistoryAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static
           GenericAdapter.Mapper<List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BusinessModelHistory>,
                                 List<BusinessModelHistory>>
           getSimpleListMapper() {
        return new GenericAdapter.Mapper<List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BusinessModelHistory>,
                                         List<BusinessModelHistory>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public List<BusinessModelHistory>
                   map(List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BusinessModelHistory> toBeMapped) {
                return BusinessModelHistoryAdapter.mapSimpleList(toBeMapped);
            }
        };
    }
}