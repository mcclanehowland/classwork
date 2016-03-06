import java.util.Scanner;

/*public class Challenge
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = input.nextInt();

		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int p4 = 0;
		int p5 = 0;
		int p6 = 0;
		
		if (num >= 32)
			{
			p1 = 1;
			num = num - 32;
			 if (num >= 16)
			{
			p2 = 1;
			num = num - 16;
			}
			if (num >= 8)
			{
			p3 = 1;
			num = num - 8;		
			}
			if (num >= 4)
			{	
			p4 = 1;
			num = num - 4;
			}
			if (num >= 2)
			{
			
			p5 = 1;
			num = num - 2;
			//System.out.println(num);
			}		
			if (num >= 1)
			{
				p6 = 1;
			}
		}
		else if (num >= 16)
		{
			p2 = 1;
			num = num - 16;
			
			if (num >= 8)
			{
			p3 = 1;
			num = num - 8;		
			}
			if (num >= 4)
			{
			p4 = 1;
			num = num - 4;
			}
			if (num >= 2)
			{
			
			p5 = 1;
			num = num - 2;
			System.out.println(num);
			}		
			if (num >= 1)
			{
			p6 = 1;
			}
			}
		else if (num >= 8)
		{
			p3 = 1;
			num = num - 8;	

			if (num >= 4)
			{
			p4 = 1;
			num = num - 4;
			}
			if (num >= 2)
			{
			
			p5 = 1;
			num = num - 2;
			System.out.println(num);
			}		
			if (num >= 1)
			{
			p6 = 1;
			}			
			}
		else if (num >= 4)
			{
			p4 = 1;
			num = num - 4;
			
			if (num >= 2)
			{
			
			p5 = 1;
			num = num - 2;
			System.out.println(num);
			}		
			if (num >= 1)
			{
			p6 = 1;
			}
			}
		else if (num >= 2)
			{
			
			p5 = 1;
			num = num - 2;
			System.out.println(num);
			if (num >= 1)
			{
			p6 = 1;
			}
			}		
		else if (num >= 1)
			{
			p6 = 1;
			}
			else 
			{
			System.out.println("no");
			}
		
		System.out.println(num);
			
		System.out.print(p1);
		System.out.print(p2);
		System.out.print(p3);
		System.out.print(p4);
		System.out.print(p5);
		System.out.print(p6);
	
	}
}*/

//or



public class Challenge
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please enter an integer");
		int num = keyboard.nextInt();
		int p1,p2,p3,p4,p5,p6;
		p1 = p2 = p3 = p4 = p5 = p6 = 0;
		if (num >= 32)
		{
			p1 = 1;
			num = num - 32;
		}
		if (num >= 16)
		{
			p2 = 1;
			num = num - 16;
		}
		if (num >= 8)
		{
			p3 = 1;
			num = num - 8;
		}
		if (num >= 4)
		{
			p4 = 1;
			num = num - 4;
		}	
		if (num >= 2)
		{
			p5 = 1;
			num = num - 2;
		}
		if (num >= 1)
		{
			p6 = 1;
			num = num - 1;
		}
		//System.out.println(num);
		System.out.println(p1+""+p2+""+p3+""+p4+""+p5+""+p6);
		
	}
}