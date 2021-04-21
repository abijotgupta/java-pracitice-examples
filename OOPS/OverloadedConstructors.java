class OverloadedConstructors
{
	OverloadedConstructors(double d)
	{
		System.out.println("Double arg Constructor");
	}

	OverloadedConstructors(int i)
	{
		this(10.5);
		System.out.println("int arg Constructor");
	}

	OverloadedConstructors()
	{
		this(10);
		System.out.println("No arg Constructor");
	}

	public static void main(String[] args)
	{
		OverloadedConstructors o = new OverloadedConstructors();
		System.out.println("");
		System.out.println("");

		OverloadedConstructors o1 = new OverloadedConstructors(10);
		System.out.println("");
		System.out.println("");

		OverloadedConstructors o2 = new OverloadedConstructors(10.5);
		System.out.println("");
		System.out.println("");
	}
}
