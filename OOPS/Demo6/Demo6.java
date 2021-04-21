//PROGRAM TO UTILIZE BEAN CLASS

public class Demo6
{
	public static void main(String[] args)
	{
		//user1
		Student s1=new Student();

		//s1.m1(11,"Ram","Core JAVA","2-4","Shiva Kumar");      	CTE

		s1.setsno(11);
		s1.setname("Ram");
		s1.setcourse("Core JAVA");
		s1.settime("2-4");
		s1.setfaculty("Shiva Kumar");

		int sno=s1.getsno();
		String name=s1.getname();
		String course=s1.getcourse();
		String time=s1.gettime();
		String faculty=s1.getfaculty();

		System.out.println("STUDENT DETAILS");
		System.out.println("---------------");
		System.out.println(sno+"\t"+name+"\t"+course+"\t"+time+"\t"+faculty);

		//user 2
		Student s2=new Student();

		s2.setname("Abijot Gupta");
		s2.setfaculty("Durga Sir");
		s2.setsno(1005);
		s2.settime("4-6");
		s2.setcourse("Core JAVA");

        System.out.println("---------------");
		System.out.println("---------------");
		System.out.println("Name  : "+s2.getname());
		System.out.println("Course: "+s2.getcourse());

	}
}
