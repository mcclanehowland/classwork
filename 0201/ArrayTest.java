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
    public void scrambleAndPrint() {
        for(int i = 0; i < numList.length;i++) {
            int swap = (int)(Math.random()*numList.length);
            int temp = numList[swap];
            numList[swap] = numList[i];
            numList[i] = temp;
        }
        print();
    }
}

