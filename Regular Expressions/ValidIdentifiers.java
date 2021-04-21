//Write a regular expression to represent all valid identifiers in java language

//RULES

//allowed characters are a to z, A to Z, 0 to 9, -, #
//1st characters should be alphabet only
//length of identifiers should be atleast 2

import java.util.regex.Pattern;
import java.util.regex.Matcher;



class ValidIdentifiers
{

	public static void main(String[] args)
	{
		//Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9-#]+");
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9-#][a-zA-Z0-9-#]*");

		Matcher m = p.matcher(args[0]);

		if(m.find() && m.group().equals(args[0]))
		{
			System.out.println("Valid Character");
		}
		else
		{
			System.out.println("Invalid Character");
		}
	}
}