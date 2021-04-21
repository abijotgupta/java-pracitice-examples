//Accessing inner class code from instance area of outer class

class Outer3
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
		Inner i = new Inner();
		i.m1();

		System.out.println("Outer class m2() method");
	}

	public static void main(String[] args)
	{
		Outer3 o = new Outer3();
		o.m2();
	}

}