//Write a regular expression to represent all valid mobile numbers in java language

//RULES

//It should contain exactly 10 digits
//1st digit should be 6 to 9

import java.util.regex.Pattern;
import java.util.regex.Matcher;



class ValidMobileNumbers
{

	public static void main(String[] args)
	{
		//Pattern p = Pattern.compile("[6-9][0-9]{9}");     //exactly 10 digits

		//Pattern p = Pattern.compile("0?[6-9][0-9]{9}");     //10 or 11 digits

		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");     //10 or 11 or 12 digits
		//Pattern p = Pattern.compile("(91)?(0?[6-9][0-9]{9})");     //10 or 11 or 12 digits

		Matcher m = p.matcher(args[0]);

		if(m.find() && m.group().equals(args[0]))
		{
			System.out.println("Valid Mobile Number");
		}
		else
		{
			System.out.println("Invalid Mobile Number");
		}
	}
}