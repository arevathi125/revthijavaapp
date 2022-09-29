package Training;

public class Showroom {

	public static void main(String[] args) {
		
		Car myObj = new Car();
		
		Bike nObj = new Bike();
		
		System.out.println("Brand of Car : " +myObj.brand);
		System.out.println("Model of Car : " +myObj.model +"\nColor of Car is: " +myObj.color);
		myObj.accelerate();
		myObj.horn();
		
		System.out.println(nObj.bikemodel);
		nObj.horn();
		nObj.sound();

	}

}
