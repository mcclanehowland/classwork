public class Sum
{
	public int getSumWhile(int num)
	{
		int sum = 0;
		int number = 1;
		while(number <= num)
		{
			sum += number;
			number++;
		}
		return sum;
	}
	public int getSumFor(int num)
	{
		int sum = 0;
		for(int i = 0;i<=num;i++)
		{
			sum += i;
		}
		return sum;
	}
}
