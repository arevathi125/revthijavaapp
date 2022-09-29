package Training;

public class ElseIfEx {
	
	public static void main(String[] args) {
		CommentVariable rObj = new CommentVariable();
		PublicMethod nObj = new PublicMethod();
		rObj.greet = "Hey this is Nilesh";
		System.out.println(rObj.greet);
		nObj.testPublic();
		
		
		int time = 18;
		if (time > 22) {
		  System.out.println("Good morning.");
		} else if (time > 20) {
		  System.out.println("Good day.");
		} else if (time ==18 ) {
			System.out.println("Good afternoon");
		}
		else {
		  System.out.println("Good evening.");
		} 

	}
}
