package org.omg.CosNaming;


/**
* org/omg/CosNaming/BindingIteratorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.91-1.b14.el6.x86_64/openjdk/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, May 11, 2016 9:56:39 AM UTC
*/


/**
   * The BindingIterator interface allows a client to iterate through
   * the bindings using the next_one or next_n operations.
   * 
   * The bindings iterator is obtained by using the <tt>list</tt>
   * method on the <tt>NamingContext</tt>. 
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
       * @param how_many the maximum number of bindings tro return <p>
       * 
       * @param bl the returned bindings
       */
  boolean next_n (int how_many, org.omg.CosNaming.BindingListHolder bl);

  /**
       * This operation destroys the iterator.
       */
  void destroy ();
} // interface BindingIteratorOperations
