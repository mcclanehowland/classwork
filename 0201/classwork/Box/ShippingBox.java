//Challenge: What does this do?
package Box;

public class ShippingBox
{
	public void printInfo()
	{
		System.out.println("Running inside ShippingBox: ");
		StandardBox b = new StandardBox();
		
		//Uncomment the code and answer. 
		
		//(4) Does companyName print? why? yes, because companyName is public
		System.out.println( b.companyName );
		
		//(5) Does password print? why? no, because it is private
		//System.out.println( b.password );
		
		//(6) Does address print? why? yes, because address is protected but StandardBox is in the same package as ShippingBox
		System.out.println( b.address );
		
		
	}
}
