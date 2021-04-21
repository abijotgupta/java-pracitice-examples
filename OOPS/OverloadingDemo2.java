class OverloadingDemo2
{
	public void m1(int a)
	{
		System.out.println("Integer-arg method");
	}

	public void m1(int... a)
	{
		System.out.println("Var-arg method");
	}

	public static void main(String[] args)
	{
		OverloadingDemo2 o = new OverloadingDemo2();
		o.m1();  //Var-arg method
		o.m1(2);
		o.m1(2, 2);   //Var-arg method
	}
}
