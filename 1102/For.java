public class For
{
    public void test1()
    {
        //1) Describe what is happening below?
		//printing out the numbers 0-10
        System.out.println("\n\nTest1");
        for(int i=0; i < 10; i++)
        {
            System.out.println(i);
        }
    }
     
    public void test2()
    {
        //2) Describe what is happening below?
		//printing 15-3
        System.out.println("\n\nTest2");
        for(int i=15; i > 2; i--)
        {
            System.out.println(i);
        }
    }
     
    public void test3(int max)
    {
        //3) Describe what is happening below?
		//coutnng up by 5 till the max
        System.out.println("\n\nTest3");
        for(int i=0; i <= max; i+=5)
        {
            System.out.println(i);
        }
    }
    public void test4(int min, int max)
    {
        //4) Describe what is happening below?
		//coutning frm max to min by 2
        System.out.println("\n\nTest4");
        for(int i=max; i > min; i-=2)
        {
            System.out.println(i);
        }
         
    }
     
    //5)What makes a for loop more useful than a while loop?
	//one line and no update statement needed
 
}