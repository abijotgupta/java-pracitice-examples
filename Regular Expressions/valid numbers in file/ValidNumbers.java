//Write a regular expression to extract valid mobile numbers from a file

import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


class ValidNumbers
{

	public static void main(String[] args) throws IOException
	{
		PrintWriter out = new PrintWriter("output.txt");

		BufferedReader br = new BufferedReader(new FileReader("input.txt"));

		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");

		String line = br.readLine();

		while(line != null)
		{
			Matcher m = p.matcher(line);

			while(m.find())
			{
				out.println(m.group());
			}
			line = br.readLine();
		}
		out.flush();
	}
}