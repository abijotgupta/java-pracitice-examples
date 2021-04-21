//Example on creating own Exception class

public class AgeException extends java.io.IOException  //or RuntimeException
{
	String msg;

	public AgeException()
	{
		super("Invalid age, Age must be above 18 yrs");
		   //OR
		//this.msg("Invalid age, Age must be above 18 yrs");
	}

	//override
	public String toString()
	{
		return msg;
	}
}


//Example on throwing and catching own Exception class

import java.util.Scanner;



