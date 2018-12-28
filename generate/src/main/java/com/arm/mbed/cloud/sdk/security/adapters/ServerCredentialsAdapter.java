// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.adapters;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.internal.connectorca.model.ServerCredentialsResponseData;
import com.arm.mbed.cloud.sdk.security.model.ServerCredentials;
import java.lang.Override;

/**
 * Adapter for server credentials. */
@Preamble(
    description = "Adapter for server credentials."
)
@Internal
public class ServerCredentialsAdapter {
  /**
   * Constructor.
   */
  protected ServerCredentialsAdapter() {
    super();
    // Nothing to do;
  }

  /**
   * Maps a server credentials response data into a server credentials.
   * @param toBeMapped a server credentials response data.
   * @return mapped a server credentials
   */
  @Internal
  public static ServerCredentials map(ServerCredentialsResponseData toBeMapped) {
    if(toBeMapped == null) {
      return null;
    }
    final ServerCredentials serverCredentials = new ServerCredentials();
    serverCredentials.setCreatedAt(TranslationUtils.toDate(toBeMapped.getCreatedAt()));
    serverCredentials.setId(toBeMapped.getId());
    serverCredentials.setServerCertificate(toBeMapped.getServerCertificate());
    serverCredentials.setServerUri(toBeMapped.getServerUri());
    return serverCredentials;
  }

  /**
   * Gets a mapper.
   * @return a mapper
   */
  @Internal
  public static GenericAdapter.Mapper<ServerCredentialsResponseData, ServerCredentials> getMapper(
      ) {
    return new GenericAdapter.Mapper<ServerCredentialsResponseData, ServerCredentials>() {
      /**
       * Maps.
       * @param toBeMapped model to be mapped.
       * @return a mapped object
       */
      @Override
      public ServerCredentials map(ServerCredentialsResponseData toBeMapped) {
        return ServerCredentialsAdapter.map(toBeMapped);
      }
    };
  }
}
