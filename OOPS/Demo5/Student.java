public class Student
{
	private int slno;
	private String name,course,time,faculty;

	public void m1(int s,String n,String c,String t,String f)
	{
		if(s>=1)
		  slno=s;

		name=n;
		course=c;
		time=t;
		faculty=f;
	}

	public void m2()
	{
		System.out.println("SNO     : "+ slno);
		System.out.println("Nmae    : "+ name);
		System.out.println("Course  : "+ course);
		System.out.println("Time    : "+ time);
		System.out.println("Faculty : "+ faculty);
	}
}
