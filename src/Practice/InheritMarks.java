package Practice;

public class InheritMarks {
	// have tried two methods in 1 calss
	String name ="hhhhhh";
	 int regNo = 1;
	 public void sub1() {
		 System.out.println("ENTER SUBJECT 1 MARK : ");
	 }
  }
  // first subclass
  class Mark extends InheritMarks
  {
	 public void sub2() {
		 System.out.println("ENTER SUBJECT 2 MARK : ");
	 }
  }
  // second subclass
  class TotalMark extends Mark
  {
	 public void sub3() {
		 System.out.println("ENTER SUBJECT 3 MARK : ");
	 }
   public void sub4() {
	   System.out.println("ENTER SUBJECT 4 MARK : ");
   }
   } 
   // third subclass
   class Maxmark extends TotalMark
   {
	   public void sub5() {
		   System.out.println("ENTER SUBJECT 5 MARK : ");
	   }
   }
  
