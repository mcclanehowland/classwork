import java.util.Scanner;

public class verb
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter a noun");
		String noun = keyboard.next();
		System.out.println("enter a verb");
		String verb = keyboard.next();
		String sentence = "The "+noun+" "+verb+"s.";
		System.out.println(sentence);
		
	}
}