public class Runner
{
	public static void main(String[] args)
	{
		Game g = new Game();
		g.play();
		g.print();
		System.out.println(g.getWinnings());
	}
}