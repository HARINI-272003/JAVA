//executor class for child thread
package java_multiplethreads;

public class ThreadDemo {

	public static void main(String[] args) {
		
		ChildThread threadone = new ChildThread (5,"First");
		ChildThread threadtwo = new ChildThread (10,"second");
		
		threadone.start();
		
		//threadone.start();// throws illegal state exception
		//thread.run(); //single threaded application
		
		threadtwo.start();
		System.out.println(".......end main.......");
	}

}
