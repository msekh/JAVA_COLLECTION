package Vector_Collection_JAVA;

import java.util.Vector;

public class RemoveVectorExample {
	public static void main(String[] args) {
		// Creating a Vector of String Elements
		Vector<String> vector = new Vector<String>();

		// Adding elements to the Vector
		vector.add("Harry");
		vector.add("Steve");
		vector.add("Vince");
		vector.add("David");
		vector.add("Matt");
		vector.add("Mala");
		vector.add("Jhuma");
		vector.add("Arisha");
		vector.add("Aymaan");

		System.out.println("Vector elements before remove(): ");
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}

		// Removing Harry
		vector.remove("Harry");
		// Removing Matt
		vector.remove("Matt");

		System.out.println("\nVector elements after remove(): ");
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}
		 //Replacing index 1 element
	     vector.set(1,"Mark");
	     //Replacing index 2 element
	     vector.set(2,"Jack");
	     System.out.println("\nVector elements after Replace: " + vector);
			
		// Remove using remove(index)
		vector.remove(2);
		System.out.println("\nVector elements after remove(index): " + vector);
		// Remove using removeIf()
		vector.removeIf(vec-> vec.startsWith("M"));
		System.out.println("\nVector elements after removeIf(): " + vector);

		// Remove with removeElement()
		vector.removeElement("Jhuma");
		vector.removeElement("Vince");

		System.out.println("\nVector elements after removeElement(): " + vector);

		// Remove with removeAll()
		vector.removeAll(vector);
		System.out.println("\nVector elements after removeAll(): " + vector);
		// Remove with removeAllElements();
		vector.removeAllElements();
		System.out.println("\nVector elements after removeAllElements(: " + vector);
	}
}
