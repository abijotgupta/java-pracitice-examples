//Program to utilize Sample class
//Both files stored in same location, if stored in different folder B class becomes M class

public class Demo4              //B class
{
	public static void main(String[] args)
	{
		Sample ob=new Sample();

		//System.out.println(ob.a);        //CTE

		System.out.println("B  :"+ob.b);
		System.out.println("C  :"+ob.c);
		System.out.println("D  :"+ob.d);
	}
}

