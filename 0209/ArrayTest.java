import java.util.ArrayList;

public class ArrayTest {
    public void print(ArrayList<Integer> nums) {
        for(int each : nums) {
            System.out.print(each+" ");
        }
    }
    public void scramble(ArrayList<Integer> nums) {
        for(int i = 0; i < nums.size();i++) {
            int swap = (int)(Math.random()*nums.size());
            int temp = nums.get(i);
            nums.set(i,nums.get(swap));
            nums.set(swap,temp);
        }
    }
}
