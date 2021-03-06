// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.PerformsNoOperation;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.List;
import java.util.Objects;

/**
 * Model for an oidc request.
 */
@Preamble(description = "Model for an oidc request.")
@SuppressWarnings({ "PMD.CyclomaticComplexity", "PMD.AvoidDuplicateLiterals" })
public class OidcRequest implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -328526066159431L;

    /**
     * URL of the OAuth 2.0 authorization endpoint.
     */
    private final String authorizationEndpoint;

    /**
     * For future use.
     */
    private final boolean autoEnrollment;

    /**
     * Mapping for non-standard OIDC claim names.
     */
    private final OidcRequestClaimMapping claimMapping;

    /**
     * Client ID needed to authenticate and gain access to identity provider's API.
     */
    private final String clientId;

    /**
     * Client secret needed to authenticate and gain access to identity provider's API.
     */
    private final String clientSecret;

    /**
     * URL of the provider's end session endpoint.
     */
    private final String endSessionEndpoint;

    /**
     * Issuer of the identity provider.
     */
    private final String issuer;

    /**
     * URL of the provider's JSON web key set document.
     */
    private final String jwksUri;

    /**
     * Provider's public keys and key IDs used to sign ID tokens. PEM-encoded.
     */
    private final List<IdentityProviderPublicKey> keys;

    /**
     * The URI needed to authenticate and gain access to identity provider's API. Leave this empty to use the default
     * redirect URI.
     */
    private final String redirectUri;

    /**
     * URL of the provider's token revocation endpoint.
     */
    private final String revocationEndpoint;

    /**
     * Space-separated list of scopes sent in the authentication request. When not configured otherwise, the default
     * scopes are ['openid profile email'](https://openid.net/specs/openid-connect-core-1_0.html#ScopeClaims).
     */
    private final String scopes;

    /**
     * URL of the OAuth 2.0 authorization endpoint.
     */
    private final String tokenEndpoint;

    /**
     * One way to obtain the access token. Since the request results in the transmission of clear-text credentials, the
     * client must use the POST mode.
     */
    @DefaultValue("POST")
    private final OidcRequestTokenMode tokenRequestMode;

    /**
     * Path to the standard data in the token response. Levels in the JSON structure must be separated by '.' (dot)
     * characters.
     */
    private final String tokenResponsePath;

    /**
     * URL of the OAuth 2.0 UserInfo endpoint.
     */
    private final String userinfoEndpoint;

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #OidcRequest()} instead.
     * 
     * @param authorizationEndpoint
     *            URL of the OAuth 2.0 authorization endpoint.
     * @param autoEnrollment
     *            For future use.
     * @param claimMapping
     *            Mapping for non-standard OIDC claim names.
     * @param clientId
     *            Client ID needed to authenticate and gain access to identity provider's API.
     * @param clientSecret
     *            Client secret needed to authenticate and gain access to identity provider's API.
     * @param endSessionEndpoint
     *            URL of the provider's end session endpoint.
     * @param issuer
     *            Issuer of the identity provider.
     * @param jwksUri
     *            URL of the provider's JSON web key set document.
     * @param keys
     *            Provider's public keys and key IDs used to sign ID tokens. PEM-encoded.
     * @param redirectUri
     *            The URI needed to authenticate and gain access to identity provider's API. Leave this empty to use the
     *            default redirect URI.
     * @param revocationEndpoint
     *            URL of the provider's token revocation endpoint.
     * @param scopes
     *            Space-separated list of scopes sent in the authentication request. When not configured otherwise, the
     *            default scopes are ['openid profile
     *            email'](https://openid.net/specs/openid-connect-core-1_0.html#ScopeClaims).
     * @param tokenEndpoint
     *            URL of the OAuth 2.0 authorization endpoint.
     * @param tokenRequestMode
     *            One way to obtain the access token. Since the request results in the transmission of clear-text
     *            credentials, the client must use the POST mode.
     * @param tokenResponsePath
     *            Path to the standard data in the token response. Levels in the JSON structure must be separated by '.'
     *            (dot) characters.
     * @param userinfoEndpoint
     *            URL of the OAuth 2.0 UserInfo endpoint.
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    public OidcRequest(String authorizationEndpoint, boolean autoEnrollment, OidcRequestClaimMapping claimMapping,
                       String clientId, String clientSecret, String endSessionEndpoint, String issuer, String jwksUri,
                       List<IdentityProviderPublicKey> keys, String redirectUri, String revocationEndpoint,
                       String scopes, String tokenEndpoint, @DefaultValue("POST") OidcRequestTokenMode tokenRequestMode,
                       String tokenResponsePath, String userinfoEndpoint) {
        super();
        this.authorizationEndpoint = authorizationEndpoint;
        this.autoEnrollment = autoEnrollment;
        this.claimMapping = claimMapping;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.endSessionEndpoint = endSessionEndpoint;
        this.issuer = issuer;
        this.jwksUri = jwksUri;
        this.keys = keys;
        this.redirectUri = redirectUri;
        this.revocationEndpoint = revocationEndpoint;
        this.scopes = scopes;
        this.tokenEndpoint = tokenEndpoint;
        this.tokenRequestMode = tokenRequestMode;
        this.tokenResponsePath = tokenResponsePath;
        this.userinfoEndpoint = userinfoEndpoint;
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on a similar object.
     * <p>
     * Note: Should not be used. Use {@link #OidcRequest()} instead.
     * 
     * @param oidcRequest
     *            an oidc request.
     */
    @Internal
    public OidcRequest(OidcRequest oidcRequest) {
        this(oidcRequest == null ? (String) null : oidcRequest.authorizationEndpoint,
             oidcRequest != null && oidcRequest.autoEnrollment,
             oidcRequest == null ? (OidcRequestClaimMapping) null : oidcRequest.claimMapping,
             oidcRequest == null ? (String) null : oidcRequest.clientId,
             oidcRequest == null ? (String) null : oidcRequest.clientSecret,
             oidcRequest == null ? (String) null : oidcRequest.endSessionEndpoint,
             oidcRequest == null ? (String) null : oidcRequest.issuer,
             oidcRequest == null ? (String) null : oidcRequest.jwksUri,
             oidcRequest == null ? (List<IdentityProviderPublicKey>) null : oidcRequest.keys,
             oidcRequest == null ? (String) null : oidcRequest.redirectUri,
             oidcRequest == null ? (String) null : oidcRequest.revocationEndpoint,
             oidcRequest == null ? (String) null : oidcRequest.scopes,
             oidcRequest == null ? (String) null : oidcRequest.tokenEndpoint,
             oidcRequest == null ? OidcRequestTokenMode.getValue("POST") : oidcRequest.tokenRequestMode,
             oidcRequest == null ? (String) null : oidcRequest.tokenResponsePath,
             oidcRequest == null ? (String) null : oidcRequest.userinfoEndpoint);
    }

    /**
     * Constructor.
     */
    public OidcRequest() {
        this((String) null, false, (OidcRequestClaimMapping) null, (String) null, (String) null, (String) null,
             (String) null, (String) null, (List<IdentityProviderPublicKey>) null, (String) null, (String) null,
             (String) null, (String) null, OidcRequestTokenMode.getValue("POST"), (String) null, (String) null);
    }

    /**
     * Sets id.
     * 
     * @param id
     *            id.
     */
    @Override
    @Internal
    @PerformsNoOperation
    public void setId(String id) {
        // Nothing to do
    }

    /**
     * Gets id.
     * 
     * <p>
     * Warning: OidcRequest model does not have any ID field. This always returns {@code null}.
     * 
     * @return id
     */
    @Override
    @Internal
    public String getId() {
        return null;
    }

    /**
     * Gets url of the oauth 2.0 authorization endpoint.
     * 
     * @return authorizationEndpoint
     */
    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    /**
     * Gets for future use.
     * 
     * @return autoEnrollment
     */
    public boolean isAutoEnrollment() {
        return autoEnrollment;
    }

    /**
     * Gets mapping for non-standard oidc claim names.
     * 
     * @return claimMapping
     */
    public OidcRequestClaimMapping getClaimMapping() {
        return claimMapping;
    }

    /**
     * Gets client id needed to authenticate and gain access to identity provider's api.
     * 
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Gets client secret needed to authenticate and gain access to identity provider's api.
     * 
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Gets url of the provider's end session endpoint.
     * 
     * @return endSessionEndpoint
     */
    public String getEndSessionEndpoint() {
        return endSessionEndpoint;
    }

    /**
     * Gets issuer of the identity provider.
     * 
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Gets url of the provider's json web key set document.
     * 
     * @return jwksUri
     */
    public String getJwksUri() {
        return jwksUri;
    }

    /**
     * Gets provider's public keys and key ids used to sign id tokens. pem-encoded.
     * 
     * @return keys
     */
    public List<IdentityProviderPublicKey> getKeys() {
        return keys;
    }

    /**
     * Gets the uri needed to authenticate and gain access to identity provider's api. leave this empty to use the
     * default redirect uri.
     * 
     * @return redirectUri
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * Gets url of the provider's token revocation endpoint.
     * 
     * @return revocationEndpoint
     */
    public String getRevocationEndpoint() {
        return revocationEndpoint;
    }

    /**
     * Gets space-separated list of scopes sent in the authentication request. when not configured otherwise, the
     * default scopes are ['openid profile email'](https://openid.net/specs/openid-connect-core-1_0.html#scopeclaims).
     * 
     * @return scopes
     */
    public String getScopes() {
        return scopes;
    }

    /**
     * Gets url of the oauth 2.0 authorization endpoint.
     * 
     * @return tokenEndpoint
     */
    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    /**
     * Gets one way to obtain the access token. since the request results in the transmission of clear-text credentials,
     * the client must use the post mode.
     * 
     * @return tokenRequestMode
     */
    public OidcRequestTokenMode getTokenRequestMode() {
        return tokenRequestMode;
    }

    /**
     * Gets path to the standard data in the token response. levels in the json structure must be separated by '.' (dot)
     * characters.
     * 
     * @return tokenResponsePath
     */
    public String getTokenResponsePath() {
        return tokenResponsePath;
    }

    /**
     * Gets url of the oauth 2.0 userinfo endpoint.
     * 
     * @return userinfoEndpoint
     */
    public String getUserinfoEndpoint() {
        return userinfoEndpoint;
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
        return "OidcRequest [authorizationEndpoint=" + authorizationEndpoint + ", autoEnrollment=" + autoEnrollment
               + ", claimMapping=" + claimMapping + ", clientId=" + clientId + ", clientSecret=" + clientSecret
               + ", endSessionEndpoint=" + endSessionEndpoint + ", issuer=" + issuer + ", jwksUri=" + jwksUri
               + ", keys=" + keys + ", redirectUri=" + redirectUri + ", revocationEndpoint=" + revocationEndpoint
               + ", scopes=" + scopes + ", tokenEndpoint=" + tokenEndpoint + ", tokenRequestMode=" + tokenRequestMode
               + ", tokenResponsePath=" + tokenResponsePath + ", userinfoEndpoint=" + userinfoEndpoint + "]";
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
        result = prime * result + ((authorizationEndpoint == null) ? 0 : authorizationEndpoint.hashCode());
        result = prime * result + Objects.hashCode(Boolean.valueOf(autoEnrollment));
        result = prime * result + ((claimMapping == null) ? 0 : claimMapping.hashCode());
        result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
        result = prime * result + ((clientSecret == null) ? 0 : clientSecret.hashCode());
        result = prime * result + ((endSessionEndpoint == null) ? 0 : endSessionEndpoint.hashCode());
        result = prime * result + ((issuer == null) ? 0 : issuer.hashCode());
        result = prime * result + ((jwksUri == null) ? 0 : jwksUri.hashCode());
        result = prime * result + ((keys == null) ? 0 : keys.hashCode());
        result = prime * result + ((redirectUri == null) ? 0 : redirectUri.hashCode());
        result = prime * result + ((revocationEndpoint == null) ? 0 : revocationEndpoint.hashCode());
        result = prime * result + ((scopes == null) ? 0 : scopes.hashCode());
        result = prime * result + ((tokenEndpoint == null) ? 0 : tokenEndpoint.hashCode());
        result = prime * result + ((tokenRequestMode == null) ? 0 : tokenRequestMode.hashCode());
        result = prime * result + ((tokenResponsePath == null) ? 0 : tokenResponsePath.hashCode());
        result = prime * result + ((userinfoEndpoint == null) ? 0 : userinfoEndpoint.hashCode());
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
        return other instanceof OidcRequest;
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
        if (!(obj instanceof OidcRequest)) {
            return false;
        }
        final OidcRequest other = (OidcRequest) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (authorizationEndpoint == null) {
            if (other.authorizationEndpoint != null) {
                return false;
            }
        } else if (!authorizationEndpoint.equals(other.authorizationEndpoint)) {
            return false;
        }
        if (autoEnrollment != other.autoEnrollment) {
            return false;
        }
        if (claimMapping == null) {
            if (other.claimMapping != null) {
                return false;
            }
        } else if (!claimMapping.equals(other.claimMapping)) {
            return false;
        }
        if (clientId == null) {
            if (other.clientId != null) {
                return false;
            }
        } else if (!clientId.equals(other.clientId)) {
            return false;
        }
        if (clientSecret == null) {
            if (other.clientSecret != null) {
                return false;
            }
        } else if (!clientSecret.equals(other.clientSecret)) {
            return false;
        }
        if (endSessionEndpoint == null) {
            if (other.endSessionEndpoint != null) {
                return false;
            }
        } else if (!endSessionEndpoint.equals(other.endSessionEndpoint)) {
            return false;
        }
        if (issuer == null) {
            if (other.issuer != null) {
                return false;
            }
        } else if (!issuer.equals(other.issuer)) {
            return false;
        }
        if (jwksUri == null) {
            if (other.jwksUri != null) {
                return false;
            }
        } else if (!jwksUri.equals(other.jwksUri)) {
            return false;
        }
        if (keys == null) {
            if (other.keys != null) {
                return false;
            }
        } else if (!keys.equals(other.keys)) {
            return false;
        }
        if (redirectUri == null) {
            if (other.redirectUri != null) {
                return false;
            }
        } else if (!redirectUri.equals(other.redirectUri)) {
            return false;
        }
        if (revocationEndpoint == null) {
            if (other.revocationEndpoint != null) {
                return false;
            }
        } else if (!revocationEndpoint.equals(other.revocationEndpoint)) {
            return false;
        }
        if (scopes == null) {
            if (other.scopes != null) {
                return false;
            }
        } else if (!scopes.equals(other.scopes)) {
            return false;
        }
        if (tokenEndpoint == null) {
            if (other.tokenEndpoint != null) {
                return false;
            }
        } else if (!tokenEndpoint.equals(other.tokenEndpoint)) {
            return false;
        }
        if (tokenRequestMode != other.tokenRequestMode) {
            return false;
        }
        if (tokenResponsePath == null) {
            if (other.tokenResponsePath != null) {
                return false;
            }
        } else if (!tokenResponsePath.equals(other.tokenResponsePath)) {
            return false;
        }
        if (userinfoEndpoint == null) {
            if (other.userinfoEndpoint != null) {
                return false;
            }
        } else if (!userinfoEndpoint.equals(other.userinfoEndpoint)) {
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
        return true;
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
    public OidcRequest clone() {
        return new OidcRequest(this);
    }
}
