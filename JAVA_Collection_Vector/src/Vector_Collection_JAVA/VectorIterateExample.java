package Vector_Collection_JAVA;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterateExample {
	public static void main(String[] args) {
		// Create a Vector
		Vector<String> vector = new Vector<String>();

		// Add elements into Vector
		vector.add("Sekkh");
		vector.add("Mahadi");
		vector.add("Rupon");
		vector.add("Jin");
		vector.add("Jacob");

		// Get Enumeration of Vector elements
		Enumeration<String> en = vector.elements();

		/*
		 * Display Vector elements using hashMoreElements() and nextElement() methods.
		 */
		System.out.println("Vector elements are: ");
		while (en.hasMoreElements())
			System.out.print(en.nextElement() + " ");
		System.out.println();
		// Obtaining an iterator
		Iterator<String> it = vector.iterator();
		System.out.println("Vector elements are:");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println();
		// forword traverse
		ListIterator<String> litr = vector.listIterator();
		System.out.println("Traversing in Forward Direction:");
		while (litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}
		// listIterator() is used for Descending order
		System.out.println("\nTraversing in Backward Direction:");
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}

		System.out.println();
		System.out.println("=== Iterate over a Vector using Java 8 forEach and lambda ===");
		vector.forEach(name -> {
			System.out.print(name);
		});
		
	}

}
