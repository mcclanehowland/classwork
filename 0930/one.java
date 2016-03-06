public class one
{
	int length, width;
	double area;
	one()
	{
		length = 0;
		width = 0;
	}
	one(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	public void printArea()
	{
		area = width * length;
		System.out.println("the area is: "+area);
	}
	public void printArea(int length, int width)
	{
		this.length = length;
		this.width = width;
		area = length * width;
		System.out.println("the area is: "+area);
	}
}