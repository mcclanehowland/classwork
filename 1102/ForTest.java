public class ForTest
{
	public void printCount()
	{
		for(int i = 1;i<=100;i++)
		{
			System.out.print(i+" ");
		}
	}
	public void printCount(int num)
	{
		System.out.println("");
		for(int i = 1; i <= num;i++)
		{
			System.out.print(i+" ");
		}
	}
	public void printCount(int min,int max)
	{
		System.out.println("");
		for(int i = min; i <= max; i++)
		{
			System.out.print(i+" ");
		}
	}
	public int getFactorial(int num)
	{
		System.out.println("");
		int product = 1;
		for(int i = num; i > 1;i--)
		{
			product *= i;
		}
		return product;
	}
}