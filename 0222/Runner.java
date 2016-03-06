import java.util.ArrayList;

public class Runner
{
	public static void main(String args[])
	{
		
		int a;
		int b;
		
		//String is an object.  Make sure to create a
		//a table for each string object.
		String text1;
		String text2;
		
		MyClass obj1;
		MyClass obj2;
		
		Diagram myObject = new Diagram();
		
		//Diagram 1 - Look at slide 5 for an example
		//There should be no arrows for diagram 1.
		System.out.println("Diagram 1");
		a = 3;
		b = 6;
		
		System.out.println(a + " : " + b);
		myObject.demo1(3,6);
		System.out.println(a + " : " + b);
		
		
		System.out.println("\n");
		obj1 = new MyClass(300, 500, "hello");
		
		//Diagram 2
		System.out.println("Diagram 2");
		ArrayList<String> myText = new ArrayList<String>();
		myText.add("hello");
		myText.add("World");
		
		System.out.println(myText.get(0));
		obj1.changeB(myText);
		System.out.println(myText.get(0));

		System.out.println("\n");
		
		
		//Diagram 3
		System.out.println("Diagram 3");
		obj1 = new MyClass(300, 500, "hello");
		obj2 = new MyClass(30, 50, "bye");
		
		System.out.println(obj1);
		System.out.println(obj2);
		myObject.demo3(obj1,obj2);
		System.out.println(obj1);
		System.out.println(obj2);

		System.out.println("\n");

		//Diagram 4
		System.out.println("Diagram 4");
		text1 = "cat";
		text2 = "dog";
		
		System.out.println(text1 + " : " + text2);
		myObject.demo2(text1,text2);
		System.out.println(text1 + " : " + text2);
		
		
		
		
	}	
}
