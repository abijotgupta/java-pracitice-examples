//WAP to display the names of only directories present in F:\ABIJOT\iit bhu


import java.io.*;

class FileDemo7
{
	public static void main(String[] args)
	{
		int count = 0;
		File f = new File("F:\\ABIJOT\\iit bhu");

		String[] s = f.list();

		for(String s1 : s)
		{
			File f1 = new File(f,s1);                    //create File object f1 bcoz we can't call file methods using string obj s1
			if(f1.isDirectory())
			{
				count++;
				System.out.println(s1);
			}
		}

		System.out.println("Total no of files : " + count);
	}
}


