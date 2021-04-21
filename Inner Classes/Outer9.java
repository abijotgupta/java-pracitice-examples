//Defining a thread by extending thread class

class Outer9
{
	public static void main(String[] args)
	{
		Thread t = new Thread()
		{
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					System.out.println("Abijot");
				}
			}
		};

		t.start();

		for(int i=0; i<10; i++)
		{
			System.out.println("Gupta");
		}
	}
}