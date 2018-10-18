package Vector_Collection_JAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CovertVectorExample {
	public static void main(String[] args) {

		// Step1: Creating a Vector of String elements
		Vector<String> vector = new Vector<String>();

		// Step2: Populating Vector
		vector.add("Tim");
		vector.add("Rock");
		vector.add("Hulk");
		vector.add("Rick");
		vector.add("James");

		// Step3: Displaying Vector elements
		System.out.println("Vector Elements :");
		for (String str : vector) {
			System.out.print(str + " ");
		}

		System.out.println();
		// Step4: Converting Vector to List
		List<String> list = Collections.list(vector.elements());
		System.out.println("After converting Vector Elements Into list :");
		System.out.print(list + " ");

		System.out.println();
		// Step5: Converting Vector to Array
		String[] array = vector.toArray(new String[vector.size()]);
		System.out.println("After converting Vector Elements Into Array :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		// Step6: Converting Vector to ArrayList
		// Converting Vector to ArrayList
		ArrayList<String> arraylist = new ArrayList<String>(vector);
		System.out.println("After converting Vector Elements Into ArrayList : " + arraylist);

	}
}
