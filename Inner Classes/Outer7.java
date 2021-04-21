//Method Local inner classes

class Outer7
{
	int i = 10;
	static int j = 20;

	//public static void m1()  CTE:-> non-static variable i cannot be referenced from a static context

	public void m1()
	{
		int k = 30;
		final int l = 40;

		class Inner
		{
			//public static void m2()  CTE:-> modifier 'static' is only allowed in constant variable declarations

			public void m2()
			{
				int m = 50;
				final int n = 60;

				System.out.println("Value of i : "+ i);
				System.out.println("Value of j : "+ j);
				System.out.println("Value of k : "+ k);
				System.out.println("Value of l : "+ l);
				System.out.println("Value of m : "+ m);
				System.out.println("Value of n : "+ n);
			}
		}

		Inner i = new Inner();
		i.m2();
	}

	public static void main(String[] args)
	{
		Outer7 o = new Outer7();
		o.m1();
	}

}