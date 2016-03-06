import java.util.Scanner;

public class MathLibraryRunner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("a=?");
		int a = kb.nextInt();
		System.out.println("b=?");
		int b = kb.nextInt();
		System.out.println("c=?");
		int c = kb.nextInt();
		MathLibrary m = new MathLibrary();
		m.solveQuadratic(a,b,c);
	}
}