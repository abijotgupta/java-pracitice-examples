//example on exception handling

import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of x and y");

		int x=in.nextInt();
		int y=in.nextInt();

		try
		{
		int res=x/y;
		System.out.println("Divison is  "+res);
		}

		catch(ArithmeticException ae)         //we can check exception class by first executing the statement and check for errors
		                                      // here ae is the object
		{
		 System.out.println("Y is ZERO so divison is not possible");
	 	}

	 	int z=x+y;
		System.out.println("Addition is "+z);
	 }
 }