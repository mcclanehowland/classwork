public class Runner
{
	public static void main (String [] args)
	{
		ArrayTest a = new ArrayTest();
		int [] numArray = new int[5];
		for (int i = 0; i < numArray.length; i++)
			numArray[i] = (int)(Math.random() * 9 + 1);
		a.printArray(numArray);
		a.sortBubble(numArray);
		a.printArray(numArray);
		a.scramble(numArray);
		a.sortSelection(numArray);
		a.printArray(numArray);
		String[] stringArray = new String[5];
		stringArray[0] = "cat";
		stringArray[1] = "dog";
		stringArray[2] = "bear";
		stringArray[3] = "chicken";
		stringArray[4] = "cow";
		for (String each : stringArray)
	        System.out.print(each+" ");	

        System.out.println();
        a.sortString(stringArray);
        for(String each : stringArray)
            System.out.print(each+" ");
        System.out.println();
    }
}
