//create a directory named with abijotGupta in cmd and create a file named abc.txt in that directory.............

import java.io.*;
class FileDemo4
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("abijotGupta");
		f1.mkdir();
		System.out.println("Directory Created");

		File f2 = new File("abijotGupta", "abc.txt");
		f2.createNewFile();

		System.out.println("File Created");
	}
}
