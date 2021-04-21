import java.io.File;
import java.io.PrintStream;
import java.io.IOException;

public class FileEx2
{
	public static void main(String[] args) throws IOException
	{
		PrintStream ps=new PrintStream(System.out);

		File f=new file("Abijot");
		boolean status=f.mkdir();

		System.out.println("Directory is created: "+created);

