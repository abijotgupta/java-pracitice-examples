//Quantifiers can be used to specify no characters to match

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegularExpressionDemo4
{

	public static void main(String[] args)
	{
		//Pattern p = Pattern.compile("a");      //Exactly one 'a'
		//Pattern p = Pattern.compile("a+");       //Atleast one 'a'
		//Pattern p = Pattern.compile("a*");       //Any no 'a' including zero
		Pattern p = Pattern.compile("a?");       //Atmost one 'a'

		Matcher m = p.matcher("abaabaaab");

		while(m.find())
		{
			System.out.println(m.start() + "----------------" + m.group());
		}
	}
}
