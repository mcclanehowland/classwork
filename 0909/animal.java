import java.util.Scanner;

public class animal
{
	public static void main(String[] args)
	{
		System.out.println("\nPart 2\n");
		System.out.println("  /\\\t       /\\\n //\\\\\t      //\\\\\n//  \\\\\"'''''\"//  \\\\");
		
		for(int a = 0; a < 19; a++)
			{
				System.out.print("@");
			}
		System.out.println();
		System.out.println("@'''''''\''\''''''''@");	  
		System.out.println("@'   #       #   '@");
		System.out.println("@'   \\   v   /   '@");
		System.out.println("@'      ---      '@");
		System.out.println("@'''''''''''''''''@");
		
		for(int a = 0; a < 19; a++)
			{
				System.out.print("@");
			}
		
		System.out.println("\nguess what animal this is");
		
		Scanner keyboard = new Scanner(System.in);
		String answer = keyboard.next();
		
		if(answer.equals("cat"))
		{
			System.out.println("Congratulations");
		}
		else
		{
			System.out.println("sorry wrong answer");
		}
	}
}