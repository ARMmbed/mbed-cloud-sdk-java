// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.adapters;

import com.arm.mbed.cloud.sdk.accounts.model.LoginProfileType;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.LoginProfile;
import java.util.List;

/**
 * Adapter for login profiles.
 */
@Preamble(description = "Adapter for login profiles.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class LoginProfileAdapter {
    /**
     * Constructor.
     */
    private LoginProfileAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps a login profile into a login profile.
     * 
     * @param toBeMapped
     *            a login profile.
     * @return mapped a login profile
     */
    @Internal
    public static LoginProfile reverseMapAddRequest(com.arm.mbed.cloud.sdk.accounts.model.LoginProfile toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final LoginProfile loginProfile = new LoginProfile();
        loginProfile.setId(toBeMapped.getId());
        return loginProfile;
    }

    /**
     * Maps a list of login profile into a list of login profile.
     * 
     * @param toBeMapped
     *            a list of login profile.
     * @return mapped simple list
     */
    @Internal
    public static List<LoginProfile>
           reverseMapAddSimpleList(List<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile> toBeMapped) {
        return GenericAdapter.mapList(toBeMapped, LoginProfileAdapter.getAddMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile, LoginProfile>
           getAddMapper() {
        return new GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile, LoginProfile>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public LoginProfile map(com.arm.mbed.cloud.sdk.accounts.model.LoginProfile toBeMapped) {
                return LoginProfileAdapter.reverseMapAddRequest(toBeMapped);
            }
        };
    }

    /**
     * Maps a login profile into a login profile.
     * 
     * @param toBeMapped
     *            a login profile.
     * @return mapped a login profile
     */
    @Internal
    public static com.arm.mbed.cloud.sdk.accounts.model.LoginProfile map(LoginProfile toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final com.arm.mbed.cloud.sdk.accounts.model.LoginProfile loginProfile = new com.arm.mbed.cloud.sdk.accounts.model.LoginProfile(translateToLoginProfileType(toBeMapped.getType()));
        loginProfile.setId(toBeMapped.getId());
        loginProfile.setName(toBeMapped.getName());
        return loginProfile;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<LoginProfile, com.arm.mbed.cloud.sdk.accounts.model.LoginProfile> getMapper() {
        return new GenericAdapter.Mapper<LoginProfile, com.arm.mbed.cloud.sdk.accounts.model.LoginProfile>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public com.arm.mbed.cloud.sdk.accounts.model.LoginProfile map(LoginProfile toBeMapped) {
                return LoginProfileAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps a list of login profile into a list of login profile.
     * 
     * @param toBeMapped
     *            a list of login profile.
     * @return mapped simple list
     */
    @Internal
    public static List<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile>
           mapSimpleList(List<LoginProfile> toBeMapped) {
        return GenericAdapter.mapList(toBeMapped, LoginProfileAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<List<LoginProfile>, List<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile>>
           getSimpleListMapper() {
        return new GenericAdapter.Mapper<List<LoginProfile>,
                                         List<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public List<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile> map(List<LoginProfile> toBeMapped) {
                return LoginProfileAdapter.mapSimpleList(toBeMapped);
            }
        };
    }

    /**
     * Maps a login profile into a login profile.
     * 
     * @param toBeMapped
     *            a login profile.
     * @return mapped a login profile
     */
    @Internal
    public static LoginProfile reverseMapUpdateRequest(com.arm.mbed.cloud.sdk.accounts.model.LoginProfile toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final LoginProfile loginProfile = new LoginProfile();
        loginProfile.setId(toBeMapped.getId());
        return loginProfile;
    }

    /**
     * Maps a list of login profile into a list of login profile.
     * 
     * @param toBeMapped
     *            a list of login profile.
     * @return mapped simple list
     */
    @Internal
    public static List<LoginProfile>
           reverseMapUpdateSimpleList(List<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile> toBeMapped) {
        return GenericAdapter.mapList(toBeMapped, LoginProfileAdapter.getUpdateMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile, LoginProfile>
           getUpdateMapper() {
        return new GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile, LoginProfile>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public LoginProfile map(com.arm.mbed.cloud.sdk.accounts.model.LoginProfile toBeMapped) {
                return LoginProfileAdapter.reverseMapUpdateRequest(toBeMapped);
            }
        };
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a type enum.
     * @return mapped enum value
     */
    @Internal
    protected static LoginProfileType translateToLoginProfileType(LoginProfile.TypeEnum toBeMapped) {
        if (toBeMapped == null) {
            return LoginProfileType.getUnknownEnum();
        }
        switch (toBeMapped) {
            case NATIVE:
                return LoginProfileType.NATIVE;
            case MBED:
                return LoginProfileType.MBED;
            case SAML2:
                return LoginProfileType.SAML2;
            case OIDC:
                return LoginProfileType.OIDC;
            default:
                return LoginProfileType.getUnknownEnum();
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a login profile type.
     * @return mapped enum value
     */
    @Internal
    protected static LoginProfile.TypeEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelLoginprofileTypeenum(LoginProfileType toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case NATIVE:
                return LoginProfile.TypeEnum.NATIVE;
            case MBED:
                return LoginProfile.TypeEnum.MBED;
            case SAML2:
                return LoginProfile.TypeEnum.SAML2;
            case OIDC:
                return LoginProfile.TypeEnum.OIDC;
            default:
                return null;
        }
    }
}
