public class Circle
{
	double pi = 3.14;
	double radius;
	
	public Circle()
	{
		radius = 0;
		pi = 3.14;
	}
	public Circle(double radius)
	{
		this.radius = radius;
		pi = 3.14;
	}
	public void printCylinderVol(double height)
	{
		double volume = pi * radius * radius * height;
		System.out.println("the volume is: "+volume);
	}
	
}