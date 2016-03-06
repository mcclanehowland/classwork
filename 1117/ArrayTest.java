import java.util.Scanner;

public class ArrayTest
{
	Scanner kb = new Scanner(System.in);
	public void ArrayDemo6()
	{
		System.out.println("\nDemo 6");
		int[] d6 = new int[10];
		for(int i = 0; i < d6.length;i++)
		{
			d6[i] = (int)(Math.random()*8+1);
		}
		for(int i : d6)
		{
			System.out.print(i+" ");
		}
	}
	public void ArrayDemo7()
	{
		System.out.println("\nDemo 7");
		String[] d7 = {"L:KSJF",";akjdf","a;lkdjf","a;ldkjf","a;ldskfj","a;lkdjf","a;ldkjf",";aldkjf","a;lkdjf","a;lkdjf"};
		for(String i : d7)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nwhat word would you like to change to '522'");
		int num = kb.nextInt();
		System.out.println(d7.length);
		if(num < d7.length)
		{
			d7[num] = "522";
		}	
		for(String i : d7)
		{
			System.out.print(i+" ");
		}
	}
	public void ArrayDemo8(int size)
	{
		System.out.println("\nDemo 8");
		int[] d8 = new int[size];
		for(int i = 0; i < d8.length;i++)
		{
			d8[i] = (int)(Math.random()*8+1);
		}
		for(int i : d8)
		{
			System.out.print(i+" ");
		}
	}
	public void ArrayDemo9()
	{
		System.out.println("\nDemo 9");
		String[] d9 = {"cat","dog","cat","dog","cat","dog"};
		for(String i : d9)
		{
			System.out.print(i+" ");
		}
	}
	public void ArrayDemo10()
	{
		String[] d10 = {"cat","dog","bird","parakeet","lab","lizard","donkey","horse","llama","alpaca"};
		System.out.println("\nenter a word to search for");
		String word = kb.next();
		for(int i = 0; i < d10.length;i++)
		{
			if(d10[i].equals(word))
				System.out.println("Found: "+i);
		}
	}
}