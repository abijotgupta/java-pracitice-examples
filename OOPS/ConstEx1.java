//Example on Demonstrating Constructor

class Simple
{
	Simple()
	{
		System.out.println("Constructor invoked");
	}
}

public class ConstEx1
{
	public static void main(String... a)
	{
		Simple s1=new Simple();      //	RHS shows object is created so constructor is invoked
		//s1.simple();                  // CTE

		Simple s2;                   //constructor not invoked bcoz it is only ref var, there is no object creation

		s1=new Simple();             // 1st s1 ref var contains address of 1st obj now this s1 ref var contains address of 2nd object.

		new Simple();                // object is created so constructor is invoked

	}
}