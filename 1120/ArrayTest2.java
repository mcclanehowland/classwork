public class ArrayTest2
{
	int[] numArray;
	String[] stringArray;

public ArrayTest2()
{
	int[] numArray = new int[10];
	for(int i=0; i<numArray.length; i++)
	{
		numArray[i] = (int)(Math.random()*20 + 1);
	}
	stringArray = new String[5];
	stringArray[0] = "cat";
	stringArray[1] = "dog";
	stringArray[2] = "what";
	stringArray[3] = "hello";
	stringArray[4] = "bird";
}
public void printNumArray()
{
	for(int each : numArray)
	{
		System.out.println(each);
	}
}
public void printStringArray()
{
	for(String each : stringArray)
	{
		System.out.print(each + " ");
	}
}
public int searchNumArray(int num)
{
	for(int i = 0; i < numArray.length; i++)
	{
		if(numArray[i] == num)
			return i;
	}
	return -1;
}
	public int searchStringArray(String search)
	{
		for(int i = 0; i < stringArray.length;i++)
		{
			if(stringArray[i].equals(search))
				return i;
		}
		return -1;
	}
public int searchLargest()
{
	int greatest = 0;
	for(int i = 0; i < stringArray.length;i++)
	{
		if(numArray[i] > greatest)
			greatest = numArray[i];
	}
	return greatest;
	}	
}
