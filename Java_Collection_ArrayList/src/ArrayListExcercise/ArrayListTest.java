package ArrayListExcercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	 public static void main(String[] args) {
	       List<String> str = new ArrayList<>();
			str.add("Sekh");
			str.add("Mahadi");
			str.add("Shekh");
			str.add("Rupon");
			str.add("Arisha");
			str.add("Ariba");
			// direct print
			System.out.println(str);

			str.add("Niaj");
			// print using Iterator
			System.out.print("Name: [");
			Iterator<String> itr = str.iterator();
			while (itr.hasNext()) {
				System.out.print(itr.next() + " ");
			}
			System.out.println("]");
	           str.add(5,"Raha");     
	        //For loop
	        str.forEach((s) -> {
	            System.out.print(s+" ");
	        });
	        str.remove(2);
	        System.out.println();
	        //using ForEach
	        str.forEach((s) -> {
	            System.out.print(s+" ");
	        });
	        str.set(5, "Talha");
	        str.forEach((s) -> {
	            System.out.print(s+" ");
	        });
	        
	        //Size
	        System.out.println();
	        System.out.println(str.size());
	 }
}
