public class Runner
{
	public static void main(String[] args)
	{
		StringTest test1 = new StringTest("the quick brown fox jumps over the lazy dog");
		test1.printInfo();
		test1.printChar(0);
		test1.printChar(5);
		test1.printChar(10);
		test1.printChar(15);
		test1.printLocation("h");
		test1.printLocation("e");
		test1.printLocation("jumps");
		test1.printLocation("dog");
		System.out.println(test1.countChar('o'));
		
	}
}