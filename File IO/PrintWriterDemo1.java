import java.io.*;

class PrintWriterDemo1
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("cricket.txt");

		PrintWriter out = new PrintWriter(fw);

		out.write(100);
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("Abijot Gupta");

		out.flush();
		out.close();
		System.out.println("Data has been added successfully in the file!!!!!!!!!!!!!!!!!!!");

	}
}