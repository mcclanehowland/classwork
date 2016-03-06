public class Animal
{
	String animalType = "";
	int age;
	
	public Animal()
	{
		animalType = "blank";
	}
	public Animal(String input, int input2)
	{
		animalType = input;
		age = input2;
	}
	public void printInfo()
	{
		System.out.println("the "+animalType+" is "+age+" years old.");
	}
}