import java.util.Scanner;

public class Ex9
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double p,r,si;
		int t;

		System.out.println("Enter Principal amount:");
		p=input.nextDouble();

		System.out.println("Enter rate of interest:");
		r=input.nextDouble();

		System.out.println("Enter time in years:");
		t=input.nextInt();

		si=p*r*t/100;

		System.out.println("Simple Interest = "+si);

	}

}