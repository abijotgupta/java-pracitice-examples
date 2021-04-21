//program to utilize date class

public class ConstEx4
{
	public static void main(String... abi)
	{
		//user1
		Date d1=new Date();
		System.out.print(d1.getDay()+" ");
		System.out.print(d1.getMonth()+" ");
		System.out.println(d1.getYear());


		//user2
		Date d2=new Date(17,"Sep",1999);
		System.out.print(d2.getDay()+" ");
		System.out.print(d2.getMonth()+" ");
		System.out.println(d2.getYear());


		//user3
		Date d3=new Date(1996);
		System.out.print(d3.getDay()+" ");
		System.out.print(d3.getMonth()+" ");
		System.out.println(d3.getYear());

		//user4
		Date d4=new Date(17,"Sep");
		System.out.print(d4.getDay()+" ");
		System.out.print(d4.getMonth()+" ");
		System.out.println(d4.getYear());
	}
}