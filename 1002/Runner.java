public class Runner
{
	public static void main(String[] args)
	{
		One obj1 = new One();
		One obj2 = new One(5);
		obj2.printSquare();
		obj2.printSquare(6);
	}
}