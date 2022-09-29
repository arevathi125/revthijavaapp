package Practice;

import java.util.Scanner;

public class DowhilePracInput {

	public static void main(String[] args) {
		  
		// using scanner method
		
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
}