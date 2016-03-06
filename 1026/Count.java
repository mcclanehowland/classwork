public class Count
{
	int max,min;
	int num = 0;
	Count(int min,int max)
	{
		this.min = min;
		this.max = max;
	}
	public void printCountUp()
	{
		num = min;
		while(num <= max)
		{
			System.out.println(num);
			num++;
		}
	}
	public void printCountDown()
	{
		num = max;
		do
		{
			System.out.println(num);
			num--;
		}while(num >= min);
	}
}