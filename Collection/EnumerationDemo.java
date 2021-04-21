package collection;

import java.util.Enumeration;
import java.util.Vector;

//Enumeration concept is only available for only legacy collection classes , ie, Vector and Stack not Queue

public class EnumerationDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Vector v = new Vector();
		//Stack s = new Stack();
		//Queue q = new LinkedList();
		for(int i = 0; i <= 10; i++)
		{
			v.addElement(i);
			//s.push(i);
			//q.add(i);
		}
		System.out.println(v);
		//System.out.println(s);
		//System.out.println(q);
		
		Enumeration e = v.elements();
		//Enumeration e = s.elements();
		//Enumeration e = q.elements();
		
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();
			if(i % 2 == 0)
			{
				System.out.println(i + "  ");
			}	
		}
		System.out.println(v);
	}

}
