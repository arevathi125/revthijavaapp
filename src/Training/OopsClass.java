package Training;

public class OopsClass {

	String place = "London";
	int pincode = 44;
	String country = "United Kingdom";
	double ticketprice = 500.00d;
	
	
	public static void main(String[] args) {
	
		OopsClass myObj = new OopsClass();
		OopsClass rObj = new OopsClass();
		
		rObj.place = "Chicago";
		System.out.println(myObj.place);
		System.out.println("Country Name : " +myObj.country);
		myObj.ticketprice = 658.45d;
		System.out.println(myObj.ticketprice);
		System.out.println(rObj.place);

	}

}
