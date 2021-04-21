//WAP to delete duplicate numbers from a file

import java.io.*;

class PrintWriterDemo4
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br1 = new BufferedReader(new FileReader("num1.txt"));

		PrintWriter out = new PrintWriter("num2.txt");

		String target = br1.readLine();
		while(target != null)
		{
			boolean available = false;

			BufferedReader br2 = new BufferedReader(new FileReader("num2.txt"));

			String line = br2.readLine();
			while(line != null)
			{
				if(target.equals(line))
				{
					available = true;
					break;
				}
				line = br2.readLine();
			}

			if(available == false)
			{
				out.println(target);
				out.flush();
			}

			target = br1.readLine();
		}
	}
}
