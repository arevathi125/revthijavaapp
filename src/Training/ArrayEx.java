package Training;

import Practice.College;

public class ArrayEx implements College {

	public static void main(String[] args) {
		ArrayEx o = new ArrayEx();
		o.medicine();
		try {
		String[] Cars = {"Volvo", "BMW", "Honda", "Cadilac", "Opel"};
		System.out.println(Cars[5]);
		
		Cars[4] = "Ford";
		System.out.println(Cars[4]);
		for (int i = 0; i < Cars.length; i++)  {
			System.out.println(Cars[i]);
		}

		} catch (Exception e) {
			System.out.println("Please enter value between 0 to 4");
		}
		finally {
			System.out.println("Thank you for your business!");
		}
	}

	public void medicine() {
		System.out.println("hi");
		
	}

}
