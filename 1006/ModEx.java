public class ModEx
{
	int number;
	
	public ModEx(int number)
	{
		this.number = number;
	}
	public void numCheck()
	{
		if(number%5 == 0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}