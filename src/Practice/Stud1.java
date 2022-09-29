package Practice;

public class Stud1 {
	String name1 = "xxxxxx";
		public int Stud1(int sub1, int sub2,int sub3){
		return sub1+sub2+sub3;
	}
}
 
class stud2 extends Stud1{
	 String name2 = "yyyyyy";
	public int stud2(int sub1, int sub2, int sub3) {
		return sub1+sub2+sub3;
	}
}

class stud3 extends stud2{
	String name3 = "vvvvvvv";
	public int stud3(int sub1,int sub2,int sub3) {
		return sub1+sub2+sub3;
	}
}