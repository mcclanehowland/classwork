import java.util.Scanner;

public class agescanner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your birth year (integer)");
		int year = keyboard.nextInt();
		int age = 2015 - year;
		System.out.println("you are about " + age + " years old");
		
	}
}