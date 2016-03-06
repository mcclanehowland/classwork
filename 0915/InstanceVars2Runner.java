public class InstanceVars2Runner
{
    public static void main(String[] args)
    {
        int num1 = 1002;
        InstanceVars2 test = new InstanceVars2();
 
        //(1) What is the difference between the two lines of code below?
        //the first is calling a local variable while the second is accessing another class.
		//(2) What is the result?
		//prints 1002 and num1 from instancevars2.
		
        System.out.println(num1);
        System.out.println(test.num1);
        System.out.println();
         
        //(3) Describe what you think is happening below?
		//userName is being set equal to john and then printed out
        System.out.println(test.userName);
        test.userName = "John";
        System.out.println(test.userName);
        System.out.println();
         
        //(4) Describe what you think is happening below?
		//classes add and print are being called
        test.add();
        test.print();
        System.out.println();
         
        //(5) Does it print 5 or 11? Why?
		//prints 11 bc add has not been called
        test.num1 = 2;
        test.num2 = 3;
        test.print();
        System.out.println();
         
        //(6) Does it print 5 or 11? Why?
		//prints  5 because add has been called
        test.add();
        test.print();
        System.out.println();
    }
}