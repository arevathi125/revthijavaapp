package Training;

public class Vehicle {

	String brand = "Mercedes";
	
	public void horn() {
		System.out.println("Peep Peep");
	}
}

 class Car extends Vehicle {
	int model = 2000;
	String color = "Black";
	
	public void accelerate() {
		System.out.println("Zooooom Zooooom");
	}
}

 class Bike extends Car {
	 String bikemodel = "Honda";
	public void sound() {
		System.out.println("rrrrrrrrrrrrrr");
	}
}