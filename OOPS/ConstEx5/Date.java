//Example on copy constructor

public class Date
{
	private int day,year;
	private String month;

	public Date(int d,String m,int y)
	{
		day=d;
		month=m;
		year=y;
	}

	public Date(Date temp)  //Copy Constructor
	{
		day=temp.day;       //explaination on copy page no 134
		month=temp.month;
		year=temp.year;
	}

	//setter methods

	public void setDay(int d)
	{
		day=d;
	}

	public void setMonth(String m)
	{
		month=m;
	}

	public void setYear(int y)
	{
		year=y;
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

