package Practice;

import Practice.Outer.Inner;

public class InnerClassPrac {

public static void main(String[] args) {
		/*  //inner class test
		
		Outer myName = new Outer();
		
		Outer.Inner fullName = myName.new Inner();
		System.out.println(myName.fName.concat(fullName.lName));
		
		*/

	
	   /*  // static  inner class test
	
	     Outer.Inner lastName = new Outer.Inner();
	     System.out.println(lastName.lName);
	    
	    */
	
	
	//access outerclass from inner class
	
	   Outer myName = new Outer();
	   Outer.Inner firstName  = myName.new Inner();
	   System.out.println(firstName.inner());
	}

}
