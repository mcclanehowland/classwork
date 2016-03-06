public class InstanceVars
{
   int one = 8, two = 3; //instance variables / fields
   int answer; //exist throughout the class
 
 
   //(1) What does this method do?
   //this method adds 1 and two
   public void add()
   {
      answer = one + two;
      int three = 33;
   }
    
   //(2) What does this method do?
   //this method prints answer
   public void print()
   {
        //(3) Can you print answer?
		//Yes.
        System.out.println(answer);
      
        //(4) If you uncomment the code below, will it run? why?
		//no, because it was only defined in a method, not throughout the whole class.
        //System.out.println(three);
         
   }
 }