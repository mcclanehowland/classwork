public class ArrayTest {
   int[] numArray; 

   public ArrayTest() {
       numArray = new int[10];
       for(int i = 0; i < numArray.length;i++) {
           numArray[i] = (int)(Math.random()*19+1);
       }
   }
   public void printNumArray() {
       for(int each : numArray) {
           System.out.print(each+" ");
       }
   }
   public void swapNumArray(int a, int b) {
       int temp = numArray[a];
       numArray[a] = numArray[b];
       numArray[b] = temp;
   }
}
