package Practice;

public class MethodParametersPrac {
	
	// Apartment list with ratings
	
	static void myApart(String name , int rating) {

		System.out.println(name +"  Apartment" + "  Rating is " + rating );
	}
	public static void main(String[] args) {
		
		myApart("Preserve" , 1);
		myApart("Madison" , 2);
		myApart("Enclave" , 3);

	}

}
