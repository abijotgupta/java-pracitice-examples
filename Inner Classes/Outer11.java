//Anonymous inner class that Define inside method args

class Outer11
{
	public static void main(String[] args)
	{
		new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					System.out.println("Abijot");
				}
			}
		}).start();


		for(int i=0; i<10; i++)
		{
			System.out.println("Gupta");
		}
	}
}