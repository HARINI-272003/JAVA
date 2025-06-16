//program to create a child thread class - extending thread class
package java_multiplethreads;

//thread class
public class ChildThread extends Thread
{
	
	private int n;
	private String msg;
	
	//constructor
	public ChildThread( int n, String msg)
	{
		this.n =n;
		this.msg=msg;
		
	}
	 @Override
	 public void run()
	 {
		
			 for (int i=1; i<=n; i++)
			 {
			 try
			 
		 {
				 Thread.sleep(300);
				 
		 }catch(InterruptedException e)
		 {
			 System.err.println("Thread interrupted: "+e.getMessage());
			 
		 }
			  
		 System.out.println(msg + i + " " +Thread.currentThread().getName());
			 }
	 }
}
