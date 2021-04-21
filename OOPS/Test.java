class Parent
{
	public void m1()  { }
}

class Child extends Parent
{
	public void m2() { }
}

class Test
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		Child c = new Child();
		Parent p1 = new Child();

		//Child c1 = new Parent();     //CTE incompatible types: Parent cannot be converted to Child

		//Child c1 = (Child)new Parent();    //throws ClassCastException

		p.m1();
		c.m2();
		p1.m1();
		//p1.m2();     //CTE  cannot find symbol p1.m2();
	}
}