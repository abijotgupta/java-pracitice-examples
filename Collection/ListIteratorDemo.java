package collection;

import java.util.LinkedList;
import java.util.ListIterator;

//Iterator concept is applicable for all List Objects ArrayList, LinkedList,Vector, Stack.
public class ListIteratorDemo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Abijot");
		l.add("Gupta");
		l.add("Ward No 16");
		l.add("Shiva Nagar");
		l.add("Kathua");
		
		System.out.println(l);
		
		ListIterator li = l.listIterator();
		while(li.hasNext())
		{
			String s = (String)li.next();
			if(s.equals("Ward No 16"))
			{
				li.remove();
			}
			
			if(s.equals("Kathua"))
			{
				li.set("Kathua (J&K)");
			}
		}
		System.out.println(l);
	}

}
