public class InterThreadCommunication
{
	public static void main(String[] args)
	{
		Factory bajaj = new Factory();

		new Producer(bajaj);
		new Consumer(bajaj);
	}
}