package com.sun.corba.se.spi.activation.LocatorPackage;


/**
* com/sun/corba/se/spi/activation/LocatorPackage/ServerLocation.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.91-1.b14.el6.x86_64/openjdk/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, May 11, 2016 9:56:39 AM UTC
*/

public final class ServerLocation implements org.omg.CORBA.portable.IDLEntity
{
  public String hostname = null;
  public com.sun.corba.se.spi.activation.ORBPortInfo ports[] = null;

  public ServerLocation ()
  {
  } // ctor

  public ServerLocation (String _hostname, com.sun.corba.se.spi.activation.ORBPortInfo[] _ports)
  {
    hostname = _hostname;
    ports = _ports;
  } // ctor

} // class ServerLocation