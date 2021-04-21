//Creation of Singleton class
//can be created by using private constructor, factory method, static variable

class SingletonClass
{
	private static SingletonClass s = null;     //static variable

	private SingletonClass() { }        	  //private constructor

	public static SingletonClass getSingletonClass()    //getSingletonClass() is a factory method
	{
		if(s == null)
		{
			s = new SingletonClass();
		}

		return s;
	}


	public static void main(String[] args)
	{
		SingletonClass s1 = SingletonClass.getSingletonClass();
		SingletonClass s2 = SingletonClass.getSingletonClass();
		SingletonClass s3 = SingletonClass.getSingletonClass();
		SingletonClass s4 = SingletonClass.getSingletonClass();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
