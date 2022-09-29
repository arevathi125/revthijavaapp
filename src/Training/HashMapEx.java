package Training;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapEx {

	public static void main(String[] args) {
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.put("India", "Delhi");
	    System.out.println(capitalCities);
	    System.out.println(capitalCities.get("India"));

	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    cars.add("Volvo");
	    System.out.println(cars);

	}

}
