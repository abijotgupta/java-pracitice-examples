import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassesDemo
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		TreeSet ts = new TreeSet();

		System.out.println("hashset Length : " + hs.size());
		System.out.println("linkedhashset Length : " + lhs.size());
		System.out.println("Treeset Length : " + ts.size());
		System.out.println();


		//Adding elements to HashSet
		System.out.println("is 20 added : " + hs.add(new Integer(20)));
		System.out.println("is a added : " + hs.add(new Character('a')));
		System.out.println("is b added : " + hs.add(new Character('b')));
		System.out.println("is abc added : " + hs.add("abc"));
		System.out.println("is Abc added : " + hs.add("Abc"));
		System.out.println("is abc added : " + hs.add("abc"));
		System.out.println("is abc added : " + hs.add(new String("abc")));
		System.out.println("is example added : " + hs.add(new Example()));
		System.out.println("is example added : " + hs.add(new Example()));  //point to be noted

		//Adding null to HashSet
		System.out.println("is null added : " + hs.add(null));
		System.out.println("is null added : " + hs.add(null));
		System.out.println();

		//Modified size and elements
		System.out.println("Modified size of hashSet : " + hs.size());
		System.out.println("Elements of HashSet : " + hs);
		System.out.println();




		//Adding elements to LinkedhashSet
		System.out.println("is 20 added : " + lhs.add(new Integer(20)));
		System.out.println("is a added : " + lhs.add(new Character('a')));
		System.out.println("is b added : " + lhs.add(new Character('b')));
		System.out.println("is abc added : " + lhs.add("abc"));
		System.out.println("is Abc added : " + lhs.add("Abc"));
		System.out.println("is abc added : " + lhs.add("abc"));
		System.out.println("is abc added : " + lhs.add(new String("abc")));
		System.out.println("is example added : " + lhs.add(new Example()));
		System.out.println("is example added : " + lhs.add(new Example()));  //point to be noted

		//Adding null to LinkedhashSet
		System.out.println("is null added : " + lhs.add(null));
		System.out.println("is null added : " + lhs.add(null));
		System.out.println();

		//Modified size and elements
		System.out.println("Modified size of LinkedhashSet : " + lhs.size());
		System.out.println("Elements of LinkedhashSet : " + lhs);
		System.out.println();



		//Adding homogeneous elements to TreeSet
		System.out.println("is abc added : " + ts.add("abc"));
		System.out.println("is xyz added : " + ts.add("xyz"));
		System.out.println("is pqr added : " + ts.add("pqr"));
		System.out.println("is mno added : " + ts.add(new String("mno")));

		//Adding heterogeneous elements to TreeSet
		//System.out.println("is 20 added : " + ts.add(new Integer(20)));

		//Adding null to TreeSet
		//System.out.println("is null added : " + ts.add(null));
		//System.out.println("is null added : " + ts.add(null));
		System.out.println();

		//Modified size and elements
		System.out.println("Modified size of TreeSet : " + ts.size());
		System.out.println("Elements of TreeSet : " + ts);
		System.out.println();


	}
}