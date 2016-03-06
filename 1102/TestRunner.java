public class TestRunner
{
	public static void main(String[] args)
	{
		ForTest f = new ForTest();
		f.printCount();
		f.printCount(10);
		f.printCount(5,20);
		System.out.println(f.getFactorial(5));
	}
}