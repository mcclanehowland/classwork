public class Circle2
{
	double pi, radius, area;
	
	public Circle2()
	{
		pi = 3.14;
		radius = 1;
	}
	public Circle2(double radius)
	{
		this.radius = radius;
		pi = 3.14;
	}
	public void printArea()
	{
		area = pi * radius * radius;
		System.out.println("area is: "+area);
	}
	public void printArea(double radiusin)
	{
		//radius = radiusin;
		area = pi * radiusin * radiusin;
		System.out.println("the area is: "+area);
	}
	
}