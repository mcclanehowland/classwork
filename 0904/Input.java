import java.util.Scanner;

public class Input
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter an integer");
		int side = input.nextInt();
		int area = side * side;
		System.out.println("the area of a square with side length " + side + " is " + area);
	}
}