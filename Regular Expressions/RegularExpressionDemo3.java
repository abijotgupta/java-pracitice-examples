//Predefined classes

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegularExpressionDemo3
{

	public static void main(String[] args)
	{
		//Pattern p = Pattern.compile("\\s");           //space character
		//Pattern p = Pattern.compile("\\d");           //Any digit from 0 to 9
		//Pattern p = Pattern.compile("\\w");           //Any word character [a-zA-Z0-9]
		//Pattern p = Pattern.compile(".");             //Any character including special characters

		//Pattern p = Pattern.compile("\\S");  		    //Any character except space character
		//Pattern p = Pattern.compile("\\D");			//Any character except digits
		Pattern p = Pattern.compile("\\W");				//Any character except word character

		Matcher m = p.matcher("a1bHK7 @z#");

		while(m.find())
		{
			System.out.println(m.start() + "----------------" + m.group());
		}
	}
}
