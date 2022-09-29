package Training;

import java.util.Scanner;

public class StaticMethodEx {

	static void ageTest() {
		 String name ;
		 int age;
			
		Scanner input = new Scanner (System.in);
		
		do {
			// Getting inputs from customer
			
			System.out.println("Enter your name  : " );
			name = input.next();
			System.out.println("Enter your Age  :  ");
			age = input.nextInt();
		} while (age >6); // Age limit for first graders
		System.out.println("You cannot join first grade this year");
}

	public static void main(String[] args) {
		System.out.println("Age eligibility test");
		ageTest();
		
		
	}

}
