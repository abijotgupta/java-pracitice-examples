import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

class Test
{
	public static void main(String[] args)
	{

		ArrayList<String> a = new ArrayList<String>();
		//List<String> a = new ArrayList<String>();         //valid


		a.add("Abijot");
		a.add("Gupta");
		a.add("10");
		m1(a);

		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");

		System.out.println(a.getClass().getName());

		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
	}

	//public static void m1(ArrayList<String> l)                   // incompatible types: int cannot be converted to String l.add(10000000);
	//public static void m1(ArrayList<?> l)
	public static void m1(ArrayList l)
	{
		l.add(10000000);
		System.out.println(l);
	}
}