//count no of objects created

class NumberOfObjects
{
	static int count= 0;

	{
		count++;       //instance block
	}

	NumberOfObjects()
	{
	}

	NumberOfObjects(int a)
	{
	}

	public static void main(String[] args)
	{
		NumberOfObjects n1 = new NumberOfObjects();
		NumberOfObjects n2 = new NumberOfObjects(10);
		NumberOfObjects n3 = new NumberOfObjects(20);
		NumberOfObjects n4 = new NumberOfObjects();

		System.out.println(count);
	}
}
