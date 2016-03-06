import java.util.Scanner;

public class Array2DDemo {

    public void print(int[][] nums) {

        for(int[] row : nums) {
            for(int num : row) {
                System.out.print(num+" ");
            }
            System.out.println();
       }
   }
   public void test3() {
       int[][] nums = new int[3][5];
        for( int r = 0; r < nums.length; r++)
        {
           for( int c = 0; c < nums[r].length; c++)
           {
            nums[r][c] = (int)(Math.random()*9+1);
           }
        }
       
       print(nums);
       Scanner keyboard = new Scanner(System.in);
       System.out.println("enter a number to search for");
       int search = keyboard.nextInt();
        int count = 0;
        for( int r = 0; r < nums.length; r++)
        {
           for( int c = 0; c < nums[r].length; c++)
           {
            if( nums[r][c] == search)
                count++;
           }
        }
               
       System.out.println(count);
}    
   public void test2() {
       int[][] nums = new int[6][6];
       for(int i = 0; i < nums.length;i++) {
           for(int j = 0; j < nums[i].length;j++) {
               nums[i][j] = i*j;
           }
       }
       print(nums);
   }

   public void test4()
   {
       String[][] array = {{"dog", "cat", "dolphin"},{"owl", "caterpillar", "monkey"},{"sloth", "ladybug", "ant"}};
       Scanner kb = new Scanner(System.in);
       String search = kb.next();
       for (int i = 0; i < array.length; i++)
       {
           for (int j = 0; j < array[i].length; j++)
           {
               if (search == array[i][j])
                   System.out.println("yes");
           }
       }
       System.out.println("no");
   }





    public void test1()
    {
        int[][] array1 = new int[5][5];
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array1[i].length; j++)
            {
                int random = (int)(Math.random() * 10 + 1);
                array1[i][j] = random;
            }
        }
        print(array1);
    }

}
