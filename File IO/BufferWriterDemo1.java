import java.io.*;

class BufferWriterDemo1
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("abijot.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("100");
		bw.newLine();

		bw.write(97);
		bw.write("bijot gupta");
		bw.newLine();

		char[] ch = {'a','b','c'};
		bw.write(ch);
		bw.newLine();

		bw.flush();
		bw.close();
		System.out.println("Data has been added successfully in the file!!!!!!!!!!!!!!!!!!!");

	}
}