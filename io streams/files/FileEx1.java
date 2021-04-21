//example on file class (getting properties of file/folder)

import java.io.File;
import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;

public class FileEx1
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		out.print("Enter file or directory name here:");
		String name=in.nextLine();

		//create file object based on user input

	    File f=new File(name);

	    //checking the file/directory exists or not

	    if(f.exists())
	    {
			//display file or directory information

			out.println("Name:" +f.getName());
			out.println("File:" +f.isFile());
			out.println("Directory:" +f.isDirectory());
			out.println("Length:" +f.length());
			out.println("Path:" +f.getPath());

			Long a=f.lastModified();   //milli seconds
			out.println("Milli Seconds:"+a);

			Date d=new Date(a);
			out.println("Date:"+d);

			out.println("Writable: "+f.canWrite());
			out.println("Readable: "+f.canRead());
			out.println("Hidden:   "+f.isHidden());
		}

		else
		{
			out.printf("%s does not exist.\n",name);
		}
	}
}


