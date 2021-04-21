// PROGRAM TO UTILIZE MATHS CLASS
// MENU DRIVEN PROGRAMMING

import java.util.Scanner;

public class Demo7
{
	public static void main(String... ar)
	{
		Scanner in=new Scanner(System.in);
		Maths ob=new Maths();

		int x=0,y=0,choice;      //local var are not initialized by JVM, if values of x & y is not given it gives CTE.

		do
		{
			System.out.println("-----------------MENU---------------------");

			System.out.println("");
			System.out.println("");

			System.out.println("1       ADDITION");
			System.out.println("2	SUBTRACTION");
			System.out.println("3	PRODUCT");
			System.out.println("4	DIVISION");
			System.out.println("5	MODULUS");
			System.out.println("6 	EXIT");

			System.out.println("Enter your choice:   ");
			choice=in.nextInt();

			if(choice>=1 && choice<=5)                            //if this condt is absent then following line always executed even if we enter any no.
			{
				System.out.println("Enter x and y values");
				x=in.nextInt();
				y=in.nextInt();
			}

			switch(choice)
			{
				case 1: System.out.println("Sum is:        "+ ob.add(x,y));
						break;

				case 2: System.out.println("Difference is: "+ ob.sub(x,y));
						break;

				case 3: System.out.println("Product is:    "+ ob.product(x,y));
						break;

				case 4: System.out.println("Division is:   "+ ob.division(x,y));
						break;

				case 5: System.out.println("Modulus is:    "+ ob.mod(x,y));
						break;

				case 6: System.exit(0);                //used to end of program

				default: System.out.println("You have entered WRONG value");
			}

		}while(true);

	}

}