//Exammple on throws statement

public class Ex5
{
	public static void main(String... args) throws InterruptedException
	{
		String st="Rama";

		System.out.println(st.charAt(1));
		Thread.sleep(1000);

		System.out.println(st.charAt(2));
		Thread.sleep(1000);

		System.out.println(st.charAt(3));
	}
}