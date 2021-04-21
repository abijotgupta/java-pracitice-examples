//Unbounded Generic Types

class Gen<T>
{
	T obj;

	Gen(T obj)
	{
		this.obj = obj;
	}

	public void show()
	{
		System.out.println("The type of object is : " + obj.getClass().getName());
	}

	public T getObject()
	{
		return obj;
	}

	public static void main(String[] args)
	{
		Gen<Integer> g1 = new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getObject());

		System.out.println("------------------------------");

		Gen<Double> g2 = new Gen<Double>(10.5);
		g2.show();
		System.out.println(g2.getObject());

		System.out.println("------------------------------");

		Gen<String> g3 = new Gen<String>("Abijot");
		g3.show();
		System.out.println(g3.getObject());

		System.out.println("------------------------------");



	}
}