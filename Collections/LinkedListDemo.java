import java.util.*;

public class LinkedListDemo
{
	public static void main(String... args)
	{
		LinkedList l=new LinkedList();


		l.add("abi");
		l.add("jot");
		l.add("gupta");

		l.addFirst(10);
		l.addLast(10);

		l.removeFirst();

		l.addFirst(" ");

		System.out.println(l);


	}
}