package Practice;

import java.util.Scanner;

public class PublicClassTest {

	public static void main(String[] args) {

		
		PublicClassPrac recPrac = new PublicClassPrac();
		
		PublicClassPrac recPeri = new PublicClassPrac();
		
		
		System.out.println();
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter the value  Length : ");
		 
		 int length = input.nextInt();
		 
		System.out.println(" Enter the value width : ");
		
		 int width = input.nextInt();
		
		recPeri.recArea(length,width);
		
		System.out.println();
		
		recPeri.recPerimeter(length,width);

	}

}
