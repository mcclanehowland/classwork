public class ArrayTest
{
	int[] numbers;
	public ArrayTest(int num)
	{
		numbers = new int[num];
		for(int i = 0; i < numbers.length;i++)
			numbers[i] = (int)(Math.random()*99+1);
	}
	public void print()
	{
		for(int each : numbers)
			System.out.print(each+" ");
		
	}
	public boolean search(int num)
	{
		for(int each : numbers)
			if(each == num)
				return true;
		return false;
	}
}