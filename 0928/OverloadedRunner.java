public class OverloadedRunner
{
    public static void main(String[] args)
    {
        //(1) What is the difference between the two constructors?
		//one has parameters to be passed in, the other does not.
        Overloaded p1 = new Overloaded();
        Overloaded p2 = new Overloaded(16, "John");
         
        //(2) What is the difference between the outputs of p1 and p2? why?
		//p1 will print the default, while p2 will print with the values passed in.
        p1.print();
        p2.print();
        System.out.println();
         
        //(3) What is the difference between the outputs of p1 and p2? why?
		//p1 will print 5 and blank. p2 will print 5 and john
        p1.print(5);
        p2.print(5);
        System.out.println();
         
        //(4) What is the difference between the outputs of p1.print(5) and 
        //    p1.print("Henry")? why?
		//5 will redefine the number as 5, and Henry will redefine the string as "henry"
        p1.print(5);
        p1.print("Henry");
    }
}