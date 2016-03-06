import java.util.Arrays;

public class ArrayTest {
    
    private int[] numList;

    public ArrayTest() {
        numList = new int[10];
        for(int i = 0; i < numList.length;i++) {
            numList[i] = (int)(Math.random()*10+1);
        }
    }
    private void print() {
        for(int each : numList) {
            System.out.print(each+" ");
        }
        System.out.println();
    }
    public void sortNums() {
        Arrays.sort(numList);
        print();
    }
    public void sortAndPrint() {
        for(int i = 0; i < numList.length;i++) {
               for(int j = 0; j < numList.length;j++)  {
                   if(numList[i] < numList[j] ) {
                       int temp = numList[j];
                       numList[j] = numList[i];
                       numList[i] = temp;
                   }
               }
        }
        print();
    }
}
