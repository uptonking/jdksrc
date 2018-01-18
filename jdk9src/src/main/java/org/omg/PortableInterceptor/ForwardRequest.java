package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ForwardRequest.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-9-argm_o/openjdk-9-9~b114/src/corba/src/java.corba/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, April 14, 2016 7:54:06 PM UTC
*/

public final class ForwardRequest extends org.omg.CORBA.UserException
{

  /** 
       * The new object to forward the request to.
       */
  public org.omg.CORBA.Object forward = null;

  public ForwardRequest ()
  {
    super(ForwardRequestHelper.id());
  } // ctor

  public ForwardRequest (org.omg.CORBA.Object _forward)
  {
    super(ForwardRequestHelper.id());
    forward = _forward;
  } // ctor


  public ForwardRequest (String $reason, org.omg.CORBA.Object _forward)
  {
    super(ForwardRequestHelper.id() + "  " + $reason);
    forward = _forward;
  } // ctor

} // class ForwardRequest
