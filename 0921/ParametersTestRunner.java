public class ParametersTestRunner
{
    public static void main(String[] args)
    {
       ParametersTest testObj = new ParametersTest();
        
       //(1) Describe what is happening with the two lines of code below.
	   //testObj.times is being called, and passing 5 and 7 as the numbers
       testObj.times(5, 7);
       testObj.printAnswer();
       System.out.println();
        
       //(2)  Describe what is happening with the two lines of code below.
	   //testobj.divide is being called witht the numbers 3 and 2
       testObj.divide(3, 2);
       testObj.printAnswerDec();
       System.out.println();
        
       //(3) Describe what is happening with the two lines of code below.
	   //testObj.setword is setting word equal to Hello java
       testObj.setWord("Hello Java.");
       testObj.printWord();
       System.out.println();
        
       //(4) Analyze the following 3 modifyAnswer* methods.
	   
       //Which one of these work properly? and Why
	   //101 and 102
       testObj.modifyAnswer1(101);
       testObj.printAnswer();
        
       testObj.modifyAnswer2(102);
       testObj.printAnswer();
        
       testObj.modifyAnswer3(103);
       testObj.printAnswer();
    }
}