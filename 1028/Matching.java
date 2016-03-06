public class Matching
{
	public int checkNums(int num1, int num2)
	{
		if(num1 == num2)
		{
			return 0;
		}
		else if(num1 > 0 && num2 > 0)
		{
			return 1;
		}
		else if(num1 > 0 && num2 < 0)
		{
			return -1;
		}
		else if(num1 < 0 && num2 > 0)
		{
			return -1;
		}
		else
		{
			return 100;
		}
	}
}