import java.util.Scanner;

public class Ex12
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n,h,m,s;

		System.out.println("Enter value of n: ");
		n=input.nextInt();

		h=n/3600;
		n=n%3600;
		m=n/60;
		s=n%60;

		System.out.println("Hours: "+h);
		System.out.println("Minutes: "+m);
		System.out.println("Seconds: "+s);

		System.out.println(h+":"+m+":"+s);

		//SEE THE DIFFERENCE BETWEEN THESE TWO STATEMENTS

		System.out.printf("%02d:%02d:%02d\n",h,m,s);
	}
}




