import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegularExpressionDemo2
{

	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("[abc]");
		//Pattern p = Pattern.compile("[^abc]");
		//Pattern p = Pattern.compile("[a-z]");
		//Pattern p = Pattern.compile("[A-Z]");
		//Pattern p = Pattern.compile("[a-z A-Z]");
		//Pattern p = Pattern.compile("[0-9]");
		//Pattern p = Pattern.compile("[a-z A-Z 0-9]");
		//Pattern p = Pattern.compile("[^a-z A-Z 0-9]");

		Matcher m = p.matcher("a1bHK7@z#");

		while(m.find())
		{
			System.out.println(m.start() + "----------------" + m.group());
		}
	}
}
