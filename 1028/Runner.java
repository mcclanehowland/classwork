public class Runner
{
	public static void main(String[] args)
	{
		Matching m = new Matching();
		System.out.println(m.checkNums(1,1));
		System.out.println(m.checkNums(4,-2));
		System.out.println(m.checkNums(-4,-1));
		System.out.println(m.checkNums(1,2));
	}
}