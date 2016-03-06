import java.util.Scanner;
 
public class ScannerStrings
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
 
         
        //There are issues with nextLine() and the variable sentence 
        //(1) What is happening that is not working correctly?
		//the scanner picks up the whitespace from the int input
        //(2) What type of errors are these? runtime or syntax?
		//runtime for whitespace and syntax for string error
         
        System.out.print("Enter an integer :: ");
        int num = keyboard.nextInt();
         
        //uncomment the line below to fix the input issue 
        keyboard.nextLine();      //picks up whitespace
         
        System.out.print("Enter a sentence :: ");
        String sentence = keyboard.nextLine();
     
        System.out.println("");
         
        System.out.println("Your number is :: " + num);
        System.out.println("Your sentence is :: " + sentence);
         
        //Add code to do the following
        //(3) Ask the user for their favorite color, then print it out.
        //(4) Ask the user for their favorite saying, then print it out.
        System.out.println("what is your favorite color");
		String color = keyboard.next();
		
		
		keyboard.nextLine();
		
		System.out.println("please enter a saying");
		String saying = keyboard.nextLine();
		
		System.out.println("your saying is " + saying);
		System.out.println("your color is " + color);
    }
}