package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/USER_EXCEPTION.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-9-argm_o/openjdk-9-9~b114/src/corba/src/java.corba/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, April 14, 2016 7:54:06 PM UTC
*/

public interface USER_EXCEPTION
{

  /**
     * Indicates a UserException reply status. One possible value for 
     * <code>RequestInfo.reply_status</code>.
     * @see RequestInfo#reply_status
     * @see SUCCESSFUL
     * @see SYSTEM_EXCEPTION
     * @see LOCATION_FORWARD
     * @see TRANSPORT_RETRY
     */
  public static final short value = (short)(2);
}