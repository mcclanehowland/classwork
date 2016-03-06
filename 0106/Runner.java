public class Runner
{
	public static void main(String[] args)
	{
		Box[] boxes = new Box[5];
		for(int i = 0; i < boxes.length;i++)
		{
			boxes[i] = new Box((int)(Math.random()*8+1),(int)(Math.random()*8+1));
		}
		for(Box each : boxes)
		{
			System.out.println(each.getX()+", "+each.getY());
		}
	}
}