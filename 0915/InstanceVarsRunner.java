public class InstanceVarsRunner
{
 
 
   public static void main(String[] args)
   {
      //(1) What is the name of the reference variable?
	  //test
      InstanceVars test = new InstanceVars();
 
      //(2) What does this print?
	  //0
      test.print();
 
      //(3) What happens to the variable answer of the InstanceVars class after you call test.add()?
	  //answer is redefined as 11
      test.add();
 
      //(4) What is the final result?
	  //prints 11
      test.print();
       
   }
}