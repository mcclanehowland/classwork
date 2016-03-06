public class Array1
{
    public void test1()
    {
        //What type of data can numTest store?
		// integers
        //How many numbers can numTest store?
		//5
        int[] numTest = new int[5];
         
        numTest[0] = 6;
        numTest[1] = 7;
        numTest[2] = 8;
        numTest[3] = 9;
        numTest[4] = 10;
         
        //Why can't you run the line below?
		//index out of bounds
        //numTest[5] = 7;
         
        //What does the line below print, why?
		//9
        System.out.println(numTest[3]);
         
        //What happens when you try the line below? Why?
		//index out of bounds
        //System.out.print(numTest[5]);
    }
     
    public void test2()
    {
        //What type of data can textArray store?
		//string
        //How many can it store?
		//3
        String[] textArray = new String[3];
         
        textArray[0] = "cat";
        textArray[1] = "dog";
        textArray[2] = "bird";
 
        //What does the line below print, why?
		//everything
        //System.out.println(textArray);
         
        //What does the line below print, why?
		//cat, because cat is stored in the zero slot
        System.out.println(textArray[0]);
 
    }
}