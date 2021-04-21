//Example on designing a person class to person some operations

class Person
{
	void eat(){
		System.out.println("Eating");
	}

	void walk(){
		System.out.println("Walking");
	}

	void sleep(){
		System.out.println("Sleeping");
	}

}

//program to utilizing person class

class Demo2
{
	public static void main(String[] args)
	{
		//eat();
		//Person.eat();

		Person abi=new Person();
		abi.eat();
		abi.walk();
		abi.sleep();
	}
}
