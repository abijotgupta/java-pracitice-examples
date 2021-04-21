//Example on overloading method by changind datatype of variables

public class OverEx2
{
	public int add(int a,int b){
		return a+b;
	}

	public int add(int a,int b,int c){
			return a+b+c;
	}

	public int add(int a,int b,int c,int d){
			return a+b+c+d;
	}

	public static void main(String... abijot)
	{
		OverEx2 ob=new OverEx2();

		System.out.println(ob.add(10,20));
		System.out.println(ob.add(11,22,33));
		System.out.println(ob.add(11,22,33,44));
	}
}
