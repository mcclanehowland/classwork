public class Animal
{
	String animalType = "";
	int age;
	
	public void setVariables(String type, int num1)
	{
		animalType = type;
		age = num1;
	}
	public void printInfo()
	{
		System.out.println("the "+animalType+" is "+age+" years old.");
		
	}
}