package Practice;

/* // inner class
	class Outer{
		String fName = "Revathi";
		
	class Inner{
		String lName = "\tAnbazhagan";
		
	}
	}
	*/
	
 /* // static inner class
	
    class Outer {
    	String fName = "Revathi";
    	
    static class Inner {
    	String lName = "\tAnbazhagan";
    }
    }
*/

// access outerclass from inner class
    class Outer{
    	String fName = "Revathi";
    	
        class Inner{
        public String inner() {
        	return fName;
        }
        }
    	
    }