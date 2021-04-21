//example on thread creation

class thread_ex3
{
	public static void main(String[] args)
	{
		//3rd Approach (By using Anonymous class)

		Thread t=new Thread()            //same as 2nd eg but only diff is it defines in thst place where it is required
		{
			public void run()
			{
				System.out.println("Thread is running.....................");
			}
		};

		t.start();


		Runnable r=()->              //() is same as public void run(). It is implicitly designed
		{
			System.out.println("I'm Thread.........................");
		};

		new Thread(r).start();
	}
}