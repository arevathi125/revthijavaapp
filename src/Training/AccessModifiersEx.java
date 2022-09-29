package Training;

import Practice.ModifiersPrac;

public class AccessModifiersEx {

	final int numbers = 3000;
	static int age = 30;
	
	public static void main(String[] args) {
		
		AccessModifiersEx alyObj=new AccessModifiersEx();
		
		//alyObj.numbers = 5000;
		System.out.println(alyObj.numbers);
		
		System.out.println(age);
		

	}

}
