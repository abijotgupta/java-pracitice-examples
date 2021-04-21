//wap to find ab pattern in the targeted string

import java.util.regex.*;

class RegularExpressionDemo1
{
	public static void main(String[] args)
	{
		int count = 0;

		Pattern p = Pattern.compile("abab");
		Matcher m = p.matcher("ababbbbababababbbababaaaab");

		while(m.find())
		{
			count++;
			System.out.println(m.start() + "----------------" + m.end() + "----------------" + m.group());
		}

		System.out.println("Total no of occurences " + count);
	}
}

