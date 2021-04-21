//WAP to perform to perform file extraction.....

import java.io.*;

class PrintWriterDemo5
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));

		PrintWriter out = new PrintWriter("output.txt");

		String line = br1.readLine();
		while(line != null)
		{
			boolean available = false;

			BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));

			String target = br2.readLine();
			while(target != null)
			{
				if(line.equals(target))
				{
					available = true;
					break;
				}
				target = br2.readLine();
			}

			if(available == false)
			{
				out.println(line);

			}

			line = br1.readLine();
		}

		out.flush();
	}
}
