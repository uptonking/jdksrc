package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ORBAlreadyRegistered.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-9-argm_o/openjdk-9-9~b114/src/corba/src/java.corba/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, April 14, 2016 7:54:03 PM UTC
*/

public final class ORBAlreadyRegistered extends org.omg.CORBA.UserException
{
  public String orbId = null;

  public ORBAlreadyRegistered ()
  {
    super(ORBAlreadyRegisteredHelper.id());
  } // ctor

  public ORBAlreadyRegistered (String _orbId)
  {
    super(ORBAlreadyRegisteredHelper.id());
    orbId = _orbId;
  } // ctor


  public ORBAlreadyRegistered (String $reason, String _orbId)
  {
    super(ORBAlreadyRegisteredHelper.id() + "  " + $reason);
    orbId = _orbId;
  } // ctor

} // class ORBAlreadyRegistered