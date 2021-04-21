class OverloadingDemo1
{
	public void m1()
	{
		System.out.println("No arg method");
	}

	public void m1(int a)
	{
		System.out.println("Integer-arg method");
	}

	public void m1(double d)
	{
		System.out.println("double- arg method");
	}




	public void m1(String s)
	{
		System.out.println("String- arg method");
	}

	public void m1(Object o)
	{
		System.out.println("Object- arg method");
	}




	public static void main(String[] args)
	{
		Test1 t = new Test1();
		t.m1();
		t.m1(2);
		t.m1(2.5);

		System.out.println("---------------------------------");

		t.m1('c');            //automatic promotion in overloading
		t.m1(5.0f);
		t.m1(0x88);

		System.out.println("---------------------------------");

		t.m1("Arun");
		t.m1(new Object());
		t.m1(null);                 //child class will get more priority than Parent class
	}
}