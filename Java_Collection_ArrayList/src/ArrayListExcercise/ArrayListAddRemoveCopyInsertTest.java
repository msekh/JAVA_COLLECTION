package ArrayListExcercise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddRemoveCopyInsertTest {
	public static void main(String args[]) {
		List<String> str = new ArrayList<>();
		// Add Element
		str.add("Sekh");
		str.add("Mahadi");
		str.add("Shekh");
		str.add("Rupon");
		str.add("Arisha");
		str.add("Ariba");
		// Add Element
		System.out.println("Before Add the list is: ");
		str.forEach((s) -> {
			System.out.print(s + " ");
		});
		System.out.println();
		List<String> str2 = new ArrayList<>();
		// Add Element
		str2.add("Marjana");
		str2.add("Sadia");
		str2.add("Ritu");
		str2.add("Mitu");

		// After Adding All
		System.out.println("After Add str with Str2: ");
		str2.addAll(str);
		str2.forEach((s) -> {
			System.out.print(s + " ");
		});
		
		//insert Arraylis in specific posion
		List<String> str3 = new ArrayList<>();
		str3.add("Rased");
		str3.add("Laboni");
		str3.add("Yashna");
		
		str2.addAll(4, str3);
		
		System.out.println(str2);

	}
}
