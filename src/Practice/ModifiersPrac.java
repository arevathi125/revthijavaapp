package Practice; 

 import java.util.Scanner;

import Training.*;

public class ModifiersPrac {
	
	private int a = 5;
	private int b = 6;
	private int c = a+b;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public static void main(String[] args) {
		
		 ModifiersPrac Add = new ModifiersPrac();
		 System.out.println(Add.c);
		 
		 Encap alyObj = new Encap();
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("Enter your name : ");
		 String setEmpName = myObj.nextLine();
		 
		 //alyObj.setEmpName("Dhakshan" + " "+ "Prabaharan");
		// alyObj.setEmpName("vidhuna");
		// System.out.println(alyObj.getEmpName());
	}
}