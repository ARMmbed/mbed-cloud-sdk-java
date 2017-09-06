package com.arm.mbed.cloud.sdk.connect.adapters;

import java.util.LinkedList;
import java.util.List;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.GenericAdapter.Mapper;
import com.arm.mbed.cloud.sdk.connect.model.Presubscription;
import com.arm.mbed.cloud.sdk.internal.mds.model.PresubscriptionArray;
import com.arm.mbed.cloud.sdk.internal.mds.model.ResourcePath;

@Preamble(description = "Adapter for presubscription model")
public class PresubscriptionAdapter {

    public static Presubscription map(com.arm.mbed.cloud.sdk.internal.mds.model.Presubscription apiPresubscription) {
        if (apiPresubscription == null) {
            return null;
        }
        Presubscription presubscription = new Presubscription();
        presubscription.setDeviceId(apiPresubscription.getEndpointName());
        presubscription.setDeviceType(apiPresubscription.getEndpointType());
        presubscription.setResourcePaths(convertResourcePathList(apiPresubscription.getResourcePath()));
        return presubscription;
    }

    public static com.arm.mbed.cloud.sdk.internal.mds.model.Presubscription reverseMap(
            Presubscription presubscription) {
        if (presubscription == null) {
            return null;
        }
        com.arm.mbed.cloud.sdk.internal.mds.model.Presubscription apiPresubscription = new com.arm.mbed.cloud.sdk.internal.mds.model.Presubscription();
        apiPresubscription.setEndpointName(presubscription.getDeviceId());
        apiPresubscription.setEndpointType(presubscription.getDeviceType());
        apiPresubscription.setResourcePath(reverseResourcePathList(presubscription.getResourcePaths()));
        return apiPresubscription;
    }

    public static Mapper<com.arm.mbed.cloud.sdk.internal.mds.model.Presubscription, Presubscription> getMapper() {
        return new Mapper<com.arm.mbed.cloud.sdk.internal.mds.model.Presubscription, Presubscription>() {

            @Override
            public Presubscription map(com.arm.mbed.cloud.sdk.internal.mds.model.Presubscription toBeMapped) {
                return PresubscriptionAdapter.map(toBeMapped);
            }

        };
    }

    public static Mapper<Presubscription, com.arm.mbed.cloud.sdk.internal.mds.model.Presubscription> getReverseMapper() {
        return new Mapper<Presubscription, com.arm.mbed.cloud.sdk.internal.mds.model.Presubscription>() {

            @Override
            public com.arm.mbed.cloud.sdk.internal.mds.model.Presubscription map(Presubscription toBeMapped) {
                return PresubscriptionAdapter.reverseMap(toBeMapped);
            }

        };
    }

    private static List<String> convertResourcePathList(List<ResourcePath> paths) {
        List<String> pathStrings = null;
        if (paths != null) {
            for (ResourcePath path : paths) {
                if (pathStrings == null) {
                    pathStrings = new LinkedList<>();
                }
                pathStrings.add(path.toString());
            }
        }
        return pathStrings;
    }

    private static List<ResourcePath> reverseResourcePathList(List<String> resourcePaths) {
        // TODO
        List<ResourcePath> pathStrings = null;
        if (resourcePaths != null) {
            for (String path : resourcePaths) {
                if (pathStrings == null) {
                    pathStrings = new LinkedList<>();
                }
                // pathStrings.add(path.toString());
            }
        }
        return pathStrings;
    }

    public static List<Presubscription> mapList(PresubscriptionArray list) {
        if (list == null) {
            return null;
        }
        return GenericAdapter.mapList(list, getMapper());
    }

    public static PresubscriptionArray reverseMapList(List<Presubscription> list) {
        return (PresubscriptionArray) GenericAdapter.mapList(list, new PresubscriptionArray(), getReverseMapper());
    }

    public static Mapper<PresubscriptionArray, List<Presubscription>> getListMapper() {
        return new Mapper<PresubscriptionArray, List<Presubscription>>() {

            @Override
            public List<Presubscription> map(PresubscriptionArray toBeMapped) {
                return PresubscriptionAdapter.mapList(toBeMapped);
            }

        };
    }

}
