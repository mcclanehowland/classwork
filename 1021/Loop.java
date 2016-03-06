public class Loop
{
	int max,min,num,total;
	
	public Loop(int min, int max)
	{
		this.max = max;
		this.min = min;
		num = min;
	}
	public void countWhile()
	{
		while(num <= max)
		{
			System.out.println(num);
			num++;
		}
	}
	public int getSum()
	{
		num = min;
		do
		{
			total += num;
			num++;
			min++;
		}while(min <= max);
		return total;
	}
}