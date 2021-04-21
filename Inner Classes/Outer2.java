//Accessing inner class code from static area of outer class

class Outer2
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner class m1() method");
		}
	}

	public void m2()
	{
		System.out.println("Outer class m2() method");
	}


	public static void main(String[] args)
	{
		Outer2 o = new Outer2();
		Outer2.Inner i = o.new Inner();

		o.m2();
		i.m1();

	}

}