import java.util.Scanner;

public class AnimalRunner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter an animal type");
		String type = kb.next();
		System.out.println("please enter an age");
		int age = kb.nextInt();
		
		Animal animal = new Animal();
		
		animal.setVariables(type, age);
		animal.printInfo();
	}
}