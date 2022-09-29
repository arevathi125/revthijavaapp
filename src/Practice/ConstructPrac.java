package Practice;

public class ConstructPrac {
	 int studNum ;
	 String studName;
	 
	 public ConstructPrac(int num , String name) {
	     studNum = num;
		 studName = name;
	 }

	public static void main(String[] args) {
		
		 ConstructPrac School = new ConstructPrac(1, "aaaa");
		 ConstructPrac School1 = new ConstructPrac(2, "bbbb");
		 ConstructPrac School2= new ConstructPrac(3, "cccc");
		 ConstructPrac School3= new ConstructPrac(4, "dddd");
		 
		 ModifiersPrac Add = new ModifiersPrac();
		  Add.setB(18);
		  Add.setA(26);
		  
		 Add.setC(Add.getA()+Add.getB());
		 
		 System.out.println(Add.getB());
		 System.out.println(Add.getA());
		 System.out.println(Add.getC());
		
		
		 System.out.println(School.studNum+ " "+ School.studName);
		 System.out.println(School1.studNum + " "+ School1.studName);
		 System.out.println(School2.studNum + " "+ School2.studName);
		 System.out.println(School3.studNum + " "+ School3.studName);
		 
	}

	}


