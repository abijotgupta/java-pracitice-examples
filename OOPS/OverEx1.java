//Example on overloading method by changind datatype of variables

public class OverEx1
{
	public int add(int x,int y){
		return x+y;
	}

	public float add(float x,float y){
		return x+y;
	}

	public double add(double x,double y){
		return x+y;
	}

	public String add(String x,String y){
		return x+y;
	}

	public long add(long x,long y){
			return x+y;
	}

	public double add(int x,double y){
		return x+y;
	}

     public static void main(String... abi)
	{
		OverEx1 ob=new OverEx1();

		System.out.println(ob.add(10,20));
		System.out.println(ob.add("Abi","jot"));
		System.out.println(ob.add(7.3,4.7));
		System.out.println(ob.add(4.33,11.77));
		System.out.println(ob.add(10,19.37));
		System.out.println(ob.add(1080L,2050L));
	}

}