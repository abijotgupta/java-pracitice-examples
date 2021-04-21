//Example on try with resource statement

import java.io.*;

public class Ex6
{
	public static void main(String... args) throws IOException
	{
		try(FileInputStream f=new FileInputStream("Ex5.java"))
		{
			int c;
			while((c=f.read())!=-1)
			{
				System.out.print((char) c);
			}

			//no need to write f.close()
		}
		System.out.println("Done............................");
	}
}