//program on performing same task by multiple threads

class thread_ex4 extends Thread
{
	public void run()
	{
		System.out.println(getName() +"<===HELLO");
	}

	public static void main(String[] args)
	{
		thread_ex4 t0=new thread_ex4();
		thread_ex4 t1=new thread_ex4();
		thread_ex4 t2=new thread_ex4();

		t0.start();
		t1.start();
		t2.start();

		System.out.println("main exit..");
	}
}
