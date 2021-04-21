//Example on finally block

import java.util.Scanner;

public class Ex3
{
	public static void main(String... args)
	{
		int x,y,res;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value of x and y");

		x=in.nextInt();
		y=in.nextInt();

		try
		{
			//f=new FileInputStream("Ex1.java");
			//con=DM.getConnection("url",pw);
			res=x/y;
			System.out.println("Division is : "+res);
		}

		catch(ArithmeticException ae)
		{
			System.out.println("Y is 0,so Division is possible");
		}

		finally
		{
			//f.close();
			//con.close();
			System.out.println("Msg from finally");
		}
	}
}