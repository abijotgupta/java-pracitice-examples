//Anonymous inner class that extends a class

class PopCorn
{
	public void taste()
	{
		System.out.println("Parent Class Spicy");
	}

}

public class Outer8
{
	public static void main(String[] args)
	{
		PopCorn p = new PopCorn()        //new PopCorn() is Anonymous inner Class Object  & p is parent class ref which holds child class OBJECT
		{
			public void taste()
			{
				System.out.println("Anonymous inner class Salty");
			}

			public void hello()
			{
				System.out.println("Hellooooooooooo");
			}
		};


		p.taste();

		//p.hello();   //CTE:-> p is parent class ref which holds child class OBJECT nd by using this we can call only parent specific methods

		PopCorn p1 = new PopCorn();
		p1.taste();

		System.out.println(p.getClass().getName());
		System.out.println(p1.getClass().getName());

	}
}