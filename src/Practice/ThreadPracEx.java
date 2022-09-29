package Practice;

 class ThreadEx1 extends Thread {
	
	public void run() {
		for(int i=1; i<=5 ; i++) {
			System.out.println("Hi");
		}
	}
 }
	class ThreadEx2 extends Thread{
		 
		 public void run() {
			 for (int i=1; i<=5 ;i++) {
				 System.out.println(i);
			 }
		 }
	}
	public class ThreadPracEx{
	public static void main(String[] args) {
		ThreadEx1 m = new ThreadEx1();
		ThreadEx2 n = new ThreadEx2();
		m.start();
		n.start();
	}
}  

    


		
	
 
