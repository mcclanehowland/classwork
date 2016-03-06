public class Runner
{
	public static void main(String[] args)
	{
		ArrayTest a = new ArrayTest((int)(Math.random()*3+2));
		a.print();
		System.out.println("\n"+a.getAverage());
	}
}