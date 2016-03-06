import java.util.Scanner;

public class Circle
{
	public void printCircumference()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please enter the diameter of your circle");
		double diameter = keyboard.nextDouble();
		double circumference =  diameter * 3.14;
		System.out.println("the circumference is: "+circumference);
		
	}
}