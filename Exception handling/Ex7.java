//example on multiple catch blocks

import java.util.*;

public class Ex7
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		try
		{
		System.out.println("Enter the value of x and y");
		int x=in.nextInt();
		int y=in.nextInt();
		int res=x/y;
		System.out.println("Divison is  "+res);
		}

		catch(ArithmeticException | InputMismatchException e)
		{
		 System.out.println("Y is ZERO so divison is not possible");
	 	}
	 }
 }