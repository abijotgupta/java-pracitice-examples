import java.io.*;

class FileWriterDemo1
{
	public static void main(String[] args) throws IOException
	{
		//FileWriter fw = new FileWriter("abc.txt");         //Constructor for overriding of data in the file

		FileWriter fw = new FileWriter("abc.txt",true);
		fw.write(100);
		fw.write("\n");

		fw.write("100");
		fw.write("\n");

		fw.write(97);

		fw.write("bijot\ngupta");
		fw.write("\n");

		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.write("\n");

		System.out.println("Data has been appended successfully in the file!!!!!!!!!!!!!!!!!!!");

		fw.flush();
		fw.close();
	}
}



