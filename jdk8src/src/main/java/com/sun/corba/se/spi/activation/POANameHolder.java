package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/POANameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.91-1.b14.el6.x86_64/openjdk/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, May 11, 2016 9:56:39 AM UTC
*/

public final class POANameHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public POANameHolder ()
  {
  }

  public POANameHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.POANameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.POANameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.POANameHelper.type ();
  }

}
