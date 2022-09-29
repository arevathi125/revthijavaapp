package Practice;

public class WhilePrac {

	public static void main(String[] args) {

	// multiplication table of 2

		int i = 2, n = 1;
		
		System.out.println(" \t ~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println(" \t Multiplication table of 2");
		
		System.out.println(" \t -------------------------");

		while (n < 11) {

			int result = n * i;

			System.out.println( n  + " * " + i + " = " + result);

			++n;
		}


	// addition table for 2

		int j = 1, m = 2;

		System.out.println(" \n\t -------------------");
		
		System.out.println(" \t Addition table of 2");
		
		System.out.println(" \t -------------------");
		
		while (j < 11) {
			
		int result1 = m + j;

			System.out.println(m + " + " + j + " = " +result1);

			j++;

		}

	}
}