public class Radius
{
	double pi = 3.14;
	double area, circumference, volume;
	
	public void printArea(double radius)
	{
		area = pi * radius * radius;
		System.out.println("area: "+area);
	}
	public void printCirc(double radius)
	{
		circumference = pi * radius * 2;
		System.out.println("circumference: "+circumference);
	}
	public void printSphereVol(double radius)
	{
		volume = 4.0/3.0 * pi * radius * radius * radius;
		System.out.println("volume: "+volume);
	}
	
	
	
}