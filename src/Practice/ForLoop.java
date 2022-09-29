package Practice;

import Training.AccessModifiersEx;

public class ForLoop {

	public static void main(String[] args) {

		AccessModifiersEx myObj = new AccessModifiersEx();
		
    for( int n=2 ; n<=100 ; n=n+2) {
    	if (n==50) {
    		 break;
    		//continue;
    	}
    	System.out.println(n);
    	
    	
    }
   // System.out.println(myObj.numbers);
	}

}
