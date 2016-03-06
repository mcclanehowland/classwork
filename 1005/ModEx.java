public class ModEx
{
	int num;
	boolean prime = true;
	/*public void numCheck(int num)
	{
		if(num%2 == 1)
		{
			System.out.println("the number is odd");
		}
		if(num%2 == 0)
		{
			System.out.println("the number is even");
		}
	}*/
	public void checkPrime(int num)
	{
		this.num = num;
		int num1 = num;
		
		while(num > 1)
		{
			num--;
			if(num1%num == 0)
			{
				prime = false;
			}
			if(num1%num > 0)
			{
				prime = true;
			}
			
		}
		System.out.println(prime);
		
		
	}
}