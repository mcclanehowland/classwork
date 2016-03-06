import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Menu m = new Menu();
		System.out.println("please enter a number");
		int num = kb.nextInt();
		String s1 = m.selectMenu1(num);
		System.out.println(s1);
		String s2 = m.selectMenu2(num);
		System.out.println(s2);
	}
}