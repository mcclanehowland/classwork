public class ArrayTest
{
	int[] numbers;
	public ArrayTest(int num)
	{
		numbers = new int[num];
		for(int i = 0; i < numbers.length;i++)
		{
			numbers[i] = (int)(Math.random()*19+1);
		}
	}
	public void print()
	{
		for(int each : numbers)
		{
			System.out.print(each+" ");
		}
	}
	public int getSummation()
	{
		int sum = 0;
		for(int each : numbers)
		{
			sum += each;
		}
		return sum;
	}
}