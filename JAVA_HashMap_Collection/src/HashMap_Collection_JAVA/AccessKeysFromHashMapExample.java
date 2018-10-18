package HashMap_Collection_JAVA;

import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMapExample {
	public static void main(String[] args) {
		Map<String, String> userCityMapping = new HashMap<>();

		// Check if a HashMap is empty
		System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());

		userCityMapping.put("Skeh", "New York");
		userCityMapping.put("Mahadi", "Dhaka");
		userCityMapping.put("Steve", "London");
		System.out.println("userCityMapping HashMap : " + userCityMapping);

		// Find the size of a HashMap
		System.out.println("We have the city information of " + userCityMapping.size() + " users");

		String userName = "Steve";
		// Check if a key exists in the HashMap
		if (userCityMapping.containsKey(userName)) {
			// Get the value assigned to a given key in the HashMap
			String cityName = userCityMapping.get(userName);
			System.out.println(userName + " " + cityName);
		} else {
			System.out.println("City details not found for user " + userName);
		}
		// Modify the value assigned to an existing key
		userCityMapping.put(userName, "California");
		System.out.println(userName + " moved to a new city " + userCityMapping.get(userName)
				+ ", New userCityMapping : " + userCityMapping);
		// The get() method returns `null` if the specified key was not found in the
		// HashMap
		System.out.println("Lisa's city : " + userCityMapping.get("Lisa"));

	}
}
