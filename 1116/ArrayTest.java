public class ArrayTest
{
	public void ArrayDemo1()
	{
		System.out.println("Demo 1");
		int[] d1 = new int[10];
		for(int i = 0; i < d1.length; i++)
		{
			d1[i] = (int)(Math.random()*14+1);
			System.out.print(d1[i]+"  ");
		}
	}
	public void ArrayDemo4()
	{
		System.out.println("\n\nDemo 4");
		int[] d4 = new int[25];
		for(int i = 0; i < d4.length; i++)
		{
			d4[i] = (int)(Math.random()*8+1);
			System.out.print(d4[i]+"  ");
		}
	}
	public void ArrayDemo5()
	{
		System.out.println("\n\nDemo5");
		String[] d5 = new String[5];
		d5[0] = "hello";
		d5[1] = "what";
		d5[2] = "the";
		d5[3] = "dog";
		d5[4] = "cat";
		for(int i = 0; i < d5.length;i++)
		{
			System.out.print(d5[i]+"  ");
		}
	}
}