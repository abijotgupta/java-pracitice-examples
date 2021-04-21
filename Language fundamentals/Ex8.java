import java.util.Scanner;

public class Ex8
{
   public static void main(String[] args)
   {

	Scanner scan=new Scanner(System.in);

	String fna;
	char lna;

	System.out.println("Enter first name: ");
	fna=scan.next();                              //only prints data before delimeter
	    //OR
	//fna=scan.nextLine();                        //prints data after delimeter


	System.out.println("Enter last name: ");
	lna=(char)scan.nextInt();                  //since lna is char type and nextInt is used, so input is given in ASCII values and these values are converted 2 char using typecasting
	    //OR
	//lna=scan.next().CharAt(0);                  // identify error in this line

	System.out.println("Hey "+fna+" "+lna);

    }
}
