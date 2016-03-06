public class Count
{
	public int getFactorial(int num)
	{
		int counter = 1;
		while(num > 0)
		{
			counter *= num;
			num--;
		}
		return counter;
	}
}