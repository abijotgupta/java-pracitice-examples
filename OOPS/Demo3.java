//Example on creating a student class for maintaining student details

class Student
{
	int sno;
	String name,course,time,faculty;

	void m1()
	{
		sno=10;
		name="Abijot Gupta";
		course="Core Java";
		time="2-4";
		faculty="Shiva Kumar";
	}

	void m2()
	{
		System.out.println("S No.   :"+sno);
		System.out.println("Name    :" +name);
		System.out.println("Course  :"+course);
		System.out.println("Time    :"+time);
		System.out.println("Faculty :"+faculty);
	}
}

//program to utilize student class

class Demo3
{
	public static void main(String[] args)
	{
		//user 1

		Student s1=new Student();
		s1.m1();
		s1.m2();

		System.out.println("              ");
		System.out.println("              ");


		//user 2

		Student s2=new Student();
		s2.m1();
		s2.m2();
	}
}

