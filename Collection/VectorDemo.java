package collection;

import java.util.Vector;

public class VectorDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector v =  new Vector();
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.print("\n");
		for(int i = 1; i<=10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.print("\n");
		
		v.add("A");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
	}

}
