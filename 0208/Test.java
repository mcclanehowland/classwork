import java.util.ArrayList;

public class Test {
    private ArrayList<Integer> numList;

    public Test() {
        numList = new ArrayList<Integer>();
        for(int i = 0; i < 10;i++) {
            numList.add((int)(Math.random()*10+1));
        }
    }
    public void printList() {
        for(int each : numList) {
            System.out.print(each+" ");
        }
    }
    public int searchLargest() {
        int largest = -1;
        for(int each : numList) {
            if(each > largest) {
                largest = each;
            }
        }
        return largest;
    }
    public void searchAndReplace(int num) {
        for(int i = 0; i < numList.size();i++) {
            if(numList.get(i) == num) {
                numList.set(i,1000);
            }
        }
    }
    public void searchAndRemove(int num) {
        for(int i = 0; i < numList.size();i++) {
            if(numList.get(i) == num) {
                numList.remove(i);
                i--;
            }
        }
    }
    public void scramble() {
        for(int i = 0; i < numList.size();i++) {
            int swap = (int)(Math.random()*numList.size());
            int temp = numList.get(i);
            numList.set(i,numList.get(swap));
            numList.set(swap,temp);
        }
    }
}
