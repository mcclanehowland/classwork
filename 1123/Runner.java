import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		ArrayTest a = new ArrayTest(10);
		Scanner kb = new Scanner(System.in);
		a.print();
		System.out.println("\nenter a number to search for");
		System.out.println(a.search(kb.nextInt()));
	}
}