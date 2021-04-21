//program which will print priliminary info about the thread

import static java.lang.System.*;

class MyThread extends Thread
{
	public MyThread(String tname)
	{
		super(tname);               //==>Thread(tname)
	}

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("  ");
		}
	}
}

public class thread_methods6
{
	public static void main(String[] args)
	{
		Thread t1=Thread.currentThread();
		out.println("Background thread:  "+t1);

		MyThread t2=new MyThread("Apple");
		t2.start();

		out.println("t2==>  "+t2);
		out.println("Name of t2:   " + t2.getName());
		out.println("No of threads are running:  " +Thread.activeCount());
		out.println("Execution state of foreground thread:  "+ t2.isAlive());
	}
}
