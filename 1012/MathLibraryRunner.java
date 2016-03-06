import java.util.Scanner;

public class MathLibraryRunner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		MathLibrary m = new MathLibrary();
		System.out.println("please enter a radius");
		double radius = kb.nextDouble();
		System.out.println("please enter a height");
		double height = kb.nextDouble();
		
		double areaCircle = m.areaCircle(radius);
		double volCylinder = m.volCylinder(radius, height);
		double volCone = m.volCone(radius, height);
		System.out.println(areaCircle);
		System.out.println(volCylinder);
		System.out.println(volCone);
		
	}
}	