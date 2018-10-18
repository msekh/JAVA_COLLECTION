package CreatingAndAdding_LinkedList;

import java.util.LinkedList;

public class CovertLinkedListtoArray {
	public static void main(String[] args) {

		// Creating and populating LinkedList
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Harry");
		linkedlist.add("Maddy");
		linkedlist.add("Chetan");
		linkedlist.add("Chauhan");
		linkedlist.add("Singh");

		// Converting LinkedList to Array
		String[] array = linkedlist.toArray(new String[linkedlist.size()]);

		// Displaying Array content
		System.out.println("Array Elements:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
