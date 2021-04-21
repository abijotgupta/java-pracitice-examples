//Example on creating a person class for maintaining details of a person............

class Person
{
	int age;
	String name;
	char gen;
	double ht,wt;
}

class Demo1
{
	public static void main(String[] args)
	{
		Person p=new Person();

		p.age=19;
		p.name="Abijot Gupta";
		p.gen='M';
		p.ht=5.11;
		p.wt=60;

		System.out.println("Name    : " +p.name);
		System.out.println("Gender  : "+p.gen);
		System.out.println("Age     : "+p.age);
		System.out.println("Height  : "+p.ht);
		System.out.println("Weight  : "+p.wt);
	}
}
