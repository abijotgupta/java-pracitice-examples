//Example on constructor overloading using setter and getter methods

public class Date
{
//properties
	private int day,year;
	private String month;

	public Date()
	{
		day=23;
		month="Jan";
		year=1996;
	}

	public Date(int d,String m,int y)
	{
		day=d;
		month=m;
		year=y;
	}

	public Date(int y)
	{
		day=0;
		month="  ";
		year=y;
	}

	public Date(int d,String m)
	{
		day=d;
		month=m;
		year=0;
 	}

	//setter methods

	public void setDay(int d)
	{
		day=d;
	}

	public void setYear(int y)
	{
		year=y;
	}

	public void setMonth(String m)
	{
		month=m;
	}

	//getter methods

	public int getDay()
	{
		return day;
	}

	public String getMonth()
	{
		return month;
	}

	public int getYear()
	{
		return year;
	}


}
