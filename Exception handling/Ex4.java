//Example on Exception Propogation

public class Ex4
{
	void m3()
	{
		int res=50/0;
		System.out.println("Result"+res);
	}

	void m2()
	{
		//m1();
		System.out.println("I'm m2()");
	}

	void m1()
	{
		try{
			m2();
			System.out.println("I'm m1()");
		}

		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
	}

	public static void main(String... args)
	{
		Ex4 ob=new Ex4();
		ob.m1();
		System.out.println("Normal flow");
	}
}