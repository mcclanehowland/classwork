public class Game
{
	int rand1, rand2;
	
	public Game()
	{
		rand1 = 0;
		rand2 = 0;
	}
	public void play()
	{
		rand1 = (int)(Math.random()*8+2);
		rand2 = (int)(Math.random()*8+2);
	}
	public void print()
	{
		System.out.println(rand1+"\n"+rand2);
	}
	public int getWinnings()
	{
		if(rand1 == 10 && rand2 == 10)
		{
			return 10;
		}
		else if(rand1 == rand2)
		{
			return 2;
		}
		else if(rand1 == 7 || rand2 == 7)
		{
			return 2;
		}
		else 
		{
			return 0;
		}
	}
}