package Practice;

import java.util.Scanner;

public class InheritanceScanner {
	// using inheritance and getting values also
	public static void main(String[] args) {
	    Scanner mark = new Scanner(System.in);
		Maxmark total	= new Maxmark();
		System.out.println("NAME OF THE STUDENT : " +total.name);
		System.out.println("REGISTER NUMBER IS  : " +total.regNo);
		total.sub1();
		 int sub1 = mark.nextInt();
		total.sub2();
		int sub2 = mark.nextInt();
		total.sub3();
		int sub3 = mark.nextInt();
		total.sub4();
		int sub4 = mark.nextInt();
		total.sub5();
		int sub5 = mark.nextInt();
		
		int maxtotal = sub1+sub2+sub3+sub4+sub5;
				
		System.out.println("TOTAL MARK IS : "+maxtotal);
		//using  if and else if statements
		if (maxtotal> 200) {
			System.out.println("\n\tYOU ARE ELIGIBLE FOR MEDICINE");
		}
		else if (maxtotal >100) {
			System.out.println("\n\tYOU ARE ELIGIBLE FOR ENGINEERING");
		}
		else
			System.out.println("\n\tYOU ARE ELIGIBLE FOR ARTS");
	}

}
