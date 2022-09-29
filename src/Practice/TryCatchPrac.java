package Practice;

import java.util.Scanner;

public class TryCatchPrac {
	/* public static void main(String[] args) {
		  try {
			int[] i = {10,20,30,40,50};
			System.out.println(i[7]);}
		catch(Exception e) {
		   System.out.println("Values Beyond The Limit");}
		finally {
			System.out.println("Thank You");
		}
		
		}
	} */
	 
	
	 // GETTING INPUT FROM USER

	public void test(Scanner value ) {
		try {
			int i = value.nextInt();
			System.out.println("INTEGER VALUE IS : "+ i);
		   }
		catch(Exception e)
		  {
			System.out.println("USE INTEGER VALUE PLEASE");
		  }
		finally {
			System.out.println("THANK YOU");}
	}
	   public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		TryCatchPrac ty = new TryCatchPrac();
		ty.test(input);
		
	}	
	
	}  
  

