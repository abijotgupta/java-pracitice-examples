//thread creation method 2

class MyThread extends Thread
{
	public void run()             //override run method
	{
		System.out.println("Thread Running.....................");
	}
}

class thread_ex1
{
	public static void main(String[] args)
	{
		MyThread th=new MyThread();
		th.start();                     //parent class thread contains various methods including start
	//	th.run();
	}
}