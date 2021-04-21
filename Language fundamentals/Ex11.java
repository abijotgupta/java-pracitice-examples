import java.util.Scanner;

public class Ex11
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double p,r,ci;
		int t;

		System.out.println("Enter Principal amount:");
		p=input.nextDouble();

		System.out.println("Enter rate of interest:");
		r=input.nextDouble();

		System.out.println("Enter time in years:");
		t=input.nextInt();

		ci=p*Math.pow(1+r/100,t);
		ci-=p;

		System.out.printf("Compound Interest = %.2f\n",ci);

	}

}