//WAP to display the names of all files and directories present in F:\ABIJOT\iit bhu


import java.io.*;

class FileDemo5
{
	public static void main(String[] args)
	{
		int count = 0;
		File f = new File("F:\\ABIJOT\\iit bhu");

		String[] s = f.list();

		for(String s1 : s)
		{
			count++;
			System.out.println(s1);
		}

		System.out.println("Total no of files : " + count);
	}
}


