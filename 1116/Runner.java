public class Runner
{
	public static void main(String[] args)
	{
		Game2 g = new Game2();
		for(int i = 1; i <= 1000; i++)
		{
			boolean guess = g.guess(i);
			if(guess == true)
			{
				System.out.println(i);
				break;
			}
		
		}
	
	}
	
}