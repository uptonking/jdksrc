package org.omg.PortableServer;


/**
* org/omg/PortableServer/IdUniquenessPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-9-argm_o/openjdk-9-9~b114/src/corba/src/java.corba/share/classes/org/omg/PortableServer/poa.idl
* Thursday, April 14, 2016 7:54:07 PM UTC
*/


/**
	 * The IdUniquenessPolicy specifies whether the servants 
	 * activated in the created POA must have unique object i
	 * identities. The default is UNIQUE_ID.
	 */
public interface IdUniquenessPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
  	 * specifies the policy value
  	 */
  org.omg.PortableServer.IdUniquenessPolicyValue value ();
} // interface IdUniquenessPolicyOperations
