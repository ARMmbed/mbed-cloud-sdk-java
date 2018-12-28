// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Fri Dec 28 16:23:54 GMT 2018. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import java.lang.Override;
import java.lang.String;
import java.lang.UnsupportedOperationException;

/**
 * Data Access Object (DAO) for user invitations.
 * <p>
 * @see <a  href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access Object</a> */
@Preamble(
    description = "Data Access Object (DAO) for user invitations."
)
public class UserInvitationDao extends AbstractUserInvitationDao {
  /**
   * Constructor.
   */
  public UserInvitationDao() throws MbedCloudException {
    super();
  }

  /**
   * @param id a string.
   */
  @Override
  public void delete(String id) throws MbedCloudException, UnsupportedOperationException,
      NotImplementedException {
    // TODO Auto-generated method stub.;
    throw new NotImplementedException();
  }

  /**
   * @param id a string.
   */
  @Override
  public void read(String id) throws MbedCloudException, UnsupportedOperationException,
      NotImplementedException {
    // TODO Auto-generated method stub.;
    throw new NotImplementedException();
  }
}
