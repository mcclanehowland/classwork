import java.util.Scanner;

public class cylinder
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input radius");
		int radius = keyboard.nextInt();
		System.out.println("input height");
		int height = keyboard.nextInt();
		double volume = radius * radius * 3.14 * height;
		System.out.println("the volume is "+volume);
	}
}
