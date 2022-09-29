package Practice;

public class MultimethodPrac {

		static void student ( int reg ,String name) {
			
			System.out.println("Reg.No : "+ reg +"\n  Stud name  : " + name.toUpperCase());
			
		}
		
			public static void main(String[] args) {
				System.out.println("\t\" Student name with register number \"".toUpperCase());
				System.out.println();
				student(1," aaaa");
				student(2, "bbbb");
				student(3, "cccc");
				student(4, "dddd");
				student(5, "eeee");
			
			
	}

}
