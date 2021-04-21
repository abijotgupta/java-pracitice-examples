//EXAMPLE OF BEAN CLASS

public class Student
{
	//properties
	private int sno;
	private String name,course,time,faculty;

	//setter methods

	public void setsno(int s){
		sno=s;
	}

	public void setname(String n){
		name=n;
	}

	public void setcourse(String c){
		course=c;
	}

	public void settime(String t){
		time=t;
	}

	public void setfaculty(String f){
		faculty=f;
	}

	//getter methods

	public int getsno(){
			return sno;
		}

		public String getname(){
			return name;
		}

		public String getcourse(){
			return course;
		}

		public String gettime(){
			return time;
		}

		public String getfaculty(){
			return faculty;
    	}

}

