package Vector_Collection_JAVA;

import java.util.Enumeration;
import java.util.Vector;

public class CreateVectorExample {
	  public static void main(String args[]) {
	     
	      Vector<String> vec = new Vector<>(2);
	      /* Adding elements to a vector*/
	      vec.addElement("Apple");
	      vec.addElement("Orange");
	      vec.addElement("Mango");
	      vec.addElement("Fig");
	      /* check size and capacityIncrement*/
	      System.out.println("Size is: "+vec.size());
	      System.out.println("Default capacity increment is: "+vec.capacity());
	      
	      //Vector addElement 
	      vec.addElement("Sekh");
	  
	      vec.addElement("fruit2");
	      vec.addElement("fruit3");

	      /*size and capacityIncrement after two insertions*/
	      System.out.println("Size after addition: "+vec.size());
	      System.out.println("Capacity after increment is: "+vec.capacity());

	      /*Display Vector elements*/
	      Enumeration<String> en = vec.elements();
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
	         System.out.print(en.nextElement() + " ");
	  }
}
