package org.omg.CosNaming;


/**
* org/omg/CosNaming/BindingIteratorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-9-argm_o/openjdk-9-9~b114/src/corba/src/java.corba/share/classes/org/omg/CosNaming/nameservice.idl
* Thursday, April 14, 2016 7:54:04 PM UTC
*/


/**
   * The BindingIterator interface allows a client to iterate through
   * the bindings using the next_one or next_n operations.
   * 
   * The bindings iterator is obtained by using the <code>list</code>
   * method on the <code>NamingContext</code>.
   * @see org.omg.CosNaming.NamingContext#list
   */
public interface BindingIteratorOperations 
{

  /**
       * This operation returns the next binding. If there are no more
       * bindings, false is returned.
       * 
       * @param b the returned binding
       */
  boolean next_one (org.omg.CosNaming.BindingHolder b);

  /**
       * This operation returns at most the requested number of bindings.
       * 
       * @param how_many the maximum number of bindings to return
       * 
       * @param bl the returned bindings
       */
  boolean next_n (int how_many, org.omg.CosNaming.BindingListHolder bl);

  /**
       * This operation destroys the iterator.
       */
  void destroy ();
} // interface BindingIteratorOperations
