class Outer5
{
	int a = 10;
	private int b = 20;
	static int c = 30;

	//From inner class we can access private, non-private , static & non-static variables & methods of outer class.

	class Inner
	{
		int a = 100;
		private int b = 200;
		//static int c = 300;   inside inner class we cannot declare static varible & method otherwise CTE:->  modifier 'static' is only allowed in constant variable declarations

		public void m1()
		{
			int a = 1000;
			//private int b = 200; illegal start of expression private int b = 200;

			System.out.println("Instance var value inside method: " + a);

			System.out.println();
			System.out.println();

			System.out.println("Instance var value inside Inner class : " + this.a);
			System.out.println("Private var value inside Inner class :" + this.b);


			System.out.println();
			System.out.println();

			System.out.println("Instance var value inside Outer class : " + Outer5.this.a);
			System.out.println("Private var value inside Outer class : " + Outer5.this.b);
			System.out.println("Static var value inside Outer class : " + Outer5.this.c);

			System.out.println();
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		new Outer5().new Inner().m1();
	}

}