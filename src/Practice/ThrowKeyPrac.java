package Practice;

public class ThrowKeyPrac {

	public static void main(String[] args) {
		try {
			int[] i = {10,20,30,40,50};
			System.out.println(i[7]);}
	
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			throw e;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		   System.out.println("Values Beyond The Limit");
		   }
		finally {
			System.out.println("Thank You");
		}

	}

}
