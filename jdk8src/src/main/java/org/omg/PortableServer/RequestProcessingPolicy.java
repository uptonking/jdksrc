package org.omg.PortableServer;


/**
* org/omg/PortableServer/RequestProcessingPolicy.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.91-1.b14.el6.x86_64/openjdk/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, May 11, 2016 9:56:39 AM UTC
*/


/**
	 * This policy specifies how requests are processed by 
	 * the created POA.  The default is 
	 * USE_ACTIVE_OBJECT_MAP_ONLY.
	 */
public interface RequestProcessingPolicy extends RequestProcessingPolicyOperations, org.omg.CORBA.Policy, org.omg.CORBA.portable.IDLEntity 
{
} // interface RequestProcessingPolicy