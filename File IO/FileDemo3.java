//create a file named with demo.txt in cwd.

import java.io.*;
class FileDemo3
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("demo.txt");
		System.out.println(f.exists());

		f.createNewFile();

		System.out.println(f.exists());
	}
}
