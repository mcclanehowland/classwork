public class MathLibrary
{
	double pi;
	public MathLibrary()
	{
		pi = 3.14;
	}
	public double areaCircle(double radius)
	{
		return(radius*radius*pi);
	}
	public double volCylinder(double radius, double height)
	{
		return(radius*radius*pi*height);
	}
	public double volCone(double radius, double height)
	{
		return((radius*radius*pi*height)/3);
	}
}