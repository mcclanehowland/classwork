import java.util.Scanner;

public class Area
{
	public static void main(String[] args)
	{
		Scanner num1 = new Scanner(System.in);
		System.out.println("please enter the length");
		int length = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("please enter the width");
		int width = num2.nextInt();
		
		double area = width * length;
		
		System.out.println("lengh = " + length);
		System.out.println("width = " + width);
		System.out.println("area = " + area);
	}
}