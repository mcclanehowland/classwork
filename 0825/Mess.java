

import java.util.Scanner; 
 
public class Mess
{ 
	public static void main(String args[]) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I will be finding the area of circle. Please give a radius.");
		double radius = keyboard.nextDouble(); 
		double pi = 3.14; 
		double dog = pi * radius * radius;
        System.out.println("The area of this circle is " + dog); 
	}
}