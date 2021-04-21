

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FISDemo
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String fna=" ";

		try{
			System.out.println("Enter File Name  :");
			fna=in.nextLine();
			FileInputStream f=new FileInputStream(fna);   //Creating file object, then opens the given file in read mode & cursor is placed @ 0th position

			int i;
   			while((i=f.read())!=-1)            //Reading data from file byte by byte
    		{
			System.out.print((char)i);
			}

			f.close();                         //closing of file
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null,fna +"\n File Not Found");   //for dialog box
		}
	}
}
