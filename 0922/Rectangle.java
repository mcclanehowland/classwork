public class Rectangle
{
	int length, width, area;
	
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	public Rectangle(int one, int two)
	{
		length = one;
		width = two;
	}
	public void printArea()

	{
		area = length * width;
		System.out.println("the area is: "+area);
	}
}