/*
Example of private constructor se page no 236
check error
System is private class, therefore, System class constructor is also private Bcoz scope of constructor is same as that of class
error: System() has private access in System

public class ConstEx6
{
	public static void main(String []abi)
	{
		System s=new System();                  //not valid bcoz private const stops the object creation of class by other classes
	}
}
*/

class Test
{
	Test test=new Test();                        //valid bcoz object create in own class which contains private constructor
	private Test();						         //private constructor
}

//program to utilize Test class

public class ConstEx6
{
	public static void main(String []abi)
	{
		//System s=new System();                  //CTE as explained above
		Test test=new Test();                     //CTE as explained above : Test() has private access in Test
	}
}