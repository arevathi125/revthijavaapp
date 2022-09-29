package Training;

public class whileEx2 {

	public static void main(String[] args) {
		
		int sum=0 ,i=100;
		while(i != 0) {
			sum += i;        //sum = sum +i;
			--i;             // i = i-1;
			System.out.println("Sum =  "  + sum   +   "  \"I\" value =  " + i);
		}
	}

}
