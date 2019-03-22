/*
 * Mbed Cloud API
 * The full Mbed Cloud API
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * This object represents arrays of user and API key IDs.
 */
@ApiModel(description = "This object represents arrays of user and API key IDs.")

public class SubjectList implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("apikeys")
    private List<String> apikeys = null;

    @SerializedName("users")
    private List<String> users = null;

    public SubjectList apikeys(List<String> apikeys) {
        this.apikeys = apikeys;
        return this;
    }

    public SubjectList addApikeysItem(String apikeysItem) {
        if (this.apikeys == null) {
            this.apikeys = new ArrayList<String>();
        }
        this.apikeys.add(apikeysItem);
        return this;
    }

    /**
     * An array of API key IDs.
     * 
     * @return apikeys
     **/
    @ApiModelProperty(value = "An array of API key IDs.")
    public List<String> getApikeys() {
        return apikeys;
    }

    public void setApikeys(List<String> apikeys) {
        this.apikeys = apikeys;
    }

    public SubjectList users(List<String> users) {
        this.users = users;
        return this;
    }

    public SubjectList addUsersItem(String usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<String>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * An array of user IDs.
     * 
     * @return users
     **/
    @ApiModelProperty(value = "An array of user IDs.")
    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubjectList subjectList = (SubjectList) o;
        return Objects.equals(this.apikeys, subjectList.apikeys) && Objects.equals(this.users, subjectList.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apikeys, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubjectList {\n");

        sb.append("    apikeys: ").append(toIndentedString(apikeys)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}