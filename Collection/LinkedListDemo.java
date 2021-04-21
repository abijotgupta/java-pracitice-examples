package collection;

import java.io.Serializable;
import java.util.*;

public class LinkedListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		System.out.println(l.size());
		
		l.add("Abijot");
		l.add(10);
		l.add(null);
		
		System.out.println(l.size());
		System.out.println(l);
		
		l.addFirst("1");
		l.removeFirst();
		l.add(1,"Gupta");
		System.out.println(l.size());
		System.out.println(l);
		
		Object o = l.get(2);
		System.out.println(o);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		System.out.print("\n");
		System.out.println(l instanceof List);
		System.out.println(l instanceof Collection);
		System.out.println(l instanceof Object);
		
		System.out.print("\n");
		System.out.println(l instanceof RandomAccess);
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
	}
}
