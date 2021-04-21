//PROGRAM TO UTILIZE STUDENT CLASS

public class Demo5
{
	public static void main(String[] args)
	{

	//user 1

	Student s1=new Student();
	//s1.slno=100 //CTE
	//s1.slno=-123;  //CTE

	s1.m1(11,"RAM","CORE JAVA","2-4","SHIVA KUMAR");
	s1.m2();

	System.out.println("------------------------");
	//user 2
	Student s2=new Student();
	s2.m1(-22,"SAM","CORE JAVA","6-8","HARI KRISHNA");    //-22 therefore default value
    s2.m2();

	}
}
