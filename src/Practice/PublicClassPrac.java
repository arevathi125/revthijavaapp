package Practice;

public class PublicClassPrac {
	
	// public void method
	
	  public  void recArea(int length,int width)
	 
	{
	   int area = length * width;
	
	   System.out.println("Area of a Rectanle is : " +area);
	
	}

	public  void recPerimeter(int length,int width)
	     {
	
		int perimeter = 2*(length +width);
		
		System.out.println("Perimeter of a Rectangle is : " +perimeter);
		
	     }
       public static void main(String[] args) {

		
		PublicClassPrac recPrac = new PublicClassPrac();
		recPrac.recArea(1, 1);
		recPrac.recPerimeter(1, 1);
}
    } 


          // static void method


  /*  static void recArea()
	
	{
	int length = 10;
	int width = 12;
	int area = length * width;
	System.out.println("Area of a Rectanle is : " +area);
	
	}

	static void recPerimeter() {
		
		 int length = 31;
		 int width = 42;
		int perimeter = 2*(length +width);
		System.out.println("Perimeter of a Rectangle is : "+perimeter);
		
	}
	public static void main(String[] args) {
		

         recArea();
         System.out.println();
         recPerimeter();
         
         }
         
} */
