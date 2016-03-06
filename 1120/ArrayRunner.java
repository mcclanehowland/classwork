import java.util.Scanner;
public class ArrayRunner
{
	public static void main(String[] args)
	{
		ArrayTest2 at = new ArrayTest2();
		Scanner sc = new Scanner(System.in);
		at.printNumArray();
		at.printStringArray();
		System.out.print("Insert a number to search for: ");
		int numsearch = sc.nextInt();
		int num = at.searchNumArray(numsearch);
		System.out.println(num);
		System.out.print("Insert a number to search for: ");
		String wordsearch = sc.next();
		int word = at.searchStringArray(wordsearch);
		System.out.println(word);
		int large = at.searchLargest();
		System.out.println(large);
	}
}
