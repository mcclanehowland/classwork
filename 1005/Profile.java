public class Profile
{
	String name = "";
	int age;
	public Profile(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void printInfo()
	{
		System.out.println(name+" "+age);
	}
}