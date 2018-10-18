package CreatingAndAdding_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedListToArrayList {
	public static void main(String[] args) {
	    LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Harry");
	    linkedlist.add("Jack");
	    linkedlist.add("Tim");
	    linkedlist.add("Rick");
	    linkedlist.add("Rock");

	    List<String> list = new ArrayList<String>(linkedlist);

	    for (String str : list){
	      System.out.print(str+" ");
	    }
	 }
}
