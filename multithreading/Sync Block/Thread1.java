class Thread1 extends Thread
{
	Add a;

	Thread1(Add a)
	{
		this.a = a;
	}

	public void run() {
		a.add(50,60);
	}
}