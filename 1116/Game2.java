public class Game2
{
	int secret;
	
	public Game2()
	{
		secret = (int)(Math.random()*999+1);
		System.out.println(secret);
	}
	public boolean guess(int num)
	{
		if(num == secret)
			return true;
		else
			return false;
		
	}
}