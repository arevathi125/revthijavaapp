package Practice;

public class TestingOperators {

	public static void main(String[] args) {
		int a=50,b=25;
		int age = 21;
		String note1 = "hello all";
		String note2 = "welcome";
		System.out.println(note1.concat(" "+note2));
		System.out.println(note2.length());
		System.out.println(note1.toUpperCase());
		System.out.println(note2.toLowerCase());
		if ( note1.length() < note2.length()) {
			System.out.println("\"welcome\"");
		}
		//age limit and conditions to enter this place
		if (age >18) {
			System.out.println("Granted to enter");}
		else if(age == 18){
			System.out.println("Can enter with an adult");}
		else {
			System.out.println("You are not old enough to enter sorry");}
			System.out.println("Hello\tall,\n\"welcome\"\n\"To this place\"");
			System.out.println(Math.multiplyExact(a, b));
			System.out.println(Math.min(a, b));
	}
			
			

	}


