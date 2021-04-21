import java.util.List;
import java.util.ArrayList;

class Test2<T extends List>
 {
	public static void main(String[] args)
	{
		ArrayList l1 = new ArrayList<String>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		ArrayList<String> l3 = new ArrayList<String>();
		ArrayList l4 = new ArrayList();

		System.out.println(l1==l2);  //false
		System.out.println(l1==l3);  //false
		System.out.println(l1==l4);  //false
	}
 }