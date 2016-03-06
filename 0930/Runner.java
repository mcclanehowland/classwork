public class Runner
{
	public static void main(String[] args)
	{
		one obj1 = new one();
		one obj2 = new one(5,2);
		obj1.printArea();
		obj2.printArea();
		obj2.printArea(6,2);
	}
}