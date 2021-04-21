//Accessing inner class code from outside of outer class

public class Outer4
{
	public static void main(String[] args)
	{
		new Test().new Inner().m1();
	}

}

class Test
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner class m1() method");
		}
	}
}


