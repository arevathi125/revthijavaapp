package Training;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		
		ArrayList<String> cars = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(100);
		numbers.add(1000);
		
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("Honda");
		cars.add("Ford");
		
		System.out.println(cars);
		cars.set(1, "Rolls Royce");
		System.out.println(cars.get(1));
System.out.println(numbers.get(1));
System.out.println(cars);
	}

}
