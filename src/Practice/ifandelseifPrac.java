package Practice;

public class ifandelseifPrac {
	
	public static void main(String[] args) {
		
		 // using if ...else
		
		int time = 17;
		
		if ((time >= 10) && (time <=17))
		{ 
			System.out.println("Bank is open");
		}
	
		else
		{
			System.out.println("Bank is closed");
			
		}
		
		// using short hand if.... else (trenary operator)
		
		String result = (time==17)? "welcome in.": "Sorry Bank is closed.";
		
		System.out.println(result);
		
		String result1 = (time>=10) && (time <=17)? "working hours" : "please come tomorrow";
		
		System.out.println(result1);
		
		}
	}


