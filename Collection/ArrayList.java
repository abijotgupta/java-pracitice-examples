import java.util.*;

class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		a.add("A");
		a.add(10);
		a.add("A");
		a.add(null);
		a.add('a');
		a.add(0x11);
		a.add(011);
		System.out.println(a);

		a.remove(2);
		System.out.println(a);

		a.add(2,"m");
		a.add("n");
		System.out.println(a);

		System.out.println(a instanceof ArrayList);
		System.out.println(a instanceof List);
		System.out.println(a instanceof Object);
		System.out.println(a instanceof Collection);

		//System.out.println(a instanceof Serializable);
		System.out.println(a instanceof RandomAccess);
		//System.out.println(a instanceof Clonable);

		List L = collections.synchronizedList(a);
	}
}