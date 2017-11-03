package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerManagerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.91-1.b14.el6.x86_64/openjdk/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, May 11, 2016 9:56:39 AM UTC
*/


/** Interface used to combine the Activator and Locator when both are
    * implemented together in the same process, as is currently the case
    * for our implementation.
    */
abstract public class ServerManagerHelper
{
  private static String  _id = "IDL:PortableActivationIDL/ServerManager:1.0";

  public static void insert (org.omg.CORBA.Any a, com.sun.corba.se.PortableActivationIDL.ServerManager that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.sun.corba.se.PortableActivationIDL.ServerManager extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (com.sun.corba.se.PortableActivationIDL.ServerManagerHelper.id (), "ServerManager");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.sun.corba.se.PortableActivationIDL.ServerManager read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ServerManagerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.sun.corba.se.PortableActivationIDL.ServerManager value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static com.sun.corba.se.PortableActivationIDL.ServerManager narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof com.sun.corba.se.PortableActivationIDL.ServerManager)
      return (com.sun.corba.se.PortableActivationIDL.ServerManager)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      com.sun.corba.se.PortableActivationIDL._ServerManagerStub stub = new com.sun.corba.se.PortableActivationIDL._ServerManagerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static com.sun.corba.se.PortableActivationIDL.ServerManager unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof com.sun.corba.se.PortableActivationIDL.ServerManager)
      return (com.sun.corba.se.PortableActivationIDL.ServerManager)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      com.sun.corba.se.PortableActivationIDL._ServerManagerStub stub = new com.sun.corba.se.PortableActivationIDL._ServerManagerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
