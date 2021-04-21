import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.StringTokenizer;

class RegularExpressionDemo6
{

	public static void main(String[] args)
	{
		//StringTokenizer st = new StringTokenizer("Abijot Gupta 3rd Year");      //default reg exp for StringTokenizer is space
		StringTokenizer st = new StringTokenizer("Abijot Gupta 3rd Year", "e");
		//StringTokenizer st = new StringTokenizer("17,09,1999", ",");

		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
