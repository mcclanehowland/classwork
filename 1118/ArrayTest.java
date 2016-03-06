public class ArrayTest
{
	int[] numbers;
	public ArrayTest(int num)
	{
		numbers = new int[num];
		for(int i = 0; i < numbers.length;i++)
		{
			numbers[i] = (int)(Math.random()*4+1);
		}
	}
	public void print()
	{
		for(int i : numbers)
		{
			System.out.print(i+" ");
		}
	}
	public int getSum()
	{
		int sum = 0;
		for(int i : numbers)
		{
			sum += i;
		}
		return sum;
	}
}