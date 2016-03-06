import java.util.Scanner;

public class Trivia
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("what is the color of grass?");
		String answer = keyboard.next();
		
		String q1 = "question 1 correct";
		String q2 = "question 2 correct";
		if( answer.equals("green") )
		{
			System.out.println("good job");
		}
		else
		{
			System.out.println("sorry wrong answer");
			q1 = "question 1 wrong";
		}
		
	    System.out.println("what is the color of water?");
		answer = keyboard.next();
		
		if( answer.equals("blue"))
		{
			System.out.println("good job");
		}
		else
		{
			System.out.println("sorry wrong answer");
			q1 = "question 2 wrong";
		}
		System.out.println(q1 + "\n" + q2);
		
	}
}