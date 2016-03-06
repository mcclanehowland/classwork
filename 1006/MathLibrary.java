public class MathLibrary
{
	
	public void solveQuadratic(int a, int b, int c)
	{
		
		double discriminant = Math.pow(b, 2) - 4*a*c;
		double top1 = -1*b + Math.sqrt(Math.pow(b,2)-4*a*c);
		double top2 = -1*b - Math.sqrt(Math.pow(b,2)-4*a*c);
		double bottom = 2 * a;
		double a1 = top1 / bottom;			
		double a2 = top2 / bottom;
		if(discriminant > 0)
		{
			System.out.println(a1+", "+a2);
		}	
		if(discriminant < 0)
		{
			System.out.println("there are no real answers");
		}
		else{}
		
	}
	
}