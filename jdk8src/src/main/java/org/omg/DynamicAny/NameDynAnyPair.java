package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameDynAnyPair.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.91-1.b14.el6.x86_64/openjdk/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Wednesday, May 11, 2016 9:56:39 AM UTC
*/

public final class NameDynAnyPair implements org.omg.CORBA.portable.IDLEntity
{

  /**
          * The name associated with the DynAny.
          */
  public String id = null;

  /**
          * The DynAny value associated with the name.
          */
  public org.omg.DynamicAny.DynAny value = null;

  public NameDynAnyPair ()
  {
  } // ctor

  public NameDynAnyPair (String _id, org.omg.DynamicAny.DynAny _value)
  {
    id = _id;
    value = _value;
  } // ctor

} // class NameDynAnyPair