public class MathTest
{
	public void solvePythagorean(int a, int b)
	{
		System.out.println("c: "+Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2))));
	}
	public void average(int num1, int num2 )
	{
		System.out.println( "The average is " + ((double)num1 + (double)num2)/2 );
	}

	public void areaTriangle(int base, int height)
	{
		System.out.println( "The area is " + ((double)base * (double)height)/2 );
	}

}