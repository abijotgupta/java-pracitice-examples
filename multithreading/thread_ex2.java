//thread creation method 2

class MyThread implements Runnable       //implementation of Runnable interface
{
	public void run()                    //override run method
	{
		System.out.println("Thread Running.....................");
	}
}

class thread_ex2
{
	public static void main(String[] args)
	{
		MyThread ob=new MyThread();        //   Since runnable interface contains only run method not start method. In order to call start method
		//										we need the help of parent class(Thread) which contains start method.

		Thread t=new Thread(ob);           //   object 't' contains the address of object 'ob'

		 t.start();                        //   now we can call start method
		//or

		new Thread(new MyThread()).start();
	}
}
