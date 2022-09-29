package Practice;

public class OopsTestPrac {

	public int id = 7777;
	
	
	public static void main(String[] args) {

		
		OopsPrac myClass = new OopsPrac();
		
		myClass.vegetables[3] = "Beetroot";
		myClass.fruits[2] = "guava";
		myClass.groceries[2] = "ghee";
		
		OopsPrac myPrac = new OopsPrac();
		
		myPrac.snacks[0] = "Popcorn";
		
		System.out.println(myClass.vegetables[3]);
		System.out.println(myClass.fruits[2]);
		System.out.println(myClass.groceries[2]);
		System.out.println(myPrac.snacks[0]);
		
	}

}
