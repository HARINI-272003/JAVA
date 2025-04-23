//program to define implementable class of Runnable
package java_multiplethreads;

public class UsingRunnable implements Runnable{

	Thread thread;
	int high, low;
	String msg;
	public UsingRunnable(Thread thraed, int high, int low, String msg)
	{
		this.high=high;
		this.low=low;
		this.msg=msg;
		thread=new Thread(this,"child Thread");
		thread.start();
	}
	@Override
	public void run()
	{
		for(int i=low; i<=high; i++)
		{
			try
			{
				Thread.sleep(300);
			}
		}
	}
}
