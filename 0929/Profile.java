public class Profile
{
	String name = "";
	int age, id;
	
	public Profile()
	{
		name = "John";
		age = 15;
	}
	public Profile(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void printInfo()
	{
		System.out.println(name);
		System.out.println(age);
	}
	public void printInfo(int id)
	{
		this.id = id;
		System.out.println(name+" "+age+" "+id);
	}
}