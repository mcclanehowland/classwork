import java.util.Scanner;

public class AnimalRunner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter the type of your animal");
		String type = kb.next();
		System.out.println("please enter the age of your animal");
		int num1 = kb.nextInt();
		
		Animal animal = new Animal();
		
		animal.printInfo();
		
		Animal animal2 = new Animal(type, num1);
		
		animal2.printInfo();
		
	}
}
