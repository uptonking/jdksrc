package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerAlreadyUninstalled.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.91-1.b14.el6.x86_64/openjdk/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, May 11, 2016 9:56:39 AM UTC
*/

public final class ServerAlreadyUninstalled extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerAlreadyUninstalled ()
  {
    super(ServerAlreadyUninstalledHelper.id());
  } // ctor

  public ServerAlreadyUninstalled (int _serverId)
  {
    super(ServerAlreadyUninstalledHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyUninstalled (String $reason, int _serverId)
  {
    super(ServerAlreadyUninstalledHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyUninstalled
