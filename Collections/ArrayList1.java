import java.util.*;
class ArrayList1
{
	public static void main(String[] abi)
	{
		ArrayList a=new ArrayList();

		System.out.println("Size of ArrayList object by default  : " + a.size());              //no of objects in a collection
		System.out.println();

		a.add("Abijot");
		a.add("Gupta");
		a.add(1701959);
		a.add(1016);
		a.add(null);                                                                           //null value can also be added
		System.out.println("ArrayList Elements  : "+ a);
		System.out.println("Size of ArrayList object: " + a.size());
		System.out.println();

		a.remove(3);
		System.out.println("ArrayList Elements after removing 3rd indexed element  : "+ a);
		System.out.println("Size of ArrayList object: " + a.size());
		System.out.println();

		a.add(2,'M');
		a.add(2,"123");																	       //string value converted into int
		System.out.println("ArrayList Elements after adding 2nd indexed element  : "+ a);
		System.out.println("Size of ArrayList object: " + a.size());
		System.out.println();

		System.out.println(a.listIterator());
		System.out.println();

		System.out.println("Array list is empty or not : "+ a.isEmpty());                     //Array list is empty or not
		System.out.println();

		System.out.println(a.toArray());                                                      //convert collection toArray
		System.out.println("ArrayList Elements  : "+ a);
		System.out.println();

		a.clear();                                                                            //use of clear function
		System.out.println("ArrayList Elements  : "+ a);
	}
}