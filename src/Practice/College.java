package Practice;

      /* // ABSTARCT CLASS WITH INNER CLASS

    abstract class College {
    public abstract void medicine();
	String note = "HI ALL";
	public void medi() {
		System.out.println("ALL THE BEST");
	 }
    }
   class Engineering extends College{
	  public void medicine()
	 {
		 System.out.println("WELCOME TO MEDICAL COLLEGE");
	 }
	 
	 // INNERCLASS ARTS FOR SUPERCLASS ENGINEERING
	  class Arts extends Engineering{
		 String note = "HI ALL";
		 String note1 = "ALL THE BEST";
		 
		 public void engin()
		 {
			 System.out.println("WELCOME TO ENGINEERING COLLEGE");	
		 }
	 } 
  }  */

			
	/*	// INTERFACE CLASS	

	interface College{		
		public void medicine();
		public void medi();
	    }
   class Engineering implements College{
	  String note = "HI ALL";
	  public void medicine() {
	  System.out.println("ALL THE BEST");
	  }
	public void medi() {
		 System.out.println("WELCOME TO MEDICAL COLLEGE");
	}

	class Arts implements College{
		String note = "HI ALL";
		public void medicine() {
			System.out.println("ALL THE BEST");
		}
		public void medi() {
			 System.out.println("WELCOME TO ENGINEERING COLLEGE");
		}
    } 
   }   */

    // MULTIPLE INTERFACES

    public interface College {
    	public void medicine();
    }
    
    interface Engineering {
    	public void medi();
    }
    interface Arts {
    	public void med();
    }
    class Demo implements College, Engineering, Arts {
    	public void medicine() {
    		System.out.println("HI ALL");
    	}
    	public void medi() {
    		System.out.println("ALL THE BEST");	
    	}
    	public void med() {
    		 System.out.println("WELCOME TO COLLEGE");	
    	}
    }
																																																						