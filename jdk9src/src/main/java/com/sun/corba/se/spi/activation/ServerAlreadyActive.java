package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-9-argm_o/openjdk-9-9~b114/src/corba/src/java.corba/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, April 14, 2016 7:54:03 PM UTC
*/

public final class ServerAlreadyActive extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerAlreadyActive ()
  {
    super(ServerAlreadyActiveHelper.id());
  } // ctor

  public ServerAlreadyActive (int _serverId)
  {
    super(ServerAlreadyActiveHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyActive (String $reason, int _serverId)
  {
    super(ServerAlreadyActiveHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyActive
