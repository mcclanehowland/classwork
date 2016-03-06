public class Runner
{
	public static void main(String[] args)
	{
		Test t = new Test();
		System.out.println(t.getElement(2));
		System.out.println(t.getElement(4));
		System.out.println(t.getWinnings(7,7));
		System.out.println(t.getWinnings(1,2));
	}
}