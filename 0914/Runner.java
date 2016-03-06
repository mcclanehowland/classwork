public class Runner
{
    public static void main(String[] args)
    {
        //(1) Where is Chicken coming from?
		//the method in the file chicken
        Chicken chicken = new Chicken();
         
        //(2) What is the significance of the variable chicken?
		// chicken is the variable the method is stored in.
        //(3) Where is speak() coming from and what does it do?
		//speak is coming from the method Chicken and prints "cluck-cluck"
        chicken.speak();
        chicken.speak();
        chicken.speak();

		Dog dog = new Dog();
		
		dog.speak();
		dog.speak();
		dog.speak();
		dog.speak();	
		
		Cat cat = new Cat();
		
		cat.speak();
		cat.speak();
		cat.speak();
		cat.speak();
    }
     
}




