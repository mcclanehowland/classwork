public class StringTest
{
	String myText;
	
	public StringTest(String s)
	{
		myText = s;
	}
	public int getLength()
	{
		return myText.length();
	}
	public void printInfo()
	{
		System.out.println(myText);
		System.out.println(myText.length());
	}
	public void printChar(int location)
	{
		System.out.println(myText.charAt(location));
	}
	public void printLocation(String s)
	{
		System.out.println(myText.indexOf(s));
	}
	public int countChar(char c)
	{
		int sum = 0;
		for(int i = 0; i < myText.length();i++)
		{
			if(myText.charAt(i) == c)
				sum++;
		}
		return sum;
	}
}