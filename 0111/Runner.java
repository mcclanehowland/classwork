public class Runner{
	public static void main(String[] args)
	{
		StringTest s = new StringTest("hello");
		System.out.println(s.getFirstLetter());
		System.out.println(s.getLastLetter());
		s.printWordGame();	
	}
}