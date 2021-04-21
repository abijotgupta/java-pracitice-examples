class Factory
{
	int items;
	boolean itemsInFactory;

	synchronized void produce(int items)
	{
		if(itemsInFactory)
		{
			try {
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		this.items = items;
		itemsInFactory = true;

		System.out.println("Produced Items : " + items);
		notify();
	}


	synchronized int consume(int items)
	{
		if(itemsInFactory)
		{
			try {
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}



		System.out.println("Consumed Items : " + items);
		itemsInFactory = false;

		notifyAll();
		return items;
	}
}


