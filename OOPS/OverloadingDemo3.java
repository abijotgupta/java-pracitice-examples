class Animal   {  }

class Monkey extends Animal {  }

class OverloadingDemo3
{
	public void m1(Animal a)
	{
		System.out.println("Animal version");
	}

	public void m1(Monkey m)
	{
		System.out.println("Monkey Version");
	}

	public static void main(String[] args)
	{
		OverloadingDemo3 o = new OverloadingDemo3();

		Animal a = new Animal();
		o.m1(a);                   //Animal version

		Monkey m = new Monkey();
		o.m1(m);					//MOnkey version

		Animal a1 = new Monkey();
		o.m1(a1);                  //Animal version

	}
}