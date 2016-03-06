import java.util.Scanner;

public class Circle
{
	double pi = 3.14;
	public void printArea()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please enter the radius");
		int radius = keyboard.nextInt();
		double area = radius * radius * pi;
		System.out.println("the area is: "+area);
	}
}