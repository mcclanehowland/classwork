public class ArrayTest
{
	int[] numbers;
	
	public ArrayTest(int num)
	{
		numbers = new int[num];
		for(int i = 0; i < numbers.length;i++)
		{
			numbers[i] = (int)(Math.random()*9+1);
		}
	}
	public void print()
	{
		for(int each : numbers)
		{
			System.out.print(each+" ");
		}
	}
	public void searchReplace(int num)
	{
		for(int i = 0; i < numbers.length;i++)
		{
			if(numbers[i] == num)
				numbers[i] = -1;
		}
	}

}