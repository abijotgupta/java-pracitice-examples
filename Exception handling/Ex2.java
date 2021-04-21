//example on multiple catch blocks

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex2
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of x and y");

		try
		{
		int x=in.nextInt();
		int y=in.nextInt();
		int res=x/y;
		System.out.println("Divison is  "+res);
		}

		catch(ArithmeticException ae)         //Ist catch block
											  //we can check exception class by first executing the statement and check for errors
		                                      // here ae is the object
		{
		 System.out.println("Y is ZERO so divison is not possible");
	 	}

		catch(InputMismatchException ie)        //2nd catch block
												//for input other than integer values
		{
         System.out.println("Invalid Input");
	 	}

		System.out.println("ABIJOT GUPTA");
	 }
 }