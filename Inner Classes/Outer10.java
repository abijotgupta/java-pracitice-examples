//Defining a thread by implemented Runnable interface

class Outer10
{
	public static void main(String[] args)
	{
		Runnable r = new Runnable()  //r is runnable implemented class object
		{
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					System.out.println("Abijot");
				}
			}
		};

		Thread t = new Thread(r);
		t.start();

		for(int i=0; i<10; i++)
		{
			System.out.println("Gupta");
		}
	}
}