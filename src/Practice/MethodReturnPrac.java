package Practice;

import Training.Variables;

public class MethodReturnPrac {
	
	static int returnValue(int sub1,int sub2,int sub3,int sub4,int sub5) {
		
		return sub1+sub2+sub3+sub4+sub5;
		
	}
	public static void main(String[] args) {
		
		System.out.println("Total Mark is ");
		
     System.out.println(returnValue(  90,85,45,70,69));
     
     Variables rObj = new Variables();
     rObj.abc = 7777;
     System.out.println(rObj.abc);
	}

}
