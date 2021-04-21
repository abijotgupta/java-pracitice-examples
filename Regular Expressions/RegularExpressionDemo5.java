//Pattern class split() method used to split the given string against a regular expression

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegularExpressionDemo5
{

	public static void main(String[] args)
	{
		//Pattern p = Pattern.compile("\\s");
		//Pattern p = Pattern.compile("e");
		Pattern p = Pattern.compile(".");

		String[] s = p.split("abijot gupta cse 3rd year");

		for(String s1 : s)
		{
			System.out.println(s1);
		}
	}
}
