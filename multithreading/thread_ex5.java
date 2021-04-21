//Example on sleep method


import java.util.Date;

public class thread_ex5
{
	public static void main(String[] args) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(100);
		}

		while(true)
		{
			Date d=new Date();                 //date is predefined class in util package
			System.out.printf("%tr\r",d);      // /ris carriage return  DIGITAL CLOCK FORMAT
			Thread.sleep(1000);
		}
	}
}