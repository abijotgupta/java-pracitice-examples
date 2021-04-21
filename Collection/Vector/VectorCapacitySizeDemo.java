import java.util.*;
class VectorCapacitySizeDemo
{
	public static void main(String[] args)
	{
		Vector v = new Vector(3);
		System.out.println("Initial Capacity & size of vector is..........");
		System.out.println("Capacity : " + v.capacity());
		System.out.println("Size : " + v.size());

		System.out.println();

		Customer c1 = new Customer("Abijot", 20, new Address("123/54", "Durga Mandir", "Kathua", "979712345"));
		Customer c2 = new Customer("Parshant", 20, new Address("123/54", "Durga Mandir", "Kathua", "979712345"));
		Customer c3 = new Customer("Shagun", 20, new Address("123/54", "Durga Mandir", "Kathua", "979712345"));
		Customer c4 = new Customer("Shaveta", 20, new Address("123/54", "Durga Mandir", "Kathua", "979712345"));
		Customer c5 = new Customer("Raj Kumar", 20, new Address("123/54", "Durga Mandir", "Kathua", "979712345"));
		Customer c6 = new Customer("Rajni", 20, new Address("123/54", "Durga Mandir", "Kathua", "979712345"));
		Customer c7 = new Customer("Ram", 20, new Address("123/54", "Durga Mandir", "Kathua", "979712345"));

		v.add(c1);
		v.add(c2);
		System.out.println("Reached Its Capacity or not????");
		System.out.println("Capacity : " + v.capacity());
		System.out.println("Size : " + v.size());

		System.out.println();

		v.add(c3);
		System.out.println("Reached Its Capacity or not????");
		System.out.println("Capacity : " + v.capacity());
		System.out.println("Size : " + v.size());

		System.out.println();

		v.add(c4);
		System.out.println("Reached Its Capacity or not????");
		System.out.println("Capacity : " + v.capacity());
		System.out.println("Size : " + v.size());

		System.out.println();

		v.add(c5);
		v.add(c6);
		System.out.println("Reached Its Capacity or not????");
		System.out.println("Capacity : " + v.capacity());
		System.out.println("Size : " + v.size());

		System.out.println();

		v.add(c7);
		System.out.println("Reached Its Capacity or not????");
		System.out.println("Capacity : " + v.capacity());
		System.out.println("Size : " + v.size());

		System.out.println();

		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}