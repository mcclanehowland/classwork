public class NestedLoops
{
	public void drawFilledBox()
	{
		for(int i=0;i<10;i++)
{
	for(int j=0;j<10;j++)
System.out.print("*");	

System.out.println();
}

	}

	public void drawFilledBox(int w, int h)
	{
		
		System.out.println("\n");
		for(int i = 0;i<h;i++)
		{
			for(int j = 0;j<w;j++)
				System.out.print("*");
			
			System.out.println();
			
		}
	}

	public void drawMultiChart()
	{
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				System.out.print((j*i)+" ");
			}
		System.out.println(" ");
		}

	}
	public void drawTriangle()
	{
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0;j <= i; j++)
				System.out.print("*");
		System.out.println();
		}
	}


}
