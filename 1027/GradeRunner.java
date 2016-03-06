import java.util.Scanner;

public class GradeRunner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a score");
		int s1 = kb.nextInt();
		System.out.println("enter another score");
		int s2 = kb.nextInt();
		System.out.println("enter another score");
		int s3 = kb.nextInt();
		Grade g = new Grade(s1,s2,s3);
		boolean pass = g.checkPass();
		System.out.println(pass);
	}
}