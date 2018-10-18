package TreeMap_Collection_JAVA;

import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMapExample {
public static void main(String args[]) {
	SortedMap<String, String > fileExtensions=new TreeMap<>();
	fileExtensions.put("python", ".py");
    fileExtensions.put("c++", ".cpp");
    fileExtensions.put("kotlin", ".kt");
    fileExtensions.put("golang", ".go");
    fileExtensions.put("java", ".java");

    // Printing the TreeMap (Output will be sorted based on keys)
    System.out.println(fileExtensions);
}
}
