public class RandomTest
{
	int min, max;
	public RandomTest(int min, int max)
	{
		this.min = min;
		this.max = max;
	}
	public int getRandom()
	{
		return (int)(Math.random() * (max - min+1)+min);
	}
	public void setRange(int min, int max)
	{
		this.max = max;
		this.min = min;
	}
	public int getRandomMax()
	{
		return (int)(Math.random()*max+1);
	}
	public int randomDecimal()
	{
		return (int)(Math.random()*101);
	}
}