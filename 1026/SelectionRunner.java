import java.util.Scanner;

public class SelectionRunner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Selection s = new Selection();
		System.out.println("please enter a zip code");
		int zip = kb.nextInt();
		String city = s.zipCode1(zip);
		System.out.println(city);
		System.out.println("please enter a zip code");
		zip = kb.nextInt();
		city = s.zipCode2(zip);
		System.out.println(city);
		System.out.println("please enter a zip code");
		zip = kb.nextInt();
		city = s.zipCode3(zip);
		System.out.println(city);
	}
}