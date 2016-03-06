import java.util.Scanner;

public class NestedRunner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		NestedLoops nl = new NestedLoops();
		nl.drawFilledBox();
		
		nl.drawTriangle();
		
		nl.drawMultiChart();
		System.out.println("Enter in a width ");
	int w = kb.nextInt();
	System.out.println("Enter in a height ");
	int h = kb.nextInt();
	nl.drawFilledBox(w,h);


	}
}