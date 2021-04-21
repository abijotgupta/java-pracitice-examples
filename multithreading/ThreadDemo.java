public class ThreadDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread t1 = new Thread(new MyThread(), "Thread1");
		Thread t2 = new Thread(new MyThread(), "Thread2");
		Thread t3 = new Thread(new MyThread(), "Thread3");

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}
}

class MyThread implements Runnable
{
	public void run()
	{
		Thread thread = Thread.currentThread();
		for(int i = 1; i <= 3; i++)
		{
			System.out.println(thread.getName() + "running : " + i);
		}

		System.out.println("Thread ended: " + thread.getName());
	}
}
