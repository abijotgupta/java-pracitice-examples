import java.util.*;

class IteratorMethodDemo
{
	public static void main(String[] args)
	{
		LinkedHashSet lhs = new LinkedHashSet();

		//Adding elements to LinkedHashSet
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		Iterator itr = lhs.iterator();

		//itr.remove();      //java.lang.IllegalStateException

		Object o1 = itr.next();
		System.out.println(o1);

		itr.remove();  //we call remove() only once & only after next()
		lhs.add("d");


		//Object o2 = itr.next();  //java.util.ConcurrentModificationException
		//System.out.println(o2);

		//itr.remove();      //java.lang.IllegalStateException

		System.out.println(lhs);

	}
}