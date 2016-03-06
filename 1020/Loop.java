public class Loop
{
	public static void main(String[] args)
	{
		int run = 5;
		System.out.println("*******************\n*******************");
		while(run <= 31)
		{
			System.out.println(run);
			run++;
		}
		run = 0;
		int total = 0;
		System.out.println("*******************\n*******************");
		while(run <= 20)
		{
			System.out.println(total);
			run++;
			total += run;
		}
		run = 6;
		System.out.println("*******************\n*******************");
		do
		{
			run += 2;
			System.out.println(run);
		}while(run <30);
		run = 2;
		total = 0;
		System.out.println("*******************\n*******************");
		do
		{
			total += run;
			System.out.println(total);
			run++;
		}while(run <= 19);
		
	}
}