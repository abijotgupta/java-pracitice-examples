//Bounded Types

class BoundedTest2<T extends Runnable>                           //Runnable is Interface Therefore allowed types are either Runnable or its implementation classes i.e, Thread class
{
	public static void main(String[] args)
	{
		BoundedTest2<Thread> t1 = new BoundedTest2<Thread>();
		BoundedTest2<Runnable> t = new BoundedTest2<Runnable>();

		BoundedTest<Double> t2 = new BoundedTest<Double>();
		//BoundedTest<String> t = new BoundedTest<String>();    //CTE:--> type argument String is not within bounds of type-variable T

	}

}


