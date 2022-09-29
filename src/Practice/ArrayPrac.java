package Practice;

public class ArrayPrac {

	public static void main(String[] args) {
		  
		String[] studs = { "aaa" , "bbb", "ccc", "ddd"};
		System.out.println(studs[2]);
		System.out.println();
		  
		// changing the name
		
		studs[0] = "eee";
		System.out.println(studs[0]);
		System.out.println();
		
		// Array length
		
		System.out.println(studs.length);
		System.out.println();
		
		// using for loop
		
		for ( int a = 0; a < studs.length ; a++) {
			
			System.out.println(studs[a]);
			System.out.println();
			
	   // using for each
			
			for( String a1 : studs) {
				System.out.println(a1);
				System.out.println();
				
	  //  multidimensional arrays
				
		   int[][]  myMarks= {{1,2,3,4,5},{90,95,80,85,100}};
		   
		   for(int i=0; i<myMarks.length ; ++i ) {
			   
			   for (int j= 0; j< myMarks[i].length ; ++j) {
				   
				   System.out.println(myMarks[i][j]); 
			   }
		   }
			   	
			}
			
		}
	}

}
