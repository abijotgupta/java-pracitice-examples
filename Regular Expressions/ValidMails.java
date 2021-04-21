//Write a regular expression to represent all valid mails in java language

import java.util.regex.Pattern;
import java.util.regex.Matcher;


class ValidMails
{

	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("[a-zA-z][a-zA-z0-9_.]*@[a-zA-z0-9_.]+([.][a-zA-Z]+)+");   //  ([.][a-zA-Z]+)+ for .co.in

		Matcher m = p.matcher(args[0]);

		if(m.find() && m.group().equals(args[0]))
		{
			System.out.println("Valid Email ID");
		}
		else
		{
			System.out.println("Invalid Email ID");
		}
	}
}