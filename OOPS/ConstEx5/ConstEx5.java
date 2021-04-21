//program to utilize Date class

public class ConstEx5
{
	public static void main(String []abi)
	{
		Date d1=new Date(25,"May",1998);

		System.out.print(d1.getDay()+" ");
		System.out.print(d1.getMonth()+" ");
		System.out.println(d1.getYear());

		Date d2=new Date(d1);       //sending object as an argument & is k/w as object communication

		System.out.print(d2.getDay()+" ");
		System.out.print(d2.getMonth()+" ");
		System.out.println(d2.getYear());


		System.out.println(d1);     //used to print the objects addresses contained in ref var d1 & d2
		System.out.println(d2);


	}
}