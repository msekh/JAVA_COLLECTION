package ArrayListExcercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraySortTest {
public static void main(String args[]) {
	List<String> str=new ArrayList<>();
	str.add("Sekh");
	str.add("Mahadi");
	str.add("Shekh");
	str.add("Rupon");
	str.add("Arisha");
	str.add("Ariba");
	
	System.out.println("Before Sorting: ");
	str.forEach((s) -> {
		System.out.print(s+" ");
	});
	
	//Array sort in Ascending order 
	Collections.sort(str);
	System.out.println();
	System.out.println("After sorting: ");
	int i=0;
	while(i<str.size()) {
		System.out.print(str.get(i)+" ");
		i++;
	}
	
	//Array sort in descending order
	//Collections.sort(str,Collections.reverseOrder());
	Collections.reverse(str);
	System.out.println("After descending: ");
	str.forEach((s) -> {
		System.out.print(s+" ");
	});
}
}
