public class Count
{
	public int getSummation(int num)
	{
		int sum = 0;
		for(int i = 1; i <= num; i++)
		{
			sum += i;
		}
		return sum;
	}
}