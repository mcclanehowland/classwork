import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		ArrayTest a = new ArrayTest(10);
		a.print();
		System.out.println("\nenter a number to search for");
		int search = kb.nextInt();
		a.searchReplace(search);
		a.print();
	}
}