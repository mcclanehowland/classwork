public class Test
{
	public String getElement(int num)
	{
		switch(num)
		{
			case 1:
			return "Hydrogen";
			case 2:
			return "Helium";
			case 3:
			return "Lithium";
			default:
			return "not completed";
		}
	}
	public double getWinnings(int num1, int num2)
	{
		if(num1 == num2)
		{
			return 20.00;
		}
		else if(num1 == 7 || num2 == 7)
		{
			return 10.00;
		}
		else if(num1 < 3 && num2 < 3)
		{
			return 15.00;
		}
		else
		{
			return 0;
		}
	}
}