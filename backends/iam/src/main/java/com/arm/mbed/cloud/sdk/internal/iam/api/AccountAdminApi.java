package com.arm.mbed.cloud.sdk.internal.iam.api;

import com.arm.mbed.cloud.sdk.internal.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.arm.mbed.cloud.sdk.internal.iam.model.AccountCreationReq;
import com.arm.mbed.cloud.sdk.internal.iam.model.AccountCreationResp;
import com.arm.mbed.cloud.sdk.internal.iam.model.AccountInfo;
import com.arm.mbed.cloud.sdk.internal.iam.model.AccountInfoList;
import com.arm.mbed.cloud.sdk.internal.iam.model.AccountUpdateReq;
import com.arm.mbed.cloud.sdk.internal.iam.model.AccountUpdateRootReq;
import com.arm.mbed.cloud.sdk.internal.iam.model.ErrorResponse;
import com.arm.mbed.cloud.sdk.internal.iam.model.SubjectList;
import com.arm.mbed.cloud.sdk.internal.iam.model.TrustedCertificateReq;
import com.arm.mbed.cloud.sdk.internal.iam.model.TrustedCertificateResp;
import com.arm.mbed.cloud.sdk.internal.iam.model.UpdatedResponse;
import com.arm.mbed.cloud.sdk.internal.iam.model.UserCreationReq;
import com.arm.mbed.cloud.sdk.internal.iam.model.UserInfoResp;
import com.arm.mbed.cloud.sdk.internal.iam.model.UserInfoRespList;
import com.arm.mbed.cloud.sdk.internal.iam.model.UserUpdateReq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AccountAdminApi {
  /**
   * Upload a new trusted certificate.
   * An endpoint for uploading new trusted certificates.
   * @param body A trusted certificate object with attributes. (required)
   * @return Call&lt;TrustedCertificateResp&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("v3/trusted-certificates")
  Call<TrustedCertificateResp> addCertificate(
    @retrofit2.http.Body TrustedCertificateReq body
  );

  /**
   * Add members to a group.
   * An endpoint for adding users and API keys to groups.
   * @param groupID The ID of the group to be updated. (required)
   * @param body A list of users and API keys to be added to the group. (required)
   * @return Call&lt;UpdatedResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("v3/policy-groups/{groupID}")
  Call<UpdatedResponse> addSubjectsToGroup(
    @retrofit2.http.Path("groupID") String groupID, @retrofit2.http.Body SubjectList body
  );

  /**
   * Create a new account.
   * An endpoint for creating a new account.
   * @param body Details of the account to be created. (required)
   * @param action Action, either &#39;create&#39; or &#39;enroll&#39;. (optional, default to create)
   * @return Call&lt;AccountCreationResp&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("v3/accounts")
  Call<AccountCreationResp> createAccount(
    @retrofit2.http.Body AccountCreationReq body, @retrofit2.http.Query("action") String action
  );

  /**
   * Create a new user.
   * An endpoint for creating or inviting a new user to the account. In case of invitation email address is used only, other attributes are set in the 2nd step.
   * @param body A user object with attributes. (required)
   * @param action Action, either &#39;create&#39; or &#39;invite&#39;. (optional, default to create)
   * @return Call&lt;UserInfoResp&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("v3/users")
  Call<UserInfoResp> createUser(
    @retrofit2.http.Body UserCreationReq body, @retrofit2.http.Query("action") String action
  );

  /**
   * Delete a user.
   * An endpoint for deleting a user.
   * @param userId The ID of the user to be deleted. (required)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("v3/users/{user-id}")
  Call<Void> deleteUser(
    @retrofit2.http.Path("user-id") String userId
  );

  /**
   * Get account info.
   * Returns detailed information about the account.
   * @param accountID The ID or alias of the account to be fetched. (required)
   * @param include Comma separated additional data to return. Currently supported: limits, policies, sub_accounts (optional)
   * @return Call&lt;AccountInfo&gt;
   */
  
  @GET("v3/accounts/{accountID}")
  Call<AccountInfo> getAccountInfo(
    @retrofit2.http.Path("accountID") String accountID, @retrofit2.http.Query("include") String include
  );

  /**
   * Get all accounts.
   * Returns an array of account objects, optionally filtered by status and tier level.
   * @param statusEq An optional filter for account status, ENROLLING, ACTIVE, RESTRICTED or SUSPENDED. (optional)
   * @param tierEq An optional filter for tier level, must be 0, 1 or omitted. (optional)
   * @param parentEq An optional filter for parent account ID. (optional)
   * @param endMarketEq An optional filter for account end market. (optional)
   * @param limit The number of results to return (2-1000), default is 1000. (optional, default to 1000)
   * @param after The entity ID to fetch after the given one. (optional)
   * @param include Comma separated additional data to return. Currently supported: total_count,limits (optional)
   * @param format Format information for the response to the query, supported: format&#x3D;breakdown. (optional)
   * @return Call&lt;AccountInfoList&gt;
   */
  
  @GET("v3/accounts")
  Call<AccountInfoList> getAllAccounts(
    @retrofit2.http.Query("status__eq") String statusEq, @retrofit2.http.Query("tier__eq") String tierEq, @retrofit2.http.Query("parent__eq") String parentEq, @retrofit2.http.Query("end_market__eq") String endMarketEq, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("after") String after, @retrofit2.http.Query("include") String include, @retrofit2.http.Query("format") String format
  );

  /**
   * Get the details of all users.
   * An endpoint for retrieving the details of all users.
   * @param limit The number of results to return (2-1000), default is 50. (optional, default to 50)
   * @param after The entity ID to fetch after the given one. (optional)
   * @param order The order of the records, ASC or DESC; by default ASC (optional, default to ASC)
   * @param include Comma separated additional data to return. Currently supported: total_count (optional)
   * @param statusEq Filter for status, for example active or reset (optional)
   * @return Call&lt;UserInfoRespList&gt;
   */
  
  @GET("v3/users")
  Call<UserInfoRespList> getAllUsers(
    @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("after") String after, @retrofit2.http.Query("order") String order, @retrofit2.http.Query("include") String include, @retrofit2.http.Query("status__eq") String statusEq
  );

  /**
   * Details of a user.
   * An endpoint for retrieving the details of a user.
   * @param userId The ID or name of the user whose details are retrieved. (required)
   * @return Call&lt;UserInfoResp&gt;
   */
  
  @GET("v3/users/{user-id}")
  Call<UserInfoResp> getUser(
    @retrofit2.http.Path("user-id") String userId
  );

  /**
   * Get users of a group.
   * An endpoint for listing the users of a group with details.
   * @param groupID The ID of the group whose users are retrieved. (required)
   * @param limit The number of results to return (2-1000), default is 50. (optional, default to 50)
   * @param after The entity ID to fetch after the given one. (optional)
   * @param order The order of the records, ASC or DESC; by default ASC (optional, default to ASC)
   * @param include Comma separated additional data to return. Currently supported: total_count (optional)
   * @return Call&lt;UserInfoRespList&gt;
   */
  
  @GET("v3/policy-groups/{groupID}/users")
  Call<UserInfoRespList> getUsersOfGroup(
    @retrofit2.http.Path("groupID") String groupID, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("after") String after, @retrofit2.http.Query("order") String order, @retrofit2.http.Query("include") String include
  );

  /**
   * Remove users from a group.
   * An endpoint for removing users from groups.
   * @param groupID The ID of the group whose users are removed. (required)
   * @param body A list of users to be removed from the group. (required)
   * @return Call&lt;UpdatedResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @DELETE("v3/policy-groups/{groupID}/users")
  Call<UpdatedResponse> removeUsersFromGroup(
    @retrofit2.http.Path("groupID") String groupID, @retrofit2.http.Body SubjectList body
  );

  /**
   * Update attributes of an existing account.
   * An endpoint for updating an account.
   * @param accountID The ID of the account to be updated. (required)
   * @param body Details of the account to be updated. (required)
   * @return Call&lt;AccountInfo&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @PUT("v3/accounts/{accountID}")
  Call<AccountInfo> updateAccount(
    @retrofit2.http.Path("accountID") String accountID, @retrofit2.http.Body AccountUpdateRootReq body
  );

  /**
   * Updates attributes of the account.
   * An endpoint for updating the account. Example usage: curl -X PUT https://api.us-east-1.mbedcloud.com/v3/accounts/me -d &#39;{\&quot;phone_number\&quot;: \&quot;12345678\&quot;}&#39; -H &#39;content-type: application/json&#39; -H &#39;Authorization: Bearer AUTH_TOKEN&#39; 
   * @param body Details of the account to be updated. (required)
   * @return Call&lt;AccountInfo&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @PUT("v3/accounts/me")
  Call<AccountInfo> updateMyAccount(
    @retrofit2.http.Body AccountUpdateReq body
  );

  /**
   * Update user details.
   * An endpoint for updating user details.
   * @param userId The ID of the user whose details are updated. (required)
   * @param body A user object with attributes. (required)
   * @return Call&lt;UserInfoResp&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @PUT("v3/users/{user-id}")
  Call<UserInfoResp> updateUser(
    @retrofit2.http.Path("user-id") String userId, @retrofit2.http.Body UserUpdateReq body
  );

}
