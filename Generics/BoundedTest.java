//Bounded Types

class BoundedTest<T extends Number>
{
	public static void main(String[] args)
	{
		BoundedTest<Number> t1 = new BoundedTest<Number>();
		BoundedTest<Integer> t = new BoundedTest<Integer>();

		//BoundedTest<Thread> t2 = new BoundedTest<Thread>();     //CTE:--> type argument Thread is not within bounds of type-variable T

		//BoundedTest<String> t = new BoundedTest<String>();    //CTE:--> type argument String is not within bounds of type-variable T

	}

}