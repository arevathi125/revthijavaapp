package Practice;

 /* public class ThreadPrac extends Thread {
	 public void run() {
		System.out.println("This is my first thread programme");
	}
	public void hello() {
		System.out.println("hi");
	}

	public static void main(String[] args) throws InterruptedException {
     ThreadPrac mObj = new ThreadPrac();
     ThreadPrac nObj = new ThreadPrac();
     nObj.sleep(1000);
     mObj.hello();
     mObj.start();
     System.out.println("This is my thread programme");
	} */
	
	 public class ThreadPrac implements Runnable,College{ 
		public void run() {
			medicine();
			System.out.println("This is thread Programme");
		}
		public static void main(String[] args) {
			ThreadPrac mObj = new ThreadPrac();
			Thread nObj = new Thread (mObj);
			nObj.start();
			while(nObj.isAlive()) {
			System.out.println("waiting..")	;}
		}
		public void medicine() {
			System.out.println("Hello");
			
		}
	}

