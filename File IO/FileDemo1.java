import java.io.*;

class FileDemo1
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("abc.txt");
		System.out.println(f.exists());


		f.createNewFile();    //throws IOException

		System.out.println(f.exists());
	}
}