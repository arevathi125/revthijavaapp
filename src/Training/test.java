package Training;

import Practice.OopsTestPrac;

public class test {

	public static void main(String[] args) {
		
		Encap alyObj = new Encap();
		
		OopsTestPrac sObj = new OopsTestPrac();
		
		System.out.println(sObj.id);
		
		alyObj.setEmpName("Revathi"); 
		
		System.out.println(alyObj.getEmpId());
		System.out.println(alyObj.getEmpName());
		System.out.println(alyObj.getSalary());
		

	}

}
