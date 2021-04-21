//java file object can represent directory also

import java.io.*;
class FileDemo2
{
	public static void main(String[] args)
	{
		File f = new File("abijot");
		System.out.println(f.exists());

		f.mkdir();

		System.out.println(f.exists());

		//f.delete();
		//System.out.println(f.exists());
	}
}
