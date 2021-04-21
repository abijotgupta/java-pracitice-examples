//Method Local inner classes

class Outer6
{
	public void m1()
	{
		class Inner  //final,abstract,strictfb
		{
			public void sum(int a, int b)
			{
				System.out.println("Sum is : "+ (a+b));
			}
		}

		Inner i = new Inner();
		i.sum(10,20);
		i.sum(100,200);
		i.sum(1000,2000);
	}

	public static void main(String[] args)
	{
		Outer6 o = new Outer6();
		o.m1();
	}

}