package collection;

import java.io.Serializable;
import java.util.*;
public class ArrayListDemo
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList a = new ArrayList();
		System.out.println(a.size());
		a.add("A");
		a.add(10);
		a.add("A");
		a.add(null);
		a.add('a');
		a.add(0x11);
		a.add(011);
		
		a.remove(2);
		System.out.println(a);

		a.add(2,"m");
		a.add("n");
		System.out.println(a);

		System.out.println(a instanceof ArrayList);
		System.out.println(a instanceof List);
		System.out.println(a instanceof Object);
		System.out.println(a instanceof Collection);
		
		System.out.print("\n");
		System.out.println(a instanceof Serializable);
		System.out.println(a instanceof RandomAccess);
		System.out.println(a instanceof Cloneable);

		@SuppressWarnings("rawtypes")
		List L = Collections.synchronizedList(a);
		System.out.println(L);
	}
}
