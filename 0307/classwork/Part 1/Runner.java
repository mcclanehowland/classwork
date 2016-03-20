class Animal
{
	private String tricks;
	
	public Animal(String tricks)
	{
		this.tricks = tricks;
	}
	
	public String speak()
	{
		return tricks;
	}
}

class Dog extends Animal
{
	
	public Dog(String tricks)
	{
		super(tricks);
	}
	
	public String speak()
	{
		return super.speak() + " woof";
	}
	

}

class Cat extends Animal
{

	public Cat(String tricks)
	{
		super(tricks);
	}
	
	public String speak()
	{
		return super.speak() + " meow";
	}
	
}

class Pug extends Dog
{
	private String tricks;
	
	public Pug(String tricks)
	{
		super(tricks);
	}
	
	public void size()
	{
		System.out.println("I am small.");
	}
}

public class Runner
{
	public static void main(String args[])
	{
		Animal ani = new Animal("nothing");
		Dog fido = new Dog("I can dance.");
		Cat whisker = new Cat("I can sing.");
		Pug piper = new Pug("I can jump.");
		
		
		//Uncomment for each problem.  When you move to next problem, comment out the previous problem.
		
		System.out.println("\nPart 1");
		//(1)Which one prints woof. Why?
        //because fido is a dog
		//System.out.println( ani.speak() );
		System.out.println( fido.speak() );
		//System.out.println( whisker.speak() );
		//System.out.println( piper.speak() );
		
		System.out.println("\nPart 2");
		//(2)Which one of these lines below don't work? Explain why.
        //you cannot cast an animal down to a dog
		//Dog d1 = (Dog) ani;
		Dog d2 = (Dog) fido;
		Dog d3 = (Dog) whisker; 
		Dog d4 = (Dog) piper;
		
		System.out.println("\nPart 3");
		//(3)Do they all print the same thing now that are cast to Animal? Explain why or why not.
        //no because this casts to animal but are instantiated above as their separate types.
		Animal a1 = (Animal) ani;
		Animal a2 = (Animal) fido;
		Animal a3 = (Animal) whisker;
		Animal a4 = (Animal) piper;
		
		System.out.println( a1.speak() );
		System.out.println( a2.speak() );
		System.out.println( a3.speak() );
		System.out.println( a4.speak() );

		
		System.out.println("\nPart 4");
		//(4)Which one of these lines below don't work? Explain why.
        //because pug is a child and you cannot cast from parent to child
		//Challenge: Why is it that you can cast down a5 that is an Animal to a Pug?
		Animal a5 = new Pug("I can jump high");
		//a5.size();
		Pug a6 = (Pug) a5;
		a6.size();
		
		
		//(5)From what you learn, describe what direction can casting work?  
		//What do you lose when you cast up? What don't you lose?
        //
		
	
	}
}


