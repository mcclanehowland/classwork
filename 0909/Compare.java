public class Compare
{
    public static void main(String args[])
    {
     
         
        int number = 9;
        if( number == 9 )
        {
            System.out.println("The number is 9");
        }
         
        String text = "Hello";
        if( text.equals("Hello") )
        {
            System.out.println("The text is Hello");
        }
         
        //1) What is the difference in the if-statement when you compare numbers and String?
         //numbers use == while strings use .equals
        //2) What happens if try to compare text with the following code? why?
        //syntax error
        /*if( text == "Hello" )
        {
            System.out.println("The text is Hello");
        }
        
         */
        //3) What happens if you try to compare number with the following code? why?
        /* error, because you need ==, not =
        if( number = 9 )
        {
            System.out.println("The number is 9");
        }
        */
         
        //4) What happens if you try to compare number with the following code? why?
        /* the code will not run because number is set to 9.
        if( number == 8 );
        {
            System.out.println("The number is 9");
        }
        */
    }
	}