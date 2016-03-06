//Challenge: What does this do?
//imports the contents of Box
import Box.*;

public class Runner
{
	public static void main (String args[])
	{
		
		ShippingBox obj = new ShippingBox();
		obj.printInfo();
				
		System.out.println("\nRunning inside Runner: ");
		
		
		StandardBox obj2 = new StandardBox();
		
		//Uncomment the code and answer. 
		
		//(1) Does it print? why? yes, because companyName is public
		System.out.println( obj2.companyName );
		
		//(2) Does it print? why? no, because password is private
		//System.out.println( obj2.password );
		
		//(3) Does it print? why? no, because address is protected 
		//System.out.println( obj2.address );
		
		
		
	}
}
