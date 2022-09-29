package Training;

public class CommentVariable {
	 String greet = "Welcome to the Code Lab";

	public static void main(String[] args) {

		// This is my first class of Java Programme

		String title = "\tEmployee Payroll Details";
		
		String name = "Revathi";
		int empId = 35000;
		int age = 28;
		float salary = 6200.50f;
		float incen = 1800.00f;
		float tax = 280.30f;
		float insurance = 155.00f;
		float totalSalary = salary + incen - tax - insurance;

		CommentVariable rObj = new CommentVariable();
		System.out.println(rObj.greet);
		System.out.println(title);
		System.out.println("\t************************");
		System.out.println("Employee Id   : " + empId);
		System.out.println("Employee Name : " + name);

		System.out.println("Employee Age  : " + age);
		System.out.println("Salary        : " + salary);
		System.out.println("Incentive     : " + incen);
		System.out.println("Incometax     : " + tax);
		System.out.println("Med insurance : " + insurance);
		System.out.println("============================");
		System.out.println("Net salary    : " + totalSalary);
		System.out.println("----------------------------");

	}

	

}
